package recursion;
import java.util.ArrayList;

public class CombinationSumLC39 {
    static ArrayList<ArrayList<Integer>> mainList = new ArrayList<ArrayList<Integer>>();
    static ArrayList<Integer> subList = new ArrayList<Integer>();
    public static void main(String[] args) {
        int[] candidates = new int[]{2,3,6,7};
        combinationSum(candidates,7);
        System.out.println(mainList);
    }
        public static void combinationSum(int[] candidates, int target) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            combi(candidates, target, list);
        }

        public static void combi(int[] candidates, int target, ArrayList<Integer> list) {
            if (target <= 0) {
                if (target == 0) {
                    mainList.add(list);

                }
                return;
            }
                for (int x : candidates) {
                    subList.add(x);
                    combi(candidates, target - x, subList);
                }
        }
    }
