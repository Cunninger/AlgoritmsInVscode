import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class gg{
    public static void main(String[] args){
         QuickInput in = new  QuickInput();
        PrintWriter out = new PrintWriter(System.out);
        int q = in.nextInt();
        int ans = Integer.MAX_VALUE;
        while (q-->0){
            String s = in.next();
            for (int i = 0; i+2 < s.length(); i++) {
                String a = s.substring(i, i+3);
                if (a.charAt(1)!='D')continue;
                ans = Math.min(ans,(a.charAt(0)=='N'?0:1)+(a.charAt(2)=='D'?0:1)+s.length()-3);
            }
        }
        out.println(ans==Integer.MAX_VALUE?-1:ans);
        
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
