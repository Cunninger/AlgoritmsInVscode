import java.util.*;

import codeforce.practice_solve.one;

public class reviewTwoDemSum {
    static int[][] ssm;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = n;
        int[][] arr = new int[n + 1][m + 1];
        ssm = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                arr[i][j] = in.nextInt();

            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                ssm[i][j] = ssm[i - 1][j] + ssm[i][j - 1] - ssm[i - 1][j - 1] + arr[i][j];

            }
        }
        int ma = Integer.MIN_VALUE;
        for (int x1 = 1; x1 < arr.length; x1++) { // x1

            for (int x2 = x1; x2 < arr.length; x2++) { // y1

                for (int y1 = 1; y1 < arr.length; y1++) { // x2
                    for (int y2 = y1; y2 < arr.length; y2++) { // y2

                        ma = Math.max(ma, getPart(x1, y1, x2, y2));
                    }
                }
            }
        }
        System.out.println(ma);

    }

    public static int getPart(int x1, int y1, int x2, int y2) {
        // 输入的x1,y1,x2,y2是否需要偏移
        // a++;
        // b++;
        // c++;
        // d++;
        return ssm[x2][y2] - ssm[x2][y1 - 1] - ssm[x1 - 1][y2] + ssm[x1 - 1][y1 - 1];
    }
}