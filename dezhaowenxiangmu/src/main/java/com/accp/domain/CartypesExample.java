package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class CartypesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CartypesExample() {
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

        public Criteria andCtsidIsNull() {
            addCriterion("ctsid is null");
            return (Criteria) this;
        }

        public Criteria andCtsidIsNotNull() {
            addCriterion("ctsid is not null");
            return (Criteria) this;
        }

        public Criteria andCtsidEqualTo(Integer value) {
            addCriterion("ctsid =", value, "ctsid");
            return (Criteria) this;
        }

        public Criteria andCtsidNotEqualTo(Integer value) {
            addCriterion("ctsid <>", value, "ctsid");
            return (Criteria) this;
        }

        public Criteria andCtsidGreaterThan(Integer value) {
            addCriterion("ctsid >", value, "ctsid");
            return (Criteria) this;
        }

        public Criteria andCtsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ctsid >=", value, "ctsid");
            return (Criteria) this;
        }

        public Criteria andCtsidLessThan(Integer value) {
            addCriterion("ctsid <", value, "ctsid");
            return (Criteria) this;
        }

        public Criteria andCtsidLessThanOrEqualTo(Integer value) {
            addCriterion("ctsid <=", value, "ctsid");
            return (Criteria) this;
        }

        public Criteria andCtsidIn(List<Integer> values) {
            addCriterion("ctsid in", values, "ctsid");
            return (Criteria) this;
        }

        public Criteria andCtsidNotIn(List<Integer> values) {
            addCriterion("ctsid not in", values, "ctsid");
            return (Criteria) this;
        }

        public Criteria andCtsidBetween(Integer value1, Integer value2) {
            addCriterion("ctsid between", value1, value2, "ctsid");
            return (Criteria) this;
        }

        public Criteria andCtsidNotBetween(Integer value1, Integer value2) {
            addCriterion("ctsid not between", value1, value2, "ctsid");
            return (Criteria) this;
        }

        public Criteria andCtsnamesIsNull() {
            addCriterion("ctsnames is null");
            return (Criteria) this;
        }

        public Criteria andCtsnamesIsNotNull() {
            addCriterion("ctsnames is not null");
            return (Criteria) this;
        }

        public Criteria andCtsnamesEqualTo(String value) {
            addCriterion("ctsnames =", value, "ctsnames");
            return (Criteria) this;
        }

        public Criteria andCtsnamesNotEqualTo(String value) {
            addCriterion("ctsnames <>", value, "ctsnames");
            return (Criteria) this;
        }

        public Criteria andCtsnamesGreaterThan(String value) {
            addCriterion("ctsnames >", value, "ctsnames");
            return (Criteria) this;
        }

        public Criteria andCtsnamesGreaterThanOrEqualTo(String value) {
            addCriterion("ctsnames >=", value, "ctsnames");
            return (Criteria) this;
        }

        public Criteria andCtsnamesLessThan(String value) {
            addCriterion("ctsnames <", value, "ctsnames");
            return (Criteria) this;
        }

        public Criteria andCtsnamesLessThanOrEqualTo(String value) {
            addCriterion("ctsnames <=", value, "ctsnames");
            return (Criteria) this;
        }

        public Criteria andCtsnamesLike(String value) {
            addCriterion("ctsnames like", value, "ctsnames");
            return (Criteria) this;
        }

        public Criteria andCtsnamesNotLike(String value) {
            addCriterion("ctsnames not like", value, "ctsnames");
            return (Criteria) this;
        }

        public Criteria andCtsnamesIn(List<String> values) {
            addCriterion("ctsnames in", values, "ctsnames");
            return (Criteria) this;
        }

        public Criteria andCtsnamesNotIn(List<String> values) {
            addCriterion("ctsnames not in", values, "ctsnames");
            return (Criteria) this;
        }

        public Criteria andCtsnamesBetween(String value1, String value2) {
            addCriterion("ctsnames between", value1, value2, "ctsnames");
            return (Criteria) this;
        }

        public Criteria andCtsnamesNotBetween(String value1, String value2) {
            addCriterion("ctsnames not between", value1, value2, "ctsnames");
            return (Criteria) this;
        }

        public Criteria andCartypeszmIsNull() {
            addCriterion("cartypeszm is null");
            return (Criteria) this;
        }

        public Criteria andCartypeszmIsNotNull() {
            addCriterion("cartypeszm is not null");
            return (Criteria) this;
        }

        public Criteria andCartypeszmEqualTo(String value) {
            addCriterion("cartypeszm =", value, "cartypeszm");
            return (Criteria) this;
        }

        public Criteria andCartypeszmNotEqualTo(String value) {
            addCriterion("cartypeszm <>", value, "cartypeszm");
            return (Criteria) this;
        }

        public Criteria andCartypeszmGreaterThan(String value) {
            addCriterion("cartypeszm >", value, "cartypeszm");
            return (Criteria) this;
        }

        public Criteria andCartypeszmGreaterThanOrEqualTo(String value) {
            addCriterion("cartypeszm >=", value, "cartypeszm");
            return (Criteria) this;
        }

        public Criteria andCartypeszmLessThan(String value) {
            addCriterion("cartypeszm <", value, "cartypeszm");
            return (Criteria) this;
        }

        public Criteria andCartypeszmLessThanOrEqualTo(String value) {
            addCriterion("cartypeszm <=", value, "cartypeszm");
            return (Criteria) this;
        }

        public Criteria andCartypeszmLike(String value) {
            addCriterion("cartypeszm like", value, "cartypeszm");
            return (Criteria) this;
        }

        public Criteria andCartypeszmNotLike(String value) {
            addCriterion("cartypeszm not like", value, "cartypeszm");
            return (Criteria) this;
        }

        public Criteria andCartypeszmIn(List<String> values) {
            addCriterion("cartypeszm in", values, "cartypeszm");
            return (Criteria) this;
        }

        public Criteria andCartypeszmNotIn(List<String> values) {
            addCriterion("cartypeszm not in", values, "cartypeszm");
            return (Criteria) this;
        }

        public Criteria andCartypeszmBetween(String value1, String value2) {
            addCriterion("cartypeszm between", value1, value2, "cartypeszm");
            return (Criteria) this;
        }

        public Criteria andCartypeszmNotBetween(String value1, String value2) {
            addCriterion("cartypeszm not between", value1, value2, "cartypeszm");
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