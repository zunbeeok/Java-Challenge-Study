package JavaChallengeStudy.Hello.coupon.service;

import JavaChallengeStudy.Hello.coupon.dto.RequestCouponTypeDto;
import JavaChallengeStudy.Hello.coupon.dto.ResponseCouponDto;

import java.util.List;
public interface CouponService {
    public void checkCoupon();

    public void useCoupon(String couponCode);

    public List<ResponseCouponDto> getCouponList(RequestCouponTypeDto requestCouponTypeDto);

    public List<ResponseCouponDto> getCouponListByType(RequestCouponTypeDto requestCouponTypeDto);
}
