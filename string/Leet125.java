package string;

public class Leet125 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Aba"));

    }
    public static boolean isPalindrome(String s) {
        String str="";
        String rev="";
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
            if(Character.isLetterOrDigit(s.charAt(i)))
                str=str+s.charAt(i);

        for(int i=str.length()-1 ; i>=0 ; i--)
            rev = rev + str.charAt(i);
        return rev.equals(str);

    }
}
