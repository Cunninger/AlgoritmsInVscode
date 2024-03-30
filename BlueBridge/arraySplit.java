import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class arraySplit {
    public static void main(String[] args) {
        QuickInput in = new QuickInput();
        PrintWriter out = new PrintWriter(System.out);
        int T = in.nextInt();
        while (T-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            int odd = 0;
            int even = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
                if (arr[i] % 2 == 0)
                    even++;
                else
                    odd++;
            }
            if (odd % 2 != 0)
                out.println(0);
            else if (odd == 0)
                out.println((int) Math.pow(2, even));
            else
                out.println((int) Math.pow(2, odd + even - 1));

            

        }

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
