/**
 * 生命游戏
 */
public class LeetCode289 {
    public static void main(String[] args) {
        int[][] board={{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        new LeetCode289().gameOfLife(board);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]+"\t");
            }
            System.out.println();
        }
    }

    /**
     * 如果判断这一次更新后，该细胞死亡，则令其值为 2
     * 如果判断这一次更新后，该细胞复活，则令其值为-1
     * 判断周围活细胞个数的条件，判定细胞是否变换状态
     * 全部遍历判断死活后，最后，再次遍历，另 2->0，-1->1，即生成新复活的活细胞，和新死亡的死亡细胞
     */
    public void gameOfLife(int[][] board) {
        if(board.length<=0){
            return ;
        }
        //遍历判断死活
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                liveOrDie(board,i,j);
            }
        }
        //对新复活或者新死亡的细胞，恢复其 1/0 值
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == -1){
                    board[i][j] = 1;
                }else if(board[i][j] == 2){
                    board[i][j] = 0;
                }
            }
        }
    }
    //判断该细胞的死活
    private void liveOrDie(int [][] board,int cenX,int cenY){
        //周围活细胞的个数
        int alive = 0;
        //遍历3*3的正方形细胞
        for(int i = cenX-1;i<=cenX+1;i++){
            for(int j=cenY-1;j<=cenY+1;j++){
                //排除 越界以及本身
                if((i==cenX && j==cenY)||(i<0||i>=board.length)||(j<0||j>=board[0].length)){
                    continue;
                }
                if(board[i][j]>0){
                    //用 2表示 这一轮新死亡的
                    alive ++;
                }
            }
        }
        //死细胞是否复活
        if(board[cenX][cenY] == 0){
            if(alive == 3){
                board[cenX][cenY] = -1; // -1 新复活的,为了不影响其他细胞的判断
            }
        }else{
            //活细胞是否死亡
            if(alive < 2 || alive> 3){
                board[cenX][cenY] = 2; // 2 新死亡的,为了不影响其他细胞的判断
            }
        }
    }
}
