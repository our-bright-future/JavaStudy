import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Practice {

    public static void main(String[] args) {
        Car[] cars = { new Car("White"), new Car("Blue"), new Car("Red") };
        ArrayList<Car> carArray = new ArrayList<>(List.of(cars));
        ArrayList<Car> carClone = (ArrayList<Car>) carArray.clone();

        ArrayList arrayList = new ArrayList();
        arrayList.add(new Car("White"));
        arrayList.add(carArray);


        System.out.println(arrayList.get(0).getClass());
        System.out.println(arrayList.get(1).getClass());

        carArray.get(1).setColor("Brown");

        System.out.println(Arrays.toString(carArray.toArray()));
        System.out.println(Arrays.toString(carClone.toArray()));

        LinkedList<Car> carLinkedList = new LinkedList<>(carArray);

        for (Car car: carLinkedList) {
            System.out.println(car);
        }
    }
}

class Car {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}