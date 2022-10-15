package interfaces;

public class Car implements Engine, Media{
    int a = 5;
    @Override
    public void start() {
        System.out.println("Car start");
    }

    @Override
    public void stop() {
        System.out.println("Car stop");
    }

    @Override
    public void acc() {
        System.out.println("car accelerate IN m");
        System.out.println("car accelerate IN m");
    }

    @Override
    public void songs() {
        System.out.println("Car has songs");
    }

    @Override
    public void musicPlayer() {
        System.out.println("Car has musicPlayer");
    }
}
