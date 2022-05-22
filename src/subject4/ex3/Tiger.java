package subject4.ex3;

public class Tiger extends Animal {

    public Tiger() {
        name = "호랑이";
    }

    @Override
    public void move() {
        System.out.println(name + "가 네 발로 뜁니다.");
    }
}
