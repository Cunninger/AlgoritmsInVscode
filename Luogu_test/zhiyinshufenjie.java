package Luogu_test;
import java.util.*;
public class zhiyinshufenjie {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int maxPrimeFactor = 1;
        for (int i = 2;i*i<=a;i++){
            if (a%i==0 && isPrime(i) && isPrime(a/i))               
            maxPrimeFactor = Math.max(maxPrimeFactor,Math.max(a/i, i));
        }
        if (isPrime(a)){
            maxPrimeFactor = a;
        }

        System.out.println(maxPrimeFactor);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
