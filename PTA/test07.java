package PTA;

import java.util.*;

public class test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Inte = sc.nextInt();
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "ling");
        map.put(1, "yi");
        map.put(2, "er");
        map.put(3, "san");
        map.put(4, "si");
        map.put(5, "wu");
        map.put(6, "liu");
        map.put(7, "qi");
        map.put(8, "ba");
        map.put(9, "jiu");
        String s = String.valueOf(Inte);
        char[] str = s.toCharArray();

        for (int i = 0; i < str.length; i++) {
            if (map.get(str[i] - '0') == null) {
                System.out.print("fu" + " ");
            } else {
                if (i == str.length - 1) {
                    System.out.print(map.get(str[i] - '0'));
                } else {
                    System.out.print(map.get(str[i] - '0') + " ");
                }

            }
        }

    }

}