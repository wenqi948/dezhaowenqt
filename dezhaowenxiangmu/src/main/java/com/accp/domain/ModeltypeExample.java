package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ModeltypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ModeltypeExample() {
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

        public Criteria andCartypeidIsNull() {
            addCriterion("cartypeid is null");
            return (Criteria) this;
        }

        public Criteria andCartypeidIsNotNull() {
            addCriterion("cartypeid is not null");
            return (Criteria) this;
        }

        public Criteria andCartypeidEqualTo(String value) {
            addCriterion("cartypeid =", value, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidNotEqualTo(String value) {
            addCriterion("cartypeid <>", value, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidGreaterThan(String value) {
            addCriterion("cartypeid >", value, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidGreaterThanOrEqualTo(String value) {
            addCriterion("cartypeid >=", value, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidLessThan(String value) {
            addCriterion("cartypeid <", value, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidLessThanOrEqualTo(String value) {
            addCriterion("cartypeid <=", value, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidLike(String value) {
            addCriterion("cartypeid like", value, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidNotLike(String value) {
            addCriterion("cartypeid not like", value, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidIn(List<String> values) {
            addCriterion("cartypeid in", values, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidNotIn(List<String> values) {
            addCriterion("cartypeid not in", values, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidBetween(String value1, String value2) {
            addCriterion("cartypeid between", value1, value2, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidNotBetween(String value1, String value2) {
            addCriterion("cartypeid not between", value1, value2, "cartypeid");
            return (Criteria) this;
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

        public Criteria andCartypenameIsNull() {
            addCriterion("cartypename is null");
            return (Criteria) this;
        }

        public Criteria andCartypenameIsNotNull() {
            addCriterion("cartypename is not null");
            return (Criteria) this;
        }

        public Criteria andCartypenameEqualTo(String value) {
            addCriterion("cartypename =", value, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCartypenameNotEqualTo(String value) {
            addCriterion("cartypename <>", value, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCartypenameGreaterThan(String value) {
            addCriterion("cartypename >", value, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCartypenameGreaterThanOrEqualTo(String value) {
            addCriterion("cartypename >=", value, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCartypenameLessThan(String value) {
            addCriterion("cartypename <", value, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCartypenameLessThanOrEqualTo(String value) {
            addCriterion("cartypename <=", value, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCartypenameLike(String value) {
            addCriterion("cartypename like", value, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCartypenameNotLike(String value) {
            addCriterion("cartypename not like", value, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCartypenameIn(List<String> values) {
            addCriterion("cartypename in", values, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCartypenameNotIn(List<String> values) {
            addCriterion("cartypename not in", values, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCartypenameBetween(String value1, String value2) {
            addCriterion("cartypename between", value1, value2, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCartypenameNotBetween(String value1, String value2) {
            addCriterion("cartypename not between", value1, value2, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCkpriceIsNull() {
            addCriterion("ckprice is null");
            return (Criteria) this;
        }

        public Criteria andCkpriceIsNotNull() {
            addCriterion("ckprice is not null");
            return (Criteria) this;
        }

        public Criteria andCkpriceEqualTo(Float value) {
            addCriterion("ckprice =", value, "ckprice");
            return (Criteria) this;
        }

        public Criteria andCkpriceNotEqualTo(Float value) {
            addCriterion("ckprice <>", value, "ckprice");
            return (Criteria) this;
        }

        public Criteria andCkpriceGreaterThan(Float value) {
            addCriterion("ckprice >", value, "ckprice");
            return (Criteria) this;
        }

        public Criteria andCkpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("ckprice >=", value, "ckprice");
            return (Criteria) this;
        }

        public Criteria andCkpriceLessThan(Float value) {
            addCriterion("ckprice <", value, "ckprice");
            return (Criteria) this;
        }

        public Criteria andCkpriceLessThanOrEqualTo(Float value) {
            addCriterion("ckprice <=", value, "ckprice");
            return (Criteria) this;
        }

        public Criteria andCkpriceIn(List<Float> values) {
            addCriterion("ckprice in", values, "ckprice");
            return (Criteria) this;
        }

        public Criteria andCkpriceNotIn(List<Float> values) {
            addCriterion("ckprice not in", values, "ckprice");
            return (Criteria) this;
        }

        public Criteria andCkpriceBetween(Float value1, Float value2) {
            addCriterion("ckprice between", value1, value2, "ckprice");
            return (Criteria) this;
        }

        public Criteria andCkpriceNotBetween(Float value1, Float value2) {
            addCriterion("ckprice not between", value1, value2, "ckprice");
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