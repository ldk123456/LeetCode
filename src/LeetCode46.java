import java.util.ArrayList;
import java.util.List;

/**
 * 全排列
 */
public class LeetCode46 {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(new LeetCode46().permute(nums));
    }
    List<List<Integer>> result = null;
    public void dfs(int[] nums, int start, List<Integer> list){
        if (start == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0;i<nums.length;i++){
            if (!list.contains(nums[i])) {//每次添加一个不同的数，然后求解这个数后面的全排列，进而递归到最后一个数
                list.add(nums[i]);
                dfs(nums, start + 1, list);
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {

        if (nums == null || nums.length == 0)  return result;

        result = new ArrayList<>();

        dfs(nums,0,new ArrayList<>());

        return result;
    }
}
