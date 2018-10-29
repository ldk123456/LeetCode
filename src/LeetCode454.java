import java.util.HashMap;
import java.util.Map;

/**
 * 四数相加 II
 */
public class LeetCode454 {
    public static void main(String[] args) {
        int[] a={1 ,2};
        int[] b={-2, -1};
        int[] c={-1, 2};
        int[] d={0, 2};
        System.out.println(new LeetCode454().fourSumCount(a, b, c, d));
    }

    /**
     * HashMap存前两个数组能组成的数字及其组成的次数，再遍历后两个数组，
     * 查看HashMap中是否存在两数和的相反数，如果存在，则记录出现次数，累加即为结果。
     */
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int len=A.length;
        if (len==0)
            return 0;
        Map<Integer, Integer> map=new HashMap<>();
        int count=0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                int t=A[i]+B[j];
                if (map.containsKey(t)){
                    int n=map.get(t)+1;
                    map.put(t, n);
                }else {
                    map.put(t, 1);
                }
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                int t=-(C[i]+D[j]);
                if (map.containsKey(t)){
                    count+=map.get(t);
                }
            }
        }
        return count;
    }
}
