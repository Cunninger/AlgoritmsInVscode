package algoritmbasic2020;

import java.util.*;

public class Code00_Gragh {

    public class Node {
        public int value;
        public int in;
        public int out;
        public ArrayList<Node> nexts;
        public ArrayList<Edge> edges;

        public Node(int v) {
            value = v;
            in = 0;
            out = 0;
            nexts = new ArrayList<>();
            edges = new ArrayList<>();
        }
    }

    public class Edge {
        public int weight;
        public Node from;
        public Node to;

        public Edge(int w, Node f, Node t) {
            weight = w;
            from = f;
            to = t;

        }
    }

    public class Gragh {
        public HashMap<Integer, Node> nodes;
        public HashSet<Edge> edges;

        public Gragh() {
            nodes = new HashMap<>();
            edges = new HashSet<>();
        }
    }

    public Gragh createGragh(Integer[][] matrix) {
        Gragh gragh = new Gragh();
        // [ _ _ _ ] 权值，fromNode ，toNode
        for (var m : matrix) {
            Integer weight = m[0];
            Integer from = m[1];
            Integer to = m[2];

            if (gragh.nodes.containsKey(from)) {
                gragh.nodes.put(from, new Node(from));

            }
            if (gragh.nodes.containsKey(to)) {
                gragh.nodes.put(to, new Node(to));
            }
            Node fromNode = gragh.nodes.get(from);
            Node toNode = gragh.nodes.get(to);

            Edge edge = new Edge(weight, fromNode, toNode);
            fromNode.nexts.add(toNode);
            fromNode.out++;
            toNode.in++;
            fromNode.edges.add(edge);

            gragh.edges.add(edge);

        }
        return gragh;
    }

    public void bfs(Node node) {
        Queue<Node> queue = new LinkedList<>();
        HashSet<Node> set = new HashSet<>();
        queue.add(node);
        set.add(node);
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            System.out.println(cur.value);
            for (var i : cur.nexts) {
                if (!set.contains(i)) {
                    set.add(i);
                    queue.add(i);
                }
            }
        }

    }

    public void dfs(Node node) {
        Stack<Node> stack = new Stack<>();
        HashSet<Node> set = new HashSet<>();

        stack.push(node);
        set.add(node);
        System.out.println(node.value);
        while (!stack.isEmpty()) {
            Node cur = stack.pop();
            for (var i : cur.nexts) {
                if (!set.contains(i)) {
                    set.add(i);
                    stack.push(cur);
                    stack.add(i);
                    System.out.println(i.value);
                    break;

                }

            }
        }
    }

    public List<Integer> TopuSort(Gragh gragh){
        List<Integer> ans = new ArrayList<>();
        HashMap<Node,Integer> inMap = new HashMap<>();
        Queue<Node> zeroInqueue = new LinkedList<>();


        for (var node :gragh.nodes.values()){
            inMap.put(node, node.in);
            if (node.in ==0){
                zeroInqueue.add(node);
            }
        }

        while (!zeroInqueue.isEmpty()){
            Node node = zeroInqueue.poll();
            ans.add(node.value);
            for (var i:node.nexts){
                inMap.put(i, inMap.get(i)-1);
                if (inMap.get(i)==0){
                    zeroInqueue.add(i);
                }
            }
        }
        return ans;

    }

}
