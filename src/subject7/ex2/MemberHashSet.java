package subject7.ex2;

import java.util.HashSet;

public class MemberHashSet {

    private HashSet<Member> members = new HashSet<>();

    public void addMember(Member member) {
            members.add(member);
    }

    public void showAllMember() {
        for (Member member : members) {
            System.out.println(member);
        }
        System.out.println();
    }

}
