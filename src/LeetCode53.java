public class LeetCode53 {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    //最大子序和
    public static int maxSubArray(int[] nums) {
        if(nums.length==0||nums==null)
            return 0;

        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum<0)
                sum=nums[i];
            else
                sum+=nums[i];
            if(sum>max)
                max=sum;
        }
        return max;
    }
}
