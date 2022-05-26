package subject5.ex2;

public abstract class PlayerLevel {

    //추상 메서드 -> 하위 클래스에서 구현해야함
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

    //훅 메서드 -> 하위 클래스 구현해도되고 안해도되고
    public void eat() {
        System.out.println("PlayerLevel.eat");
    }

    //템플릿 메서드 -> 공통된 로직을 제공하는 메서드
    public final void go(int number) {
        showLevelMessage();
        run();
        eat();
        for (int i = 0; i < number; i++) {
            jump();
        }
        turn();
    }
}
