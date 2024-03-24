package BlueBridge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class C2 {
    public static void main(String[] args) {
        QuickInput in = new QuickInput();
        PrintWriter out = new PrintWriter(System.out);
        String s = in.next();
        char[] str = s.toCharArray();
        int cnt = 0;
        for (int i = 0; i < str.length;) {
            if (str[i] > 'a' && str[i] < 'z' && str[i + 1] > 'A' && str[i + 1] < 'Z') {
                cnt++;
                i += 2;
            }

            if (str[i] > 'A' && str[i] < 'Z' && str[i + 1] > 'A' && str[i + 1] < 'Z') {
                cnt++;
                i += 2;
            }
        }
        out.println(cnt);

        out.close();
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
