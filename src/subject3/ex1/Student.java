package subject3.ex1;

public class Student {

    private static Long serialNum = 1000L;

    Long studentID;
    String studentName;

    public Student() {
        studentID = ++serialNum;
    }

    public static Long getSerialNum() {
        return serialNum;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
