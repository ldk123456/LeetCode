public class LeetCode121 {
    public static void main(String[] args) {
        int[] prices={9,7,10,1,5};
        System.out.println(maxProfit(prices));
    }
    //买卖股票的最佳时机
    public static int maxProfit(int[] prices) {

        if(prices==null||prices.length==0){
            return 0;
        }

        int min = prices[0];
        int result = 0;

        for(int i=1;i<prices.length;i++) {
            if(prices[i] < min ){
                min =prices[i];
            }else if(prices[i] - min > result){
                result = prices[i] - min ;
            }
        }
        return result;
    }
}
