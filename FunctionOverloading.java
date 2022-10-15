public class FunctionOverloading {
    public static void main(String[] args) {
        fun(10);
        fun("Yes");
    }

    public static void fun(int a){
        System.out.println(a);
    }

    public static void fun(String name){
        System.out.println(name);
    }
}
