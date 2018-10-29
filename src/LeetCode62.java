/**
 * 不同路径
 */
public class LeetCode62 {
    public static void main(String[] args) {
        System.out.println(new LeetCode62().uniquePaths(7, 3));
    }

    /**
     * 机器人只能向下或向右走，那么，说明：对于当前位置，机器人最多只有两条来的路：
     * 从左边来，或者从上边来。那么到当前位置的路线数就是从左边来的路数与从上面来的路数之和。
     * 它的动态规划方程就是：arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
     */
    public int uniquePaths(int m, int n) {
        int[][] paths=new int[m][n];
        paths[0][0]=1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 && j==0){
                    continue;
                }else if (i==0){
                    paths[i][j]=paths[i][j-1];
                }else if (j==0){
                    paths[i][j]=paths[i-1][j];
                }else {
                    paths[i][j]=paths[i-1][j]+paths[i][j-1];
                }
            }
        }
        return paths[m-1][n-1];
    }
}
