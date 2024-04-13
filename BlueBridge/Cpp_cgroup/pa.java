import java.util.Scanner;

public class pa {
    static final int N = 510;
    static int n, m;
    static long k;
    static long[][] arr = new long[N][N];
    static long[][] s = new long[N][N];

    public static void main(String[] args) {
        int cnt = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        k = scanner.nextLong();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                arr[i][j] = scanner.nextLong();
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= m; j++)
                s[i][j] = s[i][j - 1] + s[i - 1][j] + arr[i - 1][j - 1] - s[i - 1][j - 1];

        for (int a = 1; a <= n; a++)
            for (int b = 1  ; b <= m; b++)
                for (int c = a; c <= n; c++)
                    for (int d = b; d <= m; d++) {
                        // a++;b++;c++;d++;
                        long sum = s[c][d] - s[a - 1][d] - s[c][b - 1] + s[a - 1][b - 1];
                        if (sum <= k) cnt++;
                    }
        System.out.println(cnt);
    }
}