package week1.subject1.ex3;

public class Student {

    public int id;
    public String name;
    public int grade;

    public void PrintInfo() {
        System.out.println("학번 : " + String.valueOf(id));
        System.out.println("이름 : " + name);
        System.out.println("학년 : " + String.valueOf(grade));
    }
}
