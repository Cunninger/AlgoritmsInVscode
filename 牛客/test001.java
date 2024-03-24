// class Solution {
//     public int findMinimumOperations(String s1, String s2, String s3) {
//         int min = Math.min(s1.length(),Math.min(s2.length(), s3.length()));
//         char[] str1 = s1.toCharArray();
//                 char[] str2 = s2.toCharArray();
//         char[] str3 = s3.toCharArray();
//         int cnt = 0;
//         for (int i = 0;i<min;i++){
//           if (str1[i]==str2[i]||str2[i]==str3[i]||str1[i]==str3[i]){
//                 continue;
//           }
//           else{
//             cnt = i;
//             break;
//           }
//         }

//         int common =cnt+1;

//         common=Math.abs(s1.length()-common)+Math.abs(s2.length()-common)+Math.abs(s3.length()-common);
//         return common;
//     }
// }


// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.PrintWriter;
// import java.math.BigDecimal;
// import java.math.BigInteger;
// import java.util.StringTokenizer;

// public class Main{
//   public static void main(String[] args){
//      QuickInput in = new  QuickInput();
//     PrintWriter out = new PrintWriter(System.out);
    
//     //in.nextInt().....
//     //out.println().....
    
//     out.close();
//     // 一定要关流;
//   }
// }


//   class  QuickInput
//   {
//       BufferedReader buf;
//       StringTokenizer tok;
//       QuickInput(){
//           buf = new BufferedReader(new InputStreamReader(System.in));
//       }
//       boolean hasNext(){
//           while(tok == null || !tok.hasMoreElements()){
//               try{
//                   tok = new StringTokenizer(buf.readLine());
//               }catch(Exception e){
//                   return false;
//               }
//           }
//           return true;
//       }
//       String next(){
//           if(hasNext()) return tok.nextToken();
//           return null;
//       }
//       int nextInt(){
//           return Integer.parseInt(next());
//       }
//       long nextLong(){
//           return Long.parseLong(next());
//       }
//       double nextDouble(){
//           return Double.parseDouble(next());
//       }
//       BigInteger nextBigInteger(){
//           return new BigInteger(next());
//       }
//       BigDecimal nextBigDecimal(){
//           return new BigDecimal(next());
//       }
//   }
