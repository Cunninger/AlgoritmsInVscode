package leetcode_daily;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class pinCar {
    public static void main(String[] args) {
        QuickInput in = new QuickInput();
        PrintWriter out = new PrintWriter(System.out);
        int[][] trip = new int[2][3];
        // trip[0] = new int[] { 2, 1, 5 };// num f t
        // trip[1] = new int[] { 3, 3, 7 };
        trip[0] = new int[] { 2, 1, 5 };// num f t
        trip[1] = new int[] { 3, 5, 7 };
        int capacity = 3;
        int[] arr = new int[1002];
        int[] sum = new int[1002];
        int mi = Integer.MAX_VALUE;
        int ma = Integer.MIN_VALUE;
        for (int i = 0; i < 2; i++) {
            mi = Math.min(mi, trip[i][1]);
            ma = Math.max(ma, trip[i][2]);
            for (int j = 1; j <= 5; j++) {
               

                arr[j] += trip[i][0];
            }
        }
        boolean flag = true;
        for (int i = mi; i <= ma; i++) {
            if (arr[i]>capacity){
                flag = false;
                break;
            }
           
        }
        if(flag)out.print("true");
        else out.print("false");


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
