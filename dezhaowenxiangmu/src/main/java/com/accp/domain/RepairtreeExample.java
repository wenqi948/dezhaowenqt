package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class RepairtreeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepairtreeExample() {
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

        public Criteria andXtypeIsNull() {
            addCriterion("xtype is null");
            return (Criteria) this;
        }

        public Criteria andXtypeIsNotNull() {
            addCriterion("xtype is not null");
            return (Criteria) this;
        }

        public Criteria andXtypeEqualTo(Integer value) {
            addCriterion("xtype =", value, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeNotEqualTo(Integer value) {
            addCriterion("xtype <>", value, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeGreaterThan(Integer value) {
            addCriterion("xtype >", value, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("xtype >=", value, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeLessThan(Integer value) {
            addCriterion("xtype <", value, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeLessThanOrEqualTo(Integer value) {
            addCriterion("xtype <=", value, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeIn(List<Integer> values) {
            addCriterion("xtype in", values, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeNotIn(List<Integer> values) {
            addCriterion("xtype not in", values, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeBetween(Integer value1, Integer value2) {
            addCriterion("xtype between", value1, value2, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("xtype not between", value1, value2, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypenameIsNull() {
            addCriterion("xtypename is null");
            return (Criteria) this;
        }

        public Criteria andXtypenameIsNotNull() {
            addCriterion("xtypename is not null");
            return (Criteria) this;
        }

        public Criteria andXtypenameEqualTo(String value) {
            addCriterion("xtypename =", value, "xtypename");
            return (Criteria) this;
        }

        public Criteria andXtypenameNotEqualTo(String value) {
            addCriterion("xtypename <>", value, "xtypename");
            return (Criteria) this;
        }

        public Criteria andXtypenameGreaterThan(String value) {
            addCriterion("xtypename >", value, "xtypename");
            return (Criteria) this;
        }

        public Criteria andXtypenameGreaterThanOrEqualTo(String value) {
            addCriterion("xtypename >=", value, "xtypename");
            return (Criteria) this;
        }

        public Criteria andXtypenameLessThan(String value) {
            addCriterion("xtypename <", value, "xtypename");
            return (Criteria) this;
        }

        public Criteria andXtypenameLessThanOrEqualTo(String value) {
            addCriterion("xtypename <=", value, "xtypename");
            return (Criteria) this;
        }

        public Criteria andXtypenameLike(String value) {
            addCriterion("xtypename like", value, "xtypename");
            return (Criteria) this;
        }

        public Criteria andXtypenameNotLike(String value) {
            addCriterion("xtypename not like", value, "xtypename");
            return (Criteria) this;
        }

        public Criteria andXtypenameIn(List<String> values) {
            addCriterion("xtypename in", values, "xtypename");
            return (Criteria) this;
        }

        public Criteria andXtypenameNotIn(List<String> values) {
            addCriterion("xtypename not in", values, "xtypename");
            return (Criteria) this;
        }

        public Criteria andXtypenameBetween(String value1, String value2) {
            addCriterion("xtypename between", value1, value2, "xtypename");
            return (Criteria) this;
        }

        public Criteria andXtypenameNotBetween(String value1, String value2) {
            addCriterion("xtypename not between", value1, value2, "xtypename");
            return (Criteria) this;
        }

        public Criteria andParentiidIsNull() {
            addCriterion("parentiid is null");
            return (Criteria) this;
        }

        public Criteria andParentiidIsNotNull() {
            addCriterion("parentiid is not null");
            return (Criteria) this;
        }

        public Criteria andParentiidEqualTo(Integer value) {
            addCriterion("parentiid =", value, "parentiid");
            return (Criteria) this;
        }

        public Criteria andParentiidNotEqualTo(Integer value) {
            addCriterion("parentiid <>", value, "parentiid");
            return (Criteria) this;
        }

        public Criteria andParentiidGreaterThan(Integer value) {
            addCriterion("parentiid >", value, "parentiid");
            return (Criteria) this;
        }

        public Criteria andParentiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentiid >=", value, "parentiid");
            return (Criteria) this;
        }

        public Criteria andParentiidLessThan(Integer value) {
            addCriterion("parentiid <", value, "parentiid");
            return (Criteria) this;
        }

        public Criteria andParentiidLessThanOrEqualTo(Integer value) {
            addCriterion("parentiid <=", value, "parentiid");
            return (Criteria) this;
        }

        public Criteria andParentiidIn(List<Integer> values) {
            addCriterion("parentiid in", values, "parentiid");
            return (Criteria) this;
        }

        public Criteria andParentiidNotIn(List<Integer> values) {
            addCriterion("parentiid not in", values, "parentiid");
            return (Criteria) this;
        }

        public Criteria andParentiidBetween(Integer value1, Integer value2) {
            addCriterion("parentiid between", value1, value2, "parentiid");
            return (Criteria) this;
        }

        public Criteria andParentiidNotBetween(Integer value1, Integer value2) {
            addCriterion("parentiid not between", value1, value2, "parentiid");
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