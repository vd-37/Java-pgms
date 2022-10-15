package clarivate;

import java.util.Arrays;

public class strings {
    public static void main(String[] args) {
        String str = "??????????";
        String sub = "abcdefghoj";
//        String str = "??c???er";
//        String sub = "deciphere";
        int n = sub.length();
        int[] replace = new int[n];
        int index = 0, j = 0;
        boolean flag = false, changed = false;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == sub.charAt(j) || str.charAt(i) == '?'){
                replace[index++] = i;
                changed = true;
                j++;
            }
            else{
                i = i - j;
                j = 0;
                if(changed)
                    Arrays.fill(replace, 0);
                changed = false;
                index = 0;
            }
            if(j == n){
                flag = true;
                j = 0;
                break;
            }
        }
        int ind = 0;
        String ans = "";
        if(!flag)
            System.out.println(-1);
        else{
            for (int i = 0; i < str.length(); i++){
                if(ind < replace.length && i == replace[ind]) {
                   ans  += sub.charAt(j);
                   j++;
                   ind++;
                }
                else{
                    if(str.charAt(i) == '?'){
                        ans += 'a';
                        continue;
                    }
                    ans += str.charAt(i);
                }
            }
        }
        System.out.println(ans);
    }
}
