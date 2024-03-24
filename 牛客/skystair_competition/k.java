import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); 
        int M = scanner.nextInt(); 
        int K = scanner.nextInt();
        int[] hawthorns = new int[N];
        for (int i = 0; i < N; i++) {
            hawthorns[i] = scanner.nextInt();
        }

        List<Stack<Integer>> products = new ArrayList<>(); 
        Stack<Integer> A = new Stack<>();
        Stack<Integer> B = new Stack<>();

        for (int h : hawthorns) {
            if (A.isEmpty() || h > A.peek()) {
                // 直接放入 A
                A.push(h);
                if (A.size() == K) {
                    products.add(new Stack<>(A));
                    A.clear();
                }
            } else {
                // 放入 B
                if (B.isEmpty() || (B.size() < M && h < B.peek())) {
                    B.push(h);
                } else {
                    // A 作为成品，重置 A
                    if (!A.isEmpty()) {
                        products.add(new Stack<>(A));
                        A.clear();
                    }

                    // 将 B 中比 h 小的山楂移入 A
                    while (!B.isEmpty() && B.peek() < h) {
                        A.push(B.pop());
                        if (A.size() == K) {
                            products.add(new Stack<>(A));
                            A.clear();
                        }
                    }
                    // 将 h 放入 A
                    A.push(h);
                }
            }
        }

        
        if (!A.isEmpty()) {
            products.add(new Stack<>(A));
        }
        while (!B.isEmpty()) {
            Stack<Integer> temp = new Stack<>();
            temp.push(B.pop());
            products.add(temp);
        }

        
        for (Stack<Integer> product : products) {
            while (!product.isEmpty()) {
                System.out.print(product.remove(0));
                if (!product.isEmpty()) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
