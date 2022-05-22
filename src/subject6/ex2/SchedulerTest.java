package subject6.ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SchedulerTest {

    public static void main(String[] args) throws IOException {
        System.out.println("전화 상담 할당 방식을 선택 하세요.");
        System.out.println("R : 한명씩 차례로 할당");
        System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
        System.out.println("P : 우선순위가 높은 고객 먼저 할당");

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input = br.readLine();

        Scheduler scheduler;

        if (input.equalsIgnoreCase("R")) {
            scheduler = new RoundRobin();
        } else if (input.equalsIgnoreCase("L")) {
            scheduler = new LeastJob();
        } else {
            scheduler = new PriorityAllocation();
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }
}
