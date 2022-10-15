package recursion;

public class SkipA {
    public static void main(String[] args) {
        String str = "aaaappleaaadfdsf324aaaaaa";
        String res= "";
//      System.out.println(func(str, res));
        System.out.println(skipApple(str, res));

    }
    public static String func(String str, String res){
        if(str.isEmpty())
            return res;

        if(str.charAt(0) != 'a'){
            res += str.charAt(0);
        }
        return func(str.substring(1), res);
    }

    public static String skipApple(String str, String res){
        if(str.isEmpty())
            return res;

        if(str.startsWith("apple")){
            return skipApple(str.substring(5), res);
        }
        else
            res += str.charAt(0);
        return skipApple(str.substring(1), res);
    }
}
