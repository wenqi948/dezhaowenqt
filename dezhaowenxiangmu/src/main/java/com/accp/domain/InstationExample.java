package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InstationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InstationExample() {
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

        public Criteria andWxstateidIsNull() {
            addCriterion("wxstateid is null");
            return (Criteria) this;
        }

        public Criteria andWxstateidIsNotNull() {
            addCriterion("wxstateid is not null");
            return (Criteria) this;
        }

        public Criteria andWxstateidEqualTo(Integer value) {
            addCriterion("wxstateid =", value, "wxstateid");
            return (Criteria) this;
        }

        public Criteria andWxstateidNotEqualTo(Integer value) {
            addCriterion("wxstateid <>", value, "wxstateid");
            return (Criteria) this;
        }

        public Criteria andWxstateidGreaterThan(Integer value) {
            addCriterion("wxstateid >", value, "wxstateid");
            return (Criteria) this;
        }

        public Criteria andWxstateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wxstateid >=", value, "wxstateid");
            return (Criteria) this;
        }

        public Criteria andWxstateidLessThan(Integer value) {
            addCriterion("wxstateid <", value, "wxstateid");
            return (Criteria) this;
        }

        public Criteria andWxstateidLessThanOrEqualTo(Integer value) {
            addCriterion("wxstateid <=", value, "wxstateid");
            return (Criteria) this;
        }

        public Criteria andWxstateidIn(List<Integer> values) {
            addCriterion("wxstateid in", values, "wxstateid");
            return (Criteria) this;
        }

        public Criteria andWxstateidNotIn(List<Integer> values) {
            addCriterion("wxstateid not in", values, "wxstateid");
            return (Criteria) this;
        }

        public Criteria andWxstateidBetween(Integer value1, Integer value2) {
            addCriterion("wxstateid between", value1, value2, "wxstateid");
            return (Criteria) this;
        }

        public Criteria andWxstateidNotBetween(Integer value1, Integer value2) {
            addCriterion("wxstateid not between", value1, value2, "wxstateid");
            return (Criteria) this;
        }

        public Criteria andArtisanidIsNull() {
            addCriterion("artisanid is null");
            return (Criteria) this;
        }

        public Criteria andArtisanidIsNotNull() {
            addCriterion("artisanid is not null");
            return (Criteria) this;
        }

        public Criteria andArtisanidEqualTo(String value) {
            addCriterion("artisanid =", value, "artisanid");
            return (Criteria) this;
        }

        public Criteria andArtisanidNotEqualTo(String value) {
            addCriterion("artisanid <>", value, "artisanid");
            return (Criteria) this;
        }

        public Criteria andArtisanidGreaterThan(String value) {
            addCriterion("artisanid >", value, "artisanid");
            return (Criteria) this;
        }

        public Criteria andArtisanidGreaterThanOrEqualTo(String value) {
            addCriterion("artisanid >=", value, "artisanid");
            return (Criteria) this;
        }

        public Criteria andArtisanidLessThan(String value) {
            addCriterion("artisanid <", value, "artisanid");
            return (Criteria) this;
        }

        public Criteria andArtisanidLessThanOrEqualTo(String value) {
            addCriterion("artisanid <=", value, "artisanid");
            return (Criteria) this;
        }

        public Criteria andArtisanidLike(String value) {
            addCriterion("artisanid like", value, "artisanid");
            return (Criteria) this;
        }

        public Criteria andArtisanidNotLike(String value) {
            addCriterion("artisanid not like", value, "artisanid");
            return (Criteria) this;
        }

        public Criteria andArtisanidIn(List<String> values) {
            addCriterion("artisanid in", values, "artisanid");
            return (Criteria) this;
        }

        public Criteria andArtisanidNotIn(List<String> values) {
            addCriterion("artisanid not in", values, "artisanid");
            return (Criteria) this;
        }

        public Criteria andArtisanidBetween(String value1, String value2) {
            addCriterion("artisanid between", value1, value2, "artisanid");
            return (Criteria) this;
        }

        public Criteria andArtisanidNotBetween(String value1, String value2) {
            addCriterion("artisanid not between", value1, value2, "artisanid");
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

        public Criteria andInstationIsNull() {
            addCriterion("instation is null");
            return (Criteria) this;
        }

        public Criteria andInstationIsNotNull() {
            addCriterion("instation is not null");
            return (Criteria) this;
        }

        public Criteria andInstationEqualTo(String value) {
            addCriterion("instation =", value, "instation");
            return (Criteria) this;
        }

        public Criteria andInstationNotEqualTo(String value) {
            addCriterion("instation <>", value, "instation");
            return (Criteria) this;
        }

        public Criteria andInstationGreaterThan(String value) {
            addCriterion("instation >", value, "instation");
            return (Criteria) this;
        }

        public Criteria andInstationGreaterThanOrEqualTo(String value) {
            addCriterion("instation >=", value, "instation");
            return (Criteria) this;
        }

        public Criteria andInstationLessThan(String value) {
            addCriterion("instation <", value, "instation");
            return (Criteria) this;
        }

        public Criteria andInstationLessThanOrEqualTo(String value) {
            addCriterion("instation <=", value, "instation");
            return (Criteria) this;
        }

        public Criteria andInstationLike(String value) {
            addCriterion("instation like", value, "instation");
            return (Criteria) this;
        }

        public Criteria andInstationNotLike(String value) {
            addCriterion("instation not like", value, "instation");
            return (Criteria) this;
        }

        public Criteria andInstationIn(List<String> values) {
            addCriterion("instation in", values, "instation");
            return (Criteria) this;
        }

        public Criteria andInstationNotIn(List<String> values) {
            addCriterion("instation not in", values, "instation");
            return (Criteria) this;
        }

        public Criteria andInstationBetween(String value1, String value2) {
            addCriterion("instation between", value1, value2, "instation");
            return (Criteria) this;
        }

        public Criteria andInstationNotBetween(String value1, String value2) {
            addCriterion("instation not between", value1, value2, "instation");
            return (Criteria) this;
        }

        public Criteria andJsyuanIsNull() {
            addCriterion("jsyuan is null");
            return (Criteria) this;
        }

        public Criteria andJsyuanIsNotNull() {
            addCriterion("jsyuan is not null");
            return (Criteria) this;
        }

        public Criteria andJsyuanEqualTo(String value) {
            addCriterion("jsyuan =", value, "jsyuan");
            return (Criteria) this;
        }

        public Criteria andJsyuanNotEqualTo(String value) {
            addCriterion("jsyuan <>", value, "jsyuan");
            return (Criteria) this;
        }

        public Criteria andJsyuanGreaterThan(String value) {
            addCriterion("jsyuan >", value, "jsyuan");
            return (Criteria) this;
        }

        public Criteria andJsyuanGreaterThanOrEqualTo(String value) {
            addCriterion("jsyuan >=", value, "jsyuan");
            return (Criteria) this;
        }

        public Criteria andJsyuanLessThan(String value) {
            addCriterion("jsyuan <", value, "jsyuan");
            return (Criteria) this;
        }

        public Criteria andJsyuanLessThanOrEqualTo(String value) {
            addCriterion("jsyuan <=", value, "jsyuan");
            return (Criteria) this;
        }

        public Criteria andJsyuanLike(String value) {
            addCriterion("jsyuan like", value, "jsyuan");
            return (Criteria) this;
        }

        public Criteria andJsyuanNotLike(String value) {
            addCriterion("jsyuan not like", value, "jsyuan");
            return (Criteria) this;
        }

        public Criteria andJsyuanIn(List<String> values) {
            addCriterion("jsyuan in", values, "jsyuan");
            return (Criteria) this;
        }

        public Criteria andJsyuanNotIn(List<String> values) {
            addCriterion("jsyuan not in", values, "jsyuan");
            return (Criteria) this;
        }

        public Criteria andJsyuanBetween(String value1, String value2) {
            addCriterion("jsyuan between", value1, value2, "jsyuan");
            return (Criteria) this;
        }

        public Criteria andJsyuanNotBetween(String value1, String value2) {
            addCriterion("jsyuan not between", value1, value2, "jsyuan");
            return (Criteria) this;
        }

        public Criteria andJoininstimesIsNull() {
            addCriterion("joininstimes is null");
            return (Criteria) this;
        }

        public Criteria andJoininstimesIsNotNull() {
            addCriterion("joininstimes is not null");
            return (Criteria) this;
        }

        public Criteria andJoininstimesEqualTo(Date value) {
            addCriterionForJDBCDate("joininstimes =", value, "joininstimes");
            return (Criteria) this;
        }

        public Criteria andJoininstimesNotEqualTo(Date value) {
            addCriterionForJDBCDate("joininstimes <>", value, "joininstimes");
            return (Criteria) this;
        }

        public Criteria andJoininstimesGreaterThan(Date value) {
            addCriterionForJDBCDate("joininstimes >", value, "joininstimes");
            return (Criteria) this;
        }

        public Criteria andJoininstimesGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("joininstimes >=", value, "joininstimes");
            return (Criteria) this;
        }

        public Criteria andJoininstimesLessThan(Date value) {
            addCriterionForJDBCDate("joininstimes <", value, "joininstimes");
            return (Criteria) this;
        }

        public Criteria andJoininstimesLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("joininstimes <=", value, "joininstimes");
            return (Criteria) this;
        }

        public Criteria andJoininstimesIn(List<Date> values) {
            addCriterionForJDBCDate("joininstimes in", values, "joininstimes");
            return (Criteria) this;
        }

        public Criteria andJoininstimesNotIn(List<Date> values) {
            addCriterionForJDBCDate("joininstimes not in", values, "joininstimes");
            return (Criteria) this;
        }

        public Criteria andJoininstimesBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("joininstimes between", value1, value2, "joininstimes");
            return (Criteria) this;
        }

        public Criteria andJoininstimesNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("joininstimes not between", value1, value2, "joininstimes");
            return (Criteria) this;
        }

        public Criteria andPredictcompletetimeIsNull() {
            addCriterion("predictcompletetime is null");
            return (Criteria) this;
        }

        public Criteria andPredictcompletetimeIsNotNull() {
            addCriterion("predictcompletetime is not null");
            return (Criteria) this;
        }

        public Criteria andPredictcompletetimeEqualTo(Date value) {
            addCriterionForJDBCDate("predictcompletetime =", value, "predictcompletetime");
            return (Criteria) this;
        }

        public Criteria andPredictcompletetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("predictcompletetime <>", value, "predictcompletetime");
            return (Criteria) this;
        }

        public Criteria andPredictcompletetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("predictcompletetime >", value, "predictcompletetime");
            return (Criteria) this;
        }

        public Criteria andPredictcompletetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("predictcompletetime >=", value, "predictcompletetime");
            return (Criteria) this;
        }

        public Criteria andPredictcompletetimeLessThan(Date value) {
            addCriterionForJDBCDate("predictcompletetime <", value, "predictcompletetime");
            return (Criteria) this;
        }

        public Criteria andPredictcompletetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("predictcompletetime <=", value, "predictcompletetime");
            return (Criteria) this;
        }

        public Criteria andPredictcompletetimeIn(List<Date> values) {
            addCriterionForJDBCDate("predictcompletetime in", values, "predictcompletetime");
            return (Criteria) this;
        }

        public Criteria andPredictcompletetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("predictcompletetime not in", values, "predictcompletetime");
            return (Criteria) this;
        }

        public Criteria andPredictcompletetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("predictcompletetime between", value1, value2, "predictcompletetime");
            return (Criteria) this;
        }

        public Criteria andPredictcompletetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("predictcompletetime not between", value1, value2, "predictcompletetime");
            return (Criteria) this;
        }

        public Criteria andPredicttimeIsNull() {
            addCriterion("predicttime is null");
            return (Criteria) this;
        }

        public Criteria andPredicttimeIsNotNull() {
            addCriterion("predicttime is not null");
            return (Criteria) this;
        }

        public Criteria andPredicttimeEqualTo(Date value) {
            addCriterionForJDBCDate("predicttime =", value, "predicttime");
            return (Criteria) this;
        }

        public Criteria andPredicttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("predicttime <>", value, "predicttime");
            return (Criteria) this;
        }

        public Criteria andPredicttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("predicttime >", value, "predicttime");
            return (Criteria) this;
        }

        public Criteria andPredicttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("predicttime >=", value, "predicttime");
            return (Criteria) this;
        }

        public Criteria andPredicttimeLessThan(Date value) {
            addCriterionForJDBCDate("predicttime <", value, "predicttime");
            return (Criteria) this;
        }

        public Criteria andPredicttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("predicttime <=", value, "predicttime");
            return (Criteria) this;
        }

        public Criteria andPredicttimeIn(List<Date> values) {
            addCriterionForJDBCDate("predicttime in", values, "predicttime");
            return (Criteria) this;
        }

        public Criteria andPredicttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("predicttime not in", values, "predicttime");
            return (Criteria) this;
        }

        public Criteria andPredicttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("predicttime between", value1, value2, "predicttime");
            return (Criteria) this;
        }

        public Criteria andPredicttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("predicttime not between", value1, value2, "predicttime");
            return (Criteria) this;
        }

        public Criteria andBudgetmoneyIsNull() {
            addCriterion("budgetmoney is null");
            return (Criteria) this;
        }

        public Criteria andBudgetmoneyIsNotNull() {
            addCriterion("budgetmoney is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetmoneyEqualTo(Float value) {
            addCriterion("budgetmoney =", value, "budgetmoney");
            return (Criteria) this;
        }

        public Criteria andBudgetmoneyNotEqualTo(Float value) {
            addCriterion("budgetmoney <>", value, "budgetmoney");
            return (Criteria) this;
        }

        public Criteria andBudgetmoneyGreaterThan(Float value) {
            addCriterion("budgetmoney >", value, "budgetmoney");
            return (Criteria) this;
        }

        public Criteria andBudgetmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("budgetmoney >=", value, "budgetmoney");
            return (Criteria) this;
        }

        public Criteria andBudgetmoneyLessThan(Float value) {
            addCriterion("budgetmoney <", value, "budgetmoney");
            return (Criteria) this;
        }

        public Criteria andBudgetmoneyLessThanOrEqualTo(Float value) {
            addCriterion("budgetmoney <=", value, "budgetmoney");
            return (Criteria) this;
        }

        public Criteria andBudgetmoneyIn(List<Float> values) {
            addCriterion("budgetmoney in", values, "budgetmoney");
            return (Criteria) this;
        }

        public Criteria andBudgetmoneyNotIn(List<Float> values) {
            addCriterion("budgetmoney not in", values, "budgetmoney");
            return (Criteria) this;
        }

        public Criteria andBudgetmoneyBetween(Float value1, Float value2) {
            addCriterion("budgetmoney between", value1, value2, "budgetmoney");
            return (Criteria) this;
        }

        public Criteria andBudgetmoneyNotBetween(Float value1, Float value2) {
            addCriterion("budgetmoney not between", value1, value2, "budgetmoney");
            return (Criteria) this;
        }

        public Criteria andInseventIsNull() {
            addCriterion("insevent is null");
            return (Criteria) this;
        }

        public Criteria andInseventIsNotNull() {
            addCriterion("insevent is not null");
            return (Criteria) this;
        }

        public Criteria andInseventEqualTo(String value) {
            addCriterion("insevent =", value, "insevent");
            return (Criteria) this;
        }

        public Criteria andInseventNotEqualTo(String value) {
            addCriterion("insevent <>", value, "insevent");
            return (Criteria) this;
        }

        public Criteria andInseventGreaterThan(String value) {
            addCriterion("insevent >", value, "insevent");
            return (Criteria) this;
        }

        public Criteria andInseventGreaterThanOrEqualTo(String value) {
            addCriterion("insevent >=", value, "insevent");
            return (Criteria) this;
        }

        public Criteria andInseventLessThan(String value) {
            addCriterion("insevent <", value, "insevent");
            return (Criteria) this;
        }

        public Criteria andInseventLessThanOrEqualTo(String value) {
            addCriterion("insevent <=", value, "insevent");
            return (Criteria) this;
        }

        public Criteria andInseventLike(String value) {
            addCriterion("insevent like", value, "insevent");
            return (Criteria) this;
        }

        public Criteria andInseventNotLike(String value) {
            addCriterion("insevent not like", value, "insevent");
            return (Criteria) this;
        }

        public Criteria andInseventIn(List<String> values) {
            addCriterion("insevent in", values, "insevent");
            return (Criteria) this;
        }

        public Criteria andInseventNotIn(List<String> values) {
            addCriterion("insevent not in", values, "insevent");
            return (Criteria) this;
        }

        public Criteria andInseventBetween(String value1, String value2) {
            addCriterion("insevent between", value1, value2, "insevent");
            return (Criteria) this;
        }

        public Criteria andInseventNotBetween(String value1, String value2) {
            addCriterion("insevent not between", value1, value2, "insevent");
            return (Criteria) this;
        }

        public Criteria andIsznIsNull() {
            addCriterion("iszn is null");
            return (Criteria) this;
        }

        public Criteria andIsznIsNotNull() {
            addCriterion("iszn is not null");
            return (Criteria) this;
        }

        public Criteria andIsznEqualTo(Boolean value) {
            addCriterion("iszn =", value, "iszn");
            return (Criteria) this;
        }

        public Criteria andIsznNotEqualTo(Boolean value) {
            addCriterion("iszn <>", value, "iszn");
            return (Criteria) this;
        }

        public Criteria andIsznGreaterThan(Boolean value) {
            addCriterion("iszn >", value, "iszn");
            return (Criteria) this;
        }

        public Criteria andIsznGreaterThanOrEqualTo(Boolean value) {
            addCriterion("iszn >=", value, "iszn");
            return (Criteria) this;
        }

        public Criteria andIsznLessThan(Boolean value) {
            addCriterion("iszn <", value, "iszn");
            return (Criteria) this;
        }

        public Criteria andIsznLessThanOrEqualTo(Boolean value) {
            addCriterion("iszn <=", value, "iszn");
            return (Criteria) this;
        }

        public Criteria andIsznIn(List<Boolean> values) {
            addCriterion("iszn in", values, "iszn");
            return (Criteria) this;
        }

        public Criteria andIsznNotIn(List<Boolean> values) {
            addCriterion("iszn not in", values, "iszn");
            return (Criteria) this;
        }

        public Criteria andIsznBetween(Boolean value1, Boolean value2) {
            addCriterion("iszn between", value1, value2, "iszn");
            return (Criteria) this;
        }

        public Criteria andIsznNotBetween(Boolean value1, Boolean value2) {
            addCriterion("iszn not between", value1, value2, "iszn");
            return (Criteria) this;
        }

        public Criteria andIfjsIsNull() {
            addCriterion("ifjs is null");
            return (Criteria) this;
        }

        public Criteria andIfjsIsNotNull() {
            addCriterion("ifjs is not null");
            return (Criteria) this;
        }

        public Criteria andIfjsEqualTo(Boolean value) {
            addCriterion("ifjs =", value, "ifjs");
            return (Criteria) this;
        }

        public Criteria andIfjsNotEqualTo(Boolean value) {
            addCriterion("ifjs <>", value, "ifjs");
            return (Criteria) this;
        }

        public Criteria andIfjsGreaterThan(Boolean value) {
            addCriterion("ifjs >", value, "ifjs");
            return (Criteria) this;
        }

        public Criteria andIfjsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ifjs >=", value, "ifjs");
            return (Criteria) this;
        }

        public Criteria andIfjsLessThan(Boolean value) {
            addCriterion("ifjs <", value, "ifjs");
            return (Criteria) this;
        }

        public Criteria andIfjsLessThanOrEqualTo(Boolean value) {
            addCriterion("ifjs <=", value, "ifjs");
            return (Criteria) this;
        }

        public Criteria andIfjsIn(List<Boolean> values) {
            addCriterion("ifjs in", values, "ifjs");
            return (Criteria) this;
        }

        public Criteria andIfjsNotIn(List<Boolean> values) {
            addCriterion("ifjs not in", values, "ifjs");
            return (Criteria) this;
        }

        public Criteria andIfjsBetween(Boolean value1, Boolean value2) {
            addCriterion("ifjs between", value1, value2, "ifjs");
            return (Criteria) this;
        }

        public Criteria andIfjsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ifjs not between", value1, value2, "ifjs");
            return (Criteria) this;
        }

        public Criteria andQcxinhaoIsNull() {
            addCriterion("qcxinhao is null");
            return (Criteria) this;
        }

        public Criteria andQcxinhaoIsNotNull() {
            addCriterion("qcxinhao is not null");
            return (Criteria) this;
        }

        public Criteria andQcxinhaoEqualTo(String value) {
            addCriterion("qcxinhao =", value, "qcxinhao");
            return (Criteria) this;
        }

        public Criteria andQcxinhaoNotEqualTo(String value) {
            addCriterion("qcxinhao <>", value, "qcxinhao");
            return (Criteria) this;
        }

        public Criteria andQcxinhaoGreaterThan(String value) {
            addCriterion("qcxinhao >", value, "qcxinhao");
            return (Criteria) this;
        }

        public Criteria andQcxinhaoGreaterThanOrEqualTo(String value) {
            addCriterion("qcxinhao >=", value, "qcxinhao");
            return (Criteria) this;
        }

        public Criteria andQcxinhaoLessThan(String value) {
            addCriterion("qcxinhao <", value, "qcxinhao");
            return (Criteria) this;
        }

        public Criteria andQcxinhaoLessThanOrEqualTo(String value) {
            addCriterion("qcxinhao <=", value, "qcxinhao");
            return (Criteria) this;
        }

        public Criteria andQcxinhaoLike(String value) {
            addCriterion("qcxinhao like", value, "qcxinhao");
            return (Criteria) this;
        }

        public Criteria andQcxinhaoNotLike(String value) {
            addCriterion("qcxinhao not like", value, "qcxinhao");
            return (Criteria) this;
        }

        public Criteria andQcxinhaoIn(List<String> values) {
            addCriterion("qcxinhao in", values, "qcxinhao");
            return (Criteria) this;
        }

        public Criteria andQcxinhaoNotIn(List<String> values) {
            addCriterion("qcxinhao not in", values, "qcxinhao");
            return (Criteria) this;
        }

        public Criteria andQcxinhaoBetween(String value1, String value2) {
            addCriterion("qcxinhao between", value1, value2, "qcxinhao");
            return (Criteria) this;
        }

        public Criteria andQcxinhaoNotBetween(String value1, String value2) {
            addCriterion("qcxinhao not between", value1, value2, "qcxinhao");
            return (Criteria) this;
        }

        public Criteria andChezhunameIsNull() {
            addCriterion("chezhuname is null");
            return (Criteria) this;
        }

        public Criteria andChezhunameIsNotNull() {
            addCriterion("chezhuname is not null");
            return (Criteria) this;
        }

        public Criteria andChezhunameEqualTo(String value) {
            addCriterion("chezhuname =", value, "chezhuname");
            return (Criteria) this;
        }

        public Criteria andChezhunameNotEqualTo(String value) {
            addCriterion("chezhuname <>", value, "chezhuname");
            return (Criteria) this;
        }

        public Criteria andChezhunameGreaterThan(String value) {
            addCriterion("chezhuname >", value, "chezhuname");
            return (Criteria) this;
        }

        public Criteria andChezhunameGreaterThanOrEqualTo(String value) {
            addCriterion("chezhuname >=", value, "chezhuname");
            return (Criteria) this;
        }

        public Criteria andChezhunameLessThan(String value) {
            addCriterion("chezhuname <", value, "chezhuname");
            return (Criteria) this;
        }

        public Criteria andChezhunameLessThanOrEqualTo(String value) {
            addCriterion("chezhuname <=", value, "chezhuname");
            return (Criteria) this;
        }

        public Criteria andChezhunameLike(String value) {
            addCriterion("chezhuname like", value, "chezhuname");
            return (Criteria) this;
        }

        public Criteria andChezhunameNotLike(String value) {
            addCriterion("chezhuname not like", value, "chezhuname");
            return (Criteria) this;
        }

        public Criteria andChezhunameIn(List<String> values) {
            addCriterion("chezhuname in", values, "chezhuname");
            return (Criteria) this;
        }

        public Criteria andChezhunameNotIn(List<String> values) {
            addCriterion("chezhuname not in", values, "chezhuname");
            return (Criteria) this;
        }

        public Criteria andChezhunameBetween(String value1, String value2) {
            addCriterion("chezhuname between", value1, value2, "chezhuname");
            return (Criteria) this;
        }

        public Criteria andChezhunameNotBetween(String value1, String value2) {
            addCriterion("chezhuname not between", value1, value2, "chezhuname");
            return (Criteria) this;
        }

        public Criteria andYewutypeIsNull() {
            addCriterion("yewutype is null");
            return (Criteria) this;
        }

        public Criteria andYewutypeIsNotNull() {
            addCriterion("yewutype is not null");
            return (Criteria) this;
        }

        public Criteria andYewutypeEqualTo(String value) {
            addCriterion("yewutype =", value, "yewutype");
            return (Criteria) this;
        }

        public Criteria andYewutypeNotEqualTo(String value) {
            addCriterion("yewutype <>", value, "yewutype");
            return (Criteria) this;
        }

        public Criteria andYewutypeGreaterThan(String value) {
            addCriterion("yewutype >", value, "yewutype");
            return (Criteria) this;
        }

        public Criteria andYewutypeGreaterThanOrEqualTo(String value) {
            addCriterion("yewutype >=", value, "yewutype");
            return (Criteria) this;
        }

        public Criteria andYewutypeLessThan(String value) {
            addCriterion("yewutype <", value, "yewutype");
            return (Criteria) this;
        }

        public Criteria andYewutypeLessThanOrEqualTo(String value) {
            addCriterion("yewutype <=", value, "yewutype");
            return (Criteria) this;
        }

        public Criteria andYewutypeLike(String value) {
            addCriterion("yewutype like", value, "yewutype");
            return (Criteria) this;
        }

        public Criteria andYewutypeNotLike(String value) {
            addCriterion("yewutype not like", value, "yewutype");
            return (Criteria) this;
        }

        public Criteria andYewutypeIn(List<String> values) {
            addCriterion("yewutype in", values, "yewutype");
            return (Criteria) this;
        }

        public Criteria andYewutypeNotIn(List<String> values) {
            addCriterion("yewutype not in", values, "yewutype");
            return (Criteria) this;
        }

        public Criteria andYewutypeBetween(String value1, String value2) {
            addCriterion("yewutype between", value1, value2, "yewutype");
            return (Criteria) this;
        }

        public Criteria andYewutypeNotBetween(String value1, String value2) {
            addCriterion("yewutype not between", value1, value2, "yewutype");
            return (Criteria) this;
        }

        public Criteria andJiesuantypeIsNull() {
            addCriterion("jiesuantype is null");
            return (Criteria) this;
        }

        public Criteria andJiesuantypeIsNotNull() {
            addCriterion("jiesuantype is not null");
            return (Criteria) this;
        }

        public Criteria andJiesuantypeEqualTo(String value) {
            addCriterion("jiesuantype =", value, "jiesuantype");
            return (Criteria) this;
        }

        public Criteria andJiesuantypeNotEqualTo(String value) {
            addCriterion("jiesuantype <>", value, "jiesuantype");
            return (Criteria) this;
        }

        public Criteria andJiesuantypeGreaterThan(String value) {
            addCriterion("jiesuantype >", value, "jiesuantype");
            return (Criteria) this;
        }

        public Criteria andJiesuantypeGreaterThanOrEqualTo(String value) {
            addCriterion("jiesuantype >=", value, "jiesuantype");
            return (Criteria) this;
        }

        public Criteria andJiesuantypeLessThan(String value) {
            addCriterion("jiesuantype <", value, "jiesuantype");
            return (Criteria) this;
        }

        public Criteria andJiesuantypeLessThanOrEqualTo(String value) {
            addCriterion("jiesuantype <=", value, "jiesuantype");
            return (Criteria) this;
        }

        public Criteria andJiesuantypeLike(String value) {
            addCriterion("jiesuantype like", value, "jiesuantype");
            return (Criteria) this;
        }

        public Criteria andJiesuantypeNotLike(String value) {
            addCriterion("jiesuantype not like", value, "jiesuantype");
            return (Criteria) this;
        }

        public Criteria andJiesuantypeIn(List<String> values) {
            addCriterion("jiesuantype in", values, "jiesuantype");
            return (Criteria) this;
        }

        public Criteria andJiesuantypeNotIn(List<String> values) {
            addCriterion("jiesuantype not in", values, "jiesuantype");
            return (Criteria) this;
        }

        public Criteria andJiesuantypeBetween(String value1, String value2) {
            addCriterion("jiesuantype between", value1, value2, "jiesuantype");
            return (Criteria) this;
        }

        public Criteria andJiesuantypeNotBetween(String value1, String value2) {
            addCriterion("jiesuantype not between", value1, value2, "jiesuantype");
            return (Criteria) this;
        }

        public Criteria andShigonclassIsNull() {
            addCriterion("shigonclass is null");
            return (Criteria) this;
        }

        public Criteria andShigonclassIsNotNull() {
            addCriterion("shigonclass is not null");
            return (Criteria) this;
        }

        public Criteria andShigonclassEqualTo(String value) {
            addCriterion("shigonclass =", value, "shigonclass");
            return (Criteria) this;
        }

        public Criteria andShigonclassNotEqualTo(String value) {
            addCriterion("shigonclass <>", value, "shigonclass");
            return (Criteria) this;
        }

        public Criteria andShigonclassGreaterThan(String value) {
            addCriterion("shigonclass >", value, "shigonclass");
            return (Criteria) this;
        }

        public Criteria andShigonclassGreaterThanOrEqualTo(String value) {
            addCriterion("shigonclass >=", value, "shigonclass");
            return (Criteria) this;
        }

        public Criteria andShigonclassLessThan(String value) {
            addCriterion("shigonclass <", value, "shigonclass");
            return (Criteria) this;
        }

        public Criteria andShigonclassLessThanOrEqualTo(String value) {
            addCriterion("shigonclass <=", value, "shigonclass");
            return (Criteria) this;
        }

        public Criteria andShigonclassLike(String value) {
            addCriterion("shigonclass like", value, "shigonclass");
            return (Criteria) this;
        }

        public Criteria andShigonclassNotLike(String value) {
            addCriterion("shigonclass not like", value, "shigonclass");
            return (Criteria) this;
        }

        public Criteria andShigonclassIn(List<String> values) {
            addCriterion("shigonclass in", values, "shigonclass");
            return (Criteria) this;
        }

        public Criteria andShigonclassNotIn(List<String> values) {
            addCriterion("shigonclass not in", values, "shigonclass");
            return (Criteria) this;
        }

        public Criteria andShigonclassBetween(String value1, String value2) {
            addCriterion("shigonclass between", value1, value2, "shigonclass");
            return (Criteria) this;
        }

        public Criteria andShigonclassNotBetween(String value1, String value2) {
            addCriterion("shigonclass not between", value1, value2, "shigonclass");
            return (Criteria) this;
        }

        public Criteria andToptimeIsNull() {
            addCriterion("toptime is null");
            return (Criteria) this;
        }

        public Criteria andToptimeIsNotNull() {
            addCriterion("toptime is not null");
            return (Criteria) this;
        }

        public Criteria andToptimeEqualTo(String value) {
            addCriterion("toptime =", value, "toptime");
            return (Criteria) this;
        }

        public Criteria andToptimeNotEqualTo(String value) {
            addCriterion("toptime <>", value, "toptime");
            return (Criteria) this;
        }

        public Criteria andToptimeGreaterThan(String value) {
            addCriterion("toptime >", value, "toptime");
            return (Criteria) this;
        }

        public Criteria andToptimeGreaterThanOrEqualTo(String value) {
            addCriterion("toptime >=", value, "toptime");
            return (Criteria) this;
        }

        public Criteria andToptimeLessThan(String value) {
            addCriterion("toptime <", value, "toptime");
            return (Criteria) this;
        }

        public Criteria andToptimeLessThanOrEqualTo(String value) {
            addCriterion("toptime <=", value, "toptime");
            return (Criteria) this;
        }

        public Criteria andToptimeLike(String value) {
            addCriterion("toptime like", value, "toptime");
            return (Criteria) this;
        }

        public Criteria andToptimeNotLike(String value) {
            addCriterion("toptime not like", value, "toptime");
            return (Criteria) this;
        }

        public Criteria andToptimeIn(List<String> values) {
            addCriterion("toptime in", values, "toptime");
            return (Criteria) this;
        }

        public Criteria andToptimeNotIn(List<String> values) {
            addCriterion("toptime not in", values, "toptime");
            return (Criteria) this;
        }

        public Criteria andToptimeBetween(String value1, String value2) {
            addCriterion("toptime between", value1, value2, "toptime");
            return (Criteria) this;
        }

        public Criteria andToptimeNotBetween(String value1, String value2) {
            addCriterion("toptime not between", value1, value2, "toptime");
            return (Criteria) this;
        }

        public Criteria andJiecherenIsNull() {
            addCriterion("jiecheren is null");
            return (Criteria) this;
        }

        public Criteria andJiecherenIsNotNull() {
            addCriterion("jiecheren is not null");
            return (Criteria) this;
        }

        public Criteria andJiecherenEqualTo(String value) {
            addCriterion("jiecheren =", value, "jiecheren");
            return (Criteria) this;
        }

        public Criteria andJiecherenNotEqualTo(String value) {
            addCriterion("jiecheren <>", value, "jiecheren");
            return (Criteria) this;
        }

        public Criteria andJiecherenGreaterThan(String value) {
            addCriterion("jiecheren >", value, "jiecheren");
            return (Criteria) this;
        }

        public Criteria andJiecherenGreaterThanOrEqualTo(String value) {
            addCriterion("jiecheren >=", value, "jiecheren");
            return (Criteria) this;
        }

        public Criteria andJiecherenLessThan(String value) {
            addCriterion("jiecheren <", value, "jiecheren");
            return (Criteria) this;
        }

        public Criteria andJiecherenLessThanOrEqualTo(String value) {
            addCriterion("jiecheren <=", value, "jiecheren");
            return (Criteria) this;
        }

        public Criteria andJiecherenLike(String value) {
            addCriterion("jiecheren like", value, "jiecheren");
            return (Criteria) this;
        }

        public Criteria andJiecherenNotLike(String value) {
            addCriterion("jiecheren not like", value, "jiecheren");
            return (Criteria) this;
        }

        public Criteria andJiecherenIn(List<String> values) {
            addCriterion("jiecheren in", values, "jiecheren");
            return (Criteria) this;
        }

        public Criteria andJiecherenNotIn(List<String> values) {
            addCriterion("jiecheren not in", values, "jiecheren");
            return (Criteria) this;
        }

        public Criteria andJiecherenBetween(String value1, String value2) {
            addCriterion("jiecheren between", value1, value2, "jiecheren");
            return (Criteria) this;
        }

        public Criteria andJiecherenNotBetween(String value1, String value2) {
            addCriterion("jiecheren not between", value1, value2, "jiecheren");
            return (Criteria) this;
        }

        public Criteria andDjidIsNull() {
            addCriterion("djid is null");
            return (Criteria) this;
        }

        public Criteria andDjidIsNotNull() {
            addCriterion("djid is not null");
            return (Criteria) this;
        }

        public Criteria andDjidEqualTo(Integer value) {
            addCriterion("djid =", value, "djid");
            return (Criteria) this;
        }

        public Criteria andDjidNotEqualTo(Integer value) {
            addCriterion("djid <>", value, "djid");
            return (Criteria) this;
        }

        public Criteria andDjidGreaterThan(Integer value) {
            addCriterion("djid >", value, "djid");
            return (Criteria) this;
        }

        public Criteria andDjidGreaterThanOrEqualTo(Integer value) {
            addCriterion("djid >=", value, "djid");
            return (Criteria) this;
        }

        public Criteria andDjidLessThan(Integer value) {
            addCriterion("djid <", value, "djid");
            return (Criteria) this;
        }

        public Criteria andDjidLessThanOrEqualTo(Integer value) {
            addCriterion("djid <=", value, "djid");
            return (Criteria) this;
        }

        public Criteria andDjidIn(List<Integer> values) {
            addCriterion("djid in", values, "djid");
            return (Criteria) this;
        }

        public Criteria andDjidNotIn(List<Integer> values) {
            addCriterion("djid not in", values, "djid");
            return (Criteria) this;
        }

        public Criteria andDjidBetween(Integer value1, Integer value2) {
            addCriterion("djid between", value1, value2, "djid");
            return (Criteria) this;
        }

        public Criteria andDjidNotBetween(Integer value1, Integer value2) {
            addCriterion("djid not between", value1, value2, "djid");
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