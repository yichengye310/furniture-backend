package com.example.springboot.entity;

import java.util.ArrayList;
import java.util.List;

public class ProductLimitedTimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductLimitedTimeExample() {
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

        public Criteria andLimitedTimeProductIDIsNull() {
            addCriterion("limitedTimeProductID is null");
            return (Criteria) this;
        }

        public Criteria andLimitedTimeProductIDIsNotNull() {
            addCriterion("limitedTimeProductID is not null");
            return (Criteria) this;
        }

        public Criteria andLimitedTimeProductIDEqualTo(Integer value) {
            addCriterion("limitedTimeProductID =", value, "limitedTimeProductID");
            return (Criteria) this;
        }

        public Criteria andLimitedTimeProductIDNotEqualTo(Integer value) {
            addCriterion("limitedTimeProductID <>", value, "limitedTimeProductID");
            return (Criteria) this;
        }

        public Criteria andLimitedTimeProductIDGreaterThan(Integer value) {
            addCriterion("limitedTimeProductID >", value, "limitedTimeProductID");
            return (Criteria) this;
        }

        public Criteria andLimitedTimeProductIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("limitedTimeProductID >=", value, "limitedTimeProductID");
            return (Criteria) this;
        }

        public Criteria andLimitedTimeProductIDLessThan(Integer value) {
            addCriterion("limitedTimeProductID <", value, "limitedTimeProductID");
            return (Criteria) this;
        }

        public Criteria andLimitedTimeProductIDLessThanOrEqualTo(Integer value) {
            addCriterion("limitedTimeProductID <=", value, "limitedTimeProductID");
            return (Criteria) this;
        }

        public Criteria andLimitedTimeProductIDIn(List<Integer> values) {
            addCriterion("limitedTimeProductID in", values, "limitedTimeProductID");
            return (Criteria) this;
        }

        public Criteria andLimitedTimeProductIDNotIn(List<Integer> values) {
            addCriterion("limitedTimeProductID not in", values, "limitedTimeProductID");
            return (Criteria) this;
        }

        public Criteria andLimitedTimeProductIDBetween(Integer value1, Integer value2) {
            addCriterion("limitedTimeProductID between", value1, value2, "limitedTimeProductID");
            return (Criteria) this;
        }

        public Criteria andLimitedTimeProductIDNotBetween(Integer value1, Integer value2) {
            addCriterion("limitedTimeProductID not between", value1, value2, "limitedTimeProductID");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Long value) {
            addCriterion("startTime =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Long value) {
            addCriterion("startTime <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Long value) {
            addCriterion("startTime >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("startTime >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Long value) {
            addCriterion("startTime <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Long value) {
            addCriterion("startTime <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Long> values) {
            addCriterion("startTime in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Long> values) {
            addCriterion("startTime not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Long value1, Long value2) {
            addCriterion("startTime between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Long value1, Long value2) {
            addCriterion("startTime not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Long value) {
            addCriterion("endTime =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Long value) {
            addCriterion("endTime <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Long value) {
            addCriterion("endTime >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("endTime >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Long value) {
            addCriterion("endTime <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Long value) {
            addCriterion("endTime <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Long> values) {
            addCriterion("endTime in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Long> values) {
            addCriterion("endTime not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Long value1, Long value2) {
            addCriterion("endTime between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Long value1, Long value2) {
            addCriterion("endTime not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNull() {
            addCriterion("productCode is null");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNotNull() {
            addCriterion("productCode is not null");
            return (Criteria) this;
        }

        public Criteria andProductCodeEqualTo(String value) {
            addCriterion("productCode =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotEqualTo(String value) {
            addCriterion("productCode <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThan(String value) {
            addCriterion("productCode >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("productCode >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThan(String value) {
            addCriterion("productCode <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThanOrEqualTo(String value) {
            addCriterion("productCode <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLike(String value) {
            addCriterion("productCode like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotLike(String value) {
            addCriterion("productCode not like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIn(List<String> values) {
            addCriterion("productCode in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotIn(List<String> values) {
            addCriterion("productCode not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeBetween(String value1, String value2) {
            addCriterion("productCode between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotBetween(String value1, String value2) {
            addCriterion("productCode not between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andStyleIDIsNull() {
            addCriterion("styleID is null");
            return (Criteria) this;
        }

        public Criteria andStyleIDIsNotNull() {
            addCriterion("styleID is not null");
            return (Criteria) this;
        }

        public Criteria andStyleIDEqualTo(Integer value) {
            addCriterion("styleID =", value, "styleID");
            return (Criteria) this;
        }

        public Criteria andStyleIDNotEqualTo(Integer value) {
            addCriterion("styleID <>", value, "styleID");
            return (Criteria) this;
        }

        public Criteria andStyleIDGreaterThan(Integer value) {
            addCriterion("styleID >", value, "styleID");
            return (Criteria) this;
        }

        public Criteria andStyleIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("styleID >=", value, "styleID");
            return (Criteria) this;
        }

        public Criteria andStyleIDLessThan(Integer value) {
            addCriterion("styleID <", value, "styleID");
            return (Criteria) this;
        }

        public Criteria andStyleIDLessThanOrEqualTo(Integer value) {
            addCriterion("styleID <=", value, "styleID");
            return (Criteria) this;
        }

        public Criteria andStyleIDIn(List<Integer> values) {
            addCriterion("styleID in", values, "styleID");
            return (Criteria) this;
        }

        public Criteria andStyleIDNotIn(List<Integer> values) {
            addCriterion("styleID not in", values, "styleID");
            return (Criteria) this;
        }

        public Criteria andStyleIDBetween(Integer value1, Integer value2) {
            addCriterion("styleID between", value1, value2, "styleID");
            return (Criteria) this;
        }

        public Criteria andStyleIDNotBetween(Integer value1, Integer value2) {
            addCriterion("styleID not between", value1, value2, "styleID");
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

        public Criteria andProductDescriptionIsNull() {
            addCriterion("productDescription is null");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIsNotNull() {
            addCriterion("productDescription is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionEqualTo(String value) {
            addCriterion("productDescription =", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotEqualTo(String value) {
            addCriterion("productDescription <>", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionGreaterThan(String value) {
            addCriterion("productDescription >", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("productDescription >=", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLessThan(String value) {
            addCriterion("productDescription <", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLessThanOrEqualTo(String value) {
            addCriterion("productDescription <=", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLike(String value) {
            addCriterion("productDescription like", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotLike(String value) {
            addCriterion("productDescription not like", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIn(List<String> values) {
            addCriterion("productDescription in", values, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotIn(List<String> values) {
            addCriterion("productDescription not in", values, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionBetween(String value1, String value2) {
            addCriterion("productDescription between", value1, value2, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotBetween(String value1, String value2) {
            addCriterion("productDescription not between", value1, value2, "productDescription");
            return (Criteria) this;
        }

        public Criteria andActivityImgIsNull() {
            addCriterion("activityImg is null");
            return (Criteria) this;
        }

        public Criteria andActivityImgIsNotNull() {
            addCriterion("activityImg is not null");
            return (Criteria) this;
        }

        public Criteria andActivityImgEqualTo(String value) {
            addCriterion("activityImg =", value, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgNotEqualTo(String value) {
            addCriterion("activityImg <>", value, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgGreaterThan(String value) {
            addCriterion("activityImg >", value, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgGreaterThanOrEqualTo(String value) {
            addCriterion("activityImg >=", value, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgLessThan(String value) {
            addCriterion("activityImg <", value, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgLessThanOrEqualTo(String value) {
            addCriterion("activityImg <=", value, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgLike(String value) {
            addCriterion("activityImg like", value, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgNotLike(String value) {
            addCriterion("activityImg not like", value, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgIn(List<String> values) {
            addCriterion("activityImg in", values, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgNotIn(List<String> values) {
            addCriterion("activityImg not in", values, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgBetween(String value1, String value2) {
            addCriterion("activityImg between", value1, value2, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgNotBetween(String value1, String value2) {
            addCriterion("activityImg not between", value1, value2, "activityImg");
            return (Criteria) this;
        }

        public Criteria andAlreadyRobbedNumIsNull() {
            addCriterion("alreadyRobbedNum is null");
            return (Criteria) this;
        }

        public Criteria andAlreadyRobbedNumIsNotNull() {
            addCriterion("alreadyRobbedNum is not null");
            return (Criteria) this;
        }

        public Criteria andAlreadyRobbedNumEqualTo(Integer value) {
            addCriterion("alreadyRobbedNum =", value, "alreadyRobbedNum");
            return (Criteria) this;
        }

        public Criteria andAlreadyRobbedNumNotEqualTo(Integer value) {
            addCriterion("alreadyRobbedNum <>", value, "alreadyRobbedNum");
            return (Criteria) this;
        }

        public Criteria andAlreadyRobbedNumGreaterThan(Integer value) {
            addCriterion("alreadyRobbedNum >", value, "alreadyRobbedNum");
            return (Criteria) this;
        }

        public Criteria andAlreadyRobbedNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("alreadyRobbedNum >=", value, "alreadyRobbedNum");
            return (Criteria) this;
        }

        public Criteria andAlreadyRobbedNumLessThan(Integer value) {
            addCriterion("alreadyRobbedNum <", value, "alreadyRobbedNum");
            return (Criteria) this;
        }

        public Criteria andAlreadyRobbedNumLessThanOrEqualTo(Integer value) {
            addCriterion("alreadyRobbedNum <=", value, "alreadyRobbedNum");
            return (Criteria) this;
        }

        public Criteria andAlreadyRobbedNumIn(List<Integer> values) {
            addCriterion("alreadyRobbedNum in", values, "alreadyRobbedNum");
            return (Criteria) this;
        }

        public Criteria andAlreadyRobbedNumNotIn(List<Integer> values) {
            addCriterion("alreadyRobbedNum not in", values, "alreadyRobbedNum");
            return (Criteria) this;
        }

        public Criteria andAlreadyRobbedNumBetween(Integer value1, Integer value2) {
            addCriterion("alreadyRobbedNum between", value1, value2, "alreadyRobbedNum");
            return (Criteria) this;
        }

        public Criteria andAlreadyRobbedNumNotBetween(Integer value1, Integer value2) {
            addCriterion("alreadyRobbedNum not between", value1, value2, "alreadyRobbedNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumIsNull() {
            addCriterion("limitNum is null");
            return (Criteria) this;
        }

        public Criteria andLimitNumIsNotNull() {
            addCriterion("limitNum is not null");
            return (Criteria) this;
        }

        public Criteria andLimitNumEqualTo(Integer value) {
            addCriterion("limitNum =", value, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumNotEqualTo(Integer value) {
            addCriterion("limitNum <>", value, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumGreaterThan(Integer value) {
            addCriterion("limitNum >", value, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("limitNum >=", value, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumLessThan(Integer value) {
            addCriterion("limitNum <", value, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumLessThanOrEqualTo(Integer value) {
            addCriterion("limitNum <=", value, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumIn(List<Integer> values) {
            addCriterion("limitNum in", values, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumNotIn(List<Integer> values) {
            addCriterion("limitNum not in", values, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumBetween(Integer value1, Integer value2) {
            addCriterion("limitNum between", value1, value2, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumNotBetween(Integer value1, Integer value2) {
            addCriterion("limitNum not between", value1, value2, "limitNum");
            return (Criteria) this;
        }

        public Criteria andBrowseNumIsNull() {
            addCriterion("browseNum is null");
            return (Criteria) this;
        }

        public Criteria andBrowseNumIsNotNull() {
            addCriterion("browseNum is not null");
            return (Criteria) this;
        }

        public Criteria andBrowseNumEqualTo(Integer value) {
            addCriterion("browseNum =", value, "browseNum");
            return (Criteria) this;
        }

        public Criteria andBrowseNumNotEqualTo(Integer value) {
            addCriterion("browseNum <>", value, "browseNum");
            return (Criteria) this;
        }

        public Criteria andBrowseNumGreaterThan(Integer value) {
            addCriterion("browseNum >", value, "browseNum");
            return (Criteria) this;
        }

        public Criteria andBrowseNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("browseNum >=", value, "browseNum");
            return (Criteria) this;
        }

        public Criteria andBrowseNumLessThan(Integer value) {
            addCriterion("browseNum <", value, "browseNum");
            return (Criteria) this;
        }

        public Criteria andBrowseNumLessThanOrEqualTo(Integer value) {
            addCriterion("browseNum <=", value, "browseNum");
            return (Criteria) this;
        }

        public Criteria andBrowseNumIn(List<Integer> values) {
            addCriterion("browseNum in", values, "browseNum");
            return (Criteria) this;
        }

        public Criteria andBrowseNumNotIn(List<Integer> values) {
            addCriterion("browseNum not in", values, "browseNum");
            return (Criteria) this;
        }

        public Criteria andBrowseNumBetween(Integer value1, Integer value2) {
            addCriterion("browseNum between", value1, value2, "browseNum");
            return (Criteria) this;
        }

        public Criteria andBrowseNumNotBetween(Integer value1, Integer value2) {
            addCriterion("browseNum not between", value1, value2, "browseNum");
            return (Criteria) this;
        }

        public Criteria andDiscountWayIsNull() {
            addCriterion("discountWay is null");
            return (Criteria) this;
        }

        public Criteria andDiscountWayIsNotNull() {
            addCriterion("discountWay is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountWayEqualTo(Short value) {
            addCriterion("discountWay =", value, "discountWay");
            return (Criteria) this;
        }

        public Criteria andDiscountWayNotEqualTo(Short value) {
            addCriterion("discountWay <>", value, "discountWay");
            return (Criteria) this;
        }

        public Criteria andDiscountWayGreaterThan(Short value) {
            addCriterion("discountWay >", value, "discountWay");
            return (Criteria) this;
        }

        public Criteria andDiscountWayGreaterThanOrEqualTo(Short value) {
            addCriterion("discountWay >=", value, "discountWay");
            return (Criteria) this;
        }

        public Criteria andDiscountWayLessThan(Short value) {
            addCriterion("discountWay <", value, "discountWay");
            return (Criteria) this;
        }

        public Criteria andDiscountWayLessThanOrEqualTo(Short value) {
            addCriterion("discountWay <=", value, "discountWay");
            return (Criteria) this;
        }

        public Criteria andDiscountWayIn(List<Short> values) {
            addCriterion("discountWay in", values, "discountWay");
            return (Criteria) this;
        }

        public Criteria andDiscountWayNotIn(List<Short> values) {
            addCriterion("discountWay not in", values, "discountWay");
            return (Criteria) this;
        }

        public Criteria andDiscountWayBetween(Short value1, Short value2) {
            addCriterion("discountWay between", value1, value2, "discountWay");
            return (Criteria) this;
        }

        public Criteria andDiscountWayNotBetween(Short value1, Short value2) {
            addCriterion("discountWay not between", value1, value2, "discountWay");
            return (Criteria) this;
        }

        public Criteria andFullIsNull() {
            addCriterion("full is null");
            return (Criteria) this;
        }

        public Criteria andFullIsNotNull() {
            addCriterion("full is not null");
            return (Criteria) this;
        }

        public Criteria andFullEqualTo(Integer value) {
            addCriterion("full =", value, "full");
            return (Criteria) this;
        }

        public Criteria andFullNotEqualTo(Integer value) {
            addCriterion("full <>", value, "full");
            return (Criteria) this;
        }

        public Criteria andFullGreaterThan(Integer value) {
            addCriterion("full >", value, "full");
            return (Criteria) this;
        }

        public Criteria andFullGreaterThanOrEqualTo(Integer value) {
            addCriterion("full >=", value, "full");
            return (Criteria) this;
        }

        public Criteria andFullLessThan(Integer value) {
            addCriterion("full <", value, "full");
            return (Criteria) this;
        }

        public Criteria andFullLessThanOrEqualTo(Integer value) {
            addCriterion("full <=", value, "full");
            return (Criteria) this;
        }

        public Criteria andFullIn(List<Integer> values) {
            addCriterion("full in", values, "full");
            return (Criteria) this;
        }

        public Criteria andFullNotIn(List<Integer> values) {
            addCriterion("full not in", values, "full");
            return (Criteria) this;
        }

        public Criteria andFullBetween(Integer value1, Integer value2) {
            addCriterion("full between", value1, value2, "full");
            return (Criteria) this;
        }

        public Criteria andFullNotBetween(Integer value1, Integer value2) {
            addCriterion("full not between", value1, value2, "full");
            return (Criteria) this;
        }

        public Criteria andReduceIsNull() {
            addCriterion("reduce is null");
            return (Criteria) this;
        }

        public Criteria andReduceIsNotNull() {
            addCriterion("reduce is not null");
            return (Criteria) this;
        }

        public Criteria andReduceEqualTo(Integer value) {
            addCriterion("reduce =", value, "reduce");
            return (Criteria) this;
        }

        public Criteria andReduceNotEqualTo(Integer value) {
            addCriterion("reduce <>", value, "reduce");
            return (Criteria) this;
        }

        public Criteria andReduceGreaterThan(Integer value) {
            addCriterion("reduce >", value, "reduce");
            return (Criteria) this;
        }

        public Criteria andReduceGreaterThanOrEqualTo(Integer value) {
            addCriterion("reduce >=", value, "reduce");
            return (Criteria) this;
        }

        public Criteria andReduceLessThan(Integer value) {
            addCriterion("reduce <", value, "reduce");
            return (Criteria) this;
        }

        public Criteria andReduceLessThanOrEqualTo(Integer value) {
            addCriterion("reduce <=", value, "reduce");
            return (Criteria) this;
        }

        public Criteria andReduceIn(List<Integer> values) {
            addCriterion("reduce in", values, "reduce");
            return (Criteria) this;
        }

        public Criteria andReduceNotIn(List<Integer> values) {
            addCriterion("reduce not in", values, "reduce");
            return (Criteria) this;
        }

        public Criteria andReduceBetween(Integer value1, Integer value2) {
            addCriterion("reduce between", value1, value2, "reduce");
            return (Criteria) this;
        }

        public Criteria andReduceNotBetween(Integer value1, Integer value2) {
            addCriterion("reduce not between", value1, value2, "reduce");
            return (Criteria) this;
        }

        public Criteria andActiveObjectIsNull() {
            addCriterion("activeObject is null");
            return (Criteria) this;
        }

        public Criteria andActiveObjectIsNotNull() {
            addCriterion("activeObject is not null");
            return (Criteria) this;
        }

        public Criteria andActiveObjectEqualTo(Short value) {
            addCriterion("activeObject =", value, "activeObject");
            return (Criteria) this;
        }

        public Criteria andActiveObjectNotEqualTo(Short value) {
            addCriterion("activeObject <>", value, "activeObject");
            return (Criteria) this;
        }

        public Criteria andActiveObjectGreaterThan(Short value) {
            addCriterion("activeObject >", value, "activeObject");
            return (Criteria) this;
        }

        public Criteria andActiveObjectGreaterThanOrEqualTo(Short value) {
            addCriterion("activeObject >=", value, "activeObject");
            return (Criteria) this;
        }

        public Criteria andActiveObjectLessThan(Short value) {
            addCriterion("activeObject <", value, "activeObject");
            return (Criteria) this;
        }

        public Criteria andActiveObjectLessThanOrEqualTo(Short value) {
            addCriterion("activeObject <=", value, "activeObject");
            return (Criteria) this;
        }

        public Criteria andActiveObjectIn(List<Short> values) {
            addCriterion("activeObject in", values, "activeObject");
            return (Criteria) this;
        }

        public Criteria andActiveObjectNotIn(List<Short> values) {
            addCriterion("activeObject not in", values, "activeObject");
            return (Criteria) this;
        }

        public Criteria andActiveObjectBetween(Short value1, Short value2) {
            addCriterion("activeObject between", value1, value2, "activeObject");
            return (Criteria) this;
        }

        public Criteria andActiveObjectNotBetween(Short value1, Short value2) {
            addCriterion("activeObject not between", value1, value2, "activeObject");
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