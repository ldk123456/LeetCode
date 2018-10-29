
import java.util.HashMap;
import java.util.Map;

public class LeetCode1 {
    public static void main(String[] args) {
        int[] nums=new int[]{2,7,11,15};
        int target=9;
        int[] twoSum=twoSum(nums, target);
        for (int i=0;i<twoSum.length;i++){
            System.out.print(twoSum[i]+" ");
        }
    }
    //两数之和
    public static int[] twoSum(int[] nums, int target) {
        int result[]=new int[2];
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], i);
        }
        for (int i=0;i<nums.length;i++){
            int v=target-nums[i];
            if(map.containsKey(v)&&map.get(v)!=i){
                result[0]=i;
                result[1]=map.get(v);
                return result;
            }
        }
        return result;
    }
}
