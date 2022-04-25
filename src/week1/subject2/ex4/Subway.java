package week1.subject2.ex4;

public class Subway {
    private int num;
    private int passenger = 0;
    private int income = 0;
    final static int price = 1200;

    public Subway(int num) {
        this.num = num;
    }

    public void boardingPassenger(int passenger) {
        this.passenger += passenger;
        this.income += passenger * price;
    }

    public void stopoverPassenger(int passenger) {
        this.passenger -= passenger;
    }

    public void showSubwayInfo() {
        System.out.println(num + "번 지하철의 승객은 " +
                passenger + "명 이고, 수입은 " + income + "입니다.");
    }
}
