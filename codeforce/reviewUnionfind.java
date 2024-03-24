package codeforce;

import java.util.*;

public class reviewUnionfind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] p = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                p[i] = sc.nextInt();
            }

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(i + 1);
            }

            UnionFind uf = new UnionFind(list);
            for (int i = 1; i <= n; i++) {
                uf.union(i, p[i]);
            }
            for (int i = 1; i <= n; i++) {
                System.out.print(uf.size.get(uf.find(i)) + " ");
            }
            System.out.println();
        }
    }

    static class UnionFind {
        static HashMap<Integer, Integer> parent;
        static HashMap<Integer, Integer> size;

        public UnionFind(List<Integer> list) {
            parent = new HashMap<>();
            size = new HashMap<>();
            for (Integer i : list) {
                parent.put(i, i);
                size.put(i, 1);
            }
        }

        // isSameUnion
        public static boolean isSameUnion(int x, int y) {
            return find(x) == find(y);
        }

        // find
        public static Integer find(int x) {
            Stack<Integer> stack = new Stack<>();
            while (parent.get(x) != x) {
                stack.push(x);
                x = parent.get(x);
            }

            while (!stack.isEmpty()) {
                parent.put(stack.pop(), x);
            }
            return x;
        }

        // union

        public static void union(int x, int y) {
            Integer xRoot = find(x);
            Integer yRoot = find(y);
            if (xRoot.equals(yRoot))
                return;
            if (size.get(xRoot) < size.get(yRoot)) {
                parent.put(xRoot, yRoot);
                size.put(yRoot, size.get(yRoot) + size.get(xRoot));
            } else {
                parent.put(yRoot, xRoot);
                size.put(xRoot, size.get(xRoot) + size.get(yRoot));
            }

        }

    }
}
