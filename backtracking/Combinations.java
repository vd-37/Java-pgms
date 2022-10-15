package backtracking;
///LC77
import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> p = new ArrayList<>();
        combinations(n, k, p, 1, list);
        System.out.println(list);
    }

    public static void combinations(int n, int k, List<Integer> p, int start, List<List<Integer>> list){

        if(k == 0){
            list.add(new ArrayList<Integer>(p));
            return;
        }
        for (int i = start; i <= n; i++) {
            p.add(i);
            combinations(n, k - 1, p, i + 1, list);
            p.remove(p.size() - 1);
        }
    }


}
