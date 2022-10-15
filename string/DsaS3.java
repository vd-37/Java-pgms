package string;

public class DsaS3 {
    public static void main(String[] args) {
        String A = "bbaabbbbbaabbaabbbbbbabbbabaabbbabbabbbbababbbabbabaaababbbaabaaaba";
        String B = "babaaa";
        System.out.println(fun(A, B));
    }

    static int fun(String A, String B){
        int j = 0, index = 0;
        if(B == null || B == "")
            return -1;
        if(A == null || A == "")
            return -1;
        if(A.length() < B.length())
            return -1;

        for(int i = 0; i < A.length(); i++){
            char a = A.charAt(i);
            char b = B.charAt(j);
            if(a == b) j++;
            else if(j != 0){
                i = i - j;
                j = 0;
            }

            if(j == B.length()) {
                index = i - j + 1;
                return index;
            }
        }
        return -1;
    }
}
