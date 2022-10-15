package recursion;

public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(rBS(arr, 0, arr.length -1));
    }

    public static int rBS(int[] arr, int low, int high){
        if(low >= high)
            return arr.length - 1;
        int mid = low + (high - low) / 2;
        if(high > mid && arr[mid] > arr[mid + 1])
            return mid;
        if(low < mid && arr[mid] < arr[mid - 1])
            return mid - 1;
        if(arr[mid] >= arr[low])
            return rBS(arr, mid + 1, high);
        else
            return rBS(arr, low, mid - 1);
        }
}
