package subject3.ex3;

public class CardCompanyTest implements Cloneable{

    public static void main(String[] args) {

        CardCompany company = CardCompany.getInstance();

        Card myCard = company.createCard(); //메서드에서 Car 생성
        Card yourCard = company.createCard();

        System.out.println(myCard.getCardNumber()); //10001 출력
        System.out.println(yourCard.getCardNumber()); //10002 출력

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
