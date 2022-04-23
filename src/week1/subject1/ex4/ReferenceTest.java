package week1.subject1.ex4;

import week1.subject1.ex3.Student;

public class ReferenceTest {

    public static void main(String[] args) {
        Student studentLee = new Student();

        studentLee.name = "이순신";
        System.out.println(studentLee);
    }
}
