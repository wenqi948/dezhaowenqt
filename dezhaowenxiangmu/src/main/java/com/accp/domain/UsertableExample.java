package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class UsertableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsertableExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsnameIsNull() {
            addCriterion("usname is null");
            return (Criteria) this;
        }

        public Criteria andUsnameIsNotNull() {
            addCriterion("usname is not null");
            return (Criteria) this;
        }

        public Criteria andUsnameEqualTo(String value) {
            addCriterion("usname =", value, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameNotEqualTo(String value) {
            addCriterion("usname <>", value, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameGreaterThan(String value) {
            addCriterion("usname >", value, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameGreaterThanOrEqualTo(String value) {
            addCriterion("usname >=", value, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameLessThan(String value) {
            addCriterion("usname <", value, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameLessThanOrEqualTo(String value) {
            addCriterion("usname <=", value, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameLike(String value) {
            addCriterion("usname like", value, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameNotLike(String value) {
            addCriterion("usname not like", value, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameIn(List<String> values) {
            addCriterion("usname in", values, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameNotIn(List<String> values) {
            addCriterion("usname not in", values, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameBetween(String value1, String value2) {
            addCriterion("usname between", value1, value2, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameNotBetween(String value1, String value2) {
            addCriterion("usname not between", value1, value2, "usname");
            return (Criteria) this;
        }

        public Criteria andUspwdIsNull() {
            addCriterion("uspwd is null");
            return (Criteria) this;
        }

        public Criteria andUspwdIsNotNull() {
            addCriterion("uspwd is not null");
            return (Criteria) this;
        }

        public Criteria andUspwdEqualTo(String value) {
            addCriterion("uspwd =", value, "uspwd");
            return (Criteria) this;
        }

        public Criteria andUspwdNotEqualTo(String value) {
            addCriterion("uspwd <>", value, "uspwd");
            return (Criteria) this;
        }

        public Criteria andUspwdGreaterThan(String value) {
            addCriterion("uspwd >", value, "uspwd");
            return (Criteria) this;
        }

        public Criteria andUspwdGreaterThanOrEqualTo(String value) {
            addCriterion("uspwd >=", value, "uspwd");
            return (Criteria) this;
        }

        public Criteria andUspwdLessThan(String value) {
            addCriterion("uspwd <", value, "uspwd");
            return (Criteria) this;
        }

        public Criteria andUspwdLessThanOrEqualTo(String value) {
            addCriterion("uspwd <=", value, "uspwd");
            return (Criteria) this;
        }

        public Criteria andUspwdLike(String value) {
            addCriterion("uspwd like", value, "uspwd");
            return (Criteria) this;
        }

        public Criteria andUspwdNotLike(String value) {
            addCriterion("uspwd not like", value, "uspwd");
            return (Criteria) this;
        }

        public Criteria andUspwdIn(List<String> values) {
            addCriterion("uspwd in", values, "uspwd");
            return (Criteria) this;
        }

        public Criteria andUspwdNotIn(List<String> values) {
            addCriterion("uspwd not in", values, "uspwd");
            return (Criteria) this;
        }

        public Criteria andUspwdBetween(String value1, String value2) {
            addCriterion("uspwd between", value1, value2, "uspwd");
            return (Criteria) this;
        }

        public Criteria andUspwdNotBetween(String value1, String value2) {
            addCriterion("uspwd not between", value1, value2, "uspwd");
            return (Criteria) this;
        }

        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Integer value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Integer value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Integer value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Integer value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Integer value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Integer> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Integer> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Integer value1, Integer value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Integer value1, Integer value2) {
            addCriterion("rid not between", value1, value2, "rid");
            return (Criteria) this;
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