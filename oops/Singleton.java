package oops;

public class Singleton {
    int num = 10;
    int n = 20;
    private Singleton() {
        this.num = 200;
        this.n = 100;

    }
    static Singleton instance;

    static Singleton getInstance(){
        if(instance == null)
            instance = new Singleton();
        return instance;
    }
}
