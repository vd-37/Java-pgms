package string;

public class DsaS6 {
    public static void main(String[] args) {
        String A = "bbcccbbb";
        System.out.println(longestPalindrome(A));
    }

    public static String longestPalindrome(String A){
        int start,end;
        if(A.length() == 1)
            return A;
        String strS = "", strE = "", str="";
        for(int i = 0; i < A.length(); i++){
            start = i;
            end = A.length() - 1;
            while(start < end){
                if(A.charAt(start) == A.charAt(end)){
                    strS += A.charAt(start);
                    strE = A.charAt(end) + strE;
                    start++;
                    end--;
                }
                else{
                    strS = "";
                    strE = "";
                    break;
                }
            }
            if(end == start)
                strS += A.charAt(start);
            if((strS.length() + strE.length()) > str.length() )
                str = strS + strE;
        }
        return str;
    }

}

