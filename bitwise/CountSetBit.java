package bitwise;

public class CountSetBit {
    public static void main(String[] args) {
        int n = 1001;
        System.out.println(setBit(n));
        System.out.println(Integer.toBinaryString(n));
//        System.out.println(Math.ceilDivExact(7,10));
        int i = 3;
        do{
            System.out.print(i+3 + " ");
            i = i - 1;

        }while (i != 0);
    }

    public static int setBit(int n){
        int count = 0;
        while (n > 0){
            if((n & 1) == 1)
                count++;
            n = n >> 1;
        }
        return count;
    }
}
