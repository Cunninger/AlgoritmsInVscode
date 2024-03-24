// package leetcode_daily;
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.PrintWriter;
// import java.math.BigDecimal;
// import java.math.BigInteger;
// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;
// import java.util.Random;
// import java.util.StringTokenizer;

// public class shortsubstring{

//     public static String gen(){
//         Random random = new Random();
//         StringBuilder sb = new StringBuilder();
//         int length = random.nextInt(50); // 生成随机长度，这里假设最大长度为50

//         for (int i = 0; i < length; i++) {
//             char c = (char) (random.nextInt(26) + 'a'); // 生成随机字符
//             sb.append(c);
//         }
//         return sb.toString();
       
//     }


//     public static void main(String[] args){
//            List<String> list = new ArrayList<>();
//          QuickInput in = new  QuickInput();
//         PrintWriter out = new PrintWriter(System.out);
//         int x = 1000;
//         while (x-->0){
//             String s = gen();
//             String s1 = f1(s);
//             String s2 = f2(s );
//             String s3 = f3(s);
//             String s4 = f4(s);
//             String s5 = f5(s);
//             // for (int i = 0;i<list.size();i++){
//             //     System.out.println(list.get(i)  );
//             // }
            
//             if (!s5.equals(s2)){
//                 out.println(s);
//                 out.println("f2     :"+s2);
//                 out.println("f5     :"+s5);
//                 break;
//             }
//         }
        
//         out.close();
//         // 一定要关流;
//     }

   
    
//     public static String f2(String s){
//         String result = null;
//         int maxLength = 0;
//         char[] str = s.toCharArray();
//         for (int i = 0; i < str.length; i++){
//             for (int j = str.length - 1; j > i; j--){
//                 if (str[i] == str[j]){
//                     boolean valid = true;
//                     for (int k = i + 1; k < j; k++){
//                         if (str[k] == str[i]){
//                             valid = false;
//                             break;
//                         }
//                     }
//                     if (valid && (j - i + 1 > maxLength)){
//                         maxLength = j - i + 1;
//                         result = s.substring(i, j + 1);
//                     }
//                 }
//             }
//         }
//         if (result == null){
//             result= s.substring(0, 1);
//         }
//         return result;
//     }
    

//      public static String f3(String s) {
//         Map<Character, Integer> map = new HashMap<>();
//         String res = null;
//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);
//             if (map.containsKey(c)) {
//                 String substr = s.substring(map.get(c), i + 1);
//                 if (!substr.substring(1, substr.length() - 1).contains(String.valueOf(c))) {
//                     if (res == null || substr.length() < res.length()) {
//                         res = substr;
//                     }
//                 }
//             } else {
//                 map.put(c, i);
//             }
//         }
//         return res;
//     }



//     public static String f1(String str){
//         String substring = null;
//         for (int i = 0; i < str.length(); i++) {
//             String tempStr = str.substring(i, i+1);
//             for (int j = 1; j < str.length()-1; j++) {
//                 if (i >= j)continue;
//                 String tempStr2 = str.substring(j, j+1);
//                 if (tempStr.equals(tempStr2)){
//                     String tempStr3 = str.substring(i,j+1 );
//                     if (substring == null){
//                         substring = tempStr3;
//                     }else{
//                         if (substring.length() > tempStr3.length()){
//                             substring = tempStr3;
//                         }
//                     }
//                 }
//             }
//         }
//         return substring;
//     }


//     public static String f4 (String str){
//         String subStr = str;
//         for (int i = 0; i < str.length(); i++) {
//             for (int j = i + 1; j < str.length(); j++) {
//                 if (str.charAt(i) == str.charAt(j)){
//                     if (str.substring(i,j+1).length() < subStr.length()){
//                         subStr = str.substring(i,j+1);
//                     }
//                 }
//             }
//         }
//         return subStr;
//     }


//     public static String f5(String str){
//         String subStr = "";
//         for (int i = 0; i < str.length(); i++) {
//             String newSubStr = str.charAt(i) + "";
//             for (int j = i+1; j < str.length(); j++) {
//                 if (j == str.length() - 1 && str.charAt(i) != str.charAt(j)){
//                     newSubStr = str.charAt(i) + "";
//                     break;
//                 }
//                 if (str.charAt(i) == str.charAt(j)){
//                     newSubStr = str.substring(i,j+1);
//                     break;
//                 }
//                 newSubStr = str.substring(i,j+1);
//             }
//             if (newSubStr.length() > subStr.length()){
//                 subStr = newSubStr;
//             }
//         }
//         return subStr;
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
