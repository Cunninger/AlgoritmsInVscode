package PTA;

import java.util.*;
import java.util.Map.Entry;

public class test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char[] str = s.toCharArray();
        int[] numarr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            numarr[i] = str[i] - '0';
        }

        Arrays.sort(numarr);
        TreeMap<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());

        for (int i = 0; i < numarr.length; i++) {
            map.put(numarr[i], map.getOrDefault(numarr[i], 0) + 1);
        }
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
