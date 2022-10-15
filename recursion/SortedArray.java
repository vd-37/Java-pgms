package recursion;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1};
        boolean ans = sorted(arr, arr.length, 0);
        if(ans)
            System.out.println("sorted");
        else
            System.out.println("Unsorted");
    }

    public static boolean sorted(int[] arr, int n, int i){
        if(i == n - 1)
            return true;
        if(arr[i] <= arr[i + 1])
            return sorted(arr, n, i + 1);
        else
            return false;
    }
}
