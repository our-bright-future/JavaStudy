package subject3.ex3;

public class Card {

    private static Long cardNumberIdx = 10000L;
    private Long cardNumber;


    private static final int height = 30;
    private static final int width = 20;

    private String shape;
    private int num;


    public Card() {
        cardNumberIdx++;
        cardNumber = cardNumberIdx;
    }

    public Long getCardNumber() {
        return cardNumber;
    }
}
