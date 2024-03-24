package Luogu_test;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class presuffixSum {
    public static void main(String[] args) {
        QuickInput sc = new QuickInput();
        PrintWriter out = new PrintWriter(System.out);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int []arr = new int[n+1];
        int []s  = new int[n+1];  // 前缀和数组
        for (int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
            s[i] = s[i-1] + arr[i];  // 计算前缀和
        }

        while (m-- != 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            if (x == 1){
                out.println(s[z] - s[y-1]);  // 直接使用前缀和
            }
            else{
                out.println(Xor(arr, y, z));
            }
        }
        out.close();
    }

    public static int Xor(int []arr, int y, int z){
        int sum = arr[y];
        for (int i = y+1; i <= z; i++){
            sum ^= arr[i];
        }
        return sum;
    }
}

class QuickInput {
    BufferedReader buf;
    StringTokenizer tok;
    QuickInput() {
        buf = new BufferedReader(new InputStreamReader(System.in));
    }
    boolean hasNext() {
        while(tok == null || !tok.hasMoreElements()){
            try{
                tok = new StringTokenizer(buf.readLine());
            }catch(Exception e){
                return false;
            }
        }
        return true;
    }
    String next() {
        if(hasNext()) return tok.nextToken();
        return null;
    }
    int nextInt() {
        return Integer.parseInt(next());
    }
    long nextLong() {
        return Long.parseLong(next());
    }
    double nextDouble() {
        return Double.parseDouble(next());
    }
    BigInteger nextBigInteger() {
        return new BigInteger(next());
    }
    BigDecimal nextBigDecimal() {
        return new BigDecimal(next());
    }
    String nextLine() {
        try {
            return buf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
