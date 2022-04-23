package week1.subject1.ex2;

public class SimpleCalculatorTest {

    public static void main(String[] args) {
        SimpleCalculator calculator1 = new SimpleCalculator(5, 2);
        calculator1.Sum();
        calculator1.Sub();
        calculator1.Mul();
        calculator1.Div();

        SimpleCalculator calculator2 = new SimpleCalculator();
        calculator2.num1 = 5;
        calculator2.num2 = 2;
        calculator2.Sum();
        calculator2.Sub();
        calculator2.Mul();
        calculator2.Div();
    }
}
