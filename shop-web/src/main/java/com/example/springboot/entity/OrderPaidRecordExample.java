package com.example.springboot.entity;

import java.util.ArrayList;
import java.util.List;

public class OrderPaidRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderPaidRecordExample() {
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

        public Criteria andPaidRecordIDIsNull() {
            addCriterion("paidRecordID is null");
            return (Criteria) this;
        }

        public Criteria andPaidRecordIDIsNotNull() {
            addCriterion("paidRecordID is not null");
            return (Criteria) this;
        }

        public Criteria andPaidRecordIDEqualTo(Integer value) {
            addCriterion("paidRecordID =", value, "paidRecordID");
            return (Criteria) this;
        }

        public Criteria andPaidRecordIDNotEqualTo(Integer value) {
            addCriterion("paidRecordID <>", value, "paidRecordID");
            return (Criteria) this;
        }

        public Criteria andPaidRecordIDGreaterThan(Integer value) {
            addCriterion("paidRecordID >", value, "paidRecordID");
            return (Criteria) this;
        }

        public Criteria andPaidRecordIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("paidRecordID >=", value, "paidRecordID");
            return (Criteria) this;
        }

        public Criteria andPaidRecordIDLessThan(Integer value) {
            addCriterion("paidRecordID <", value, "paidRecordID");
            return (Criteria) this;
        }

        public Criteria andPaidRecordIDLessThanOrEqualTo(Integer value) {
            addCriterion("paidRecordID <=", value, "paidRecordID");
            return (Criteria) this;
        }

        public Criteria andPaidRecordIDIn(List<Integer> values) {
            addCriterion("paidRecordID in", values, "paidRecordID");
            return (Criteria) this;
        }

        public Criteria andPaidRecordIDNotIn(List<Integer> values) {
            addCriterion("paidRecordID not in", values, "paidRecordID");
            return (Criteria) this;
        }

        public Criteria andPaidRecordIDBetween(Integer value1, Integer value2) {
            addCriterion("paidRecordID between", value1, value2, "paidRecordID");
            return (Criteria) this;
        }

        public Criteria andPaidRecordIDNotBetween(Integer value1, Integer value2) {
            addCriterion("paidRecordID not between", value1, value2, "paidRecordID");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andPaymentStateIsNull() {
            addCriterion("paymentState is null");
            return (Criteria) this;
        }

        public Criteria andPaymentStateIsNotNull() {
            addCriterion("paymentState is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentStateEqualTo(Short value) {
            addCriterion("paymentState =", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateNotEqualTo(Short value) {
            addCriterion("paymentState <>", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateGreaterThan(Short value) {
            addCriterion("paymentState >", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateGreaterThanOrEqualTo(Short value) {
            addCriterion("paymentState >=", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateLessThan(Short value) {
            addCriterion("paymentState <", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateLessThanOrEqualTo(Short value) {
            addCriterion("paymentState <=", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateIn(List<Short> values) {
            addCriterion("paymentState in", values, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateNotIn(List<Short> values) {
            addCriterion("paymentState not in", values, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateBetween(Short value1, Short value2) {
            addCriterion("paymentState between", value1, value2, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateNotBetween(Short value1, Short value2) {
            addCriterion("paymentState not between", value1, value2, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaidModeIsNull() {
            addCriterion("paidMode is null");
            return (Criteria) this;
        }

        public Criteria andPaidModeIsNotNull() {
            addCriterion("paidMode is not null");
            return (Criteria) this;
        }

        public Criteria andPaidModeEqualTo(Short value) {
            addCriterion("paidMode =", value, "paidMode");
            return (Criteria) this;
        }

        public Criteria andPaidModeNotEqualTo(Short value) {
            addCriterion("paidMode <>", value, "paidMode");
            return (Criteria) this;
        }

        public Criteria andPaidModeGreaterThan(Short value) {
            addCriterion("paidMode >", value, "paidMode");
            return (Criteria) this;
        }

        public Criteria andPaidModeGreaterThanOrEqualTo(Short value) {
            addCriterion("paidMode >=", value, "paidMode");
            return (Criteria) this;
        }

        public Criteria andPaidModeLessThan(Short value) {
            addCriterion("paidMode <", value, "paidMode");
            return (Criteria) this;
        }

        public Criteria andPaidModeLessThanOrEqualTo(Short value) {
            addCriterion("paidMode <=", value, "paidMode");
            return (Criteria) this;
        }

        public Criteria andPaidModeIn(List<Short> values) {
            addCriterion("paidMode in", values, "paidMode");
            return (Criteria) this;
        }

        public Criteria andPaidModeNotIn(List<Short> values) {
            addCriterion("paidMode not in", values, "paidMode");
            return (Criteria) this;
        }

        public Criteria andPaidModeBetween(Short value1, Short value2) {
            addCriterion("paidMode between", value1, value2, "paidMode");
            return (Criteria) this;
        }

        public Criteria andPaidModeNotBetween(Short value1, Short value2) {
            addCriterion("paidMode not between", value1, value2, "paidMode");
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

        public Criteria andPayerIDIsNull() {
            addCriterion("payerID is null");
            return (Criteria) this;
        }

        public Criteria andPayerIDIsNotNull() {
            addCriterion("payerID is not null");
            return (Criteria) this;
        }

        public Criteria andPayerIDEqualTo(String value) {
            addCriterion("payerID =", value, "payerID");
            return (Criteria) this;
        }

        public Criteria andPayerIDNotEqualTo(String value) {
            addCriterion("payerID <>", value, "payerID");
            return (Criteria) this;
        }

        public Criteria andPayerIDGreaterThan(String value) {
            addCriterion("payerID >", value, "payerID");
            return (Criteria) this;
        }

        public Criteria andPayerIDGreaterThanOrEqualTo(String value) {
            addCriterion("payerID >=", value, "payerID");
            return (Criteria) this;
        }

        public Criteria andPayerIDLessThan(String value) {
            addCriterion("payerID <", value, "payerID");
            return (Criteria) this;
        }

        public Criteria andPayerIDLessThanOrEqualTo(String value) {
            addCriterion("payerID <=", value, "payerID");
            return (Criteria) this;
        }

        public Criteria andPayerIDLike(String value) {
            addCriterion("payerID like", value, "payerID");
            return (Criteria) this;
        }

        public Criteria andPayerIDNotLike(String value) {
            addCriterion("payerID not like", value, "payerID");
            return (Criteria) this;
        }

        public Criteria andPayerIDIn(List<String> values) {
            addCriterion("payerID in", values, "payerID");
            return (Criteria) this;
        }

        public Criteria andPayerIDNotIn(List<String> values) {
            addCriterion("payerID not in", values, "payerID");
            return (Criteria) this;
        }

        public Criteria andPayerIDBetween(String value1, String value2) {
            addCriterion("payerID between", value1, value2, "payerID");
            return (Criteria) this;
        }

        public Criteria andPayerIDNotBetween(String value1, String value2) {
            addCriterion("payerID not between", value1, value2, "payerID");
            return (Criteria) this;
        }

        public Criteria andPayerEmailIsNull() {
            addCriterion("payerEmail is null");
            return (Criteria) this;
        }

        public Criteria andPayerEmailIsNotNull() {
            addCriterion("payerEmail is not null");
            return (Criteria) this;
        }

        public Criteria andPayerEmailEqualTo(String value) {
            addCriterion("payerEmail =", value, "payerEmail");
            return (Criteria) this;
        }

        public Criteria andPayerEmailNotEqualTo(String value) {
            addCriterion("payerEmail <>", value, "payerEmail");
            return (Criteria) this;
        }

        public Criteria andPayerEmailGreaterThan(String value) {
            addCriterion("payerEmail >", value, "payerEmail");
            return (Criteria) this;
        }

        public Criteria andPayerEmailGreaterThanOrEqualTo(String value) {
            addCriterion("payerEmail >=", value, "payerEmail");
            return (Criteria) this;
        }

        public Criteria andPayerEmailLessThan(String value) {
            addCriterion("payerEmail <", value, "payerEmail");
            return (Criteria) this;
        }

        public Criteria andPayerEmailLessThanOrEqualTo(String value) {
            addCriterion("payerEmail <=", value, "payerEmail");
            return (Criteria) this;
        }

        public Criteria andPayerEmailLike(String value) {
            addCriterion("payerEmail like", value, "payerEmail");
            return (Criteria) this;
        }

        public Criteria andPayerEmailNotLike(String value) {
            addCriterion("payerEmail not like", value, "payerEmail");
            return (Criteria) this;
        }

        public Criteria andPayerEmailIn(List<String> values) {
            addCriterion("payerEmail in", values, "payerEmail");
            return (Criteria) this;
        }

        public Criteria andPayerEmailNotIn(List<String> values) {
            addCriterion("payerEmail not in", values, "payerEmail");
            return (Criteria) this;
        }

        public Criteria andPayerEmailBetween(String value1, String value2) {
            addCriterion("payerEmail between", value1, value2, "payerEmail");
            return (Criteria) this;
        }

        public Criteria andPayerEmailNotBetween(String value1, String value2) {
            addCriterion("payerEmail not between", value1, value2, "payerEmail");
            return (Criteria) this;
        }

        public Criteria andPaidFlowNumIsNull() {
            addCriterion("paidFlowNum is null");
            return (Criteria) this;
        }

        public Criteria andPaidFlowNumIsNotNull() {
            addCriterion("paidFlowNum is not null");
            return (Criteria) this;
        }

        public Criteria andPaidFlowNumEqualTo(String value) {
            addCriterion("paidFlowNum =", value, "paidFlowNum");
            return (Criteria) this;
        }

        public Criteria andPaidFlowNumNotEqualTo(String value) {
            addCriterion("paidFlowNum <>", value, "paidFlowNum");
            return (Criteria) this;
        }

        public Criteria andPaidFlowNumGreaterThan(String value) {
            addCriterion("paidFlowNum >", value, "paidFlowNum");
            return (Criteria) this;
        }

        public Criteria andPaidFlowNumGreaterThanOrEqualTo(String value) {
            addCriterion("paidFlowNum >=", value, "paidFlowNum");
            return (Criteria) this;
        }

        public Criteria andPaidFlowNumLessThan(String value) {
            addCriterion("paidFlowNum <", value, "paidFlowNum");
            return (Criteria) this;
        }

        public Criteria andPaidFlowNumLessThanOrEqualTo(String value) {
            addCriterion("paidFlowNum <=", value, "paidFlowNum");
            return (Criteria) this;
        }

        public Criteria andPaidFlowNumLike(String value) {
            addCriterion("paidFlowNum like", value, "paidFlowNum");
            return (Criteria) this;
        }

        public Criteria andPaidFlowNumNotLike(String value) {
            addCriterion("paidFlowNum not like", value, "paidFlowNum");
            return (Criteria) this;
        }

        public Criteria andPaidFlowNumIn(List<String> values) {
            addCriterion("paidFlowNum in", values, "paidFlowNum");
            return (Criteria) this;
        }

        public Criteria andPaidFlowNumNotIn(List<String> values) {
            addCriterion("paidFlowNum not in", values, "paidFlowNum");
            return (Criteria) this;
        }

        public Criteria andPaidFlowNumBetween(String value1, String value2) {
            addCriterion("paidFlowNum between", value1, value2, "paidFlowNum");
            return (Criteria) this;
        }

        public Criteria andPaidFlowNumNotBetween(String value1, String value2) {
            addCriterion("paidFlowNum not between", value1, value2, "paidFlowNum");
            return (Criteria) this;
        }

        public Criteria andFlowCreatedTimeIsNull() {
            addCriterion("flowCreatedTime is null");
            return (Criteria) this;
        }

        public Criteria andFlowCreatedTimeIsNotNull() {
            addCriterion("flowCreatedTime is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCreatedTimeEqualTo(Long value) {
            addCriterion("flowCreatedTime =", value, "flowCreatedTime");
            return (Criteria) this;
        }

        public Criteria andFlowCreatedTimeNotEqualTo(Long value) {
            addCriterion("flowCreatedTime <>", value, "flowCreatedTime");
            return (Criteria) this;
        }

        public Criteria andFlowCreatedTimeGreaterThan(Long value) {
            addCriterion("flowCreatedTime >", value, "flowCreatedTime");
            return (Criteria) this;
        }

        public Criteria andFlowCreatedTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("flowCreatedTime >=", value, "flowCreatedTime");
            return (Criteria) this;
        }

        public Criteria andFlowCreatedTimeLessThan(Long value) {
            addCriterion("flowCreatedTime <", value, "flowCreatedTime");
            return (Criteria) this;
        }

        public Criteria andFlowCreatedTimeLessThanOrEqualTo(Long value) {
            addCriterion("flowCreatedTime <=", value, "flowCreatedTime");
            return (Criteria) this;
        }

        public Criteria andFlowCreatedTimeIn(List<Long> values) {
            addCriterion("flowCreatedTime in", values, "flowCreatedTime");
            return (Criteria) this;
        }

        public Criteria andFlowCreatedTimeNotIn(List<Long> values) {
            addCriterion("flowCreatedTime not in", values, "flowCreatedTime");
            return (Criteria) this;
        }

        public Criteria andFlowCreatedTimeBetween(Long value1, Long value2) {
            addCriterion("flowCreatedTime between", value1, value2, "flowCreatedTime");
            return (Criteria) this;
        }

        public Criteria andFlowCreatedTimeNotBetween(Long value1, Long value2) {
            addCriterion("flowCreatedTime not between", value1, value2, "flowCreatedTime");
            return (Criteria) this;
        }

        public Criteria andFlowPaidTimeIsNull() {
            addCriterion("flowPaidTime is null");
            return (Criteria) this;
        }

        public Criteria andFlowPaidTimeIsNotNull() {
            addCriterion("flowPaidTime is not null");
            return (Criteria) this;
        }

        public Criteria andFlowPaidTimeEqualTo(Long value) {
            addCriterion("flowPaidTime =", value, "flowPaidTime");
            return (Criteria) this;
        }

        public Criteria andFlowPaidTimeNotEqualTo(Long value) {
            addCriterion("flowPaidTime <>", value, "flowPaidTime");
            return (Criteria) this;
        }

        public Criteria andFlowPaidTimeGreaterThan(Long value) {
            addCriterion("flowPaidTime >", value, "flowPaidTime");
            return (Criteria) this;
        }

        public Criteria andFlowPaidTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("flowPaidTime >=", value, "flowPaidTime");
            return (Criteria) this;
        }

        public Criteria andFlowPaidTimeLessThan(Long value) {
            addCriterion("flowPaidTime <", value, "flowPaidTime");
            return (Criteria) this;
        }

        public Criteria andFlowPaidTimeLessThanOrEqualTo(Long value) {
            addCriterion("flowPaidTime <=", value, "flowPaidTime");
            return (Criteria) this;
        }

        public Criteria andFlowPaidTimeIn(List<Long> values) {
            addCriterion("flowPaidTime in", values, "flowPaidTime");
            return (Criteria) this;
        }

        public Criteria andFlowPaidTimeNotIn(List<Long> values) {
            addCriterion("flowPaidTime not in", values, "flowPaidTime");
            return (Criteria) this;
        }

        public Criteria andFlowPaidTimeBetween(Long value1, Long value2) {
            addCriterion("flowPaidTime between", value1, value2, "flowPaidTime");
            return (Criteria) this;
        }

        public Criteria andFlowPaidTimeNotBetween(Long value1, Long value2) {
            addCriterion("flowPaidTime not between", value1, value2, "flowPaidTime");
            return (Criteria) this;
        }

        public Criteria andNotificationIDIsNull() {
            addCriterion("notificationID is null");
            return (Criteria) this;
        }

        public Criteria andNotificationIDIsNotNull() {
            addCriterion("notificationID is not null");
            return (Criteria) this;
        }

        public Criteria andNotificationIDEqualTo(String value) {
            addCriterion("notificationID =", value, "notificationID");
            return (Criteria) this;
        }

        public Criteria andNotificationIDNotEqualTo(String value) {
            addCriterion("notificationID <>", value, "notificationID");
            return (Criteria) this;
        }

        public Criteria andNotificationIDGreaterThan(String value) {
            addCriterion("notificationID >", value, "notificationID");
            return (Criteria) this;
        }

        public Criteria andNotificationIDGreaterThanOrEqualTo(String value) {
            addCriterion("notificationID >=", value, "notificationID");
            return (Criteria) this;
        }

        public Criteria andNotificationIDLessThan(String value) {
            addCriterion("notificationID <", value, "notificationID");
            return (Criteria) this;
        }

        public Criteria andNotificationIDLessThanOrEqualTo(String value) {
            addCriterion("notificationID <=", value, "notificationID");
            return (Criteria) this;
        }

        public Criteria andNotificationIDLike(String value) {
            addCriterion("notificationID like", value, "notificationID");
            return (Criteria) this;
        }

        public Criteria andNotificationIDNotLike(String value) {
            addCriterion("notificationID not like", value, "notificationID");
            return (Criteria) this;
        }

        public Criteria andNotificationIDIn(List<String> values) {
            addCriterion("notificationID in", values, "notificationID");
            return (Criteria) this;
        }

        public Criteria andNotificationIDNotIn(List<String> values) {
            addCriterion("notificationID not in", values, "notificationID");
            return (Criteria) this;
        }

        public Criteria andNotificationIDBetween(String value1, String value2) {
            addCriterion("notificationID between", value1, value2, "notificationID");
            return (Criteria) this;
        }

        public Criteria andNotificationIDNotBetween(String value1, String value2) {
            addCriterion("notificationID not between", value1, value2, "notificationID");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeIsNull() {
            addCriterion("notificationTime is null");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeIsNotNull() {
            addCriterion("notificationTime is not null");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeEqualTo(Long value) {
            addCriterion("notificationTime =", value, "notificationTime");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeNotEqualTo(Long value) {
            addCriterion("notificationTime <>", value, "notificationTime");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeGreaterThan(Long value) {
            addCriterion("notificationTime >", value, "notificationTime");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("notificationTime >=", value, "notificationTime");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeLessThan(Long value) {
            addCriterion("notificationTime <", value, "notificationTime");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeLessThanOrEqualTo(Long value) {
            addCriterion("notificationTime <=", value, "notificationTime");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeIn(List<Long> values) {
            addCriterion("notificationTime in", values, "notificationTime");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeNotIn(List<Long> values) {
            addCriterion("notificationTime not in", values, "notificationTime");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeBetween(Long value1, Long value2) {
            addCriterion("notificationTime between", value1, value2, "notificationTime");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeNotBetween(Long value1, Long value2) {
            addCriterion("notificationTime not between", value1, value2, "notificationTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIsNull() {
            addCriterion("verifyTime is null");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIsNotNull() {
            addCriterion("verifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeEqualTo(Integer value) {
            addCriterion("verifyTime =", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotEqualTo(Integer value) {
            addCriterion("verifyTime <>", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeGreaterThan(Integer value) {
            addCriterion("verifyTime >", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("verifyTime >=", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeLessThan(Integer value) {
            addCriterion("verifyTime <", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeLessThanOrEqualTo(Integer value) {
            addCriterion("verifyTime <=", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIn(List<Integer> values) {
            addCriterion("verifyTime in", values, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotIn(List<Integer> values) {
            addCriterion("verifyTime not in", values, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeBetween(Integer value1, Integer value2) {
            addCriterion("verifyTime between", value1, value2, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("verifyTime not between", value1, value2, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andOrderIDIsNull() {
            addCriterion("orderID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIDIsNotNull() {
            addCriterion("orderID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIDEqualTo(Integer value) {
            addCriterion("orderID =", value, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDNotEqualTo(Integer value) {
            addCriterion("orderID <>", value, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDGreaterThan(Integer value) {
            addCriterion("orderID >", value, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderID >=", value, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDLessThan(Integer value) {
            addCriterion("orderID <", value, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDLessThanOrEqualTo(Integer value) {
            addCriterion("orderID <=", value, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDIn(List<Integer> values) {
            addCriterion("orderID in", values, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDNotIn(List<Integer> values) {
            addCriterion("orderID not in", values, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDBetween(Integer value1, Integer value2) {
            addCriterion("orderID between", value1, value2, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDNotBetween(Integer value1, Integer value2) {
            addCriterion("orderID not between", value1, value2, "orderID");
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