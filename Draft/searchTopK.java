package Draft;
import java.util.Random;
public class searchTopK {

    public static int findKthSmallest(int[] nums, int k) {
        return quickselect(nums, 0, nums.length - 1, k - 1);
    }

    private static int quickselect(int[] nums, int low, int high, int k) {
        if (low == high) {
            return nums[low];
        }

        Random rand = new Random();
        int pivotIndex = rand.nextInt(high - low) + low;
        pivotIndex = partition(nums, low, high, pivotIndex);
        
        if (k == pivotIndex) {
            return nums[k];
        } else if (k < pivotIndex) {
            return quickselect(nums, low, pivotIndex - 1, k);
        } else {
            return quickselect(nums, pivotIndex + 1, high, k);
        }
    }

    private static int partition(int[] nums, int low, int high, int pivotIndex) {
        int pivotValue = nums[pivotIndex];
        swap(nums, pivotIndex, high);
        int storeIndex = low;
        
        for (int i = low; i < high; i++) {
            if (nums[i] < pivotValue) {
                swap(nums, storeIndex, i);
                storeIndex++;
            }
        }
        
        swap(nums, high, storeIndex);
        return storeIndex;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // 测试
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println(findKthSmallest(nums, k));  // 输出：2
        for (int c :nums){
            System.out.println(c);
        }
    }

}
