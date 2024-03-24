package skystair_competition;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt(); 
        }
        
        System.out.println(f(a));
    }
    
    private static int f(int[] a) {
        int n = a.length;
        int[] pre = new int[n];
        int[] f = new int[7];
        int[] l = new int[7];
        Arrays.fill(f, -1); 
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = (sum + a[i]) % 7; 
            pre[i] = sum;
            if (f[sum] == -1) {
                f[sum] = i;
            }
            l[sum] = i;
        }
        
        int maxLength = -1;
        for (int i = 0; i < 7; i++) {
            if (f[i] != -1) { 
                int length = l[i] - f[i];
                if (length > maxLength) {
                    maxLength = length;
                }
            }
        }
        
        return maxLength; 
    }
}
