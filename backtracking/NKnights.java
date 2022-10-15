package backtracking;

public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        Knights(board, 0, 0, n);
    }

    public static void Knights(boolean[][] arr, int r, int c, int n) {
        if (n == 0) {
            display(arr);
            System.out.println();
            return;
        }

        if(c == arr.length && r == arr.length - 1)
            return;

        if(c == arr.length) {
            Knights(arr, r +  1, 0, n);
            return;
        }

        if (isSafe(arr, r, c)) {
            arr[r][c] = true;
            Knights(arr, r, c + 1, n - 1);
            arr[r][c] = false;
        }
        Knights(arr, r, c + 1, n);
    }

    private static void display(boolean[][] arr) {
        for(boolean[] row : arr){
            for(boolean element : row)
                if(element)
                    System.out.print("K ");
                else
                    System.out.print("X ");
            System.out.println();
        }
    }


    private static boolean isSafe(boolean[][] arr, int r, int c){
        if(isValid(arr, r - 2, c - 1)) //done
            return !arr[r - 2][c - 1];
        if(isValid(arr, r - 2, c + 1))//s
            return !arr[r - 2][c + 1];
        if(isValid(arr, r - 1, c - 2)) //s
            return !arr[r - 1][c - 2];
        if(isValid(arr, r - 1, c + 2))
            return !arr[r - 1][c + 2];

        return true;
    }
//private static boolean isSafe(boolean[][] board, int row, int col) {
//    if (isValid(board, row - 2, col - 1)) {
//
//            return !board[row - 2][col - 1];
//
//    }
//
//    if (isValid(board, row - 1, col - 2)) {
//            return !board[row - 1][col - 2];
//    }
//
//    if (isValid(board, row - 2, col + 1)) {
//            return !board[row - 2][col + 1];
//    }
//
//    if (isValid(board, row - 1, col + 2)) {
//        return !board[row - 1][col + 2];
//    }
//
//    return true;
//}

    public static boolean isValid(boolean[][] arr, int r, int c){
        return r < arr.length && r >= 0 && c < arr.length && c >= 0;
    }
}
