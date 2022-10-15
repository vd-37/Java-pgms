package recursion;

import java.util.Scanner;

public class CountNoOfZeroes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        System.out.println(count(n, 0));
    }

    public static int count(int n, int c) {
        if (n == 0) {
            return c;
        }

        int rem = n % 10;
        if (rem == 0)
            c += 1;
        return count(n / 10, c);
    }
}
