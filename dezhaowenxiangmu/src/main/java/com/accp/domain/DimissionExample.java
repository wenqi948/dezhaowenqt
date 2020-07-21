package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DimissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DimissionExample() {
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

        public Criteria andDimissionidIsNull() {
            addCriterion("dimissionid is null");
            return (Criteria) this;
        }

        public Criteria andDimissionidIsNotNull() {
            addCriterion("dimissionid is not null");
            return (Criteria) this;
        }

        public Criteria andDimissionidEqualTo(Integer value) {
            addCriterion("dimissionid =", value, "dimissionid");
            return (Criteria) this;
        }

        public Criteria andDimissionidNotEqualTo(Integer value) {
            addCriterion("dimissionid <>", value, "dimissionid");
            return (Criteria) this;
        }

        public Criteria andDimissionidGreaterThan(Integer value) {
            addCriterion("dimissionid >", value, "dimissionid");
            return (Criteria) this;
        }

        public Criteria andDimissionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dimissionid >=", value, "dimissionid");
            return (Criteria) this;
        }

        public Criteria andDimissionidLessThan(Integer value) {
            addCriterion("dimissionid <", value, "dimissionid");
            return (Criteria) this;
        }

        public Criteria andDimissionidLessThanOrEqualTo(Integer value) {
            addCriterion("dimissionid <=", value, "dimissionid");
            return (Criteria) this;
        }

        public Criteria andDimissionidIn(List<Integer> values) {
            addCriterion("dimissionid in", values, "dimissionid");
            return (Criteria) this;
        }

        public Criteria andDimissionidNotIn(List<Integer> values) {
            addCriterion("dimissionid not in", values, "dimissionid");
            return (Criteria) this;
        }

        public Criteria andDimissionidBetween(Integer value1, Integer value2) {
            addCriterion("dimissionid between", value1, value2, "dimissionid");
            return (Criteria) this;
        }

        public Criteria andDimissionidNotBetween(Integer value1, Integer value2) {
            addCriterion("dimissionid not between", value1, value2, "dimissionid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIsNull() {
            addCriterion("employeeid is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIsNotNull() {
            addCriterion("employeeid is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeidEqualTo(String value) {
            addCriterion("employeeid =", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotEqualTo(String value) {
            addCriterion("employeeid <>", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidGreaterThan(String value) {
            addCriterion("employeeid >", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidGreaterThanOrEqualTo(String value) {
            addCriterion("employeeid >=", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLessThan(String value) {
            addCriterion("employeeid <", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLessThanOrEqualTo(String value) {
            addCriterion("employeeid <=", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLike(String value) {
            addCriterion("employeeid like", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotLike(String value) {
            addCriterion("employeeid not like", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIn(List<String> values) {
            addCriterion("employeeid in", values, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotIn(List<String> values) {
            addCriterion("employeeid not in", values, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidBetween(String value1, String value2) {
            addCriterion("employeeid between", value1, value2, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotBetween(String value1, String value2) {
            addCriterion("employeeid not between", value1, value2, "employeeid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNull() {
            addCriterion("departmentid is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("departmentid is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(Integer value) {
            addCriterion("departmentid =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(Integer value) {
            addCriterion("departmentid <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(Integer value) {
            addCriterion("departmentid >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("departmentid >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(Integer value) {
            addCriterion("departmentid <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(Integer value) {
            addCriterion("departmentid <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<Integer> values) {
            addCriterion("departmentid in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<Integer> values) {
            addCriterion("departmentid not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(Integer value1, Integer value2) {
            addCriterion("departmentid between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("departmentid not between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDimtimesIsNull() {
            addCriterion("dimtimes is null");
            return (Criteria) this;
        }

        public Criteria andDimtimesIsNotNull() {
            addCriterion("dimtimes is not null");
            return (Criteria) this;
        }

        public Criteria andDimtimesEqualTo(Date value) {
            addCriterionForJDBCDate("dimtimes =", value, "dimtimes");
            return (Criteria) this;
        }

        public Criteria andDimtimesNotEqualTo(Date value) {
            addCriterionForJDBCDate("dimtimes <>", value, "dimtimes");
            return (Criteria) this;
        }

        public Criteria andDimtimesGreaterThan(Date value) {
            addCriterionForJDBCDate("dimtimes >", value, "dimtimes");
            return (Criteria) this;
        }

        public Criteria andDimtimesGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dimtimes >=", value, "dimtimes");
            return (Criteria) this;
        }

        public Criteria andDimtimesLessThan(Date value) {
            addCriterionForJDBCDate("dimtimes <", value, "dimtimes");
            return (Criteria) this;
        }

        public Criteria andDimtimesLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dimtimes <=", value, "dimtimes");
            return (Criteria) this;
        }

        public Criteria andDimtimesIn(List<Date> values) {
            addCriterionForJDBCDate("dimtimes in", values, "dimtimes");
            return (Criteria) this;
        }

        public Criteria andDimtimesNotIn(List<Date> values) {
            addCriterionForJDBCDate("dimtimes not in", values, "dimtimes");
            return (Criteria) this;
        }

        public Criteria andDimtimesBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dimtimes between", value1, value2, "dimtimes");
            return (Criteria) this;
        }

        public Criteria andDimtimesNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dimtimes not between", value1, value2, "dimtimes");
            return (Criteria) this;
        }

        public Criteria andDimreasonaIsNull() {
            addCriterion("dimreasona is null");
            return (Criteria) this;
        }

        public Criteria andDimreasonaIsNotNull() {
            addCriterion("dimreasona is not null");
            return (Criteria) this;
        }

        public Criteria andDimreasonaEqualTo(String value) {
            addCriterion("dimreasona =", value, "dimreasona");
            return (Criteria) this;
        }

        public Criteria andDimreasonaNotEqualTo(String value) {
            addCriterion("dimreasona <>", value, "dimreasona");
            return (Criteria) this;
        }

        public Criteria andDimreasonaGreaterThan(String value) {
            addCriterion("dimreasona >", value, "dimreasona");
            return (Criteria) this;
        }

        public Criteria andDimreasonaGreaterThanOrEqualTo(String value) {
            addCriterion("dimreasona >=", value, "dimreasona");
            return (Criteria) this;
        }

        public Criteria andDimreasonaLessThan(String value) {
            addCriterion("dimreasona <", value, "dimreasona");
            return (Criteria) this;
        }

        public Criteria andDimreasonaLessThanOrEqualTo(String value) {
            addCriterion("dimreasona <=", value, "dimreasona");
            return (Criteria) this;
        }

        public Criteria andDimreasonaLike(String value) {
            addCriterion("dimreasona like", value, "dimreasona");
            return (Criteria) this;
        }

        public Criteria andDimreasonaNotLike(String value) {
            addCriterion("dimreasona not like", value, "dimreasona");
            return (Criteria) this;
        }

        public Criteria andDimreasonaIn(List<String> values) {
            addCriterion("dimreasona in", values, "dimreasona");
            return (Criteria) this;
        }

        public Criteria andDimreasonaNotIn(List<String> values) {
            addCriterion("dimreasona not in", values, "dimreasona");
            return (Criteria) this;
        }

        public Criteria andDimreasonaBetween(String value1, String value2) {
            addCriterion("dimreasona between", value1, value2, "dimreasona");
            return (Criteria) this;
        }

        public Criteria andDimreasonaNotBetween(String value1, String value2) {
            addCriterion("dimreasona not between", value1, value2, "dimreasona");
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