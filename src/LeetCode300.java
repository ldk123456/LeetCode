/**
 * 最长上升子序列
 */
public class LeetCode300 {
    public static void main(String[] args) {
        int[] num={10,9,2,5,3,7,101,18};
        System.out.println(new LeetCode300().lengthOfLIS(num));
    }
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0)
            return 0;
        int[] dp = new int[nums.length];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = 1;
        }
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    if (dp[i] > max)
                        max = dp[i];
                }
            }
        }
        return max;
    }
}
