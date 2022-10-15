package bitwise;

public class PowOf2 {
    public static void main(String[] args) {
        System.out.println(powOf2(4));
    }

    public static boolean powOf2(int n){
        return (n & n - 1) == 0;
    }
}
