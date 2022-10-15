package Leetcode;

public class LC75 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,0,2,1,1,0};
        sortColors(nums);
    }

    public static void sortColors(int[] nums) {
        int[] arr = new int[3];
        for (int num : nums) arr[num] += 1;

        int index = 0;
        for(int i = 0; i < nums.length; ){
            while(arr[index] > 0){
                nums[i] = index;
                i += 1;
                arr[index]--;
            }
            index++;
        }

    }
}
