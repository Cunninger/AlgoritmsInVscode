import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class imageSet {
    static int[][] a;
    static int n;
    static int m;
    static int[][] c;
    static boolean flag;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        a = new int[11][11];
        c = new int[12][12];

        for (int i = 1; i <= n; i++) {

            char[] s = in.next().toCharArray();
            for (int j = 1; j <= m; j++) {
                char c = s[j - 1];
                if (c != '_') {
                    int x = c - '0';
                    a[i][j] = x;

                } else {
                    a[i][j] = -1;
                }
            }
        }

        dfs(1, 1);

        
    }

    public static void dfs(int x, int y) {
        if (flag)
            return;
        if (x > 1 && y > 2) {
            if (check(x - 1, y - 2))
                return;
        }
        if (x >= 3 && y == 1) {
            if (check(x - 2, m-1) || check(x - 2, m))
                return;
        }

        if (x == n + 1 && y == 1) {
            for (int i = 1; i <= m; i++) {
                if (check(n, i))
                    return;
            }   
            flag = true;
            for (int i = 1; i <=n; i++) {
                for (int j = 1; j <=m; j++) {
                   System.out.print(c[i][j]);
                }
                System.out.println();
            }
         
            return;
        }
        int x1, y1;
        if (y < m) {
            x1 = x;
            y1 = y + 1;
        } else {
            x1 = x + 1;
            y1 = 1;
        }
        c[x][y] = 1;
        dfs(x1, y1);
        c[x][y] = 0;
        dfs(x1, y1);

    }


    public static boolean check(int x, int y) {
        // 检查是否破坏规则
        if (a[x][y] == -1)
            return false;
        int t = 0;
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
            
                if (c[i][j] == 1)
                    t++;
            }
        }

        if (a[x][y] == t)
            return false;
        else
            return true;
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
