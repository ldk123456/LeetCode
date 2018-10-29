import java.util.ArrayList;
import java.util.List;

public class LeetCode384 {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        Solution obj = new Solution(nums);
        int[] param_2 = obj.shuffle();
        for (int i = 0; i < param_2.length; i++) {
            System.out.print(param_2[i]);
        }
        int[] param_1 = obj.reset();
        System.out.println();
        for (int i = 0; i < param_1.length; i++) {
            System.out.print(param_1[i]);
        }
    }
}
//打乱数组
class Solution {

    //存储数组的所有排列
    List<int[]> list = new ArrayList<int[]>();

    public Solution(int[] nums) {
        //首先求所有排列
        permutations(nums,list,0);
    }

    /** 将阵列重置为其原始配置并将其返回 */
    public int[] reset() {
        return list.get(0);
    }

    /** 返回随机打乱的数组 */
    public int[] shuffle() {
        int index = (int)(Math.random() * list.size());
        return list.get(index);
    }

    //求数组的所有排列
    public void permutations(int[] array,List<int[]> list,int start){
        if(array == null){
            return;
        }
        if(start == array.length){
            int[] temp = new int[array.length];
            System.arraycopy(array,0,temp,0,array.length);
            list.add(temp);
        }
        for(int i = start; i < array.length; ++i){
            swap(array,i,start);
            permutations(array,list,start+1);
            swap(array,i,start);
        }
    }
    //交换元素
    public void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
