package com.hello.core;

import com.hello.core.member.*;

public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("New Member = " + member.getName());
        System.out.println("Find Member = " + findMember.getName());
    }
}
