package algoritmbasic2020;

import java.util.*;

public class Code05_UnionFind {
    public static class UnionFind{
        public HashMap<Integer,Integer> father;// 存放并查集的键值对，键是元素，值是元素的父亲
        // 键 的 父亲 是 值

        public HashMap<Integer,Integer> size;// 存放并查集的键值对，键是元素，值是元素所在集合的大小




        public UnionFind(List<Integer> values){
            father = new HashMap<>();
            size = new HashMap<>();
            for (int cur:values){
                father.put(cur,cur);
                size.put(cur,1);
            }
        }

        public Integer findFather(Integer cur){
            Stack<Integer> path = new Stack<>();
            // 记录查找路径上的所有节点，以便在找到根节点后，将路径上的所有节点都直接连接到根节点上
            while (cur !=father.get(cur)){
                path.push(cur);
                cur = father.get(cur);
            }

            while (!path.isEmpty()){
                father.put(path.pop(), cur);
            }
            return cur;
        }

        public boolean isSameSet(Integer a,Integer b){
            return findFather(a) == findFather(b);
        }

        public void union(Integer a,Integer b){
            Integer aFather = findFather(a);
            Integer bFather = findFather(b);
            if (aFather != bFather){
                int aSize = size.get(aFather);
                int bSize = size.get(bFather);

                if (aSize >= bSize){
                    father.put(bFather, aFather);
                    size.put(aFather, aSize+bSize);
                    size.remove(bFather);
                }
                else{
                    father.put(aFather,bFather);
                    size.put(bFather, aSize+bSize);
                    size.remove(aFather);
                }
            }


        }

        public int sets(){
            return size.size();
        }
        
    }
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        UnionFind set = new UnionFind(test);
        System.out.println(set.sets());// 5
        set.union(1,2);
        System.out.println(set.sets()); 
        set.union(3,4);
        System.out.println(set.sets());
        set.union(1,3);
        System.out.println(set.sets());
        set.union(1,5);
        System.out.println(set.sets());
    }
}
// 总结并查集的步骤
// 1. 创建一个并查集，将所有的元素都放入并查集中
    // 并查集如何组成要素：
// 2. 通过并查集的findFather方法，找到两个元素的根节点
    // 并查集的findFather方法的作用：
        // 1. 找到某个元素的根节点  => 栈(入栈)记录查找路径上的所有节点，以便在找到根节点后，将路径上的所有节点都直接连接到根节点上
        // 2. 将查找路径上的所有节点都直接连接到根节点上 => (出栈)  
// 3. 通过并查集的isSameSet方法，判断两个元素是否在同一个集合中
// 4. 通过并查集的union方法，将两个元素所在的集合合并成一个集合
// 5. 通过并查集的sets方法，得到并查集中有多少个集合
// 6. 通过并查集的size方法，得到某个元素所在集合的大小



// 1.给一个数组，用于初始化并查集：
    // fatherMap中每个元素首先是自己的父亲，sizeMap中每个元素所在集合的大小都是1
    
