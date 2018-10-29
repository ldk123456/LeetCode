/**
 * 在排序数组中查找元素的第一个和最后一个位置
 */
public class LeetCode34 {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int[] res=new LeetCode34().searchRange(nums, 8);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = findFirst(nums, target);
        arr[1] = findLast(nums, target);
        return arr;
    }

    public int findFirst(int[] nums, int target){
        int idx = -1;
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] < target){
                low = mid + 1;
            } else{
                high = mid - 1;
            }
            if(nums[mid] == target){
                idx =  mid;
            }
        }
        return idx;
    }

    public int findLast(int[] nums, int target){
        int idx = -1;
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] > target){
                high = mid - 1;
            } else{
                low = mid + 1;
            }
            if(nums[mid] == target){
                idx = mid;
            }
        }
        return idx;
    }
}
