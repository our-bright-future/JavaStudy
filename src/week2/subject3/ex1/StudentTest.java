package week2.subject3.ex1;

public class StudentTest {

    public static void main(String[] args) {

        Student studentLee = new Student();
        studentLee.setStudentName("이순신");
        System.out.println(Student.getSerialNum()); //serialNum 값 가져오기 위해 get 메서드 호출

// 클래스 이름으로 직접 호출

        System.out.println(studentLee.studentName + " 학번:" + studentLee.studentID);

        Student studentSon = new Student();
        studentSon.setStudentName("손흥민");
        System.out.println(Student.getSerialNum());
        System.out.println(studentSon.studentName + " 학번:" + studentSon.studentID);
    }
}
