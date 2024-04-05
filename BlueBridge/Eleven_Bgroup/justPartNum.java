package Eleven_Bgroup;

public class justPartNum {
    public static void main(String[] args) {
        long cnt = 0;

        for (int i = 1; i <= 2022; i++) {
            if (isPrime(i)) {
                cnt++;
            }
        }
        System.out.println(dfs(cnt));

        int k = 1;
        // 406+=4*k+

    }

    public static boolean isPrime(int x) {
        boolean flag = true;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                flag = false;
                break;
            }
        }

        return flag;
    }

    public static long dfs(long x) {
        if (x == 2) {
            return 2;
        } else {
            return x * dfs(x - 1);
        }

    }
}
