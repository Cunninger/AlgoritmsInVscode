import java.util.*;

public class Test006 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int maxLen = 0;
        int startNum = 0;
        for (int i = 2; i <= Math.sqrt(N); i++) {
            int temp = N;
            int j = i;

            if (temp % j == 0) {
                temp/=j;
                j++;
                
            }

            // 结算
            if (j-i>maxLen){
                maxLen = j-i;
                startNum = i;
            }
        }

        if (maxLen == 0){
            System.out.println(1);
            System.out.println(N);
        }
        else{
            System.out.println(maxLen);
            for (int i = 0;i<maxLen;i++){
                if (i!=0)System.out.print("*");
                System.out.print(i+startNum);
            }
        }
    }
}