package patterns;

public class patt5 {
    public static void main(String[] args) {
//        pattern5(5);
        pascal(5);
    }

    private static void pascal(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){

            }
        }
    }

    private static void pattern5(int n) {
        for(int i = 1; i <= n ; i++){
            int totalCols = 2 * i - 1;
            int spaces = 2 * n - totalCols;
            for(int s = 0; s < spaces; s++){
                System.out.print(" ");
            }

            for(int j = i; j > 1; j--) {
                System.out.print(j + " ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
