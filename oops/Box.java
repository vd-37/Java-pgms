package oops;

public class Box {
    double l;
    double h;
    double w;

    Box () {
        this.h = -1;
        this.w = -1;
        this.l = -1;
    }

    Box(double side){
        this.h = side;
        this.l = side;
        this.w = side;
    }

    Box(double l, double w, double h){
        this.h = h;
        this.l = l;
        this.w = w;
    }

    Box(Box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void func(){
        System.out.println("h:" + this.h + " l:" + this.l + " w:" + this.w);
    }

    public static void greeting(){
        System.out.println("hey ther from box");
    }

    public static void main(String[] args) {
        Box box1 = new Box(5);
        System.out.println(box1.l);
    }

}
