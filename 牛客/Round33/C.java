package Round33;
import java.util.*;

public class C {
    static String s;
    static int no,one;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        s = in.nextLine();

        // 1011011
        // 100010001
        int cnt = f();
        StringBuilder sb = new StringBuilder(s);
       
      
     
     
        for (int i = 0; sb.length() > 1; i++) {
            if (sb.charAt(0) == '0') {
                sb.deleteCharAt(0);
                no--;
            } else if (sb.charAt(1) == '0') {
                sb.deleteCharAt(1);
                no--;
            } else {
                sb.deleteCharAt(0);
                one--;
            }
            cnt = Math.max(cnt, one-no);
        }
        System.out.println(cnt);
    }

    public static int f() {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                one++;
                cnt++;
            } else {
                no++;
                cnt--;
            }
        }
        return Math.max(0, cnt);
    }

}
