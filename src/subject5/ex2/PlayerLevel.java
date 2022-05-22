package subject5.ex2;

public abstract class PlayerLevel {

    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

    public final void go(int number) {
        showLevelMessage();
        run();
        for (int i = 0; i < number; i++) {
            jump();
        }
        turn();
    }
}
