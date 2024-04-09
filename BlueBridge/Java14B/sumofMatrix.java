package Java14B;

import java.util.*;

public class sumofMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        int x3 = in.nextInt();
        int y3 = in.nextInt();
        int x4 = in.nextInt();
        int y4 = in.nextInt();
        long sum1 = (long) (x2 - x1) * (y2 - y1);
        long sum2 = (long) (x4 - x3) * (y4 - y3);

        // x2 y2 , x3 y3
        int overWidth = Math.max(0, Math.min(x2, x4) - Math.max(x1, x3));
        int overHeight = Math.max(0, Math.min(y2, y4) - Math.max(y1, y3));
        System.out.println(sum1+sum2-overHeight*overWidth);

    }

}
