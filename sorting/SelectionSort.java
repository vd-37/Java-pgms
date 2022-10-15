package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{6,4,3,2,1,5};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclicSort(int[] arr){
        for(int i = 0; i < arr.length;){
            if (arr[i] != i + 1){
                int swapIndex = arr[i] - 1;
                int temp = arr[i];
                arr[i] = arr[swapIndex];
                arr[swapIndex] = temp;
            }
            else
                i++;
        }
    }

    public static void insertionSort(int[] arr) {
        for(int i = 1; i < arr.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j -1] = temp;
                }
                else
                    break;
            }
        }
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for(int i = 0; i < n; i++){
            int last = n - i - 1;
            for(int j = 0; j < n - i; j++) {
                if(arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }
            int temp = arr[last];
            arr[last] = arr[maxIndex];
            arr[maxIndex] = temp;
            max = Integer.MIN_VALUE;
        }
    }
}
