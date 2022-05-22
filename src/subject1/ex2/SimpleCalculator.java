package subject1.ex2;

public class SimpleCalculator {

    int num1;
    int num2;

    public SimpleCalculator() {
        num1 = 0;
        num2 = 0;
    }

    public SimpleCalculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public static void sum(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public void sum() {
        System.out.println(num1 + num2);
    }

    public void sub() {
        System.out.println(num1 - num2);
    }

    public void mul() {
        System.out.println(num1 * num2);
    }

    public void div() {
        System.out.println(num1 / num2);
    }
}
