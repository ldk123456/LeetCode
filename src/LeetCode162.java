/**
 * 寻找峰值
 */
public class LeetCode162 {
    public static void main(String[] args) {
        int[] nums={1,2,1,3,5,6,4};
        System.out.println(new LeetCode162().findPeakElement(nums));
    }
    public int findPeakElement(int[] nums) {
        //全局扫描
        /*if (nums == null || nums.length==0)
            return -1;
        if (nums.length==1)
            return 0;
        if (nums[0] > nums[1])
            return 0;
        if (nums[nums.length-2] < nums[nums.length-1])
            return nums.length-1;
        for(int i=1; i<nums.length-1; i++) {
            if (nums[i-1] < nums[i] && nums[i] > nums[i+1])
                return i;
        }
        return -1;*/

        //二分查找
        int left = 0 , right = nums.length - 1;
        while (left <= right){
            if(left == right)
                return left;
            int mid = left + (right - left) / 2;
            if(nums[mid] < nums[mid + 1]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return -1;
    }
}
