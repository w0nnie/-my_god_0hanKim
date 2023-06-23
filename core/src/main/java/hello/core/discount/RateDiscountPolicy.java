package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {
    private final int discountPercent = 10; // 10%
    @Override
    public int discount(Member member, int price) {
        //enum 은 == 이 맞다.
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        }else{
            return 0;
        }
    }
}
