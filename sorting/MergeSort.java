package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeSort(new int[]{1,2,3,4,5,5,6,6,6,66,6,6,6,6,6,6,6,6,6,6,6,6,6,6})));
    }

    static int[] mergeSort(int[] arr){
        if(arr.length == 1 || arr.length == 0)
            return arr;
        int mid = arr.length / 2;
        int[] left =  mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right =  mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];
        int l = 0, r = 0, i = 0;
        while(l < left.length && r < right.length){
            if(left[l] < right[r])
                mix[i++] = left[l++];
            else{
                mix[i++] = right[r++];
            }
        }
        while(l < left.length)
            mix[i++] = left[l++];

        while(r < right.length)
            mix[i++] = right[r++];

        return mix;
    }
}
