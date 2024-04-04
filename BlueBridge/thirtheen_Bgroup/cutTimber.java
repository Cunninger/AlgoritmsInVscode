package thirtheen_Bgroup;

import java.util.Scanner;

public class cutTimber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int start = 2 * N - 2;
        int cnt = (N-1) / 2;
        int[] arr = new int[cnt+1];
        if (N % 2 == 0) {
            for (int i = 0; i <= cnt; i++) {
                arr[i] = start - i * 2;
            }
        } else {
            for (int i = 0; i <= cnt; i++) {
                arr[i] = start - i * 2;
            }
        }
        if (N % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
        else{
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            for (int i = arr.length - 2; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }

    }
}
