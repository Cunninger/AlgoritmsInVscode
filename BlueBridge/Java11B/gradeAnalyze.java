package Java11B;

import java.math.BigDecimal;
import java.util.*;

public class gradeAnalyze {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        int[] arr = new int[(int)n];
        long sum =0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            sum+=arr[i];
        }

        Arrays.sort(arr);
        int ma = arr[arr.length-1];
        int mi = arr[0];
        BigDecimal dec =BigDecimal.valueOf(sum).divide(BigDecimal.valueOf(n), 2,BigDecimal.ROUND_HALF_UP);
        System.out.println(ma);
        System.out.println(mi);
        System.out.println(dec);

        
    }
}
