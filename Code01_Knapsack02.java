package algoritmbasic2020;

public class Code01_Knapsack02 {
    public static int getMethedCount(int[] w, int bag) {

        return process(w, 0, bag);

    }

    public static int process(int[] w, int index, int rest) {
        if (rest < 0) {
            return -1;
        }
        if (index == w.length) {
            return 1;
        }

        int p1 = process(w, index + 1, rest);

        int p2 = process(w, index + 1, rest - w[index]);
        return p1 + (p2 == -1 ? 0 : p2);
    }

    //------------------------------改为动态规划----------------------------------------------


    
    public static int getMethedCount2(int []w,int bag){
        //index,bag
        int N = w.length;

        int[][]dp = new int[N+1][bag+1];
        //为什么要加1？因为index和bag都是从0开始的，所以要加1，左闭右闭
        //dp[N][...] = 1;
        for(int i = 0;i<=bag;i++){
            dp[N][i] = 1;
        }

        for (int i = N-1;i>=0;i--){
         
            for (int j = 0;j<=bag;j++){
                int p1  = dp[i+1][j];
                int p2 = j-w[i]<0?0:dp[i+1][j-w[i]];
                dp[i][j] = p1+p2;
            } 
        }
        return dp[0][bag];
    }

    public static void main(String[] args) {
        int[] w = { 1, 2, 3, 4, 5 };
        int bag = 8;
        System.out.println(getMethedCount(w, bag));
        System.out.println(getMethedCount2(w, bag));

    }  




    

}