// package JXAU.test03;
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.PrintWriter;
// import java.math.BigDecimal;
// import java.math.BigInteger;
// import java.util.StringTokenizer;

// public class hua00e{
//     public static void main(String[] args){
//          QuickInput in = new  QuickInput();
//         PrintWriter out = new PrintWriter(System.out);
//         int n = in.nextInt();
//         int m = in.nextInt();
//         int p = in.nextInt();
//         int res = 0;
        
//         for (int i  =m;i<=n;i++){
//             if (i%p==m){
//                 res++;
//             }
          
//         }
//         out.println(res);


//         //in.nextInt().....
//         //out.println().....
        
//         out.close();
//         // 一定要关流;
//     }
// }


// class  QuickInput
// {
//     BufferedReader buf;
//     StringTokenizer tok;
//      QuickInput(){
//         buf = new BufferedReader(new InputStreamReader(System.in));
//     }
//     boolean hasNext(){
//         while(tok == null || !tok.hasMoreElements()){
//             try{
//                 tok = new StringTokenizer(buf.readLine());
//             }catch(Exception e){
//                 return false;
//             }
//         }
//         return true;
//     }
//     String next(){
//         if(hasNext()) return tok.nextToken();
//         return null;
//     }
//     int nextInt(){
//         return Integer.parseInt(next());
//     }
//     long nextLong(){
//         return Long.parseLong(next());
//     }
//     double nextDouble(){
//         return Double.parseDouble(next());
//     }
//     BigInteger nextBigInteger(){
//         return new BigInteger(next());
//     }
//     BigDecimal nextBigDecimal(){
//         return new BigDecimal(next());
//     }
// }
