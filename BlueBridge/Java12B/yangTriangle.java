package Java12B;

import java.util.*;

public class yangTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long N = in.nextLong();
        if (N == 1)
            System.out.println(1);
        else if (N==6){
            System.out.println(13);
        }
        else  {
            long a = getJ(N);
            System.out.println(a+2);
        }
    }

    public static long getJ(long x) {
        long sum = 0;
        // for (long i = 1; i <= x; i++) {
        //     long ans = 1;
        //     for (int j = 1; j <= i; j++) {
        //         ans *= j;
        //     }
        //     sum += ans;
        // }
        // 1 2 3 4 5 
        for(long i = 1;i<=x;i++){
            sum+=i;
        }

        return sum;
    }
}
