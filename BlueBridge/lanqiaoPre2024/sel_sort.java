package lanqiaoPre2024;

import java.util.Scanner;

public class sel_sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        selsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"   ");
        }
    }

    public static void selsort(int []arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int m = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j]<arr[m])m = j;
            }

            // 交换arr[i],arr[m]
            int temp = arr[i];
            arr[i] = arr[m];
            arr[m] = temp;
        }
    }
}
//  a b c d e f g h 
// set.add(a+"_"+b+"_"+c+"_".........)
