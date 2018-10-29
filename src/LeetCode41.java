
import java.util.HashMap;
import java.util.Map;

/**
 * 第一个缺失的正数
 */
public class LeetCode41 {
    public static void main(String[] args) {
        int[] nums={3,4,-1,1};
        System.out.println(new LeetCode41().firstMissingPositive(nums));
    }
    public int firstMissingPositive(int[] nums) {
        /**
         * 使用HashMap记录出现过的正整数
         * 从1开始检查是否出现过
         */
        /*Map<Integer ,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int i=1;
        while (true){
            if (map.containsKey(i)){
                i++;
                continue;
            }else {
                break;
            }
        }
        return i;*/

        /**
         * 令数字i出现在下标为i-1的位置，如果会越界则不做处理
         */
        if(nums==null || nums.length==0)
            return 1;

        for(int i=0;i<nums.length;){
            if(nums[i]>0&&nums[i]<=nums.length&&nums[i]!=nums[nums[i]-1]){
                //确定nums[i]的值对应的下标不越界，
                //同时排除num[i]本身位置正确或者nums[i]应该放入的位置nums[i]-1原本就是nums[i](如[1,1])
                int index = nums[i];//
                nums[i] = nums[index -1];
                nums[index -1]=index;
                //换位置之后需要继续判断换过来的值是否在对的位置上，因此不能i++;
            }else{
                i++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }
}
