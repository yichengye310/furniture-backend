package com.example.springboot.service;

import com.example.springboot.dto.ProductCategoryLevelTwoDTO;
import com.example.springboot.entity.ProductCategoryLevelThree;
import com.example.springboot.entity.ProductCategoryLevelTwo;
import com.example.springboot.mapper.ProductCategoryLevelThreeMapper;
import com.example.springboot.mapper.ProductCategoryLevelTwoMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yelang.shop.base.exception.JsonResponse;
import com.yelang.shop.base.exception.ServiceExceptionCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryService {
    @Autowired
    private ProductCategoryLevelTwoMapper productCategoryLevelTwoMapper;
    @Autowired
    private ProductCategoryLevelThreeMapper productCategoryLevelThreeMapper;

    public PageInfo<ProductCategoryLevelTwoDTO> categoryLevelTwoListByPage(ProductCategoryLevelTwoDTO productCategoryLevelTwoDTO, Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize,"categoryID ASC");
        List<ProductCategoryLevelTwoDTO> pageData = productCategoryLevelTwoMapper.productCategoryListByPage(productCategoryLevelTwoDTO);
        PageInfo<ProductCategoryLevelTwoDTO> pageInfo = new PageInfo<>(pageData);
        return pageInfo;
    }

    public PageInfo<ProductCategoryLevelThree> productCategoryLevelThreeListByPage(ProductCategoryLevelThree productCategoryLevelThree, Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize,"categoryID DESC");
        List<ProductCategoryLevelThree> pageData = productCategoryLevelThreeMapper.productCategoryLevelThreeListByPage(productCategoryLevelThree);
        PageInfo<ProductCategoryLevelThree> pageInfo = new PageInfo<>(pageData);
        return pageInfo;
    }
    public Integer categoryLevelThreeAdd(ProductCategoryLevelThree productCategoryLevelThree){
        return productCategoryLevelThreeMapper.insertSelective(productCategoryLevelThree);
    }
    public Integer categoryLevelTwoAdd(ProductCategoryLevelTwo productCategoryLevelTwo){
        return productCategoryLevelTwoMapper.insertSelective(productCategoryLevelTwo);
    }
    public Integer deleteCategoryLevelTwo(Integer categoryID){
        //step:1删除分类
        ProductCategoryLevelTwo productCategoryLevelTwo = new ProductCategoryLevelTwo();
        productCategoryLevelTwo.setCategoryID(categoryID);
        productCategoryLevelTwo.setCategoryState((short) 9);
        productCategoryLevelTwoMapper.updateByPrimaryKeySelective(productCategoryLevelTwo);
        //step:2删除分类下所有系列
        ProductCategoryLevelThree productCategoryLevelThree = new ProductCategoryLevelThree();
        productCategoryLevelThree.setParentID(categoryID);
        productCategoryLevelThree.setCategoryState((short) 9);
        productCategoryLevelThreeMapper.updateByPrimaryKeySelective(productCategoryLevelThree);
        return 1;
    }
    public Integer updateCategoryLevelTwo(ProductCategoryLevelTwo productCategoryLevelTwo){
        return productCategoryLevelTwoMapper.updateByPrimaryKeySelective(productCategoryLevelTwo);
    }
    public Integer updateCategoryLevelThree(ProductCategoryLevelThree productCategoryLevelThree){
        return productCategoryLevelThreeMapper.updateByPrimaryKeySelective(productCategoryLevelThree);
    }
    public Integer deleteCategoryLevelThree(Integer categoryID){
        ProductCategoryLevelThree productCategoryLevelThree = new ProductCategoryLevelThree();
        productCategoryLevelThree.setCategoryID(categoryID);
        productCategoryLevelThree.setCategoryState((short) 9);
        productCategoryLevelThreeMapper.updateByPrimaryKeySelective(productCategoryLevelThree);
        return 1;
    }
}
