import java.util.*;
// review 01 2024/4/6
public class sevenCode {
    static int n = 7;
    static int MAXN =10; 
    static int[] father = new int[MAXN];
    static int[][] f = new int[MAXN][MAXN];
    static int[] stack = new int[MAXN];
    static int[] path = new int[MAXN];
    static int cnt = 0;

    static int find(int x) {
        int size = 0;
        while (father[x] != x) {
            stack[size++] = x;
            x = father[x];

        }
        while (size > 0) {
            father[stack[--size]] = x;
        }
        return x;
    }

    static void dfs(int u, int p, int m) {
        if (u == m) {
            for (int i = 1; i < MAXN; i++) {
                father[i] = i;
            }

            for (int i = 0; i < m; i++) {
                for (int j = i + 1; j < m; j++) {
                    if (f[path[i]][path[j]] == 1) {
                        father[find(path[i])] = find(father[path[j]]);
                    }
                }
            }

            boolean flag = false;
            for (int i = 0; i < m - 1; i++) {

                if (find(path[i]) != find(path[i + 1])) {
                    flag = true;
                    break;

                }
            }
            // heLlo
            if (!flag) {
                cnt++;
            }

            return;
        }

        for (int i = p; i <= n; i++) {
            path[u] = i;
            dfs(u + 1, i + 1, m);

        }

    }

    public static void main(String[] args) {
        for (int[] a : f) {
            Arrays.fill(a, 0);
        }
        f[1][2] = f[2][1] = 1;
        f[2][7] = f[7][2] = 1;
        f[2][3] = f[3][2] = 1;
        f[3][7] = f[7][3] = 1;
        f[3][4] = f[4][3] = 1;
        f[4][5] = f[5][4] = 1;
        f[5][6] = f[6][5] = 1;
        f[5][7] = f[7][5] = 1;
        f[6][7] = f[7][6] = 1;
        f[1][6] = f[6][1] = 1;

        for (int i = 1; i <= n; i++) {
            dfs(0, 1, i);
        }
        System.out.println(cnt);

    }
}