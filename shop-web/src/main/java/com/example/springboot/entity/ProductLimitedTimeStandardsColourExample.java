package com.example.springboot.entity;

import java.util.ArrayList;
import java.util.List;

public class ProductLimitedTimeStandardsColourExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductLimitedTimeStandardsColourExample() {
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

        public Criteria andColourIDIsNull() {
            addCriterion("colourID is null");
            return (Criteria) this;
        }

        public Criteria andColourIDIsNotNull() {
            addCriterion("colourID is not null");
            return (Criteria) this;
        }

        public Criteria andColourIDEqualTo(Integer value) {
            addCriterion("colourID =", value, "colourID");
            return (Criteria) this;
        }

        public Criteria andColourIDNotEqualTo(Integer value) {
            addCriterion("colourID <>", value, "colourID");
            return (Criteria) this;
        }

        public Criteria andColourIDGreaterThan(Integer value) {
            addCriterion("colourID >", value, "colourID");
            return (Criteria) this;
        }

        public Criteria andColourIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("colourID >=", value, "colourID");
            return (Criteria) this;
        }

        public Criteria andColourIDLessThan(Integer value) {
            addCriterion("colourID <", value, "colourID");
            return (Criteria) this;
        }

        public Criteria andColourIDLessThanOrEqualTo(Integer value) {
            addCriterion("colourID <=", value, "colourID");
            return (Criteria) this;
        }

        public Criteria andColourIDIn(List<Integer> values) {
            addCriterion("colourID in", values, "colourID");
            return (Criteria) this;
        }

        public Criteria andColourIDNotIn(List<Integer> values) {
            addCriterion("colourID not in", values, "colourID");
            return (Criteria) this;
        }

        public Criteria andColourIDBetween(Integer value1, Integer value2) {
            addCriterion("colourID between", value1, value2, "colourID");
            return (Criteria) this;
        }

        public Criteria andColourIDNotBetween(Integer value1, Integer value2) {
            addCriterion("colourID not between", value1, value2, "colourID");
            return (Criteria) this;
        }

        public Criteria andBandStandardIDIsNull() {
            addCriterion("bandStandardID is null");
            return (Criteria) this;
        }

        public Criteria andBandStandardIDIsNotNull() {
            addCriterion("bandStandardID is not null");
            return (Criteria) this;
        }

        public Criteria andBandStandardIDEqualTo(Integer value) {
            addCriterion("bandStandardID =", value, "bandStandardID");
            return (Criteria) this;
        }

        public Criteria andBandStandardIDNotEqualTo(Integer value) {
            addCriterion("bandStandardID <>", value, "bandStandardID");
            return (Criteria) this;
        }

        public Criteria andBandStandardIDGreaterThan(Integer value) {
            addCriterion("bandStandardID >", value, "bandStandardID");
            return (Criteria) this;
        }

        public Criteria andBandStandardIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("bandStandardID >=", value, "bandStandardID");
            return (Criteria) this;
        }

        public Criteria andBandStandardIDLessThan(Integer value) {
            addCriterion("bandStandardID <", value, "bandStandardID");
            return (Criteria) this;
        }

        public Criteria andBandStandardIDLessThanOrEqualTo(Integer value) {
            addCriterion("bandStandardID <=", value, "bandStandardID");
            return (Criteria) this;
        }

        public Criteria andBandStandardIDIn(List<Integer> values) {
            addCriterion("bandStandardID in", values, "bandStandardID");
            return (Criteria) this;
        }

        public Criteria andBandStandardIDNotIn(List<Integer> values) {
            addCriterion("bandStandardID not in", values, "bandStandardID");
            return (Criteria) this;
        }

        public Criteria andBandStandardIDBetween(Integer value1, Integer value2) {
            addCriterion("bandStandardID between", value1, value2, "bandStandardID");
            return (Criteria) this;
        }

        public Criteria andBandStandardIDNotBetween(Integer value1, Integer value2) {
            addCriterion("bandStandardID not between", value1, value2, "bandStandardID");
            return (Criteria) this;
        }

        public Criteria andColourNameIsNull() {
            addCriterion("colourName is null");
            return (Criteria) this;
        }

        public Criteria andColourNameIsNotNull() {
            addCriterion("colourName is not null");
            return (Criteria) this;
        }

        public Criteria andColourNameEqualTo(String value) {
            addCriterion("colourName =", value, "colourName");
            return (Criteria) this;
        }

        public Criteria andColourNameNotEqualTo(String value) {
            addCriterion("colourName <>", value, "colourName");
            return (Criteria) this;
        }

        public Criteria andColourNameGreaterThan(String value) {
            addCriterion("colourName >", value, "colourName");
            return (Criteria) this;
        }

        public Criteria andColourNameGreaterThanOrEqualTo(String value) {
            addCriterion("colourName >=", value, "colourName");
            return (Criteria) this;
        }

        public Criteria andColourNameLessThan(String value) {
            addCriterion("colourName <", value, "colourName");
            return (Criteria) this;
        }

        public Criteria andColourNameLessThanOrEqualTo(String value) {
            addCriterion("colourName <=", value, "colourName");
            return (Criteria) this;
        }

        public Criteria andColourNameLike(String value) {
            addCriterion("colourName like", value, "colourName");
            return (Criteria) this;
        }

        public Criteria andColourNameNotLike(String value) {
            addCriterion("colourName not like", value, "colourName");
            return (Criteria) this;
        }

        public Criteria andColourNameIn(List<String> values) {
            addCriterion("colourName in", values, "colourName");
            return (Criteria) this;
        }

        public Criteria andColourNameNotIn(List<String> values) {
            addCriterion("colourName not in", values, "colourName");
            return (Criteria) this;
        }

        public Criteria andColourNameBetween(String value1, String value2) {
            addCriterion("colourName between", value1, value2, "colourName");
            return (Criteria) this;
        }

        public Criteria andColourNameNotBetween(String value1, String value2) {
            addCriterion("colourName not between", value1, value2, "colourName");
            return (Criteria) this;
        }

        public Criteria andColourImageIsNull() {
            addCriterion("colourImage is null");
            return (Criteria) this;
        }

        public Criteria andColourImageIsNotNull() {
            addCriterion("colourImage is not null");
            return (Criteria) this;
        }

        public Criteria andColourImageEqualTo(String value) {
            addCriterion("colourImage =", value, "colourImage");
            return (Criteria) this;
        }

        public Criteria andColourImageNotEqualTo(String value) {
            addCriterion("colourImage <>", value, "colourImage");
            return (Criteria) this;
        }

        public Criteria andColourImageGreaterThan(String value) {
            addCriterion("colourImage >", value, "colourImage");
            return (Criteria) this;
        }

        public Criteria andColourImageGreaterThanOrEqualTo(String value) {
            addCriterion("colourImage >=", value, "colourImage");
            return (Criteria) this;
        }

        public Criteria andColourImageLessThan(String value) {
            addCriterion("colourImage <", value, "colourImage");
            return (Criteria) this;
        }

        public Criteria andColourImageLessThanOrEqualTo(String value) {
            addCriterion("colourImage <=", value, "colourImage");
            return (Criteria) this;
        }

        public Criteria andColourImageLike(String value) {
            addCriterion("colourImage like", value, "colourImage");
            return (Criteria) this;
        }

        public Criteria andColourImageNotLike(String value) {
            addCriterion("colourImage not like", value, "colourImage");
            return (Criteria) this;
        }

        public Criteria andColourImageIn(List<String> values) {
            addCriterion("colourImage in", values, "colourImage");
            return (Criteria) this;
        }

        public Criteria andColourImageNotIn(List<String> values) {
            addCriterion("colourImage not in", values, "colourImage");
            return (Criteria) this;
        }

        public Criteria andColourImageBetween(String value1, String value2) {
            addCriterion("colourImage between", value1, value2, "colourImage");
            return (Criteria) this;
        }

        public Criteria andColourImageNotBetween(String value1, String value2) {
            addCriterion("colourImage not between", value1, value2, "colourImage");
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