import java.util.*;

/**
 * 前K个高频元素
 */
public class LeetCode347 {
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3};
        System.out.println(new LeetCode347().topKFrequent(nums, 2));
    }
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length+1];
        Map<Integer , Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n , map.getOrDefault(n , 0) + 1);
        }
        for(int key : map.keySet()){
            int frequency = map.get(key);
            if(bucket[frequency] == null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        List<Integer> res = new ArrayList<>();
        for(int i = bucket.length-1 ; i >= 0 && res.size() < k ; i--){
            if(bucket[i] != null){
                res.addAll(bucket[i]);
            }
        }
        return res;
    }
}
