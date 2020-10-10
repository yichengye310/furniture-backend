package com.example.springboot.entity;

import java.util.ArrayList;
import java.util.List;

public class UserAlreadyRobbedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAlreadyRobbedExample() {
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

        public Criteria andPanicBuyingIDIsNull() {
            addCriterion("panicBuyingID is null");
            return (Criteria) this;
        }

        public Criteria andPanicBuyingIDIsNotNull() {
            addCriterion("panicBuyingID is not null");
            return (Criteria) this;
        }

        public Criteria andPanicBuyingIDEqualTo(Integer value) {
            addCriterion("panicBuyingID =", value, "panicBuyingID");
            return (Criteria) this;
        }

        public Criteria andPanicBuyingIDNotEqualTo(Integer value) {
            addCriterion("panicBuyingID <>", value, "panicBuyingID");
            return (Criteria) this;
        }

        public Criteria andPanicBuyingIDGreaterThan(Integer value) {
            addCriterion("panicBuyingID >", value, "panicBuyingID");
            return (Criteria) this;
        }

        public Criteria andPanicBuyingIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("panicBuyingID >=", value, "panicBuyingID");
            return (Criteria) this;
        }

        public Criteria andPanicBuyingIDLessThan(Integer value) {
            addCriterion("panicBuyingID <", value, "panicBuyingID");
            return (Criteria) this;
        }

        public Criteria andPanicBuyingIDLessThanOrEqualTo(Integer value) {
            addCriterion("panicBuyingID <=", value, "panicBuyingID");
            return (Criteria) this;
        }

        public Criteria andPanicBuyingIDIn(List<Integer> values) {
            addCriterion("panicBuyingID in", values, "panicBuyingID");
            return (Criteria) this;
        }

        public Criteria andPanicBuyingIDNotIn(List<Integer> values) {
            addCriterion("panicBuyingID not in", values, "panicBuyingID");
            return (Criteria) this;
        }

        public Criteria andPanicBuyingIDBetween(Integer value1, Integer value2) {
            addCriterion("panicBuyingID between", value1, value2, "panicBuyingID");
            return (Criteria) this;
        }

        public Criteria andPanicBuyingIDNotBetween(Integer value1, Integer value2) {
            addCriterion("panicBuyingID not between", value1, value2, "panicBuyingID");
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

        public Criteria andRelationIDIsNull() {
            addCriterion("relationID is null");
            return (Criteria) this;
        }

        public Criteria andRelationIDIsNotNull() {
            addCriterion("relationID is not null");
            return (Criteria) this;
        }

        public Criteria andRelationIDEqualTo(Integer value) {
            addCriterion("relationID =", value, "relationID");
            return (Criteria) this;
        }

        public Criteria andRelationIDNotEqualTo(Integer value) {
            addCriterion("relationID <>", value, "relationID");
            return (Criteria) this;
        }

        public Criteria andRelationIDGreaterThan(Integer value) {
            addCriterion("relationID >", value, "relationID");
            return (Criteria) this;
        }

        public Criteria andRelationIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("relationID >=", value, "relationID");
            return (Criteria) this;
        }

        public Criteria andRelationIDLessThan(Integer value) {
            addCriterion("relationID <", value, "relationID");
            return (Criteria) this;
        }

        public Criteria andRelationIDLessThanOrEqualTo(Integer value) {
            addCriterion("relationID <=", value, "relationID");
            return (Criteria) this;
        }

        public Criteria andRelationIDIn(List<Integer> values) {
            addCriterion("relationID in", values, "relationID");
            return (Criteria) this;
        }

        public Criteria andRelationIDNotIn(List<Integer> values) {
            addCriterion("relationID not in", values, "relationID");
            return (Criteria) this;
        }

        public Criteria andRelationIDBetween(Integer value1, Integer value2) {
            addCriterion("relationID between", value1, value2, "relationID");
            return (Criteria) this;
        }

        public Criteria andRelationIDNotBetween(Integer value1, Integer value2) {
            addCriterion("relationID not between", value1, value2, "relationID");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIsNull() {
            addCriterion("relationType is null");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIsNotNull() {
            addCriterion("relationType is not null");
            return (Criteria) this;
        }

        public Criteria andRelationTypeEqualTo(Short value) {
            addCriterion("relationType =", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeNotEqualTo(Short value) {
            addCriterion("relationType <>", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeGreaterThan(Short value) {
            addCriterion("relationType >", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("relationType >=", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeLessThan(Short value) {
            addCriterion("relationType <", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeLessThanOrEqualTo(Short value) {
            addCriterion("relationType <=", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIn(List<Short> values) {
            addCriterion("relationType in", values, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeNotIn(List<Short> values) {
            addCriterion("relationType not in", values, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeBetween(Short value1, Short value2) {
            addCriterion("relationType between", value1, value2, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeNotBetween(Short value1, Short value2) {
            addCriterion("relationType not between", value1, value2, "relationType");
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