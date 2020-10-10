package com.example.springboot.entity;

import java.util.ArrayList;
import java.util.List;

public class CommonImageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommonImageExample() {
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

        public Criteria andImageIDIsNull() {
            addCriterion("imageID is null");
            return (Criteria) this;
        }

        public Criteria andImageIDIsNotNull() {
            addCriterion("imageID is not null");
            return (Criteria) this;
        }

        public Criteria andImageIDEqualTo(Integer value) {
            addCriterion("imageID =", value, "imageID");
            return (Criteria) this;
        }

        public Criteria andImageIDNotEqualTo(Integer value) {
            addCriterion("imageID <>", value, "imageID");
            return (Criteria) this;
        }

        public Criteria andImageIDGreaterThan(Integer value) {
            addCriterion("imageID >", value, "imageID");
            return (Criteria) this;
        }

        public Criteria andImageIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("imageID >=", value, "imageID");
            return (Criteria) this;
        }

        public Criteria andImageIDLessThan(Integer value) {
            addCriterion("imageID <", value, "imageID");
            return (Criteria) this;
        }

        public Criteria andImageIDLessThanOrEqualTo(Integer value) {
            addCriterion("imageID <=", value, "imageID");
            return (Criteria) this;
        }

        public Criteria andImageIDIn(List<Integer> values) {
            addCriterion("imageID in", values, "imageID");
            return (Criteria) this;
        }

        public Criteria andImageIDNotIn(List<Integer> values) {
            addCriterion("imageID not in", values, "imageID");
            return (Criteria) this;
        }

        public Criteria andImageIDBetween(Integer value1, Integer value2) {
            addCriterion("imageID between", value1, value2, "imageID");
            return (Criteria) this;
        }

        public Criteria andImageIDNotBetween(Integer value1, Integer value2) {
            addCriterion("imageID not between", value1, value2, "imageID");
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

        public Criteria andImageUrlIsNull() {
            addCriterion("imageUrl is null");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNotNull() {
            addCriterion("imageUrl is not null");
            return (Criteria) this;
        }

        public Criteria andImageUrlEqualTo(String value) {
            addCriterion("imageUrl =", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotEqualTo(String value) {
            addCriterion("imageUrl <>", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThan(String value) {
            addCriterion("imageUrl >", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("imageUrl >=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThan(String value) {
            addCriterion("imageUrl <", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThanOrEqualTo(String value) {
            addCriterion("imageUrl <=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLike(String value) {
            addCriterion("imageUrl like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotLike(String value) {
            addCriterion("imageUrl not like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlIn(List<String> values) {
            addCriterion("imageUrl in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotIn(List<String> values) {
            addCriterion("imageUrl not in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlBetween(String value1, String value2) {
            addCriterion("imageUrl between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotBetween(String value1, String value2) {
            addCriterion("imageUrl not between", value1, value2, "imageUrl");
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