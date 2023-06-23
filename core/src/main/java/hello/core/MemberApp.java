package hello.core;

import hello.core.member.*;

public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl(new MemoryMemberRepository());
        Member memberA = new Member(1L, "memberA", Grade.VIP);
        memberService.join(memberA);


        Member findMember = memberService.findById(1L);
        System.out.println("findMember = " + findMember.getName());
        System.out.println("memberA = " + memberA.getName());

    }
}
