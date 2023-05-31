package JavaChallengeStudy.Hello.coupon.service;

import JavaChallengeStudy.Hello.coupon.dto.RequestCouponTypeDto;
import JavaChallengeStudy.Hello.coupon.dto.ResponseCouponDto;
import JavaChallengeStudy.Hello.coupon.entitiy.Coupon;
import JavaChallengeStudy.Hello.coupon.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CouponServiceImpl implements CouponService {

    private final CouponRepository couponRepository;
    @Autowired
    public CouponServiceImpl(CouponRepository couponRepository){
        this.couponRepository =couponRepository;
    }
    @Override
    public void checkCoupon() {

    }

    @Override
    public void useCoupon(String couponCode) {

    }

    @Override
    public List<ResponseCouponDto> getCouponList(RequestCouponTypeDto R) {
//        this.couponRepository.findByCouponName();
        return null;
    }

    @Override
    public List<ResponseCouponDto> getCouponListByType(RequestCouponTypeDto requestCouponTypeDto) {
        return this.couponRepository.findByCouponType(requestCouponTypeDto.getCouponType())
                .stream()
                .map(v-> v.mapToCouponDto(v))
                .collect(Collectors.toList());
    }
}
