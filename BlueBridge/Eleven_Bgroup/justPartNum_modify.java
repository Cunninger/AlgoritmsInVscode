package Eleven_Bgroup;

import java.math.*;

public class justPartNum_modify {
    public static void main(String[] args) {
        int cnt = 0;
        for (int i = 1; i <= 2020; i++) {
            for (int j = 1; j <= 2020; j++) {

                // BigInteger i1 = BigInteger.valueOf(i);
                // BigInteger j1 = BigInteger.valueOf(j);
                // if (i1.gcd(j1).equals(BigInteger.valueOf(1))) {
                //     cnt++;
                // }
                if (gcd(i, j)==1){
                    cnt++;
                }

            }

        }
        System.out.println(cnt);
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
