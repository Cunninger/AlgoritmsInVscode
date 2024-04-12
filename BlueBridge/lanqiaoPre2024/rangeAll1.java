package lanqiaoPre2024;

import java.util.Scanner;

public class rangeAll1 {
    static int[] arr;
    static boolean[] used;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 输入N 生成N 的全排列
        int N = in.nextInt();
        arr = new int[N];
        used = new boolean[N];
        dfs(0);
    }

    public static void dfs(int u) {
        if (u == arr.length) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            if (u!=arr.length-1)
            System.out.println();
            return;
        }

        for (int k = 0; k < arr.length; k++) {
            if (!used[k]) {
                used[k] = true;// 标记为true
                arr[u] = k + 1;// 存放 
                dfs(u + 1);    // 
                used[k] = false;

            }
        }
    }
}