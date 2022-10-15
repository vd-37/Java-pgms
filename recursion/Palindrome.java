package recursion;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        String num = Integer.toString(n);
        char[] arr = num.toCharArray();
        System.out.println(pal(arr, 0, arr.length -1));;
    }

    public static String pal(char[] arr,int i,int n){
        if(i >= n)
            return "True";

        if(arr[i] == arr[n]){
            i += 1;
            n -= 1;
            pal(arr, i, n);
        }
         return "false";
    }
}
