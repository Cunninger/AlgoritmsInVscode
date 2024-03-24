import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class sf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 建立映射表
        Map<String, Integer> memo = new HashMap<>();
        memo.put("一条龙", 1);
        memo.put("两家好", 2);
        memo.put("三结义", 3);
        memo.put("四喜财", 4);
        memo.put("五魁首", 5);
        memo.put("六六六", 6);
        memo.put("七仙女", 7);
        memo.put("八匹马", 8);
        memo.put("九重天", 9);
        memo.put("全来了", 10);

      
        int zf = scanner.nextInt();
        String zfWord = scanner.next();
        int sw = scanner.nextInt();
        String swkWord = scanner.next();

    
        int sum = zf + sw;

        
        Integer zfNum = memo.getOrDefault(zfWord, -1);
        Integer swkNum = memo.getOrDefault(swkWord, -1);

  
        boolean zw = zfNum == sum;
        boolean sws = swkNum == sum;

        if (zw && !sws) {
            System.out.println("Swk go to drink beer!");
        } else if (!zw && sws) {
            System.out.println("Zf go to drink beer!");
        } else {
            System.out.println("go on!");
        }
    }
}
