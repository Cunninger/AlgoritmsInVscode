import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Q = scanner.nextInt(); 
        scanner.nextLine(); 
        for (int q = 0; q < Q; q++) {
            String S = scanner.nextLine(); 
            System.out.println(f(S)); 
        }
    }
    private static int f(String s) {
        if (s.equals("NDD")) return 0;
    
        if (s.length() == 2) {
            if (s.equals("ND") || s.equals("DN")) return 1;
            else return -1;
        } else if (s.length() < 2) {
            return -1;
        }
    
        
        int op = 0;
    
        if (s.charAt(0) != 'N') op++;
    
        if (s.charAt(s.length() - 1) != 'D') op++;
        if (s.length() > 3 && s.charAt(s.length() - 2) != 'D') op++;
    
        int de = Math.max(0, s.length() - 3);
    
        
        return op + de;
    }
    
}
