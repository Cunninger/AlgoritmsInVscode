import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Dd{
    public static void main(String[] args){
         QuickInput in = new  QuickInput();
        PrintWriter out = new PrintWriter(System.out);
        int q = in.nextInt();
        while (q-->0){
            String s= in.next();
            if (s.charAt(1)=='N'){
                out.println(-1);
            }
            else if (s.equals("NDD")){
                out.println(0);
            }
            else if (s.equals("NDN")){
                out.print(1);
            }
            else if (s.equals("DDD")){
                out.print(1);
            }
            else if (s.equals("DDN")){
                out.print(2);
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
