package tiaozhen;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class A {
    static int[] dx = { 0, 1 };
    static int[] dy = { -1, 0 };
    static int n, m;
    static char[][] mat;
    static String s;
    static boolean[][] isVist;

    public static void main(String[] args) {
        QuickInput in = new QuickInput();
        PrintWriter out = new PrintWriter(System.out);
        n = in.nextInt();
        m = in.nextInt();
        mat = new char[n + 1][m + 1];
        isVist = new boolean[n + 1][m + 1];
        for (int i = 1; i < mat.length; i++) {

            mat[i] = in.next().toCharArray();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2024; i++) {
            sb.append('Z');
        }
        s = sb.toString();
        for (int i = 1; i < mat.length; i++) {
            for (int j = 1; j < mat[0].length; j++) {
                if (!isVist[i][j]) {
                    isVist[i][j] = true;
                    if (dfs(i, j).compareTo(s) < 0) {
                        s = dfs(i, j);
                    }
                }
            }
        }

        out.close();
    }

    public static String dfs(int x, int y) {
        List<Character> path = new ArrayList<>();
        if (x == n && y == m) {
            return path.toString();
        }
        // 向右走
        if (x + 1 < mat.length && y - 1 >= 0) {
            if (mat[x + 1][y] < mat[x][y - 1]) {
                path.add(null);
            }
        }

        return "a";
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
