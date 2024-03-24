
package leetcode_daily;
import java.util.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class treeequalstwo{
    public static void main(String[] args){
        QuickInput in = new  QuickInput();
        PrintWriter out = new PrintWriter(System.out);
        int N = in.nextInt();
        int cnt = 0;
        for (int i = 1;i<=N;i++){
           for (int j = 1 ;j<=10000;j++){
                if (Math.pow(i,3)==Math.pow(j,2)){
                    cnt++;
                }
           }
        }
        out.println(cnt);



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
