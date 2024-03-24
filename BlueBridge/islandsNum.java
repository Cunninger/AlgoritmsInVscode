import java.util.*;

public class islandsNum {
    static int[] dx = { 0, 0, -1, 1 };
    static int[] dy = { 1, -1, 0, 0 };
    static int n, m;

    static char[][] g;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        while (q-- > 0) {
            int cnt = 0;
            int r = in.nextInt();
            int c = in.nextInt();
            char[][] grid = new char[r][c];
            for (int i = 0; i < grid.length; i++) {
                grid[i] = in.next().toCharArray();
            }
            boolean[][] Visit = new boolean[r][c];
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (!Visit[i][j] && grid[i][j] == '1') {
                        Deque<int[]> queue = bfs(grid, Visit, i, j);
                        if (dfs(queue))
                            cnt++;
                    }
                }
            }
            System.out.println(cnt);

        }

    }

    public static Deque<int[]> bfs(char[][] grid, boolean[][] Visit, int x, int y) {
        Deque<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] { x, y });
        Visit[x][y] = true;
        while (!queue.isEmpty()) {
            int[] me = queue.poll();
            for (int i = 0; i < 4; i++) {
                int fx = me[0] + dx[i];
                int fy = me[1] + dy[i];
                if (fx < 0 || fy < 0 || fx >= n || fy >= m)
                    continue;
                if (!Visit[fx][fy] && grid[fx][fy] == '1') {
                    queue.offer(new int[] { fx, fy });
                    Visit[fx][fy] = true;
                }
            }
        }
        return queue;

    }

    public static boolean dfs(Deque<int[]> queue) {

        while (!queue.isEmpty()) {
            int[] mm = queue.poll();
            int x = mm[0];
            int y = mm[1];
            for (int i = -1; i < 1; i++) {
                for (int j = -1; j < 1; j++) {
                    int fx = x + i;
                    int fy = y + j;
                    if (fx <= 0 || fy <= 0 || fx >= n || fy >= m)
                        return true;
                    dfs(queue);
                }
            }

        }
        return false;
    }
}
