package subject6.ex4;

public class MyClassTest {

    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        X xClass = myClass;
        xClass.x();

        Y yClass = myClass;
        yClass.y();

        MyInterface iClass = myClass;
        iClass.myMethod();
        iClass.x();
        iClass.y();
    }
}
