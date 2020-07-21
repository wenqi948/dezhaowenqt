package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ViplistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViplistExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andClientnoIsNull() {
            addCriterion("clientno is null");
            return (Criteria) this;
        }

        public Criteria andClientnoIsNotNull() {
            addCriterion("clientno is not null");
            return (Criteria) this;
        }

        public Criteria andClientnoEqualTo(String value) {
            addCriterion("clientno =", value, "clientno");
            return (Criteria) this;
        }

        public Criteria andClientnoNotEqualTo(String value) {
            addCriterion("clientno <>", value, "clientno");
            return (Criteria) this;
        }

        public Criteria andClientnoGreaterThan(String value) {
            addCriterion("clientno >", value, "clientno");
            return (Criteria) this;
        }

        public Criteria andClientnoGreaterThanOrEqualTo(String value) {
            addCriterion("clientno >=", value, "clientno");
            return (Criteria) this;
        }

        public Criteria andClientnoLessThan(String value) {
            addCriterion("clientno <", value, "clientno");
            return (Criteria) this;
        }

        public Criteria andClientnoLessThanOrEqualTo(String value) {
            addCriterion("clientno <=", value, "clientno");
            return (Criteria) this;
        }

        public Criteria andClientnoLike(String value) {
            addCriterion("clientno like", value, "clientno");
            return (Criteria) this;
        }

        public Criteria andClientnoNotLike(String value) {
            addCriterion("clientno not like", value, "clientno");
            return (Criteria) this;
        }

        public Criteria andClientnoIn(List<String> values) {
            addCriterion("clientno in", values, "clientno");
            return (Criteria) this;
        }

        public Criteria andClientnoNotIn(List<String> values) {
            addCriterion("clientno not in", values, "clientno");
            return (Criteria) this;
        }

        public Criteria andClientnoBetween(String value1, String value2) {
            addCriterion("clientno between", value1, value2, "clientno");
            return (Criteria) this;
        }

        public Criteria andClientnoNotBetween(String value1, String value2) {
            addCriterion("clientno not between", value1, value2, "clientno");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNull() {
            addCriterion("integral is null");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNotNull() {
            addCriterion("integral is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralEqualTo(Float value) {
            addCriterion("integral =", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotEqualTo(Float value) {
            addCriterion("integral <>", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThan(Float value) {
            addCriterion("integral >", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThanOrEqualTo(Float value) {
            addCriterion("integral >=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThan(Float value) {
            addCriterion("integral <", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThanOrEqualTo(Float value) {
            addCriterion("integral <=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralIn(List<Float> values) {
            addCriterion("integral in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotIn(List<Float> values) {
            addCriterion("integral not in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralBetween(Float value1, Float value2) {
            addCriterion("integral between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotBetween(Float value1, Float value2) {
            addCriterion("integral not between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andJiontimeIsNull() {
            addCriterion("jiontime is null");
            return (Criteria) this;
        }

        public Criteria andJiontimeIsNotNull() {
            addCriterion("jiontime is not null");
            return (Criteria) this;
        }

        public Criteria andJiontimeEqualTo(Date value) {
            addCriterionForJDBCDate("jiontime =", value, "jiontime");
            return (Criteria) this;
        }

        public Criteria andJiontimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("jiontime <>", value, "jiontime");
            return (Criteria) this;
        }

        public Criteria andJiontimeGreaterThan(Date value) {
            addCriterionForJDBCDate("jiontime >", value, "jiontime");
            return (Criteria) this;
        }

        public Criteria andJiontimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jiontime >=", value, "jiontime");
            return (Criteria) this;
        }

        public Criteria andJiontimeLessThan(Date value) {
            addCriterionForJDBCDate("jiontime <", value, "jiontime");
            return (Criteria) this;
        }

        public Criteria andJiontimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jiontime <=", value, "jiontime");
            return (Criteria) this;
        }

        public Criteria andJiontimeIn(List<Date> values) {
            addCriterionForJDBCDate("jiontime in", values, "jiontime");
            return (Criteria) this;
        }

        public Criteria andJiontimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("jiontime not in", values, "jiontime");
            return (Criteria) this;
        }

        public Criteria andJiontimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jiontime between", value1, value2, "jiontime");
            return (Criteria) this;
        }

        public Criteria andJiontimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jiontime not between", value1, value2, "jiontime");
            return (Criteria) this;
        }

        public Criteria andSumjfIsNull() {
            addCriterion("sumjf is null");
            return (Criteria) this;
        }

        public Criteria andSumjfIsNotNull() {
            addCriterion("sumjf is not null");
            return (Criteria) this;
        }

        public Criteria andSumjfEqualTo(Float value) {
            addCriterion("sumjf =", value, "sumjf");
            return (Criteria) this;
        }

        public Criteria andSumjfNotEqualTo(Float value) {
            addCriterion("sumjf <>", value, "sumjf");
            return (Criteria) this;
        }

        public Criteria andSumjfGreaterThan(Float value) {
            addCriterion("sumjf >", value, "sumjf");
            return (Criteria) this;
        }

        public Criteria andSumjfGreaterThanOrEqualTo(Float value) {
            addCriterion("sumjf >=", value, "sumjf");
            return (Criteria) this;
        }

        public Criteria andSumjfLessThan(Float value) {
            addCriterion("sumjf <", value, "sumjf");
            return (Criteria) this;
        }

        public Criteria andSumjfLessThanOrEqualTo(Float value) {
            addCriterion("sumjf <=", value, "sumjf");
            return (Criteria) this;
        }

        public Criteria andSumjfIn(List<Float> values) {
            addCriterion("sumjf in", values, "sumjf");
            return (Criteria) this;
        }

        public Criteria andSumjfNotIn(List<Float> values) {
            addCriterion("sumjf not in", values, "sumjf");
            return (Criteria) this;
        }

        public Criteria andSumjfBetween(Float value1, Float value2) {
            addCriterion("sumjf between", value1, value2, "sumjf");
            return (Criteria) this;
        }

        public Criteria andSumjfNotBetween(Float value1, Float value2) {
            addCriterion("sumjf not between", value1, value2, "sumjf");
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