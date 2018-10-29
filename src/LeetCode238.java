public class LeetCode238 {
    public static void main(String[] args) {
        int[] num={1,2,3,4};
        num=productExceptSelf(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+"\t");
        }
    }
    //除自身以外数组的乘积
    public static int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] result = new int[l];
        result[0] = 1;
        for (int i = 1; i < l; i++) {
            result[i] = result[i-1] * nums[i-1];
        }
        int right = 1;
        for (int i = l -1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }
        return result;
    }
}
