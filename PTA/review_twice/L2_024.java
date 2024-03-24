package PTA.review_twice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class L2_024 {
    static int maxn = 10011;
    static int[] fa = new int[maxn];
    static int[] size = new int[maxn];
    static int[] stack = new int[maxn];
    static int inf = 0;

    public static int find(int x) {
        int i = 0;
        while (fa[x] != x) {
            x = fa[x];
            stack[i++] = x;
        }
        while (i > 0)
            fa[stack[--i]] = x;

        return x;
    }

    public static boolean isSameSet(int x, int y) {
        return find(x) == find(y);
    }

    public static void union(int x, int y) {
        int fx = find(x);
        int fy = find(y);
        if (fx != fy) {
            int sx = size[fx];
            int sy = size[fy];
            if (sx > sy) {
                fa[sy] = sx;
                size[sy] += size[sx];
            } else {
                fa[sx] = sy;
                size[sx] += size[fy];
            }
        }
    }

    public static void main(String[] args) {
        QuickInput in = new QuickInput();
        PrintWriter out = new PrintWriter(System.out);
        List<List<Integer>> circles = new ArrayList<>();

        int N = in.nextInt();

        for (int i = 0; i < N; i++) {
            int cc = in.nextInt();
            List<Integer> circle = new ArrayList<>();
            for (int j = 0; j < cc; j++) {
                int t = in.nextInt();
                inf = Math.max(inf, t);
                circle.add(t);
            }
            circles.add(circle);

        }
        for (int i = 1; i <= inf; i++) {
            fa[i] = i;
            size[i] = 1;
        }

        for (int i = 0; i < circles.size(); i++) {
            List<Integer> list = circles.get(i);
            for (int j = 0; j < list.size() - 1; j++) {
                union(list.get(j), list.get(j + 1));
            }
        }
        for (int i = 1; i < ; i++) {
            
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
