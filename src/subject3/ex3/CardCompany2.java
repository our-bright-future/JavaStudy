package subject3.ex3;

public class CardCompany2 {

    private static final CardCompany2 cardCompany2 = new CardCompany2();

    private CardCompany2() {
    }

    public static CardCompany2 getInstance() {
        return cardCompany2;
    }

    public Card createCard() {
        // 가격이 100원
        return new Card();
    }
}
