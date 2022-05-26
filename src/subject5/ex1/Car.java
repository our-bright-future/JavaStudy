package subject5.ex1;

public abstract class Car {

    void startCar() {
        System.out.println("시동을 켭니다.");
    }

    abstract void drive();
    abstract void stop();

    void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    public final void run() {
        startCar();
        drive();
        wiper();
        stop();
        turnOff();
    }

    void wiper() {}
}
