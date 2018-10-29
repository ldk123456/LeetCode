import java.util.ArrayList;
import java.util.List;

/**
 * 子集
 */
public class LeetCode78 {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(new LeetCode78().subsets(nums));
    }

    /**
     * 本解法采用回溯算法实现
     *
     * ① 外层循环逐一往中间集合 temp 中加入元素 nums[i]，使这个元素处于存在状态
     * ② 开始递归，递归中携带加入新元素的 temp，并且下一次循环的起始是 i 元素的下一个，
     *   因而递归中更新 i 值为 i + 1
     * ③ 将这个从中间集合 temp 中移除，使该元素处于不存在状态
     */
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();

        List<Integer> single = new ArrayList<>();

        //标记数组
        boolean[] a = new boolean[nums.length];
        digui(list,single,nums,a,0);
        return list;
    }
    public static void digui(List<List<Integer>> list,List<Integer> single,int[] nums,boolean[] a,int n) {
        if (n == nums.length) {
            //把标记为取了的元素放进single队列里
            for (int i = 0; i < a.length; i++) {
                if (a[i]) {
                    single.add(nums[i]);
                }
            }
            //注意一定要new一个，不然只是复制一个引用
            list.add(new ArrayList<>(single));
            //清空队列
            single.removeAll(single);
            return;
        }
        else {
            //取n的情况，准备看下一个
            a[n] = false;
            digui(list, single, nums, a, n+1);
            //不取n的情况，看下一个
            a[n] =true;
            digui(list, single, nums, a, n+1);
        }
    }

    /*public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list1 = new ArrayList<>();
        list1.add(new ArrayList<>());
        for(int num:nums){
            int size=list1.size(); //必须定义在内循环前
            for(int j=0;j<size;j++){
                List<Integer> temp = new ArrayList<>(list1.get(j));
                temp.add(num);
                list1.add(temp);
            }
        }
        return list1;
    }*/

}
