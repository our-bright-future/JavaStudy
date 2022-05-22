package subject2.ex2;

public class Subject {
    int koreaScore;
    int mathScore;
    String koreaSubject;
    String mathSubject;

    String authName;

    public void setKorean(String koreanSubject, int koreaScore) {
        this.koreaSubject = koreanSubject;
        this.koreaScore = koreaScore;
    }

    public void setMath(String mathSubject, int mathScore) {
        this.mathSubject = mathSubject;
        this.mathScore = mathScore;
    }

    public int totalScore() {
        return koreaScore + mathScore;
    }

    public Subject getThis() {

        return this;
    }
}
