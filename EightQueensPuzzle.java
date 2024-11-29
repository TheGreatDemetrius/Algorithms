class EightQueensPuzzle {
    static final int N = 8;
    
    public static void main(String[] args) {
        int[] queens = new int[N];
        if (solveNQueens(queens, 0))
            printBoard(queens);
        else
            System.out.println("No solution found");
    }
    
    static boolean solveNQueens(int[] queens, int col) {
        if (col == N)
            return true;
        for (int row = 0; row < N; row++) {
            if (isSafe(queens, row, col)) {
                queens[col] = row;
                if (solveNQueens(queens, col + 1))
                    return true;
            }
        }
        return false;
    }
    
    static boolean isSafe(int[] queens, int row, int col) {
        for (int i = 0; i < col; i++) {
            int placedQueenRow = queens[i];
            if (placedQueenRow == row || Math.abs(placedQueenRow - row) == Math.abs(i - col))
                return false;
        }
        return true;
    }
    
    static void printBoard(int[] queens) {
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++)
                System.out.print(queens[col] == row ? "Q " : ". ");
            System.out.println();
        }
    }
}
