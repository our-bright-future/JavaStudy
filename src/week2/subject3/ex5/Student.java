package week2.subject3.ex5;

import java.util.ArrayList;

public class Student {

    private int studentId;
    private String studentName;
    private ArrayList<Subject> subjects = new ArrayList<>();

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void addSubject(String subjectName, int subjectScore) {
        subjects.add(new Subject(subjectName, subjectScore));
    }

    public void showStudentInfo() {
        for (Subject subject: subjects)
            System.out.println(subject.getSubjectName());
    }
}

class Subject {

    private String subjectName;
    private int subjectScore;

    public Subject(String subjectName, int subjectScore) {
        this.subjectName = subjectName;
        this.subjectScore = subjectScore;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getSubjectScore() {
        return subjectScore;
    }
}