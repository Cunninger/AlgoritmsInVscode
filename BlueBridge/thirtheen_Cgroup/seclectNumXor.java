package thirtheen_Cgroup;

import java.util.Scanner;

public class seclectNumXor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int x = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        } 
        boolean flag = true;
        while (m-->0) {
            int l = in.nextInt()-1;
            int r = in.nextInt()-1;
           flag = true;
            out:
            for (int i = l; i <= r; i++) {
                for (int j = l+1; j <=r ; j++) {
                    if ((arr[i] ^ arr[j])==m){
                        flag = false;
                        break out;
                    }
                }
            }
            System.out.println(flag?"no":"yes");
            


        }
    }
}
