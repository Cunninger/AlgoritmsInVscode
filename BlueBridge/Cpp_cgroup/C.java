import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class C{
    public static void main(String[] args){
         QuickInput in = new  QuickInput();
        PrintWriter out = new PrintWriter(System.out);
        char[]str = in.next().toCharArray();
        int cnt = 0;
        for (int i = 0; i < str.length && i+1<str.length; i+=2) {
            if(str[i]-'0'==1 && str[i+1]-'0'==1){
                cnt++;
            }
            else if (str[i]-'0'==0 && str[i+1]-'0'==0){
                cnt++;
            }
            else if (str[i]=='?'){
                cnt++;
            }
            else if (str[i+1]=='?'){
                cnt++;
            }
        }
        out.println(cnt);
      //??10101
      //0010101

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
