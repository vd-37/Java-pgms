package backtracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationsLC46 {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> p = new ArrayList<>();
        List<Integer> up = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            up.add(i + 1);
        }
        permutations(list, p, up, 4);
        System.out.println(list);
    }

    public static void permutations(List<List<Integer>> list, List<Integer> p, List<Integer> up, int n){
        if(p.size() == n){
            list.add(new ArrayList<>(p));
            return;
        }
        for(int i = 0; i < n; i++) {
            int num = up.get(i);
            if(p.contains(num))
                continue;
            p.add(num);
            permutations(list, p, up, n);
            p.remove(p.size() - 1);
        }
    }
}
