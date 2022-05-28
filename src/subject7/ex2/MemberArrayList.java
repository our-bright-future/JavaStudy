package subject7.ex2;

import java.util.ArrayList;
import java.util.List;

public class MemberArrayList {

    private ArrayList<Member> members = new ArrayList<>();

    public void addMember(Member member) {
        members.add(member);
    }

    public void removeMember(int memberId) {
        for (Member member : members) {
            if (member.getMemberId() == memberId) {
                members.remove(member);
                break;
            }
        }
    }

    public void showAllMember() {
        for (Member member : members) {
            System.out.println(member);
        }
        System.out.println();
    }
}
