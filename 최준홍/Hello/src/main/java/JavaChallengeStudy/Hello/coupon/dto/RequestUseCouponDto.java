package JavaChallengeStudy.Hello.coupon.dto;

import JavaChallengeStudy.Hello.coupon.common.CouponType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RequestUseCouponDto {
    private String couponName;
    private String getCouponType;
    private CouponType couponType;


}
