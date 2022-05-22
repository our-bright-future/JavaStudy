package subject2.ex2;

public class ThisPractice {
    public static void main(String[] args) {
        Student student = new Student(18011562, "신동빈");
        student.getSubjectWithAuth().setKorean("국어", 100);
        student.getSubjectWithAuth().setMath("수학", 100);

        System.out.println(student.getSubjectWithAuth().totalScore());
    }
}
