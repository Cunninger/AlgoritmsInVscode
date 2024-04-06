package Eleven_Bgroup;

import java.util.Scanner;

public class huiwenDate {
    static int []month = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String st = in.nextLine();
        String ed = in.nextLine();
        int styear = Integer.valueOf(st.substring(0, 4));
        int stmonth = Integer.valueOf(st.substring(4, 6));
        int stday = Integer.valueOf(st.substring(6, 8));

        int edyear = Integer.valueOf(ed.substring(0, 4));
        int edmonth = Integer.valueOf(ed.substring(4, 6));
        int edday = Integer.valueOf(ed.substring(6, 8));

        for (int i = styear; i <=edyear; i++) {
            for (int j = stmonth; j <=edmonth; j++) {
                
            }
        }

    }

}
