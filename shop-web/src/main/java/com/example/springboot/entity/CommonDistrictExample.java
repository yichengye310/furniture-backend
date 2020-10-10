package com.example.springboot.entity;

import java.util.ArrayList;
import java.util.List;

public class CommonDistrictExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommonDistrictExample() {
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

        public Criteria andLocationDistrictIDIsNull() {
            addCriterion("locationDistrictID is null");
            return (Criteria) this;
        }

        public Criteria andLocationDistrictIDIsNotNull() {
            addCriterion("locationDistrictID is not null");
            return (Criteria) this;
        }

        public Criteria andLocationDistrictIDEqualTo(Integer value) {
            addCriterion("locationDistrictID =", value, "locationDistrictID");
            return (Criteria) this;
        }

        public Criteria andLocationDistrictIDNotEqualTo(Integer value) {
            addCriterion("locationDistrictID <>", value, "locationDistrictID");
            return (Criteria) this;
        }

        public Criteria andLocationDistrictIDGreaterThan(Integer value) {
            addCriterion("locationDistrictID >", value, "locationDistrictID");
            return (Criteria) this;
        }

        public Criteria andLocationDistrictIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("locationDistrictID >=", value, "locationDistrictID");
            return (Criteria) this;
        }

        public Criteria andLocationDistrictIDLessThan(Integer value) {
            addCriterion("locationDistrictID <", value, "locationDistrictID");
            return (Criteria) this;
        }

        public Criteria andLocationDistrictIDLessThanOrEqualTo(Integer value) {
            addCriterion("locationDistrictID <=", value, "locationDistrictID");
            return (Criteria) this;
        }

        public Criteria andLocationDistrictIDIn(List<Integer> values) {
            addCriterion("locationDistrictID in", values, "locationDistrictID");
            return (Criteria) this;
        }

        public Criteria andLocationDistrictIDNotIn(List<Integer> values) {
            addCriterion("locationDistrictID not in", values, "locationDistrictID");
            return (Criteria) this;
        }

        public Criteria andLocationDistrictIDBetween(Integer value1, Integer value2) {
            addCriterion("locationDistrictID between", value1, value2, "locationDistrictID");
            return (Criteria) this;
        }

        public Criteria andLocationDistrictIDNotBetween(Integer value1, Integer value2) {
            addCriterion("locationDistrictID not between", value1, value2, "locationDistrictID");
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

        public Criteria andDistrictNameIsNull() {
            addCriterion("districtName is null");
            return (Criteria) this;
        }

        public Criteria andDistrictNameIsNotNull() {
            addCriterion("districtName is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictNameEqualTo(String value) {
            addCriterion("districtName =", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameNotEqualTo(String value) {
            addCriterion("districtName <>", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameGreaterThan(String value) {
            addCriterion("districtName >", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameGreaterThanOrEqualTo(String value) {
            addCriterion("districtName >=", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameLessThan(String value) {
            addCriterion("districtName <", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameLessThanOrEqualTo(String value) {
            addCriterion("districtName <=", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameLike(String value) {
            addCriterion("districtName like", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameNotLike(String value) {
            addCriterion("districtName not like", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameIn(List<String> values) {
            addCriterion("districtName in", values, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameNotIn(List<String> values) {
            addCriterion("districtName not in", values, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameBetween(String value1, String value2) {
            addCriterion("districtName between", value1, value2, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameNotBetween(String value1, String value2) {
            addCriterion("districtName not between", value1, value2, "districtName");
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

        public Criteria andCreatorIDIsNull() {
            addCriterion("creatorID is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIDIsNotNull() {
            addCriterion("creatorID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIDEqualTo(Long value) {
            addCriterion("creatorID =", value, "creatorID");
            return (Criteria) this;
        }

        public Criteria andCreatorIDNotEqualTo(Long value) {
            addCriterion("creatorID <>", value, "creatorID");
            return (Criteria) this;
        }

        public Criteria andCreatorIDGreaterThan(Long value) {
            addCriterion("creatorID >", value, "creatorID");
            return (Criteria) this;
        }

        public Criteria andCreatorIDGreaterThanOrEqualTo(Long value) {
            addCriterion("creatorID >=", value, "creatorID");
            return (Criteria) this;
        }

        public Criteria andCreatorIDLessThan(Long value) {
            addCriterion("creatorID <", value, "creatorID");
            return (Criteria) this;
        }

        public Criteria andCreatorIDLessThanOrEqualTo(Long value) {
            addCriterion("creatorID <=", value, "creatorID");
            return (Criteria) this;
        }

        public Criteria andCreatorIDIn(List<Long> values) {
            addCriterion("creatorID in", values, "creatorID");
            return (Criteria) this;
        }

        public Criteria andCreatorIDNotIn(List<Long> values) {
            addCriterion("creatorID not in", values, "creatorID");
            return (Criteria) this;
        }

        public Criteria andCreatorIDBetween(Long value1, Long value2) {
            addCriterion("creatorID between", value1, value2, "creatorID");
            return (Criteria) this;
        }

        public Criteria andCreatorIDNotBetween(Long value1, Long value2) {
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

        public Criteria andLastModifiedIsNull() {
            addCriterion("lastModified is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedIsNotNull() {
            addCriterion("lastModified is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedEqualTo(Long value) {
            addCriterion("lastModified =", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedNotEqualTo(Long value) {
            addCriterion("lastModified <>", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedGreaterThan(Long value) {
            addCriterion("lastModified >", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedGreaterThanOrEqualTo(Long value) {
            addCriterion("lastModified >=", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedLessThan(Long value) {
            addCriterion("lastModified <", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedLessThanOrEqualTo(Long value) {
            addCriterion("lastModified <=", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedIn(List<Long> values) {
            addCriterion("lastModified in", values, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedNotIn(List<Long> values) {
            addCriterion("lastModified not in", values, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedBetween(Long value1, Long value2) {
            addCriterion("lastModified between", value1, value2, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedNotBetween(Long value1, Long value2) {
            addCriterion("lastModified not between", value1, value2, "lastModified");
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

        public Criteria andLastModifierIDEqualTo(Long value) {
            addCriterion("lastModifierID =", value, "lastModifierID");
            return (Criteria) this;
        }

        public Criteria andLastModifierIDNotEqualTo(Long value) {
            addCriterion("lastModifierID <>", value, "lastModifierID");
            return (Criteria) this;
        }

        public Criteria andLastModifierIDGreaterThan(Long value) {
            addCriterion("lastModifierID >", value, "lastModifierID");
            return (Criteria) this;
        }

        public Criteria andLastModifierIDGreaterThanOrEqualTo(Long value) {
            addCriterion("lastModifierID >=", value, "lastModifierID");
            return (Criteria) this;
        }

        public Criteria andLastModifierIDLessThan(Long value) {
            addCriterion("lastModifierID <", value, "lastModifierID");
            return (Criteria) this;
        }

        public Criteria andLastModifierIDLessThanOrEqualTo(Long value) {
            addCriterion("lastModifierID <=", value, "lastModifierID");
            return (Criteria) this;
        }

        public Criteria andLastModifierIDIn(List<Long> values) {
            addCriterion("lastModifierID in", values, "lastModifierID");
            return (Criteria) this;
        }

        public Criteria andLastModifierIDNotIn(List<Long> values) {
            addCriterion("lastModifierID not in", values, "lastModifierID");
            return (Criteria) this;
        }

        public Criteria andLastModifierIDBetween(Long value1, Long value2) {
            addCriterion("lastModifierID between", value1, value2, "lastModifierID");
            return (Criteria) this;
        }

        public Criteria andLastModifierIDNotBetween(Long value1, Long value2) {
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