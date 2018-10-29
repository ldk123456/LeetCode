
public class LeetCode36 {
    public static void main(String[] args) {
        char[][] nums=new char[][]{
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(isValidSudoku(nums));
    }
    //有效的数独
    public static boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            int[] row=new int[9];
            int[] col=new int[9];
            int[] cude=new int[9];
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(row[board[i][j]-'1']==1){
                        return false;
                    }else {
                        row[board[i][j]-'1']=1;
                    }
                }
                if(board[j][i]!='.'){
                    if(col[board[j][i]-'1']==1){
                        return false;
                    }else {
                        col[board[j][i]-'1']=1;
                    }
                }
                int rowIndex=3*(i/3)+j/3;
                int colIndex=3*(i%3)+j%3;
                if(board[rowIndex][colIndex]!='.'){
                    if (cude[board[rowIndex][colIndex]-'1']==1){
                        return false;
                    }else {
                        cude[board[rowIndex][colIndex]-'1']=1;
                    }
                }
            }
        }
        return true;
    }
}
