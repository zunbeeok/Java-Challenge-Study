package JavaChallengeStudy.Hello.coupon.dto;

import JavaChallengeStudy.Hello.coupon.common.CouponStatus;
import JavaChallengeStudy.Hello.coupon.common.CouponType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

//import javax.persistence.*;


@Getter
@Setter
public class ResponseCouponDto {
    private Long id;


    private String couponCode;


    private String couponName;


    private CouponStatus couponStatus;


    private CouponType couponType;

    @Builder
    public ResponseCouponDto(Long id, String couponCode, String couponName, CouponStatus couponStatus, CouponType couponType){
        this.id = id;
        this.couponCode = couponCode;
        this.couponName = couponName;
        this.couponStatus = couponStatus;
        this.couponType=couponType;
    }


}
