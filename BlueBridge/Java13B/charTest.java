import java.util.*;

public class charTest {
    public static void main(String[] args) {
      

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char []str = s.toCharArray();
     

        int []map = new int[26];
        for (int i = 0; i < str.length; i++) {
            map[(int)str[i]-'A']++;
        }
        for (int i = 0; i < map.length; i++) {
            System.out.print(map[i]+" ");
        }
        
    }
}
