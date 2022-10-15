package recursion;
import java.util.ArrayList;

public class DiceProblem {
    public static void main(String[] args) {
        System.out.println(combi(7,"", "23614"));
    }
    //Kunal google recursion probs
    public static ArrayList<String> combi(int n, String p, String up){
        if(n <= 0){
            ArrayList<String> list = new ArrayList<>();
            if(n == 0) {
                list.add(p);
            }
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0; i < up.length(); i++){
            int x = up.charAt(i) - '0';
            ans.addAll(combi(n - x, p + up.charAt(i), up));
        }
        return ans;
    }
}
