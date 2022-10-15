package Hash;

import java.util.*;

public class map {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[]{1,1,2,2,3,4,5,5,4,4,4,4,4,4,5,6};
        for(int i = 0; i < arr.length; i++){
            if(map.get(arr[i]) == null)
            map.put(arr[i], 1);
            else{
                int n = map.get(arr[i]);
                n += 1;
                map.put(arr[i], n);
            }
        }
        Set<Integer> keys = map.keySet();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> freQlist = new ArrayList<>();
        for(Integer key : keys)
            freQlist.add(map.get(key));
        Collections.sort(freQlist);
        for(int i = freQlist.size() - 1; i >= 0; i--) {
            for(int key : keys){
                if(Objects.equals(map.get(key), freQlist.get(i))){
                    while (map.get(key) != 0) {
                        list.add(key);
                        int n = map.get(key);
                        n -= 1;
                        map.put(key, n);
                    }
                }
            }
        }
        System.out.println(list);
//        ArrayList<char> = new
    }

    public boolean isValid(String s) {
        ArrayList<Character> list= new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '{' || ch == '(' || ch == '[')
                list.add(0, ch);
            else if(ch == ('}'))
                if(list.get(0) == ('{'))
                    list.remove(0);
                else
                    return false;
            else if(ch == (']'))
                if(list.get(0) == ('['))
                    list.remove(0);
                else
                    return false;
            else if(ch == (')'))
                if(list.get(0) == ('('))
                    list.remove(0);
                else
                    return false;
        }
        return true;
    }
}
