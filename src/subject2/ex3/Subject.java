package subject2.ex3;

public class Subject {
    int koreaScore;
    int mathScore;
    String koreaSubject;
    String mathSubject;

    public int totalScore() {
        return koreaScore + mathScore;
    }
}
