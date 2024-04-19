import java.util.Scanner;

public class Test015 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        char c = in.next().charAt(0);
        for (int i = 0;i<Math.round((double)N/2);i++){
            for (int j = 0;j<N;j++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
