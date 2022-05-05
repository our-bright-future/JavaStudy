package week2.subject3.ex2;

public class Company {

    private static class LazyHolder {
        public static final Company INSTANCE = new Company();
    }

    public static Company getInstance() {
        return LazyHolder.INSTANCE;
    }

//    private static final Company instance = new Company();
//
//    public static Company getInstance() {
//        return instance;
//    }
}
