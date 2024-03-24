package BlueBridge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class bigMultiple{
    public static void main(String[] args){
         QuickInput in = new  QuickInput();
        PrintWriter out = new PrintWriter(System.out);
        int sum = 0;
        int res = 0;
        int[]arr = new int[]{99,22,51,63,72,61,20,88,40,21,63,30,11,18,99,12,93,16,7,53,64,9,28,84,34,96,52,82,51,77};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length && i!=j; j++) {
                res++;
                if (arr[i]*arr[j]>=2022){
                    sum++;
                }
                // hello hello
            }
        }
        out.println(sum);
        out.println(res);
        
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

