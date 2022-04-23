package week1.subject2.ex4;

public class StudentTest {

    public static void main(String[] args) {
        Student studentLee = new Student(1001, "Lee");

        studentLee.setKorean("국어", 100);
        studentLee.setMath("수학", 50);

        Student studentKim = new Student(1002, "Kim");

        studentKim.setKorean("국어", 70);
        studentKim.setMath("수학", 85);

        studentLee.showStudentInfo();
        studentKim.showStudentInfo();
    }
}
