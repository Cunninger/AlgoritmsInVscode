
// package PTA;

// import java.util.*;

// public class test08 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int A = sc.nextInt();
//         int B = sc.nextInt();

//         int AA = A;
//         for (int i = 0; i < (B-A)+1; i++) {
//             if (i % 5== 0 && i != 0) {
//                 System.out.println();
//             }
         
//             if (AA <= B) {
//                 System.out.print(" "); 
//                 System.out.print(AA++);
//                 System.out.print(" ");
//             }

//         }
//         System.out.println();
//         int CC = A+B;
//         int nb = (B-A)+1;
//         System.out.print("Sum = " + CC*nb/2);

//     }
// }
package PTA;
import java.util.Scanner;

public class test08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        int sum = 0;
        int count = 0;
        for (int i = A; i <= B; i++) {
            System.out.printf("%5d", i);
            sum += i;
            count++;
            if (count % 5 == 0) {
                System.out.println();
            }
        }
        if (count % 5 != 0) {
            System.out.println();
        }
        System.out.println("sum = " + sum);
    }
}



// package PTA;
// import java.util.*;

// public class test08 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int A = sc.nextInt();
//         int B = sc.nextInt();

//         int AA = A;
//         for (int i = 0; i < (B-A)+1; i++) {
//             if (i % 5== 0 && i != 0) {
//                 System.out.println();
//             }
         
//             if (AA <= B) {
//                 System.out.printf("%5d",AA++);
//             }

//         }
//         System.out.println();
//         int CC = A+B;
//         int nb = (B-A)+1;
//         System.out.print("Sum = " + CC*nb/2);

//     }
// }