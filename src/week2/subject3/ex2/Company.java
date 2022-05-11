package week2.subject3.ex2;

public class Company {

    private Company() { }

    public static Company getInstance() {
        return Holder.INSTANCE;
    }

    public static class Holder {
        public static final Company INSTANCE = new Company();
    }
}
