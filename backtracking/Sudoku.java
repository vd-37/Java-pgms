package backtracking;

public class Sudoku {
    public static void main(String[] args) {
        char[][] board = new char[][]
        {       {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

    }

    public static boolean sudoku(char[][] board) {
        int row = -1;
        int col = -1;
        boolean isEmpty = true;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++)
                if (board[i][j] == '.') {
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;
                }
            if (!isEmpty)
                break;
        }

        if (isEmpty)
            return true;

        for (char i = '1'; i <= '9'; i++) {
            if (isSafe(board, row, col, i)) {
            board[row][col] = i;
            if (sudoku(board))
                return true;
            else
                board[row][col] = '.';
        }
    }
        return false;
    }

    private static void display(char[][] board) {
            for(char[] row : board){
                for(char element : row)
                    System.out.print(element + " ");
                System.out.println();
        }
    }

    private static boolean isSafe(char[][] board, int row, int col, char ch) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == ch)
                return false;
        }

        for (char[] chars : board) {
            if (chars[col] == ch)
                return false;
        }

        int start = row - row % 3;
        int end = col - col % 3;

        for (int i = start; i < start + 3; i++)
            for (int j = end; j < end + 3; j++)
                if(board[i][j] == ch)
                    return false;
        return true;
    }
}
