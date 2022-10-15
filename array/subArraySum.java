package array;

import java.util.ArrayList;

public class subArraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7};
        System.out.println(sum(arr, 5, 12));

    }

    static ArrayList<Integer> sum(int[] arr, int n, int s)
    {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0, count = 0;

        for(int i = 0; i < arr.length; i++){

            if(sum < s) {
                sum += arr[i];
                count++;
            }
            else if(sum > s){
                sum -= arr[i - count];
                count--;

                if(sum == s){
                    list.add(i - count + 1);
                    list.add(i);
                }
            }
        }

        list.add(-1);
        return list;
    }

}

