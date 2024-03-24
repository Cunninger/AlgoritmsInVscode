package skystair_competition;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class j {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); 
        int M = scanner.nextInt();
        int K = scanner.nextInt(); 
        int[] hhs = new int[N];
        for (int i = 0; i < N; i++) {
            hhs[i] = scanner.nextInt();
        }

        List<Stack<Integer>> ps = new ArrayList<>();
        Stack<Integer> A = new Stack<>();
        Stack<Integer> B = new Stack<>();

        for (int hh : hhs) {
            if (A.isEmpty() || hh > A.peek()) {
                A.push(hh);
                if (A.size() == K) {
                    ps.add(A);
                    A = new Stack<>();
                }
            } else {
                if (B.isEmpty() || (B.size() < M && B.peek() > hh)) {
                    B.push(hh);
                } else {
                    if (!A.isEmpty()) {
                        ps.add(A);
                        A = new Stack<>();
                    }
                    while (!B.isEmpty() && B.peek() <= hh) {
                        A.push(B.pop());
                    }
                    A.push(hh);
                }
            }
        }

        if (!A.isEmpty()) {
            ps.add(A);
        }

        if (!B.isEmpty()) {
            Stack<Integer> tp = new Stack<>();
            while (!B.isEmpty()) {
                tp.add(0, B.pop()); 
            }
            ps.add(tp);
        }

        
        for (Stack<Integer> product : ps) {
            while (!product.isEmpty()) {
                System.out.print(product.remove(0)); 
                if (!product.isEmpty()) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
