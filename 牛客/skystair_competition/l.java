import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] temp = br.readLine().split(" ");
        long[] a = new long[N];
        for(int i = 0; i < N; i++) {
            a[i] = Long.parseLong(temp[i]);
        }
        
        
        Arrays.sort(a);
        int Q = Integer.parseInt(br.readLine());
        for(int q = 0; q < Q; q++) {
            temp = br.readLine().split(" ");
            int x = Integer.parseInt(temp[0]) - 1;
            long y = Long.parseLong(temp[1]);

            long[] copyA = Arrays.copyOf(a, N);
            copyA[x] = y;
            Arrays.sort(copyA); 

            long W = 0;
            for(int i = N - 1; i >= 0; i--) {
                W += copyA[i] * (N - i);
            }

            System.out.println(W);
        }
    }
}
