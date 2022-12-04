package com.hello.core.order;

import com.hello.core.member.Grade;
import com.hello.core.member.Member;
import com.hello.core.member.MemberService;
import com.hello.core.member.MemberServiceImpl;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    private MemberService memberService = new MemberServiceImpl();

    private OrderService orderService = new OrderServiceImpl();

    @Test
    public void createOrder() {
        //  given
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        //  when
        Order order = orderService.createOrder(memberId, "itemA", 10_000);

        //  then
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1_000);
    }
}
