package week1.subject2.ex2;

public class Student {
    int studentID;
    String studentName;
    private Subject subject = new Subject();

    public void showStudentInfo() {
        System.out.println("학생 " + studentName + "의 총점은 " +
                String.valueOf(subject.totalScore()) + " 입니다.");
    }

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public Subject getSubjectWithAuth() {
        // 교사 혹은 과목을 수정할 수 있는 권한이 있는지 확인한다.
        // if (isValidUser)
        return subject.getThis();
    }
}
