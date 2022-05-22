package subject6.ex2;

public class RoundRobin implements Scheduler{

    @Override
    public void getNextCall() {
        System.out.println("들어오는 전화 순서대로 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("상담원이 동일한 상담 건수를 처리하도록 돌아가면서 배분합니다.");
    }
}
