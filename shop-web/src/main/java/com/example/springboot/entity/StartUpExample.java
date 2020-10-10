package com.example.springboot.entity;

import java.util.ArrayList;
import java.util.List;

public class StartUpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StartUpExample() {
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

        public Criteria andStartupIDIsNull() {
            addCriterion("startupID is null");
            return (Criteria) this;
        }

        public Criteria andStartupIDIsNotNull() {
            addCriterion("startupID is not null");
            return (Criteria) this;
        }

        public Criteria andStartupIDEqualTo(Integer value) {
            addCriterion("startupID =", value, "startupID");
            return (Criteria) this;
        }

        public Criteria andStartupIDNotEqualTo(Integer value) {
            addCriterion("startupID <>", value, "startupID");
            return (Criteria) this;
        }

        public Criteria andStartupIDGreaterThan(Integer value) {
            addCriterion("startupID >", value, "startupID");
            return (Criteria) this;
        }

        public Criteria andStartupIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("startupID >=", value, "startupID");
            return (Criteria) this;
        }

        public Criteria andStartupIDLessThan(Integer value) {
            addCriterion("startupID <", value, "startupID");
            return (Criteria) this;
        }

        public Criteria andStartupIDLessThanOrEqualTo(Integer value) {
            addCriterion("startupID <=", value, "startupID");
            return (Criteria) this;
        }

        public Criteria andStartupIDIn(List<Integer> values) {
            addCriterion("startupID in", values, "startupID");
            return (Criteria) this;
        }

        public Criteria andStartupIDNotIn(List<Integer> values) {
            addCriterion("startupID not in", values, "startupID");
            return (Criteria) this;
        }

        public Criteria andStartupIDBetween(Integer value1, Integer value2) {
            addCriterion("startupID between", value1, value2, "startupID");
            return (Criteria) this;
        }

        public Criteria andStartupIDNotBetween(Integer value1, Integer value2) {
            addCriterion("startupID not between", value1, value2, "startupID");
            return (Criteria) this;
        }

        public Criteria andImgURLIsNull() {
            addCriterion("imgURL is null");
            return (Criteria) this;
        }

        public Criteria andImgURLIsNotNull() {
            addCriterion("imgURL is not null");
            return (Criteria) this;
        }

        public Criteria andImgURLEqualTo(String value) {
            addCriterion("imgURL =", value, "imgURL");
            return (Criteria) this;
        }

        public Criteria andImgURLNotEqualTo(String value) {
            addCriterion("imgURL <>", value, "imgURL");
            return (Criteria) this;
        }

        public Criteria andImgURLGreaterThan(String value) {
            addCriterion("imgURL >", value, "imgURL");
            return (Criteria) this;
        }

        public Criteria andImgURLGreaterThanOrEqualTo(String value) {
            addCriterion("imgURL >=", value, "imgURL");
            return (Criteria) this;
        }

        public Criteria andImgURLLessThan(String value) {
            addCriterion("imgURL <", value, "imgURL");
            return (Criteria) this;
        }

        public Criteria andImgURLLessThanOrEqualTo(String value) {
            addCriterion("imgURL <=", value, "imgURL");
            return (Criteria) this;
        }

        public Criteria andImgURLLike(String value) {
            addCriterion("imgURL like", value, "imgURL");
            return (Criteria) this;
        }

        public Criteria andImgURLNotLike(String value) {
            addCriterion("imgURL not like", value, "imgURL");
            return (Criteria) this;
        }

        public Criteria andImgURLIn(List<String> values) {
            addCriterion("imgURL in", values, "imgURL");
            return (Criteria) this;
        }

        public Criteria andImgURLNotIn(List<String> values) {
            addCriterion("imgURL not in", values, "imgURL");
            return (Criteria) this;
        }

        public Criteria andImgURLBetween(String value1, String value2) {
            addCriterion("imgURL between", value1, value2, "imgURL");
            return (Criteria) this;
        }

        public Criteria andImgURLNotBetween(String value1, String value2) {
            addCriterion("imgURL not between", value1, value2, "imgURL");
            return (Criteria) this;
        }

        public Criteria andStartSecondsIsNull() {
            addCriterion("startSeconds is null");
            return (Criteria) this;
        }

        public Criteria andStartSecondsIsNotNull() {
            addCriterion("startSeconds is not null");
            return (Criteria) this;
        }

        public Criteria andStartSecondsEqualTo(Integer value) {
            addCriterion("startSeconds =", value, "startSeconds");
            return (Criteria) this;
        }

        public Criteria andStartSecondsNotEqualTo(Integer value) {
            addCriterion("startSeconds <>", value, "startSeconds");
            return (Criteria) this;
        }

        public Criteria andStartSecondsGreaterThan(Integer value) {
            addCriterion("startSeconds >", value, "startSeconds");
            return (Criteria) this;
        }

        public Criteria andStartSecondsGreaterThanOrEqualTo(Integer value) {
            addCriterion("startSeconds >=", value, "startSeconds");
            return (Criteria) this;
        }

        public Criteria andStartSecondsLessThan(Integer value) {
            addCriterion("startSeconds <", value, "startSeconds");
            return (Criteria) this;
        }

        public Criteria andStartSecondsLessThanOrEqualTo(Integer value) {
            addCriterion("startSeconds <=", value, "startSeconds");
            return (Criteria) this;
        }

        public Criteria andStartSecondsIn(List<Integer> values) {
            addCriterion("startSeconds in", values, "startSeconds");
            return (Criteria) this;
        }

        public Criteria andStartSecondsNotIn(List<Integer> values) {
            addCriterion("startSeconds not in", values, "startSeconds");
            return (Criteria) this;
        }

        public Criteria andStartSecondsBetween(Integer value1, Integer value2) {
            addCriterion("startSeconds between", value1, value2, "startSeconds");
            return (Criteria) this;
        }

        public Criteria andStartSecondsNotBetween(Integer value1, Integer value2) {
            addCriterion("startSeconds not between", value1, value2, "startSeconds");
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