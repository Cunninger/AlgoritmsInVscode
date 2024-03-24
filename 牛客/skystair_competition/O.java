package skystair_competition;

import java.util.Scanner;

public class Main {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(f(n, m, k));
    }

    private static long f(int n, int m, int k) {
        long[][] dp = new long[n+1][m+1];
        long result = 0;

        for (int x = 0; x <= n; x++) {
            for (int y = 0; y <= m; y++) {
                if (x == 0 && y == 0) {
                    dp[x][y] = 1; 
                } else {
                    long sum = (x > 0 ? dp[x-1][y] : 0) + (y > 0 ? dp[x][y-1] : 0);
                    dp[x][y] = sum % MOD;
                }
                long ds = f1(x + y, k, MOD);
                result = (result + ds * dp[x][y] % MOD) % MOD;
            }
        }

        return result;
    }

    private static long f1(long a, long b, long mod) {
        long result = 1;
        a = a % mod;
        while (b > 0) {
            if ((b & 1) != 0) result = (result * a) % mod;
            b >>= 1;
            a = (a * a) % mod;
        }
        return result;
    }
}
