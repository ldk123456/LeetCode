/**
 * 盛最多水的容器
 */
public class LeetCode11 {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println(new LeetCode11().maxArea(height));
    }
    public int maxArea(int[] height) {
        /**
         * 暴力求解
         * 求任意两个高度之间的容量，然后取最大值
         */
        /*int len=height.length;
        if (len <= 1)
            return 0;
        int area=0;
        for (int i = 0; i <len-1 ; i++) {
            for (int j = i+1; j < len; j++) {
                int t=(j-i)*Math.min(height[i], height[j]);
                if (t>area)
                    area=t;
            }
        }
        return area;*/
        /**
         * 1.定义两个指针，left和right，初始时，指向首部和尾部；
         * 2.计算两个指针之间的面积area1 = min(height[left]，height[right])*(right-left)；
         * 3.maxArea = Max(maxArea,area1);
         * 4.height[left]和height[right]，谁小谁往里面走；
         */
        int len=height.length;
        if (len <= 1)
            return 0;
        int area=0;
        int left=0, right=len-1;
        while (left<right){
            int h=Math.min(height[left], height[right]);
            area=Math.max(area, h*(right-left));
            if (height[left]<height[right])
                left++;
            else
                right--;
        }
        return area;
    }
}
