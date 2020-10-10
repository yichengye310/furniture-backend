package com.example.springboot.service;
import com.example.springboot.dto.ProductDTO;
import com.example.springboot.dto.UserAddShoppingCartDTO;
import com.example.springboot.dto.UserShoppingcartQueryDTO;
import com.example.springboot.entity.ProductStandards;
import com.example.springboot.entity.ProductStandardsColour;
import com.example.springboot.entity.UserShoppingcart;
import com.example.springboot.entity.UserShoppingcartExample;
import com.example.springboot.mapper.ProductMapper;
import com.example.springboot.mapper.ProductStandardsColourMapper;
import com.example.springboot.mapper.ProductStandardsMapper;
import com.example.springboot.mapper.UserShoppingcartMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserShoppingCartService {
    @Autowired
    private UserShoppingcartMapper userShoppingcartMapper;

    @Autowired
    private ProductStandardsMapper productStandardsMapper;

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductStandardsColourMapper productStandardsColourMapper;

    /**
     * 将商品添加进用户购物车
     * @param userAddShoppingCartDTO
     * @return
     */
    public UserShoppingcart add(UserAddShoppingCartDTO userAddShoppingCartDTO){

        UserShoppingcartExample example = new UserShoppingcartExample();
        example.createCriteria().andUserIDEqualTo(userAddShoppingCartDTO.getUserID()).
                andProductIDEqualTo(userAddShoppingCartDTO.getProductID()).
                andProductStandardIDEqualTo(userAddShoppingCartDTO.getProductStandardID()).
                andProductColourIDEqualTo(userAddShoppingCartDTO.getProductColourID());

        List<UserShoppingcart> carts = userShoppingcartMapper.selectByExample(example);
        if (carts != null && (!carts.isEmpty())){
            UserShoppingcart cart = carts.get(0);
            cart.setAddedNum(cart.getAddedNum() + userAddShoppingCartDTO.getAddedNum());
            Integer res = userShoppingcartMapper.updateByPrimaryKey(cart);
            if (res == 1)
            {
                return cart;
            }
            else
            {
                return null;
            }
        }
        else {
            UserShoppingcart userShoppingcart = new UserShoppingcart();

            //产品ID
            Integer productID = userAddShoppingCartDTO.getProductID();
            ProductDTO product = productMapper.selectByPrimaryKey(productID);
            userShoppingcart.setProductID(productID);
            userShoppingcart.setProductName(product.getProductName());

            //产品规格ID
            Integer productStandardID = userAddShoppingCartDTO.getProductStandardID();
            ProductStandards standard = productStandardsMapper.selectByPrimaryKey(productStandardID);
            userShoppingcart.setProductStandardID(productStandardID);
            userShoppingcart.setProductStandard(standard.getStandard());

            //产品颜色ID
            Integer productColourID = userAddShoppingCartDTO.getProductColourID();
            ProductStandardsColour colour = productStandardsColourMapper.selectByPrimaryKey(productColourID);
            userShoppingcart.setProductColourID(productColourID);
            userShoppingcart.setProductColour(colour.getColourName());
            userShoppingcart.setProductTitleImage(colour.getColourImage());

            //加入购物车数量
            Integer addedNum = userAddShoppingCartDTO.getAddedNum();
            userShoppingcart.setAddedNum(addedNum);

            //用户ID
            String userID = userAddShoppingCartDTO.getUserID();
            userShoppingcart.setUserID(userID);
            userShoppingcart.setRealPrice(standard.getBandPrice());
            //userShoppingcart.setRealPrice(product.getRealPrice());
            userShoppingcart.setItemCreatedTime(System.currentTimeMillis());

            Integer res = userShoppingcartMapper.insert(userShoppingcart);
            if (res == 1) {
                return userShoppingcart;
            } else {
                return null;
            }
        }
    }

    /**
     * 根据购物车条目ID列表查询条目信息
     * @param cartItemIDList
     * @return
     */
    public List<UserShoppingcart> queryItemByIDList(List<Integer> cartItemIDList)
    {
        UserShoppingcartExample example = new UserShoppingcartExample();
        example.createCriteria().andCartItemIDIn(cartItemIDList);
        return userShoppingcartMapper.selectByExample(example);
    }

    /**
     * 根据购物车条目ID列表删除条目信息
     * @param cartItemIDList
     * @return
     */
    public Integer deleteItemByIDList(List<Integer> cartItemIDList)
    {
        UserShoppingcartExample example = new UserShoppingcartExample();
        example.createCriteria().andCartItemIDIn(cartItemIDList);
        return userShoppingcartMapper.deleteByExample(example);
    }

    /**
     * 根据购物车条目ID查询条目信息
     * @param itemID
     * @return
     */
    public UserShoppingcart queryItemByID(Integer itemID)
    {
        return userShoppingcartMapper.selectByPrimaryKey(itemID);
    }

    /**
     * 根据购物车条目ID删除条目信息
     * @param itemID
     * @return
     */
    public Integer deleteItemByID(Integer itemID)
    {
        return userShoppingcartMapper.deleteByPrimaryKey(itemID);
    }

    /**
     * 根据购物车条目ID更新条目信息
     * @param userShoppingcart
     * @return
     */
    public Integer modifyItemByID(UserShoppingcart userShoppingcart)
    {
        return userShoppingcartMapper.updateByPrimaryKey(userShoppingcart);
    }


    /**
     * 分页查询购物车条目
     * @param userID
     * @param pageNo
     * @param pageSize
     * @return
     */
    public PageInfo<UserShoppingcartQueryDTO> shoppingCartListByPage(String userID, Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize,"cartItemID DESC");

        UserShoppingcartExample userShoppingcartExample = new UserShoppingcartExample();
        userShoppingcartExample.createCriteria().andUserIDEqualTo(userID);

        List<UserShoppingcart> pageData = userShoppingcartMapper.selectByExample(userShoppingcartExample);

        List<UserShoppingcartQueryDTO> dtos = new ArrayList<>();
        for(UserShoppingcart cart : pageData){
            ProductDTO product = productMapper.selectByPrimaryKey(cart.getProductID());

            if (product == null){
                continue;
            }

            UserShoppingcartQueryDTO dto = new UserShoppingcartQueryDTO();
            dto.setCartItemID(cart.getCartItemID());
            dto.setProductID(cart.getProductID());
            dto.setProductName(cart.getProductName());
            dto.setProductStandardID(cart.getProductStandardID());
            dto.setProductStandard(cart.getProductStandard());
            dto.setProductColourID(cart.getProductColourID());
            dto.setProductColour(cart.getProductColour());
            dto.setProductTitleImage(cart.getProductTitleImage());
            dto.setUserID(cart.getUserID());
            dto.setAddedNum(cart.getAddedNum());
            dto.setRealPrice(cart.getRealPrice());
            dto.setItemCreatedTime(cart.getItemCreatedTime());

            dto.setProductState(product.getState());
            dtos.add(dto);
        }

        PageInfo<UserShoppingcartQueryDTO> pageInfo = new PageInfo<>(dtos);
        return pageInfo;
    }

}
