package recursion;

public class SumOfNDigits {
    public static void main(String[] args) {
        System.out.println(sum(0));
    }

    public static int sum(int n){
        if(n / 10 == 0)
            return n;
        return n % 10 * sum(n / 10) ;
    }
}
