package week1.subject2.ex3;

public class Student {
    int studentID;
    String studentName;
    private Subject subject = new Subject();

    public void showStudentInfo() {
        System.out.println("학생 " + studentName + "의 총점은 " +
                subject.totalScore() + " 입니다.");
    }

    public Student(int studentId, String studentName) {
        this.studentID = studentId;
        this.studentName = studentName;
    }

    public void setKorean(String koreanSubject, int koreaScore) {
        subject.koreaSubject = koreanSubject;
        subject.koreaScore = koreaScore;
    }

    public void setMath(String mathSubject, int mathScore) {
        subject.mathSubject = mathSubject;
        subject.mathScore = mathScore;
    }
}
