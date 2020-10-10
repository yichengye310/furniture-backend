package com.example.springboot.entity;

import java.util.ArrayList;
import java.util.List;

public class ProductCommentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductCommentsExample() {
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

        public Criteria andEvaluateIDIsNull() {
            addCriterion("evaluateID is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateIDIsNotNull() {
            addCriterion("evaluateID is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateIDEqualTo(Integer value) {
            addCriterion("evaluateID =", value, "evaluateID");
            return (Criteria) this;
        }

        public Criteria andEvaluateIDNotEqualTo(Integer value) {
            addCriterion("evaluateID <>", value, "evaluateID");
            return (Criteria) this;
        }

        public Criteria andEvaluateIDGreaterThan(Integer value) {
            addCriterion("evaluateID >", value, "evaluateID");
            return (Criteria) this;
        }

        public Criteria andEvaluateIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("evaluateID >=", value, "evaluateID");
            return (Criteria) this;
        }

        public Criteria andEvaluateIDLessThan(Integer value) {
            addCriterion("evaluateID <", value, "evaluateID");
            return (Criteria) this;
        }

        public Criteria andEvaluateIDLessThanOrEqualTo(Integer value) {
            addCriterion("evaluateID <=", value, "evaluateID");
            return (Criteria) this;
        }

        public Criteria andEvaluateIDIn(List<Integer> values) {
            addCriterion("evaluateID in", values, "evaluateID");
            return (Criteria) this;
        }

        public Criteria andEvaluateIDNotIn(List<Integer> values) {
            addCriterion("evaluateID not in", values, "evaluateID");
            return (Criteria) this;
        }

        public Criteria andEvaluateIDBetween(Integer value1, Integer value2) {
            addCriterion("evaluateID between", value1, value2, "evaluateID");
            return (Criteria) this;
        }

        public Criteria andEvaluateIDNotBetween(Integer value1, Integer value2) {
            addCriterion("evaluateID not between", value1, value2, "evaluateID");
            return (Criteria) this;
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

        public Criteria andPhoneNumberIsNull() {
            addCriterion("phoneNumber is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("phoneNumber is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberEqualTo(String value) {
            addCriterion("phoneNumber =", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotEqualTo(String value) {
            addCriterion("phoneNumber <>", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThan(String value) {
            addCriterion("phoneNumber >", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("phoneNumber >=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThan(String value) {
            addCriterion("phoneNumber <", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("phoneNumber <=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLike(String value) {
            addCriterion("phoneNumber like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotLike(String value) {
            addCriterion("phoneNumber not like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIn(List<String> values) {
            addCriterion("phoneNumber in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotIn(List<String> values) {
            addCriterion("phoneNumber not in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBetween(String value1, String value2) {
            addCriterion("phoneNumber between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("phoneNumber not between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andDescriptionMatchScoreIsNull() {
            addCriterion("descriptionMatchScore is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionMatchScoreIsNotNull() {
            addCriterion("descriptionMatchScore is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionMatchScoreEqualTo(String value) {
            addCriterion("descriptionMatchScore =", value, "descriptionMatchScore");
            return (Criteria) this;
        }

        public Criteria andDescriptionMatchScoreNotEqualTo(String value) {
            addCriterion("descriptionMatchScore <>", value, "descriptionMatchScore");
            return (Criteria) this;
        }

        public Criteria andDescriptionMatchScoreGreaterThan(String value) {
            addCriterion("descriptionMatchScore >", value, "descriptionMatchScore");
            return (Criteria) this;
        }

        public Criteria andDescriptionMatchScoreGreaterThanOrEqualTo(String value) {
            addCriterion("descriptionMatchScore >=", value, "descriptionMatchScore");
            return (Criteria) this;
        }

        public Criteria andDescriptionMatchScoreLessThan(String value) {
            addCriterion("descriptionMatchScore <", value, "descriptionMatchScore");
            return (Criteria) this;
        }

        public Criteria andDescriptionMatchScoreLessThanOrEqualTo(String value) {
            addCriterion("descriptionMatchScore <=", value, "descriptionMatchScore");
            return (Criteria) this;
        }

        public Criteria andDescriptionMatchScoreLike(String value) {
            addCriterion("descriptionMatchScore like", value, "descriptionMatchScore");
            return (Criteria) this;
        }

        public Criteria andDescriptionMatchScoreNotLike(String value) {
            addCriterion("descriptionMatchScore not like", value, "descriptionMatchScore");
            return (Criteria) this;
        }

        public Criteria andDescriptionMatchScoreIn(List<String> values) {
            addCriterion("descriptionMatchScore in", values, "descriptionMatchScore");
            return (Criteria) this;
        }

        public Criteria andDescriptionMatchScoreNotIn(List<String> values) {
            addCriterion("descriptionMatchScore not in", values, "descriptionMatchScore");
            return (Criteria) this;
        }

        public Criteria andDescriptionMatchScoreBetween(String value1, String value2) {
            addCriterion("descriptionMatchScore between", value1, value2, "descriptionMatchScore");
            return (Criteria) this;
        }

        public Criteria andDescriptionMatchScoreNotBetween(String value1, String value2) {
            addCriterion("descriptionMatchScore not between", value1, value2, "descriptionMatchScore");
            return (Criteria) this;
        }

        public Criteria andLogisticsServiceScoreIsNull() {
            addCriterion("logisticsServiceScore is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsServiceScoreIsNotNull() {
            addCriterion("logisticsServiceScore is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsServiceScoreEqualTo(String value) {
            addCriterion("logisticsServiceScore =", value, "logisticsServiceScore");
            return (Criteria) this;
        }

        public Criteria andLogisticsServiceScoreNotEqualTo(String value) {
            addCriterion("logisticsServiceScore <>", value, "logisticsServiceScore");
            return (Criteria) this;
        }

        public Criteria andLogisticsServiceScoreGreaterThan(String value) {
            addCriterion("logisticsServiceScore >", value, "logisticsServiceScore");
            return (Criteria) this;
        }

        public Criteria andLogisticsServiceScoreGreaterThanOrEqualTo(String value) {
            addCriterion("logisticsServiceScore >=", value, "logisticsServiceScore");
            return (Criteria) this;
        }

        public Criteria andLogisticsServiceScoreLessThan(String value) {
            addCriterion("logisticsServiceScore <", value, "logisticsServiceScore");
            return (Criteria) this;
        }

        public Criteria andLogisticsServiceScoreLessThanOrEqualTo(String value) {
            addCriterion("logisticsServiceScore <=", value, "logisticsServiceScore");
            return (Criteria) this;
        }

        public Criteria andLogisticsServiceScoreLike(String value) {
            addCriterion("logisticsServiceScore like", value, "logisticsServiceScore");
            return (Criteria) this;
        }

        public Criteria andLogisticsServiceScoreNotLike(String value) {
            addCriterion("logisticsServiceScore not like", value, "logisticsServiceScore");
            return (Criteria) this;
        }

        public Criteria andLogisticsServiceScoreIn(List<String> values) {
            addCriterion("logisticsServiceScore in", values, "logisticsServiceScore");
            return (Criteria) this;
        }

        public Criteria andLogisticsServiceScoreNotIn(List<String> values) {
            addCriterion("logisticsServiceScore not in", values, "logisticsServiceScore");
            return (Criteria) this;
        }

        public Criteria andLogisticsServiceScoreBetween(String value1, String value2) {
            addCriterion("logisticsServiceScore between", value1, value2, "logisticsServiceScore");
            return (Criteria) this;
        }

        public Criteria andLogisticsServiceScoreNotBetween(String value1, String value2) {
            addCriterion("logisticsServiceScore not between", value1, value2, "logisticsServiceScore");
            return (Criteria) this;
        }

        public Criteria andServiceAttitudeScoreIsNull() {
            addCriterion("serviceAttitudeScore is null");
            return (Criteria) this;
        }

        public Criteria andServiceAttitudeScoreIsNotNull() {
            addCriterion("serviceAttitudeScore is not null");
            return (Criteria) this;
        }

        public Criteria andServiceAttitudeScoreEqualTo(String value) {
            addCriterion("serviceAttitudeScore =", value, "serviceAttitudeScore");
            return (Criteria) this;
        }

        public Criteria andServiceAttitudeScoreNotEqualTo(String value) {
            addCriterion("serviceAttitudeScore <>", value, "serviceAttitudeScore");
            return (Criteria) this;
        }

        public Criteria andServiceAttitudeScoreGreaterThan(String value) {
            addCriterion("serviceAttitudeScore >", value, "serviceAttitudeScore");
            return (Criteria) this;
        }

        public Criteria andServiceAttitudeScoreGreaterThanOrEqualTo(String value) {
            addCriterion("serviceAttitudeScore >=", value, "serviceAttitudeScore");
            return (Criteria) this;
        }

        public Criteria andServiceAttitudeScoreLessThan(String value) {
            addCriterion("serviceAttitudeScore <", value, "serviceAttitudeScore");
            return (Criteria) this;
        }

        public Criteria andServiceAttitudeScoreLessThanOrEqualTo(String value) {
            addCriterion("serviceAttitudeScore <=", value, "serviceAttitudeScore");
            return (Criteria) this;
        }

        public Criteria andServiceAttitudeScoreLike(String value) {
            addCriterion("serviceAttitudeScore like", value, "serviceAttitudeScore");
            return (Criteria) this;
        }

        public Criteria andServiceAttitudeScoreNotLike(String value) {
            addCriterion("serviceAttitudeScore not like", value, "serviceAttitudeScore");
            return (Criteria) this;
        }

        public Criteria andServiceAttitudeScoreIn(List<String> values) {
            addCriterion("serviceAttitudeScore in", values, "serviceAttitudeScore");
            return (Criteria) this;
        }

        public Criteria andServiceAttitudeScoreNotIn(List<String> values) {
            addCriterion("serviceAttitudeScore not in", values, "serviceAttitudeScore");
            return (Criteria) this;
        }

        public Criteria andServiceAttitudeScoreBetween(String value1, String value2) {
            addCriterion("serviceAttitudeScore between", value1, value2, "serviceAttitudeScore");
            return (Criteria) this;
        }

        public Criteria andServiceAttitudeScoreNotBetween(String value1, String value2) {
            addCriterion("serviceAttitudeScore not between", value1, value2, "serviceAttitudeScore");
            return (Criteria) this;
        }

        public Criteria andStandardIDIsNull() {
            addCriterion("standardID is null");
            return (Criteria) this;
        }

        public Criteria andStandardIDIsNotNull() {
            addCriterion("standardID is not null");
            return (Criteria) this;
        }

        public Criteria andStandardIDEqualTo(Integer value) {
            addCriterion("standardID =", value, "standardID");
            return (Criteria) this;
        }

        public Criteria andStandardIDNotEqualTo(Integer value) {
            addCriterion("standardID <>", value, "standardID");
            return (Criteria) this;
        }

        public Criteria andStandardIDGreaterThan(Integer value) {
            addCriterion("standardID >", value, "standardID");
            return (Criteria) this;
        }

        public Criteria andStandardIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("standardID >=", value, "standardID");
            return (Criteria) this;
        }

        public Criteria andStandardIDLessThan(Integer value) {
            addCriterion("standardID <", value, "standardID");
            return (Criteria) this;
        }

        public Criteria andStandardIDLessThanOrEqualTo(Integer value) {
            addCriterion("standardID <=", value, "standardID");
            return (Criteria) this;
        }

        public Criteria andStandardIDIn(List<Integer> values) {
            addCriterion("standardID in", values, "standardID");
            return (Criteria) this;
        }

        public Criteria andStandardIDNotIn(List<Integer> values) {
            addCriterion("standardID not in", values, "standardID");
            return (Criteria) this;
        }

        public Criteria andStandardIDBetween(Integer value1, Integer value2) {
            addCriterion("standardID between", value1, value2, "standardID");
            return (Criteria) this;
        }

        public Criteria andStandardIDNotBetween(Integer value1, Integer value2) {
            addCriterion("standardID not between", value1, value2, "standardID");
            return (Criteria) this;
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

        public Criteria andStandardIsNull() {
            addCriterion("standard is null");
            return (Criteria) this;
        }

        public Criteria andStandardIsNotNull() {
            addCriterion("standard is not null");
            return (Criteria) this;
        }

        public Criteria andStandardEqualTo(String value) {
            addCriterion("standard =", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotEqualTo(String value) {
            addCriterion("standard <>", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThan(String value) {
            addCriterion("standard >", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThanOrEqualTo(String value) {
            addCriterion("standard >=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThan(String value) {
            addCriterion("standard <", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThanOrEqualTo(String value) {
            addCriterion("standard <=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLike(String value) {
            addCriterion("standard like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotLike(String value) {
            addCriterion("standard not like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardIn(List<String> values) {
            addCriterion("standard in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotIn(List<String> values) {
            addCriterion("standard not in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardBetween(String value1, String value2) {
            addCriterion("standard between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotBetween(String value1, String value2) {
            addCriterion("standard not between", value1, value2, "standard");
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

        public Criteria andLastModifiedTimeStampIsNull() {
            addCriterion("lastModifiedTimeStamp is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeStampIsNotNull() {
            addCriterion("lastModifiedTimeStamp is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeStampEqualTo(Long value) {
            addCriterion("lastModifiedTimeStamp =", value, "lastModifiedTimeStamp");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeStampNotEqualTo(Long value) {
            addCriterion("lastModifiedTimeStamp <>", value, "lastModifiedTimeStamp");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeStampGreaterThan(Long value) {
            addCriterion("lastModifiedTimeStamp >", value, "lastModifiedTimeStamp");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeStampGreaterThanOrEqualTo(Long value) {
            addCriterion("lastModifiedTimeStamp >=", value, "lastModifiedTimeStamp");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeStampLessThan(Long value) {
            addCriterion("lastModifiedTimeStamp <", value, "lastModifiedTimeStamp");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeStampLessThanOrEqualTo(Long value) {
            addCriterion("lastModifiedTimeStamp <=", value, "lastModifiedTimeStamp");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeStampIn(List<Long> values) {
            addCriterion("lastModifiedTimeStamp in", values, "lastModifiedTimeStamp");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeStampNotIn(List<Long> values) {
            addCriterion("lastModifiedTimeStamp not in", values, "lastModifiedTimeStamp");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeStampBetween(Long value1, Long value2) {
            addCriterion("lastModifiedTimeStamp between", value1, value2, "lastModifiedTimeStamp");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeStampNotBetween(Long value1, Long value2) {
            addCriterion("lastModifiedTimeStamp not between", value1, value2, "lastModifiedTimeStamp");
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