package thirtheen_Cgroup;
import java.util.Arrays;
import java.util.Scanner;
public class sortCharacter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[]str = in.nextLine().toCharArray();
        Arrays.sort(str);

        System.out.println(new String(str));
    }
}
