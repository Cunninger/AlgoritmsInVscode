package leetcode_daily;
import java.util.*;
public class operationInTree {
    private int[] locked;// 

    private int[] parent;//  parent[i] = j 表示i的父节点是j
 
    private List<Integer> []children; // children[i]表示i的子节点的集合

    public operationInTree(int[] parent){
        int n = parent.length;

        locked = new int[n];

        this.parent = parent;

        children = new List[n];

        Arrays.fill(locked,-1);// 把数组中的所有元素设置为特定的值
       
         
        Arrays.setAll(children, i->new ArrayList<>());// 为children数组中的每个元素创建一个空的ArrayList

        // fill 是为数组赋初值，setAll是为集合元素赋初值。 

        // 每一个节点都有一个子节点列表和一个锁定的状态

        for (int i = 1;i<n;i++){
            children[parent[i]].add(i);
        }
        // parent[i]记录i节点的父亲节点。
        // children[parent[i]]：表示i节点的父亲节点的子节点列表

        // 为每个节点的子节点列表添加子节点
        
    }


    public boolean lock(int num,int user){
        if (locked[num] == -1){// 如果这个节点被锁
            locked[num] = user;
            return true;
        }
        return false;
    }

    public boolean unlock(int num,int user){
        if (locked[num]==user){

    // 因为锁定关系定义为locked[num] = user

            locked[num] = -1;
            return true;
        }
        return false;


    }


    public boolean upgrade(int num,int user){
        // 1.该节点没锁
        // 2.该节点的子节点至少有一个被锁
        // 3.祖先节点没有被锁


        int x = num;// 

        while (x!=-1){
            if (locked[x]!=-1){
                return false;// 迭代往上找，如果有一个祖先节点被锁，就返回false
            }

            x = parent[x];
        }

        
        boolean []find = new boolean[1];// 默认是false

        dfs(num,find);

        if (!find[0]){
            return false;
        }// 如果子孙节点一个都没有被锁，返回false
        locked[num] = user;

        return true;

    }

    private void dfs(int x,boolean []find){
        for (int y:children[x]){
            if (locked[y] != -1){
                // 如果子节点被锁，就解锁,-1表示没锁
                locked[y] = -1;

                find[0] = true;// 标记该节点被锁
            }
            dfs(y, find);
        }
    }

    public static void main(String[] args) {
        int[] parent = {-1,0,1,2,3,4,5,6,7,8,9};
        operationInTree o = new operationInTree(parent);
        System.out.println(o.lock(2, 2));
        System.out.println(o.lock(3, 3));
        System.out.println(o.lock(4, 4));
        System.out.println(o.lock(5, 5));
        System.out.println(o.lock(6, 6));
        System.out.println(o.lock(7, 7));
        System.out.println(o.lock(8, 8));
        System.out.println(o.lock(9, 9));
     
    }



}