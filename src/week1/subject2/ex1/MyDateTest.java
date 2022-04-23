package week1.subject2.ex1;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(30, 2, 2000);
        System.out.println(date1.isValid());
        MyDate date2 = new MyDate(2, 10, 2006);
        System.out.println(date2.isValid());

        // date1.day = 10; -> ERROR
        // date1.month = 3; -> OK
        // date1.year = 2020; -> OK
    }
}
