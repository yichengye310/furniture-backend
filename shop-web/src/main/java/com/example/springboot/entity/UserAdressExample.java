package com.example.springboot.entity;

import java.util.ArrayList;
import java.util.List;

public class UserAdressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAdressExample() {
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

        public Criteria andUserAddressIDIsNull() {
            addCriterion("userAddressID is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIDIsNotNull() {
            addCriterion("userAddressID is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIDEqualTo(Integer value) {
            addCriterion("userAddressID =", value, "userAddressID");
            return (Criteria) this;
        }

        public Criteria andUserAddressIDNotEqualTo(Integer value) {
            addCriterion("userAddressID <>", value, "userAddressID");
            return (Criteria) this;
        }

        public Criteria andUserAddressIDGreaterThan(Integer value) {
            addCriterion("userAddressID >", value, "userAddressID");
            return (Criteria) this;
        }

        public Criteria andUserAddressIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("userAddressID >=", value, "userAddressID");
            return (Criteria) this;
        }

        public Criteria andUserAddressIDLessThan(Integer value) {
            addCriterion("userAddressID <", value, "userAddressID");
            return (Criteria) this;
        }

        public Criteria andUserAddressIDLessThanOrEqualTo(Integer value) {
            addCriterion("userAddressID <=", value, "userAddressID");
            return (Criteria) this;
        }

        public Criteria andUserAddressIDIn(List<Integer> values) {
            addCriterion("userAddressID in", values, "userAddressID");
            return (Criteria) this;
        }

        public Criteria andUserAddressIDNotIn(List<Integer> values) {
            addCriterion("userAddressID not in", values, "userAddressID");
            return (Criteria) this;
        }

        public Criteria andUserAddressIDBetween(Integer value1, Integer value2) {
            addCriterion("userAddressID between", value1, value2, "userAddressID");
            return (Criteria) this;
        }

        public Criteria andUserAddressIDNotBetween(Integer value1, Integer value2) {
            addCriterion("userAddressID not between", value1, value2, "userAddressID");
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

        public Criteria andUsualIsNull() {
            addCriterion("usual is null");
            return (Criteria) this;
        }

        public Criteria andUsualIsNotNull() {
            addCriterion("usual is not null");
            return (Criteria) this;
        }

        public Criteria andUsualEqualTo(Short value) {
            addCriterion("usual =", value, "usual");
            return (Criteria) this;
        }

        public Criteria andUsualNotEqualTo(Short value) {
            addCriterion("usual <>", value, "usual");
            return (Criteria) this;
        }

        public Criteria andUsualGreaterThan(Short value) {
            addCriterion("usual >", value, "usual");
            return (Criteria) this;
        }

        public Criteria andUsualGreaterThanOrEqualTo(Short value) {
            addCriterion("usual >=", value, "usual");
            return (Criteria) this;
        }

        public Criteria andUsualLessThan(Short value) {
            addCriterion("usual <", value, "usual");
            return (Criteria) this;
        }

        public Criteria andUsualLessThanOrEqualTo(Short value) {
            addCriterion("usual <=", value, "usual");
            return (Criteria) this;
        }

        public Criteria andUsualIn(List<Short> values) {
            addCriterion("usual in", values, "usual");
            return (Criteria) this;
        }

        public Criteria andUsualNotIn(List<Short> values) {
            addCriterion("usual not in", values, "usual");
            return (Criteria) this;
        }

        public Criteria andUsualBetween(Short value1, Short value2) {
            addCriterion("usual between", value1, value2, "usual");
            return (Criteria) this;
        }

        public Criteria andUsualNotBetween(Short value1, Short value2) {
            addCriterion("usual not between", value1, value2, "usual");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNull() {
            addCriterion("receiverName is null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNotNull() {
            addCriterion("receiverName is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameEqualTo(String value) {
            addCriterion("receiverName =", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotEqualTo(String value) {
            addCriterion("receiverName <>", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThan(String value) {
            addCriterion("receiverName >", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThanOrEqualTo(String value) {
            addCriterion("receiverName >=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThan(String value) {
            addCriterion("receiverName <", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThanOrEqualTo(String value) {
            addCriterion("receiverName <=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLike(String value) {
            addCriterion("receiverName like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotLike(String value) {
            addCriterion("receiverName not like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIn(List<String> values) {
            addCriterion("receiverName in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotIn(List<String> values) {
            addCriterion("receiverName not in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameBetween(String value1, String value2) {
            addCriterion("receiverName between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotBetween(String value1, String value2) {
            addCriterion("receiverName not between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIDIsNull() {
            addCriterion("provinceID is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIDIsNotNull() {
            addCriterion("provinceID is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIDEqualTo(Integer value) {
            addCriterion("provinceID =", value, "provinceID");
            return (Criteria) this;
        }

        public Criteria andProvinceIDNotEqualTo(Integer value) {
            addCriterion("provinceID <>", value, "provinceID");
            return (Criteria) this;
        }

        public Criteria andProvinceIDGreaterThan(Integer value) {
            addCriterion("provinceID >", value, "provinceID");
            return (Criteria) this;
        }

        public Criteria andProvinceIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("provinceID >=", value, "provinceID");
            return (Criteria) this;
        }

        public Criteria andProvinceIDLessThan(Integer value) {
            addCriterion("provinceID <", value, "provinceID");
            return (Criteria) this;
        }

        public Criteria andProvinceIDLessThanOrEqualTo(Integer value) {
            addCriterion("provinceID <=", value, "provinceID");
            return (Criteria) this;
        }

        public Criteria andProvinceIDIn(List<Integer> values) {
            addCriterion("provinceID in", values, "provinceID");
            return (Criteria) this;
        }

        public Criteria andProvinceIDNotIn(List<Integer> values) {
            addCriterion("provinceID not in", values, "provinceID");
            return (Criteria) this;
        }

        public Criteria andProvinceIDBetween(Integer value1, Integer value2) {
            addCriterion("provinceID between", value1, value2, "provinceID");
            return (Criteria) this;
        }

        public Criteria andProvinceIDNotBetween(Integer value1, Integer value2) {
            addCriterion("provinceID not between", value1, value2, "provinceID");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityIDIsNull() {
            addCriterion("cityID is null");
            return (Criteria) this;
        }

        public Criteria andCityIDIsNotNull() {
            addCriterion("cityID is not null");
            return (Criteria) this;
        }

        public Criteria andCityIDEqualTo(Integer value) {
            addCriterion("cityID =", value, "cityID");
            return (Criteria) this;
        }

        public Criteria andCityIDNotEqualTo(Integer value) {
            addCriterion("cityID <>", value, "cityID");
            return (Criteria) this;
        }

        public Criteria andCityIDGreaterThan(Integer value) {
            addCriterion("cityID >", value, "cityID");
            return (Criteria) this;
        }

        public Criteria andCityIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("cityID >=", value, "cityID");
            return (Criteria) this;
        }

        public Criteria andCityIDLessThan(Integer value) {
            addCriterion("cityID <", value, "cityID");
            return (Criteria) this;
        }

        public Criteria andCityIDLessThanOrEqualTo(Integer value) {
            addCriterion("cityID <=", value, "cityID");
            return (Criteria) this;
        }

        public Criteria andCityIDIn(List<Integer> values) {
            addCriterion("cityID in", values, "cityID");
            return (Criteria) this;
        }

        public Criteria andCityIDNotIn(List<Integer> values) {
            addCriterion("cityID not in", values, "cityID");
            return (Criteria) this;
        }

        public Criteria andCityIDBetween(Integer value1, Integer value2) {
            addCriterion("cityID between", value1, value2, "cityID");
            return (Criteria) this;
        }

        public Criteria andCityIDNotBetween(Integer value1, Integer value2) {
            addCriterion("cityID not between", value1, value2, "cityID");
            return (Criteria) this;
        }

        public Criteria andCountyIsNull() {
            addCriterion("county is null");
            return (Criteria) this;
        }

        public Criteria andCountyIsNotNull() {
            addCriterion("county is not null");
            return (Criteria) this;
        }

        public Criteria andCountyEqualTo(String value) {
            addCriterion("county =", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotEqualTo(String value) {
            addCriterion("county <>", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThan(String value) {
            addCriterion("county >", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThanOrEqualTo(String value) {
            addCriterion("county >=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThan(String value) {
            addCriterion("county <", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThanOrEqualTo(String value) {
            addCriterion("county <=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLike(String value) {
            addCriterion("county like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotLike(String value) {
            addCriterion("county not like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyIn(List<String> values) {
            addCriterion("county in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotIn(List<String> values) {
            addCriterion("county not in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyBetween(String value1, String value2) {
            addCriterion("county between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotBetween(String value1, String value2) {
            addCriterion("county not between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andCountyIDIsNull() {
            addCriterion("countyID is null");
            return (Criteria) this;
        }

        public Criteria andCountyIDIsNotNull() {
            addCriterion("countyID is not null");
            return (Criteria) this;
        }

        public Criteria andCountyIDEqualTo(Integer value) {
            addCriterion("countyID =", value, "countyID");
            return (Criteria) this;
        }

        public Criteria andCountyIDNotEqualTo(Integer value) {
            addCriterion("countyID <>", value, "countyID");
            return (Criteria) this;
        }

        public Criteria andCountyIDGreaterThan(Integer value) {
            addCriterion("countyID >", value, "countyID");
            return (Criteria) this;
        }

        public Criteria andCountyIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("countyID >=", value, "countyID");
            return (Criteria) this;
        }

        public Criteria andCountyIDLessThan(Integer value) {
            addCriterion("countyID <", value, "countyID");
            return (Criteria) this;
        }

        public Criteria andCountyIDLessThanOrEqualTo(Integer value) {
            addCriterion("countyID <=", value, "countyID");
            return (Criteria) this;
        }

        public Criteria andCountyIDIn(List<Integer> values) {
            addCriterion("countyID in", values, "countyID");
            return (Criteria) this;
        }

        public Criteria andCountyIDNotIn(List<Integer> values) {
            addCriterion("countyID not in", values, "countyID");
            return (Criteria) this;
        }

        public Criteria andCountyIDBetween(Integer value1, Integer value2) {
            addCriterion("countyID between", value1, value2, "countyID");
            return (Criteria) this;
        }

        public Criteria andCountyIDNotBetween(Integer value1, Integer value2) {
            addCriterion("countyID not between", value1, value2, "countyID");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNull() {
            addCriterion("postCode is null");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNotNull() {
            addCriterion("postCode is not null");
            return (Criteria) this;
        }

        public Criteria andPostCodeEqualTo(String value) {
            addCriterion("postCode =", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotEqualTo(String value) {
            addCriterion("postCode <>", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThan(String value) {
            addCriterion("postCode >", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThanOrEqualTo(String value) {
            addCriterion("postCode >=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThan(String value) {
            addCriterion("postCode <", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThanOrEqualTo(String value) {
            addCriterion("postCode <=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLike(String value) {
            addCriterion("postCode like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotLike(String value) {
            addCriterion("postCode not like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeIn(List<String> values) {
            addCriterion("postCode in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotIn(List<String> values) {
            addCriterion("postCode not in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeBetween(String value1, String value2) {
            addCriterion("postCode between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotBetween(String value1, String value2) {
            addCriterion("postCode not between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNull() {
            addCriterion("mobilePhone is null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNotNull() {
            addCriterion("mobilePhone is not null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneEqualTo(String value) {
            addCriterion("mobilePhone =", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotEqualTo(String value) {
            addCriterion("mobilePhone <>", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThan(String value) {
            addCriterion("mobilePhone >", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("mobilePhone >=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThan(String value) {
            addCriterion("mobilePhone <", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("mobilePhone <=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLike(String value) {
            addCriterion("mobilePhone like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotLike(String value) {
            addCriterion("mobilePhone not like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIn(List<String> values) {
            addCriterion("mobilePhone in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotIn(List<String> values) {
            addCriterion("mobilePhone not in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneBetween(String value1, String value2) {
            addCriterion("mobilePhone between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("mobilePhone not between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Short value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Short value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Short value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Short value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Short value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Short value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Short> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Short> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Short value1, Short value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Short value1, Short value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCreatedTimestampIsNull() {
            addCriterion("createdTimestamp is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimestampIsNotNull() {
            addCriterion("createdTimestamp is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimestampEqualTo(Long value) {
            addCriterion("createdTimestamp =", value, "createdTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimestampNotEqualTo(Long value) {
            addCriterion("createdTimestamp <>", value, "createdTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimestampGreaterThan(Long value) {
            addCriterion("createdTimestamp >", value, "createdTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimestampGreaterThanOrEqualTo(Long value) {
            addCriterion("createdTimestamp >=", value, "createdTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimestampLessThan(Long value) {
            addCriterion("createdTimestamp <", value, "createdTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimestampLessThanOrEqualTo(Long value) {
            addCriterion("createdTimestamp <=", value, "createdTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimestampIn(List<Long> values) {
            addCriterion("createdTimestamp in", values, "createdTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimestampNotIn(List<Long> values) {
            addCriterion("createdTimestamp not in", values, "createdTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimestampBetween(Long value1, Long value2) {
            addCriterion("createdTimestamp between", value1, value2, "createdTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimestampNotBetween(Long value1, Long value2) {
            addCriterion("createdTimestamp not between", value1, value2, "createdTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastModifiedIsNull() {
            addCriterion("lastModified is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedIsNotNull() {
            addCriterion("lastModified is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedEqualTo(Long value) {
            addCriterion("lastModified =", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedNotEqualTo(Long value) {
            addCriterion("lastModified <>", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedGreaterThan(Long value) {
            addCriterion("lastModified >", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedGreaterThanOrEqualTo(Long value) {
            addCriterion("lastModified >=", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedLessThan(Long value) {
            addCriterion("lastModified <", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedLessThanOrEqualTo(Long value) {
            addCriterion("lastModified <=", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedIn(List<Long> values) {
            addCriterion("lastModified in", values, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedNotIn(List<Long> values) {
            addCriterion("lastModified not in", values, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedBetween(Long value1, Long value2) {
            addCriterion("lastModified between", value1, value2, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedNotBetween(Long value1, Long value2) {
            addCriterion("lastModified not between", value1, value2, "lastModified");
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