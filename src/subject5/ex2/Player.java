package subject5.ex2;

public class Player {

    private PlayerLevel level = new BeginnerLevel();

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
    }

    public void play(int number) {
        level.go(number);
    }
}
