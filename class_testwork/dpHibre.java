package class_testwork;

public class dpHibre {
    public static void main(String[] args) {
        int[] value = {48, 7, 40, 12, 8};
        int[] time = {7, 1, 5, 2, 1};
        int bag = 8;
        int N = value.length;
        int[][] dp = new int[N][bag + 1];
        for (int i = 1; i < N; i++) {
            dp[i][0] = 0;
        }

        for (int i = 0; i < N; i++) {
            if (time[i] <= bag) {
                dp[i][time[i]] = Math.max(value[i], dp[i][time[i]]);
            }
        }

        for (int i = 1; i < N; i++) {
            for (int j = time[i]; j <= bag; j++) {
                if (j - time[i] >= 0) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - time[i]] + value[i]);
                }
            }
        }

        System.out.println(dp[N-1][bag]);
    }
}