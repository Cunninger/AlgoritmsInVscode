package Round33;

import java.util.*;
/**
 * 元宵节快到了，小红作为甜食爱好者，非常喜欢吃汤圆，因此对元宵节也是很期待的。  
小红前往超市买了$n$袋汤圆，每袋汤圆有$x$颗。小红每次煮$k$颗汤圆，请你计算小红一共可以煮多少次，以及每次会打开几袋？  
小红非常节约，每次用完了一袋汤圆才会开新的一袋。
第一行输入三个正整数$n,x,k$，代表小红购买的袋数、每袋的汤圆数量，以及小红每次煮的汤圆数量。  
$1\leq n,x,k \leq 100$
第一行输出一个整数$cnt$，代表小红可以煮汤圆的次数。  
第二行输出$cnt$个整数$b_i$，代表小红每次煮汤圆需要新打开的袋数。
 */
public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int k = in.nextInt();

        int cnt = (n*x)/k;
        System.out.println(cnt);
        int []arr = new int[cnt+1];
        for (int i = 1; i <= cnt; i++) {
            if (i*k%x==0){
                arr[i] = i*k%x;
            }
            else{
                arr[i] = i*k%x+1;
            }
        }

        for (int i = 1; i <= cnt; i++) {
            System.out.print((arr[i]-arr[i-1])+" ");
        }
    }

}
