import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Q = scanner.nextInt(); // 读取字符串数量
        scanner.nextLine(); // 消耗掉nextInt后的换行符

        for (int i = 0; i < Q; i++) {
            String S = scanner.nextLine(); 
            System.out.println(minOps(S)); // 计算并输出最小操作次数
        }
    }

    private static int minOps(String S) {
     
        if (S.equals("NDD")) {
            return 0;
        }
        

        if (S.charAt(1) != 'D') {
            return -1;
        }
        

        int ops = 0;
        if (S.charAt(0) != 'N') ops++;
        if (S.charAt(2) != 'D') ops++;
        
        return ops;
    }
}
