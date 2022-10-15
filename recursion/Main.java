package recursion;
import oops.modifiers;

public class Main extends modifiers{
    public static void main(String[] args) {
//        modifiers obj =  new modifiers(10,10);
//        System.out.println(obj.num);
        Main obj = new Main(220, 10);
        System.out.println(obj.num);
    }

//    modifiers(int num, int x){
//        super(num, x);
       Main(int num, int x){
        super(num, x);
    }
}
