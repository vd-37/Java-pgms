package array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            t--;
            int n, k, q;
            n = in.nextInt();
            k = in.nextInt();
            q = in.nextInt();
            int[] ans = new int[q];
            int index = 0;
            while(q > 0){
                int a = in.nextInt();
                int b = in.nextInt();
                q--;
                if(b > a){
                    int temp = a;
                    a = b;
                    b = temp;
                }
                if(a - b >= k)
                    ans[index++] = 1;
                else
                    ans[index++] = 0;
            }
            for(int res : ans)
                System.out.println(res);
        }
    }
}

