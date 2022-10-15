package bitwise;

public class LCM {
    public static void main(String[] args) {
        System.out.println(lcm(3,7));
    }

    public static int gcd(int a, int b){
        if( a == 0)
            return b;
        return gcd(b % a, a);
    }

    public static int lcm(int a,int b){
        int hcf = gcd(a, b);
        return  (a * b) / hcf;
    }
}
