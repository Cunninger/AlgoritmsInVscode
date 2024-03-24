import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Map<String, String> ump = new HashMap<>();
    Map<String, List<String>> pp = new HashMap<>();
    int sp = 0;

    for (int i = 0; i < N; i++) {
      String name = sc.next();
      String code = sc.next();
      ump.put(name, code);

      String px = name.substring(0, 2);
      if (!pp.containsKey(px)) {
        pp.put(px, new ArrayList<>());
      }
      pp.get(px).add(code);
    }

    for (Map.Entry<String, String> entry : ump.entrySet()) {
      String name = entry.getKey();
      String code = entry.getValue();
      List<String> cd = pp.get(code);

      if (cd != null) {
        for (String otherCode : cd) {
          if (!otherCode.equals(code)) {
            sp++;
          }
        }
      }
    }

    
    sp /= 2;
    
    System.out.println(sp);
  }
}