/**
 * 搜索二维矩阵 II
 */
public class LeetCode240 {
    public static void main(String[] args) {
        int[][] matrix= {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        System.out.println(new LeetCode240().searchMatrix(matrix, 5));
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix==null||matrix.length==0||matrix[0].length==0)
            return false;
        int top=0, right=matrix[0].length-1;
        while (top<=matrix.length-1&&right>=0){
            int t=matrix[top][right];
            if (t==target){
                return true;
            }else if (t>target){
                right--;
            }else {
                top++;
            }
        }
        return false;
    }
}
