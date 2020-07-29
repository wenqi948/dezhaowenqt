package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class WxxqdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WxxqdExample() {
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

        public Criteria andWxqidIsNull() {
            addCriterion("wxqid is null");
            return (Criteria) this;
        }

        public Criteria andWxqidIsNotNull() {
            addCriterion("wxqid is not null");
            return (Criteria) this;
        }

        public Criteria andWxqidEqualTo(Integer value) {
            addCriterion("wxqid =", value, "wxqid");
            return (Criteria) this;
        }

        public Criteria andWxqidNotEqualTo(Integer value) {
            addCriterion("wxqid <>", value, "wxqid");
            return (Criteria) this;
        }

        public Criteria andWxqidGreaterThan(Integer value) {
            addCriterion("wxqid >", value, "wxqid");
            return (Criteria) this;
        }

        public Criteria andWxqidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wxqid >=", value, "wxqid");
            return (Criteria) this;
        }

        public Criteria andWxqidLessThan(Integer value) {
            addCriterion("wxqid <", value, "wxqid");
            return (Criteria) this;
        }

        public Criteria andWxqidLessThanOrEqualTo(Integer value) {
            addCriterion("wxqid <=", value, "wxqid");
            return (Criteria) this;
        }

        public Criteria andWxqidIn(List<Integer> values) {
            addCriterion("wxqid in", values, "wxqid");
            return (Criteria) this;
        }

        public Criteria andWxqidNotIn(List<Integer> values) {
            addCriterion("wxqid not in", values, "wxqid");
            return (Criteria) this;
        }

        public Criteria andWxqidBetween(Integer value1, Integer value2) {
            addCriterion("wxqid between", value1, value2, "wxqid");
            return (Criteria) this;
        }

        public Criteria andWxqidNotBetween(Integer value1, Integer value2) {
            addCriterion("wxqid not between", value1, value2, "wxqid");
            return (Criteria) this;
        }

        public Criteria andInsidIsNull() {
            addCriterion("insid is null");
            return (Criteria) this;
        }

        public Criteria andInsidIsNotNull() {
            addCriterion("insid is not null");
            return (Criteria) this;
        }

        public Criteria andInsidEqualTo(Integer value) {
            addCriterion("insid =", value, "insid");
            return (Criteria) this;
        }

        public Criteria andInsidNotEqualTo(Integer value) {
            addCriterion("insid <>", value, "insid");
            return (Criteria) this;
        }

        public Criteria andInsidGreaterThan(Integer value) {
            addCriterion("insid >", value, "insid");
            return (Criteria) this;
        }

        public Criteria andInsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("insid >=", value, "insid");
            return (Criteria) this;
        }

        public Criteria andInsidLessThan(Integer value) {
            addCriterion("insid <", value, "insid");
            return (Criteria) this;
        }

        public Criteria andInsidLessThanOrEqualTo(Integer value) {
            addCriterion("insid <=", value, "insid");
            return (Criteria) this;
        }

        public Criteria andInsidIn(List<Integer> values) {
            addCriterion("insid in", values, "insid");
            return (Criteria) this;
        }

        public Criteria andInsidNotIn(List<Integer> values) {
            addCriterion("insid not in", values, "insid");
            return (Criteria) this;
        }

        public Criteria andInsidBetween(Integer value1, Integer value2) {
            addCriterion("insid between", value1, value2, "insid");
            return (Criteria) this;
        }

        public Criteria andInsidNotBetween(Integer value1, Integer value2) {
            addCriterion("insid not between", value1, value2, "insid");
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

        public Criteria andSumIsNull() {
            addCriterion("sum is null");
            return (Criteria) this;
        }

        public Criteria andSumIsNotNull() {
            addCriterion("sum is not null");
            return (Criteria) this;
        }

        public Criteria andSumEqualTo(Integer value) {
            addCriterion("sum =", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotEqualTo(Integer value) {
            addCriterion("sum <>", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThan(Integer value) {
            addCriterion("sum >", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sum >=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThan(Integer value) {
            addCriterion("sum <", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThanOrEqualTo(Integer value) {
            addCriterion("sum <=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumIn(List<Integer> values) {
            addCriterion("sum in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotIn(List<Integer> values) {
            addCriterion("sum not in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumBetween(Integer value1, Integer value2) {
            addCriterion("sum between", value1, value2, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotBetween(Integer value1, Integer value2) {
            addCriterion("sum not between", value1, value2, "sum");
            return (Criteria) this;
        }

        public Criteria andCouponmoneyIsNull() {
            addCriterion("couponmoney is null");
            return (Criteria) this;
        }

        public Criteria andCouponmoneyIsNotNull() {
            addCriterion("couponmoney is not null");
            return (Criteria) this;
        }

        public Criteria andCouponmoneyEqualTo(Float value) {
            addCriterion("couponmoney =", value, "couponmoney");
            return (Criteria) this;
        }

        public Criteria andCouponmoneyNotEqualTo(Float value) {
            addCriterion("couponmoney <>", value, "couponmoney");
            return (Criteria) this;
        }

        public Criteria andCouponmoneyGreaterThan(Float value) {
            addCriterion("couponmoney >", value, "couponmoney");
            return (Criteria) this;
        }

        public Criteria andCouponmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("couponmoney >=", value, "couponmoney");
            return (Criteria) this;
        }

        public Criteria andCouponmoneyLessThan(Float value) {
            addCriterion("couponmoney <", value, "couponmoney");
            return (Criteria) this;
        }

        public Criteria andCouponmoneyLessThanOrEqualTo(Float value) {
            addCriterion("couponmoney <=", value, "couponmoney");
            return (Criteria) this;
        }

        public Criteria andCouponmoneyIn(List<Float> values) {
            addCriterion("couponmoney in", values, "couponmoney");
            return (Criteria) this;
        }

        public Criteria andCouponmoneyNotIn(List<Float> values) {
            addCriterion("couponmoney not in", values, "couponmoney");
            return (Criteria) this;
        }

        public Criteria andCouponmoneyBetween(Float value1, Float value2) {
            addCriterion("couponmoney between", value1, value2, "couponmoney");
            return (Criteria) this;
        }

        public Criteria andCouponmoneyNotBetween(Float value1, Float value2) {
            addCriterion("couponmoney not between", value1, value2, "couponmoney");
            return (Criteria) this;
        }

        public Criteria andDatepmoneyIsNull() {
            addCriterion("datepmoney is null");
            return (Criteria) this;
        }

        public Criteria andDatepmoneyIsNotNull() {
            addCriterion("datepmoney is not null");
            return (Criteria) this;
        }

        public Criteria andDatepmoneyEqualTo(Float value) {
            addCriterion("datepmoney =", value, "datepmoney");
            return (Criteria) this;
        }

        public Criteria andDatepmoneyNotEqualTo(Float value) {
            addCriterion("datepmoney <>", value, "datepmoney");
            return (Criteria) this;
        }

        public Criteria andDatepmoneyGreaterThan(Float value) {
            addCriterion("datepmoney >", value, "datepmoney");
            return (Criteria) this;
        }

        public Criteria andDatepmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("datepmoney >=", value, "datepmoney");
            return (Criteria) this;
        }

        public Criteria andDatepmoneyLessThan(Float value) {
            addCriterion("datepmoney <", value, "datepmoney");
            return (Criteria) this;
        }

        public Criteria andDatepmoneyLessThanOrEqualTo(Float value) {
            addCriterion("datepmoney <=", value, "datepmoney");
            return (Criteria) this;
        }

        public Criteria andDatepmoneyIn(List<Float> values) {
            addCriterion("datepmoney in", values, "datepmoney");
            return (Criteria) this;
        }

        public Criteria andDatepmoneyNotIn(List<Float> values) {
            addCriterion("datepmoney not in", values, "datepmoney");
            return (Criteria) this;
        }

        public Criteria andDatepmoneyBetween(Float value1, Float value2) {
            addCriterion("datepmoney between", value1, value2, "datepmoney");
            return (Criteria) this;
        }

        public Criteria andDatepmoneyNotBetween(Float value1, Float value2) {
            addCriterion("datepmoney not between", value1, value2, "datepmoney");
            return (Criteria) this;
        }

        public Criteria andJialeiIsNull() {
            addCriterion("jialei is null");
            return (Criteria) this;
        }

        public Criteria andJialeiIsNotNull() {
            addCriterion("jialei is not null");
            return (Criteria) this;
        }

        public Criteria andJialeiEqualTo(String value) {
            addCriterion("jialei =", value, "jialei");
            return (Criteria) this;
        }

        public Criteria andJialeiNotEqualTo(String value) {
            addCriterion("jialei <>", value, "jialei");
            return (Criteria) this;
        }

        public Criteria andJialeiGreaterThan(String value) {
            addCriterion("jialei >", value, "jialei");
            return (Criteria) this;
        }

        public Criteria andJialeiGreaterThanOrEqualTo(String value) {
            addCriterion("jialei >=", value, "jialei");
            return (Criteria) this;
        }

        public Criteria andJialeiLessThan(String value) {
            addCriterion("jialei <", value, "jialei");
            return (Criteria) this;
        }

        public Criteria andJialeiLessThanOrEqualTo(String value) {
            addCriterion("jialei <=", value, "jialei");
            return (Criteria) this;
        }

        public Criteria andJialeiLike(String value) {
            addCriterion("jialei like", value, "jialei");
            return (Criteria) this;
        }

        public Criteria andJialeiNotLike(String value) {
            addCriterion("jialei not like", value, "jialei");
            return (Criteria) this;
        }

        public Criteria andJialeiIn(List<String> values) {
            addCriterion("jialei in", values, "jialei");
            return (Criteria) this;
        }

        public Criteria andJialeiNotIn(List<String> values) {
            addCriterion("jialei not in", values, "jialei");
            return (Criteria) this;
        }

        public Criteria andJialeiBetween(String value1, String value2) {
            addCriterion("jialei between", value1, value2, "jialei");
            return (Criteria) this;
        }

        public Criteria andJialeiNotBetween(String value1, String value2) {
            addCriterion("jialei not between", value1, value2, "jialei");
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