package algoritmbasic2020;

//来源：        
public class Code01_Knapsack {

    // 所有的货，重量和价值，都在w和v数组里
    // 为了方便，其中没有负数
    // bag背包容量，不能超过这个载重
    // 返回：不超重的情况下，能够得到的最大价值
    public static int maxValue(int[] w, int[] v, int bag) {
        if (w == null || v == null || w.length != v.length || w.length == 0) {
            return 0;
        }
        // 尝试函数！
        return process(w, v, 0, bag);
    }

    // index 0~N
    // rest 负~bag
    public static int process(int[] w, int[] v, int index, int rest) {
        if (rest < 0) {
            return -1;
        } // 我想这个情况表示当前遍历到的物品选了还是没选？ 选了，但是超重了，所以返回-1
          // 这个是表示选了超重 还是没选当前物品超重？ 选了超重

        if (index == w.length) {
            return 0;//
        } // 我想这个情况表示当前遍历到的物品选了还是没选？ 没选，但是没超重，所以返回0
          // 那这个index==w.length返回0是什么意思？
          // 这个index==w.length是递归的终止条件，也就是说，当index==w.length时，说明已经遍历完所有的物品了，此时返回0，表示没选任何物品，也就是说，没选任何物品，也没超重，所以返回0

        // p1不需要判断的原因是：p1遇到rest<0，直接返回-1，不会再往下走了
        int p1 = process(w, v, index + 1, rest);
        int p2 = 0;
        // p2需要判断的原因是：p2遇到rest<0，还要往下走，看看能不能找到更大的值
        int next = process(w, v, index + 1, rest - w[index]);
        // 为什么不要判断rest-w[index]>=0?
        // 因为rest-w[index]可能会出现负数，但是这个负数不是真正的负数，而是表示当前遍历到的物品选了，但是超重了，所以返回-1
        if (next != -1) {
            p2 = v[index] + next;
        }
        return Math.max(p1, p2);
    }

    //-----------------------------------改为动态规划----------------------------------------------

   public static int maxValue2(int[] w, int[] v, int bag) {
        int N  = w.length;    
        int [][]dp = new int[N+1][bag+1];

        //base case:
        //index==w.length,dp[i][....]=0,由于数组初始化为0；
        //i--->index
        //j--->bag

        for (int i = N-1;i>=0;i--){
            for (int j = 0;j<=bag;j++){
                int p1 = dp[i+1][j];
                int p2 = j-w[i]<0?0:dp[i+1][j-w[i]]+v[i];
                dp[i][j] = Math.max(p1,p2);
            }
        } 
        return dp[0][bag];
    }
   

    // 还有一种是算返回的方法数的背包问题：

    public static void main(String[] args) {
        int[] weights = { 3, 2, 4, 7, 3, 1, 7 };
        int[] values = { 5, 6, 3, 19, 12, 4, 2 };
        int bag = 15;
        System.out.println(maxValue(weights, values, bag));
        System.out.println(maxValue2(weights, values, bag));
    }

}
