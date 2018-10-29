/**
 * 递增的三元子序列
 */
public class LeetCode334 {
    public static void main(String[] args) {
        int[] nums={2,4,-2,-3};
        System.out.println(new LeetCode334().increasingTriplet(nums));
    }

    /**
     * 维护一个二元组(first,second)，记录第i个元素之前的“最小”递增二元子序列
     * （对后续元素的要求最低如[5,6,2,3,4]会更新[5,6]为[2,3]此时只要后续满足大于3就可以）
     *
     * 当nums[i]小于first时，更新first的值
     * 当nums[i]>first且nums[i]<second时，更新second的值
     */
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3){
            return false;
        }
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int num : nums){
            if (num<first){
                first=num;
            }else if (num>first && num<second){
                second=num;
            }else if (num>second) {
                return true;
            }
        }
        return false;
    }
}
