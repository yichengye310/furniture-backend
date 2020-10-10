package com.example.springboot.entity;

import java.util.ArrayList;
import java.util.List;

public class ProductCategoryLevelThreeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductCategoryLevelThreeExample() {
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

        public Criteria andCategoryIDIsNull() {
            addCriterion("categoryID is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIDIsNotNull() {
            addCriterion("categoryID is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIDEqualTo(Integer value) {
            addCriterion("categoryID =", value, "categoryID");
            return (Criteria) this;
        }

        public Criteria andCategoryIDNotEqualTo(Integer value) {
            addCriterion("categoryID <>", value, "categoryID");
            return (Criteria) this;
        }

        public Criteria andCategoryIDGreaterThan(Integer value) {
            addCriterion("categoryID >", value, "categoryID");
            return (Criteria) this;
        }

        public Criteria andCategoryIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("categoryID >=", value, "categoryID");
            return (Criteria) this;
        }

        public Criteria andCategoryIDLessThan(Integer value) {
            addCriterion("categoryID <", value, "categoryID");
            return (Criteria) this;
        }

        public Criteria andCategoryIDLessThanOrEqualTo(Integer value) {
            addCriterion("categoryID <=", value, "categoryID");
            return (Criteria) this;
        }

        public Criteria andCategoryIDIn(List<Integer> values) {
            addCriterion("categoryID in", values, "categoryID");
            return (Criteria) this;
        }

        public Criteria andCategoryIDNotIn(List<Integer> values) {
            addCriterion("categoryID not in", values, "categoryID");
            return (Criteria) this;
        }

        public Criteria andCategoryIDBetween(Integer value1, Integer value2) {
            addCriterion("categoryID between", value1, value2, "categoryID");
            return (Criteria) this;
        }

        public Criteria andCategoryIDNotBetween(Integer value1, Integer value2) {
            addCriterion("categoryID not between", value1, value2, "categoryID");
            return (Criteria) this;
        }

        public Criteria andCategoryStateIsNull() {
            addCriterion("categoryState is null");
            return (Criteria) this;
        }

        public Criteria andCategoryStateIsNotNull() {
            addCriterion("categoryState is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryStateEqualTo(Short value) {
            addCriterion("categoryState =", value, "categoryState");
            return (Criteria) this;
        }

        public Criteria andCategoryStateNotEqualTo(Short value) {
            addCriterion("categoryState <>", value, "categoryState");
            return (Criteria) this;
        }

        public Criteria andCategoryStateGreaterThan(Short value) {
            addCriterion("categoryState >", value, "categoryState");
            return (Criteria) this;
        }

        public Criteria andCategoryStateGreaterThanOrEqualTo(Short value) {
            addCriterion("categoryState >=", value, "categoryState");
            return (Criteria) this;
        }

        public Criteria andCategoryStateLessThan(Short value) {
            addCriterion("categoryState <", value, "categoryState");
            return (Criteria) this;
        }

        public Criteria andCategoryStateLessThanOrEqualTo(Short value) {
            addCriterion("categoryState <=", value, "categoryState");
            return (Criteria) this;
        }

        public Criteria andCategoryStateIn(List<Short> values) {
            addCriterion("categoryState in", values, "categoryState");
            return (Criteria) this;
        }

        public Criteria andCategoryStateNotIn(List<Short> values) {
            addCriterion("categoryState not in", values, "categoryState");
            return (Criteria) this;
        }

        public Criteria andCategoryStateBetween(Short value1, Short value2) {
            addCriterion("categoryState between", value1, value2, "categoryState");
            return (Criteria) this;
        }

        public Criteria andCategoryStateNotBetween(Short value1, Short value2) {
            addCriterion("categoryState not between", value1, value2, "categoryState");
            return (Criteria) this;
        }

        public Criteria andParentIDIsNull() {
            addCriterion("parentID is null");
            return (Criteria) this;
        }

        public Criteria andParentIDIsNotNull() {
            addCriterion("parentID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIDEqualTo(Integer value) {
            addCriterion("parentID =", value, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDNotEqualTo(Integer value) {
            addCriterion("parentID <>", value, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDGreaterThan(Integer value) {
            addCriterion("parentID >", value, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentID >=", value, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDLessThan(Integer value) {
            addCriterion("parentID <", value, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDLessThanOrEqualTo(Integer value) {
            addCriterion("parentID <=", value, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDIn(List<Integer> values) {
            addCriterion("parentID in", values, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDNotIn(List<Integer> values) {
            addCriterion("parentID not in", values, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDBetween(Integer value1, Integer value2) {
            addCriterion("parentID between", value1, value2, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDNotBetween(Integer value1, Integer value2) {
            addCriterion("parentID not between", value1, value2, "parentID");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNull() {
            addCriterion("categoryName is null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNotNull() {
            addCriterion("categoryName is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameEqualTo(String value) {
            addCriterion("categoryName =", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotEqualTo(String value) {
            addCriterion("categoryName <>", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThan(String value) {
            addCriterion("categoryName >", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("categoryName >=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThan(String value) {
            addCriterion("categoryName <", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("categoryName <=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLike(String value) {
            addCriterion("categoryName like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotLike(String value) {
            addCriterion("categoryName not like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIn(List<String> values) {
            addCriterion("categoryName in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotIn(List<String> values) {
            addCriterion("categoryName not in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameBetween(String value1, String value2) {
            addCriterion("categoryName between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotBetween(String value1, String value2) {
            addCriterion("categoryName not between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryImgIsNull() {
            addCriterion("categoryImg is null");
            return (Criteria) this;
        }

        public Criteria andCategoryImgIsNotNull() {
            addCriterion("categoryImg is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryImgEqualTo(String value) {
            addCriterion("categoryImg =", value, "categoryImg");
            return (Criteria) this;
        }

        public Criteria andCategoryImgNotEqualTo(String value) {
            addCriterion("categoryImg <>", value, "categoryImg");
            return (Criteria) this;
        }

        public Criteria andCategoryImgGreaterThan(String value) {
            addCriterion("categoryImg >", value, "categoryImg");
            return (Criteria) this;
        }

        public Criteria andCategoryImgGreaterThanOrEqualTo(String value) {
            addCriterion("categoryImg >=", value, "categoryImg");
            return (Criteria) this;
        }

        public Criteria andCategoryImgLessThan(String value) {
            addCriterion("categoryImg <", value, "categoryImg");
            return (Criteria) this;
        }

        public Criteria andCategoryImgLessThanOrEqualTo(String value) {
            addCriterion("categoryImg <=", value, "categoryImg");
            return (Criteria) this;
        }

        public Criteria andCategoryImgLike(String value) {
            addCriterion("categoryImg like", value, "categoryImg");
            return (Criteria) this;
        }

        public Criteria andCategoryImgNotLike(String value) {
            addCriterion("categoryImg not like", value, "categoryImg");
            return (Criteria) this;
        }

        public Criteria andCategoryImgIn(List<String> values) {
            addCriterion("categoryImg in", values, "categoryImg");
            return (Criteria) this;
        }

        public Criteria andCategoryImgNotIn(List<String> values) {
            addCriterion("categoryImg not in", values, "categoryImg");
            return (Criteria) this;
        }

        public Criteria andCategoryImgBetween(String value1, String value2) {
            addCriterion("categoryImg between", value1, value2, "categoryImg");
            return (Criteria) this;
        }

        public Criteria andCategoryImgNotBetween(String value1, String value2) {
            addCriterion("categoryImg not between", value1, value2, "categoryImg");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("orderNo is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("orderNo is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(Integer value) {
            addCriterion("orderNo =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(Integer value) {
            addCriterion("orderNo <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(Integer value) {
            addCriterion("orderNo >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderNo >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(Integer value) {
            addCriterion("orderNo <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(Integer value) {
            addCriterion("orderNo <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<Integer> values) {
            addCriterion("orderNo in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<Integer> values) {
            addCriterion("orderNo not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(Integer value1, Integer value2) {
            addCriterion("orderNo between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(Integer value1, Integer value2) {
            addCriterion("orderNo not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andCategoryIconIsNull() {
            addCriterion("categoryIcon is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIconIsNotNull() {
            addCriterion("categoryIcon is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIconEqualTo(String value) {
            addCriterion("categoryIcon =", value, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryIconNotEqualTo(String value) {
            addCriterion("categoryIcon <>", value, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryIconGreaterThan(String value) {
            addCriterion("categoryIcon >", value, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryIconGreaterThanOrEqualTo(String value) {
            addCriterion("categoryIcon >=", value, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryIconLessThan(String value) {
            addCriterion("categoryIcon <", value, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryIconLessThanOrEqualTo(String value) {
            addCriterion("categoryIcon <=", value, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryIconLike(String value) {
            addCriterion("categoryIcon like", value, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryIconNotLike(String value) {
            addCriterion("categoryIcon not like", value, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryIconIn(List<String> values) {
            addCriterion("categoryIcon in", values, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryIconNotIn(List<String> values) {
            addCriterion("categoryIcon not in", values, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryIconBetween(String value1, String value2) {
            addCriterion("categoryIcon between", value1, value2, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryIconNotBetween(String value1, String value2) {
            addCriterion("categoryIcon not between", value1, value2, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andSpellIsNull() {
            addCriterion("spell is null");
            return (Criteria) this;
        }

        public Criteria andSpellIsNotNull() {
            addCriterion("spell is not null");
            return (Criteria) this;
        }

        public Criteria andSpellEqualTo(String value) {
            addCriterion("spell =", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellNotEqualTo(String value) {
            addCriterion("spell <>", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellGreaterThan(String value) {
            addCriterion("spell >", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellGreaterThanOrEqualTo(String value) {
            addCriterion("spell >=", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellLessThan(String value) {
            addCriterion("spell <", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellLessThanOrEqualTo(String value) {
            addCriterion("spell <=", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellLike(String value) {
            addCriterion("spell like", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellNotLike(String value) {
            addCriterion("spell not like", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellIn(List<String> values) {
            addCriterion("spell in", values, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellNotIn(List<String> values) {
            addCriterion("spell not in", values, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellBetween(String value1, String value2) {
            addCriterion("spell between", value1, value2, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellNotBetween(String value1, String value2) {
            addCriterion("spell not between", value1, value2, "spell");
            return (Criteria) this;
        }

        public Criteria andReducedNameIsNull() {
            addCriterion("reducedName is null");
            return (Criteria) this;
        }

        public Criteria andReducedNameIsNotNull() {
            addCriterion("reducedName is not null");
            return (Criteria) this;
        }

        public Criteria andReducedNameEqualTo(String value) {
            addCriterion("reducedName =", value, "reducedName");
            return (Criteria) this;
        }

        public Criteria andReducedNameNotEqualTo(String value) {
            addCriterion("reducedName <>", value, "reducedName");
            return (Criteria) this;
        }

        public Criteria andReducedNameGreaterThan(String value) {
            addCriterion("reducedName >", value, "reducedName");
            return (Criteria) this;
        }

        public Criteria andReducedNameGreaterThanOrEqualTo(String value) {
            addCriterion("reducedName >=", value, "reducedName");
            return (Criteria) this;
        }

        public Criteria andReducedNameLessThan(String value) {
            addCriterion("reducedName <", value, "reducedName");
            return (Criteria) this;
        }

        public Criteria andReducedNameLessThanOrEqualTo(String value) {
            addCriterion("reducedName <=", value, "reducedName");
            return (Criteria) this;
        }

        public Criteria andReducedNameLike(String value) {
            addCriterion("reducedName like", value, "reducedName");
            return (Criteria) this;
        }

        public Criteria andReducedNameNotLike(String value) {
            addCriterion("reducedName not like", value, "reducedName");
            return (Criteria) this;
        }

        public Criteria andReducedNameIn(List<String> values) {
            addCriterion("reducedName in", values, "reducedName");
            return (Criteria) this;
        }

        public Criteria andReducedNameNotIn(List<String> values) {
            addCriterion("reducedName not in", values, "reducedName");
            return (Criteria) this;
        }

        public Criteria andReducedNameBetween(String value1, String value2) {
            addCriterion("reducedName between", value1, value2, "reducedName");
            return (Criteria) this;
        }

        public Criteria andReducedNameNotBetween(String value1, String value2) {
            addCriterion("reducedName not between", value1, value2, "reducedName");
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