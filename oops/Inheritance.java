package oops;

public class Inheritance {
    public static void main(String[] args) {
        Box box1 = new Box(5);
        Box box2 = new Box(box1);
        BoxWeight box3 = new BoxWeight(3,4,10,10);
//        box3.func();

        BoxWeightAge boxWA = new BoxWeightAge(1,2,3,4,5);
        BoxWeightAge boxWA1 = new BoxWeightAge();
        boxWA1.func();
        boxWA.func();

        BoxWeight b1 = new BoxWeight();
        b1.greeting();
    }
}
