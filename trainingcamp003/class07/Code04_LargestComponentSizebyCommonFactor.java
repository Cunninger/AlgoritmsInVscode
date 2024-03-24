// package trainingcamp003.class07;

// import JAVA_homework.practice;

// public class Code04_LargestComponentSizebyCommonFactor {
//     public static int largestComponentSizeByCommomFactor(int[]arr){
//         int N = arr.length;

//         UnionFind set = new UnionFind(N);

//         for (int i = 0;i<N;i++){
//             for (int j = i+1;j<N;j++){
//                 if (gcd(arr[i],arr[j])!=1){
//                     set.union(i,j);
//                 }
//             }
//             return set.maxSize();
//         }
//     }

//     public static class UnionFind{
//         private int[] parents;
//         private int[] sizes;
//         private int[]help;

//         public UnionFind(int N){
//             parents = new int[N];
//             sizes = new int[N];

//             help = new int[N];

//             for (int i = 0;i<N;i++){
//                 parents[i] = i;
//                 sizes[i] = i;
//             }
//         }

//         public int maxSize(){
//             int ans = 0;
//             for (int size:sizes){
//                 ans = Math.max(ans,size);
//             }
//             return ans;
//         }


//         private int find(int i){
//             int hi = 0;
//             while (i!=parents[i])
//         }



//     }




// }
