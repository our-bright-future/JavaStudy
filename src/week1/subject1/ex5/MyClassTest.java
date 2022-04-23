package week1.subject1.ex5;

public class MyClassTest {

    public static void main(String[] args) {

        MyClass woman = new MyClass("제인");

        woman.age = 30;
        woman.gender = "여성";
        woman.isMarried = true;
        woman.child = 1;

        woman.PrintInfo();
    }
}
