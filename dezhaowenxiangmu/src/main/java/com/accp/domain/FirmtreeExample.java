package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class FirmtreeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FirmtreeExample() {
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

        public Criteria andCitytreeidIsNull() {
            addCriterion("citytreeid is null");
            return (Criteria) this;
        }

        public Criteria andCitytreeidIsNotNull() {
            addCriterion("citytreeid is not null");
            return (Criteria) this;
        }

        public Criteria andCitytreeidEqualTo(Integer value) {
            addCriterion("citytreeid =", value, "citytreeid");
            return (Criteria) this;
        }

        public Criteria andCitytreeidNotEqualTo(Integer value) {
            addCriterion("citytreeid <>", value, "citytreeid");
            return (Criteria) this;
        }

        public Criteria andCitytreeidGreaterThan(Integer value) {
            addCriterion("citytreeid >", value, "citytreeid");
            return (Criteria) this;
        }

        public Criteria andCitytreeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("citytreeid >=", value, "citytreeid");
            return (Criteria) this;
        }

        public Criteria andCitytreeidLessThan(Integer value) {
            addCriterion("citytreeid <", value, "citytreeid");
            return (Criteria) this;
        }

        public Criteria andCitytreeidLessThanOrEqualTo(Integer value) {
            addCriterion("citytreeid <=", value, "citytreeid");
            return (Criteria) this;
        }

        public Criteria andCitytreeidIn(List<Integer> values) {
            addCriterion("citytreeid in", values, "citytreeid");
            return (Criteria) this;
        }

        public Criteria andCitytreeidNotIn(List<Integer> values) {
            addCriterion("citytreeid not in", values, "citytreeid");
            return (Criteria) this;
        }

        public Criteria andCitytreeidBetween(Integer value1, Integer value2) {
            addCriterion("citytreeid between", value1, value2, "citytreeid");
            return (Criteria) this;
        }

        public Criteria andCitytreeidNotBetween(Integer value1, Integer value2) {
            addCriterion("citytreeid not between", value1, value2, "citytreeid");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNull() {
            addCriterion("cityname is null");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNotNull() {
            addCriterion("cityname is not null");
            return (Criteria) this;
        }

        public Criteria andCitynameEqualTo(String value) {
            addCriterion("cityname =", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotEqualTo(String value) {
            addCriterion("cityname <>", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThan(String value) {
            addCriterion("cityname >", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThanOrEqualTo(String value) {
            addCriterion("cityname >=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThan(String value) {
            addCriterion("cityname <", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThanOrEqualTo(String value) {
            addCriterion("cityname <=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLike(String value) {
            addCriterion("cityname like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotLike(String value) {
            addCriterion("cityname not like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameIn(List<String> values) {
            addCriterion("cityname in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotIn(List<String> values) {
            addCriterion("cityname not in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameBetween(String value1, String value2) {
            addCriterion("cityname between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotBetween(String value1, String value2) {
            addCriterion("cityname not between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentid is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentid is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Integer value) {
            addCriterion("parentid =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Integer value) {
            addCriterion("parentid <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Integer value) {
            addCriterion("parentid >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentid >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Integer value) {
            addCriterion("parentid <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Integer value) {
            addCriterion("parentid <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Integer> values) {
            addCriterion("parentid in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Integer> values) {
            addCriterion("parentid not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Integer value1, Integer value2) {
            addCriterion("parentid between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("parentid not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andBiaoshiidIsNull() {
            addCriterion("biaoshiid is null");
            return (Criteria) this;
        }

        public Criteria andBiaoshiidIsNotNull() {
            addCriterion("biaoshiid is not null");
            return (Criteria) this;
        }

        public Criteria andBiaoshiidEqualTo(Integer value) {
            addCriterion("biaoshiid =", value, "biaoshiid");
            return (Criteria) this;
        }

        public Criteria andBiaoshiidNotEqualTo(Integer value) {
            addCriterion("biaoshiid <>", value, "biaoshiid");
            return (Criteria) this;
        }

        public Criteria andBiaoshiidGreaterThan(Integer value) {
            addCriterion("biaoshiid >", value, "biaoshiid");
            return (Criteria) this;
        }

        public Criteria andBiaoshiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("biaoshiid >=", value, "biaoshiid");
            return (Criteria) this;
        }

        public Criteria andBiaoshiidLessThan(Integer value) {
            addCriterion("biaoshiid <", value, "biaoshiid");
            return (Criteria) this;
        }

        public Criteria andBiaoshiidLessThanOrEqualTo(Integer value) {
            addCriterion("biaoshiid <=", value, "biaoshiid");
            return (Criteria) this;
        }

        public Criteria andBiaoshiidIn(List<Integer> values) {
            addCriterion("biaoshiid in", values, "biaoshiid");
            return (Criteria) this;
        }

        public Criteria andBiaoshiidNotIn(List<Integer> values) {
            addCriterion("biaoshiid not in", values, "biaoshiid");
            return (Criteria) this;
        }

        public Criteria andBiaoshiidBetween(Integer value1, Integer value2) {
            addCriterion("biaoshiid between", value1, value2, "biaoshiid");
            return (Criteria) this;
        }

        public Criteria andBiaoshiidNotBetween(Integer value1, Integer value2) {
            addCriterion("biaoshiid not between", value1, value2, "biaoshiid");
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