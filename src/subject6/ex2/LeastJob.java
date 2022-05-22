package subject6.ex2;

public class LeastJob implements Scheduler {

    @Override
    public void getNextCall() {
        System.out.println("들어오는 전화 순서대로 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("가장 짧은 대기열을 보유한 상담원에게 배분합니다.");
    }
}
