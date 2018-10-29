
public class LeetCode283 {
    public static void main(String[] args) {
        int[] num=new int[]{0, 1, 0, 2, 3};
        moveZeroes(num);
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
    //移动零
    public static void moveZeroes(int[] nums) {
        int i=0;
        int n=0;
        int l=nums.length;
        while (i<l){
            if(nums[i]!=0){
                nums[n]=nums[i];
                n++;
            }
            i++;
        }
        for(int j=l-1;j>=n;j--){
            nums[j]=0;
        }
    }
}
