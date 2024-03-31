package B_package;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Time;
import java.util.*;

public class B {
    static String[] num;

    public static <T> void main(String[] args) throws Exception {
        QuickInput in = new QuickInput();
        PrintWriter out = new PrintWriter(System.out);
        num = getArr();
        // for (int i = 0; i < num.length; i++) {
        //     out.println(num[i]);
        // }
        String[] res = new String[num.length];
        for (int i = 0; i < num.length; i++) {
            res[i] = tac(num[i]);
        }
        // 2022 01 01 12 00 05
        // 2022 01 01 16 01 35
        
        Arrays.sort(res, (o1, o2) -> {
            return (o1 + o2).compareTo(o2 + o1);
        });
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

        out.close();
    }

    public static String[] getArr() throws Exception {
        File file = new File("D:\\VScode_20230829\\algoritmsInVscode\\BlueBridge\\Cpp_cgroup\\B_package\\data.txt");
        Scanner in = new Scanner(file);
        String[] arr = new String[520];
        int k = 0;
        while (in.hasNextLine() && k < 520) {
            arr[k] = in.nextLine();
            k++;
        }
        return arr;
    }
    public static int calc(String s1,String s2){
        Time time = new Time(0)
        return 0;
    }

    public static String tac(String s) {
        String[] ss = s.split("-");
        String a = ss[2];

        String[] ss1 = a.split(":");

        String b = ss1[0];
        String[] ss2 = b.split(" ");

        String q = ss[0] + ss[1] + ss2[0] + ss2[1] + ss1[1] + ss1[2];
        return q;

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
