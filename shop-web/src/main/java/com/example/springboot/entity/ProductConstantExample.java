package com.example.springboot.entity;

import java.util.ArrayList;
import java.util.List;

public class ProductConstantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductConstantExample() {
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

        public Criteria andConstantCodeIsNull() {
            addCriterion("constantCode is null");
            return (Criteria) this;
        }

        public Criteria andConstantCodeIsNotNull() {
            addCriterion("constantCode is not null");
            return (Criteria) this;
        }

        public Criteria andConstantCodeEqualTo(Short value) {
            addCriterion("constantCode =", value, "constantCode");
            return (Criteria) this;
        }

        public Criteria andConstantCodeNotEqualTo(Short value) {
            addCriterion("constantCode <>", value, "constantCode");
            return (Criteria) this;
        }

        public Criteria andConstantCodeGreaterThan(Short value) {
            addCriterion("constantCode >", value, "constantCode");
            return (Criteria) this;
        }

        public Criteria andConstantCodeGreaterThanOrEqualTo(Short value) {
            addCriterion("constantCode >=", value, "constantCode");
            return (Criteria) this;
        }

        public Criteria andConstantCodeLessThan(Short value) {
            addCriterion("constantCode <", value, "constantCode");
            return (Criteria) this;
        }

        public Criteria andConstantCodeLessThanOrEqualTo(Short value) {
            addCriterion("constantCode <=", value, "constantCode");
            return (Criteria) this;
        }

        public Criteria andConstantCodeIn(List<Short> values) {
            addCriterion("constantCode in", values, "constantCode");
            return (Criteria) this;
        }

        public Criteria andConstantCodeNotIn(List<Short> values) {
            addCriterion("constantCode not in", values, "constantCode");
            return (Criteria) this;
        }

        public Criteria andConstantCodeBetween(Short value1, Short value2) {
            addCriterion("constantCode between", value1, value2, "constantCode");
            return (Criteria) this;
        }

        public Criteria andConstantCodeNotBetween(Short value1, Short value2) {
            addCriterion("constantCode not between", value1, value2, "constantCode");
            return (Criteria) this;
        }

        public Criteria andConstantIDIsNull() {
            addCriterion("constantID is null");
            return (Criteria) this;
        }

        public Criteria andConstantIDIsNotNull() {
            addCriterion("constantID is not null");
            return (Criteria) this;
        }

        public Criteria andConstantIDEqualTo(Short value) {
            addCriterion("constantID =", value, "constantID");
            return (Criteria) this;
        }

        public Criteria andConstantIDNotEqualTo(Short value) {
            addCriterion("constantID <>", value, "constantID");
            return (Criteria) this;
        }

        public Criteria andConstantIDGreaterThan(Short value) {
            addCriterion("constantID >", value, "constantID");
            return (Criteria) this;
        }

        public Criteria andConstantIDGreaterThanOrEqualTo(Short value) {
            addCriterion("constantID >=", value, "constantID");
            return (Criteria) this;
        }

        public Criteria andConstantIDLessThan(Short value) {
            addCriterion("constantID <", value, "constantID");
            return (Criteria) this;
        }

        public Criteria andConstantIDLessThanOrEqualTo(Short value) {
            addCriterion("constantID <=", value, "constantID");
            return (Criteria) this;
        }

        public Criteria andConstantIDIn(List<Short> values) {
            addCriterion("constantID in", values, "constantID");
            return (Criteria) this;
        }

        public Criteria andConstantIDNotIn(List<Short> values) {
            addCriterion("constantID not in", values, "constantID");
            return (Criteria) this;
        }

        public Criteria andConstantIDBetween(Short value1, Short value2) {
            addCriterion("constantID between", value1, value2, "constantID");
            return (Criteria) this;
        }

        public Criteria andConstantIDNotBetween(Short value1, Short value2) {
            addCriterion("constantID not between", value1, value2, "constantID");
            return (Criteria) this;
        }

        public Criteria andConstantFieldNameIsNull() {
            addCriterion("constantFieldName is null");
            return (Criteria) this;
        }

        public Criteria andConstantFieldNameIsNotNull() {
            addCriterion("constantFieldName is not null");
            return (Criteria) this;
        }

        public Criteria andConstantFieldNameEqualTo(String value) {
            addCriterion("constantFieldName =", value, "constantFieldName");
            return (Criteria) this;
        }

        public Criteria andConstantFieldNameNotEqualTo(String value) {
            addCriterion("constantFieldName <>", value, "constantFieldName");
            return (Criteria) this;
        }

        public Criteria andConstantFieldNameGreaterThan(String value) {
            addCriterion("constantFieldName >", value, "constantFieldName");
            return (Criteria) this;
        }

        public Criteria andConstantFieldNameGreaterThanOrEqualTo(String value) {
            addCriterion("constantFieldName >=", value, "constantFieldName");
            return (Criteria) this;
        }

        public Criteria andConstantFieldNameLessThan(String value) {
            addCriterion("constantFieldName <", value, "constantFieldName");
            return (Criteria) this;
        }

        public Criteria andConstantFieldNameLessThanOrEqualTo(String value) {
            addCriterion("constantFieldName <=", value, "constantFieldName");
            return (Criteria) this;
        }

        public Criteria andConstantFieldNameLike(String value) {
            addCriterion("constantFieldName like", value, "constantFieldName");
            return (Criteria) this;
        }

        public Criteria andConstantFieldNameNotLike(String value) {
            addCriterion("constantFieldName not like", value, "constantFieldName");
            return (Criteria) this;
        }

        public Criteria andConstantFieldNameIn(List<String> values) {
            addCriterion("constantFieldName in", values, "constantFieldName");
            return (Criteria) this;
        }

        public Criteria andConstantFieldNameNotIn(List<String> values) {
            addCriterion("constantFieldName not in", values, "constantFieldName");
            return (Criteria) this;
        }

        public Criteria andConstantFieldNameBetween(String value1, String value2) {
            addCriterion("constantFieldName between", value1, value2, "constantFieldName");
            return (Criteria) this;
        }

        public Criteria andConstantFieldNameNotBetween(String value1, String value2) {
            addCriterion("constantFieldName not between", value1, value2, "constantFieldName");
            return (Criteria) this;
        }

        public Criteria andConstantNameIsNull() {
            addCriterion("constantName is null");
            return (Criteria) this;
        }

        public Criteria andConstantNameIsNotNull() {
            addCriterion("constantName is not null");
            return (Criteria) this;
        }

        public Criteria andConstantNameEqualTo(String value) {
            addCriterion("constantName =", value, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameNotEqualTo(String value) {
            addCriterion("constantName <>", value, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameGreaterThan(String value) {
            addCriterion("constantName >", value, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameGreaterThanOrEqualTo(String value) {
            addCriterion("constantName >=", value, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameLessThan(String value) {
            addCriterion("constantName <", value, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameLessThanOrEqualTo(String value) {
            addCriterion("constantName <=", value, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameLike(String value) {
            addCriterion("constantName like", value, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameNotLike(String value) {
            addCriterion("constantName not like", value, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameIn(List<String> values) {
            addCriterion("constantName in", values, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameNotIn(List<String> values) {
            addCriterion("constantName not in", values, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameBetween(String value1, String value2) {
            addCriterion("constantName between", value1, value2, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameNotBetween(String value1, String value2) {
            addCriterion("constantName not between", value1, value2, "constantName");
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