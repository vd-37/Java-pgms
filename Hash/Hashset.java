package Hash;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(4);
        set.add(3);
        set.add(1);
        Iterator it = set.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
