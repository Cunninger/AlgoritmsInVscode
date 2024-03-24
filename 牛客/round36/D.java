package round36;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.*;

public class D {
    static int[] dx = new int[] { 0, 0, -1, 1 };
    static int[] dy = new int[] { 1, -1, 0, 0 };
    static boolean[][] isVist;
    static int n, m;

    static class Pos {
        int x;
        int y;
        int step;

        public Pos(int x, int y, int s) {
            this.x = x;
            this.y = y;
            step = s;
        }
    }

    public static void main(String[] args) {
        QuickInput in = new QuickInput();
        PrintWriter out = new PrintWriter(System.out);
        n = in.nextInt();
        m = in.nextInt();
        char[][] mat = new char[n][m];
        isVist = new boolean[n][m];
        for (int i = 0; i < mat.length; i++) {
            mat[i] = in.next().toCharArray();
        }
        System.out.println(bfs(mat, n,m));

        out.close();
    }

    public static int bfs(char[][]mat,int n,int m){
        Queue<Pos> queue = new LinkedList<>();
        
        queue.offer(new Pos(0, 0, 0));
        isVist[0][0] = true;
        while (!queue.isEmpty()){
            Pos cur = queue.poll();
            if (cur.x==n-1&&cur.y==m-1){
                return cur.step;
            }
            for (int i = 0; i < dx.length; i++) {
                int fx = cur.x+dx[i];
                int fy = cur.y+dy[i];
                if (fx<0||fx>=n||fy<0||fx>=m||isVist[fx][fy]||mat[fx][fy]==mat[cur.x][cur.y])continue;
                isVist[fx][fy]= true;
                queue.offer(new Pos(fx, fy, cur.step+1));

            }
        }

        return -1;
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
