
import java.util.Arrays;
import java.util.Scanner;

public class minQuestion {
    static class Node {
        int num;
        int index;

        public Node(int i, int n) {
            num = n;
            index = i;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Node[] nodes = new Node[n];
        for (int i = 0; i < nodes.length; i++) {
            int num = in.nextInt();
            nodes[i] = new Node(i, num);
        }
        int[] res = new int[nodes.length];
        Arrays.sort(nodes, (o1, o2) -> (o1.num - o2.num));
        int st = 0;
        int ed = nodes.length - 1;
        int mid = st + ed >> 1;
        for (int i = 0; i < nodes.length; i++) {
            if (nodes[i].num > nodes[mid].num) {
                res[nodes[i].index] = 0;
            } else if (nodes[i].num == nodes[mid].num) {
                res[nodes[i].index] = 0;
            } else {
                res[nodes[i].index] = nodes[mid].num - nodes[i].num+1;

            }
        }
        
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }

    }
}
