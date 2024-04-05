package Eleven_Bgroup;

import java.util.Scanner;

public class cnt2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = 0;
        for (int i = 1; i <= 2020; i++) {
            char[]str = String.valueOf(i).toCharArray();
            for (int j = 0; j < str.length; j++) {
                if (str[j]-'0'==2){
                    cnt++;
                }
            }

        }
        System.out.println(cnt);
    }
}
