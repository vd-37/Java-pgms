package recursion;

public class nto1 {
    public static void main(String[] args) {
        func(5);
    }

    public static void func(int n){
        if(n == 0) {
            return;
        }
        func(n  - 1);
        System.out.print(n + " ");
    }
}
