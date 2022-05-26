package subject6.ex3;

public class Customer implements Buy, Sell{

    @Override
    public void buy() {

    }

    @Override
    public void sell() {

    }

    @Override
    public void order() {
        System.out.println("고객의 주문");
    }
}
