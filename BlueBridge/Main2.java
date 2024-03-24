package BlueBridge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        QuickInput in = new QuickInput();
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int m = in.nextInt();
        int x = in.nextInt();
        int[][] mat = new int[n][m];
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = in.nextInt();
                sum+=mat[i][j];

            }
        }
        if (sum!=x){
            System.out.println("wrong answer");
            return;
        }
        Set<Integer> set = new HashSet<>();
        int temp = 0;
        for (int i = 0; i < n; i++) {
            temp = mat[i][0];
            for (int j = 1; j < m; j++) {
                temp ^= mat[i][j];
            }
            set.add(temp);
        }

      
        for (int j = 0; j < m; j++) {
            temp = mat[0][j];
            for (int i = 1; i < n; i++) {
                temp ^= mat[j][i];
            }
            set.add(temp);
        }
        if (set.size()==1){
            out.println("acceptted");
        }
        else{
            out.println("wrong answer");
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
