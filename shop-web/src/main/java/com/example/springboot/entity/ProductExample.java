package com.example.springboot.entity;

import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andProductIDIsNull() {
            addCriterion("productID is null");
            return (Criteria) this;
        }

        public Criteria andProductIDIsNotNull() {
            addCriterion("productID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIDEqualTo(Integer value) {
            addCriterion("productID =", value, "productID");
            return (Criteria) this;
        }

        public Criteria andProductIDNotEqualTo(Integer value) {
            addCriterion("productID <>", value, "productID");
            return (Criteria) this;
        }

        public Criteria andProductIDGreaterThan(Integer value) {
            addCriterion("productID >", value, "productID");
            return (Criteria) this;
        }

        public Criteria andProductIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("productID >=", value, "productID");
            return (Criteria) this;
        }

        public Criteria andProductIDLessThan(Integer value) {
            addCriterion("productID <", value, "productID");
            return (Criteria) this;
        }

        public Criteria andProductIDLessThanOrEqualTo(Integer value) {
            addCriterion("productID <=", value, "productID");
            return (Criteria) this;
        }

        public Criteria andProductIDIn(List<Integer> values) {
            addCriterion("productID in", values, "productID");
            return (Criteria) this;
        }

        public Criteria andProductIDNotIn(List<Integer> values) {
            addCriterion("productID not in", values, "productID");
            return (Criteria) this;
        }

        public Criteria andProductIDBetween(Integer value1, Integer value2) {
            addCriterion("productID between", value1, value2, "productID");
            return (Criteria) this;
        }

        public Criteria andProductIDNotBetween(Integer value1, Integer value2) {
            addCriterion("productID not between", value1, value2, "productID");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNull() {
            addCriterion("productCode is null");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNotNull() {
            addCriterion("productCode is not null");
            return (Criteria) this;
        }

        public Criteria andProductCodeEqualTo(String value) {
            addCriterion("productCode =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotEqualTo(String value) {
            addCriterion("productCode <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThan(String value) {
            addCriterion("productCode >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("productCode >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThan(String value) {
            addCriterion("productCode <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThanOrEqualTo(String value) {
            addCriterion("productCode <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLike(String value) {
            addCriterion("productCode like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotLike(String value) {
            addCriterion("productCode not like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIn(List<String> values) {
            addCriterion("productCode in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotIn(List<String> values) {
            addCriterion("productCode not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeBetween(String value1, String value2) {
            addCriterion("productCode between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotBetween(String value1, String value2) {
            addCriterion("productCode not between", value1, value2, "productCode");
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

        public Criteria andProductColoursIsNull() {
            addCriterion("productColours is null");
            return (Criteria) this;
        }

        public Criteria andProductColoursIsNotNull() {
            addCriterion("productColours is not null");
            return (Criteria) this;
        }

        public Criteria andProductColoursEqualTo(String value) {
            addCriterion("productColours =", value, "productColours");
            return (Criteria) this;
        }

        public Criteria andProductColoursNotEqualTo(String value) {
            addCriterion("productColours <>", value, "productColours");
            return (Criteria) this;
        }

        public Criteria andProductColoursGreaterThan(String value) {
            addCriterion("productColours >", value, "productColours");
            return (Criteria) this;
        }

        public Criteria andProductColoursGreaterThanOrEqualTo(String value) {
            addCriterion("productColours >=", value, "productColours");
            return (Criteria) this;
        }

        public Criteria andProductColoursLessThan(String value) {
            addCriterion("productColours <", value, "productColours");
            return (Criteria) this;
        }

        public Criteria andProductColoursLessThanOrEqualTo(String value) {
            addCriterion("productColours <=", value, "productColours");
            return (Criteria) this;
        }

        public Criteria andProductColoursLike(String value) {
            addCriterion("productColours like", value, "productColours");
            return (Criteria) this;
        }

        public Criteria andProductColoursNotLike(String value) {
            addCriterion("productColours not like", value, "productColours");
            return (Criteria) this;
        }

        public Criteria andProductColoursIn(List<String> values) {
            addCriterion("productColours in", values, "productColours");
            return (Criteria) this;
        }

        public Criteria andProductColoursNotIn(List<String> values) {
            addCriterion("productColours not in", values, "productColours");
            return (Criteria) this;
        }

        public Criteria andProductColoursBetween(String value1, String value2) {
            addCriterion("productColours between", value1, value2, "productColours");
            return (Criteria) this;
        }

        public Criteria andProductColoursNotBetween(String value1, String value2) {
            addCriterion("productColours not between", value1, value2, "productColours");
            return (Criteria) this;
        }

        public Criteria andProductStandardsIsNull() {
            addCriterion("productStandards is null");
            return (Criteria) this;
        }

        public Criteria andProductStandardsIsNotNull() {
            addCriterion("productStandards is not null");
            return (Criteria) this;
        }

        public Criteria andProductStandardsEqualTo(String value) {
            addCriterion("productStandards =", value, "productStandards");
            return (Criteria) this;
        }

        public Criteria andProductStandardsNotEqualTo(String value) {
            addCriterion("productStandards <>", value, "productStandards");
            return (Criteria) this;
        }

        public Criteria andProductStandardsGreaterThan(String value) {
            addCriterion("productStandards >", value, "productStandards");
            return (Criteria) this;
        }

        public Criteria andProductStandardsGreaterThanOrEqualTo(String value) {
            addCriterion("productStandards >=", value, "productStandards");
            return (Criteria) this;
        }

        public Criteria andProductStandardsLessThan(String value) {
            addCriterion("productStandards <", value, "productStandards");
            return (Criteria) this;
        }

        public Criteria andProductStandardsLessThanOrEqualTo(String value) {
            addCriterion("productStandards <=", value, "productStandards");
            return (Criteria) this;
        }

        public Criteria andProductStandardsLike(String value) {
            addCriterion("productStandards like", value, "productStandards");
            return (Criteria) this;
        }

        public Criteria andProductStandardsNotLike(String value) {
            addCriterion("productStandards not like", value, "productStandards");
            return (Criteria) this;
        }

        public Criteria andProductStandardsIn(List<String> values) {
            addCriterion("productStandards in", values, "productStandards");
            return (Criteria) this;
        }

        public Criteria andProductStandardsNotIn(List<String> values) {
            addCriterion("productStandards not in", values, "productStandards");
            return (Criteria) this;
        }

        public Criteria andProductStandardsBetween(String value1, String value2) {
            addCriterion("productStandards between", value1, value2, "productStandards");
            return (Criteria) this;
        }

        public Criteria andProductStandardsNotBetween(String value1, String value2) {
            addCriterion("productStandards not between", value1, value2, "productStandards");
            return (Criteria) this;
        }

        public Criteria andProductStockNumIsNull() {
            addCriterion("productStockNum is null");
            return (Criteria) this;
        }

        public Criteria andProductStockNumIsNotNull() {
            addCriterion("productStockNum is not null");
            return (Criteria) this;
        }

        public Criteria andProductStockNumEqualTo(Integer value) {
            addCriterion("productStockNum =", value, "productStockNum");
            return (Criteria) this;
        }

        public Criteria andProductStockNumNotEqualTo(Integer value) {
            addCriterion("productStockNum <>", value, "productStockNum");
            return (Criteria) this;
        }

        public Criteria andProductStockNumGreaterThan(Integer value) {
            addCriterion("productStockNum >", value, "productStockNum");
            return (Criteria) this;
        }

        public Criteria andProductStockNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("productStockNum >=", value, "productStockNum");
            return (Criteria) this;
        }

        public Criteria andProductStockNumLessThan(Integer value) {
            addCriterion("productStockNum <", value, "productStockNum");
            return (Criteria) this;
        }

        public Criteria andProductStockNumLessThanOrEqualTo(Integer value) {
            addCriterion("productStockNum <=", value, "productStockNum");
            return (Criteria) this;
        }

        public Criteria andProductStockNumIn(List<Integer> values) {
            addCriterion("productStockNum in", values, "productStockNum");
            return (Criteria) this;
        }

        public Criteria andProductStockNumNotIn(List<Integer> values) {
            addCriterion("productStockNum not in", values, "productStockNum");
            return (Criteria) this;
        }

        public Criteria andProductStockNumBetween(Integer value1, Integer value2) {
            addCriterion("productStockNum between", value1, value2, "productStockNum");
            return (Criteria) this;
        }

        public Criteria andProductStockNumNotBetween(Integer value1, Integer value2) {
            addCriterion("productStockNum not between", value1, value2, "productStockNum");
            return (Criteria) this;
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

        public Criteria andLevelThreeCategoryIDIsNull() {
            addCriterion("levelThreeCategoryID is null");
            return (Criteria) this;
        }

        public Criteria andLevelThreeCategoryIDIsNotNull() {
            addCriterion("levelThreeCategoryID is not null");
            return (Criteria) this;
        }

        public Criteria andLevelThreeCategoryIDEqualTo(Integer value) {
            addCriterion("levelThreeCategoryID =", value, "levelThreeCategoryID");
            return (Criteria) this;
        }

        public Criteria andLevelThreeCategoryIDNotEqualTo(Integer value) {
            addCriterion("levelThreeCategoryID <>", value, "levelThreeCategoryID");
            return (Criteria) this;
        }

        public Criteria andLevelThreeCategoryIDGreaterThan(Integer value) {
            addCriterion("levelThreeCategoryID >", value, "levelThreeCategoryID");
            return (Criteria) this;
        }

        public Criteria andLevelThreeCategoryIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("levelThreeCategoryID >=", value, "levelThreeCategoryID");
            return (Criteria) this;
        }

        public Criteria andLevelThreeCategoryIDLessThan(Integer value) {
            addCriterion("levelThreeCategoryID <", value, "levelThreeCategoryID");
            return (Criteria) this;
        }

        public Criteria andLevelThreeCategoryIDLessThanOrEqualTo(Integer value) {
            addCriterion("levelThreeCategoryID <=", value, "levelThreeCategoryID");
            return (Criteria) this;
        }

        public Criteria andLevelThreeCategoryIDIn(List<Integer> values) {
            addCriterion("levelThreeCategoryID in", values, "levelThreeCategoryID");
            return (Criteria) this;
        }

        public Criteria andLevelThreeCategoryIDNotIn(List<Integer> values) {
            addCriterion("levelThreeCategoryID not in", values, "levelThreeCategoryID");
            return (Criteria) this;
        }

        public Criteria andLevelThreeCategoryIDBetween(Integer value1, Integer value2) {
            addCriterion("levelThreeCategoryID between", value1, value2, "levelThreeCategoryID");
            return (Criteria) this;
        }

        public Criteria andLevelThreeCategoryIDNotBetween(Integer value1, Integer value2) {
            addCriterion("levelThreeCategoryID not between", value1, value2, "levelThreeCategoryID");
            return (Criteria) this;
        }

        public Criteria andLevelTwoCategoryIDIsNull() {
            addCriterion("levelTwoCategoryID is null");
            return (Criteria) this;
        }

        public Criteria andLevelTwoCategoryIDIsNotNull() {
            addCriterion("levelTwoCategoryID is not null");
            return (Criteria) this;
        }

        public Criteria andLevelTwoCategoryIDEqualTo(Integer value) {
            addCriterion("levelTwoCategoryID =", value, "levelTwoCategoryID");
            return (Criteria) this;
        }

        public Criteria andLevelTwoCategoryIDNotEqualTo(Integer value) {
            addCriterion("levelTwoCategoryID <>", value, "levelTwoCategoryID");
            return (Criteria) this;
        }

        public Criteria andLevelTwoCategoryIDGreaterThan(Integer value) {
            addCriterion("levelTwoCategoryID >", value, "levelTwoCategoryID");
            return (Criteria) this;
        }

        public Criteria andLevelTwoCategoryIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("levelTwoCategoryID >=", value, "levelTwoCategoryID");
            return (Criteria) this;
        }

        public Criteria andLevelTwoCategoryIDLessThan(Integer value) {
            addCriterion("levelTwoCategoryID <", value, "levelTwoCategoryID");
            return (Criteria) this;
        }

        public Criteria andLevelTwoCategoryIDLessThanOrEqualTo(Integer value) {
            addCriterion("levelTwoCategoryID <=", value, "levelTwoCategoryID");
            return (Criteria) this;
        }

        public Criteria andLevelTwoCategoryIDIn(List<Integer> values) {
            addCriterion("levelTwoCategoryID in", values, "levelTwoCategoryID");
            return (Criteria) this;
        }

        public Criteria andLevelTwoCategoryIDNotIn(List<Integer> values) {
            addCriterion("levelTwoCategoryID not in", values, "levelTwoCategoryID");
            return (Criteria) this;
        }

        public Criteria andLevelTwoCategoryIDBetween(Integer value1, Integer value2) {
            addCriterion("levelTwoCategoryID between", value1, value2, "levelTwoCategoryID");
            return (Criteria) this;
        }

        public Criteria andLevelTwoCategoryIDNotBetween(Integer value1, Integer value2) {
            addCriterion("levelTwoCategoryID not between", value1, value2, "levelTwoCategoryID");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryIDIsNull() {
            addCriterion("levelOneCategoryID is null");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryIDIsNotNull() {
            addCriterion("levelOneCategoryID is not null");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryIDEqualTo(Integer value) {
            addCriterion("levelOneCategoryID =", value, "levelOneCategoryID");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryIDNotEqualTo(Integer value) {
            addCriterion("levelOneCategoryID <>", value, "levelOneCategoryID");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryIDGreaterThan(Integer value) {
            addCriterion("levelOneCategoryID >", value, "levelOneCategoryID");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("levelOneCategoryID >=", value, "levelOneCategoryID");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryIDLessThan(Integer value) {
            addCriterion("levelOneCategoryID <", value, "levelOneCategoryID");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryIDLessThanOrEqualTo(Integer value) {
            addCriterion("levelOneCategoryID <=", value, "levelOneCategoryID");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryIDIn(List<Integer> values) {
            addCriterion("levelOneCategoryID in", values, "levelOneCategoryID");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryIDNotIn(List<Integer> values) {
            addCriterion("levelOneCategoryID not in", values, "levelOneCategoryID");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryIDBetween(Integer value1, Integer value2) {
            addCriterion("levelOneCategoryID between", value1, value2, "levelOneCategoryID");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryIDNotBetween(Integer value1, Integer value2) {
            addCriterion("levelOneCategoryID not between", value1, value2, "levelOneCategoryID");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("productName is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("productName is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("productName =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("productName <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("productName >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("productName >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("productName <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("productName <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("productName like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("productName not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("productName in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("productName not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("productName between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("productName not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIsNull() {
            addCriterion("productDescription is null");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIsNotNull() {
            addCriterion("productDescription is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionEqualTo(String value) {
            addCriterion("productDescription =", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotEqualTo(String value) {
            addCriterion("productDescription <>", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionGreaterThan(String value) {
            addCriterion("productDescription >", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("productDescription >=", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLessThan(String value) {
            addCriterion("productDescription <", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLessThanOrEqualTo(String value) {
            addCriterion("productDescription <=", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLike(String value) {
            addCriterion("productDescription like", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotLike(String value) {
            addCriterion("productDescription not like", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIn(List<String> values) {
            addCriterion("productDescription in", values, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotIn(List<String> values) {
            addCriterion("productDescription not in", values, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionBetween(String value1, String value2) {
            addCriterion("productDescription between", value1, value2, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotBetween(String value1, String value2) {
            addCriterion("productDescription not between", value1, value2, "productDescription");
            return (Criteria) this;
        }

        public Criteria andTitleImgIsNull() {
            addCriterion("titleImg is null");
            return (Criteria) this;
        }

        public Criteria andTitleImgIsNotNull() {
            addCriterion("titleImg is not null");
            return (Criteria) this;
        }

        public Criteria andTitleImgEqualTo(String value) {
            addCriterion("titleImg =", value, "titleImg");
            return (Criteria) this;
        }

        public Criteria andTitleImgNotEqualTo(String value) {
            addCriterion("titleImg <>", value, "titleImg");
            return (Criteria) this;
        }

        public Criteria andTitleImgGreaterThan(String value) {
            addCriterion("titleImg >", value, "titleImg");
            return (Criteria) this;
        }

        public Criteria andTitleImgGreaterThanOrEqualTo(String value) {
            addCriterion("titleImg >=", value, "titleImg");
            return (Criteria) this;
        }

        public Criteria andTitleImgLessThan(String value) {
            addCriterion("titleImg <", value, "titleImg");
            return (Criteria) this;
        }

        public Criteria andTitleImgLessThanOrEqualTo(String value) {
            addCriterion("titleImg <=", value, "titleImg");
            return (Criteria) this;
        }

        public Criteria andTitleImgLike(String value) {
            addCriterion("titleImg like", value, "titleImg");
            return (Criteria) this;
        }

        public Criteria andTitleImgNotLike(String value) {
            addCriterion("titleImg not like", value, "titleImg");
            return (Criteria) this;
        }

        public Criteria andTitleImgIn(List<String> values) {
            addCriterion("titleImg in", values, "titleImg");
            return (Criteria) this;
        }

        public Criteria andTitleImgNotIn(List<String> values) {
            addCriterion("titleImg not in", values, "titleImg");
            return (Criteria) this;
        }

        public Criteria andTitleImgBetween(String value1, String value2) {
            addCriterion("titleImg between", value1, value2, "titleImg");
            return (Criteria) this;
        }

        public Criteria andTitleImgNotBetween(String value1, String value2) {
            addCriterion("titleImg not between", value1, value2, "titleImg");
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

        public Criteria andRecommendPriorityIsNull() {
            addCriterion("recommendPriority is null");
            return (Criteria) this;
        }

        public Criteria andRecommendPriorityIsNotNull() {
            addCriterion("recommendPriority is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendPriorityEqualTo(Integer value) {
            addCriterion("recommendPriority =", value, "recommendPriority");
            return (Criteria) this;
        }

        public Criteria andRecommendPriorityNotEqualTo(Integer value) {
            addCriterion("recommendPriority <>", value, "recommendPriority");
            return (Criteria) this;
        }

        public Criteria andRecommendPriorityGreaterThan(Integer value) {
            addCriterion("recommendPriority >", value, "recommendPriority");
            return (Criteria) this;
        }

        public Criteria andRecommendPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommendPriority >=", value, "recommendPriority");
            return (Criteria) this;
        }

        public Criteria andRecommendPriorityLessThan(Integer value) {
            addCriterion("recommendPriority <", value, "recommendPriority");
            return (Criteria) this;
        }

        public Criteria andRecommendPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("recommendPriority <=", value, "recommendPriority");
            return (Criteria) this;
        }

        public Criteria andRecommendPriorityIn(List<Integer> values) {
            addCriterion("recommendPriority in", values, "recommendPriority");
            return (Criteria) this;
        }

        public Criteria andRecommendPriorityNotIn(List<Integer> values) {
            addCriterion("recommendPriority not in", values, "recommendPriority");
            return (Criteria) this;
        }

        public Criteria andRecommendPriorityBetween(Integer value1, Integer value2) {
            addCriterion("recommendPriority between", value1, value2, "recommendPriority");
            return (Criteria) this;
        }

        public Criteria andRecommendPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("recommendPriority not between", value1, value2, "recommendPriority");
            return (Criteria) this;
        }

        public Criteria andCollectNumIsNull() {
            addCriterion("collectNum is null");
            return (Criteria) this;
        }

        public Criteria andCollectNumIsNotNull() {
            addCriterion("collectNum is not null");
            return (Criteria) this;
        }

        public Criteria andCollectNumEqualTo(Integer value) {
            addCriterion("collectNum =", value, "collectNum");
            return (Criteria) this;
        }

        public Criteria andCollectNumNotEqualTo(Integer value) {
            addCriterion("collectNum <>", value, "collectNum");
            return (Criteria) this;
        }

        public Criteria andCollectNumGreaterThan(Integer value) {
            addCriterion("collectNum >", value, "collectNum");
            return (Criteria) this;
        }

        public Criteria andCollectNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("collectNum >=", value, "collectNum");
            return (Criteria) this;
        }

        public Criteria andCollectNumLessThan(Integer value) {
            addCriterion("collectNum <", value, "collectNum");
            return (Criteria) this;
        }

        public Criteria andCollectNumLessThanOrEqualTo(Integer value) {
            addCriterion("collectNum <=", value, "collectNum");
            return (Criteria) this;
        }

        public Criteria andCollectNumIn(List<Integer> values) {
            addCriterion("collectNum in", values, "collectNum");
            return (Criteria) this;
        }

        public Criteria andCollectNumNotIn(List<Integer> values) {
            addCriterion("collectNum not in", values, "collectNum");
            return (Criteria) this;
        }

        public Criteria andCollectNumBetween(Integer value1, Integer value2) {
            addCriterion("collectNum between", value1, value2, "collectNum");
            return (Criteria) this;
        }

        public Criteria andCollectNumNotBetween(Integer value1, Integer value2) {
            addCriterion("collectNum not between", value1, value2, "collectNum");
            return (Criteria) this;
        }

        public Criteria andBoughtNumIsNull() {
            addCriterion("boughtNum is null");
            return (Criteria) this;
        }

        public Criteria andBoughtNumIsNotNull() {
            addCriterion("boughtNum is not null");
            return (Criteria) this;
        }

        public Criteria andBoughtNumEqualTo(Integer value) {
            addCriterion("boughtNum =", value, "boughtNum");
            return (Criteria) this;
        }

        public Criteria andBoughtNumNotEqualTo(Integer value) {
            addCriterion("boughtNum <>", value, "boughtNum");
            return (Criteria) this;
        }

        public Criteria andBoughtNumGreaterThan(Integer value) {
            addCriterion("boughtNum >", value, "boughtNum");
            return (Criteria) this;
        }

        public Criteria andBoughtNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("boughtNum >=", value, "boughtNum");
            return (Criteria) this;
        }

        public Criteria andBoughtNumLessThan(Integer value) {
            addCriterion("boughtNum <", value, "boughtNum");
            return (Criteria) this;
        }

        public Criteria andBoughtNumLessThanOrEqualTo(Integer value) {
            addCriterion("boughtNum <=", value, "boughtNum");
            return (Criteria) this;
        }

        public Criteria andBoughtNumIn(List<Integer> values) {
            addCriterion("boughtNum in", values, "boughtNum");
            return (Criteria) this;
        }

        public Criteria andBoughtNumNotIn(List<Integer> values) {
            addCriterion("boughtNum not in", values, "boughtNum");
            return (Criteria) this;
        }

        public Criteria andBoughtNumBetween(Integer value1, Integer value2) {
            addCriterion("boughtNum between", value1, value2, "boughtNum");
            return (Criteria) this;
        }

        public Criteria andBoughtNumNotBetween(Integer value1, Integer value2) {
            addCriterion("boughtNum not between", value1, value2, "boughtNum");
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

        public Criteria andBrowseNumIsNull() {
            addCriterion("browseNum is null");
            return (Criteria) this;
        }

        public Criteria andBrowseNumIsNotNull() {
            addCriterion("browseNum is not null");
            return (Criteria) this;
        }

        public Criteria andBrowseNumEqualTo(Integer value) {
            addCriterion("browseNum =", value, "browseNum");
            return (Criteria) this;
        }

        public Criteria andBrowseNumNotEqualTo(Integer value) {
            addCriterion("browseNum <>", value, "browseNum");
            return (Criteria) this;
        }

        public Criteria andBrowseNumGreaterThan(Integer value) {
            addCriterion("browseNum >", value, "browseNum");
            return (Criteria) this;
        }

        public Criteria andBrowseNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("browseNum >=", value, "browseNum");
            return (Criteria) this;
        }

        public Criteria andBrowseNumLessThan(Integer value) {
            addCriterion("browseNum <", value, "browseNum");
            return (Criteria) this;
        }

        public Criteria andBrowseNumLessThanOrEqualTo(Integer value) {
            addCriterion("browseNum <=", value, "browseNum");
            return (Criteria) this;
        }

        public Criteria andBrowseNumIn(List<Integer> values) {
            addCriterion("browseNum in", values, "browseNum");
            return (Criteria) this;
        }

        public Criteria andBrowseNumNotIn(List<Integer> values) {
            addCriterion("browseNum not in", values, "browseNum");
            return (Criteria) this;
        }

        public Criteria andBrowseNumBetween(Integer value1, Integer value2) {
            addCriterion("browseNum between", value1, value2, "browseNum");
            return (Criteria) this;
        }

        public Criteria andBrowseNumNotBetween(Integer value1, Integer value2) {
            addCriterion("browseNum not between", value1, value2, "browseNum");
            return (Criteria) this;
        }
        public Criteria andDeliveryCycleIsNull() {
            addCriterion("deliveryCycle is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryCycleIsNotNull() {
            addCriterion("deliveryCycle is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryCycleEqualTo(String value) {
            addCriterion("deliveryCycle =", value, "deliveryCycle");
            return (Criteria) this;
        }

        public Criteria andDeliveryCycleNotEqualTo(String value) {
            addCriterion("deliveryCycle <>", value, "deliveryCycle");
            return (Criteria) this;
        }

        public Criteria andDeliveryCycleGreaterThan(String value) {
            addCriterion("deliveryCycle >", value, "deliveryCycle");
            return (Criteria) this;
        }

        public Criteria andDeliveryCycleGreaterThanOrEqualTo(String value) {
            addCriterion("deliveryCycle >=", value, "deliveryCycle");
            return (Criteria) this;
        }

        public Criteria andDeliveryCycleLessThan(String value) {
            addCriterion("deliveryCycle <", value, "deliveryCycle");
            return (Criteria) this;
        }

        public Criteria andDeliveryCycleLessThanOrEqualTo(String value) {
            addCriterion("deliveryCycle <=", value, "deliveryCycle");
            return (Criteria) this;
        }

        public Criteria andDeliveryCycleLike(String value) {
            addCriterion("deliveryCycle like", value, "deliveryCycle");
            return (Criteria) this;
        }

        public Criteria andDeliveryCycleNotLike(String value) {
            addCriterion("deliveryCycle not like", value, "deliveryCycle");
            return (Criteria) this;
        }

        public Criteria andDeliveryCycleIn(List<String> values) {
            addCriterion("deliveryCycle in", values, "deliveryCycle");
            return (Criteria) this;
        }

        public Criteria andDeliveryCycleNotIn(List<String> values) {
            addCriterion("deliveryCycle not in", values, "deliveryCycle");
            return (Criteria) this;
        }

        public Criteria andDeliveryCycleBetween(String value1, String value2) {
            addCriterion("deliveryCycle between", value1, value2, "deliveryCycle");
            return (Criteria) this;
        }

        public Criteria andDeliveryCycleNotBetween(String value1, String value2) {
            addCriterion("deliveryCycle not between", value1, value2, "deliveryCycle");
            return (Criteria) this;
        }
        public Criteria andIsSpecialGoodsIsNull() {
            addCriterion("isSpecialGoods is null");
            return (Criteria) this;
        }

        public Criteria andIsSpecialGoodsIsNotNull() {
            addCriterion("isSpecialGoods is not null");
            return (Criteria) this;
        }

        public Criteria andIsSpecialGoodsEqualTo(Short value) {
            addCriterion("isSpecialGoods =", value, "isSpecialGoods");
            return (Criteria) this;
        }

        public Criteria andIsSpecialGoodsNotEqualTo(Short value) {
            addCriterion("isSpecialGoods <>", value, "isSpecialGoods");
            return (Criteria) this;
        }

        public Criteria andIsSpecialGoodsGreaterThan(Short value) {
            addCriterion("isSpecialGoods >", value, "isSpecialGoods");
            return (Criteria) this;
        }

        public Criteria andIsSpecialGoodsGreaterThanOrEqualTo(Short value) {
            addCriterion("isSpecialGoods >=", value, "isSpecialGoods");
            return (Criteria) this;
        }

        public Criteria andIsSpecialGoodsLessThan(Short value) {
            addCriterion("isSpecialGoods <", value, "isSpecialGoods");
            return (Criteria) this;
        }

        public Criteria andIsSpecialGoodsLessThanOrEqualTo(Short value) {
            addCriterion("isSpecialGoods <=", value, "isSpecialGoods");
            return (Criteria) this;
        }

        public Criteria andIsSpecialGoodsIn(List<Short> values) {
            addCriterion("isSpecialGoods in", values, "isSpecialGoods");
            return (Criteria) this;
        }

        public Criteria andIsSpecialGoodsNotIn(List<Short> values) {
            addCriterion("isSpecialGoods not in", values, "isSpecialGoods");
            return (Criteria) this;
        }

        public Criteria andIsSpecialGoodsBetween(Short value1, Short value2) {
            addCriterion("isSpecialGoods between", value1, value2, "isSpecialGoods");
            return (Criteria) this;
        }

        public Criteria andIsSpecialGoodsNotBetween(Short value1, Short value2) {
            addCriterion("isSpecialGoods not between", value1, value2, "isSpecialGoods");
            return (Criteria) this;
        }

        public Criteria andVipProductTypeIsNull() {
            addCriterion("vipProductType is null");
            return (Criteria) this;
        }

        public Criteria andVipProductTypeIsNotNull() {
            addCriterion("vipProductType is not null");
            return (Criteria) this;
        }

        public Criteria andVipProductTypeEqualTo(Short value) {
            addCriterion("vipProductType =", value, "vipProductType");
            return (Criteria) this;
        }

        public Criteria andVipProductTypeNotEqualTo(Short value) {
            addCriterion("vipProductType <>", value, "vipProductType");
            return (Criteria) this;
        }

        public Criteria andVipProductTypeGreaterThan(Short value) {
            addCriterion("vipProductType >", value, "vipProductType");
            return (Criteria) this;
        }

        public Criteria andVipProductTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("vipProductType >=", value, "vipProductType");
            return (Criteria) this;
        }

        public Criteria andVipProductTypeLessThan(Short value) {
            addCriterion("vipProductType <", value, "vipProductType");
            return (Criteria) this;
        }

        public Criteria andVipProductTypeLessThanOrEqualTo(Short value) {
            addCriterion("vipProductType <=", value, "vipProductType");
            return (Criteria) this;
        }

        public Criteria andVipProductTypeIn(List<Short> values) {
            addCriterion("vipProductType in", values, "vipProductType");
            return (Criteria) this;
        }

        public Criteria andVipProductTypeNotIn(List<Short> values) {
            addCriterion("vipProductType not in", values, "vipProductType");
            return (Criteria) this;
        }

        public Criteria andVipProductTypeBetween(Short value1, Short value2) {
            addCriterion("vipProductType between", value1, value2, "vipProductType");
            return (Criteria) this;
        }

        public Criteria andVipProductTypeNotBetween(Short value1, Short value2) {
            addCriterion("vipProductType not between", value1, value2, "vipProductType");
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