package hackerEarth;

import java.util.*;

public class maximizeTheSum {

    public static void main(String args[] ) throws Exception {
        //BufferedReader
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while(t-- > 0){
            int n;
            n = in.nextInt();
            int k = in.nextInt();
            Integer[] arr = new Integer[n];
            for(int i = 0; i < n; i++)
                arr[i] = in.nextInt();

            Arrays.sort(arr, Collections.reverseOrder());
            int sum = 0, num = 0;
            for(int i = 0; i < n; i++){
                if(k == 0)
                    break;

                if(num != arr[i]){
                    sum += arr[i];
                    k--;
                }
                else
                    sum += arr[i];
                if(i+1 < n && arr[i+1] == arr[i])
                    k++;
            }
            System.out.println(sum);

        }
    }
}
