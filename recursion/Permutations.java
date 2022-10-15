package recursion;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(permutations("", "aab", list));
        System.out.println(list);
//        permutationsCount("", "aab", list, 0);
    }

    public static int permutations(String p, String up, ArrayList<String> list){

        if(up.isEmpty()) {
            list.add(p);
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i);
            count += permutations(f + ch + s, up.substring(1), list);
        }
        return count;
    }

    public static void permutationsCount(String p, String up, ArrayList<String> list,int count){

        if(up.isEmpty()) {
            list.add(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i);
            permutationsCount(f + ch + s, up.substring(1), list, count + 1);
        }
        System.out.println(count);
    }
}
