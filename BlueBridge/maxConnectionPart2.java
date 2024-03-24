package BlueBridge;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class maxConnectionPart2 {
    static int[] dx = new int[] { 0, 0, -1, 1 };
    static int[] dy = new int[] { 1, -1, 0, 0 };
    static int n, m;
    static boolean[][] isVist;
    static int[][] res;

    public static void main(String[] args) throws Exception {
        QuickInput in = new QuickInput();
        PrintWriter out = new PrintWriter(System.out);

        res = getMat();
        n = res.length;
        m = res[0].length;
        int ma = Integer.MIN_VALUE;
        isVist = new boolean[res.length][res[0].length];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                if (!isVist[i][j] && res[i][j] == 1) {
                    isVist[i][j] = true;
                    ma = Math.max(ma, dfs(i, j));
                }
            }
        }
        out.println(ma);
        out.close();

    }

    public static int dfs(int x, int y) {
        int temp = 1;
        for (int i = 0; i < dx.length; i++) {
            int fx = x + dx[i];
            int fy = y + dy[i];

            if (fx < 0 || fx >= n || fy < 0 || fy >= m || isVist[fx][fy] || res[fx][fy] == 0)
                continue;
            isVist[fx][fy] = true;
            temp += dfs(fx, fy);
        }
        return temp;

    }

    public static int[][] getMat() throws Exception {
        int[][] res = new int[30][60];
        File file = new File("D:\\VScode_20230829\\BlueBridge\\data.txt");
        Scanner sc = new Scanner(file);
        int k = 0;
        while (sc.hasNextLine() && k < 30) {
            String s = sc.nextLine().trim();
            char[] str = s.toCharArray();
            int[] temp = new int[s.length()];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = str[i] - '0';
            }
            res[k++] = temp;
        }

        return res;
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
