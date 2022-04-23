package week1.subject2.ex2;

import week1.subject2.ex3.Student;

public class ThisPractice {
    public static void main(String[] args) {
        Student student = new Student(18011562, "신동빈");
        student.setKorean("국어", 100);
        student.setMath("수학", 100);
        System.out.println(student.getSubject().totalScore());
    }
}
