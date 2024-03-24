package class_testwork;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
public class calNumber{
    public static void main(String []args) throws FileNotFoundException{
        int []ans = new int[10];
        try {
            File file = new File("D:\\VScode_20230829\\class_testwork\\input.txt");
            Scanner sc = new Scanner(file);
            int a = sc.nextInt();
            sc.close();
    // hell
             ans = getCount(a);
            for (int i : ans) {
                System.out.println(i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //-------------------------------------------------------

         File outputFile = new File("D:\\VScode_20230829\\class_testwork\\output.txt");
            PrintWriter pw = new PrintWriter(outputFile);
            for (int i : ans) {
                pw.println(i);
            }
            pw.close();
        }
        
        


    public static int[] getCount(int a){
        int[]ans = new int[10];
        for (int i =1;i<=a;i++){
            String s = String.valueOf (i);
            char[]as = s.toCharArray();
            for(char ass:as){
                int asNumber = ass-'0';
            
                ans[asNumber]++;
              
            }
        }


        return ans;
    }


}