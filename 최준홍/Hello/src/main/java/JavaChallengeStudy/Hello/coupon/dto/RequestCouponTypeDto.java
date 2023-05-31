package JavaChallengeStudy.Hello.coupon.dto;


import JavaChallengeStudy.Hello.coupon.common.CouponType;
import JavaChallengeStudy.Hello.coupon.entitiy.Coupon;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class RequestCouponTypeDto {
        CouponType couponType;

        @Builder
        public RequestCouponTypeDto(CouponType couponType){
            this.couponType = couponType;
        }

        public Coupon mapToEntity(){
            return Coupon.builder()
                    .couponType(RequestCouponTypeDto.builder().couponType)
                    .build();
        }

}
