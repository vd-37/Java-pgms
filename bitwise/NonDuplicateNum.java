package bitwise;

public class NonDuplicateNum {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,22,2,22,3,3,4};

        //System.out.println(findNonDup(arr));
        int num = (int)(Math.log(8)/ Math.log(8)) + 1;
        System.out.println(num);
    }

    public static int findNonDup(int[] arr){
        int res = 0;
        for(int num : arr)
            res = num ^ res;
        return res;
    }


}
