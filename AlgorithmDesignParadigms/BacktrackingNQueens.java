import java.util.List;
import java.util.ArrayList;
public class BacktrackingNQueens {
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) board[i][j] = '.';
        }
        backtrack(res, board, 0, n);
        return res;
    }
    private static void backtrack(List<List<String>> res, char[][] board, int col, int n) {
        if (col == n) {
            res.add(construct(board));
            return;
        }
        for (int row = 0; row < n; row++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 'Q';
                backtrack(res, board, col + 1, n);
                board[row][col] = '.';
            }
        }
    }
    private static boolean isSafe(char[][] board, int row, int col, int n) {
        for (int i = 0; i < col; i++) if (board[row][i] == 'Q') return false;
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) if (board[i][j] == 'Q') return false;
        for (int i = row, j = col; i < n && j >= 0; i++, j--) if (board[i][j] == 'Q') return false;
        return true;
    }
    private static List<String> construct(char[][] board) {
        List<String> list = new ArrayList<>();
        for (char[] row : board) list.add(new String(row));
        return list;
    }
    public static void main(String[] args) {
        System.out.println("NQueens 4 Solutions Count: " + solveNQueens(4).size());
    }
}
