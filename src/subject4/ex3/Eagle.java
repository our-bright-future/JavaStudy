package subject4.ex3;

public class Eagle extends Animal {

    public Eagle() {
        name = "독수리";
    }

    @Override
    public void move() {
        System.out.println(name + "가 하늘을 날아갑니다.");
    }

    public void fly() {
        System.out.println("Eagle.fly");
    }
}
