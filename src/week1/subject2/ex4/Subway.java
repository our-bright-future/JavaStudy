package week1.subject2.ex4;

public class Subway {
    private int num;
    private int passenger = 0;
    private int income = 0;
    final static int price = 1200;

    public Subway(int num) {
        this.num = num;
    }

    public void takeCash(Student student) {
        if (student.getCash() < price)
            System.out.println("용돈 받아와라!");
        else {
            student.pay(price);
            passenger++;
            income += price;
        }
    }

    public void showSubwayInfo() {
        System.out.println(num + "번 지하철의 승객은 " +
                passenger + "명 이고, 수입은 " + income + "입니다.");
    }
}
