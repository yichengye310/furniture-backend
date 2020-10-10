package com.example.springboot.entity;

import java.util.ArrayList;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

        public Criteria andUserTypeIsNull() {
            addCriterion("userType is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("userType is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Short value) {
            addCriterion("userType =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Short value) {
            addCriterion("userType <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Short value) {
            addCriterion("userType >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("userType >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Short value) {
            addCriterion("userType <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Short value) {
            addCriterion("userType <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Short> values) {
            addCriterion("userType in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Short> values) {
            addCriterion("userType not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Short value1, Short value2) {
            addCriterion("userType between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Short value1, Short value2) {
            addCriterion("userType not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNull() {
            addCriterion("userLevel is null");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNotNull() {
            addCriterion("userLevel is not null");
            return (Criteria) this;
        }

        public Criteria andUserLevelEqualTo(Short value) {
            addCriterion("userLevel =", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotEqualTo(Short value) {
            addCriterion("userLevel <>", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThan(Short value) {
            addCriterion("userLevel >", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("userLevel >=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThan(Short value) {
            addCriterion("userLevel <", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThanOrEqualTo(Short value) {
            addCriterion("userLevel <=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelIn(List<Short> values) {
            addCriterion("userLevel in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotIn(List<Short> values) {
            addCriterion("userLevel not in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelBetween(Short value1, Short value2) {
            addCriterion("userLevel between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotBetween(Short value1, Short value2) {
            addCriterion("userLevel not between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("userName =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("userName <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("userName >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("userName <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("userName like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("userName not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("userName in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("userName not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNull() {
            addCriterion("phoneNumber is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("phoneNumber is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberEqualTo(String value) {
            addCriterion("phoneNumber =", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotEqualTo(String value) {
            addCriterion("phoneNumber <>", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThan(String value) {
            addCriterion("phoneNumber >", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("phoneNumber >=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThan(String value) {
            addCriterion("phoneNumber <", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("phoneNumber <=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLike(String value) {
            addCriterion("phoneNumber like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotLike(String value) {
            addCriterion("phoneNumber not like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIn(List<String> values) {
            addCriterion("phoneNumber in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotIn(List<String> values) {
            addCriterion("phoneNumber not in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBetween(String value1, String value2) {
            addCriterion("phoneNumber between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("phoneNumber not between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNull() {
            addCriterion("userPwd is null");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNotNull() {
            addCriterion("userPwd is not null");
            return (Criteria) this;
        }

        public Criteria andUserPwdEqualTo(String value) {
            addCriterion("userPwd =", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotEqualTo(String value) {
            addCriterion("userPwd <>", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThan(String value) {
            addCriterion("userPwd >", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThanOrEqualTo(String value) {
            addCriterion("userPwd >=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThan(String value) {
            addCriterion("userPwd <", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThanOrEqualTo(String value) {
            addCriterion("userPwd <=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLike(String value) {
            addCriterion("userPwd like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotLike(String value) {
            addCriterion("userPwd not like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdIn(List<String> values) {
            addCriterion("userPwd in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotIn(List<String> values) {
            addCriterion("userPwd not in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdBetween(String value1, String value2) {
            addCriterion("userPwd between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotBetween(String value1, String value2) {
            addCriterion("userPwd not between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andRelatedAgentIDIsNull() {
            addCriterion("relatedAgentID is null");
            return (Criteria) this;
        }

        public Criteria andRelatedAgentIDIsNotNull() {
            addCriterion("relatedAgentID is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedAgentIDEqualTo(String value) {
            addCriterion("relatedAgentID =", value, "relatedAgentID");
            return (Criteria) this;
        }

        public Criteria andRelatedAgentIDNotEqualTo(String value) {
            addCriterion("relatedAgentID <>", value, "relatedAgentID");
            return (Criteria) this;
        }

        public Criteria andRelatedAgentIDGreaterThan(String value) {
            addCriterion("relatedAgentID >", value, "relatedAgentID");
            return (Criteria) this;
        }

        public Criteria andRelatedAgentIDGreaterThanOrEqualTo(String value) {
            addCriterion("relatedAgentID >=", value, "relatedAgentID");
            return (Criteria) this;
        }

        public Criteria andRelatedAgentIDLessThan(String value) {
            addCriterion("relatedAgentID <", value, "relatedAgentID");
            return (Criteria) this;
        }

        public Criteria andRelatedAgentIDLessThanOrEqualTo(String value) {
            addCriterion("relatedAgentID <=", value, "relatedAgentID");
            return (Criteria) this;
        }

        public Criteria andRelatedAgentIDLike(String value) {
            addCriterion("relatedAgentID like", value, "relatedAgentID");
            return (Criteria) this;
        }

        public Criteria andRelatedAgentIDNotLike(String value) {
            addCriterion("relatedAgentID not like", value, "relatedAgentID");
            return (Criteria) this;
        }

        public Criteria andRelatedAgentIDIn(List<String> values) {
            addCriterion("relatedAgentID in", values, "relatedAgentID");
            return (Criteria) this;
        }

        public Criteria andRelatedAgentIDNotIn(List<String> values) {
            addCriterion("relatedAgentID not in", values, "relatedAgentID");
            return (Criteria) this;
        }

        public Criteria andRelatedAgentIDBetween(String value1, String value2) {
            addCriterion("relatedAgentID between", value1, value2, "relatedAgentID");
            return (Criteria) this;
        }

        public Criteria andRelatedAgentIDNotBetween(String value1, String value2) {
            addCriterion("relatedAgentID not between", value1, value2, "relatedAgentID");
            return (Criteria) this;
        }

        public Criteria andRelatedAgentNameIsNull() {
            addCriterion("relatedAgentName is null");
            return (Criteria) this;
        }

        public Criteria andRelatedAgentNameIsNotNull() {
            addCriterion("relatedAgentName is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedAgentNameEqualTo(String value) {
            addCriterion("relatedAgentName =", value, "relatedAgentName");
            return (Criteria) this;
        }

        public Criteria andRelatedAgentNameNotEqualTo(String value) {
            addCriterion("relatedAgentName <>", value, "relatedAgentName");
            return (Criteria) this;
        }

        public Criteria andRelatedAgentNameGreaterThan(String value) {
            addCriterion("relatedAgentName >", value, "relatedAgentName");
            return (Criteria) this;
        }

        public Criteria andRelatedAgentNameGreaterThanOrEqualTo(String value) {
            addCriterion("relatedAgentName >=", value, "relatedAgentName");
            return (Criteria) this;
        }

        public Criteria andRelatedAgentNameLessThan(String value) {
            addCriterion("relatedAgentName <", value, "relatedAgentName");
            return (Criteria) this;
        }

        public Criteria andRelatedAgentNameLessThanOrEqualTo(String value) {
            addCriterion("relatedAgentName <=", value, "relatedAgentName");
            return (Criteria) this;
        }

        public Criteria andRelatedAgentNameLike(String value) {
            addCriterion("relatedAgentName like", value, "relatedAgentName");
            return (Criteria) this;
        }

        public Criteria andRelatedAgentNameNotLike(String value) {
            addCriterion("relatedAgentName not like", value, "relatedAgentName");
            return (Criteria) this;
        }

        public Criteria andRelatedAgentNameIn(List<String> values) {
            addCriterion("relatedAgentName in", values, "relatedAgentName");
            return (Criteria) this;
        }

        public Criteria andRelatedAgentNameNotIn(List<String> values) {
            addCriterion("relatedAgentName not in", values, "relatedAgentName");
            return (Criteria) this;
        }

        public Criteria andRelatedAgentNameBetween(String value1, String value2) {
            addCriterion("relatedAgentName between", value1, value2, "relatedAgentName");
            return (Criteria) this;
        }

        public Criteria andRelatedAgentNameNotBetween(String value1, String value2) {
            addCriterion("relatedAgentName not between", value1, value2, "relatedAgentName");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeStampIsNull() {
            addCriterion("createdTimeStamp is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeStampIsNotNull() {
            addCriterion("createdTimeStamp is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeStampEqualTo(Long value) {
            addCriterion("createdTimeStamp =", value, "createdTimeStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeStampNotEqualTo(Long value) {
            addCriterion("createdTimeStamp <>", value, "createdTimeStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeStampGreaterThan(Long value) {
            addCriterion("createdTimeStamp >", value, "createdTimeStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeStampGreaterThanOrEqualTo(Long value) {
            addCriterion("createdTimeStamp >=", value, "createdTimeStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeStampLessThan(Long value) {
            addCriterion("createdTimeStamp <", value, "createdTimeStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeStampLessThanOrEqualTo(Long value) {
            addCriterion("createdTimeStamp <=", value, "createdTimeStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeStampIn(List<Long> values) {
            addCriterion("createdTimeStamp in", values, "createdTimeStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeStampNotIn(List<Long> values) {
            addCriterion("createdTimeStamp not in", values, "createdTimeStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeStampBetween(Long value1, Long value2) {
            addCriterion("createdTimeStamp between", value1, value2, "createdTimeStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeStampNotBetween(Long value1, Long value2) {
            addCriterion("createdTimeStamp not between", value1, value2, "createdTimeStamp");
            return (Criteria) this;
        }

        public Criteria andCreatorTypeIsNull() {
            addCriterion("creatorType is null");
            return (Criteria) this;
        }

        public Criteria andCreatorTypeIsNotNull() {
            addCriterion("creatorType is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorTypeEqualTo(Short value) {
            addCriterion("creatorType =", value, "creatorType");
            return (Criteria) this;
        }

        public Criteria andCreatorTypeNotEqualTo(Short value) {
            addCriterion("creatorType <>", value, "creatorType");
            return (Criteria) this;
        }

        public Criteria andCreatorTypeGreaterThan(Short value) {
            addCriterion("creatorType >", value, "creatorType");
            return (Criteria) this;
        }

        public Criteria andCreatorTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("creatorType >=", value, "creatorType");
            return (Criteria) this;
        }

        public Criteria andCreatorTypeLessThan(Short value) {
            addCriterion("creatorType <", value, "creatorType");
            return (Criteria) this;
        }

        public Criteria andCreatorTypeLessThanOrEqualTo(Short value) {
            addCriterion("creatorType <=", value, "creatorType");
            return (Criteria) this;
        }

        public Criteria andCreatorTypeIn(List<Short> values) {
            addCriterion("creatorType in", values, "creatorType");
            return (Criteria) this;
        }

        public Criteria andCreatorTypeNotIn(List<Short> values) {
            addCriterion("creatorType not in", values, "creatorType");
            return (Criteria) this;
        }

        public Criteria andCreatorTypeBetween(Short value1, Short value2) {
            addCriterion("creatorType between", value1, value2, "creatorType");
            return (Criteria) this;
        }

        public Criteria andCreatorTypeNotBetween(Short value1, Short value2) {
            addCriterion("creatorType not between", value1, value2, "creatorType");
            return (Criteria) this;
        }

        public Criteria andCreatorIDIsNull() {
            addCriterion("creatorID is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIDIsNotNull() {
            addCriterion("creatorID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIDEqualTo(Integer value) {
            addCriterion("creatorID =", value, "creatorID");
            return (Criteria) this;
        }

        public Criteria andCreatorIDNotEqualTo(Integer value) {
            addCriterion("creatorID <>", value, "creatorID");
            return (Criteria) this;
        }

        public Criteria andCreatorIDGreaterThan(Integer value) {
            addCriterion("creatorID >", value, "creatorID");
            return (Criteria) this;
        }

        public Criteria andCreatorIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("creatorID >=", value, "creatorID");
            return (Criteria) this;
        }

        public Criteria andCreatorIDLessThan(Integer value) {
            addCriterion("creatorID <", value, "creatorID");
            return (Criteria) this;
        }

        public Criteria andCreatorIDLessThanOrEqualTo(Integer value) {
            addCriterion("creatorID <=", value, "creatorID");
            return (Criteria) this;
        }

        public Criteria andCreatorIDIn(List<Integer> values) {
            addCriterion("creatorID in", values, "creatorID");
            return (Criteria) this;
        }

        public Criteria andCreatorIDNotIn(List<Integer> values) {
            addCriterion("creatorID not in", values, "creatorID");
            return (Criteria) this;
        }

        public Criteria andCreatorIDBetween(Integer value1, Integer value2) {
            addCriterion("creatorID between", value1, value2, "creatorID");
            return (Criteria) this;
        }

        public Criteria andCreatorIDNotBetween(Integer value1, Integer value2) {
            addCriterion("creatorID not between", value1, value2, "creatorID");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIsNull() {
            addCriterion("creatorName is null");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIsNotNull() {
            addCriterion("creatorName is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorNameEqualTo(String value) {
            addCriterion("creatorName =", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotEqualTo(String value) {
            addCriterion("creatorName <>", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameGreaterThan(String value) {
            addCriterion("creatorName >", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("creatorName >=", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLessThan(String value) {
            addCriterion("creatorName <", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLessThanOrEqualTo(String value) {
            addCriterion("creatorName <=", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLike(String value) {
            addCriterion("creatorName like", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotLike(String value) {
            addCriterion("creatorName not like", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIn(List<String> values) {
            addCriterion("creatorName in", values, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotIn(List<String> values) {
            addCriterion("creatorName not in", values, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameBetween(String value1, String value2) {
            addCriterion("creatorName between", value1, value2, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotBetween(String value1, String value2) {
            addCriterion("creatorName not between", value1, value2, "creatorName");
            return (Criteria) this;
        }

        public Criteria andIsOpenLiveIsNull() {
            addCriterion("isOpenLive is null");
            return (Criteria) this;
        }

        public Criteria andIsOpenLiveIsNotNull() {
            addCriterion("isOpenLive is not null");
            return (Criteria) this;
        }

        public Criteria andIsOpenLiveEqualTo(Integer value) {
            addCriterion("isOpenLive =", value, "isOpenLive");
            return (Criteria) this;
        }

        public Criteria andIsOpenLiveNotEqualTo(Integer value) {
            addCriterion("isOpenLive <>", value, "isOpenLive");
            return (Criteria) this;
        }

        public Criteria andIsOpenLiveGreaterThan(Integer value) {
            addCriterion("isOpenLive >", value, "isOpenLive");
            return (Criteria) this;
        }

        public Criteria andIsOpenLiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("isOpenLive >=", value, "isOpenLive");
            return (Criteria) this;
        }

        public Criteria andIsOpenLiveLessThan(Integer value) {
            addCriterion("isOpenLive <", value, "isOpenLive");
            return (Criteria) this;
        }

        public Criteria andIsOpenLiveLessThanOrEqualTo(Integer value) {
            addCriterion("isOpenLive <=", value, "isOpenLive");
            return (Criteria) this;
        }

        public Criteria andIsOpenLiveIn(List<Integer> values) {
            addCriterion("isOpenLive in", values, "isOpenLive");
            return (Criteria) this;
        }

        public Criteria andIsOpenLiveNotIn(List<Integer> values) {
            addCriterion("isOpenLive not in", values, "isOpenLive");
            return (Criteria) this;
        }

        public Criteria andIsOpenLiveBetween(Integer value1, Integer value2) {
            addCriterion("isOpenLive between", value1, value2, "isOpenLive");
            return (Criteria) this;
        }

        public Criteria andIsOpenLiveNotBetween(Integer value1, Integer value2) {
            addCriterion("isOpenLive not between", value1, value2, "isOpenLive");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeStampIsNull() {
            addCriterion("lastModifiedTimeStamp is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeStampIsNotNull() {
            addCriterion("lastModifiedTimeStamp is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeStampEqualTo(Long value) {
            addCriterion("lastModifiedTimeStamp =", value, "lastModifiedTimeStamp");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeStampNotEqualTo(Long value) {
            addCriterion("lastModifiedTimeStamp <>", value, "lastModifiedTimeStamp");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeStampGreaterThan(Long value) {
            addCriterion("lastModifiedTimeStamp >", value, "lastModifiedTimeStamp");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeStampGreaterThanOrEqualTo(Long value) {
            addCriterion("lastModifiedTimeStamp >=", value, "lastModifiedTimeStamp");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeStampLessThan(Long value) {
            addCriterion("lastModifiedTimeStamp <", value, "lastModifiedTimeStamp");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeStampLessThanOrEqualTo(Long value) {
            addCriterion("lastModifiedTimeStamp <=", value, "lastModifiedTimeStamp");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeStampIn(List<Long> values) {
            addCriterion("lastModifiedTimeStamp in", values, "lastModifiedTimeStamp");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeStampNotIn(List<Long> values) {
            addCriterion("lastModifiedTimeStamp not in", values, "lastModifiedTimeStamp");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeStampBetween(Long value1, Long value2) {
            addCriterion("lastModifiedTimeStamp between", value1, value2, "lastModifiedTimeStamp");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeStampNotBetween(Long value1, Long value2) {
            addCriterion("lastModifiedTimeStamp not between", value1, value2, "lastModifiedTimeStamp");
            return (Criteria) this;
        }

        public Criteria andLastModifierTypeIsNull() {
            addCriterion("lastModifierType is null");
            return (Criteria) this;
        }

        public Criteria andLastModifierTypeIsNotNull() {
            addCriterion("lastModifierType is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifierTypeEqualTo(Short value) {
            addCriterion("lastModifierType =", value, "lastModifierType");
            return (Criteria) this;
        }

        public Criteria andLastModifierTypeNotEqualTo(Short value) {
            addCriterion("lastModifierType <>", value, "lastModifierType");
            return (Criteria) this;
        }

        public Criteria andLastModifierTypeGreaterThan(Short value) {
            addCriterion("lastModifierType >", value, "lastModifierType");
            return (Criteria) this;
        }

        public Criteria andLastModifierTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("lastModifierType >=", value, "lastModifierType");
            return (Criteria) this;
        }

        public Criteria andLastModifierTypeLessThan(Short value) {
            addCriterion("lastModifierType <", value, "lastModifierType");
            return (Criteria) this;
        }

        public Criteria andLastModifierTypeLessThanOrEqualTo(Short value) {
            addCriterion("lastModifierType <=", value, "lastModifierType");
            return (Criteria) this;
        }

        public Criteria andLastModifierTypeIn(List<Short> values) {
            addCriterion("lastModifierType in", values, "lastModifierType");
            return (Criteria) this;
        }

        public Criteria andLastModifierTypeNotIn(List<Short> values) {
            addCriterion("lastModifierType not in", values, "lastModifierType");
            return (Criteria) this;
        }

        public Criteria andLastModifierTypeBetween(Short value1, Short value2) {
            addCriterion("lastModifierType between", value1, value2, "lastModifierType");
            return (Criteria) this;
        }

        public Criteria andLastModifierTypeNotBetween(Short value1, Short value2) {
            addCriterion("lastModifierType not between", value1, value2, "lastModifierType");
            return (Criteria) this;
        }

        public Criteria andLastModifierIDIsNull() {
            addCriterion("lastModifierID is null");
            return (Criteria) this;
        }

        public Criteria andLastModifierIDIsNotNull() {
            addCriterion("lastModifierID is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifierIDEqualTo(Integer value) {
            addCriterion("lastModifierID =", value, "lastModifierID");
            return (Criteria) this;
        }

        public Criteria andLastModifierIDNotEqualTo(Integer value) {
            addCriterion("lastModifierID <>", value, "lastModifierID");
            return (Criteria) this;
        }

        public Criteria andLastModifierIDGreaterThan(Integer value) {
            addCriterion("lastModifierID >", value, "lastModifierID");
            return (Criteria) this;
        }

        public Criteria andLastModifierIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("lastModifierID >=", value, "lastModifierID");
            return (Criteria) this;
        }

        public Criteria andLastModifierIDLessThan(Integer value) {
            addCriterion("lastModifierID <", value, "lastModifierID");
            return (Criteria) this;
        }

        public Criteria andLastModifierIDLessThanOrEqualTo(Integer value) {
            addCriterion("lastModifierID <=", value, "lastModifierID");
            return (Criteria) this;
        }

        public Criteria andLastModifierIDIn(List<Integer> values) {
            addCriterion("lastModifierID in", values, "lastModifierID");
            return (Criteria) this;
        }

        public Criteria andLastModifierIDNotIn(List<Integer> values) {
            addCriterion("lastModifierID not in", values, "lastModifierID");
            return (Criteria) this;
        }

        public Criteria andLastModifierIDBetween(Integer value1, Integer value2) {
            addCriterion("lastModifierID between", value1, value2, "lastModifierID");
            return (Criteria) this;
        }

        public Criteria andLastModifierIDNotBetween(Integer value1, Integer value2) {
            addCriterion("lastModifierID not between", value1, value2, "lastModifierID");
            return (Criteria) this;
        }

        public Criteria andLastModifierNameIsNull() {
            addCriterion("lastModifierName is null");
            return (Criteria) this;
        }

        public Criteria andLastModifierNameIsNotNull() {
            addCriterion("lastModifierName is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifierNameEqualTo(String value) {
            addCriterion("lastModifierName =", value, "lastModifierName");
            return (Criteria) this;
        }

        public Criteria andLastModifierNameNotEqualTo(String value) {
            addCriterion("lastModifierName <>", value, "lastModifierName");
            return (Criteria) this;
        }

        public Criteria andLastModifierNameGreaterThan(String value) {
            addCriterion("lastModifierName >", value, "lastModifierName");
            return (Criteria) this;
        }

        public Criteria andLastModifierNameGreaterThanOrEqualTo(String value) {
            addCriterion("lastModifierName >=", value, "lastModifierName");
            return (Criteria) this;
        }

        public Criteria andLastModifierNameLessThan(String value) {
            addCriterion("lastModifierName <", value, "lastModifierName");
            return (Criteria) this;
        }

        public Criteria andLastModifierNameLessThanOrEqualTo(String value) {
            addCriterion("lastModifierName <=", value, "lastModifierName");
            return (Criteria) this;
        }

        public Criteria andLastModifierNameLike(String value) {
            addCriterion("lastModifierName like", value, "lastModifierName");
            return (Criteria) this;
        }

        public Criteria andLastModifierNameNotLike(String value) {
            addCriterion("lastModifierName not like", value, "lastModifierName");
            return (Criteria) this;
        }

        public Criteria andLastModifierNameIn(List<String> values) {
            addCriterion("lastModifierName in", values, "lastModifierName");
            return (Criteria) this;
        }

        public Criteria andLastModifierNameNotIn(List<String> values) {
            addCriterion("lastModifierName not in", values, "lastModifierName");
            return (Criteria) this;
        }

        public Criteria andLastModifierNameBetween(String value1, String value2) {
            addCriterion("lastModifierName between", value1, value2, "lastModifierName");
            return (Criteria) this;
        }

        public Criteria andLastModifierNameNotBetween(String value1, String value2) {
            addCriterion("lastModifierName not between", value1, value2, "lastModifierName");
            return (Criteria) this;
        }

        public Criteria andWxOpenIDIsNull() {
            addCriterion("wxOpenID is null");
            return (Criteria) this;
        }

        public Criteria andWxOpenIDIsNotNull() {
            addCriterion("wxOpenID is not null");
            return (Criteria) this;
        }

        public Criteria andWxOpenIDEqualTo(String value) {
            addCriterion("wxOpenID =", value, "wxOpenID");
            return (Criteria) this;
        }

        public Criteria andWxOpenIDNotEqualTo(String value) {
            addCriterion("wxOpenID <>", value, "wxOpenID");
            return (Criteria) this;
        }

        public Criteria andWxOpenIDGreaterThan(String value) {
            addCriterion("wxOpenID >", value, "wxOpenID");
            return (Criteria) this;
        }

        public Criteria andWxOpenIDGreaterThanOrEqualTo(String value) {
            addCriterion("wxOpenID >=", value, "wxOpenID");
            return (Criteria) this;
        }

        public Criteria andWxOpenIDLessThan(String value) {
            addCriterion("wxOpenID <", value, "wxOpenID");
            return (Criteria) this;
        }

        public Criteria andWxOpenIDLessThanOrEqualTo(String value) {
            addCriterion("wxOpenID <=", value, "wxOpenID");
            return (Criteria) this;
        }

        public Criteria andWxOpenIDLike(String value) {
            addCriterion("wxOpenID like", value, "wxOpenID");
            return (Criteria) this;
        }

        public Criteria andWxOpenIDNotLike(String value) {
            addCriterion("wxOpenID not like", value, "wxOpenID");
            return (Criteria) this;
        }

        public Criteria andWxOpenIDIn(List<String> values) {
            addCriterion("wxOpenID in", values, "wxOpenID");
            return (Criteria) this;
        }

        public Criteria andWxOpenIDNotIn(List<String> values) {
            addCriterion("wxOpenID not in", values, "wxOpenID");
            return (Criteria) this;
        }

        public Criteria andWxOpenIDBetween(String value1, String value2) {
            addCriterion("wxOpenID between", value1, value2, "wxOpenID");
            return (Criteria) this;
        }

        public Criteria andWxOpenIDNotBetween(String value1, String value2) {
            addCriterion("wxOpenID not between", value1, value2, "wxOpenID");
            return (Criteria) this;
        }

        public Criteria andRelatedSubscriptionOpenIDIsNull() {
            addCriterion("relatedSubscriptionOpenID is null");
            return (Criteria) this;
        }

        public Criteria andRelatedSubscriptionOpenIDIsNotNull() {
            addCriterion("relatedSubscriptionOpenID is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedSubscriptionOpenIDEqualTo(String value) {
            addCriterion("relatedSubscriptionOpenID =", value, "relatedSubscriptionOpenID");
            return (Criteria) this;
        }

        public Criteria andRelatedSubscriptionOpenIDNotEqualTo(String value) {
            addCriterion("relatedSubscriptionOpenID <>", value, "relatedSubscriptionOpenID");
            return (Criteria) this;
        }

        public Criteria andRelatedSubscriptionOpenIDGreaterThan(String value) {
            addCriterion("relatedSubscriptionOpenID >", value, "relatedSubscriptionOpenID");
            return (Criteria) this;
        }

        public Criteria andRelatedSubscriptionOpenIDGreaterThanOrEqualTo(String value) {
            addCriterion("relatedSubscriptionOpenID >=", value, "relatedSubscriptionOpenID");
            return (Criteria) this;
        }

        public Criteria andRelatedSubscriptionOpenIDLessThan(String value) {
            addCriterion("relatedSubscriptionOpenID <", value, "relatedSubscriptionOpenID");
            return (Criteria) this;
        }

        public Criteria andRelatedSubscriptionOpenIDLessThanOrEqualTo(String value) {
            addCriterion("relatedSubscriptionOpenID <=", value, "relatedSubscriptionOpenID");
            return (Criteria) this;
        }

        public Criteria andRelatedSubscriptionOpenIDLike(String value) {
            addCriterion("relatedSubscriptionOpenID like", value, "relatedSubscriptionOpenID");
            return (Criteria) this;
        }

        public Criteria andRelatedSubscriptionOpenIDNotLike(String value) {
            addCriterion("relatedSubscriptionOpenID not like", value, "relatedSubscriptionOpenID");
            return (Criteria) this;
        }

        public Criteria andRelatedSubscriptionOpenIDIn(List<String> values) {
            addCriterion("relatedSubscriptionOpenID in", values, "relatedSubscriptionOpenID");
            return (Criteria) this;
        }

        public Criteria andRelatedSubscriptionOpenIDNotIn(List<String> values) {
            addCriterion("relatedSubscriptionOpenID not in", values, "relatedSubscriptionOpenID");
            return (Criteria) this;
        }

        public Criteria andRelatedSubscriptionOpenIDBetween(String value1, String value2) {
            addCriterion("relatedSubscriptionOpenID between", value1, value2, "relatedSubscriptionOpenID");
            return (Criteria) this;
        }

        public Criteria andRelatedSubscriptionOpenIDNotBetween(String value1, String value2) {
            addCriterion("relatedSubscriptionOpenID not between", value1, value2, "relatedSubscriptionOpenID");
            return (Criteria) this;
        }

        public Criteria andPortraitIsNull() {
            addCriterion("portrait is null");
            return (Criteria) this;
        }

        public Criteria andPortraitIsNotNull() {
            addCriterion("portrait is not null");
            return (Criteria) this;
        }

        public Criteria andPortraitEqualTo(String value) {
            addCriterion("portrait =", value, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitNotEqualTo(String value) {
            addCriterion("portrait <>", value, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitGreaterThan(String value) {
            addCriterion("portrait >", value, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitGreaterThanOrEqualTo(String value) {
            addCriterion("portrait >=", value, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitLessThan(String value) {
            addCriterion("portrait <", value, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitLessThanOrEqualTo(String value) {
            addCriterion("portrait <=", value, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitLike(String value) {
            addCriterion("portrait like", value, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitNotLike(String value) {
            addCriterion("portrait not like", value, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitIn(List<String> values) {
            addCriterion("portrait in", values, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitNotIn(List<String> values) {
            addCriterion("portrait not in", values, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitBetween(String value1, String value2) {
            addCriterion("portrait between", value1, value2, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitNotBetween(String value1, String value2) {
            addCriterion("portrait not between", value1, value2, "portrait");
            return (Criteria) this;
        }

        public Criteria andPersonalSignIsNull() {
            addCriterion("personalSign is null");
            return (Criteria) this;
        }

        public Criteria andPersonalSignIsNotNull() {
            addCriterion("personalSign is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalSignEqualTo(String value) {
            addCriterion("personalSign =", value, "personalSign");
            return (Criteria) this;
        }

        public Criteria andPersonalSignNotEqualTo(String value) {
            addCriterion("personalSign <>", value, "personalSign");
            return (Criteria) this;
        }

        public Criteria andPersonalSignGreaterThan(String value) {
            addCriterion("personalSign >", value, "personalSign");
            return (Criteria) this;
        }

        public Criteria andPersonalSignGreaterThanOrEqualTo(String value) {
            addCriterion("personalSign >=", value, "personalSign");
            return (Criteria) this;
        }

        public Criteria andPersonalSignLessThan(String value) {
            addCriterion("personalSign <", value, "personalSign");
            return (Criteria) this;
        }

        public Criteria andPersonalSignLessThanOrEqualTo(String value) {
            addCriterion("personalSign <=", value, "personalSign");
            return (Criteria) this;
        }

        public Criteria andPersonalSignLike(String value) {
            addCriterion("personalSign like", value, "personalSign");
            return (Criteria) this;
        }

        public Criteria andPersonalSignNotLike(String value) {
            addCriterion("personalSign not like", value, "personalSign");
            return (Criteria) this;
        }

        public Criteria andPersonalSignIn(List<String> values) {
            addCriterion("personalSign in", values, "personalSign");
            return (Criteria) this;
        }

        public Criteria andPersonalSignNotIn(List<String> values) {
            addCriterion("personalSign not in", values, "personalSign");
            return (Criteria) this;
        }

        public Criteria andPersonalSignBetween(String value1, String value2) {
            addCriterion("personalSign between", value1, value2, "personalSign");
            return (Criteria) this;
        }

        public Criteria andPersonalSignNotBetween(String value1, String value2) {
            addCriterion("personalSign not between", value1, value2, "personalSign");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNull() {
            addCriterion("provinceName is null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNotNull() {
            addCriterion("provinceName is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameEqualTo(String value) {
            addCriterion("provinceName =", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotEqualTo(String value) {
            addCriterion("provinceName <>", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThan(String value) {
            addCriterion("provinceName >", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("provinceName >=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThan(String value) {
            addCriterion("provinceName <", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("provinceName <=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLike(String value) {
            addCriterion("provinceName like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotLike(String value) {
            addCriterion("provinceName not like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIn(List<String> values) {
            addCriterion("provinceName in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotIn(List<String> values) {
            addCriterion("provinceName not in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameBetween(String value1, String value2) {
            addCriterion("provinceName between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotBetween(String value1, String value2) {
            addCriterion("provinceName not between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("cityName is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("cityName is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("cityName =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("cityName <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("cityName >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("cityName >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("cityName <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("cityName <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("cityName like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("cityName not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("cityName in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("cityName not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("cityName between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("cityName not between", value1, value2, "cityName");
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