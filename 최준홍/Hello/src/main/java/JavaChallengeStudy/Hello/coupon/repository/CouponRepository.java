package JavaChallengeStudy.Hello.coupon.repository;

import JavaChallengeStudy.Hello.coupon.common.CouponType;
import JavaChallengeStudy.Hello.coupon.dto.RequestCouponTypeDto;
import JavaChallengeStudy.Hello.coupon.dto.ResponseCouponListDto;
import JavaChallengeStudy.Hello.coupon.entitiy.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CouponRepository extends JpaRepository<Coupon,Long> {
    public List<Coupon> findByCouponType(CouponType couponType);
}
