package subject4.ex3;

public class Human extends Animal {

    @Override
    public void move() {
        System.out.println(name + "이 두발로 걷습니다.");
    }

    public Human() {
        name = "사람";
    }
}
