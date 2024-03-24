package leetcode_daily;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class collectMoneyInTree2603 {
   
        public int collectTheCoins(int[] coins, int[][] edges) {
            int n = coins.length;
            List<Integer> []g = new ArrayList[n];
            Arrays.setAll(g, e -> new ArrayList<>());
            // 接收一个整型参数e,返回一个ArrayList对象
            // 初始化一个二维数组g,每个元素都是一个空的ArrayList对象。
            // 这个二维数组，可以用来表示一棵树的邻接表，其中每一个节点的邻居都存储在对应的ArrayList中。
            // 比如说： g[0] = [1,2,3]，表示节点0的邻居有1,2,3。

            int[] deg = new int[n];
            // deg[i]表示节点i的度数，即有多少个邻居


            for (var e:edges){
                int u = e[0], v = e[1];
                g[u].add(v);
                g[v].add(u);
                deg[u]++;
                deg[v]++;
            }// 遍历edges数组，将每条边的两个节点加入对方的邻居列表中，同时将两个节点的度数都加1

            int leftEdges = n-1;

            // 拓扑排序 去掉没有金币的子树

            var q = new ArrayDeque<Integer>();

            for (int i = 0;i<n;i++){
                if (deg[i]==1 && coins[i]==0){
                    q.add(i);
                }
            }// 将所有度数为1且没有金币的节点加入队列中

            while (!q.isEmpty()){
                leftEdges--;
                for (int y:g[q.poll()]){
                    // 在遍历刚刚从队列中取出的节点的所有邻居。对于每一个邻居 y
                    if (--deg[y]==1 && coins[y]==0){
                        // 经过-1后的操作，如果 y 的度数变为1，且没有金币，加入队列，在下一轮处理它
                        q.add(y);
                    }
                }

            }

            // 再次拓扑排序 

            for (int i =0;i<n;i++){
                if (deg[i]==1 && coins[i]==1){
                    q.add(i);
                }
            }// 去掉没有金币的子树，剩下的节点中，度数为1 且 有金币的节点
            

            leftEdges -= q.size(); // 去掉这些节点后，剩下的边数

            for (int x:q){
                // q是什么？ q是一个队列，里面存储的是度数为1且有金币的节点
                for (int y:g[x]){
                    // g[x] 是什么？ g[x]是一个ArrayList，里面存储的是节点x的邻居
                    if (--deg[y]==1){
                        leftEdges--;
                    }
                }
            }
           
        // 计算去掉 没有金币的子树 和 度数为1且有金币的节点后，剩下的边数
                    return Math.max(leftEdges*2,0);

        } 


        public static void main(String[] args) {
            int[] coins = {0,0,0,1,1,0,0,1};
            int[][] edges = {{0,1},{0,2},{1,3},{1,4},{2,5},{5,6},{5,7}};
            collectMoneyInTree2603 c = new collectMoneyInTree2603();
            System.out.println(c.collectTheCoins(coins, edges));// 答案是 2
        }
        
    }

