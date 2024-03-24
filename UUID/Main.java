package UUID;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        QuickInput in = new QuickInput();
        PrintWriter out = new PrintWriter(System.out);

        // in.nextInt().....
        // out.println().....
        int n = in.nextInt();
        int m = in.nextInt();
          int cnt = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            cnt = m%x==0?m/x:m/x+1;
            min = Math.min(cnt*y,min);   
        }
        out.println(min);




    

        out.close();
        // 一定要关流;
    }
}

class QuickInput {
    BufferedReader buf;
    StringTokenizer tok;

    QuickInput() {
        buf = new BufferedReader(new InputStreamReader(System.in));
    }

    boolean hasNext() {
        while (tok == null || !tok.hasMoreElements()) {
            try {
                tok = new StringTokenizer(buf.readLine());
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }

    String next() {
        if (hasNext())
            return tok.nextToken();
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
}
