import java.util.Arrays;
import java.util.Scanner;
class ms {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int k = in.nextInt();
        String a = Integer.toString(num);
        char arr[] = a.toCharArray();

        for(int i = 0; i < arr.length && k > 0; i++){
            if(i == 0 && arr[i] != '1') {
                arr[i] = '1';
                k--;
            }
            if(i!=0 && arr[i] != '0') {
                arr[i] = '0';
                k--;
            }
        }
        String res="";
        for(char x: arr)
            res += x;
        System.out.println(Integer.valueOf(res));


    }
}