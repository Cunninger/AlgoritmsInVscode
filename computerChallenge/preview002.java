package computerChallenge;

// 大致题意：
// 给出若干数字，求排列成字符串所对应数值的最大值。

import java.util.Arrays;
import java.util.Comparator;

public class preview002 {
    public static void main(String[] args) {
        Integer[] nums = {9, 21, 22, 91, 23};
        System.out.println(largestNumber(nums));
    }

    public static String largestNumber(Integer[] nums) {
        // 转换为字符串数组
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }

        // 使用自定义的比较器进行排序
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return s2.compareTo(s1); // 降序排列
            }
        });

        // 如果排序后的第一个元素是0，那么结果就是0
        if (strs[0].equals("0")) {
            return "0";
        }

        // 将排序后的字符串连接成一个字符串
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s);
        }
        return sb.toString();
    }
}

