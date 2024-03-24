package Luogu_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class P2004_领地选择 {
    static int N, M;
    static int[][] mat;
    static int[][] sumMat;
    static int C;

    public static void main(String[] args) {
        QuickInput in = new QuickInput();
        PrintWriter out = new PrintWriter(System.out);
        N = in.nextInt();
        M = in.nextInt();
        C = in.nextInt();

        mat = new int[N][M];
        sumMat = new int[N + 1][M + 1];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = in.nextInt();

            }
        }
        for (int a = 1, c = 0; c < N; a++, c++) {
            for (int b = 1, d = 0; d < M; b++, d++) {
                sumMat[a][b] = mat[c][d];
            }
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                sumMat[i][j] += sumMat[i - 1][j] + sumMat[i][j - 1] - sumMat[i - 1][j - 1];
            }
        }
        int x = 0, y = 0;
        int ma = Integer.MIN_VALUE;
        for (int i = C; i <= N; i++) {
            for (int j = C; j <= M; j++) {
                // 枚举右端点
                
            }
        }
        out.print(x + " " + y);

        out.close();
    }

    public static int getRegion(int a, int b, int c, int d) {
       
            a++;
            b++;
            c++;
            d++;
        

        return sumMat[c][d] - sumMat[c][b - 1] - sumMat[a - 1][d] + sumMat[a - 1][b - 1];

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
