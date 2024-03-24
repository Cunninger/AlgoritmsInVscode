package codeThinkingmenu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class subsonUnion {
     List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path =  new LinkedList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtracking(nums,0);
        return result;
    }

    public void backtracking(int []nums,int startIndex){
        result.add(new ArrayList<>(path));
        if (startIndex>=nums.length){
            return;
        }
        for (int i = startIndex;i<nums.length;i++){
            path.add(nums[i]);
            backtracking(nums,i+1);
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        subsonUnion subsonUnion = new subsonUnion();
        int []nums = {1,2,3,4};
        List<List<Integer>> result = subsonUnion.subsets(nums);
        for (var i:result){
            if (i.size()==2)
            System.out.println(i);
        }
    }
}