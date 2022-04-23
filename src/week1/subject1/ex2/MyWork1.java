package week1.subject1.ex2;

public class MyWork1 {

    public static void main(String[] args) {
        SimpleCalculator1 calculator1 = new SimpleCalculator1(5, 2);
        calculator1.Sum();
        calculator1.Sub();
        calculator1.Mul();
        calculator1.Div();

        SimpleCalculator1 calculator2 = new SimpleCalculator1();
        calculator2.setNum1(5);
        calculator2.setNum2(2);
        calculator2.Sum();
        calculator2.Sub();
        calculator2.Mul();
        calculator2.Div();
    }
}
