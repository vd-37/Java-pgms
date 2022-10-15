package oops;

public class BoxWeightAge extends BoxWeight{
    double age;

    BoxWeightAge(double l, double w, double h, double weight, double age){
        super(l,w,h,weight);
        this.age = age;
    }

    BoxWeightAge(){
        super();
        this.age = 100;
    }

    public void func(){
        System.out.println("h:" + this.h + " l:" + this.l + " w:" + this.w + " weight:" + this.weight + " age" + this.age);
    }
}
