package com.example.springboot.entity;

import java.util.ArrayList;
import java.util.List;

public class UserCouponExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserCouponExample() {
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

        public Criteria andUserCouponIDIsNull() {
            addCriterion("userCouponID is null");
            return (Criteria) this;
        }

        public Criteria andUserCouponIDIsNotNull() {
            addCriterion("userCouponID is not null");
            return (Criteria) this;
        }

        public Criteria andUserCouponIDEqualTo(Integer value) {
            addCriterion("userCouponID =", value, "userCouponID");
            return (Criteria) this;
        }

        public Criteria andUserCouponIDNotEqualTo(Integer value) {
            addCriterion("userCouponID <>", value, "userCouponID");
            return (Criteria) this;
        }

        public Criteria andUserCouponIDGreaterThan(Integer value) {
            addCriterion("userCouponID >", value, "userCouponID");
            return (Criteria) this;
        }

        public Criteria andUserCouponIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("userCouponID >=", value, "userCouponID");
            return (Criteria) this;
        }

        public Criteria andUserCouponIDLessThan(Integer value) {
            addCriterion("userCouponID <", value, "userCouponID");
            return (Criteria) this;
        }

        public Criteria andUserCouponIDLessThanOrEqualTo(Integer value) {
            addCriterion("userCouponID <=", value, "userCouponID");
            return (Criteria) this;
        }

        public Criteria andUserCouponIDIn(List<Integer> values) {
            addCriterion("userCouponID in", values, "userCouponID");
            return (Criteria) this;
        }

        public Criteria andUserCouponIDNotIn(List<Integer> values) {
            addCriterion("userCouponID not in", values, "userCouponID");
            return (Criteria) this;
        }

        public Criteria andUserCouponIDBetween(Integer value1, Integer value2) {
            addCriterion("userCouponID between", value1, value2, "userCouponID");
            return (Criteria) this;
        }

        public Criteria andUserCouponIDNotBetween(Integer value1, Integer value2) {
            addCriterion("userCouponID not between", value1, value2, "userCouponID");
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

        public Criteria andCouponNameIsNull() {
            addCriterion("couponName is null");
            return (Criteria) this;
        }

        public Criteria andCouponNameIsNotNull() {
            addCriterion("couponName is not null");
            return (Criteria) this;
        }

        public Criteria andCouponNameEqualTo(String value) {
            addCriterion("couponName =", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotEqualTo(String value) {
            addCriterion("couponName <>", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThan(String value) {
            addCriterion("couponName >", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThanOrEqualTo(String value) {
            addCriterion("couponName >=", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThan(String value) {
            addCriterion("couponName <", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThanOrEqualTo(String value) {
            addCriterion("couponName <=", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLike(String value) {
            addCriterion("couponName like", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotLike(String value) {
            addCriterion("couponName not like", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameIn(List<String> values) {
            addCriterion("couponName in", values, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotIn(List<String> values) {
            addCriterion("couponName not in", values, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameBetween(String value1, String value2) {
            addCriterion("couponName between", value1, value2, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotBetween(String value1, String value2) {
            addCriterion("couponName not between", value1, value2, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponDescriptionIsNull() {
            addCriterion("couponDescription is null");
            return (Criteria) this;
        }

        public Criteria andCouponDescriptionIsNotNull() {
            addCriterion("couponDescription is not null");
            return (Criteria) this;
        }

        public Criteria andCouponDescriptionEqualTo(String value) {
            addCriterion("couponDescription =", value, "couponDescription");
            return (Criteria) this;
        }

        public Criteria andCouponDescriptionNotEqualTo(String value) {
            addCriterion("couponDescription <>", value, "couponDescription");
            return (Criteria) this;
        }

        public Criteria andCouponDescriptionGreaterThan(String value) {
            addCriterion("couponDescription >", value, "couponDescription");
            return (Criteria) this;
        }

        public Criteria andCouponDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("couponDescription >=", value, "couponDescription");
            return (Criteria) this;
        }

        public Criteria andCouponDescriptionLessThan(String value) {
            addCriterion("couponDescription <", value, "couponDescription");
            return (Criteria) this;
        }

        public Criteria andCouponDescriptionLessThanOrEqualTo(String value) {
            addCriterion("couponDescription <=", value, "couponDescription");
            return (Criteria) this;
        }

        public Criteria andCouponDescriptionLike(String value) {
            addCriterion("couponDescription like", value, "couponDescription");
            return (Criteria) this;
        }

        public Criteria andCouponDescriptionNotLike(String value) {
            addCriterion("couponDescription not like", value, "couponDescription");
            return (Criteria) this;
        }

        public Criteria andCouponDescriptionIn(List<String> values) {
            addCriterion("couponDescription in", values, "couponDescription");
            return (Criteria) this;
        }

        public Criteria andCouponDescriptionNotIn(List<String> values) {
            addCriterion("couponDescription not in", values, "couponDescription");
            return (Criteria) this;
        }

        public Criteria andCouponDescriptionBetween(String value1, String value2) {
            addCriterion("couponDescription between", value1, value2, "couponDescription");
            return (Criteria) this;
        }

        public Criteria andCouponDescriptionNotBetween(String value1, String value2) {
            addCriterion("couponDescription not between", value1, value2, "couponDescription");
            return (Criteria) this;
        }

        public Criteria andUserCouponStateIsNull() {
            addCriterion("userCouponState is null");
            return (Criteria) this;
        }

        public Criteria andUserCouponStateIsNotNull() {
            addCriterion("userCouponState is not null");
            return (Criteria) this;
        }

        public Criteria andUserCouponStateEqualTo(Integer value) {
            addCriterion("userCouponState =", value, "userCouponState");
            return (Criteria) this;
        }

        public Criteria andUserCouponStateNotEqualTo(Integer value) {
            addCriterion("userCouponState <>", value, "userCouponState");
            return (Criteria) this;
        }

        public Criteria andUserCouponStateGreaterThan(Integer value) {
            addCriterion("userCouponState >", value, "userCouponState");
            return (Criteria) this;
        }

        public Criteria andUserCouponStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("userCouponState >=", value, "userCouponState");
            return (Criteria) this;
        }

        public Criteria andUserCouponStateLessThan(Integer value) {
            addCriterion("userCouponState <", value, "userCouponState");
            return (Criteria) this;
        }

        public Criteria andUserCouponStateLessThanOrEqualTo(Integer value) {
            addCriterion("userCouponState <=", value, "userCouponState");
            return (Criteria) this;
        }

        public Criteria andUserCouponStateIn(List<Integer> values) {
            addCriterion("userCouponState in", values, "userCouponState");
            return (Criteria) this;
        }

        public Criteria andUserCouponStateNotIn(List<Integer> values) {
            addCriterion("userCouponState not in", values, "userCouponState");
            return (Criteria) this;
        }

        public Criteria andUserCouponStateBetween(Integer value1, Integer value2) {
            addCriterion("userCouponState between", value1, value2, "userCouponState");
            return (Criteria) this;
        }

        public Criteria andUserCouponStateNotBetween(Integer value1, Integer value2) {
            addCriterion("userCouponState not between", value1, value2, "userCouponState");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNull() {
            addCriterion("couponType is null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNotNull() {
            addCriterion("couponType is not null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeEqualTo(Integer value) {
            addCriterion("couponType =", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotEqualTo(Integer value) {
            addCriterion("couponType <>", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThan(Integer value) {
            addCriterion("couponType >", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("couponType >=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThan(Integer value) {
            addCriterion("couponType <", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThanOrEqualTo(Integer value) {
            addCriterion("couponType <=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIn(List<Integer> values) {
            addCriterion("couponType in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotIn(List<Integer> values) {
            addCriterion("couponType not in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeBetween(Integer value1, Integer value2) {
            addCriterion("couponType between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("couponType not between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponInnerSeqIsNull() {
            addCriterion("couponInnerSeq is null");
            return (Criteria) this;
        }

        public Criteria andCouponInnerSeqIsNotNull() {
            addCriterion("couponInnerSeq is not null");
            return (Criteria) this;
        }

        public Criteria andCouponInnerSeqEqualTo(String value) {
            addCriterion("couponInnerSeq =", value, "couponInnerSeq");
            return (Criteria) this;
        }

        public Criteria andCouponInnerSeqNotEqualTo(String value) {
            addCriterion("couponInnerSeq <>", value, "couponInnerSeq");
            return (Criteria) this;
        }

        public Criteria andCouponInnerSeqGreaterThan(String value) {
            addCriterion("couponInnerSeq >", value, "couponInnerSeq");
            return (Criteria) this;
        }

        public Criteria andCouponInnerSeqGreaterThanOrEqualTo(String value) {
            addCriterion("couponInnerSeq >=", value, "couponInnerSeq");
            return (Criteria) this;
        }

        public Criteria andCouponInnerSeqLessThan(String value) {
            addCriterion("couponInnerSeq <", value, "couponInnerSeq");
            return (Criteria) this;
        }

        public Criteria andCouponInnerSeqLessThanOrEqualTo(String value) {
            addCriterion("couponInnerSeq <=", value, "couponInnerSeq");
            return (Criteria) this;
        }

        public Criteria andCouponInnerSeqLike(String value) {
            addCriterion("couponInnerSeq like", value, "couponInnerSeq");
            return (Criteria) this;
        }

        public Criteria andCouponInnerSeqNotLike(String value) {
            addCriterion("couponInnerSeq not like", value, "couponInnerSeq");
            return (Criteria) this;
        }

        public Criteria andCouponInnerSeqIn(List<String> values) {
            addCriterion("couponInnerSeq in", values, "couponInnerSeq");
            return (Criteria) this;
        }

        public Criteria andCouponInnerSeqNotIn(List<String> values) {
            addCriterion("couponInnerSeq not in", values, "couponInnerSeq");
            return (Criteria) this;
        }

        public Criteria andCouponInnerSeqBetween(String value1, String value2) {
            addCriterion("couponInnerSeq between", value1, value2, "couponInnerSeq");
            return (Criteria) this;
        }

        public Criteria andCouponInnerSeqNotBetween(String value1, String value2) {
            addCriterion("couponInnerSeq not between", value1, value2, "couponInnerSeq");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeIsNull() {
            addCriterion("discountType is null");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeIsNotNull() {
            addCriterion("discountType is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeEqualTo(Integer value) {
            addCriterion("discountType =", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeNotEqualTo(Integer value) {
            addCriterion("discountType <>", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeGreaterThan(Integer value) {
            addCriterion("discountType >", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("discountType >=", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeLessThan(Integer value) {
            addCriterion("discountType <", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeLessThanOrEqualTo(Integer value) {
            addCriterion("discountType <=", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeIn(List<Integer> values) {
            addCriterion("discountType in", values, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeNotIn(List<Integer> values) {
            addCriterion("discountType not in", values, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeBetween(Integer value1, Integer value2) {
            addCriterion("discountType between", value1, value2, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("discountType not between", value1, value2, "discountType");
            return (Criteria) this;
        }

        public Criteria andCouponAmountIsNull() {
            addCriterion("couponAmount is null");
            return (Criteria) this;
        }

        public Criteria andCouponAmountIsNotNull() {
            addCriterion("couponAmount is not null");
            return (Criteria) this;
        }

        public Criteria andCouponAmountEqualTo(Integer value) {
            addCriterion("couponAmount =", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotEqualTo(Integer value) {
            addCriterion("couponAmount <>", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountGreaterThan(Integer value) {
            addCriterion("couponAmount >", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("couponAmount >=", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountLessThan(Integer value) {
            addCriterion("couponAmount <", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountLessThanOrEqualTo(Integer value) {
            addCriterion("couponAmount <=", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountIn(List<Integer> values) {
            addCriterion("couponAmount in", values, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotIn(List<Integer> values) {
            addCriterion("couponAmount not in", values, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountBetween(Integer value1, Integer value2) {
            addCriterion("couponAmount between", value1, value2, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("couponAmount not between", value1, value2, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountLimitIsNull() {
            addCriterion("discountLimit is null");
            return (Criteria) this;
        }

        public Criteria andDiscountLimitIsNotNull() {
            addCriterion("discountLimit is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountLimitEqualTo(Integer value) {
            addCriterion("discountLimit =", value, "discountLimit");
            return (Criteria) this;
        }

        public Criteria andDiscountLimitNotEqualTo(Integer value) {
            addCriterion("discountLimit <>", value, "discountLimit");
            return (Criteria) this;
        }

        public Criteria andDiscountLimitGreaterThan(Integer value) {
            addCriterion("discountLimit >", value, "discountLimit");
            return (Criteria) this;
        }

        public Criteria andDiscountLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("discountLimit >=", value, "discountLimit");
            return (Criteria) this;
        }

        public Criteria andDiscountLimitLessThan(Integer value) {
            addCriterion("discountLimit <", value, "discountLimit");
            return (Criteria) this;
        }

        public Criteria andDiscountLimitLessThanOrEqualTo(Integer value) {
            addCriterion("discountLimit <=", value, "discountLimit");
            return (Criteria) this;
        }

        public Criteria andDiscountLimitIn(List<Integer> values) {
            addCriterion("discountLimit in", values, "discountLimit");
            return (Criteria) this;
        }

        public Criteria andDiscountLimitNotIn(List<Integer> values) {
            addCriterion("discountLimit not in", values, "discountLimit");
            return (Criteria) this;
        }

        public Criteria andDiscountLimitBetween(Integer value1, Integer value2) {
            addCriterion("discountLimit between", value1, value2, "discountLimit");
            return (Criteria) this;
        }

        public Criteria andDiscountLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("discountLimit not between", value1, value2, "discountLimit");
            return (Criteria) this;
        }

        public Criteria andCouponBeginTimeIsNull() {
            addCriterion("couponBeginTime is null");
            return (Criteria) this;
        }

        public Criteria andCouponBeginTimeIsNotNull() {
            addCriterion("couponBeginTime is not null");
            return (Criteria) this;
        }

        public Criteria andCouponBeginTimeEqualTo(Long value) {
            addCriterion("couponBeginTime =", value, "couponBeginTime");
            return (Criteria) this;
        }

        public Criteria andCouponBeginTimeNotEqualTo(Long value) {
            addCriterion("couponBeginTime <>", value, "couponBeginTime");
            return (Criteria) this;
        }

        public Criteria andCouponBeginTimeGreaterThan(Long value) {
            addCriterion("couponBeginTime >", value, "couponBeginTime");
            return (Criteria) this;
        }

        public Criteria andCouponBeginTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("couponBeginTime >=", value, "couponBeginTime");
            return (Criteria) this;
        }

        public Criteria andCouponBeginTimeLessThan(Long value) {
            addCriterion("couponBeginTime <", value, "couponBeginTime");
            return (Criteria) this;
        }

        public Criteria andCouponBeginTimeLessThanOrEqualTo(Long value) {
            addCriterion("couponBeginTime <=", value, "couponBeginTime");
            return (Criteria) this;
        }

        public Criteria andCouponBeginTimeIn(List<Long> values) {
            addCriterion("couponBeginTime in", values, "couponBeginTime");
            return (Criteria) this;
        }

        public Criteria andCouponBeginTimeNotIn(List<Long> values) {
            addCriterion("couponBeginTime not in", values, "couponBeginTime");
            return (Criteria) this;
        }

        public Criteria andCouponBeginTimeBetween(Long value1, Long value2) {
            addCriterion("couponBeginTime between", value1, value2, "couponBeginTime");
            return (Criteria) this;
        }

        public Criteria andCouponBeginTimeNotBetween(Long value1, Long value2) {
            addCriterion("couponBeginTime not between", value1, value2, "couponBeginTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeIsNull() {
            addCriterion("couponEndTime is null");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeIsNotNull() {
            addCriterion("couponEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeEqualTo(Long value) {
            addCriterion("couponEndTime =", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeNotEqualTo(Long value) {
            addCriterion("couponEndTime <>", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeGreaterThan(Long value) {
            addCriterion("couponEndTime >", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("couponEndTime >=", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeLessThan(Long value) {
            addCriterion("couponEndTime <", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeLessThanOrEqualTo(Long value) {
            addCriterion("couponEndTime <=", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeIn(List<Long> values) {
            addCriterion("couponEndTime in", values, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeNotIn(List<Long> values) {
            addCriterion("couponEndTime not in", values, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeBetween(Long value1, Long value2) {
            addCriterion("couponEndTime between", value1, value2, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeNotBetween(Long value1, Long value2) {
            addCriterion("couponEndTime not between", value1, value2, "couponEndTime");
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