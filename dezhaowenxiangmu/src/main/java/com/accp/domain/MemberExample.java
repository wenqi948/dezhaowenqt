package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMembernameIsNull() {
            addCriterion("membername is null");
            return (Criteria) this;
        }

        public Criteria andMembernameIsNotNull() {
            addCriterion("membername is not null");
            return (Criteria) this;
        }

        public Criteria andMembernameEqualTo(String value) {
            addCriterion("membername =", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameNotEqualTo(String value) {
            addCriterion("membername <>", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameGreaterThan(String value) {
            addCriterion("membername >", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameGreaterThanOrEqualTo(String value) {
            addCriterion("membername >=", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameLessThan(String value) {
            addCriterion("membername <", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameLessThanOrEqualTo(String value) {
            addCriterion("membername <=", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameLike(String value) {
            addCriterion("membername like", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameNotLike(String value) {
            addCriterion("membername not like", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameIn(List<String> values) {
            addCriterion("membername in", values, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameNotIn(List<String> values) {
            addCriterion("membername not in", values, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameBetween(String value1, String value2) {
            addCriterion("membername between", value1, value2, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameNotBetween(String value1, String value2) {
            addCriterion("membername not between", value1, value2, "membername");
            return (Criteria) this;
        }

        public Criteria andBaifbIsNull() {
            addCriterion("baifb is null");
            return (Criteria) this;
        }

        public Criteria andBaifbIsNotNull() {
            addCriterion("baifb is not null");
            return (Criteria) this;
        }

        public Criteria andBaifbEqualTo(Float value) {
            addCriterion("baifb =", value, "baifb");
            return (Criteria) this;
        }

        public Criteria andBaifbNotEqualTo(Float value) {
            addCriterion("baifb <>", value, "baifb");
            return (Criteria) this;
        }

        public Criteria andBaifbGreaterThan(Float value) {
            addCriterion("baifb >", value, "baifb");
            return (Criteria) this;
        }

        public Criteria andBaifbGreaterThanOrEqualTo(Float value) {
            addCriterion("baifb >=", value, "baifb");
            return (Criteria) this;
        }

        public Criteria andBaifbLessThan(Float value) {
            addCriterion("baifb <", value, "baifb");
            return (Criteria) this;
        }

        public Criteria andBaifbLessThanOrEqualTo(Float value) {
            addCriterion("baifb <=", value, "baifb");
            return (Criteria) this;
        }

        public Criteria andBaifbIn(List<Float> values) {
            addCriterion("baifb in", values, "baifb");
            return (Criteria) this;
        }

        public Criteria andBaifbNotIn(List<Float> values) {
            addCriterion("baifb not in", values, "baifb");
            return (Criteria) this;
        }

        public Criteria andBaifbBetween(Float value1, Float value2) {
            addCriterion("baifb between", value1, value2, "baifb");
            return (Criteria) this;
        }

        public Criteria andBaifbNotBetween(Float value1, Float value2) {
            addCriterion("baifb not between", value1, value2, "baifb");
            return (Criteria) this;
        }

        public Criteria andMemberjfcountIsNull() {
            addCriterion("memberjfcount is null");
            return (Criteria) this;
        }

        public Criteria andMemberjfcountIsNotNull() {
            addCriterion("memberjfcount is not null");
            return (Criteria) this;
        }

        public Criteria andMemberjfcountEqualTo(Float value) {
            addCriterion("memberjfcount =", value, "memberjfcount");
            return (Criteria) this;
        }

        public Criteria andMemberjfcountNotEqualTo(Float value) {
            addCriterion("memberjfcount <>", value, "memberjfcount");
            return (Criteria) this;
        }

        public Criteria andMemberjfcountGreaterThan(Float value) {
            addCriterion("memberjfcount >", value, "memberjfcount");
            return (Criteria) this;
        }

        public Criteria andMemberjfcountGreaterThanOrEqualTo(Float value) {
            addCriterion("memberjfcount >=", value, "memberjfcount");
            return (Criteria) this;
        }

        public Criteria andMemberjfcountLessThan(Float value) {
            addCriterion("memberjfcount <", value, "memberjfcount");
            return (Criteria) this;
        }

        public Criteria andMemberjfcountLessThanOrEqualTo(Float value) {
            addCriterion("memberjfcount <=", value, "memberjfcount");
            return (Criteria) this;
        }

        public Criteria andMemberjfcountIn(List<Float> values) {
            addCriterion("memberjfcount in", values, "memberjfcount");
            return (Criteria) this;
        }

        public Criteria andMemberjfcountNotIn(List<Float> values) {
            addCriterion("memberjfcount not in", values, "memberjfcount");
            return (Criteria) this;
        }

        public Criteria andMemberjfcountBetween(Float value1, Float value2) {
            addCriterion("memberjfcount between", value1, value2, "memberjfcount");
            return (Criteria) this;
        }

        public Criteria andMemberjfcountNotBetween(Float value1, Float value2) {
            addCriterion("memberjfcount not between", value1, value2, "memberjfcount");
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