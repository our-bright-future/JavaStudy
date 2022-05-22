public class SingletonTest {
    public static void main(String[] args) {
        System.out.println("main start");

        System.out.println("Before Singleton1");
        Singleton1 singleton1;
        System.out.println("Middle Singleton1");
        singleton1 = Singleton1.getInstance();

        System.out.println("Before Singleton2");
        Singleton2 singleton2;
        System.out.println("Middle Singleton1");
        singleton2 = Singleton2.getInstance();

        System.out.println("Before Singleton3");
        Singleton3 singleton3;
        System.out.println("Middle Singleton1");
        singleton3 = Singleton3.getInstance();
    }
}

class Singleton1 {

    private static Singleton1 instance = new Singleton1();

    private Singleton1() {
        System.out.println("Singleton1.Singleton1");
    }

    public static Singleton1 getInstance() {
        return instance;
    }
}

class Singleton2 {
    private static final Singleton2 INSTANCE = new Singleton2();

    private Singleton2() {
        System.out.println("Singleton2.Singleton2");
    }

    public static Singleton2 getInstance() {
        return INSTANCE;
    }
}

class Singleton3 {

    private Singleton3() {
        System.out.println("Singleton3.Singleton3");
    }

    public static Singleton3 getInstance() {
        return Holder.INSTANCE;
    }

    private static class Holder {
        public static final Singleton3 INSTANCE = new Singleton3();
    }
}