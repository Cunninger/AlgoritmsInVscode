import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class h2 {
    static class Node {
        String name;
        String reg;

        public Node(String name, String reg) {
            this.name = name;
            this.reg = reg;
        }
    }

    public static void main(String[] args) {
        QuickInput in = new QuickInput();
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        Map<String, String> map = new HashMap<>();
        Node[] nodes = new Node[n];
        for (int i = 0; i < nodes.length; i++) {
            String a = in.next();
            String b = in.next();
            nodes[i] = new Node(a, b);

        }
        int cnt = 0;

        for (int i = 0; i < nodes.length-1; i++) {
            for (int j = 0; j < nodes.length; j++) {
                if (nodes[i].name.substring(0, 2).equals(nodes[j].reg)
                        && nodes[j].reg.equals(nodes[i + 1].name.substring(0, 2))) {
                    cnt++;
                    // hello    
                    // 滑动窗口 
                    

                    
                }
            }
        }
        out.println(cnt);
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
