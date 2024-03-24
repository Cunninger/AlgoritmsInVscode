
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = new int[] { 2, 1, -1, -2, -2, -1, 1, 2, 0, 0 };
    static int[] dy = new int[] { 1, 2, 2, 1, -1, -2, -2, -1, 0, 0 };

    static long[][] memo = new long[21][21];
    static int bx, by;

    public static void main(String[] args) {
        QuickInput in = new QuickInput();
        PrintWriter out = new PrintWriter(System.out);
        bx = in.nextInt();
        by = in.nextInt();
        int mx = in.nextInt();
        int my = in.nextInt();
        for (int i = 0; i < dx.length; i++) {
            int fx = mx + dx[i];
            int fy = my + dy[i];
            if (fx < 0 || fx > 20 || fy < 0 || fy > 20)
                continue;
            memo[fx][fy] = -1;
        }
        memo[0][0] = 1;
        out.println(dfs(bx, by));
        out.close();
    }

    public static long dfs(int x, int y) {
        if (x < 0 || y < 0 || memo[x][y] == -1) {
            return 0;
        }
        if (memo[x][y] != 0)
            return memo[x][y];
        long p1 = dfs(x - 1, y);
        long p2 = dfs(x, y - 1);
        memo[x][y] = p1 + p2;
        return memo[x][y];
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


}
