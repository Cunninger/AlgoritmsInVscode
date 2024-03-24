package codeforce;

import java.util.Scanner;

public class problem1249B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] p = new int[n + 1];
           
            for (int i = 1; i <= n; i++) {
                p[i] = sc.nextInt();
            }
        
            for (int i = 1; i <= n; i++) {
                boolean[] vis = new boolean[n + 1];
                int j = i;
                int cnt = 0;
                while (!vis[j]) {
                    vis[j] = true;
                    j = p[j];
                    cnt++;
                }
                System.out.print(cnt + " ");
            }
            System.out.println();
        }
    }

}