import java.util.Arrays;

/**
 * 颜色分类
 */
public class LeetCode75 {
    public static void main(String[] args) {
        int[] nums={2,0,2,1,1,0};
        new LeetCode75().sortColors(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+"\t");
        }
    }

    /**
     * 排序
     */
    public void sortColors(int[] nums) {
        //Arrays.sort(nums);

        //快排,小于1的放左边，大于1的放右边
        int left=0;
        int right=nums.length-1;
        int i=0;
        while(i<=right){
            if(nums[i]<1){
                swap(nums,left,i);
                left++;
                i++;
            } else if(nums[i]>1){
                swap(nums,right,i);
                right--;
            } else
                i++;
        }
    }
    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
