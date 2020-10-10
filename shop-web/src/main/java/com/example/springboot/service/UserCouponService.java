package com.example.springboot.service;


import com.example.springboot.dto.ProductDTO;
import com.example.springboot.entity.CouponModel;
import com.example.springboot.entity.CouponModelExample;
import com.example.springboot.entity.UserCoupon;
import com.example.springboot.entity.UserCouponExample;
import com.example.springboot.mapper.CouponModelMapper;
import com.example.springboot.mapper.UserCouponMapper;
import com.example.springboot.requestVO.couponVO.CreateCouponModelVO;
import com.example.springboot.requestVO.couponVO.GetCouponListVO;
import com.example.springboot.requestVO.couponVO.QueryAcceptedableCouponListVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yelang.shop.base.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserCouponService {

    //优惠券来源————1：会员充值窗口
    public static final Integer COUPON_RELEASE_WINDOW_RECHARGE = 1;

    //用户优惠券状态————1：正常
    public static final Integer USER_COUPON_STATE_NORMAL = 1;

    //用户优惠券状态————2：已使用
    public static final Integer USER_COUPON_STATE_USED = 2;

    //用户优惠券状态————1：已过期
    public static final Integer USER_COUPON_STATE_EXPIRED = 3;


    //优惠券状态————0：未生效
    public static final Integer COUPON_STATE_WAITED = 0;

    //优惠券状态————1：正常
    public static final Integer COUPON_STATE_NORMAL = 1;

    //优惠券状态————9：已终止
    public static final Integer COUPON_STATE_TERMINATED = 9;

    //使用对象————0：全部用户
    public static final Integer COUPON_DEST_ALL = 0;

    //使用对象————1：普通用户
    public static final Integer COUPON_DEST_USER = 1;

    //使用对象————2：会员
    public static final Integer COUPON_DEST_VIP = 2;

    //使用对象————3：经销商
    public static final Integer COUPON_DEST_AGENT = 3;

    //使用对象————4：商家
    public static final Integer COUPON_DEST_MERCHANT = 4;



    @Autowired
    private CouponModelMapper couponModelMapper;

    @Autowired
    private UserCouponMapper userCouponMapper;

    public Integer terminateCoupon(Integer couponID){
        CouponModel model = couponModelMapper.selectByPrimaryKey(couponID);
        if (model == null){
            return 0;
        }
        model.setCouponState(COUPON_STATE_TERMINATED);
        return couponModelMapper.updateByPrimaryKey(model);
    }

    public Integer updateCoupon(CouponModel vo){
        Integer res = 0;
        CouponModel model = couponModelMapper.selectByPrimaryKey(vo.getCouponID());
        if (model == null){
            return 0;
        }

        model.setCouponName(vo.getCouponName());
        model.setCouponDescription(vo.getCouponDescription());
        model.setCouponTotalNumber(vo.getCouponTotalNumber());


        model.setGainedNumLimit(vo.getGainedNumLimit());
        model.setDeliveryWay(vo.getDeliveryWay());

        if (vo.getCouponBeginTime() <= System.currentTimeMillis()){
            model.setCouponState(COUPON_STATE_NORMAL);
        }else {
            model.setCouponState(COUPON_STATE_WAITED);
        }


        model.setDiscountType(vo.getDiscountType());
        model.setCouponAmount(vo.getCouponAmount());
        model.setDiscountLimit(vo.getDiscountLimit());

        model.setCouponBeginTime(vo.getCouponBeginTime());
        model.setCouponEndTime(vo.getCouponEndTime());
        model.setDestination(vo.getDestination());
        model.setCouponReleaseWindow(vo.getCouponReleaseWindow());

        res = couponModelMapper.updateByPrimaryKey(model);
        return res;
    }

    public Integer createCoupon(CreateCouponModelVO vo){
        Integer res = 0;
        CouponModel model = new CouponModel();
        model.setCouponName(vo.getCouponName());
        model.setCouponDescription(vo.getCouponDescription());
        model.setCouponTotalNumber(vo.getCouponTotalNumber());
        model.setCouponSendedNumber(0);

        model.setGainedNumLimit(vo.getGainedNumLimit());
        model.setDeliveryWay(vo.getDeliveryWay());

        if (vo.getCouponBeginTime() <= System.currentTimeMillis()){
            model.setCouponState(COUPON_STATE_NORMAL);
        }else {
            model.setCouponState(COUPON_STATE_WAITED);
        }
        model.setCouponType(vo.getCouponType());
        model.setCouponInnerSeq(getCouponInnerSequence(vo.getCouponType()));

        model.setDiscountType(vo.getDiscountType());
        model.setCouponAmount(vo.getCouponAmount());
        model.setDiscountLimit(vo.getDiscountLimit());

        model.setCouponBeginTime(vo.getCouponBeginTime());
        model.setCouponEndTime(vo.getCouponEndTime());
        model.setDestination(vo.getDestination());
        model.setCouponReleaseWindow(vo.getCouponReleaseWindow());

        res = couponModelMapper.insert(model);
        return res;
    }

    private String getCouponInnerSequence(Integer couponType) {
        String innerSeq =  "-" + DateUtil.timeStampToOrderFormat(System.currentTimeMillis());
        String res;
        switch (couponType){
            case 1:
                res = "ACTIVITY" + innerSeq;
                break;
            case 2:
                res = "VIP" + innerSeq;
                break;
            case 3:
                res = "LIVE" + innerSeq;
                break;
            default:
                res = "UNKNOWN" + innerSeq;
                break;
        }

        return res;
    }

    private void updateCouponModelsState(){
        CouponModelExample exampleForWait = new CouponModelExample();
        exampleForWait.createCriteria().andCouponStateEqualTo(COUPON_STATE_WAITED)
                .andCouponBeginTimeGreaterThanOrEqualTo(System.currentTimeMillis());
        List<CouponModel> waitList = couponModelMapper.selectByExample(exampleForWait);

        if (!waitList.isEmpty()){
            for (CouponModel model : waitList){
                model.setCouponState(COUPON_STATE_NORMAL);
                couponModelMapper.updateByPrimaryKey(model);
            }
        }

        CouponModelExample example = new CouponModelExample();
        example.createCriteria().andCouponStateEqualTo(COUPON_STATE_NORMAL)
                .andCouponEndTimeLessThanOrEqualTo(System.currentTimeMillis());
        List<CouponModel> expiredList = couponModelMapper.selectByExample(example);

        if (!expiredList.isEmpty()){
            for (CouponModel model : expiredList){
                model.setCouponState(COUPON_STATE_TERMINATED);
                couponModelMapper.updateByPrimaryKey(model);
            }
        }
    }


    public PageInfo<CouponModel> getCouponModelList(GetCouponListVO vo, Integer pageNo, Integer pageSize){

        updateCouponModelsState();

        CouponModelExample modelExample = new CouponModelExample();
        CouponModelExample.Criteria criteria = modelExample.createCriteria();
        if (vo.getCouponName() != null){
            criteria.andCouponNameLike(vo.getCouponName());
        }

        if (vo.getCouponType() != null){
            criteria.andCouponTypeEqualTo(vo.getCouponType());
        }

        if (vo.getCouponBeginTime() != null){
            criteria.andCouponBeginTimeGreaterThanOrEqualTo(vo.getCouponBeginTime());
        }

        if (vo.getCouponState() != null){
            criteria.andCouponStateEqualTo(vo.getCouponState());
        }

        if (vo.getCouponEndTime() != null){
            criteria.andCouponEndTimeLessThanOrEqualTo(vo.getCouponEndTime());
        }

        PageHelper.startPage(pageNo,pageSize,"couponID DESC");

        List<CouponModel> modelList = couponModelMapper.selectByExample(modelExample);

        PageInfo<CouponModel> pageInfo = new PageInfo<>(modelList);
        return pageInfo;
    }

    public void registerForVIP(String userID){
        CouponModelExample userCouponExample = new CouponModelExample();
        userCouponExample.createCriteria().andCouponReleaseWindowEqualTo(COUPON_RELEASE_WINDOW_RECHARGE);

        List<CouponModel> userCouponRes = couponModelMapper.selectByExample(userCouponExample);
        System.out.println("++++++++++++++++++++registerForVIP1+++++++++++++++++++++");
        System.out.println(userCouponRes.toString());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        if (!userCouponRes.isEmpty()){
            for (CouponModel model : userCouponRes){
                UserCouponExample example = new UserCouponExample();
                example.createCriteria().andCouponInnerSeqEqualTo(model.getCouponInnerSeq());
                List<UserCoupon> res = userCouponMapper.selectByExample(example);

                System.out.println("++++++++++++++++++++registerForVIP2+++++++++++++++++++++");
                System.out.println(res.toString());
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                if (res == null || res.isEmpty()){

                    UserCoupon userCoupon = new UserCoupon();

                    userCoupon.setUserID(userID);
                    userCoupon.setCouponName(model.getCouponName());
                    userCoupon.setCouponDescription(model.getCouponDescription());
                    userCoupon.setUserCouponState(USER_COUPON_STATE_NORMAL);
                    userCoupon.setCouponType(model.getCouponType());
                    userCoupon.setCouponInnerSeq(model.getCouponInnerSeq());
                    userCoupon.setDiscountType(model.getDiscountType());
                    userCoupon.setCouponAmount(model.getCouponAmount());
                    userCoupon.setDiscountLimit(model.getDiscountLimit());
                    userCoupon.setCouponBeginTime(model.getCouponBeginTime());
                    userCoupon.setCouponEndTime(model.getCouponEndTime());
                    System.out.println("+++++++++++++++++++insertCoupon:" + userCoupon.toString());
                    userCouponMapper.insert(userCoupon);
                }
            }
        }

        return ;
    }

    void updateUserCouponState(String userID){
        UserCouponExample userCouponExample = new UserCouponExample();
        userCouponExample.createCriteria().andUserIDEqualTo(userID).
                andUserCouponStateEqualTo(USER_COUPON_STATE_NORMAL).
                andCouponEndTimeLessThanOrEqualTo(System.currentTimeMillis());

        List<UserCoupon> userCouponRes = userCouponMapper.selectByExample(userCouponExample);
        if (!userCouponRes.isEmpty()){
            for (UserCoupon model : userCouponRes){
                model.setUserCouponState(USER_COUPON_STATE_EXPIRED);
                userCouponMapper.updateByPrimaryKey(model);
            }
        }
    }

    public List<UserCoupon> queryCouponListByUserID(String userID, Integer couponState){
        updateUserCouponState(userID);

        UserCouponExample example = new UserCouponExample();
        example.createCriteria().andUserIDEqualTo(userID).andUserCouponStateEqualTo(couponState);

        return userCouponMapper.selectByExample(example);
    }

    public Integer useCouponByID(Integer couponID){
        Integer res = 0;

        UserCoupon userCoupon = userCouponMapper.selectByPrimaryKey(couponID);

        if (userCoupon != null){
            userCoupon.setUserCouponState(USER_COUPON_STATE_USED);
            userCouponMapper.updateByPrimaryKey(userCoupon);
            res = 1;
        }
        return res;
    }

    public Integer gainedCouponByID(Integer couponID, String userID){
        Integer res;
        CouponModel model = couponModelMapper.selectByPrimaryKey(couponID);
        if (model == null){
            res = 0;
            return res;
        }

        if (model.getCouponEndTime() <= System.currentTimeMillis()){
            model.setCouponState(COUPON_STATE_TERMINATED);
            couponModelMapper.updateByPrimaryKey(model);
            res = 0;
        }else {
            UserCoupon userCoupon = new UserCoupon();

            userCoupon.setUserID(userID);
            userCoupon.setCouponName(model.getCouponName());
            userCoupon.setCouponDescription(model.getCouponDescription());
            userCoupon.setUserCouponState(USER_COUPON_STATE_NORMAL);
            userCoupon.setCouponType(model.getCouponType());
            userCoupon.setCouponInnerSeq(model.getCouponInnerSeq());
            userCoupon.setDiscountType(model.getDiscountType());
            userCoupon.setCouponAmount(model.getCouponAmount());
            userCoupon.setDiscountLimit(model.getDiscountLimit());
            userCoupon.setCouponBeginTime(model.getCouponBeginTime());
            userCoupon.setCouponEndTime(model.getCouponEndTime());

            userCouponMapper.insert(userCoupon);
            model.setCouponSendedNumber(model.getCouponSendedNumber() + 1);
            couponModelMapper.updateByPrimaryKey(model);
            res = 1;
        }

        return res;
    }

    public List<CouponModel> getAcceptedableCouponList(QueryAcceptedableCouponListVO queryVO){

        updateCouponModelsState();

        CouponModelExample exampleForQuery = new CouponModelExample();
        List<Integer> destList = new ArrayList<>();
        destList.add(COUPON_DEST_ALL);
        destList.add(queryVO.getUserType());

        exampleForQuery.createCriteria().andCouponStateEqualTo(COUPON_STATE_NORMAL)
                .andCouponReleaseWindowEqualTo(queryVO.getCouponReleaseWindow())
                .andDestinationIn(destList);

        List<CouponModel> resultList = couponModelMapper.selectByExample(exampleForQuery);

        if(!resultList.isEmpty()){
            for (CouponModel model : resultList){
                UserCouponExample userCouponExample = new UserCouponExample();
                userCouponExample.createCriteria().andUserIDEqualTo(queryVO.getUserID())
                        .andCouponTypeEqualTo(model.getCouponType()).andCouponInnerSeqEqualTo(model.getCouponInnerSeq());

                List<UserCoupon> userCouponRes = userCouponMapper.selectByExample(userCouponExample);
                if (!userCouponRes.isEmpty()){
                    model.setCouponState(COUPON_STATE_TERMINATED);
                }
            }
        }

        return resultList;
    }

    public CouponModel getCouponInfo(Integer couponID) {
        CouponModel model = couponModelMapper.selectByPrimaryKey(couponID);
        return model;
    }
}
