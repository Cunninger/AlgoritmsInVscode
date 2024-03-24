package PTA;
import java.util.ArrayList;
import java.util.Scanner;

public class TEST02{
    static int memo = 0;
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> storage = new ArrayList<String>();
        String []s = str.split(" ");
        int n = Integer.valueOf(s[0]);
        int stars = (int) (Math.sqrt(2*(n+1)) - 1); // 最大星数
        int row = (1 + stars) / 2;
     
        // 上半部分
        for (int i = 0;i<row;i++){
            StringBuilder sb = new StringBuilder();
            int i_= i;
            for (int j = 0;j<i_;j++){
                System.out.print("S");
                sb.append("S");
            }
         
            for (int j = 0;j<stars-2*i_;j++){
                memo++;
                System.out.print(s[1]);
                sb.append(s[1]);
            }
      

            // for (int j = 0;j<i_;j++){
            //     System.out.print(" ");
            //     sb.append(" ");
            // }
            System.out.println();
          
            storage.add(sb.toString());
        }
    
        // 下半部分
        for (int i = row - 2; i >= 0; i--){
            System.out.println(storage.get(i));
        }

     
            System.out.println(n-(2*memo-1));
    }
}
