import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class cleanWaterRegion {
    static boolean[][] isVist;

    public static void main(String[] args) {
        QuickInput in = new QuickInput();
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int m = in.nextInt();
        int t = in.nextInt();
        isVist = new boolean[n][m];
        int sum = 0;
        while (t-- > 0) {
            int r1 = in.nextInt();
            int c1 = in.nextInt();
            int r2 = in.nextInt();
            int c2 = in.nextInt();

            for (int a = r1; a <= r2; a++) {
                for (int b = c1; b <= c2; b++) {
                    if (!isVist[a-1][b-1]) {
                        isVist[a-1][b-1] = true;
                        sum++;
                    }

                }
            }

        }

        out.println(n * m - sum);

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
