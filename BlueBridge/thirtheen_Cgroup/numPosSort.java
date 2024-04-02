package thirtheen_Cgroup;

import java.util.Arrays;
import java.util.Scanner;

public class numPosSort {
    static class Node {
        int sum;
        int num;

        public Node(int s, int n) {
            sum = s;
            num = n;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Node [] nodes = new Node[n+1];
        for (int i = 1; i < nodes.length; i++) {
            int sum = 0;
            String s = String.valueOf(i);
            for (int j = 0; j < s.length(); j++) {
                sum+=s.charAt(j)-'0';
            }
            nodes[i] = new Node(sum, i);
        }
        Arrays.sort(nodes,1,n+1,(o1,o2)->(o1.sum==o2.sum?o1.num-o2.num:o1.sum-o2.sum));
        // for (int i = 1; i <= nodes.length; i++) {
        //     if (i==m+1){
        //         System.out.println(nodes[i].num);
        //         break;
        //     }
        // }
        System.out.println(nodes[m].num);
        

    }

    
}
