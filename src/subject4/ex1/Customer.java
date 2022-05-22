package subject4.ex1;

public class Customer {

    protected String grade;

    protected double discountRate;
    protected double saveUpPointRate;

    protected int customerId;
    protected String customerName;
    public int bonusPoint = 0;

    {
        bonusPoint = 0;
        grade = "SILVER";
        discountRate = 0.0;
        saveUpPointRate = 0.01;
    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + grade + "이며, 보너스 포인트는 " +
                bonusPoint + "입니다.";
    }

    public int calcPrice(int price) {
        bonusPoint += price * saveUpPointRate;
        return price - (int)(price * discountRate);
    }

    public void purchase(int price) {
        System.out.println(customerName + " 님이 " +
                calcPrice(price) + "원 지불하셨습니다.");
        System.out.println(customerName + " 님의 현재 보너스 포인트는 " +
                bonusPoint + "점입니다.");
    }

    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
        //soutm 알려주기~
        System.out.println("Customer.Customer");
    }

    public Customer(String customerName) {
        this.customerName = customerName;
    }
}
