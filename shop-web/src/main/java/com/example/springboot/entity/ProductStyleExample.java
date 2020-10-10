package com.example.springboot.entity;

import java.util.ArrayList;
import java.util.List;

public class ProductStyleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductStyleExample() {
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

        public Criteria andStyleNameIsNull() {
            addCriterion("styleName is null");
            return (Criteria) this;
        }

        public Criteria andStyleNameIsNotNull() {
            addCriterion("styleName is not null");
            return (Criteria) this;
        }

        public Criteria andStyleNameEqualTo(String value) {
            addCriterion("styleName =", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameNotEqualTo(String value) {
            addCriterion("styleName <>", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameGreaterThan(String value) {
            addCriterion("styleName >", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameGreaterThanOrEqualTo(String value) {
            addCriterion("styleName >=", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameLessThan(String value) {
            addCriterion("styleName <", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameLessThanOrEqualTo(String value) {
            addCriterion("styleName <=", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameLike(String value) {
            addCriterion("styleName like", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameNotLike(String value) {
            addCriterion("styleName not like", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameIn(List<String> values) {
            addCriterion("styleName in", values, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameNotIn(List<String> values) {
            addCriterion("styleName not in", values, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameBetween(String value1, String value2) {
            addCriterion("styleName between", value1, value2, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameNotBetween(String value1, String value2) {
            addCriterion("styleName not between", value1, value2, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleImgAppIsNull() {
            addCriterion("styleImgApp is null");
            return (Criteria) this;
        }

        public Criteria andStyleImgAppIsNotNull() {
            addCriterion("styleImgApp is not null");
            return (Criteria) this;
        }

        public Criteria andStyleImgAppEqualTo(String value) {
            addCriterion("styleImgApp =", value, "styleImgApp");
            return (Criteria) this;
        }

        public Criteria andStyleImgAppNotEqualTo(String value) {
            addCriterion("styleImgApp <>", value, "styleImgApp");
            return (Criteria) this;
        }

        public Criteria andStyleImgAppGreaterThan(String value) {
            addCriterion("styleImgApp >", value, "styleImgApp");
            return (Criteria) this;
        }

        public Criteria andStyleImgAppGreaterThanOrEqualTo(String value) {
            addCriterion("styleImgApp >=", value, "styleImgApp");
            return (Criteria) this;
        }

        public Criteria andStyleImgAppLessThan(String value) {
            addCriterion("styleImgApp <", value, "styleImgApp");
            return (Criteria) this;
        }

        public Criteria andStyleImgAppLessThanOrEqualTo(String value) {
            addCriterion("styleImgApp <=", value, "styleImgApp");
            return (Criteria) this;
        }

        public Criteria andStyleImgAppLike(String value) {
            addCriterion("styleImgApp like", value, "styleImgApp");
            return (Criteria) this;
        }

        public Criteria andStyleImgAppNotLike(String value) {
            addCriterion("styleImgApp not like", value, "styleImgApp");
            return (Criteria) this;
        }

        public Criteria andStyleImgAppIn(List<String> values) {
            addCriterion("styleImgApp in", values, "styleImgApp");
            return (Criteria) this;
        }

        public Criteria andStyleImgAppNotIn(List<String> values) {
            addCriterion("styleImgApp not in", values, "styleImgApp");
            return (Criteria) this;
        }

        public Criteria andStyleImgAppBetween(String value1, String value2) {
            addCriterion("styleImgApp between", value1, value2, "styleImgApp");
            return (Criteria) this;
        }

        public Criteria andStyleImgAppNotBetween(String value1, String value2) {
            addCriterion("styleImgApp not between", value1, value2, "styleImgApp");
            return (Criteria) this;
        }

        public Criteria andStyleImgWebIsNull() {
            addCriterion("styleImgWeb is null");
            return (Criteria) this;
        }

        public Criteria andStyleImgWebIsNotNull() {
            addCriterion("styleImgWeb is not null");
            return (Criteria) this;
        }

        public Criteria andStyleImgWebEqualTo(String value) {
            addCriterion("styleImgWeb =", value, "styleImgWeb");
            return (Criteria) this;
        }

        public Criteria andStyleImgWebNotEqualTo(String value) {
            addCriterion("styleImgWeb <>", value, "styleImgWeb");
            return (Criteria) this;
        }

        public Criteria andStyleImgWebGreaterThan(String value) {
            addCriterion("styleImgWeb >", value, "styleImgWeb");
            return (Criteria) this;
        }

        public Criteria andStyleImgWebGreaterThanOrEqualTo(String value) {
            addCriterion("styleImgWeb >=", value, "styleImgWeb");
            return (Criteria) this;
        }

        public Criteria andStyleImgWebLessThan(String value) {
            addCriterion("styleImgWeb <", value, "styleImgWeb");
            return (Criteria) this;
        }

        public Criteria andStyleImgWebLessThanOrEqualTo(String value) {
            addCriterion("styleImgWeb <=", value, "styleImgWeb");
            return (Criteria) this;
        }

        public Criteria andStyleImgWebLike(String value) {
            addCriterion("styleImgWeb like", value, "styleImgWeb");
            return (Criteria) this;
        }

        public Criteria andStyleImgWebNotLike(String value) {
            addCriterion("styleImgWeb not like", value, "styleImgWeb");
            return (Criteria) this;
        }

        public Criteria andStyleImgWebIn(List<String> values) {
            addCriterion("styleImgWeb in", values, "styleImgWeb");
            return (Criteria) this;
        }

        public Criteria andStyleImgWebNotIn(List<String> values) {
            addCriterion("styleImgWeb not in", values, "styleImgWeb");
            return (Criteria) this;
        }

        public Criteria andStyleImgWebBetween(String value1, String value2) {
            addCriterion("styleImgWeb between", value1, value2, "styleImgWeb");
            return (Criteria) this;
        }

        public Criteria andStyleImgWebNotBetween(String value1, String value2) {
            addCriterion("styleImgWeb not between", value1, value2, "styleImgWeb");
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

        public Criteria andItemNumIsNull() {
            addCriterion("itemNum is null");
            return (Criteria) this;
        }

        public Criteria andItemNumIsNotNull() {
            addCriterion("itemNum is not null");
            return (Criteria) this;
        }

        public Criteria andItemNumEqualTo(Integer value) {
            addCriterion("itemNum =", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumNotEqualTo(Integer value) {
            addCriterion("itemNum <>", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumGreaterThan(Integer value) {
            addCriterion("itemNum >", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("itemNum >=", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumLessThan(Integer value) {
            addCriterion("itemNum <", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumLessThanOrEqualTo(Integer value) {
            addCriterion("itemNum <=", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumIn(List<Integer> values) {
            addCriterion("itemNum in", values, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumNotIn(List<Integer> values) {
            addCriterion("itemNum not in", values, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumBetween(Integer value1, Integer value2) {
            addCriterion("itemNum between", value1, value2, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumNotBetween(Integer value1, Integer value2) {
            addCriterion("itemNum not between", value1, value2, "itemNum");
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