package subject4.ex3;

import java.util.ArrayList;

public class AnimalTest {

    public static void main(String[] args) {

        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        AnimalTest test = new AnimalTest();
        test.moveAnimal(hAnimal);
        test.moveAnimal(tAnimal);
        test.moveAnimal(eAnimal);

        ArrayList<Animal> animalArrayList = new ArrayList<>();
        animalArrayList.add(hAnimal);
        animalArrayList.add(tAnimal);
        animalArrayList.add(eAnimal);

        //iter 알려주기~
        for (Animal animal : animalArrayList) {
            animal.move();
        }

        Eagle eagle = (Eagle) eAnimal;
        eagle.fly();
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
