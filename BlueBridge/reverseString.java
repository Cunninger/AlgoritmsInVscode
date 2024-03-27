import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
/**
 * https://www.lanqiao.cn/problems/3514/learning/?page=2&first_category_id=1&second_category_id=3&tags=2023
 */
public class reverseString{
    public static void main(String[] args){
         QuickInput in = new  QuickInput();
        PrintWriter out = new PrintWriter(System.out);
        int q = in.nextInt();
        while (q-->0) {
            char []t = in.next().toCharArray();
            char []s = in.next().toCharArray();
            int cnt = 0;
            for (int i = 1; i < s.length-1; i++) {
                if (s[i]!=t[i] && s[i-1]==s[i+1] && s[i]!=s[i+1]){
                    s[i] = s[i+1];
                    cnt++;

                }
            }
            if (new String(t).equals(new String(s))){
                out.println(cnt);
            }
            else{
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
