package patterns;

import java.util.ArrayList;

public class Pascal {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static ArrayList<ArrayList<Integer>> generate(int n) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i = 0;i < n; i++){
            ArrayList<Integer> row = new ArrayList<Integer>();
            for(int j = 0; j <= i; j++){
                int x = fact(i) / (fact(i - j) * fact(j));
                row.add(x);
            }
            res.add(row);
        }
        return res;
    }
    public static int fact(int n){
        if(n == 1 || n == 0)
            return 1;
        return n * fact(n - 1);
    }
}



