/**
 * 单词搜索
 */
public class LeetCode79 {
    public static void main(String[] args) {
        char[][] board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(new LeetCode79().exist(board, "ABCCED"));
        System.out.println(new LeetCode79().exist(board, "SEE"));
        System.out.println(new LeetCode79().exist(board, "ABCB"));
    }
    public boolean exist(char[][] board, String word) {
        if (board==null || board.length==0 || board[0].length==0)
            return false;
        boolean[][] visited=new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j]==word.charAt(0)){
                    if (findWord(board, word, visited, i, j, 0))
                        return true;
                }
            }
        }
        return false;
    }
    public boolean findWord(char[][] board, String word, boolean[][] visited, int x, int y, int index){
        if (x<0||x>=board.length||y<0||y>=board[0].length||visited[x][y]||board[x][y]!=word.charAt(index))
            return false;
        if (index==word.length()-1)
            return true;
        visited[x][y]=true;
        index++;
        boolean ans= findWord(board, word, visited, x-1, y, index)
                || findWord(board, word, visited, x+1, y, index)
                || findWord(board, word, visited, x, y-1, index)
                || findWord(board, word, visited, x, y+1, index);
        visited[x][y]=false;
        return ans;
    }
}
