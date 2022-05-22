package subject1.ex4;

import subject1.ex3.Student;

public class ReferenceTest {

    public static void main(String[] args) {
        Student studentLee = new Student();

        studentLee.name = "이순신";
        System.out.println(studentLee); // 클래스 식별자 + 인스턴스 주소
    }
}
