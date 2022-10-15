package recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
//        pattern(4,0);
        int[] arr = new int[]{5,4,3,2,1,1,1,1,1};
//        sort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
        selSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void pattern(int r, int c){
        if(r == 0 )
            return;

        if(c == r) {
            System.out.println();
            pattern(r - 1, 0);
        }
        if(c < r) {
            System.out.print("* ");
            pattern(r, c + 1);
        }
    }

    public static void sort(int[] arr, int r, int c){
        if(r == 0 )
            return;

        if(c < r) {
            if(arr[c] > arr[c + 1]){
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            sort(arr, r, c + 1);
        }
        else{
            sort(arr, r - 1, 0);
        }
    }

    public static void selSort(int[] arr, int r, int c, int maxIndex){
        if(r == 0 )
            return;

        if(c < r) {
            if(arr[c] > arr[maxIndex]) {
                maxIndex = c;
            }
            selSort(arr, r, c + 1, maxIndex);
        }
        else{
            int temp = arr[r -1];
            arr[r - 1] = arr[maxIndex];
            arr[maxIndex] = temp;
            selSort(arr, r - 1, 0, 0);
        }
    }
}
