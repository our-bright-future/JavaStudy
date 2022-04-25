package week1.subject2.ex2;

public class Car {
    String color;
    String gearType;
    int door;

    public Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    public Car(String color) {
        this(color, "auto", 4);
    }

    public void printThis() {
        System.out.println(this);
    }
}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("blue", "auto", 4);
        Car car2 = new Car("red");

        car2.printThis();
    }
}