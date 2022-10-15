package string;

public class DsaS4 {
    public static void main(String[] args) {
        String str = "a";
        System.out.print(solve(str));
    }

    public static int solve(String A) {
        char arr[] = A.toCharArray();
        String vowels = "aeiou";
        int count = 0, consCount = 0, vowCount = 0;

        for (char a : arr) {
            if (vowels.indexOf(a) != -1)
                vowCount++;
            else
                consCount++;
        }

        for(char a : arr){
            if (vowels.indexOf(a) != -1){
                vowCount--;
                count += consCount;
            }
            else{
                consCount--;
                count += vowCount;
            }
        }

        return count % 1000000007;
    }
}
