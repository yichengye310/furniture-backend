package com.example.springboot.entity;

import java.util.ArrayList;
import java.util.List;

public class BusinessRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusinessRoleExample() {
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

        public Criteria andRoleIDIsNull() {
            addCriterion("roleID is null");
            return (Criteria) this;
        }

        public Criteria andRoleIDIsNotNull() {
            addCriterion("roleID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIDEqualTo(Integer value) {
            addCriterion("roleID =", value, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDNotEqualTo(Integer value) {
            addCriterion("roleID <>", value, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDGreaterThan(Integer value) {
            addCriterion("roleID >", value, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("roleID >=", value, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDLessThan(Integer value) {
            addCriterion("roleID <", value, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDLessThanOrEqualTo(Integer value) {
            addCriterion("roleID <=", value, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDIn(List<Integer> values) {
            addCriterion("roleID in", values, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDNotIn(List<Integer> values) {
            addCriterion("roleID not in", values, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDBetween(Integer value1, Integer value2) {
            addCriterion("roleID between", value1, value2, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDNotBetween(Integer value1, Integer value2) {
            addCriterion("roleID not between", value1, value2, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNull() {
            addCriterion("roleName is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("roleName is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("roleName =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("roleName <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("roleName >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("roleName >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("roleName <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("roleName <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("roleName like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("roleName not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("roleName in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("roleName not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("roleName between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("roleName not between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andPermissionContentIsNull() {
            addCriterion("permissionContent is null");
            return (Criteria) this;
        }

        public Criteria andPermissionContentIsNotNull() {
            addCriterion("permissionContent is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionContentEqualTo(String value) {
            addCriterion("permissionContent =", value, "permissionContent");
            return (Criteria) this;
        }

        public Criteria andPermissionContentNotEqualTo(String value) {
            addCriterion("permissionContent <>", value, "permissionContent");
            return (Criteria) this;
        }

        public Criteria andPermissionContentGreaterThan(String value) {
            addCriterion("permissionContent >", value, "permissionContent");
            return (Criteria) this;
        }

        public Criteria andPermissionContentGreaterThanOrEqualTo(String value) {
            addCriterion("permissionContent >=", value, "permissionContent");
            return (Criteria) this;
        }

        public Criteria andPermissionContentLessThan(String value) {
            addCriterion("permissionContent <", value, "permissionContent");
            return (Criteria) this;
        }

        public Criteria andPermissionContentLessThanOrEqualTo(String value) {
            addCriterion("permissionContent <=", value, "permissionContent");
            return (Criteria) this;
        }

        public Criteria andPermissionContentLike(String value) {
            addCriterion("permissionContent like", value, "permissionContent");
            return (Criteria) this;
        }

        public Criteria andPermissionContentNotLike(String value) {
            addCriterion("permissionContent not like", value, "permissionContent");
            return (Criteria) this;
        }

        public Criteria andPermissionContentIn(List<String> values) {
            addCriterion("permissionContent in", values, "permissionContent");
            return (Criteria) this;
        }

        public Criteria andPermissionContentNotIn(List<String> values) {
            addCriterion("permissionContent not in", values, "permissionContent");
            return (Criteria) this;
        }

        public Criteria andPermissionContentBetween(String value1, String value2) {
            addCriterion("permissionContent between", value1, value2, "permissionContent");
            return (Criteria) this;
        }

        public Criteria andPermissionContentNotBetween(String value1, String value2) {
            addCriterion("permissionContent not between", value1, value2, "permissionContent");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeStampIsNull() {
            addCriterion("createdTimeStamp is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeStampIsNotNull() {
            addCriterion("createdTimeStamp is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeStampEqualTo(Long value) {
            addCriterion("createdTimeStamp =", value, "createdTimeStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeStampNotEqualTo(Long value) {
            addCriterion("createdTimeStamp <>", value, "createdTimeStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeStampGreaterThan(Long value) {
            addCriterion("createdTimeStamp >", value, "createdTimeStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeStampGreaterThanOrEqualTo(Long value) {
            addCriterion("createdTimeStamp >=", value, "createdTimeStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeStampLessThan(Long value) {
            addCriterion("createdTimeStamp <", value, "createdTimeStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeStampLessThanOrEqualTo(Long value) {
            addCriterion("createdTimeStamp <=", value, "createdTimeStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeStampIn(List<Long> values) {
            addCriterion("createdTimeStamp in", values, "createdTimeStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeStampNotIn(List<Long> values) {
            addCriterion("createdTimeStamp not in", values, "createdTimeStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeStampBetween(Long value1, Long value2) {
            addCriterion("createdTimeStamp between", value1, value2, "createdTimeStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeStampNotBetween(Long value1, Long value2) {
            addCriterion("createdTimeStamp not between", value1, value2, "createdTimeStamp");
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