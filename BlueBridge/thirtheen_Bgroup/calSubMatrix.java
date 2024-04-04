package thirtheen_Bgroup;

import java.util.Scanner;

public class calSubMatrix {
    static int[][] mat;
    static int[][] sumMat;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int K = in.nextInt();

        mat = new int[N][M];
        sumMat = new int[N + 1][M + 1];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                sumMat[i+1][j+1] = mat[i][j];
            }
        }
        // for (int i =0; i < sumMat.length; i++) {
        //     for (int j =0; j < sumMat[0].length; j++) {
        //         System.out.print(sumMat[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        for (int i = 1; i < sumMat.length; i++) {
            for (int j = 1; j < sumMat[0].length; j++) {
                sumMat[i][j] +=  sumMat[i - 1][j] + sumMat[i][j - 1] - sumMat[i - 1][j - 1];
            }
        }
        int cnt =  0;
        for (int x1 = 0; x1 < mat.length; x1++) {
            for (int y1 = 0; y1 < mat[0].length; y1++) {
                for (int x2 = x1; x2 < mat.length; x2++) {
                    for (int y2 = y1; y2 < mat[0].length; y2++) {
                        if (getPart(x1, y1, x2, y2)<=K){
                            cnt++;       
                        }
                    }
                }
            }
        }
        System.out.println(cnt);

    }

    public static int getPart(int x1, int y1, int x2, int y2) {
        x1++;
        y1++;
        x2++;
        y2++;
        return sumMat[x2][y2] - sumMat[x2][y1 - 1] - sumMat[x1 - 1][y2] + sumMat[x1 - 1][y1 - 1];
    }
}
