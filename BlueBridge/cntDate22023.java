import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class cntDate22023 {
    public static void main(String[] args) {
        QuickInput in = new QuickInput();
        PrintWriter out = new PrintWriter(System.out);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        out.close();
    }

    public int[] getArr() {
        File file = new File("cntDate2023.txt");
        Scanner sc = new Scanner(file);
        int k = 0;
        int[] arr = new int[100];
        while (k < 3 && sc.hasNext()) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            k++;
        }
        return arr;

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
