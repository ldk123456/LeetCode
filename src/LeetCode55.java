/**
 * 跳跃游戏
 */
public class LeetCode55 {
    public static void main(String[] args) {
        int[] num={2,3,1,1,4};
        System.out.println(new LeetCode55().canJump(num));
    }
    /**
     * 采用贪心来做，
     * 设置变量j表示当前所能达到的最远的位置，那么状态转移方程为j = max(j, nums[i] + i)，
     * 括号里的j是上一步的最优解，因此是贪心。当到了某一个点 j<=i 的时候，说明不能再继续往前走了。
     * 如果该点在最后一个点之前，直接return false。
     */
    public boolean canJump(int[] nums) {
        /*if (nums==null||nums.length==0)
            return false;
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            j=Math.max(j, i+nums[i]);
            if (j<=i&&i!=nums.length-1)
                return false;
        }
        return true;*/
        int max=0;
        for (int i = 0; i < nums.length; i++) {
            if (i > max) {
                return false;
            }
            //贪心求解可以到达的最远步数.
            max = Math.max(nums[i] + i, max);
        }
        return true;
    }
}
