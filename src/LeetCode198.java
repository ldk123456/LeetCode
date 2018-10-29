public class LeetCode198 {
    public static void main(String[] args) {
        int[] nums={2,7,9,3,1};
        System.out.println(rob(nums));
    }
    //打家劫舍
    public static int rob(int[] nums) {
        if (nums==null||nums.length<1)
            return 0;
        int n=nums.length;
        if (n==1)
            return nums[0];
        if (n==2)
            return Math.max(nums[0], nums[1]);
        int f_n=0;
        int f_n_1=Math.max(nums[0], nums[1]);
        int f_n_2=nums[0];
        int i=2;
        while (i<n){
            f_n=Math.max(f_n_1, f_n_2+nums[i]);
            f_n_2=f_n_1;
            f_n_1=f_n;
            i++;
        }
        return f_n;
    }
}
