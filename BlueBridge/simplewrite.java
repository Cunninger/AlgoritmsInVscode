import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;
/**
 * https://www.lanqiao.cn/problems/3514/learning/?page=2&first_category_id=1&second_category_id=3&tags=2023
 */
public class simplewrite{
    public static void main(String[] args){
         QuickInput in = new  QuickInput();
        PrintWriter out = new PrintWriter(System.out);
        int k = in.nextInt();
        String s = in.next();
        char start = in.next().charAt(0);
        char end = in.next().charAt(0);
        long cnt = 0;
        int []en = new int[s.length()];
        int []st = new int[s.length()];
        int x= 0,y = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==start){
                st[x++] = i;
            }
            else if (s.charAt(i)==end){
                en[y++] = i;
            }
        }
        int num = 0;
        for (int i = 0; i < x; i++) {
            for (int j = num; j < y; j++) {
                if (en[j]-st[i]+1>=k){
                    cnt+=(y-j);
                    num=j;
                    break;
                }
            }
        }
        



        out.println(cnt);
        
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
