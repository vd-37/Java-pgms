package backtracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 2;
        boolean[][] queens = new boolean[n][n];
        System.out.println(Queens(queens, 0));
    }

    public static int Queens(boolean[][] arr, int r) {
        if (r ==  arr.length) {
            return 1;
        }
        int count = 0;
        for (int col = 0; col < arr.length; col++) {
            if (checkRow(arr, col) && checkDiagonal(arr, r, col)) {
                arr[r][col] = true;
                count += Queens(arr, r + 1);
                arr[r][col] = false;
            }
        }
        return count;
    }

    private static boolean checkDiagonal(boolean[][] arr, int r, int c) {
        int row = r, col = c;
        while(row >= 0 && col >= 0){
            if(arr[row][col])
                return false;
            row--;
            col--;
        }
        row = r; col = c;
        while(row >= 0 && col < arr.length){
            if(arr[row][col])
                return false;
            row--;
            col++;
        }
        return true;
    }

    private static boolean checkRow(boolean[][] arr, int c) {
        for (boolean[] booleans : arr) {
            if (booleans[c])
                return false;
        }
        return true;
    }
}
