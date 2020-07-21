package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BaoyangExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaoyangExample() {
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

        public Criteria andCarnoIsNull() {
            addCriterion("carno is null");
            return (Criteria) this;
        }

        public Criteria andCarnoIsNotNull() {
            addCriterion("carno is not null");
            return (Criteria) this;
        }

        public Criteria andCarnoEqualTo(String value) {
            addCriterion("carno =", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoNotEqualTo(String value) {
            addCriterion("carno <>", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoGreaterThan(String value) {
            addCriterion("carno >", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoGreaterThanOrEqualTo(String value) {
            addCriterion("carno >=", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoLessThan(String value) {
            addCriterion("carno <", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoLessThanOrEqualTo(String value) {
            addCriterion("carno <=", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoLike(String value) {
            addCriterion("carno like", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoNotLike(String value) {
            addCriterion("carno not like", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoIn(List<String> values) {
            addCriterion("carno in", values, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoNotIn(List<String> values) {
            addCriterion("carno not in", values, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoBetween(String value1, String value2) {
            addCriterion("carno between", value1, value2, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoNotBetween(String value1, String value2) {
            addCriterion("carno not between", value1, value2, "carno");
            return (Criteria) this;
        }

        public Criteria andBaoynameIsNull() {
            addCriterion("baoyname is null");
            return (Criteria) this;
        }

        public Criteria andBaoynameIsNotNull() {
            addCriterion("baoyname is not null");
            return (Criteria) this;
        }

        public Criteria andBaoynameEqualTo(String value) {
            addCriterion("baoyname =", value, "baoyname");
            return (Criteria) this;
        }

        public Criteria andBaoynameNotEqualTo(String value) {
            addCriterion("baoyname <>", value, "baoyname");
            return (Criteria) this;
        }

        public Criteria andBaoynameGreaterThan(String value) {
            addCriterion("baoyname >", value, "baoyname");
            return (Criteria) this;
        }

        public Criteria andBaoynameGreaterThanOrEqualTo(String value) {
            addCriterion("baoyname >=", value, "baoyname");
            return (Criteria) this;
        }

        public Criteria andBaoynameLessThan(String value) {
            addCriterion("baoyname <", value, "baoyname");
            return (Criteria) this;
        }

        public Criteria andBaoynameLessThanOrEqualTo(String value) {
            addCriterion("baoyname <=", value, "baoyname");
            return (Criteria) this;
        }

        public Criteria andBaoynameLike(String value) {
            addCriterion("baoyname like", value, "baoyname");
            return (Criteria) this;
        }

        public Criteria andBaoynameNotLike(String value) {
            addCriterion("baoyname not like", value, "baoyname");
            return (Criteria) this;
        }

        public Criteria andBaoynameIn(List<String> values) {
            addCriterion("baoyname in", values, "baoyname");
            return (Criteria) this;
        }

        public Criteria andBaoynameNotIn(List<String> values) {
            addCriterion("baoyname not in", values, "baoyname");
            return (Criteria) this;
        }

        public Criteria andBaoynameBetween(String value1, String value2) {
            addCriterion("baoyname between", value1, value2, "baoyname");
            return (Criteria) this;
        }

        public Criteria andBaoynameNotBetween(String value1, String value2) {
            addCriterion("baoyname not between", value1, value2, "baoyname");
            return (Criteria) this;
        }

        public Criteria andJihuadateIsNull() {
            addCriterion("jihuadate is null");
            return (Criteria) this;
        }

        public Criteria andJihuadateIsNotNull() {
            addCriterion("jihuadate is not null");
            return (Criteria) this;
        }

        public Criteria andJihuadateEqualTo(Date value) {
            addCriterionForJDBCDate("jihuadate =", value, "jihuadate");
            return (Criteria) this;
        }

        public Criteria andJihuadateNotEqualTo(Date value) {
            addCriterionForJDBCDate("jihuadate <>", value, "jihuadate");
            return (Criteria) this;
        }

        public Criteria andJihuadateGreaterThan(Date value) {
            addCriterionForJDBCDate("jihuadate >", value, "jihuadate");
            return (Criteria) this;
        }

        public Criteria andJihuadateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jihuadate >=", value, "jihuadate");
            return (Criteria) this;
        }

        public Criteria andJihuadateLessThan(Date value) {
            addCriterionForJDBCDate("jihuadate <", value, "jihuadate");
            return (Criteria) this;
        }

        public Criteria andJihuadateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jihuadate <=", value, "jihuadate");
            return (Criteria) this;
        }

        public Criteria andJihuadateIn(List<Date> values) {
            addCriterionForJDBCDate("jihuadate in", values, "jihuadate");
            return (Criteria) this;
        }

        public Criteria andJihuadateNotIn(List<Date> values) {
            addCriterionForJDBCDate("jihuadate not in", values, "jihuadate");
            return (Criteria) this;
        }

        public Criteria andJihuadateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jihuadate between", value1, value2, "jihuadate");
            return (Criteria) this;
        }

        public Criteria andJihuadateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jihuadate not between", value1, value2, "jihuadate");
            return (Criteria) this;
        }

        public Criteria andJihualichengIsNull() {
            addCriterion("jihualicheng is null");
            return (Criteria) this;
        }

        public Criteria andJihualichengIsNotNull() {
            addCriterion("jihualicheng is not null");
            return (Criteria) this;
        }

        public Criteria andJihualichengEqualTo(String value) {
            addCriterion("jihualicheng =", value, "jihualicheng");
            return (Criteria) this;
        }

        public Criteria andJihualichengNotEqualTo(String value) {
            addCriterion("jihualicheng <>", value, "jihualicheng");
            return (Criteria) this;
        }

        public Criteria andJihualichengGreaterThan(String value) {
            addCriterion("jihualicheng >", value, "jihualicheng");
            return (Criteria) this;
        }

        public Criteria andJihualichengGreaterThanOrEqualTo(String value) {
            addCriterion("jihualicheng >=", value, "jihualicheng");
            return (Criteria) this;
        }

        public Criteria andJihualichengLessThan(String value) {
            addCriterion("jihualicheng <", value, "jihualicheng");
            return (Criteria) this;
        }

        public Criteria andJihualichengLessThanOrEqualTo(String value) {
            addCriterion("jihualicheng <=", value, "jihualicheng");
            return (Criteria) this;
        }

        public Criteria andJihualichengLike(String value) {
            addCriterion("jihualicheng like", value, "jihualicheng");
            return (Criteria) this;
        }

        public Criteria andJihualichengNotLike(String value) {
            addCriterion("jihualicheng not like", value, "jihualicheng");
            return (Criteria) this;
        }

        public Criteria andJihualichengIn(List<String> values) {
            addCriterion("jihualicheng in", values, "jihualicheng");
            return (Criteria) this;
        }

        public Criteria andJihualichengNotIn(List<String> values) {
            addCriterion("jihualicheng not in", values, "jihualicheng");
            return (Criteria) this;
        }

        public Criteria andJihualichengBetween(String value1, String value2) {
            addCriterion("jihualicheng between", value1, value2, "jihualicheng");
            return (Criteria) this;
        }

        public Criteria andJihualichengNotBetween(String value1, String value2) {
            addCriterion("jihualicheng not between", value1, value2, "jihualicheng");
            return (Criteria) this;
        }

        public Criteria andShijidateIsNull() {
            addCriterion("shijidate is null");
            return (Criteria) this;
        }

        public Criteria andShijidateIsNotNull() {
            addCriterion("shijidate is not null");
            return (Criteria) this;
        }

        public Criteria andShijidateEqualTo(Date value) {
            addCriterionForJDBCDate("shijidate =", value, "shijidate");
            return (Criteria) this;
        }

        public Criteria andShijidateNotEqualTo(Date value) {
            addCriterionForJDBCDate("shijidate <>", value, "shijidate");
            return (Criteria) this;
        }

        public Criteria andShijidateGreaterThan(Date value) {
            addCriterionForJDBCDate("shijidate >", value, "shijidate");
            return (Criteria) this;
        }

        public Criteria andShijidateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shijidate >=", value, "shijidate");
            return (Criteria) this;
        }

        public Criteria andShijidateLessThan(Date value) {
            addCriterionForJDBCDate("shijidate <", value, "shijidate");
            return (Criteria) this;
        }

        public Criteria andShijidateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shijidate <=", value, "shijidate");
            return (Criteria) this;
        }

        public Criteria andShijidateIn(List<Date> values) {
            addCriterionForJDBCDate("shijidate in", values, "shijidate");
            return (Criteria) this;
        }

        public Criteria andShijidateNotIn(List<Date> values) {
            addCriterionForJDBCDate("shijidate not in", values, "shijidate");
            return (Criteria) this;
        }

        public Criteria andShijidateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shijidate between", value1, value2, "shijidate");
            return (Criteria) this;
        }

        public Criteria andShijidateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shijidate not between", value1, value2, "shijidate");
            return (Criteria) this;
        }

        public Criteria andShijilichengIsNull() {
            addCriterion("shijilicheng is null");
            return (Criteria) this;
        }

        public Criteria andShijilichengIsNotNull() {
            addCriterion("shijilicheng is not null");
            return (Criteria) this;
        }

        public Criteria andShijilichengEqualTo(String value) {
            addCriterion("shijilicheng =", value, "shijilicheng");
            return (Criteria) this;
        }

        public Criteria andShijilichengNotEqualTo(String value) {
            addCriterion("shijilicheng <>", value, "shijilicheng");
            return (Criteria) this;
        }

        public Criteria andShijilichengGreaterThan(String value) {
            addCriterion("shijilicheng >", value, "shijilicheng");
            return (Criteria) this;
        }

        public Criteria andShijilichengGreaterThanOrEqualTo(String value) {
            addCriterion("shijilicheng >=", value, "shijilicheng");
            return (Criteria) this;
        }

        public Criteria andShijilichengLessThan(String value) {
            addCriterion("shijilicheng <", value, "shijilicheng");
            return (Criteria) this;
        }

        public Criteria andShijilichengLessThanOrEqualTo(String value) {
            addCriterion("shijilicheng <=", value, "shijilicheng");
            return (Criteria) this;
        }

        public Criteria andShijilichengLike(String value) {
            addCriterion("shijilicheng like", value, "shijilicheng");
            return (Criteria) this;
        }

        public Criteria andShijilichengNotLike(String value) {
            addCriterion("shijilicheng not like", value, "shijilicheng");
            return (Criteria) this;
        }

        public Criteria andShijilichengIn(List<String> values) {
            addCriterion("shijilicheng in", values, "shijilicheng");
            return (Criteria) this;
        }

        public Criteria andShijilichengNotIn(List<String> values) {
            addCriterion("shijilicheng not in", values, "shijilicheng");
            return (Criteria) this;
        }

        public Criteria andShijilichengBetween(String value1, String value2) {
            addCriterion("shijilicheng between", value1, value2, "shijilicheng");
            return (Criteria) this;
        }

        public Criteria andShijilichengNotBetween(String value1, String value2) {
            addCriterion("shijilicheng not between", value1, value2, "shijilicheng");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNull() {
            addCriterion("beizhu is null");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNotNull() {
            addCriterion("beizhu is not null");
            return (Criteria) this;
        }

        public Criteria andBeizhuEqualTo(String value) {
            addCriterion("beizhu =", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotEqualTo(String value) {
            addCriterion("beizhu <>", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThan(String value) {
            addCriterion("beizhu >", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThanOrEqualTo(String value) {
            addCriterion("beizhu >=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThan(String value) {
            addCriterion("beizhu <", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThanOrEqualTo(String value) {
            addCriterion("beizhu <=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLike(String value) {
            addCriterion("beizhu like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotLike(String value) {
            addCriterion("beizhu not like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuIn(List<String> values) {
            addCriterion("beizhu in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotIn(List<String> values) {
            addCriterion("beizhu not in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuBetween(String value1, String value2) {
            addCriterion("beizhu between", value1, value2, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotBetween(String value1, String value2) {
            addCriterion("beizhu not between", value1, value2, "beizhu");
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