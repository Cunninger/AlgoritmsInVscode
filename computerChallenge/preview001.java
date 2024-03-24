package computerChallenge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class preview001{
    public static void main(String[] args){
         QuickInput in = new  QuickInput();
        PrintWriter out = new PrintWriter(System.out);
        int a = in.nextInt();
        String sa = Integer.toString(a);
        String sub2 = sa+sa;
        if (a%2==0){
            int sum = 0;
            while (sub2.length()<a){
                if (sub2.length()!=a){
                    out.print(sub2+"+");
                }else{
                    out.print(sub2);
                }
                sum += Integer.parseInt(sub2);
                sub2 = new StringBuilder(sub2).append(sa).toString();

            }
            out.print("=");
            out.println(sum);
        }
        else{
            int sum = 0;
            while (sa.length()<a){
                if (sa.length()!=a){
                    out.print(sa+"+");
                }else{
                    out.print(sa);
                }
                sum += Integer.parseInt(sa);
                sa = new StringBuilder(sa).append(sub2).toString();

            }
            out.print("=");
            out.println(sum);
        }
        //in.nextInt().....
        //out.println().....
        
        out.close();
        // 一定要关流;
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
