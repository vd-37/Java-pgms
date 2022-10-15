package recursion;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        int revN = rev(n, 0);
        if(revN == n)
            System.out.println("Palindrome");
        else
            System.out.println("Nope");
    }

    public static int rev(int n, int revN){
        if(n % 10 == n)
            return revN * 10 + n;
        int rem = n % 10;
        revN = revN * 10 + rem;
        return rev(n / 10, revN);
    }
}
