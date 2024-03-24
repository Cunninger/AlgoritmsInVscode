package JXAU.test03;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;
    import java.util.Scanner;
    import java.text.DecimalFormat;
    
    public class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            double b = Math.sqrt((4 * x * x + 1) / 3);
            DecimalFormat df = new DecimalFormat("#.######"); // 保留6位小数
            String formattedResult = df.format(b * (4 * x * x + 1) / 3);
            System.out.println(formattedResult);
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
