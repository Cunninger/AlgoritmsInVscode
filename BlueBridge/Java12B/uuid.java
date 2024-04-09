package Java12B;

import java.util.*;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class uuid {
    static int[] arr;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        arr = new int[n + 1];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
        }

        while (n-- > 0) {
            int p = in.nextInt();
            int q = in.nextInt();
            if (p == 0) {
                // 降序
                sortAndReverse(1, q);
            } else {
                Arrays.sort(arr, q, arr.length);
            }
        }
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void sortAndReverse(int start, int end) {
        Arrays.sort(arr, start, end+1);
        reverse(start, end);
    }


    public static void reverse(int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    }
}