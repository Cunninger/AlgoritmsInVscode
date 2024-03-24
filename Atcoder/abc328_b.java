package Atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.*;

import javafx.scene.layout.HBox;

public class abc328_b {
    public static void main(String[] args) {
        QuickInput in = new QuickInput();
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int cnt =0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j <= arr[i]; j++) {
                if (check(i,j))cnt++;
            }
            // hello hello
            // hello
        }
         out.println(cnt);
        
        out.close();
    }

    public static boolean check(int x,int y){
        Set<Integer> set = new HashSet<>();
        char[]str1 = Integer.toString(x).toCharArray();
        for (int i = 0; i < str1.length; i++) {
            set.add(str1[i]-'0');
        }
        char[]str = Integer.toString(y).toCharArray();
        for (int i = 0; i < str.length; i++) {
            set.add(str[i]-'0');
        }
        return set.size()==1;
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
