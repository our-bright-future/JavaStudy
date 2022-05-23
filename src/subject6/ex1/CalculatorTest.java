package subject6.ex1;

public class CalculatorTest {

    public static void main(String[] args) {

        Calc calc = new Calculator();

        System.out.println("사칙연산 테스트");
        System.out.println("2 + 3 = " + calc.add(2, 3));
        System.out.println("2 - 3 = " + calc.subtract(2, 3));
        System.out.println("2 * 3 = " + calc.times(2, 3));
        System.out.println("2 / 3 = " + calc.divide(2, 3));
    }
}
