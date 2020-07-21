package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class JyjcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JyjcExample() {
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

        public Criteria andJyidIsNull() {
            addCriterion("jyid is null");
            return (Criteria) this;
        }

        public Criteria andJyidIsNotNull() {
            addCriterion("jyid is not null");
            return (Criteria) this;
        }

        public Criteria andJyidEqualTo(Integer value) {
            addCriterion("jyid =", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidNotEqualTo(Integer value) {
            addCriterion("jyid <>", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidGreaterThan(Integer value) {
            addCriterion("jyid >", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jyid >=", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidLessThan(Integer value) {
            addCriterion("jyid <", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidLessThanOrEqualTo(Integer value) {
            addCriterion("jyid <=", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidIn(List<Integer> values) {
            addCriterion("jyid in", values, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidNotIn(List<Integer> values) {
            addCriterion("jyid not in", values, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidBetween(Integer value1, Integer value2) {
            addCriterion("jyid between", value1, value2, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidNotBetween(Integer value1, Integer value2) {
            addCriterion("jyid not between", value1, value2, "jyid");
            return (Criteria) this;
        }

        public Criteria andTeamidIsNull() {
            addCriterion("teamid is null");
            return (Criteria) this;
        }

        public Criteria andTeamidIsNotNull() {
            addCriterion("teamid is not null");
            return (Criteria) this;
        }

        public Criteria andTeamidEqualTo(Integer value) {
            addCriterion("teamid =", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotEqualTo(Integer value) {
            addCriterion("teamid <>", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidGreaterThan(Integer value) {
            addCriterion("teamid >", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidGreaterThanOrEqualTo(Integer value) {
            addCriterion("teamid >=", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidLessThan(Integer value) {
            addCriterion("teamid <", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidLessThanOrEqualTo(Integer value) {
            addCriterion("teamid <=", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidIn(List<Integer> values) {
            addCriterion("teamid in", values, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotIn(List<Integer> values) {
            addCriterion("teamid not in", values, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidBetween(Integer value1, Integer value2) {
            addCriterion("teamid between", value1, value2, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotBetween(Integer value1, Integer value2) {
            addCriterion("teamid not between", value1, value2, "teamid");
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

        public Criteria andNilcIsNull() {
            addCriterion("nilc is null");
            return (Criteria) this;
        }

        public Criteria andNilcIsNotNull() {
            addCriterion("nilc is not null");
            return (Criteria) this;
        }

        public Criteria andNilcEqualTo(Integer value) {
            addCriterion("nilc =", value, "nilc");
            return (Criteria) this;
        }

        public Criteria andNilcNotEqualTo(Integer value) {
            addCriterion("nilc <>", value, "nilc");
            return (Criteria) this;
        }

        public Criteria andNilcGreaterThan(Integer value) {
            addCriterion("nilc >", value, "nilc");
            return (Criteria) this;
        }

        public Criteria andNilcGreaterThanOrEqualTo(Integer value) {
            addCriterion("nilc >=", value, "nilc");
            return (Criteria) this;
        }

        public Criteria andNilcLessThan(Integer value) {
            addCriterion("nilc <", value, "nilc");
            return (Criteria) this;
        }

        public Criteria andNilcLessThanOrEqualTo(Integer value) {
            addCriterion("nilc <=", value, "nilc");
            return (Criteria) this;
        }

        public Criteria andNilcIn(List<Integer> values) {
            addCriterion("nilc in", values, "nilc");
            return (Criteria) this;
        }

        public Criteria andNilcNotIn(List<Integer> values) {
            addCriterion("nilc not in", values, "nilc");
            return (Criteria) this;
        }

        public Criteria andNilcBetween(Integer value1, Integer value2) {
            addCriterion("nilc between", value1, value2, "nilc");
            return (Criteria) this;
        }

        public Criteria andNilcNotBetween(Integer value1, Integer value2) {
            addCriterion("nilc not between", value1, value2, "nilc");
            return (Criteria) this;
        }

        public Criteria andPgtimeIsNull() {
            addCriterion("pgtime is null");
            return (Criteria) this;
        }

        public Criteria andPgtimeIsNotNull() {
            addCriterion("pgtime is not null");
            return (Criteria) this;
        }

        public Criteria andPgtimeEqualTo(Date value) {
            addCriterionForJDBCDate("pgtime =", value, "pgtime");
            return (Criteria) this;
        }

        public Criteria andPgtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("pgtime <>", value, "pgtime");
            return (Criteria) this;
        }

        public Criteria andPgtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("pgtime >", value, "pgtime");
            return (Criteria) this;
        }

        public Criteria andPgtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pgtime >=", value, "pgtime");
            return (Criteria) this;
        }

        public Criteria andPgtimeLessThan(Date value) {
            addCriterionForJDBCDate("pgtime <", value, "pgtime");
            return (Criteria) this;
        }

        public Criteria andPgtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pgtime <=", value, "pgtime");
            return (Criteria) this;
        }

        public Criteria andPgtimeIn(List<Date> values) {
            addCriterionForJDBCDate("pgtime in", values, "pgtime");
            return (Criteria) this;
        }

        public Criteria andPgtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("pgtime not in", values, "pgtime");
            return (Criteria) this;
        }

        public Criteria andPgtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pgtime between", value1, value2, "pgtime");
            return (Criteria) this;
        }

        public Criteria andPgtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pgtime not between", value1, value2, "pgtime");
            return (Criteria) this;
        }

        public Criteria andGototimeIsNull() {
            addCriterion("gototime is null");
            return (Criteria) this;
        }

        public Criteria andGototimeIsNotNull() {
            addCriterion("gototime is not null");
            return (Criteria) this;
        }

        public Criteria andGototimeEqualTo(Date value) {
            addCriterionForJDBCDate("gototime =", value, "gototime");
            return (Criteria) this;
        }

        public Criteria andGototimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("gototime <>", value, "gototime");
            return (Criteria) this;
        }

        public Criteria andGototimeGreaterThan(Date value) {
            addCriterionForJDBCDate("gototime >", value, "gototime");
            return (Criteria) this;
        }

        public Criteria andGototimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gototime >=", value, "gototime");
            return (Criteria) this;
        }

        public Criteria andGototimeLessThan(Date value) {
            addCriterionForJDBCDate("gototime <", value, "gototime");
            return (Criteria) this;
        }

        public Criteria andGototimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gototime <=", value, "gototime");
            return (Criteria) this;
        }

        public Criteria andGototimeIn(List<Date> values) {
            addCriterionForJDBCDate("gototime in", values, "gototime");
            return (Criteria) this;
        }

        public Criteria andGototimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("gototime not in", values, "gototime");
            return (Criteria) this;
        }

        public Criteria andGototimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gototime between", value1, value2, "gototime");
            return (Criteria) this;
        }

        public Criteria andGototimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gototime not between", value1, value2, "gototime");
            return (Criteria) this;
        }

        public Criteria andGotoaddressIsNull() {
            addCriterion("gotoaddress is null");
            return (Criteria) this;
        }

        public Criteria andGotoaddressIsNotNull() {
            addCriterion("gotoaddress is not null");
            return (Criteria) this;
        }

        public Criteria andGotoaddressEqualTo(String value) {
            addCriterion("gotoaddress =", value, "gotoaddress");
            return (Criteria) this;
        }

        public Criteria andGotoaddressNotEqualTo(String value) {
            addCriterion("gotoaddress <>", value, "gotoaddress");
            return (Criteria) this;
        }

        public Criteria andGotoaddressGreaterThan(String value) {
            addCriterion("gotoaddress >", value, "gotoaddress");
            return (Criteria) this;
        }

        public Criteria andGotoaddressGreaterThanOrEqualTo(String value) {
            addCriterion("gotoaddress >=", value, "gotoaddress");
            return (Criteria) this;
        }

        public Criteria andGotoaddressLessThan(String value) {
            addCriterion("gotoaddress <", value, "gotoaddress");
            return (Criteria) this;
        }

        public Criteria andGotoaddressLessThanOrEqualTo(String value) {
            addCriterion("gotoaddress <=", value, "gotoaddress");
            return (Criteria) this;
        }

        public Criteria andGotoaddressLike(String value) {
            addCriterion("gotoaddress like", value, "gotoaddress");
            return (Criteria) this;
        }

        public Criteria andGotoaddressNotLike(String value) {
            addCriterion("gotoaddress not like", value, "gotoaddress");
            return (Criteria) this;
        }

        public Criteria andGotoaddressIn(List<String> values) {
            addCriterion("gotoaddress in", values, "gotoaddress");
            return (Criteria) this;
        }

        public Criteria andGotoaddressNotIn(List<String> values) {
            addCriterion("gotoaddress not in", values, "gotoaddress");
            return (Criteria) this;
        }

        public Criteria andGotoaddressBetween(String value1, String value2) {
            addCriterion("gotoaddress between", value1, value2, "gotoaddress");
            return (Criteria) this;
        }

        public Criteria andGotoaddressNotBetween(String value1, String value2) {
            addCriterion("gotoaddress not between", value1, value2, "gotoaddress");
            return (Criteria) this;
        }

        public Criteria andDotimeIsNull() {
            addCriterion("dotime is null");
            return (Criteria) this;
        }

        public Criteria andDotimeIsNotNull() {
            addCriterion("dotime is not null");
            return (Criteria) this;
        }

        public Criteria andDotimeEqualTo(Date value) {
            addCriterionForJDBCDate("dotime =", value, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("dotime <>", value, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeGreaterThan(Date value) {
            addCriterionForJDBCDate("dotime >", value, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dotime >=", value, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeLessThan(Date value) {
            addCriterionForJDBCDate("dotime <", value, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dotime <=", value, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeIn(List<Date> values) {
            addCriterionForJDBCDate("dotime in", values, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("dotime not in", values, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dotime between", value1, value2, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dotime not between", value1, value2, "dotime");
            return (Criteria) this;
        }

        public Criteria andDoaddressIsNull() {
            addCriterion("doaddress is null");
            return (Criteria) this;
        }

        public Criteria andDoaddressIsNotNull() {
            addCriterion("doaddress is not null");
            return (Criteria) this;
        }

        public Criteria andDoaddressEqualTo(String value) {
            addCriterion("doaddress =", value, "doaddress");
            return (Criteria) this;
        }

        public Criteria andDoaddressNotEqualTo(String value) {
            addCriterion("doaddress <>", value, "doaddress");
            return (Criteria) this;
        }

        public Criteria andDoaddressGreaterThan(String value) {
            addCriterion("doaddress >", value, "doaddress");
            return (Criteria) this;
        }

        public Criteria andDoaddressGreaterThanOrEqualTo(String value) {
            addCriterion("doaddress >=", value, "doaddress");
            return (Criteria) this;
        }

        public Criteria andDoaddressLessThan(String value) {
            addCriterion("doaddress <", value, "doaddress");
            return (Criteria) this;
        }

        public Criteria andDoaddressLessThanOrEqualTo(String value) {
            addCriterion("doaddress <=", value, "doaddress");
            return (Criteria) this;
        }

        public Criteria andDoaddressLike(String value) {
            addCriterion("doaddress like", value, "doaddress");
            return (Criteria) this;
        }

        public Criteria andDoaddressNotLike(String value) {
            addCriterion("doaddress not like", value, "doaddress");
            return (Criteria) this;
        }

        public Criteria andDoaddressIn(List<String> values) {
            addCriterion("doaddress in", values, "doaddress");
            return (Criteria) this;
        }

        public Criteria andDoaddressNotIn(List<String> values) {
            addCriterion("doaddress not in", values, "doaddress");
            return (Criteria) this;
        }

        public Criteria andDoaddressBetween(String value1, String value2) {
            addCriterion("doaddress between", value1, value2, "doaddress");
            return (Criteria) this;
        }

        public Criteria andDoaddressNotBetween(String value1, String value2) {
            addCriterion("doaddress not between", value1, value2, "doaddress");
            return (Criteria) this;
        }

        public Criteria andOvertimeIsNull() {
            addCriterion("overtime is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeIsNotNull() {
            addCriterion("overtime is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeEqualTo(Date value) {
            addCriterionForJDBCDate("overtime =", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("overtime <>", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeGreaterThan(Date value) {
            addCriterionForJDBCDate("overtime >", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("overtime >=", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeLessThan(Date value) {
            addCriterionForJDBCDate("overtime <", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("overtime <=", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeIn(List<Date> values) {
            addCriterionForJDBCDate("overtime in", values, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("overtime not in", values, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("overtime between", value1, value2, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("overtime not between", value1, value2, "overtime");
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