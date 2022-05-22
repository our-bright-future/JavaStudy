package subject4.ex4;

import subject4.ex1.Customer;

public class GOLDCustomer extends Customer {

    {
        grade = "GOLD";
        discountRate = 0.1;
        saveUpPointRate = 0.02;
    }

    public GOLDCustomer(String customerName) {
        super(customerName);
    }

    public GOLDCustomer(int customerId, String customerName) {
        super(customerId, customerName);
    }
}
