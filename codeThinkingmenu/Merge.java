package codeThinkingmenu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Merge {
            List<List<Integer>> result = new ArrayList<>();
            LinkedList<Integer> path = new LinkedList<>();
            public List<List<Integer>> Arrange(int m, int k) {
            backtracking(m,k,1);
            return result;
        }

        public  void backtracking(int m,int k,int startIndex){
            if (path.size()==k){
                result.add(new ArrayList<>(path));
                return;
            }

            for (int i = startIndex;i<=m;i++){
                path.add(i);
                backtracking(m, k, i+1);

                path.removeLast();
            }
        }

        public static void main(String[] args) {
            Merge merge = new Merge();
            List<List<Integer>> result = merge.Arrange(4,2);
            for (var i:result){
                System.out.println(i);
            }


        }
}
