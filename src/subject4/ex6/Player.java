package subject4.ex6;

public class Player {

    public static final int ADVANCED_LEVEL = 2;
    public static final int SUPER_LEVEL = 3;

    Level level = new BeginnerLevel();

    public void play(int time) {
        level.run();
        for(int i =0; i<time; i++) {
            level.jump();
        }
        level.turn();
    }

    public void upgradeLevel(int level) {

        switch (level) {
            case ADVANCED_LEVEL:
                this.level = new AdvancedLevel();
                break;
            case SUPER_LEVEL:
                this.level = new SuperLevel();
                break;
        }
    }
}