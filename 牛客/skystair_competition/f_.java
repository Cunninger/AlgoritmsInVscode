import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int z = scanner.nextInt();
        String zfWord = scanner.next();
        int s = scanner.nextInt();
        String swkWord = scanner.next();
        scanner.close();

        Map<String, Integer> map = new HashMap<>();
        map.put("一条龙", 1);
        map.put("两家好", 2);
        map.put("三结义", 3);
        map.put("四喜财", 4);
        map.put("五魁首", 5);
        map.put("六六六", 6);
        map.put("七仙女", 7);
        map.put("八匹马", 8);
        map.put("九重天", 9);
        map.put("全来了", 10);

        int zs = map.getOrDefault(zfWord, -1);
        int ss = map.getOrDefault(swkWord, -1);
        int tn = z + s;

        if (zs == tn && ss != tn) {
            System.out.println("Zf go to drink beer!");
        } else if (ss == tn && zs != tn) {
            System.out.println("Swk go to drink beer!");
        } else {
            System.out.println("go on!");
        }
    }
}