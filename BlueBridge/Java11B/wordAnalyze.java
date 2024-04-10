package Java11B;

import java.util.Arrays;
import java.util.Scanner;

public class wordAnalyze {
    static class Node {
        char c;
        int cnt;

        public Node() {

        }

        public Node(char cc, int t) {
            c = cc;
            cnt = t;

        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] str = s.toCharArray();
        Node[] nodes = new Node[26];
        for (int i = 0;i<nodes.length;i++){
            nodes[i] = new Node();
        }
        for (int i = 0; i < str.length; i++) {
            char ac = str[i];
            nodes[ac - 'a'].c = ac;
            nodes[ac - 'a'].cnt++;
        }
        Arrays.sort(nodes,(o1,o2)->o2.cnt!=o1.cnt?o2.cnt-o1.cnt:o1.c-o2.c);

        System.out.println(nodes[0].c);
        System.out.println(nodes[0].cnt);





    }
}
