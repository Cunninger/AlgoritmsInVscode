import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[7];
        for (int i = 0; i < 7; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers); 

        int A = numbers[0]; 
        int sumABC = numbers[6];
        int B_plus_C = sumABC - A; 

    
        int B = 0, C = 0;
        for (int i = 1; i < 6; i++) { 
            for (int j = i + 1; j < 6; j++) { 
                if (numbers[i] + numbers[j] == B_plus_C) {
                    B = numbers[i];
                    C = numbers[j];
                    break;
                }
            }
            if (B != 0) {
                break;
            }
        }

        System.out.println(A + " " + B + " " + (sumABC - A - B));
    }
}
