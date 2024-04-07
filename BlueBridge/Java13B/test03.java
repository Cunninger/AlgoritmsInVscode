
import java.util.*;

public class test03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] str = s.toCharArray();
        // for (int i = 0; i < s.length(); i++) {
        // if ()
        // }

        int[] map = new int[26];
        for (int i = 0; i < str.length; i++) {
            map[(int) str[i] - 'A']++;
        }

        int[] res = new int[26];
        int ma = Integer.MIN_VALUE;
        int maIndex = -1;
        for (int i = 0; i < map.length - 1; i++) {
            // 找次数
            if (map[i] > ma) {
                ma = map[i];
                maIndex = i;
            }
        }
        int k = 1;
        res[0] = maIndex;
        for (int i = 0; i < map.length; i++) {
            if (map[i]==ma){
                System.out.print((char)(i+65));
            }
        }
        // Arrays.sort(res);
        // Set<Character>set = new TreeSet<>();
        // for (int i = 0; i < res.length; i++) {
        //     char u =(char) ('A'+res[i]);
        //     set.add(u);
        //     // System.out.print(u);
        // }
        // for(char c:set){
        //     System.out.print(c);
        // }



    }
}