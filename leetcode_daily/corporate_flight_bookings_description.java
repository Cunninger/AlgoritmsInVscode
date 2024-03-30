package leetcode_daily;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class corporate_flight_bookings_description {
    public static void main(String[] args) {
        QuickInput in = new QuickInput();
        PrintWriter out = new PrintWriter(System.out);
        Solution ss = new Solution();
        int[][] bookings = new int[3][3];
        bookings[0] =new int[]{1,2,10};
        bookings[1] =new int[]{2,3,20};
        bookings[2] =new int[]{2,5,25};

        int n = 5;
        int[] res = ss.corpFlightBookings(bookings, n);

        out.close();
    }
}

class Solution {
    static int[] sum;
    static int[] arr;

    public int[] corpFlightBookings(int[][] bookings, int n) {
        sum = new int[n + 1];
        arr = new int[n ];
        for (int i = 0; i < bookings.length; i++) {
            for (int j = bookings[i][0]; j <= bookings[i][1]; j++) {
                arr[j-1] += bookings[i][2];
            }
        }
        // for (int i = 0; i < arr.length; i++) {
        //       System.out.print(arr[i]+"     ");
        // }
      
        // for (int i = 1; i <= n; i++) {
        //     sum[i] += arr[i];
        // }
        // int[] res = new int[5];
        // for (int i = 1; i < res.length - 1; i++) {
        //     res[i] = getPart(i, i + 1);
        // }
        return arr;

    }

    public static int getPart(int st, int ed) {
        return sum[ed] - sum[st - 1];
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
