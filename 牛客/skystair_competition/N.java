package skystair_competition;

import java.util.*;

public class Main {
    static class Edge {
        int to;
        long cost;

        Edge(int to, long cost) {
            this.to = to;
            this.cost = cost;
        }
    }

    static List<List<Edge>> graph;
    static long[] W;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        W = new long[n];
        for (int i = 0; i < n; i++) {
            W[i] = scanner.nextLong();
        }

        graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            graph.get(a).add(new Edge(b, W[b] - W[a]));
            graph.get(b).add(new Edge(a, W[a] - W[b]));
        }

        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            long e = scanner.nextLong();
            if (f(a, b, e, new boolean[n])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean f(int cur, int tar, long eng, boolean[] visited) {
        if (cur == tar) return true;
        if (eng < 0) return false;
        visited[cur] = true;
        
        for (Edge edge : graph.get(cur)) {
            if (!visited[edge.to] && eng + edge.cost >= 0) {
                if (f(edge.to, tar, eng + edge.cost, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
}
