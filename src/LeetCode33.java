/**
 * 搜索旋转排序数组
 */
public class LeetCode33 {
    public static void main(String[] args) {
        int[] num={4,5,6,7,0,1,2};
        System.out.println(new LeetCode33().search(num, 0));
    }
    public int search(int[] nums, int target) {
        /**
         * 实际上就是两个递增序列，依旧是二分法
         * 只不过只在递增序列中二分
         */

        if (nums==null||nums.length==0)
            return -1;
        int left=0;
        int right=nums.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if (nums[mid]==target)
                return mid;
            if (nums[mid]>=nums[left]){
                if (target<nums[mid]&&target>=nums[left]){
                    right=mid-1;
                }else {
                    left=mid+1;
                }
            }else {
                if (target>nums[mid]&&target<=nums[right]){
                    left=mid+1;
                }else {
                    right=mid-1;
                }
            }
        }
        return -1;
        /*int left=0;
        int right = nums.length-1;
        while(left <= right){
            int mid = left + (right -left)/2;
            if(nums[mid] == target)
                return true;
            if(nums[mid] > nums[left]){
                if(nums[left] <= target && target < nums[mid]){
                    right = mid-1;
                }else{
                    left = mid +1;
                }
            }else if (nums[mid] < nums[left]){
                if(nums[mid] <= target && target <= nums[right])
                {
                    left = mid +1;
                }else{
                    right = mid -1;
                }
            }else{
                left++; //重复就右移，直到找到不重复的

            }
        }
        return false;*/
    }
}
