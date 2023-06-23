package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {


    RateDiscountPolicy rateDiscountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인이 적용되어야 한다.")
    void discount() {

        Member member = new Member(1L, "spring", Grade.VIP);

        int discountPrice = rateDiscountPolicy.discount(member, 10000);

        Assertions.assertThat(discountPrice).isEqualTo(1000);
    }

    @Test
    @DisplayName("VIP 아니면 할인이 미적용되어야 한다.")
    void discount_vip_x() {

        Member member = new Member(1L, "spring", Grade.BASIC);

        int discountPrice = rateDiscountPolicy.discount(member, 10000);

        Assertions.assertThat(discountPrice).isEqualTo(0);
    }
}
