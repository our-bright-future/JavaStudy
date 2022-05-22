package subject4;

public class DownCastingTest {

    public static void main(String[] args) {
        ChildClass childClass;
        ParentClass parentClass = new ChildClass();
//        ParentClass parentClass = new ParentClass(); 오류

        childClass = (ChildClass)parentClass;

        childClass.parentMethod();
        childClass.childMethod();


        long num = 1;
        int num2 = (int)num;

        // 작은 자료형 -> 큰 자료형은 묵시적 가능
        // 큰 자료형 -> 작은 자료형은 명시적 형변환 해야함
        // 메모리 상으로 작은 -> 큰 (ex. int 4byte -> long 8byte)
//        -99~~ < -21억 ~ 21억 < 99~~
    }
}

class ParentClass {

    public void parentMethod() {
        System.out.println("ParentClass.parentMethod");
    }
}

class ChildClass extends ParentClass {

    @Override
    public void parentMethod() {
        System.out.println("ChildClass.parentMethod");
    }

    public void childMethod() {
        System.out.println("ChildClass.childMethod");
    }
}