package week1.subject2.ex4;

public class Student {

    private String name;
    private int cash;

    public Student(String name, int cash) {
        this.name = name;
        this.cash = cash;
    }

    public int getCash() {
        return cash;
    }

    public void getPaid(int price) {
        cash -= price;
    }

    public void takeBus(Bus bus) {
        bus.takeCash(this);
    }

    public void takeSubway(Subway subway) {
        subway.takeCash(this);
    }

    public void showInfo() {
        System.out.println(name + "님의 남은 돈은 " + String.valueOf(cash) + "원 입니다.");
    }
}
