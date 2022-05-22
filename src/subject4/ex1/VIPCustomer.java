package subject4.ex1;

public class VIPCustomer extends Customer{

    private String counselorNumber;

    {
        grade = "VIP";
        discountRate = 0.1;
        saveUpPointRate = 0.05;
        counselorNumber = "12345";
    }

    public String getCounselorNumber() {
        return counselorNumber;
    }

    public void setCounselorNumber(String counselorNumber) {
        this.counselorNumber = counselorNumber;
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + " 담당 상담원 번호는 " +
                counselorNumber + "입니다.";
    }

    public VIPCustomer(String customerName) {
        super(customerName);
    }

    public VIPCustomer(int customerId, String customerName) {
        super(customerId, customerName);
        System.out.println("VIPCustomer.VIPCustomer");
    }
}
