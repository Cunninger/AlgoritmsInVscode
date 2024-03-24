package round19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;
// helloworld
// youare welcome
public class D {
    static int[] dx = { 0, 0, -1, 1, -1, 1, -1, 1 };
    static int[] dy = { 1, -1, 0, 0, 1, 1, -1, -1 };
    static char[][] g = new char[4][4];
    static int[][] cnt = new int[4][4];
    static int d;
    // static char[][] mat = new char[4][4];

    public static void main(String[] args) {
        QuickInput in = new QuickInput();
        PrintWriter out = new PrintWriter(System.out);
        for (int i = 0; i < g.length; i++) {
            g[i] = in.next().toCharArray();

        }
        // hello
        dfs(0, 0);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (Character.isDigit(g[i][j])) {
                    out.print(g[i][j]);
                } else if (cnt[i][j] == 0)
                    out.print('O');
                else if (cnt[i][j] == d)
                    out.print('X');
                else
                    out.print('.');
            }
            out.println();
        }

        out.close();
    }

    public static void dfs(int x, int y) {
        if (y == 4) {
            x++;
            y = 0;
        }
        if (x == 4) {
            // 检验

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (Character.isDigit(g[i][j])) {
                        int k = g[i][j] - '0';
                        int t = 0;// 记录当前扫描的位置，周围八个地方的地雷数目
                        for (int l = 0; l < dx.length; l++) {
                            int fx = i + dx[l];
                            int fy = j + dy[l];
                            if (fx < 0 || fx >= 4 || fy < 0 || fy >= 4)
                                continue;
                            if (g[fx][fy] == 'X')
                                t++;

                        }
                        if (t != k)
                            return;
                    }
                }
            }
            d++;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (g[i][j] == 'X') {
                        cnt[i][j]++;
                    }
                }
            }
            return;
        }

        if (Character.isDigit(g[x][y])) {
            dfs(x, y + 1);
        } else {
            g[x][y] = 'X';
            dfs(x, y + 1);
            g[x][y] = '.';
            dfs(x, y + 1);

        }
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
