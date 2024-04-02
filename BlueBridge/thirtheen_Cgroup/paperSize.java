package thirtheen_Cgroup;

import java.util.*;

public class paperSize {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        char[] str = s.toCharArray();
        int a = str[1] - '0';
        int [][]AX = new int[10][2];
        AX[0][0] = 1189;
        AX[0][1] = 841;

        AX[1][0] = 841;
        AX[1][1] = 1189/2;

        AX[2][0] = 1189/2;
        AX[2][1] = 841/2;

        AX[3][0] = 841/2;
        AX[3][1] = 1189/4;

        AX[4][0] = 1189/4;
        AX[4][1] = 841/4;

        AX[5][0] = 841/4;
        AX[5][1] = 1189/8;

        AX[6][0] = 1189/8;
        AX[6][1] = 841/8;

        AX[7][0] = 841/8;
        AX[7][1] = 1189/16;

        AX[8][0] = 1189/16;
        AX[8][1] = 841/16;

        AX[9][0] = 841/16;
        AX[9][1] = 1189/32;
        
        System.out.println(AX[a][0]);
        System.out.println(AX[a][1]);


    }
}
