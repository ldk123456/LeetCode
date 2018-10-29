import java.util.Arrays;

/**
 * 数组中的第K个最大元素
 */
public class LeetCode215 {
    public static void main(String[] args) {
        int[] nums={3,2,1,5,6,4};
        System.out.println(new LeetCode215().findKthLargest(nums, 2));
    }
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
