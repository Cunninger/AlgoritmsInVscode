import java.util.Scanner;

public class Main {
    static int[] parent; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        parent = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i; 
        }
        
        int fibers = 0;
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (!isConnected(a, b)) {
                union(a, b);
                fibers++; 
            }
        }
        
        
        System.out.println(fibers);
    }

    
    public static int find(int x) {
        while (x != parent[x]) {
            parent[x] = parent[parent[x]]; 
            x = parent[x];
        }
        return x;
    }

    
    public static void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            parent[rootX] = rootY;
        }
    }

    
    public static boolean isConnected(int x, int y) {
        return find(x) == find(y);
    }
}
