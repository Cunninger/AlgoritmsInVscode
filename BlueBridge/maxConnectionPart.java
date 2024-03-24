package BlueBridge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class maxConnectionPart {
    static int[] dx = new int[] { -1, 1, 0, 0 };
    static int[] dy = new int[] { 0, 0, -1, 1 };
    static int ma = 0;
    static boolean[][] isVisit;

    public static void main(String[] args) throws Exception {
        QuickInput in = new QuickInput();
        PrintWriter out = new PrintWriter(System.out);
        int[][]res = getMat();
        isVisit = new boolean[30][60];

        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 60; j++) {
                if(!isVisit[i][j]&&res[i][j]==1){
                    ma = Math.max(ma, dfs(i,j));
                }
            }
        }
        
        out.close();
    }
    public static int dfs(int x,int y){
            





        return 0;
    }

    public static int[][] getMat() throws Exception {
        int[][] res = new int[30][60];
        File file = new File("D:\\VScode_20230829\\BlueBridge\\data.txt");
        Scanner sc = new Scanner(file);
        int k = 0;
        while (sc.hasNext() && k < 30) {
            String s = sc.nextLine().trim();
            char[] str = s.toCharArray();
            int[] arr = new int[60];
            for (int i = 0; i < str.length; i++) {
                arr[i] = str[i] - '0';
            }
            res[k++] = arr;
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
