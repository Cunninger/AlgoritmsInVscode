package Eleven_Bgroup;

import java.util.Scanner;

import codeforce.practice_solve.one;



public class calcGrade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        double jige = 0;
        double yx = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            if (arr[i]>=60){
                jige++;
            }
            if (arr[i]>=85){
                yx++;
            }
        }

        // float j = jige/n;
        // float k = yx/n;
        // String js = String.valueOf(j);
        // String ks = String.valueOf(k);
        // String jsnum = js.substring(2,4);
        // String ksnum = ks.substring(2,4);
        // int jsnum1 = Integer.valueOf(jsnum);
        // int ksnum1 = Integer.valueOf(ksnum);
        // if (check(js.charAt(4))){
        //     jsnum1++;
        // }
        // if (check(ks.charAt(4))){
        //     ksnum1++;
        // }
        // System.out.println(jsnum1+"%");
        // System.out.println(ksnum1+"%");



        // System.out.println(j+"  "+k);

        System.out.println(Math.round(jige*100/n)+"%");
        System.out.println(Math.round(yx*100/n)+"%");


    }

    public static boolean check(char x){
        int t = x-'0';
        if (t>=5)return true;
        else return false;
    }
}
