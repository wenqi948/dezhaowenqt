package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class StoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreExample() {
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

        public Criteria andStoreidIsNull() {
            addCriterion("storeid is null");
            return (Criteria) this;
        }

        public Criteria andStoreidIsNotNull() {
            addCriterion("storeid is not null");
            return (Criteria) this;
        }

        public Criteria andStoreidEqualTo(String value) {
            addCriterion("storeid =", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotEqualTo(String value) {
            addCriterion("storeid <>", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidGreaterThan(String value) {
            addCriterion("storeid >", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidGreaterThanOrEqualTo(String value) {
            addCriterion("storeid >=", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLessThan(String value) {
            addCriterion("storeid <", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLessThanOrEqualTo(String value) {
            addCriterion("storeid <=", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLike(String value) {
            addCriterion("storeid like", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotLike(String value) {
            addCriterion("storeid not like", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidIn(List<String> values) {
            addCriterion("storeid in", values, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotIn(List<String> values) {
            addCriterion("storeid not in", values, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidBetween(String value1, String value2) {
            addCriterion("storeid between", value1, value2, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotBetween(String value1, String value2) {
            addCriterion("storeid not between", value1, value2, "storeid");
            return (Criteria) this;
        }

        public Criteria andStorenamesIsNull() {
            addCriterion("storenames is null");
            return (Criteria) this;
        }

        public Criteria andStorenamesIsNotNull() {
            addCriterion("storenames is not null");
            return (Criteria) this;
        }

        public Criteria andStorenamesEqualTo(String value) {
            addCriterion("storenames =", value, "storenames");
            return (Criteria) this;
        }

        public Criteria andStorenamesNotEqualTo(String value) {
            addCriterion("storenames <>", value, "storenames");
            return (Criteria) this;
        }

        public Criteria andStorenamesGreaterThan(String value) {
            addCriterion("storenames >", value, "storenames");
            return (Criteria) this;
        }

        public Criteria andStorenamesGreaterThanOrEqualTo(String value) {
            addCriterion("storenames >=", value, "storenames");
            return (Criteria) this;
        }

        public Criteria andStorenamesLessThan(String value) {
            addCriterion("storenames <", value, "storenames");
            return (Criteria) this;
        }

        public Criteria andStorenamesLessThanOrEqualTo(String value) {
            addCriterion("storenames <=", value, "storenames");
            return (Criteria) this;
        }

        public Criteria andStorenamesLike(String value) {
            addCriterion("storenames like", value, "storenames");
            return (Criteria) this;
        }

        public Criteria andStorenamesNotLike(String value) {
            addCriterion("storenames not like", value, "storenames");
            return (Criteria) this;
        }

        public Criteria andStorenamesIn(List<String> values) {
            addCriterion("storenames in", values, "storenames");
            return (Criteria) this;
        }

        public Criteria andStorenamesNotIn(List<String> values) {
            addCriterion("storenames not in", values, "storenames");
            return (Criteria) this;
        }

        public Criteria andStorenamesBetween(String value1, String value2) {
            addCriterion("storenames between", value1, value2, "storenames");
            return (Criteria) this;
        }

        public Criteria andStorenamesNotBetween(String value1, String value2) {
            addCriterion("storenames not between", value1, value2, "storenames");
            return (Criteria) this;
        }

        public Criteria andClicityIsNull() {
            addCriterion("clicity is null");
            return (Criteria) this;
        }

        public Criteria andClicityIsNotNull() {
            addCriterion("clicity is not null");
            return (Criteria) this;
        }

        public Criteria andClicityEqualTo(String value) {
            addCriterion("clicity =", value, "clicity");
            return (Criteria) this;
        }

        public Criteria andClicityNotEqualTo(String value) {
            addCriterion("clicity <>", value, "clicity");
            return (Criteria) this;
        }

        public Criteria andClicityGreaterThan(String value) {
            addCriterion("clicity >", value, "clicity");
            return (Criteria) this;
        }

        public Criteria andClicityGreaterThanOrEqualTo(String value) {
            addCriterion("clicity >=", value, "clicity");
            return (Criteria) this;
        }

        public Criteria andClicityLessThan(String value) {
            addCriterion("clicity <", value, "clicity");
            return (Criteria) this;
        }

        public Criteria andClicityLessThanOrEqualTo(String value) {
            addCriterion("clicity <=", value, "clicity");
            return (Criteria) this;
        }

        public Criteria andClicityLike(String value) {
            addCriterion("clicity like", value, "clicity");
            return (Criteria) this;
        }

        public Criteria andClicityNotLike(String value) {
            addCriterion("clicity not like", value, "clicity");
            return (Criteria) this;
        }

        public Criteria andClicityIn(List<String> values) {
            addCriterion("clicity in", values, "clicity");
            return (Criteria) this;
        }

        public Criteria andClicityNotIn(List<String> values) {
            addCriterion("clicity not in", values, "clicity");
            return (Criteria) this;
        }

        public Criteria andClicityBetween(String value1, String value2) {
            addCriterion("clicity between", value1, value2, "clicity");
            return (Criteria) this;
        }

        public Criteria andClicityNotBetween(String value1, String value2) {
            addCriterion("clicity not between", value1, value2, "clicity");
            return (Criteria) this;
        }

        public Criteria andStoreaddressIsNull() {
            addCriterion("storeaddress is null");
            return (Criteria) this;
        }

        public Criteria andStoreaddressIsNotNull() {
            addCriterion("storeaddress is not null");
            return (Criteria) this;
        }

        public Criteria andStoreaddressEqualTo(String value) {
            addCriterion("storeaddress =", value, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoreaddressNotEqualTo(String value) {
            addCriterion("storeaddress <>", value, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoreaddressGreaterThan(String value) {
            addCriterion("storeaddress >", value, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoreaddressGreaterThanOrEqualTo(String value) {
            addCriterion("storeaddress >=", value, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoreaddressLessThan(String value) {
            addCriterion("storeaddress <", value, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoreaddressLessThanOrEqualTo(String value) {
            addCriterion("storeaddress <=", value, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoreaddressLike(String value) {
            addCriterion("storeaddress like", value, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoreaddressNotLike(String value) {
            addCriterion("storeaddress not like", value, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoreaddressIn(List<String> values) {
            addCriterion("storeaddress in", values, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoreaddressNotIn(List<String> values) {
            addCriterion("storeaddress not in", values, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoreaddressBetween(String value1, String value2) {
            addCriterion("storeaddress between", value1, value2, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoreaddressNotBetween(String value1, String value2) {
            addCriterion("storeaddress not between", value1, value2, "storeaddress");
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