package week1.subject1.ex5;

public class MyClass {

    public String name;
    public int age;
    public String gender;
    public boolean isMarried;
    public int child;

    public MyClass(String name) {
        this.name = name;
    }

    public void PrintInfo() {
        System.out.println("이름은 " + name + "이고 나이는 " + String.valueOf(age) +
                "세 입니다.");
        System.out.print("성별은 " + gender + "이며, ");
        if (isMarried)
            System.out.print("기혼자 입니다. ");
        else
            System.out.print("미혼자 입니다. ");
        System.out.println("자녀는 " + String.valueOf(child) + "명이 있습니다.");
    }
}
