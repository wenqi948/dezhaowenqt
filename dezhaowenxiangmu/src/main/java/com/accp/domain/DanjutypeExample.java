package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class DanjutypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DanjutypeExample() {
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

        public Criteria andDjuidIsNull() {
            addCriterion("djuid is null");
            return (Criteria) this;
        }

        public Criteria andDjuidIsNotNull() {
            addCriterion("djuid is not null");
            return (Criteria) this;
        }

        public Criteria andDjuidEqualTo(Integer value) {
            addCriterion("djuid =", value, "djuid");
            return (Criteria) this;
        }

        public Criteria andDjuidNotEqualTo(Integer value) {
            addCriterion("djuid <>", value, "djuid");
            return (Criteria) this;
        }

        public Criteria andDjuidGreaterThan(Integer value) {
            addCriterion("djuid >", value, "djuid");
            return (Criteria) this;
        }

        public Criteria andDjuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("djuid >=", value, "djuid");
            return (Criteria) this;
        }

        public Criteria andDjuidLessThan(Integer value) {
            addCriterion("djuid <", value, "djuid");
            return (Criteria) this;
        }

        public Criteria andDjuidLessThanOrEqualTo(Integer value) {
            addCriterion("djuid <=", value, "djuid");
            return (Criteria) this;
        }

        public Criteria andDjuidIn(List<Integer> values) {
            addCriterion("djuid in", values, "djuid");
            return (Criteria) this;
        }

        public Criteria andDjuidNotIn(List<Integer> values) {
            addCriterion("djuid not in", values, "djuid");
            return (Criteria) this;
        }

        public Criteria andDjuidBetween(Integer value1, Integer value2) {
            addCriterion("djuid between", value1, value2, "djuid");
            return (Criteria) this;
        }

        public Criteria andDjuidNotBetween(Integer value1, Integer value2) {
            addCriterion("djuid not between", value1, value2, "djuid");
            return (Criteria) this;
        }

        public Criteria andDjutypeIsNull() {
            addCriterion("djutype is null");
            return (Criteria) this;
        }

        public Criteria andDjutypeIsNotNull() {
            addCriterion("djutype is not null");
            return (Criteria) this;
        }

        public Criteria andDjutypeEqualTo(String value) {
            addCriterion("djutype =", value, "djutype");
            return (Criteria) this;
        }

        public Criteria andDjutypeNotEqualTo(String value) {
            addCriterion("djutype <>", value, "djutype");
            return (Criteria) this;
        }

        public Criteria andDjutypeGreaterThan(String value) {
            addCriterion("djutype >", value, "djutype");
            return (Criteria) this;
        }

        public Criteria andDjutypeGreaterThanOrEqualTo(String value) {
            addCriterion("djutype >=", value, "djutype");
            return (Criteria) this;
        }

        public Criteria andDjutypeLessThan(String value) {
            addCriterion("djutype <", value, "djutype");
            return (Criteria) this;
        }

        public Criteria andDjutypeLessThanOrEqualTo(String value) {
            addCriterion("djutype <=", value, "djutype");
            return (Criteria) this;
        }

        public Criteria andDjutypeLike(String value) {
            addCriterion("djutype like", value, "djutype");
            return (Criteria) this;
        }

        public Criteria andDjutypeNotLike(String value) {
            addCriterion("djutype not like", value, "djutype");
            return (Criteria) this;
        }

        public Criteria andDjutypeIn(List<String> values) {
            addCriterion("djutype in", values, "djutype");
            return (Criteria) this;
        }

        public Criteria andDjutypeNotIn(List<String> values) {
            addCriterion("djutype not in", values, "djutype");
            return (Criteria) this;
        }

        public Criteria andDjutypeBetween(String value1, String value2) {
            addCriterion("djutype between", value1, value2, "djutype");
            return (Criteria) this;
        }

        public Criteria andDjutypeNotBetween(String value1, String value2) {
            addCriterion("djutype not between", value1, value2, "djutype");
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