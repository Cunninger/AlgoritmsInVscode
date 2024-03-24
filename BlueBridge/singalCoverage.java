import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class singalCoverage {
    static boolean[][] isVist;
    static int W, H, R, sum;

    public static void main(String[] args) {
        QuickInput in = new QuickInput();
        PrintWriter out = new PrintWriter(System.out);
        W = in.nextInt();
        H = in.nextInt();
        int n = in.nextInt();
        R = in.nextInt();
        isVist = new boolean[W+1][H+1];
        sum = 0;
        while (n-- > 0) {
            int x = in.nextInt();
            int y = in.nextInt();
            check(x, y);
        }
        out.println(sum);
        out.close();
    }

    public static void  check(int x, int y) {
        // x,y 信号点
        // 半径是R
        // 边界 W,H
        for (int i = 0; i <= W; i++) {
            for (int j = 0; j <= H; j++) {
                int cnt = computeDis(x, y, i, j);
                if (cnt <= R * R && !isVist[i][j]) {
                    isVist[i][j] = true;
                    sum++;
                }
            }
        }
    }

    public static int computeDis(int x, int y, int a, int b) {
        int cnt = (x - a) * (x - a) + (y - b) * (y - b);

        return cnt;
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
