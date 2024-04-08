package lanqiaoPre2024;

import java.util.Scanner;

public class LIS_sub {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        int curLength = 1;
        int maxLength = 1;
        int start = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) > s.charAt(i - 1)) {
                curLength++;
            }
            else{
                if (curLength>maxLength){
                    maxLength = curLength;
                    start = i-maxLength;
                }
                curLength = 1;
            }
        }
        if (curLength>maxLength){
            maxLength = curLength;
            start = s.length()-maxLength;
        }
        System.out.println(s.substring(start, start+maxLength));

    }
}
