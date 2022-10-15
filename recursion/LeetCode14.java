package recursion;
import java.util.ArrayList;

public class LeetCode14 {
    public static void main(String[] args) {
        System.out.println(combinations("", "23"));
    }

    public static ArrayList<String> combinations(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> curList = new ArrayList<>();
            curList.add(p);
            return curList;
        }

        ArrayList<String> list = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        int i = (digit -2) * 3;
        int len = (digit - 1) * 3;
        if(digit > 7){
            i+=1;
        }
        if(digit == 7 || digit == 8)
            len += 1;

        if(digit == 9)
            len += 2;

        for(; i < len; i++){
            char ch = (char)('a' + i);
            list.addAll(combinations(p+ch, up.substring(1)));
        }
        return list;
    }
}
