package subject4.ex5;

import subject4.ex3.Animal;
import subject4.ex3.Eagle;
import subject4.ex3.Human;
import subject4.ex3.Tiger;

import java.util.ArrayList;

public class AnimalTest {

    public static void main(String[] args) {
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        AnimalTest test = new AnimalTest();
        test.testDownCasting(animalList);
    }

    private void testDownCasting(ArrayList<Animal> animalList) {
        for (Animal animal : animalList) {
            if (animal instanceof Human) {
                System.out.println("사람이 책을 읽습니다.");
            }
            else if (animal instanceof Tiger) {
                System.out.println("호랑이가 사냥을 합니다.");
            }
            else if (animal instanceof Eagle) {
                System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
            }
        }
    }
}
