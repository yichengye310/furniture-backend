package com.example.springboot.websocket;

import com.example.springboot.dto.CouPonModelDto;
import com.example.springboot.entity.Product;
import com.example.springboot.entity.ProductLimitedTime;
import com.example.springboot.mapper.CouponModelMapper;
import com.example.springboot.mapper.ProductLimitedTimeMapper;
import com.example.springboot.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


/**
 * 在静态工具类中注入mapper的方式示例
 */
@Component
public class CodeMapUtils {

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductLimitedTimeMapper productLimitedTimeMapper;
    @Autowired
    private CouponModelMapper couponModelMapper;

    private static CodeMapUtils codeMapUtils;



    @PostConstruct
    public void init() {
        codeMapUtils = this;
        codeMapUtils.productMapper = this.productMapper;
    }
    public static Product queryProduct(Integer productID) {
        Product product = codeMapUtils.productMapper.selectByPrimaryKey(productID);
        return product;
    }
    public static ProductLimitedTime queryProductLimitedTime(Integer productLimitedTimeID) {
        ProductLimitedTime productLimitedTime = codeMapUtils.productLimitedTimeMapper.selectByPrimaryKey(productLimitedTimeID);
        return productLimitedTime;
    }
    public static CouPonModelDto queryCouponModel(Integer couponID) {
        CouPonModelDto couPonModelDto = codeMapUtils.couponModelMapper.queryCouponModel(couponID);
        return couPonModelDto;
    }
}