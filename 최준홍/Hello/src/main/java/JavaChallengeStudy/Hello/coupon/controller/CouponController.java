package JavaChallengeStudy.Hello.coupon.controller;

import JavaChallengeStudy.Hello.coupon.dto.RequestCouponTypeDto;
import JavaChallengeStudy.Hello.coupon.dto.ResponseCouponDto;
import JavaChallengeStudy.Hello.coupon.service.CouponService;
import JavaChallengeStudy.Hello.coupon.service.CouponServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class CouponController {

    @Autowired
    private final CouponService couponService;

    public CouponController(CouponServiceImpl couponService){
        this.couponService = couponService;
    }

    @GetMapping("coupon/list")
    public List<ResponseCouponDto> getCouponList(RequestCouponTypeDto requestCouponTypeDto){
        return this.couponService.getCouponList(requestCouponTypeDto);
    }



}
