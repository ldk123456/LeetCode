
public class LeetCode268 {
    public static void main(String[] args) {
        int[] num={9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(num));
    }
    //缺失数字
    public static int missingNumber(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return nums.length * (nums.length + 1) / 2 - sum;
    }
}
