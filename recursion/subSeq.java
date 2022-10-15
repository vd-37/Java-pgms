package recursion;

import java.util.ArrayList;
import java.util.Collections;

public class subSeq {
    public static void main(String[] args) {
        ArrayList<String> resList= new ArrayList<>();
        resList  = func("abc", "", resList);
        Collections.sort(resList);
        System.out.println(resList);
    }

    public static ArrayList<String> func(String up, String res, ArrayList<String> resList){
        if(up.isEmpty()){
            resList.add(res);
            return resList;
        }
        char ch = up.charAt(0);
        func(up.substring(1), res + ch, resList);
        func(up.substring(1), res, resList);
        return func(up.substring(1), res + (ch + 0), resList);

    }
}
