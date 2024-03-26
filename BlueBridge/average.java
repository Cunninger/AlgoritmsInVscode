
import java.util.*;

public class average {
    static class Node {
        int num;
        int value;

        public Node(int num, int value) {
            this.num = num;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int standard = n/10;
        int []cnt = new int[10];
        Node[]nodes = new Node[n];
        for (int i = 0; i < nodes.length; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            cnt[a]++;
            nodes[i] = new Node(a, b);

        }
        int sum = 0;
        Arrays.sort(nodes,(o1,o2)->(o1.value-o2.value));
        for (int i = 0; i < nodes.length; i++) {
            if (cnt[nodes[i].num]>standard){
                sum+=nodes[i].value;

               cnt[nodes[i].num]--;
            }
        }

        System.out.println(sum);
    }

}
