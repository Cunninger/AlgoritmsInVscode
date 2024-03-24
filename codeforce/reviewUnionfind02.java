package codeforce;
import java.util.*;
public class reviewUnionfind02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--!=0){
            int n = sc.nextInt();
            int []p = new int[n+1];
            List<Integer> list = new ArrayList<>();
            for (int i = 0;i<n;i++){
                list.add(i+1);
            }
            unionfind uf = new unionfind(list);
            for (int i = 1;i<=n;i++){
                p[i] = sc.nextInt();
            }
      
          
            
            
        

            for (int i = 1;i<=n;i++){
                uf.union(i,p[i]);
            }
            for (int i = 1;i<=n;i++){
                System.out.print(uf.size.get(uf.find(i))+ " ");
            }

            System.out.println();
        }

    }


    static class unionfind{
        static HashMap<Integer,Integer> father;
        static HashMap<Integer,Integer> size;
        public unionfind(List<Integer> list){
            father = new HashMap<>();
            size = new HashMap<>();
            for(Integer i : list){
                father.put(i,i);
                size.put(i,1);
            }
        }
        // find
        public static Integer find(int x){
            Stack<Integer> stack = new Stack<>();
            while(father.get(x) != x){
                stack.push(x);
                x = father.get(x);
            }
            while(!stack.isEmpty()){
                father.put(stack.pop(),x);
            }
            return x;
        }

        // isSameUnion
        public static boolean isSameUnion(int x, int y){
            return find(x) == find(y);
        }

        // union
        public static void union(int x,int y){
            int fx = find(x);
            int fy = find(y);
            if(fx == fy) return;
            if(size.get(fx) > size.get(fy)){
                father.put(fy,fx);
                size.put(fx,size.get(fx) + size.get(fy));
            }else{
                father.put(fx,fy);
                size.put(fy,size.get(fx) + size.get(fy));
            }
        }





    }
}
