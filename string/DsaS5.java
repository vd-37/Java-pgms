package string;

import java.util.ArrayList;
import java.util.Collections;

public class DsaS5 {
    public static void main(String[] args) {
        ArrayList <String> A = new ArrayList<>();
        A.add("assd");
        A.add("asddfqe");
        A.add("asdeerfgdg");
        A.add("asddsadeerfgdg");
        System.out.println(longestCommonPrefix(A));
    }
    public static String longestCommonPrefix(ArrayList<String> A){
        String res="";
        Collections.sort(A);
        for(int i = 0 ;i < A.get(0).length(); i++){
            char x = A.get(0).charAt(i);
            for(int j = 1; j < A.size(); j++){
                if(x != A.get(j).charAt(i))
                    return res;
            }
            res += x;
        }
        return res;
    }
}
