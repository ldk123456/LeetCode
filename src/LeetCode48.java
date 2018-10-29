
public class LeetCode48 {
    public static void main(String[] args) {
        int[][] nums=new int[][]{
                {1,2,3},{4,5,6},{7,8,9}
        };
        rotate(nums);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
    //旋转图像
    public static void rotate(int[][] matrix) {
        int l=matrix.length;
        int[][] result=new int[l][l];
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                result[i][j]=matrix[l-j-1][i];
            }
        }
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                matrix[i][j]=result[i][j];
            }
        }
    }
}
