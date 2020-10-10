package com.example.springboot.service;

import com.example.springboot.dto.ProductCommentsDTO;
import com.example.springboot.entity.CommonImage;
import com.example.springboot.entity.OrderPurchaseOrder;
import com.example.springboot.entity.ProductComments;
import com.example.springboot.enumUtil.StateConstant;
import com.example.springboot.mapper.CommonImageMapper;
import com.example.springboot.mapper.OrderPurchaseOrderMapper;
import com.example.springboot.mapper.ProductCommentsMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yelang.shop.base.util.Plupload;
import com.yelang.shop.base.enumType.ImgType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Service
public class ProductCommentsService {
    @Autowired
    private ProductCommentsMapper productCommentsMapper;

    @Autowired
    private CommonImageMapper commonImageMapper;


    @Autowired
    private OrderPurchaseOrderMapper orderPurchaseOrderMapper;

    public PageInfo<ProductCommentsDTO> productCommentsListByPage(ProductCommentsDTO productCommentsDTO, Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize,"descriptionMatchScore DESC");

        List<ProductCommentsDTO> pageData = productCommentsMapper.productCommentsListByPage(productCommentsDTO);
        PageInfo<ProductCommentsDTO> pageInfo = new PageInfo<>(pageData);
        return pageInfo;
    }
    @Transactional
    public Integer add(MultipartFile[] files,ProductComments productComments) throws IOException {
        productComments.setCreatedTimestamp(System.currentTimeMillis());
        productComments.setLastModifiedTimeStamp(System.currentTimeMillis());
        productCommentsMapper.insertSelective(productComments);

        OrderPurchaseOrder order = orderPurchaseOrderMapper.selectByPrimaryKey(productComments.getOrderID());
        order.setOrderFrom(StateConstant.ORDER_COMMENTED);
        orderPurchaseOrderMapper.updateByPrimaryKey(order);
        //判断file数组不能为空并且长度大于0
        if(files != null && files.length > 0){
            for(MultipartFile file:files){
                Plupload plupload = new Plupload();
                Map<String, String> map = null;
                map = plupload.uploadImgToOSS(file, ImgType.PRODUCT_COMMENT_IMG.getTypeName());
                    if(map!=null){
                        CommonImage commonImage = new CommonImage();
                        commonImage.setImageUrl(map.get("fileUrl"));
                        commonImage.setFlag((short) 3);
                        if(productComments.getEvaluateID()!=null){
                            commonImage.setRelationID(productComments.getEvaluateID());
                        }
                        commonImageMapper.insertSelective(commonImage);
                    }
            }
        }
        return 1;
    }
}