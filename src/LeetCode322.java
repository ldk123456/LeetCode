
/**
 * 零钱兑换
 */
public class LeetCode322 {
    public static void main(String[] args) {
        int[] coins={1,2,5};
        int amount=13           ;
        System.out.println(new LeetCode322().coinChange(coins, amount));
    }

    /**
     * 对于任意数额，它最后一次加硬币只可能有coins.length种情况。
     * 用dp[i]表示凑到金额i所需的最小硬币个数，很容易得到转移方程：
     *        dp[i] = min(dp[i], dp[i-coins[j]]+1)；
     */
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        for (int i = 1; i < amount+1; i++) {
            dp[i]=Integer.MAX_VALUE-1;
        }
        for (int coin : coins){
            for (int i = coin; i <= amount; i++) {
                dp[i]=Math.min(dp[i], dp[i-coin]+1);
            }
        }
        if (dp[amount] == Integer.MAX_VALUE-1){
            return -1;
        }else {
            return dp[amount];
        }
    }
}
