package math;

import java.util.Scanner;

public class SOE {
    public static void main(String[] args) {
        boolean[] arr = new boolean[40];
//        primes(arr);
        Scanner in = new Scanner(System.in);
        int a = 7, b = 3;
        float res = (float)7/3;
        System.out.printf("%.2f" , res);
    }

    public static void primes(boolean[] arr){
        for(int i = 2; i < arr.length; i++){
            if(!arr[i])
            for(int j = 2 * i; j < arr.length; j += i){
                arr[j] = true;
            }
        }

        for(int i = 2; i < arr.length; i++){
            if(!arr[i])
            System.out.print(i + " ");
        }
    }
}
