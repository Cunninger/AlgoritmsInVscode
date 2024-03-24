package class_testwork;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
public class divMostNumber {
    public static void main(String[]args) throws FileNotFoundException{
        int a = 0;
        int b = 0;
         try {
            File file = new File("D:\\VScode_20230829\\class_testwork\\input2.txt");
            Scanner sc = new Scanner(file);
             a = sc.nextInt();
             b = sc.nextInt();
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

       // System.out.println(divMost(a,b)); 
       File outputFile = new File("D:\\VScode_20230829\\class_testwork\\output2.txt");
            PrintWriter pw = new PrintWriter(outputFile);
         
                pw.println(divMostNumber(a,b));

            pw.close();
        }

    public static int divMost(int a,int b){
        int countMax = 0;
       
        for (int i = a;i<=b;i++){
            int count = 0;
            for (int j = 1;j<=i;j++){
                
                if (i%j==0){
                    count++;
                }
            }
            countMax = Math.max(countMax, count);
        }
        return countMax;
    }

    //---------------------------------------------------
    public static int divMostNumber(int a,int b){
        int []ans = new int[b-a+1];
       
        for (int i = a;i<=b;i++){
            int count = 0;
            for (int j = 1;j<=i;j++){
                
                if (i%j==0){
                    count++;
                }
               
            }
           ans[i-a] = count;
        }
        int k = 0;
        
        for (int i = 0;i<ans.length-1;i++){
      
            if(ans[k]<=ans[i+1]){
                k = i+1;
            }
        }
        return k+a;
    }
}
