import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class reverseString2{
    public static void main(String[] args){
         QuickInput in = new  QuickInput();
        PrintWriter out = new PrintWriter(System.out);
        int T = in.nextInt();
        while (T-->0) {
            char[]str1 = in.next().toCharArray();
            char[]str2 = in.next().toCharArray();
            int cnt = 0;
            for (int i = 1; i < str2.length-1; i++) {
                if (str1[i]!=str2[i] && str2[i-1]==str2[i+1] && str2[i]!=str2[i+1]){
                      str2[i] = str2[i+1];
                    cnt++;
                }
            }
            if (new String(str2).equals(new String(str1))){
                 out.println(cnt);
            }
            else {
                out.println(-1);
            }
        }
        
        out.close();
    }
}


class  QuickInput
{
    BufferedReader buf;
    StringTokenizer tok;
     QuickInput(){
        buf = new BufferedReader(new InputStreamReader(System.in));
    }
    boolean hasNext(){
        while(tok == null || !tok.hasMoreElements()){
            try{
                tok = new StringTokenizer(buf.readLine());
            }catch(Exception e){
                return false;
            }
        }
        return true;
    }
    String next(){
        if(hasNext()) return tok.nextToken();
        return null;
    }
    int nextInt(){
        return Integer.parseInt(next());
    }
    long nextLong(){
        return Long.parseLong(next());
    }
    double nextDouble(){
        return Double.parseDouble(next());
    }
    BigInteger nextBigInteger(){
        return new BigInteger(next());
    }
    BigDecimal nextBigDecimal(){
        return new BigDecimal(next());
    }
}
