package com.example.springboot.entity;

import java.util.ArrayList;
import java.util.List;

public class UserShoppingcartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserShoppingcartExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCartItemIDIsNull() {
            addCriterion("cartItemID is null");
            return (Criteria) this;
        }

        public Criteria andCartItemIDIsNotNull() {
            addCriterion("cartItemID is not null");
            return (Criteria) this;
        }

        public Criteria andCartItemIDEqualTo(Integer value) {
            addCriterion("cartItemID =", value, "cartItemID");
            return (Criteria) this;
        }

        public Criteria andCartItemIDNotEqualTo(Integer value) {
            addCriterion("cartItemID <>", value, "cartItemID");
            return (Criteria) this;
        }

        public Criteria andCartItemIDGreaterThan(Integer value) {
            addCriterion("cartItemID >", value, "cartItemID");
            return (Criteria) this;
        }

        public Criteria andCartItemIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("cartItemID >=", value, "cartItemID");
            return (Criteria) this;
        }

        public Criteria andCartItemIDLessThan(Integer value) {
            addCriterion("cartItemID <", value, "cartItemID");
            return (Criteria) this;
        }

        public Criteria andCartItemIDLessThanOrEqualTo(Integer value) {
            addCriterion("cartItemID <=", value, "cartItemID");
            return (Criteria) this;
        }

        public Criteria andCartItemIDIn(List<Integer> values) {
            addCriterion("cartItemID in", values, "cartItemID");
            return (Criteria) this;
        }

        public Criteria andCartItemIDNotIn(List<Integer> values) {
            addCriterion("cartItemID not in", values, "cartItemID");
            return (Criteria) this;
        }

        public Criteria andCartItemIDBetween(Integer value1, Integer value2) {
            addCriterion("cartItemID between", value1, value2, "cartItemID");
            return (Criteria) this;
        }

        public Criteria andCartItemIDNotBetween(Integer value1, Integer value2) {
            addCriterion("cartItemID not between", value1, value2, "cartItemID");
            return (Criteria) this;
        }

        public Criteria andProductIDIsNull() {
            addCriterion("productID is null");
            return (Criteria) this;
        }

        public Criteria andProductIDIsNotNull() {
            addCriterion("productID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIDEqualTo(Integer value) {
            addCriterion("productID =", value, "productID");
            return (Criteria) this;
        }

        public Criteria andProductIDNotEqualTo(Integer value) {
            addCriterion("productID <>", value, "productID");
            return (Criteria) this;
        }

        public Criteria andProductIDGreaterThan(Integer value) {
            addCriterion("productID >", value, "productID");
            return (Criteria) this;
        }

        public Criteria andProductIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("productID >=", value, "productID");
            return (Criteria) this;
        }

        public Criteria andProductIDLessThan(Integer value) {
            addCriterion("productID <", value, "productID");
            return (Criteria) this;
        }

        public Criteria andProductIDLessThanOrEqualTo(Integer value) {
            addCriterion("productID <=", value, "productID");
            return (Criteria) this;
        }

        public Criteria andProductIDIn(List<Integer> values) {
            addCriterion("productID in", values, "productID");
            return (Criteria) this;
        }

        public Criteria andProductIDNotIn(List<Integer> values) {
            addCriterion("productID not in", values, "productID");
            return (Criteria) this;
        }

        public Criteria andProductIDBetween(Integer value1, Integer value2) {
            addCriterion("productID between", value1, value2, "productID");
            return (Criteria) this;
        }

        public Criteria andProductIDNotBetween(Integer value1, Integer value2) {
            addCriterion("productID not between", value1, value2, "productID");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("productName is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("productName is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("productName =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("productName <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("productName >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("productName >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("productName <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("productName <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("productName like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("productName not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("productName in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("productName not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("productName between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("productName not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductStandardIDIsNull() {
            addCriterion("productStandardID is null");
            return (Criteria) this;
        }

        public Criteria andProductStandardIDIsNotNull() {
            addCriterion("productStandardID is not null");
            return (Criteria) this;
        }

        public Criteria andProductStandardIDEqualTo(Integer value) {
            addCriterion("productStandardID =", value, "productStandardID");
            return (Criteria) this;
        }

        public Criteria andProductStandardIDNotEqualTo(Integer value) {
            addCriterion("productStandardID <>", value, "productStandardID");
            return (Criteria) this;
        }

        public Criteria andProductStandardIDGreaterThan(Integer value) {
            addCriterion("productStandardID >", value, "productStandardID");
            return (Criteria) this;
        }

        public Criteria andProductStandardIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("productStandardID >=", value, "productStandardID");
            return (Criteria) this;
        }

        public Criteria andProductStandardIDLessThan(Integer value) {
            addCriterion("productStandardID <", value, "productStandardID");
            return (Criteria) this;
        }

        public Criteria andProductStandardIDLessThanOrEqualTo(Integer value) {
            addCriterion("productStandardID <=", value, "productStandardID");
            return (Criteria) this;
        }

        public Criteria andProductStandardIDIn(List<Integer> values) {
            addCriterion("productStandardID in", values, "productStandardID");
            return (Criteria) this;
        }

        public Criteria andProductStandardIDNotIn(List<Integer> values) {
            addCriterion("productStandardID not in", values, "productStandardID");
            return (Criteria) this;
        }

        public Criteria andProductStandardIDBetween(Integer value1, Integer value2) {
            addCriterion("productStandardID between", value1, value2, "productStandardID");
            return (Criteria) this;
        }

        public Criteria andProductStandardIDNotBetween(Integer value1, Integer value2) {
            addCriterion("productStandardID not between", value1, value2, "productStandardID");
            return (Criteria) this;
        }

        public Criteria andProductStandardIsNull() {
            addCriterion("productStandard is null");
            return (Criteria) this;
        }

        public Criteria andProductStandardIsNotNull() {
            addCriterion("productStandard is not null");
            return (Criteria) this;
        }

        public Criteria andProductStandardEqualTo(String value) {
            addCriterion("productStandard =", value, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardNotEqualTo(String value) {
            addCriterion("productStandard <>", value, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardGreaterThan(String value) {
            addCriterion("productStandard >", value, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardGreaterThanOrEqualTo(String value) {
            addCriterion("productStandard >=", value, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardLessThan(String value) {
            addCriterion("productStandard <", value, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardLessThanOrEqualTo(String value) {
            addCriterion("productStandard <=", value, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardLike(String value) {
            addCriterion("productStandard like", value, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardNotLike(String value) {
            addCriterion("productStandard not like", value, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardIn(List<String> values) {
            addCriterion("productStandard in", values, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardNotIn(List<String> values) {
            addCriterion("productStandard not in", values, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardBetween(String value1, String value2) {
            addCriterion("productStandard between", value1, value2, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardNotBetween(String value1, String value2) {
            addCriterion("productStandard not between", value1, value2, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductColourIDIsNull() {
            addCriterion("productColourID is null");
            return (Criteria) this;
        }

        public Criteria andProductColourIDIsNotNull() {
            addCriterion("productColourID is not null");
            return (Criteria) this;
        }

        public Criteria andProductColourIDEqualTo(Integer value) {
            addCriterion("productColourID =", value, "productColourID");
            return (Criteria) this;
        }

        public Criteria andProductColourIDNotEqualTo(Integer value) {
            addCriterion("productColourID <>", value, "productColourID");
            return (Criteria) this;
        }

        public Criteria andProductColourIDGreaterThan(Integer value) {
            addCriterion("productColourID >", value, "productColourID");
            return (Criteria) this;
        }

        public Criteria andProductColourIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("productColourID >=", value, "productColourID");
            return (Criteria) this;
        }

        public Criteria andProductColourIDLessThan(Integer value) {
            addCriterion("productColourID <", value, "productColourID");
            return (Criteria) this;
        }

        public Criteria andProductColourIDLessThanOrEqualTo(Integer value) {
            addCriterion("productColourID <=", value, "productColourID");
            return (Criteria) this;
        }

        public Criteria andProductColourIDIn(List<Integer> values) {
            addCriterion("productColourID in", values, "productColourID");
            return (Criteria) this;
        }

        public Criteria andProductColourIDNotIn(List<Integer> values) {
            addCriterion("productColourID not in", values, "productColourID");
            return (Criteria) this;
        }

        public Criteria andProductColourIDBetween(Integer value1, Integer value2) {
            addCriterion("productColourID between", value1, value2, "productColourID");
            return (Criteria) this;
        }

        public Criteria andProductColourIDNotBetween(Integer value1, Integer value2) {
            addCriterion("productColourID not between", value1, value2, "productColourID");
            return (Criteria) this;
        }

        public Criteria andProductColourIsNull() {
            addCriterion("productColour is null");
            return (Criteria) this;
        }

        public Criteria andProductColourIsNotNull() {
            addCriterion("productColour is not null");
            return (Criteria) this;
        }

        public Criteria andProductColourEqualTo(String value) {
            addCriterion("productColour =", value, "productColour");
            return (Criteria) this;
        }

        public Criteria andProductColourNotEqualTo(String value) {
            addCriterion("productColour <>", value, "productColour");
            return (Criteria) this;
        }

        public Criteria andProductColourGreaterThan(String value) {
            addCriterion("productColour >", value, "productColour");
            return (Criteria) this;
        }

        public Criteria andProductColourGreaterThanOrEqualTo(String value) {
            addCriterion("productColour >=", value, "productColour");
            return (Criteria) this;
        }

        public Criteria andProductColourLessThan(String value) {
            addCriterion("productColour <", value, "productColour");
            return (Criteria) this;
        }

        public Criteria andProductColourLessThanOrEqualTo(String value) {
            addCriterion("productColour <=", value, "productColour");
            return (Criteria) this;
        }

        public Criteria andProductColourLike(String value) {
            addCriterion("productColour like", value, "productColour");
            return (Criteria) this;
        }

        public Criteria andProductColourNotLike(String value) {
            addCriterion("productColour not like", value, "productColour");
            return (Criteria) this;
        }

        public Criteria andProductColourIn(List<String> values) {
            addCriterion("productColour in", values, "productColour");
            return (Criteria) this;
        }

        public Criteria andProductColourNotIn(List<String> values) {
            addCriterion("productColour not in", values, "productColour");
            return (Criteria) this;
        }

        public Criteria andProductColourBetween(String value1, String value2) {
            addCriterion("productColour between", value1, value2, "productColour");
            return (Criteria) this;
        }

        public Criteria andProductColourNotBetween(String value1, String value2) {
            addCriterion("productColour not between", value1, value2, "productColour");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageIsNull() {
            addCriterion("productTitleImage is null");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageIsNotNull() {
            addCriterion("productTitleImage is not null");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageEqualTo(String value) {
            addCriterion("productTitleImage =", value, "productTitleImage");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageNotEqualTo(String value) {
            addCriterion("productTitleImage <>", value, "productTitleImage");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageGreaterThan(String value) {
            addCriterion("productTitleImage >", value, "productTitleImage");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageGreaterThanOrEqualTo(String value) {
            addCriterion("productTitleImage >=", value, "productTitleImage");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageLessThan(String value) {
            addCriterion("productTitleImage <", value, "productTitleImage");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageLessThanOrEqualTo(String value) {
            addCriterion("productTitleImage <=", value, "productTitleImage");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageLike(String value) {
            addCriterion("productTitleImage like", value, "productTitleImage");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageNotLike(String value) {
            addCriterion("productTitleImage not like", value, "productTitleImage");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageIn(List<String> values) {
            addCriterion("productTitleImage in", values, "productTitleImage");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageNotIn(List<String> values) {
            addCriterion("productTitleImage not in", values, "productTitleImage");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageBetween(String value1, String value2) {
            addCriterion("productTitleImage between", value1, value2, "productTitleImage");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageNotBetween(String value1, String value2) {
            addCriterion("productTitleImage not between", value1, value2, "productTitleImage");
            return (Criteria) this;
        }

        public Criteria andUserIDIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUserIDIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIDEqualTo(String value) {
            addCriterion("userID =", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotEqualTo(String value) {
            addCriterion("userID <>", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDGreaterThan(String value) {
            addCriterion("userID >", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDGreaterThanOrEqualTo(String value) {
            addCriterion("userID >=", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDLessThan(String value) {
            addCriterion("userID <", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDLessThanOrEqualTo(String value) {
            addCriterion("userID <=", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDLike(String value) {
            addCriterion("userID like", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotLike(String value) {
            addCriterion("userID not like", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDIn(List<String> values) {
            addCriterion("userID in", values, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotIn(List<String> values) {
            addCriterion("userID not in", values, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDBetween(String value1, String value2) {
            addCriterion("userID between", value1, value2, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotBetween(String value1, String value2) {
            addCriterion("userID not between", value1, value2, "userID");
            return (Criteria) this;
        }

        public Criteria andAddedNumIsNull() {
            addCriterion("addedNum is null");
            return (Criteria) this;
        }

        public Criteria andAddedNumIsNotNull() {
            addCriterion("addedNum is not null");
            return (Criteria) this;
        }

        public Criteria andAddedNumEqualTo(Integer value) {
            addCriterion("addedNum =", value, "addedNum");
            return (Criteria) this;
        }

        public Criteria andAddedNumNotEqualTo(Integer value) {
            addCriterion("addedNum <>", value, "addedNum");
            return (Criteria) this;
        }

        public Criteria andAddedNumGreaterThan(Integer value) {
            addCriterion("addedNum >", value, "addedNum");
            return (Criteria) this;
        }

        public Criteria andAddedNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("addedNum >=", value, "addedNum");
            return (Criteria) this;
        }

        public Criteria andAddedNumLessThan(Integer value) {
            addCriterion("addedNum <", value, "addedNum");
            return (Criteria) this;
        }

        public Criteria andAddedNumLessThanOrEqualTo(Integer value) {
            addCriterion("addedNum <=", value, "addedNum");
            return (Criteria) this;
        }

        public Criteria andAddedNumIn(List<Integer> values) {
            addCriterion("addedNum in", values, "addedNum");
            return (Criteria) this;
        }

        public Criteria andAddedNumNotIn(List<Integer> values) {
            addCriterion("addedNum not in", values, "addedNum");
            return (Criteria) this;
        }

        public Criteria andAddedNumBetween(Integer value1, Integer value2) {
            addCriterion("addedNum between", value1, value2, "addedNum");
            return (Criteria) this;
        }

        public Criteria andAddedNumNotBetween(Integer value1, Integer value2) {
            addCriterion("addedNum not between", value1, value2, "addedNum");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNull() {
            addCriterion("marketPrice is null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNotNull() {
            addCriterion("marketPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceEqualTo(Integer value) {
            addCriterion("marketPrice =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(Integer value) {
            addCriterion("marketPrice <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(Integer value) {
            addCriterion("marketPrice >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("marketPrice >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(Integer value) {
            addCriterion("marketPrice <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(Integer value) {
            addCriterion("marketPrice <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<Integer> values) {
            addCriterion("marketPrice in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<Integer> values) {
            addCriterion("marketPrice not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(Integer value1, Integer value2) {
            addCriterion("marketPrice between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("marketPrice not between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceIsNull() {
            addCriterion("realPrice is null");
            return (Criteria) this;
        }

        public Criteria andRealPriceIsNotNull() {
            addCriterion("realPrice is not null");
            return (Criteria) this;
        }

        public Criteria andRealPriceEqualTo(Integer value) {
            addCriterion("realPrice =", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceNotEqualTo(Integer value) {
            addCriterion("realPrice <>", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceGreaterThan(Integer value) {
            addCriterion("realPrice >", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("realPrice >=", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceLessThan(Integer value) {
            addCriterion("realPrice <", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceLessThanOrEqualTo(Integer value) {
            addCriterion("realPrice <=", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceIn(List<Integer> values) {
            addCriterion("realPrice in", values, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceNotIn(List<Integer> values) {
            addCriterion("realPrice not in", values, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceBetween(Integer value1, Integer value2) {
            addCriterion("realPrice between", value1, value2, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("realPrice not between", value1, value2, "realPrice");
            return (Criteria) this;
        }

        public Criteria andItemCreatedTimeIsNull() {
            addCriterion("itemCreatedTime is null");
            return (Criteria) this;
        }

        public Criteria andItemCreatedTimeIsNotNull() {
            addCriterion("itemCreatedTime is not null");
            return (Criteria) this;
        }

        public Criteria andItemCreatedTimeEqualTo(Long value) {
            addCriterion("itemCreatedTime =", value, "itemCreatedTime");
            return (Criteria) this;
        }

        public Criteria andItemCreatedTimeNotEqualTo(Long value) {
            addCriterion("itemCreatedTime <>", value, "itemCreatedTime");
            return (Criteria) this;
        }

        public Criteria andItemCreatedTimeGreaterThan(Long value) {
            addCriterion("itemCreatedTime >", value, "itemCreatedTime");
            return (Criteria) this;
        }

        public Criteria andItemCreatedTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("itemCreatedTime >=", value, "itemCreatedTime");
            return (Criteria) this;
        }

        public Criteria andItemCreatedTimeLessThan(Long value) {
            addCriterion("itemCreatedTime <", value, "itemCreatedTime");
            return (Criteria) this;
        }

        public Criteria andItemCreatedTimeLessThanOrEqualTo(Long value) {
            addCriterion("itemCreatedTime <=", value, "itemCreatedTime");
            return (Criteria) this;
        }

        public Criteria andItemCreatedTimeIn(List<Long> values) {
            addCriterion("itemCreatedTime in", values, "itemCreatedTime");
            return (Criteria) this;
        }

        public Criteria andItemCreatedTimeNotIn(List<Long> values) {
            addCriterion("itemCreatedTime not in", values, "itemCreatedTime");
            return (Criteria) this;
        }

        public Criteria andItemCreatedTimeBetween(Long value1, Long value2) {
            addCriterion("itemCreatedTime between", value1, value2, "itemCreatedTime");
            return (Criteria) this;
        }

        public Criteria andItemCreatedTimeNotBetween(Long value1, Long value2) {
            addCriterion("itemCreatedTime not between", value1, value2, "itemCreatedTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}