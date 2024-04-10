package Java12B;
import java.util.*;
import java.math.*;



public class BigdecimalTest {
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
            BigDecimal jgl = new BigDecimal(String.valueOf(jige)).divide(new BigDecimal(String.valueOf(n)),2,BigDecimal.ROUND_HALF_UP);
            int newjgl1 = jgl.multiply(new BigDecimal("100")).intValue();
            System.out.print(newjgl1 + "%");
            System.out.println();
            BigDecimal yxl = new BigDecimal(String.valueOf(yx)).divide(new BigDecimal(String.valueOf(n)),2,BigDecimal.ROUND_HALF_UP);
            int newyxl1 = yxl.multiply(new BigDecimal("100")).intValue();
            System.out.print(newyxl1 + "%");

    }

    }
