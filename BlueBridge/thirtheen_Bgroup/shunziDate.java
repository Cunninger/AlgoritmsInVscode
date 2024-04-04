package thirtheen_Bgroup;

import java.util.Scanner;

public class shunziDate {
    // static int[] monthDay = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    // public static void main(String[] args) {
    //     int cnt = 0;
    //     for (int i = 2; i <= 2; i++) {
    //         for (int j = 1; j <= monthDay[i]; j++) {
    //             String si = String.valueOf(i);
    //             String ji = String.valueOf(j);
    //             if (i < 10)
    //                 si = "0" + si;
    //             if (j < 10)
    //                 ji = "0" + ji;
    //             String merge = si+ji;
    //             char[]mm = merge.toCharArray();
    //             int []num = new int[mm.length];
    //             for (int k = 0; k < num.length; k++) {
    //                 num[k] = mm[k]-'0';
    //             }
    //             if (num[0]+1==num[1]&& num[0]+2==num[2]||num[1]+1==num[2]&& num[1]+2==num[2]){
    //                 cnt++;
    //             }
    //         }
    //     }
    //     System.out.println(cnt);
    // }
        public static void main(String[] args) {
            int res = 0;
            for (int i = 1; i <= 12; i++) {
                for (int j = 1; j <= 31; j++) {
                    String s = String.format("2022%02d%02d", i, j);
                    if (s.contains("012") || s.contains("123")) {
                        res++;
                    }
                }
            }
            System.out.println(res);
        }
    }
