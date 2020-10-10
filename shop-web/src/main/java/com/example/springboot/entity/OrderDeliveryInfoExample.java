package com.example.springboot.entity;

import java.util.ArrayList;
import java.util.List;

public class OrderDeliveryInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderDeliveryInfoExample() {
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

        public Criteria andDeliverNameIsNull() {
            addCriterion("deliverName is null");
            return (Criteria) this;
        }

        public Criteria andDeliverNameIsNotNull() {
            addCriterion("deliverName is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverNameEqualTo(String value) {
            addCriterion("deliverName =", value, "deliverName");
            return (Criteria) this;
        }

        public Criteria andDeliverNameNotEqualTo(String value) {
            addCriterion("deliverName <>", value, "deliverName");
            return (Criteria) this;
        }

        public Criteria andDeliverNameGreaterThan(String value) {
            addCriterion("deliverName >", value, "deliverName");
            return (Criteria) this;
        }

        public Criteria andDeliverNameGreaterThanOrEqualTo(String value) {
            addCriterion("deliverName >=", value, "deliverName");
            return (Criteria) this;
        }

        public Criteria andDeliverNameLessThan(String value) {
            addCriterion("deliverName <", value, "deliverName");
            return (Criteria) this;
        }

        public Criteria andDeliverNameLessThanOrEqualTo(String value) {
            addCriterion("deliverName <=", value, "deliverName");
            return (Criteria) this;
        }

        public Criteria andDeliverNameLike(String value) {
            addCriterion("deliverName like", value, "deliverName");
            return (Criteria) this;
        }

        public Criteria andDeliverNameNotLike(String value) {
            addCriterion("deliverName not like", value, "deliverName");
            return (Criteria) this;
        }

        public Criteria andDeliverNameIn(List<String> values) {
            addCriterion("deliverName in", values, "deliverName");
            return (Criteria) this;
        }

        public Criteria andDeliverNameNotIn(List<String> values) {
            addCriterion("deliverName not in", values, "deliverName");
            return (Criteria) this;
        }

        public Criteria andDeliverNameBetween(String value1, String value2) {
            addCriterion("deliverName between", value1, value2, "deliverName");
            return (Criteria) this;
        }

        public Criteria andDeliverNameNotBetween(String value1, String value2) {
            addCriterion("deliverName not between", value1, value2, "deliverName");
            return (Criteria) this;
        }

        public Criteria andDeliverPhoneIsNull() {
            addCriterion("deliverPhone is null");
            return (Criteria) this;
        }

        public Criteria andDeliverPhoneIsNotNull() {
            addCriterion("deliverPhone is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverPhoneEqualTo(String value) {
            addCriterion("deliverPhone =", value, "deliverPhone");
            return (Criteria) this;
        }

        public Criteria andDeliverPhoneNotEqualTo(String value) {
            addCriterion("deliverPhone <>", value, "deliverPhone");
            return (Criteria) this;
        }

        public Criteria andDeliverPhoneGreaterThan(String value) {
            addCriterion("deliverPhone >", value, "deliverPhone");
            return (Criteria) this;
        }

        public Criteria andDeliverPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("deliverPhone >=", value, "deliverPhone");
            return (Criteria) this;
        }

        public Criteria andDeliverPhoneLessThan(String value) {
            addCriterion("deliverPhone <", value, "deliverPhone");
            return (Criteria) this;
        }

        public Criteria andDeliverPhoneLessThanOrEqualTo(String value) {
            addCriterion("deliverPhone <=", value, "deliverPhone");
            return (Criteria) this;
        }

        public Criteria andDeliverPhoneLike(String value) {
            addCriterion("deliverPhone like", value, "deliverPhone");
            return (Criteria) this;
        }

        public Criteria andDeliverPhoneNotLike(String value) {
            addCriterion("deliverPhone not like", value, "deliverPhone");
            return (Criteria) this;
        }

        public Criteria andDeliverPhoneIn(List<String> values) {
            addCriterion("deliverPhone in", values, "deliverPhone");
            return (Criteria) this;
        }

        public Criteria andDeliverPhoneNotIn(List<String> values) {
            addCriterion("deliverPhone not in", values, "deliverPhone");
            return (Criteria) this;
        }

        public Criteria andDeliverPhoneBetween(String value1, String value2) {
            addCriterion("deliverPhone between", value1, value2, "deliverPhone");
            return (Criteria) this;
        }

        public Criteria andDeliverPhoneNotBetween(String value1, String value2) {
            addCriterion("deliverPhone not between", value1, value2, "deliverPhone");
            return (Criteria) this;
        }

        public Criteria andDeliverAddressIsNull() {
            addCriterion("deliverAddress is null");
            return (Criteria) this;
        }

        public Criteria andDeliverAddressIsNotNull() {
            addCriterion("deliverAddress is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverAddressEqualTo(String value) {
            addCriterion("deliverAddress =", value, "deliverAddress");
            return (Criteria) this;
        }

        public Criteria andDeliverAddressNotEqualTo(String value) {
            addCriterion("deliverAddress <>", value, "deliverAddress");
            return (Criteria) this;
        }

        public Criteria andDeliverAddressGreaterThan(String value) {
            addCriterion("deliverAddress >", value, "deliverAddress");
            return (Criteria) this;
        }

        public Criteria andDeliverAddressGreaterThanOrEqualTo(String value) {
            addCriterion("deliverAddress >=", value, "deliverAddress");
            return (Criteria) this;
        }

        public Criteria andDeliverAddressLessThan(String value) {
            addCriterion("deliverAddress <", value, "deliverAddress");
            return (Criteria) this;
        }

        public Criteria andDeliverAddressLessThanOrEqualTo(String value) {
            addCriterion("deliverAddress <=", value, "deliverAddress");
            return (Criteria) this;
        }

        public Criteria andDeliverAddressLike(String value) {
            addCriterion("deliverAddress like", value, "deliverAddress");
            return (Criteria) this;
        }

        public Criteria andDeliverAddressNotLike(String value) {
            addCriterion("deliverAddress not like", value, "deliverAddress");
            return (Criteria) this;
        }

        public Criteria andDeliverAddressIn(List<String> values) {
            addCriterion("deliverAddress in", values, "deliverAddress");
            return (Criteria) this;
        }

        public Criteria andDeliverAddressNotIn(List<String> values) {
            addCriterion("deliverAddress not in", values, "deliverAddress");
            return (Criteria) this;
        }

        public Criteria andDeliverAddressBetween(String value1, String value2) {
            addCriterion("deliverAddress between", value1, value2, "deliverAddress");
            return (Criteria) this;
        }

        public Criteria andDeliverAddressNotBetween(String value1, String value2) {
            addCriterion("deliverAddress not between", value1, value2, "deliverAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNull() {
            addCriterion("deliveryTime is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNotNull() {
            addCriterion("deliveryTime is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeEqualTo(Long value) {
            addCriterion("deliveryTime =", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotEqualTo(Long value) {
            addCriterion("deliveryTime <>", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThan(Long value) {
            addCriterion("deliveryTime >", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("deliveryTime >=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThan(Long value) {
            addCriterion("deliveryTime <", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThanOrEqualTo(Long value) {
            addCriterion("deliveryTime <=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIn(List<Long> values) {
            addCriterion("deliveryTime in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotIn(List<Long> values) {
            addCriterion("deliveryTime not in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeBetween(Long value1, Long value2) {
            addCriterion("deliveryTime between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotBetween(Long value1, Long value2) {
            addCriterion("deliveryTime not between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andExpressNameIsNull() {
            addCriterion("expressName is null");
            return (Criteria) this;
        }

        public Criteria andExpressNameIsNotNull() {
            addCriterion("expressName is not null");
            return (Criteria) this;
        }

        public Criteria andExpressNameEqualTo(String value) {
            addCriterion("expressName =", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameNotEqualTo(String value) {
            addCriterion("expressName <>", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameGreaterThan(String value) {
            addCriterion("expressName >", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameGreaterThanOrEqualTo(String value) {
            addCriterion("expressName >=", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameLessThan(String value) {
            addCriterion("expressName <", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameLessThanOrEqualTo(String value) {
            addCriterion("expressName <=", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameLike(String value) {
            addCriterion("expressName like", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameNotLike(String value) {
            addCriterion("expressName not like", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameIn(List<String> values) {
            addCriterion("expressName in", values, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameNotIn(List<String> values) {
            addCriterion("expressName not in", values, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameBetween(String value1, String value2) {
            addCriterion("expressName between", value1, value2, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameNotBetween(String value1, String value2) {
            addCriterion("expressName not between", value1, value2, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNumberIsNull() {
            addCriterion("expressNumber is null");
            return (Criteria) this;
        }

        public Criteria andExpressNumberIsNotNull() {
            addCriterion("expressNumber is not null");
            return (Criteria) this;
        }

        public Criteria andExpressNumberEqualTo(String value) {
            addCriterion("expressNumber =", value, "expressNumber");
            return (Criteria) this;
        }

        public Criteria andExpressNumberNotEqualTo(String value) {
            addCriterion("expressNumber <>", value, "expressNumber");
            return (Criteria) this;
        }

        public Criteria andExpressNumberGreaterThan(String value) {
            addCriterion("expressNumber >", value, "expressNumber");
            return (Criteria) this;
        }

        public Criteria andExpressNumberGreaterThanOrEqualTo(String value) {
            addCriterion("expressNumber >=", value, "expressNumber");
            return (Criteria) this;
        }

        public Criteria andExpressNumberLessThan(String value) {
            addCriterion("expressNumber <", value, "expressNumber");
            return (Criteria) this;
        }

        public Criteria andExpressNumberLessThanOrEqualTo(String value) {
            addCriterion("expressNumber <=", value, "expressNumber");
            return (Criteria) this;
        }

        public Criteria andExpressNumberLike(String value) {
            addCriterion("expressNumber like", value, "expressNumber");
            return (Criteria) this;
        }

        public Criteria andExpressNumberNotLike(String value) {
            addCriterion("expressNumber not like", value, "expressNumber");
            return (Criteria) this;
        }

        public Criteria andExpressNumberIn(List<String> values) {
            addCriterion("expressNumber in", values, "expressNumber");
            return (Criteria) this;
        }

        public Criteria andExpressNumberNotIn(List<String> values) {
            addCriterion("expressNumber not in", values, "expressNumber");
            return (Criteria) this;
        }

        public Criteria andExpressNumberBetween(String value1, String value2) {
            addCriterion("expressNumber between", value1, value2, "expressNumber");
            return (Criteria) this;
        }

        public Criteria andExpressNumberNotBetween(String value1, String value2) {
            addCriterion("expressNumber not between", value1, value2, "expressNumber");
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