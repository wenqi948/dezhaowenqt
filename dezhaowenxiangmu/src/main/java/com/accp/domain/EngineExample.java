package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class EngineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EngineExample() {
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

        public Criteria andEngineidIsNull() {
            addCriterion("engineid is null");
            return (Criteria) this;
        }

        public Criteria andEngineidIsNotNull() {
            addCriterion("engineid is not null");
            return (Criteria) this;
        }

        public Criteria andEngineidEqualTo(Integer value) {
            addCriterion("engineid =", value, "engineid");
            return (Criteria) this;
        }

        public Criteria andEngineidNotEqualTo(Integer value) {
            addCriterion("engineid <>", value, "engineid");
            return (Criteria) this;
        }

        public Criteria andEngineidGreaterThan(Integer value) {
            addCriterion("engineid >", value, "engineid");
            return (Criteria) this;
        }

        public Criteria andEngineidGreaterThanOrEqualTo(Integer value) {
            addCriterion("engineid >=", value, "engineid");
            return (Criteria) this;
        }

        public Criteria andEngineidLessThan(Integer value) {
            addCriterion("engineid <", value, "engineid");
            return (Criteria) this;
        }

        public Criteria andEngineidLessThanOrEqualTo(Integer value) {
            addCriterion("engineid <=", value, "engineid");
            return (Criteria) this;
        }

        public Criteria andEngineidIn(List<Integer> values) {
            addCriterion("engineid in", values, "engineid");
            return (Criteria) this;
        }

        public Criteria andEngineidNotIn(List<Integer> values) {
            addCriterion("engineid not in", values, "engineid");
            return (Criteria) this;
        }

        public Criteria andEngineidBetween(Integer value1, Integer value2) {
            addCriterion("engineid between", value1, value2, "engineid");
            return (Criteria) this;
        }

        public Criteria andEngineidNotBetween(Integer value1, Integer value2) {
            addCriterion("engineid not between", value1, value2, "engineid");
            return (Criteria) this;
        }

        public Criteria andEnginenameIsNull() {
            addCriterion("enginename is null");
            return (Criteria) this;
        }

        public Criteria andEnginenameIsNotNull() {
            addCriterion("enginename is not null");
            return (Criteria) this;
        }

        public Criteria andEnginenameEqualTo(String value) {
            addCriterion("enginename =", value, "enginename");
            return (Criteria) this;
        }

        public Criteria andEnginenameNotEqualTo(String value) {
            addCriterion("enginename <>", value, "enginename");
            return (Criteria) this;
        }

        public Criteria andEnginenameGreaterThan(String value) {
            addCriterion("enginename >", value, "enginename");
            return (Criteria) this;
        }

        public Criteria andEnginenameGreaterThanOrEqualTo(String value) {
            addCriterion("enginename >=", value, "enginename");
            return (Criteria) this;
        }

        public Criteria andEnginenameLessThan(String value) {
            addCriterion("enginename <", value, "enginename");
            return (Criteria) this;
        }

        public Criteria andEnginenameLessThanOrEqualTo(String value) {
            addCriterion("enginename <=", value, "enginename");
            return (Criteria) this;
        }

        public Criteria andEnginenameLike(String value) {
            addCriterion("enginename like", value, "enginename");
            return (Criteria) this;
        }

        public Criteria andEnginenameNotLike(String value) {
            addCriterion("enginename not like", value, "enginename");
            return (Criteria) this;
        }

        public Criteria andEnginenameIn(List<String> values) {
            addCriterion("enginename in", values, "enginename");
            return (Criteria) this;
        }

        public Criteria andEnginenameNotIn(List<String> values) {
            addCriterion("enginename not in", values, "enginename");
            return (Criteria) this;
        }

        public Criteria andEnginenameBetween(String value1, String value2) {
            addCriterion("enginename between", value1, value2, "enginename");
            return (Criteria) this;
        }

        public Criteria andEnginenameNotBetween(String value1, String value2) {
            addCriterion("enginename not between", value1, value2, "enginename");
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