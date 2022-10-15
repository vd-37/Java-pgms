package recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5,5,1,2,32,3,4,5};
        int target = 5;
        System.out.println(search(arr, 0, target));
    }
    static int found = -1;
    public static int search(int[] arr, int index, int x){
        if(index == arr.length)
            return found;
        if(arr[index] == x){
            found = index;
            return search(arr, index + 1, x);
        }
        else
            return search(arr, index + 1, x);
    }
}
