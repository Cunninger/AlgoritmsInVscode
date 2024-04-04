package thirtheen_Bgroup;

import java.util.Scanner;

public class makeProbemCal {
    public static void main(String[] args) {
     
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        int []week = new int[]{a,a,a,a,a,b,b};
        int k = 0;
        while (n>0){
            n-=week[(k++)%7];
        }
        System.out.println(k);

    }
}
