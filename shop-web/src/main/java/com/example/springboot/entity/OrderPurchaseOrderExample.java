package com.example.springboot.entity;

import java.util.ArrayList;
import java.util.List;

public class OrderPurchaseOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderPurchaseOrderExample() {
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

        public Criteria andPurchaseOrderIDIsNull() {
            addCriterion("purchaseOrderID is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIDIsNotNull() {
            addCriterion("purchaseOrderID is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIDEqualTo(String value) {
            addCriterion("purchaseOrderID =", value, "purchaseOrderID");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIDNotEqualTo(String value) {
            addCriterion("purchaseOrderID <>", value, "purchaseOrderID");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIDGreaterThan(String value) {
            addCriterion("purchaseOrderID >", value, "purchaseOrderID");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIDGreaterThanOrEqualTo(String value) {
            addCriterion("purchaseOrderID >=", value, "purchaseOrderID");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIDLessThan(String value) {
            addCriterion("purchaseOrderID <", value, "purchaseOrderID");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIDLessThanOrEqualTo(String value) {
            addCriterion("purchaseOrderID <=", value, "purchaseOrderID");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIDLike(String value) {
            addCriterion("purchaseOrderID like", value, "purchaseOrderID");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIDNotLike(String value) {
            addCriterion("purchaseOrderID not like", value, "purchaseOrderID");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIDIn(List<String> values) {
            addCriterion("purchaseOrderID in", values, "purchaseOrderID");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIDNotIn(List<String> values) {
            addCriterion("purchaseOrderID not in", values, "purchaseOrderID");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIDBetween(String value1, String value2) {
            addCriterion("purchaseOrderID between", value1, value2, "purchaseOrderID");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIDNotBetween(String value1, String value2) {
            addCriterion("purchaseOrderID not between", value1, value2, "purchaseOrderID");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentStateIsNull() {
            addCriterion("orderPaymentState is null");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentStateIsNotNull() {
            addCriterion("orderPaymentState is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentStateEqualTo(Short value) {
            addCriterion("orderPaymentState =", value, "orderPaymentState");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentStateNotEqualTo(Short value) {
            addCriterion("orderPaymentState <>", value, "orderPaymentState");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentStateGreaterThan(Short value) {
            addCriterion("orderPaymentState >", value, "orderPaymentState");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentStateGreaterThanOrEqualTo(Short value) {
            addCriterion("orderPaymentState >=", value, "orderPaymentState");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentStateLessThan(Short value) {
            addCriterion("orderPaymentState <", value, "orderPaymentState");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentStateLessThanOrEqualTo(Short value) {
            addCriterion("orderPaymentState <=", value, "orderPaymentState");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentStateIn(List<Short> values) {
            addCriterion("orderPaymentState in", values, "orderPaymentState");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentStateNotIn(List<Short> values) {
            addCriterion("orderPaymentState not in", values, "orderPaymentState");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentStateBetween(Short value1, Short value2) {
            addCriterion("orderPaymentState between", value1, value2, "orderPaymentState");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentStateNotBetween(Short value1, Short value2) {
            addCriterion("orderPaymentState not between", value1, value2, "orderPaymentState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNull() {
            addCriterion("orderState is null");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNotNull() {
            addCriterion("orderState is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStateEqualTo(Short value) {
            addCriterion("orderState =", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotEqualTo(Short value) {
            addCriterion("orderState <>", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThan(Short value) {
            addCriterion("orderState >", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThanOrEqualTo(Short value) {
            addCriterion("orderState >=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThan(Short value) {
            addCriterion("orderState <", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThanOrEqualTo(Short value) {
            addCriterion("orderState <=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIn(List<Short> values) {
            addCriterion("orderState in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotIn(List<Short> values) {
            addCriterion("orderState not in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateBetween(Short value1, Short value2) {
            addCriterion("orderState between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotBetween(Short value1, Short value2) {
            addCriterion("orderState not between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andPaidModeIsNull() {
            addCriterion("paidMode is null");
            return (Criteria) this;
        }

        public Criteria andPaidModeIsNotNull() {
            addCriterion("paidMode is not null");
            return (Criteria) this;
        }

        public Criteria andPaidModeEqualTo(Short value) {
            addCriterion("paidMode =", value, "paidMode");
            return (Criteria) this;
        }

        public Criteria andPaidModeNotEqualTo(Short value) {
            addCriterion("paidMode <>", value, "paidMode");
            return (Criteria) this;
        }

        public Criteria andPaidModeGreaterThan(Short value) {
            addCriterion("paidMode >", value, "paidMode");
            return (Criteria) this;
        }

        public Criteria andPaidModeGreaterThanOrEqualTo(Short value) {
            addCriterion("paidMode >=", value, "paidMode");
            return (Criteria) this;
        }

        public Criteria andPaidModeLessThan(Short value) {
            addCriterion("paidMode <", value, "paidMode");
            return (Criteria) this;
        }

        public Criteria andPaidModeLessThanOrEqualTo(Short value) {
            addCriterion("paidMode <=", value, "paidMode");
            return (Criteria) this;
        }

        public Criteria andPaidModeIn(List<Short> values) {
            addCriterion("paidMode in", values, "paidMode");
            return (Criteria) this;
        }

        public Criteria andPaidModeNotIn(List<Short> values) {
            addCriterion("paidMode not in", values, "paidMode");
            return (Criteria) this;
        }

        public Criteria andPaidModeBetween(Short value1, Short value2) {
            addCriterion("paidMode between", value1, value2, "paidMode");
            return (Criteria) this;
        }

        public Criteria andPaidModeNotBetween(Short value1, Short value2) {
            addCriterion("paidMode not between", value1, value2, "paidMode");
            return (Criteria) this;
        }

        public Criteria andPaidRecordIDIsNull() {
            addCriterion("paidRecordID is null");
            return (Criteria) this;
        }

        public Criteria andPaidRecordIDIsNotNull() {
            addCriterion("paidRecordID is not null");
            return (Criteria) this;
        }

        public Criteria andPaidRecordIDEqualTo(Integer value) {
            addCriterion("paidRecordID =", value, "paidRecordID");
            return (Criteria) this;
        }

        public Criteria andPaidRecordIDNotEqualTo(Integer value) {
            addCriterion("paidRecordID <>", value, "paidRecordID");
            return (Criteria) this;
        }

        public Criteria andPaidRecordIDGreaterThan(Integer value) {
            addCriterion("paidRecordID >", value, "paidRecordID");
            return (Criteria) this;
        }

        public Criteria andPaidRecordIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("paidRecordID >=", value, "paidRecordID");
            return (Criteria) this;
        }

        public Criteria andPaidRecordIDLessThan(Integer value) {
            addCriterion("paidRecordID <", value, "paidRecordID");
            return (Criteria) this;
        }

        public Criteria andPaidRecordIDLessThanOrEqualTo(Integer value) {
            addCriterion("paidRecordID <=", value, "paidRecordID");
            return (Criteria) this;
        }

        public Criteria andPaidRecordIDIn(List<Integer> values) {
            addCriterion("paidRecordID in", values, "paidRecordID");
            return (Criteria) this;
        }

        public Criteria andPaidRecordIDNotIn(List<Integer> values) {
            addCriterion("paidRecordID not in", values, "paidRecordID");
            return (Criteria) this;
        }

        public Criteria andPaidRecordIDBetween(Integer value1, Integer value2) {
            addCriterion("paidRecordID between", value1, value2, "paidRecordID");
            return (Criteria) this;
        }

        public Criteria andPaidRecordIDNotBetween(Integer value1, Integer value2) {
            addCriterion("paidRecordID not between", value1, value2, "paidRecordID");
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

        public Criteria andProductColourIDIsNull() {
            addCriterion("productColourID is null");
            return (Criteria) this;
        }

        public Criteria andProductColourIDIsNotNull() {
            addCriterion("productColourID is not null");
            return (Criteria) this;
        }

        public Criteria andProductColourIDEqualTo(Integer value) {
            addCriterion("productColourID =", value, "productColourID");
            return (Criteria) this;
        }

        public Criteria andProductColourIDNotEqualTo(Integer value) {
            addCriterion("productColourID <>", value, "productColourID");
            return (Criteria) this;
        }

        public Criteria andProductColourIDGreaterThan(Integer value) {
            addCriterion("productColourID >", value, "productColourID");
            return (Criteria) this;
        }

        public Criteria andProductColourIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("productColourID >=", value, "productColourID");
            return (Criteria) this;
        }

        public Criteria andProductColourIDLessThan(Integer value) {
            addCriterion("productColourID <", value, "productColourID");
            return (Criteria) this;
        }

        public Criteria andProductColourIDLessThanOrEqualTo(Integer value) {
            addCriterion("productColourID <=", value, "productColourID");
            return (Criteria) this;
        }

        public Criteria andProductColourIDIn(List<Integer> values) {
            addCriterion("productColourID in", values, "productColourID");
            return (Criteria) this;
        }

        public Criteria andProductColourIDNotIn(List<Integer> values) {
            addCriterion("productColourID not in", values, "productColourID");
            return (Criteria) this;
        }

        public Criteria andProductColourIDBetween(Integer value1, Integer value2) {
            addCriterion("productColourID between", value1, value2, "productColourID");
            return (Criteria) this;
        }

        public Criteria andProductColourIDNotBetween(Integer value1, Integer value2) {
            addCriterion("productColourID not between", value1, value2, "productColourID");
            return (Criteria) this;
        }

        public Criteria andProductColourIsNull() {
            addCriterion("productColour is null");
            return (Criteria) this;
        }

        public Criteria andProductColourIsNotNull() {
            addCriterion("productColour is not null");
            return (Criteria) this;
        }

        public Criteria andProductColourEqualTo(String value) {
            addCriterion("productColour =", value, "productColour");
            return (Criteria) this;
        }

        public Criteria andProductColourNotEqualTo(String value) {
            addCriterion("productColour <>", value, "productColour");
            return (Criteria) this;
        }

        public Criteria andProductColourGreaterThan(String value) {
            addCriterion("productColour >", value, "productColour");
            return (Criteria) this;
        }

        public Criteria andProductColourGreaterThanOrEqualTo(String value) {
            addCriterion("productColour >=", value, "productColour");
            return (Criteria) this;
        }

        public Criteria andProductColourLessThan(String value) {
            addCriterion("productColour <", value, "productColour");
            return (Criteria) this;
        }

        public Criteria andProductColourLessThanOrEqualTo(String value) {
            addCriterion("productColour <=", value, "productColour");
            return (Criteria) this;
        }

        public Criteria andProductColourLike(String value) {
            addCriterion("productColour like", value, "productColour");
            return (Criteria) this;
        }

        public Criteria andProductColourNotLike(String value) {
            addCriterion("productColour not like", value, "productColour");
            return (Criteria) this;
        }

        public Criteria andProductColourIn(List<String> values) {
            addCriterion("productColour in", values, "productColour");
            return (Criteria) this;
        }

        public Criteria andProductColourNotIn(List<String> values) {
            addCriterion("productColour not in", values, "productColour");
            return (Criteria) this;
        }

        public Criteria andProductColourBetween(String value1, String value2) {
            addCriterion("productColour between", value1, value2, "productColour");
            return (Criteria) this;
        }

        public Criteria andProductColourNotBetween(String value1, String value2) {
            addCriterion("productColour not between", value1, value2, "productColour");
            return (Criteria) this;
        }

        public Criteria andProductStandardIDIsNull() {
            addCriterion("productStandardID is null");
            return (Criteria) this;
        }

        public Criteria andProductStandardIDIsNotNull() {
            addCriterion("productStandardID is not null");
            return (Criteria) this;
        }

        public Criteria andProductStandardIDEqualTo(Integer value) {
            addCriterion("productStandardID =", value, "productStandardID");
            return (Criteria) this;
        }

        public Criteria andProductStandardIDNotEqualTo(Integer value) {
            addCriterion("productStandardID <>", value, "productStandardID");
            return (Criteria) this;
        }

        public Criteria andProductStandardIDGreaterThan(Integer value) {
            addCriterion("productStandardID >", value, "productStandardID");
            return (Criteria) this;
        }

        public Criteria andProductStandardIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("productStandardID >=", value, "productStandardID");
            return (Criteria) this;
        }

        public Criteria andProductStandardIDLessThan(Integer value) {
            addCriterion("productStandardID <", value, "productStandardID");
            return (Criteria) this;
        }

        public Criteria andProductStandardIDLessThanOrEqualTo(Integer value) {
            addCriterion("productStandardID <=", value, "productStandardID");
            return (Criteria) this;
        }

        public Criteria andProductStandardIDIn(List<Integer> values) {
            addCriterion("productStandardID in", values, "productStandardID");
            return (Criteria) this;
        }

        public Criteria andProductStandardIDNotIn(List<Integer> values) {
            addCriterion("productStandardID not in", values, "productStandardID");
            return (Criteria) this;
        }

        public Criteria andProductStandardIDBetween(Integer value1, Integer value2) {
            addCriterion("productStandardID between", value1, value2, "productStandardID");
            return (Criteria) this;
        }

        public Criteria andProductStandardIDNotBetween(Integer value1, Integer value2) {
            addCriterion("productStandardID not between", value1, value2, "productStandardID");
            return (Criteria) this;
        }

        public Criteria andProductStandardIsNull() {
            addCriterion("productStandard is null");
            return (Criteria) this;
        }

        public Criteria andProductStandardIsNotNull() {
            addCriterion("productStandard is not null");
            return (Criteria) this;
        }

        public Criteria andProductStandardEqualTo(String value) {
            addCriterion("productStandard =", value, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardNotEqualTo(String value) {
            addCriterion("productStandard <>", value, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardGreaterThan(String value) {
            addCriterion("productStandard >", value, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardGreaterThanOrEqualTo(String value) {
            addCriterion("productStandard >=", value, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardLessThan(String value) {
            addCriterion("productStandard <", value, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardLessThanOrEqualTo(String value) {
            addCriterion("productStandard <=", value, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardLike(String value) {
            addCriterion("productStandard like", value, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardNotLike(String value) {
            addCriterion("productStandard not like", value, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardIn(List<String> values) {
            addCriterion("productStandard in", values, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardNotIn(List<String> values) {
            addCriterion("productStandard not in", values, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardBetween(String value1, String value2) {
            addCriterion("productStandard between", value1, value2, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardNotBetween(String value1, String value2) {
            addCriterion("productStandard not between", value1, value2, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageIsNull() {
            addCriterion("productTitleImage is null");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageIsNotNull() {
            addCriterion("productTitleImage is not null");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageEqualTo(String value) {
            addCriterion("productTitleImage =", value, "productTitleImage");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageNotEqualTo(String value) {
            addCriterion("productTitleImage <>", value, "productTitleImage");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageGreaterThan(String value) {
            addCriterion("productTitleImage >", value, "productTitleImage");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageGreaterThanOrEqualTo(String value) {
            addCriterion("productTitleImage >=", value, "productTitleImage");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageLessThan(String value) {
            addCriterion("productTitleImage <", value, "productTitleImage");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageLessThanOrEqualTo(String value) {
            addCriterion("productTitleImage <=", value, "productTitleImage");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageLike(String value) {
            addCriterion("productTitleImage like", value, "productTitleImage");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageNotLike(String value) {
            addCriterion("productTitleImage not like", value, "productTitleImage");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageIn(List<String> values) {
            addCriterion("productTitleImage in", values, "productTitleImage");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageNotIn(List<String> values) {
            addCriterion("productTitleImage not in", values, "productTitleImage");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageBetween(String value1, String value2) {
            addCriterion("productTitleImage between", value1, value2, "productTitleImage");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageNotBetween(String value1, String value2) {
            addCriterion("productTitleImage not between", value1, value2, "productTitleImage");
            return (Criteria) this;
        }

        public Criteria andProductUnitPriceIsNull() {
            addCriterion("productUnitPrice is null");
            return (Criteria) this;
        }

        public Criteria andProductUnitPriceIsNotNull() {
            addCriterion("productUnitPrice is not null");
            return (Criteria) this;
        }

        public Criteria andProductUnitPriceEqualTo(Integer value) {
            addCriterion("productUnitPrice =", value, "productUnitPrice");
            return (Criteria) this;
        }

        public Criteria andProductUnitPriceNotEqualTo(Integer value) {
            addCriterion("productUnitPrice <>", value, "productUnitPrice");
            return (Criteria) this;
        }

        public Criteria andProductUnitPriceGreaterThan(Integer value) {
            addCriterion("productUnitPrice >", value, "productUnitPrice");
            return (Criteria) this;
        }

        public Criteria andProductUnitPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("productUnitPrice >=", value, "productUnitPrice");
            return (Criteria) this;
        }

        public Criteria andProductUnitPriceLessThan(Integer value) {
            addCriterion("productUnitPrice <", value, "productUnitPrice");
            return (Criteria) this;
        }

        public Criteria andProductUnitPriceLessThanOrEqualTo(Integer value) {
            addCriterion("productUnitPrice <=", value, "productUnitPrice");
            return (Criteria) this;
        }

        public Criteria andProductUnitPriceIn(List<Integer> values) {
            addCriterion("productUnitPrice in", values, "productUnitPrice");
            return (Criteria) this;
        }

        public Criteria andProductUnitPriceNotIn(List<Integer> values) {
            addCriterion("productUnitPrice not in", values, "productUnitPrice");
            return (Criteria) this;
        }

        public Criteria andProductUnitPriceBetween(Integer value1, Integer value2) {
            addCriterion("productUnitPrice between", value1, value2, "productUnitPrice");
            return (Criteria) this;
        }

        public Criteria andProductUnitPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("productUnitPrice not between", value1, value2, "productUnitPrice");
            return (Criteria) this;
        }

        public Criteria andProductNumberIsNull() {
            addCriterion("productNumber is null");
            return (Criteria) this;
        }

        public Criteria andProductNumberIsNotNull() {
            addCriterion("productNumber is not null");
            return (Criteria) this;
        }

        public Criteria andProductNumberEqualTo(Integer value) {
            addCriterion("productNumber =", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberNotEqualTo(Integer value) {
            addCriterion("productNumber <>", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberGreaterThan(Integer value) {
            addCriterion("productNumber >", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("productNumber >=", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberLessThan(Integer value) {
            addCriterion("productNumber <", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberLessThanOrEqualTo(Integer value) {
            addCriterion("productNumber <=", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberIn(List<Integer> values) {
            addCriterion("productNumber in", values, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberNotIn(List<Integer> values) {
            addCriterion("productNumber not in", values, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberBetween(Integer value1, Integer value2) {
            addCriterion("productNumber between", value1, value2, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("productNumber not between", value1, value2, "productNumber");
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

        public Criteria andUserNameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("userName =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("userName <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("userName >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("userName <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("userName like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("userName not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("userName in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("userName not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("orderType is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("orderType is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Short value) {
            addCriterion("orderType =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Short value) {
            addCriterion("orderType <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Short value) {
            addCriterion("orderType >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("orderType >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Short value) {
            addCriterion("orderType <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Short value) {
            addCriterion("orderType <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Short> values) {
            addCriterion("orderType in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Short> values) {
            addCriterion("orderType not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Short value1, Short value2) {
            addCriterion("orderType between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Short value1, Short value2) {
            addCriterion("orderType not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderFromIsNull() {
            addCriterion("orderFrom is null");
            return (Criteria) this;
        }

        public Criteria andOrderFromIsNotNull() {
            addCriterion("orderFrom is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFromEqualTo(Short value) {
            addCriterion("orderFrom =", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromNotEqualTo(Short value) {
            addCriterion("orderFrom <>", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromGreaterThan(Short value) {
            addCriterion("orderFrom >", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromGreaterThanOrEqualTo(Short value) {
            addCriterion("orderFrom >=", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromLessThan(Short value) {
            addCriterion("orderFrom <", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromLessThanOrEqualTo(Short value) {
            addCriterion("orderFrom <=", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromIn(List<Short> values) {
            addCriterion("orderFrom in", values, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromNotIn(List<Short> values) {
            addCriterion("orderFrom not in", values, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromBetween(Short value1, Short value2) {
            addCriterion("orderFrom between", value1, value2, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromNotBetween(Short value1, Short value2) {
            addCriterion("orderFrom not between", value1, value2, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andUserRemarkIsNull() {
            addCriterion("userRemark is null");
            return (Criteria) this;
        }

        public Criteria andUserRemarkIsNotNull() {
            addCriterion("userRemark is not null");
            return (Criteria) this;
        }

        public Criteria andUserRemarkEqualTo(String value) {
            addCriterion("userRemark =", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkNotEqualTo(String value) {
            addCriterion("userRemark <>", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkGreaterThan(String value) {
            addCriterion("userRemark >", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("userRemark >=", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkLessThan(String value) {
            addCriterion("userRemark <", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkLessThanOrEqualTo(String value) {
            addCriterion("userRemark <=", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkLike(String value) {
            addCriterion("userRemark like", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkNotLike(String value) {
            addCriterion("userRemark not like", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkIn(List<String> values) {
            addCriterion("userRemark in", values, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkNotIn(List<String> values) {
            addCriterion("userRemark not in", values, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkBetween(String value1, String value2) {
            addCriterion("userRemark between", value1, value2, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkNotBetween(String value1, String value2) {
            addCriterion("userRemark not between", value1, value2, "userRemark");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("totalAmount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("totalAmount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(Integer value) {
            addCriterion("totalAmount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(Integer value) {
            addCriterion("totalAmount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(Integer value) {
            addCriterion("totalAmount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalAmount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(Integer value) {
            addCriterion("totalAmount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(Integer value) {
            addCriterion("totalAmount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<Integer> values) {
            addCriterion("totalAmount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<Integer> values) {
            addCriterion("totalAmount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(Integer value1, Integer value2) {
            addCriterion("totalAmount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("totalAmount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andFavourModeIsNull() {
            addCriterion("favourMode is null");
            return (Criteria) this;
        }

        public Criteria andFavourModeIsNotNull() {
            addCriterion("favourMode is not null");
            return (Criteria) this;
        }

        public Criteria andFavourModeEqualTo(Short value) {
            addCriterion("favourMode =", value, "favourMode");
            return (Criteria) this;
        }

        public Criteria andFavourModeNotEqualTo(Short value) {
            addCriterion("favourMode <>", value, "favourMode");
            return (Criteria) this;
        }

        public Criteria andFavourModeGreaterThan(Short value) {
            addCriterion("favourMode >", value, "favourMode");
            return (Criteria) this;
        }

        public Criteria andFavourModeGreaterThanOrEqualTo(Short value) {
            addCriterion("favourMode >=", value, "favourMode");
            return (Criteria) this;
        }

        public Criteria andFavourModeLessThan(Short value) {
            addCriterion("favourMode <", value, "favourMode");
            return (Criteria) this;
        }

        public Criteria andFavourModeLessThanOrEqualTo(Short value) {
            addCriterion("favourMode <=", value, "favourMode");
            return (Criteria) this;
        }

        public Criteria andFavourModeIn(List<Short> values) {
            addCriterion("favourMode in", values, "favourMode");
            return (Criteria) this;
        }

        public Criteria andFavourModeNotIn(List<Short> values) {
            addCriterion("favourMode not in", values, "favourMode");
            return (Criteria) this;
        }

        public Criteria andFavourModeBetween(Short value1, Short value2) {
            addCriterion("favourMode between", value1, value2, "favourMode");
            return (Criteria) this;
        }

        public Criteria andFavourModeNotBetween(Short value1, Short value2) {
            addCriterion("favourMode not between", value1, value2, "favourMode");
            return (Criteria) this;
        }

        public Criteria andFavourRelatedCouponIDIsNull() {
            addCriterion("favourRelatedCouponID is null");
            return (Criteria) this;
        }

        public Criteria andFavourRelatedCouponIDIsNotNull() {
            addCriterion("favourRelatedCouponID is not null");
            return (Criteria) this;
        }

        public Criteria andFavourRelatedCouponIDEqualTo(Integer value) {
            addCriterion("favourRelatedCouponID =", value, "favourRelatedCouponID");
            return (Criteria) this;
        }

        public Criteria andFavourRelatedCouponIDNotEqualTo(Integer value) {
            addCriterion("favourRelatedCouponID <>", value, "favourRelatedCouponID");
            return (Criteria) this;
        }

        public Criteria andFavourRelatedCouponIDGreaterThan(Integer value) {
            addCriterion("favourRelatedCouponID >", value, "favourRelatedCouponID");
            return (Criteria) this;
        }

        public Criteria andFavourRelatedCouponIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("favourRelatedCouponID >=", value, "favourRelatedCouponID");
            return (Criteria) this;
        }

        public Criteria andFavourRelatedCouponIDLessThan(Integer value) {
            addCriterion("favourRelatedCouponID <", value, "favourRelatedCouponID");
            return (Criteria) this;
        }

        public Criteria andFavourRelatedCouponIDLessThanOrEqualTo(Integer value) {
            addCriterion("favourRelatedCouponID <=", value, "favourRelatedCouponID");
            return (Criteria) this;
        }

        public Criteria andFavourRelatedCouponIDIn(List<Integer> values) {
            addCriterion("favourRelatedCouponID in", values, "favourRelatedCouponID");
            return (Criteria) this;
        }

        public Criteria andFavourRelatedCouponIDNotIn(List<Integer> values) {
            addCriterion("favourRelatedCouponID not in", values, "favourRelatedCouponID");
            return (Criteria) this;
        }

        public Criteria andFavourRelatedCouponIDBetween(Integer value1, Integer value2) {
            addCriterion("favourRelatedCouponID between", value1, value2, "favourRelatedCouponID");
            return (Criteria) this;
        }

        public Criteria andFavourRelatedCouponIDNotBetween(Integer value1, Integer value2) {
            addCriterion("favourRelatedCouponID not between", value1, value2, "favourRelatedCouponID");
            return (Criteria) this;
        }

        public Criteria andFavourAmountIsNull() {
            addCriterion("favourAmount is null");
            return (Criteria) this;
        }

        public Criteria andFavourAmountIsNotNull() {
            addCriterion("favourAmount is not null");
            return (Criteria) this;
        }

        public Criteria andFavourAmountEqualTo(Integer value) {
            addCriterion("favourAmount =", value, "favourAmount");
            return (Criteria) this;
        }

        public Criteria andFavourAmountNotEqualTo(Integer value) {
            addCriterion("favourAmount <>", value, "favourAmount");
            return (Criteria) this;
        }

        public Criteria andFavourAmountGreaterThan(Integer value) {
            addCriterion("favourAmount >", value, "favourAmount");
            return (Criteria) this;
        }

        public Criteria andFavourAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("favourAmount >=", value, "favourAmount");
            return (Criteria) this;
        }

        public Criteria andFavourAmountLessThan(Integer value) {
            addCriterion("favourAmount <", value, "favourAmount");
            return (Criteria) this;
        }

        public Criteria andFavourAmountLessThanOrEqualTo(Integer value) {
            addCriterion("favourAmount <=", value, "favourAmount");
            return (Criteria) this;
        }

        public Criteria andFavourAmountIn(List<Integer> values) {
            addCriterion("favourAmount in", values, "favourAmount");
            return (Criteria) this;
        }

        public Criteria andFavourAmountNotIn(List<Integer> values) {
            addCriterion("favourAmount not in", values, "favourAmount");
            return (Criteria) this;
        }

        public Criteria andFavourAmountBetween(Integer value1, Integer value2) {
            addCriterion("favourAmount between", value1, value2, "favourAmount");
            return (Criteria) this;
        }

        public Criteria andFavourAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("favourAmount not between", value1, value2, "favourAmount");
            return (Criteria) this;
        }

        public Criteria andTransportationExpensesIsNull() {
            addCriterion("transportationExpenses is null");
            return (Criteria) this;
        }

        public Criteria andTransportationExpensesIsNotNull() {
            addCriterion("transportationExpenses is not null");
            return (Criteria) this;
        }

        public Criteria andTransportationExpensesEqualTo(Integer value) {
            addCriterion("transportationExpenses =", value, "transportationExpenses");
            return (Criteria) this;
        }

        public Criteria andTransportationExpensesNotEqualTo(Integer value) {
            addCriterion("transportationExpenses <>", value, "transportationExpenses");
            return (Criteria) this;
        }

        public Criteria andTransportationExpensesGreaterThan(Integer value) {
            addCriterion("transportationExpenses >", value, "transportationExpenses");
            return (Criteria) this;
        }

        public Criteria andTransportationExpensesGreaterThanOrEqualTo(Integer value) {
            addCriterion("transportationExpenses >=", value, "transportationExpenses");
            return (Criteria) this;
        }

        public Criteria andTransportationExpensesLessThan(Integer value) {
            addCriterion("transportationExpenses <", value, "transportationExpenses");
            return (Criteria) this;
        }

        public Criteria andTransportationExpensesLessThanOrEqualTo(Integer value) {
            addCriterion("transportationExpenses <=", value, "transportationExpenses");
            return (Criteria) this;
        }

        public Criteria andTransportationExpensesIn(List<Integer> values) {
            addCriterion("transportationExpenses in", values, "transportationExpenses");
            return (Criteria) this;
        }

        public Criteria andTransportationExpensesNotIn(List<Integer> values) {
            addCriterion("transportationExpenses not in", values, "transportationExpenses");
            return (Criteria) this;
        }

        public Criteria andTransportationExpensesBetween(Integer value1, Integer value2) {
            addCriterion("transportationExpenses between", value1, value2, "transportationExpenses");
            return (Criteria) this;
        }

        public Criteria andTransportationExpensesNotBetween(Integer value1, Integer value2) {
            addCriterion("transportationExpenses not between", value1, value2, "transportationExpenses");
            return (Criteria) this;
        }

        public Criteria andFinalAmountIsNull() {
            addCriterion("finalAmount is null");
            return (Criteria) this;
        }

        public Criteria andFinalAmountIsNotNull() {
            addCriterion("finalAmount is not null");
            return (Criteria) this;
        }

        public Criteria andFinalAmountEqualTo(Integer value) {
            addCriterion("finalAmount =", value, "finalAmount");
            return (Criteria) this;
        }

        public Criteria andFinalAmountNotEqualTo(Integer value) {
            addCriterion("finalAmount <>", value, "finalAmount");
            return (Criteria) this;
        }

        public Criteria andFinalAmountGreaterThan(Integer value) {
            addCriterion("finalAmount >", value, "finalAmount");
            return (Criteria) this;
        }

        public Criteria andFinalAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("finalAmount >=", value, "finalAmount");
            return (Criteria) this;
        }

        public Criteria andFinalAmountLessThan(Integer value) {
            addCriterion("finalAmount <", value, "finalAmount");
            return (Criteria) this;
        }

        public Criteria andFinalAmountLessThanOrEqualTo(Integer value) {
            addCriterion("finalAmount <=", value, "finalAmount");
            return (Criteria) this;
        }

        public Criteria andFinalAmountIn(List<Integer> values) {
            addCriterion("finalAmount in", values, "finalAmount");
            return (Criteria) this;
        }

        public Criteria andFinalAmountNotIn(List<Integer> values) {
            addCriterion("finalAmount not in", values, "finalAmount");
            return (Criteria) this;
        }

        public Criteria andFinalAmountBetween(Integer value1, Integer value2) {
            addCriterion("finalAmount between", value1, value2, "finalAmount");
            return (Criteria) this;
        }

        public Criteria andFinalAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("finalAmount not between", value1, value2, "finalAmount");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNull() {
            addCriterion("receiverName is null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNotNull() {
            addCriterion("receiverName is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameEqualTo(String value) {
            addCriterion("receiverName =", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotEqualTo(String value) {
            addCriterion("receiverName <>", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThan(String value) {
            addCriterion("receiverName >", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThanOrEqualTo(String value) {
            addCriterion("receiverName >=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThan(String value) {
            addCriterion("receiverName <", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThanOrEqualTo(String value) {
            addCriterion("receiverName <=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLike(String value) {
            addCriterion("receiverName like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotLike(String value) {
            addCriterion("receiverName not like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIn(List<String> values) {
            addCriterion("receiverName in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotIn(List<String> values) {
            addCriterion("receiverName not in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameBetween(String value1, String value2) {
            addCriterion("receiverName between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotBetween(String value1, String value2) {
            addCriterion("receiverName not between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCountyIsNull() {
            addCriterion("county is null");
            return (Criteria) this;
        }

        public Criteria andCountyIsNotNull() {
            addCriterion("county is not null");
            return (Criteria) this;
        }

        public Criteria andCountyEqualTo(String value) {
            addCriterion("county =", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotEqualTo(String value) {
            addCriterion("county <>", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThan(String value) {
            addCriterion("county >", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThanOrEqualTo(String value) {
            addCriterion("county >=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThan(String value) {
            addCriterion("county <", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThanOrEqualTo(String value) {
            addCriterion("county <=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLike(String value) {
            addCriterion("county like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotLike(String value) {
            addCriterion("county not like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyIn(List<String> values) {
            addCriterion("county in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotIn(List<String> values) {
            addCriterion("county not in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyBetween(String value1, String value2) {
            addCriterion("county between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotBetween(String value1, String value2) {
            addCriterion("county not between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressIsNull() {
            addCriterion("receiveAddress is null");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressIsNotNull() {
            addCriterion("receiveAddress is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressEqualTo(String value) {
            addCriterion("receiveAddress =", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressNotEqualTo(String value) {
            addCriterion("receiveAddress <>", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressGreaterThan(String value) {
            addCriterion("receiveAddress >", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressGreaterThanOrEqualTo(String value) {
            addCriterion("receiveAddress >=", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressLessThan(String value) {
            addCriterion("receiveAddress <", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressLessThanOrEqualTo(String value) {
            addCriterion("receiveAddress <=", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressLike(String value) {
            addCriterion("receiveAddress like", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressNotLike(String value) {
            addCriterion("receiveAddress not like", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressIn(List<String> values) {
            addCriterion("receiveAddress in", values, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressNotIn(List<String> values) {
            addCriterion("receiveAddress not in", values, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressBetween(String value1, String value2) {
            addCriterion("receiveAddress between", value1, value2, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressNotBetween(String value1, String value2) {
            addCriterion("receiveAddress not between", value1, value2, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIsNull() {
            addCriterion("phoneNum is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIsNotNull() {
            addCriterion("phoneNum is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumEqualTo(String value) {
            addCriterion("phoneNum =", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotEqualTo(String value) {
            addCriterion("phoneNum <>", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumGreaterThan(String value) {
            addCriterion("phoneNum >", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumGreaterThanOrEqualTo(String value) {
            addCriterion("phoneNum >=", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLessThan(String value) {
            addCriterion("phoneNum <", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLessThanOrEqualTo(String value) {
            addCriterion("phoneNum <=", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLike(String value) {
            addCriterion("phoneNum like", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotLike(String value) {
            addCriterion("phoneNum not like", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIn(List<String> values) {
            addCriterion("phoneNum in", values, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotIn(List<String> values) {
            addCriterion("phoneNum not in", values, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumBetween(String value1, String value2) {
            addCriterion("phoneNum between", value1, value2, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotBetween(String value1, String value2) {
            addCriterion("phoneNum not between", value1, value2, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIsNull() {
            addCriterion("invoiceTitle is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIsNotNull() {
            addCriterion("invoiceTitle is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleEqualTo(String value) {
            addCriterion("invoiceTitle =", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotEqualTo(String value) {
            addCriterion("invoiceTitle <>", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleGreaterThan(String value) {
            addCriterion("invoiceTitle >", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleGreaterThanOrEqualTo(String value) {
            addCriterion("invoiceTitle >=", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLessThan(String value) {
            addCriterion("invoiceTitle <", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLessThanOrEqualTo(String value) {
            addCriterion("invoiceTitle <=", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLike(String value) {
            addCriterion("invoiceTitle like", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotLike(String value) {
            addCriterion("invoiceTitle not like", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIn(List<String> values) {
            addCriterion("invoiceTitle in", values, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotIn(List<String> values) {
            addCriterion("invoiceTitle not in", values, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleBetween(String value1, String value2) {
            addCriterion("invoiceTitle between", value1, value2, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotBetween(String value1, String value2) {
            addCriterion("invoiceTitle not between", value1, value2, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentIsNull() {
            addCriterion("invoiceContent is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentIsNotNull() {
            addCriterion("invoiceContent is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentEqualTo(String value) {
            addCriterion("invoiceContent =", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentNotEqualTo(String value) {
            addCriterion("invoiceContent <>", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentGreaterThan(String value) {
            addCriterion("invoiceContent >", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentGreaterThanOrEqualTo(String value) {
            addCriterion("invoiceContent >=", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentLessThan(String value) {
            addCriterion("invoiceContent <", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentLessThanOrEqualTo(String value) {
            addCriterion("invoiceContent <=", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentLike(String value) {
            addCriterion("invoiceContent like", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentNotLike(String value) {
            addCriterion("invoiceContent not like", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentIn(List<String> values) {
            addCriterion("invoiceContent in", values, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentNotIn(List<String> values) {
            addCriterion("invoiceContent not in", values, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentBetween(String value1, String value2) {
            addCriterion("invoiceContent between", value1, value2, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentNotBetween(String value1, String value2) {
            addCriterion("invoiceContent not between", value1, value2, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedTimeIsNull() {
            addCriterion("orderCreatedTime is null");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedTimeIsNotNull() {
            addCriterion("orderCreatedTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedTimeEqualTo(Long value) {
            addCriterion("orderCreatedTime =", value, "orderCreatedTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedTimeNotEqualTo(Long value) {
            addCriterion("orderCreatedTime <>", value, "orderCreatedTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedTimeGreaterThan(Long value) {
            addCriterion("orderCreatedTime >", value, "orderCreatedTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("orderCreatedTime >=", value, "orderCreatedTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedTimeLessThan(Long value) {
            addCriterion("orderCreatedTime <", value, "orderCreatedTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedTimeLessThanOrEqualTo(Long value) {
            addCriterion("orderCreatedTime <=", value, "orderCreatedTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedTimeIn(List<Long> values) {
            addCriterion("orderCreatedTime in", values, "orderCreatedTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedTimeNotIn(List<Long> values) {
            addCriterion("orderCreatedTime not in", values, "orderCreatedTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedTimeBetween(Long value1, Long value2) {
            addCriterion("orderCreatedTime between", value1, value2, "orderCreatedTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedTimeNotBetween(Long value1, Long value2) {
            addCriterion("orderCreatedTime not between", value1, value2, "orderCreatedTime");
            return (Criteria) this;
        }

        public Criteria andOrderPaidTimeIsNull() {
            addCriterion("orderPaidTime is null");
            return (Criteria) this;
        }

        public Criteria andOrderPaidTimeIsNotNull() {
            addCriterion("orderPaidTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPaidTimeEqualTo(Long value) {
            addCriterion("orderPaidTime =", value, "orderPaidTime");
            return (Criteria) this;
        }

        public Criteria andOrderPaidTimeNotEqualTo(Long value) {
            addCriterion("orderPaidTime <>", value, "orderPaidTime");
            return (Criteria) this;
        }

        public Criteria andOrderPaidTimeGreaterThan(Long value) {
            addCriterion("orderPaidTime >", value, "orderPaidTime");
            return (Criteria) this;
        }

        public Criteria andOrderPaidTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("orderPaidTime >=", value, "orderPaidTime");
            return (Criteria) this;
        }

        public Criteria andOrderPaidTimeLessThan(Long value) {
            addCriterion("orderPaidTime <", value, "orderPaidTime");
            return (Criteria) this;
        }

        public Criteria andOrderPaidTimeLessThanOrEqualTo(Long value) {
            addCriterion("orderPaidTime <=", value, "orderPaidTime");
            return (Criteria) this;
        }

        public Criteria andOrderPaidTimeIn(List<Long> values) {
            addCriterion("orderPaidTime in", values, "orderPaidTime");
            return (Criteria) this;
        }

        public Criteria andOrderPaidTimeNotIn(List<Long> values) {
            addCriterion("orderPaidTime not in", values, "orderPaidTime");
            return (Criteria) this;
        }

        public Criteria andOrderPaidTimeBetween(Long value1, Long value2) {
            addCriterion("orderPaidTime between", value1, value2, "orderPaidTime");
            return (Criteria) this;
        }

        public Criteria andOrderPaidTimeNotBetween(Long value1, Long value2) {
            addCriterion("orderPaidTime not between", value1, value2, "orderPaidTime");
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