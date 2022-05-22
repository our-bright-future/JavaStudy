package subject3.ex3;

public class CardCompany {

    private static final CardCompany cardCompany = new CardCompany();

    private CardCompany() {
    }

    public static CardCompany getInstance() {
        return cardCompany;
    }

    public Card createCard() {
        // 가격이 300원
        return new Card();
    }
}
