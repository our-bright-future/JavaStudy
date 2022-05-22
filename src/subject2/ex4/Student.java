package subject2.ex4;

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

    public void pay(int price) {
        cash -= price;
    }

    public void takeBus(Bus bus) {
        if (cash < Bus.price)
            System.out.println("돈이 부족합니다.");
        else {
            bus.boardingPassenger(1);
            this.cash -= Bus.price;
        }
    }

    public void takeSubway(Subway subway) {
        if (cash < Bus.price)
            System.out.println("돈이 부족합니다.");
        else {
            subway.boardingPassenger(1);
            this.cash -= Subway.price;
        }
    }

    public void showInfo() {
        System.out.println(name + "님의 남은 돈은 " + cash + "원 입니다.");
    }
}
