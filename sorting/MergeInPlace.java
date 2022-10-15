package sorting;

public class MergeInPlace {
    public static void main(String[] args) {
        mergeSort(new int[]{5,6,7,2,3,45,2}, 0, 6);
    }

    public static void mergeSort(int[] arr, int start, int end){
        if(end == start){
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int l = 0, r = 0, k = 0;
        int[] mix = new int[end - start];

        while(l < mid && r < end){
            if(arr[l] <= arr[r])
                mix[k++] = arr[l++];
            else{
                mix[k++] = arr[r++];
            }
        }
        while(l < mid)
            mix[k++] = arr[l++];

        while(r < end)
            mix[k++] = arr[r++];

        for(int i = 0; i < mix.length; i++){
            arr[start + i] = mix[i];
        }
    }
}
