class EightQueensPuzzle {
    static final int N = 8;

    public static void main(String[] args) {
        int[][] board = new int[N][N];
        if (!solveNQueens(board, 0))
            System.out.println("No solution found");
    }

    static boolean solveNQueens(int[][] board, int col) {
        if (col == N) {
            for (int[] row : board)
                System.out.println(java.util.Arrays.toString(row));
            System.out.println();
            return true;
        }
        for (int i = 0; i < N; i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 1;
                if (solveNQueens(board, col + 1))
                    return true;
                board[i][col] = 0;
            }
        }
        return false;
    }

    static boolean isSafe(int[][] board, int row, int col) {
        for (int x = 0; x < col; x++)
            if (board[row][x] == 1)
                return false;
        for (int x = row, y = col; x >= 0 && y >= 0; x--, y--)
            if (board[x][y] == 1)
                return false;
        for (int x = row, y = col; x < N && y >= 0; x++, y--)
            if (board[x][y] == 1)
                return false;
        return true;
    }
}
