package subject1.ex2;

public class SimpleCalculatorTest {

    public static void main(String[] args) {
        SimpleCalculator calculator1 = new SimpleCalculator(5, 2);
        calculator1.sum();
        calculator1.sub();
        calculator1.mul();
        calculator1.div();

        SimpleCalculator calculator2 = new SimpleCalculator();
        calculator2.num1 = 5;
        calculator2.num2 = 2;
        calculator2.sum();
        calculator2.sub();
        calculator2.mul();
        calculator2.div();

        SimpleCalculator.sum(4, 3);
    }
}
