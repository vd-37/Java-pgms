package oops;

public class BoxWeight  extends Box{
    double weight;

    BoxWeight(){
//        this.weight = 10;
//        this.w = 20;
//        this.h = 30;
        super();
    }

    BoxWeight(double l, double w, double h, double weight){
        super(l, w, h);
        this.weight = weight;
    }

//    public static void greeting(){
//        System.out.println("hey ther from boxWe");
//    }

    public void func(){
        System.out.println("h:" + this.h + " l:" + this.l + " w:" + this.w + " weight:" + this.weight);
    }
}
