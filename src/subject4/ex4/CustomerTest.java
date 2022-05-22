package subject4.ex4;

import subject4.ex1.Customer;
import subject4.ex1.VIPCustomer;

import java.util.ArrayList;

public class CustomerTest {

    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("이순신"));
        customers.add(new Customer("신사임당"));
        customers.add(new GOLDCustomer("홍길동"));
        customers.add(new GOLDCustomer("이율곡"));
        customers.add(new VIPCustomer("김유신"));

        System.out.println("====== 고객 정보 출력 ======");
        for (Customer customer : customers) {
            System.out.println(customer.showCustomerInfo());
        }

        System.out.println("====== 할인율과 보너스 포인트 계산 ======");
        for (Customer customer : customers) {
            customer.purchase(10000);
        }
    }
}
