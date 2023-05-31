package JavaChallengeStudy.Hello.coupon.entitiy;

import JavaChallengeStudy.Hello.common.BaseTimeEntity;
import JavaChallengeStudy.Hello.coupon.common.CouponStatus;
import JavaChallengeStudy.Hello.coupon.common.CouponType;
import JavaChallengeStudy.Hello.coupon.dto.ResponseCouponDto;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@DynamicUpdate
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "coupon")
@ToString
public class Coupon extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "coupon_code", nullable = false)
    private String couponCode;

    @Column(name = "coupon_name", nullable = false)
    private String couponName;

    @Enumerated(EnumType.STRING)
    @Column(name = "coupon_status", nullable = false)
    private CouponStatus couponStatus;

    @Enumerated(EnumType.STRING)
    @Column(name = "coupon_type", nullable = false)
    private CouponType couponType;

    @Builder
    public Coupon(String couponCode, String couponName, CouponStatus couponStatus, CouponType couponType){
        this.couponCode = couponCode;
        this.couponName=couponName;
        this.couponStatus = couponStatus;
        this.couponType = couponType;
    }



    public ResponseCouponDto mapToCouponDto(Coupon coupon){
        return ResponseCouponDto.builder()
                .id(coupon.getId())
                .couponCode(coupon.getCouponCode())
                .couponName(coupon.getCouponName())
                .couponStatus(coupon.getCouponStatus())
                .couponType(coupon.getCouponType())
                .build();
    }


}
