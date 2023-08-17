package offer;

/**
 * @program: coding1
 * @description:
 * @author: Bean
 * @create: 2023-08-16 20:40
 **/
public class of12 {
    int m;
    int n;
    int len;
    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        len = word.length();
        int k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, word, i, j,k)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, String word, int i, int j,int k) {
        if (i < 0 || i >= m || j < 0 || j >= n  || board[i][j] != word.charAt(k)) {
            return false;
        }
        if (k == len - 1) {
            return true;
        }
        board[i][j] = '\n';
        boolean flag = dfs(board,word,i,j,k+1) ||
                dfs(board,word,i,j-1,k+1)||
                dfs(board,word,i+1,j,k+1)||
                dfs(board,word,i-1,j,k+1);
        board[i][j] = word.charAt(k);
        return flag;
    }
}
