package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andEmnameIsNull() {
            addCriterion("emname is null");
            return (Criteria) this;
        }

        public Criteria andEmnameIsNotNull() {
            addCriterion("emname is not null");
            return (Criteria) this;
        }

        public Criteria andEmnameEqualTo(String value) {
            addCriterion("emname =", value, "emname");
            return (Criteria) this;
        }

        public Criteria andEmnameNotEqualTo(String value) {
            addCriterion("emname <>", value, "emname");
            return (Criteria) this;
        }

        public Criteria andEmnameGreaterThan(String value) {
            addCriterion("emname >", value, "emname");
            return (Criteria) this;
        }

        public Criteria andEmnameGreaterThanOrEqualTo(String value) {
            addCriterion("emname >=", value, "emname");
            return (Criteria) this;
        }

        public Criteria andEmnameLessThan(String value) {
            addCriterion("emname <", value, "emname");
            return (Criteria) this;
        }

        public Criteria andEmnameLessThanOrEqualTo(String value) {
            addCriterion("emname <=", value, "emname");
            return (Criteria) this;
        }

        public Criteria andEmnameLike(String value) {
            addCriterion("emname like", value, "emname");
            return (Criteria) this;
        }

        public Criteria andEmnameNotLike(String value) {
            addCriterion("emname not like", value, "emname");
            return (Criteria) this;
        }

        public Criteria andEmnameIn(List<String> values) {
            addCriterion("emname in", values, "emname");
            return (Criteria) this;
        }

        public Criteria andEmnameNotIn(List<String> values) {
            addCriterion("emname not in", values, "emname");
            return (Criteria) this;
        }

        public Criteria andEmnameBetween(String value1, String value2) {
            addCriterion("emname between", value1, value2, "emname");
            return (Criteria) this;
        }

        public Criteria andEmnameNotBetween(String value1, String value2) {
            addCriterion("emname not between", value1, value2, "emname");
            return (Criteria) this;
        }

        public Criteria andEmsexIsNull() {
            addCriterion("emsex is null");
            return (Criteria) this;
        }

        public Criteria andEmsexIsNotNull() {
            addCriterion("emsex is not null");
            return (Criteria) this;
        }

        public Criteria andEmsexEqualTo(String value) {
            addCriterion("emsex =", value, "emsex");
            return (Criteria) this;
        }

        public Criteria andEmsexNotEqualTo(String value) {
            addCriterion("emsex <>", value, "emsex");
            return (Criteria) this;
        }

        public Criteria andEmsexGreaterThan(String value) {
            addCriterion("emsex >", value, "emsex");
            return (Criteria) this;
        }

        public Criteria andEmsexGreaterThanOrEqualTo(String value) {
            addCriterion("emsex >=", value, "emsex");
            return (Criteria) this;
        }

        public Criteria andEmsexLessThan(String value) {
            addCriterion("emsex <", value, "emsex");
            return (Criteria) this;
        }

        public Criteria andEmsexLessThanOrEqualTo(String value) {
            addCriterion("emsex <=", value, "emsex");
            return (Criteria) this;
        }

        public Criteria andEmsexLike(String value) {
            addCriterion("emsex like", value, "emsex");
            return (Criteria) this;
        }

        public Criteria andEmsexNotLike(String value) {
            addCriterion("emsex not like", value, "emsex");
            return (Criteria) this;
        }

        public Criteria andEmsexIn(List<String> values) {
            addCriterion("emsex in", values, "emsex");
            return (Criteria) this;
        }

        public Criteria andEmsexNotIn(List<String> values) {
            addCriterion("emsex not in", values, "emsex");
            return (Criteria) this;
        }

        public Criteria andEmsexBetween(String value1, String value2) {
            addCriterion("emsex between", value1, value2, "emsex");
            return (Criteria) this;
        }

        public Criteria andEmsexNotBetween(String value1, String value2) {
            addCriterion("emsex not between", value1, value2, "emsex");
            return (Criteria) this;
        }

        public Criteria andEmmdIsNull() {
            addCriterion("emmd is null");
            return (Criteria) this;
        }

        public Criteria andEmmdIsNotNull() {
            addCriterion("emmd is not null");
            return (Criteria) this;
        }

        public Criteria andEmmdEqualTo(Integer value) {
            addCriterion("emmd =", value, "emmd");
            return (Criteria) this;
        }

        public Criteria andEmmdNotEqualTo(Integer value) {
            addCriterion("emmd <>", value, "emmd");
            return (Criteria) this;
        }

        public Criteria andEmmdGreaterThan(Integer value) {
            addCriterion("emmd >", value, "emmd");
            return (Criteria) this;
        }

        public Criteria andEmmdGreaterThanOrEqualTo(Integer value) {
            addCriterion("emmd >=", value, "emmd");
            return (Criteria) this;
        }

        public Criteria andEmmdLessThan(Integer value) {
            addCriterion("emmd <", value, "emmd");
            return (Criteria) this;
        }

        public Criteria andEmmdLessThanOrEqualTo(Integer value) {
            addCriterion("emmd <=", value, "emmd");
            return (Criteria) this;
        }

        public Criteria andEmmdIn(List<Integer> values) {
            addCriterion("emmd in", values, "emmd");
            return (Criteria) this;
        }

        public Criteria andEmmdNotIn(List<Integer> values) {
            addCriterion("emmd not in", values, "emmd");
            return (Criteria) this;
        }

        public Criteria andEmmdBetween(Integer value1, Integer value2) {
            addCriterion("emmd between", value1, value2, "emmd");
            return (Criteria) this;
        }

        public Criteria andEmmdNotBetween(Integer value1, Integer value2) {
            addCriterion("emmd not between", value1, value2, "emmd");
            return (Criteria) this;
        }

        public Criteria andEmbmIsNull() {
            addCriterion("embm is null");
            return (Criteria) this;
        }

        public Criteria andEmbmIsNotNull() {
            addCriterion("embm is not null");
            return (Criteria) this;
        }

        public Criteria andEmbmEqualTo(Integer value) {
            addCriterion("embm =", value, "embm");
            return (Criteria) this;
        }

        public Criteria andEmbmNotEqualTo(Integer value) {
            addCriterion("embm <>", value, "embm");
            return (Criteria) this;
        }

        public Criteria andEmbmGreaterThan(Integer value) {
            addCriterion("embm >", value, "embm");
            return (Criteria) this;
        }

        public Criteria andEmbmGreaterThanOrEqualTo(Integer value) {
            addCriterion("embm >=", value, "embm");
            return (Criteria) this;
        }

        public Criteria andEmbmLessThan(Integer value) {
            addCriterion("embm <", value, "embm");
            return (Criteria) this;
        }

        public Criteria andEmbmLessThanOrEqualTo(Integer value) {
            addCriterion("embm <=", value, "embm");
            return (Criteria) this;
        }

        public Criteria andEmbmIn(List<Integer> values) {
            addCriterion("embm in", values, "embm");
            return (Criteria) this;
        }

        public Criteria andEmbmNotIn(List<Integer> values) {
            addCriterion("embm not in", values, "embm");
            return (Criteria) this;
        }

        public Criteria andEmbmBetween(Integer value1, Integer value2) {
            addCriterion("embm between", value1, value2, "embm");
            return (Criteria) this;
        }

        public Criteria andEmbmNotBetween(Integer value1, Integer value2) {
            addCriterion("embm not between", value1, value2, "embm");
            return (Criteria) this;
        }

        public Criteria andEmadminIsNull() {
            addCriterion("emadmin is null");
            return (Criteria) this;
        }

        public Criteria andEmadminIsNotNull() {
            addCriterion("emadmin is not null");
            return (Criteria) this;
        }

        public Criteria andEmadminEqualTo(String value) {
            addCriterion("emadmin =", value, "emadmin");
            return (Criteria) this;
        }

        public Criteria andEmadminNotEqualTo(String value) {
            addCriterion("emadmin <>", value, "emadmin");
            return (Criteria) this;
        }

        public Criteria andEmadminGreaterThan(String value) {
            addCriterion("emadmin >", value, "emadmin");
            return (Criteria) this;
        }

        public Criteria andEmadminGreaterThanOrEqualTo(String value) {
            addCriterion("emadmin >=", value, "emadmin");
            return (Criteria) this;
        }

        public Criteria andEmadminLessThan(String value) {
            addCriterion("emadmin <", value, "emadmin");
            return (Criteria) this;
        }

        public Criteria andEmadminLessThanOrEqualTo(String value) {
            addCriterion("emadmin <=", value, "emadmin");
            return (Criteria) this;
        }

        public Criteria andEmadminLike(String value) {
            addCriterion("emadmin like", value, "emadmin");
            return (Criteria) this;
        }

        public Criteria andEmadminNotLike(String value) {
            addCriterion("emadmin not like", value, "emadmin");
            return (Criteria) this;
        }

        public Criteria andEmadminIn(List<String> values) {
            addCriterion("emadmin in", values, "emadmin");
            return (Criteria) this;
        }

        public Criteria andEmadminNotIn(List<String> values) {
            addCriterion("emadmin not in", values, "emadmin");
            return (Criteria) this;
        }

        public Criteria andEmadminBetween(String value1, String value2) {
            addCriterion("emadmin between", value1, value2, "emadmin");
            return (Criteria) this;
        }

        public Criteria andEmadminNotBetween(String value1, String value2) {
            addCriterion("emadmin not between", value1, value2, "emadmin");
            return (Criteria) this;
        }

        public Criteria andEmstzkIsNull() {
            addCriterion("emstzk is null");
            return (Criteria) this;
        }

        public Criteria andEmstzkIsNotNull() {
            addCriterion("emstzk is not null");
            return (Criteria) this;
        }

        public Criteria andEmstzkEqualTo(String value) {
            addCriterion("emstzk =", value, "emstzk");
            return (Criteria) this;
        }

        public Criteria andEmstzkNotEqualTo(String value) {
            addCriterion("emstzk <>", value, "emstzk");
            return (Criteria) this;
        }

        public Criteria andEmstzkGreaterThan(String value) {
            addCriterion("emstzk >", value, "emstzk");
            return (Criteria) this;
        }

        public Criteria andEmstzkGreaterThanOrEqualTo(String value) {
            addCriterion("emstzk >=", value, "emstzk");
            return (Criteria) this;
        }

        public Criteria andEmstzkLessThan(String value) {
            addCriterion("emstzk <", value, "emstzk");
            return (Criteria) this;
        }

        public Criteria andEmstzkLessThanOrEqualTo(String value) {
            addCriterion("emstzk <=", value, "emstzk");
            return (Criteria) this;
        }

        public Criteria andEmstzkLike(String value) {
            addCriterion("emstzk like", value, "emstzk");
            return (Criteria) this;
        }

        public Criteria andEmstzkNotLike(String value) {
            addCriterion("emstzk not like", value, "emstzk");
            return (Criteria) this;
        }

        public Criteria andEmstzkIn(List<String> values) {
            addCriterion("emstzk in", values, "emstzk");
            return (Criteria) this;
        }

        public Criteria andEmstzkNotIn(List<String> values) {
            addCriterion("emstzk not in", values, "emstzk");
            return (Criteria) this;
        }

        public Criteria andEmstzkBetween(String value1, String value2) {
            addCriterion("emstzk between", value1, value2, "emstzk");
            return (Criteria) this;
        }

        public Criteria andEmstzkNotBetween(String value1, String value2) {
            addCriterion("emstzk not between", value1, value2, "emstzk");
            return (Criteria) this;
        }

        public Criteria andEmgwIsNull() {
            addCriterion("emgw is null");
            return (Criteria) this;
        }

        public Criteria andEmgwIsNotNull() {
            addCriterion("emgw is not null");
            return (Criteria) this;
        }

        public Criteria andEmgwEqualTo(String value) {
            addCriterion("emgw =", value, "emgw");
            return (Criteria) this;
        }

        public Criteria andEmgwNotEqualTo(String value) {
            addCriterion("emgw <>", value, "emgw");
            return (Criteria) this;
        }

        public Criteria andEmgwGreaterThan(String value) {
            addCriterion("emgw >", value, "emgw");
            return (Criteria) this;
        }

        public Criteria andEmgwGreaterThanOrEqualTo(String value) {
            addCriterion("emgw >=", value, "emgw");
            return (Criteria) this;
        }

        public Criteria andEmgwLessThan(String value) {
            addCriterion("emgw <", value, "emgw");
            return (Criteria) this;
        }

        public Criteria andEmgwLessThanOrEqualTo(String value) {
            addCriterion("emgw <=", value, "emgw");
            return (Criteria) this;
        }

        public Criteria andEmgwLike(String value) {
            addCriterion("emgw like", value, "emgw");
            return (Criteria) this;
        }

        public Criteria andEmgwNotLike(String value) {
            addCriterion("emgw not like", value, "emgw");
            return (Criteria) this;
        }

        public Criteria andEmgwIn(List<String> values) {
            addCriterion("emgw in", values, "emgw");
            return (Criteria) this;
        }

        public Criteria andEmgwNotIn(List<String> values) {
            addCriterion("emgw not in", values, "emgw");
            return (Criteria) this;
        }

        public Criteria andEmgwBetween(String value1, String value2) {
            addCriterion("emgw between", value1, value2, "emgw");
            return (Criteria) this;
        }

        public Criteria andEmgwNotBetween(String value1, String value2) {
            addCriterion("emgw not between", value1, value2, "emgw");
            return (Criteria) this;
        }

        public Criteria andEmheightIsNull() {
            addCriterion("emheight is null");
            return (Criteria) this;
        }

        public Criteria andEmheightIsNotNull() {
            addCriterion("emheight is not null");
            return (Criteria) this;
        }

        public Criteria andEmheightEqualTo(String value) {
            addCriterion("emheight =", value, "emheight");
            return (Criteria) this;
        }

        public Criteria andEmheightNotEqualTo(String value) {
            addCriterion("emheight <>", value, "emheight");
            return (Criteria) this;
        }

        public Criteria andEmheightGreaterThan(String value) {
            addCriterion("emheight >", value, "emheight");
            return (Criteria) this;
        }

        public Criteria andEmheightGreaterThanOrEqualTo(String value) {
            addCriterion("emheight >=", value, "emheight");
            return (Criteria) this;
        }

        public Criteria andEmheightLessThan(String value) {
            addCriterion("emheight <", value, "emheight");
            return (Criteria) this;
        }

        public Criteria andEmheightLessThanOrEqualTo(String value) {
            addCriterion("emheight <=", value, "emheight");
            return (Criteria) this;
        }

        public Criteria andEmheightLike(String value) {
            addCriterion("emheight like", value, "emheight");
            return (Criteria) this;
        }

        public Criteria andEmheightNotLike(String value) {
            addCriterion("emheight not like", value, "emheight");
            return (Criteria) this;
        }

        public Criteria andEmheightIn(List<String> values) {
            addCriterion("emheight in", values, "emheight");
            return (Criteria) this;
        }

        public Criteria andEmheightNotIn(List<String> values) {
            addCriterion("emheight not in", values, "emheight");
            return (Criteria) this;
        }

        public Criteria andEmheightBetween(String value1, String value2) {
            addCriterion("emheight between", value1, value2, "emheight");
            return (Criteria) this;
        }

        public Criteria andEmheightNotBetween(String value1, String value2) {
            addCriterion("emheight not between", value1, value2, "emheight");
            return (Criteria) this;
        }

        public Criteria andEmjgIsNull() {
            addCriterion("emjg is null");
            return (Criteria) this;
        }

        public Criteria andEmjgIsNotNull() {
            addCriterion("emjg is not null");
            return (Criteria) this;
        }

        public Criteria andEmjgEqualTo(String value) {
            addCriterion("emjg =", value, "emjg");
            return (Criteria) this;
        }

        public Criteria andEmjgNotEqualTo(String value) {
            addCriterion("emjg <>", value, "emjg");
            return (Criteria) this;
        }

        public Criteria andEmjgGreaterThan(String value) {
            addCriterion("emjg >", value, "emjg");
            return (Criteria) this;
        }

        public Criteria andEmjgGreaterThanOrEqualTo(String value) {
            addCriterion("emjg >=", value, "emjg");
            return (Criteria) this;
        }

        public Criteria andEmjgLessThan(String value) {
            addCriterion("emjg <", value, "emjg");
            return (Criteria) this;
        }

        public Criteria andEmjgLessThanOrEqualTo(String value) {
            addCriterion("emjg <=", value, "emjg");
            return (Criteria) this;
        }

        public Criteria andEmjgLike(String value) {
            addCriterion("emjg like", value, "emjg");
            return (Criteria) this;
        }

        public Criteria andEmjgNotLike(String value) {
            addCriterion("emjg not like", value, "emjg");
            return (Criteria) this;
        }

        public Criteria andEmjgIn(List<String> values) {
            addCriterion("emjg in", values, "emjg");
            return (Criteria) this;
        }

        public Criteria andEmjgNotIn(List<String> values) {
            addCriterion("emjg not in", values, "emjg");
            return (Criteria) this;
        }

        public Criteria andEmjgBetween(String value1, String value2) {
            addCriterion("emjg between", value1, value2, "emjg");
            return (Criteria) this;
        }

        public Criteria andEmjgNotBetween(String value1, String value2) {
            addCriterion("emjg not between", value1, value2, "emjg");
            return (Criteria) this;
        }

        public Criteria andEmmzIsNull() {
            addCriterion("emmz is null");
            return (Criteria) this;
        }

        public Criteria andEmmzIsNotNull() {
            addCriterion("emmz is not null");
            return (Criteria) this;
        }

        public Criteria andEmmzEqualTo(String value) {
            addCriterion("emmz =", value, "emmz");
            return (Criteria) this;
        }

        public Criteria andEmmzNotEqualTo(String value) {
            addCriterion("emmz <>", value, "emmz");
            return (Criteria) this;
        }

        public Criteria andEmmzGreaterThan(String value) {
            addCriterion("emmz >", value, "emmz");
            return (Criteria) this;
        }

        public Criteria andEmmzGreaterThanOrEqualTo(String value) {
            addCriterion("emmz >=", value, "emmz");
            return (Criteria) this;
        }

        public Criteria andEmmzLessThan(String value) {
            addCriterion("emmz <", value, "emmz");
            return (Criteria) this;
        }

        public Criteria andEmmzLessThanOrEqualTo(String value) {
            addCriterion("emmz <=", value, "emmz");
            return (Criteria) this;
        }

        public Criteria andEmmzLike(String value) {
            addCriterion("emmz like", value, "emmz");
            return (Criteria) this;
        }

        public Criteria andEmmzNotLike(String value) {
            addCriterion("emmz not like", value, "emmz");
            return (Criteria) this;
        }

        public Criteria andEmmzIn(List<String> values) {
            addCriterion("emmz in", values, "emmz");
            return (Criteria) this;
        }

        public Criteria andEmmzNotIn(List<String> values) {
            addCriterion("emmz not in", values, "emmz");
            return (Criteria) this;
        }

        public Criteria andEmmzBetween(String value1, String value2) {
            addCriterion("emmz between", value1, value2, "emmz");
            return (Criteria) this;
        }

        public Criteria andEmmzNotBetween(String value1, String value2) {
            addCriterion("emmz not between", value1, value2, "emmz");
            return (Criteria) this;
        }

        public Criteria andEmhyzkIsNull() {
            addCriterion("emhyzk is null");
            return (Criteria) this;
        }

        public Criteria andEmhyzkIsNotNull() {
            addCriterion("emhyzk is not null");
            return (Criteria) this;
        }

        public Criteria andEmhyzkEqualTo(String value) {
            addCriterion("emhyzk =", value, "emhyzk");
            return (Criteria) this;
        }

        public Criteria andEmhyzkNotEqualTo(String value) {
            addCriterion("emhyzk <>", value, "emhyzk");
            return (Criteria) this;
        }

        public Criteria andEmhyzkGreaterThan(String value) {
            addCriterion("emhyzk >", value, "emhyzk");
            return (Criteria) this;
        }

        public Criteria andEmhyzkGreaterThanOrEqualTo(String value) {
            addCriterion("emhyzk >=", value, "emhyzk");
            return (Criteria) this;
        }

        public Criteria andEmhyzkLessThan(String value) {
            addCriterion("emhyzk <", value, "emhyzk");
            return (Criteria) this;
        }

        public Criteria andEmhyzkLessThanOrEqualTo(String value) {
            addCriterion("emhyzk <=", value, "emhyzk");
            return (Criteria) this;
        }

        public Criteria andEmhyzkLike(String value) {
            addCriterion("emhyzk like", value, "emhyzk");
            return (Criteria) this;
        }

        public Criteria andEmhyzkNotLike(String value) {
            addCriterion("emhyzk not like", value, "emhyzk");
            return (Criteria) this;
        }

        public Criteria andEmhyzkIn(List<String> values) {
            addCriterion("emhyzk in", values, "emhyzk");
            return (Criteria) this;
        }

        public Criteria andEmhyzkNotIn(List<String> values) {
            addCriterion("emhyzk not in", values, "emhyzk");
            return (Criteria) this;
        }

        public Criteria andEmhyzkBetween(String value1, String value2) {
            addCriterion("emhyzk between", value1, value2, "emhyzk");
            return (Criteria) this;
        }

        public Criteria andEmhyzkNotBetween(String value1, String value2) {
            addCriterion("emhyzk not between", value1, value2, "emhyzk");
            return (Criteria) this;
        }

        public Criteria andEmxlIsNull() {
            addCriterion("emxl is null");
            return (Criteria) this;
        }

        public Criteria andEmxlIsNotNull() {
            addCriterion("emxl is not null");
            return (Criteria) this;
        }

        public Criteria andEmxlEqualTo(String value) {
            addCriterion("emxl =", value, "emxl");
            return (Criteria) this;
        }

        public Criteria andEmxlNotEqualTo(String value) {
            addCriterion("emxl <>", value, "emxl");
            return (Criteria) this;
        }

        public Criteria andEmxlGreaterThan(String value) {
            addCriterion("emxl >", value, "emxl");
            return (Criteria) this;
        }

        public Criteria andEmxlGreaterThanOrEqualTo(String value) {
            addCriterion("emxl >=", value, "emxl");
            return (Criteria) this;
        }

        public Criteria andEmxlLessThan(String value) {
            addCriterion("emxl <", value, "emxl");
            return (Criteria) this;
        }

        public Criteria andEmxlLessThanOrEqualTo(String value) {
            addCriterion("emxl <=", value, "emxl");
            return (Criteria) this;
        }

        public Criteria andEmxlLike(String value) {
            addCriterion("emxl like", value, "emxl");
            return (Criteria) this;
        }

        public Criteria andEmxlNotLike(String value) {
            addCriterion("emxl not like", value, "emxl");
            return (Criteria) this;
        }

        public Criteria andEmxlIn(List<String> values) {
            addCriterion("emxl in", values, "emxl");
            return (Criteria) this;
        }

        public Criteria andEmxlNotIn(List<String> values) {
            addCriterion("emxl not in", values, "emxl");
            return (Criteria) this;
        }

        public Criteria andEmxlBetween(String value1, String value2) {
            addCriterion("emxl between", value1, value2, "emxl");
            return (Criteria) this;
        }

        public Criteria andEmxlNotBetween(String value1, String value2) {
            addCriterion("emxl not between", value1, value2, "emxl");
            return (Criteria) this;
        }

        public Criteria andEmbyyxIsNull() {
            addCriterion("embyyx is null");
            return (Criteria) this;
        }

        public Criteria andEmbyyxIsNotNull() {
            addCriterion("embyyx is not null");
            return (Criteria) this;
        }

        public Criteria andEmbyyxEqualTo(String value) {
            addCriterion("embyyx =", value, "embyyx");
            return (Criteria) this;
        }

        public Criteria andEmbyyxNotEqualTo(String value) {
            addCriterion("embyyx <>", value, "embyyx");
            return (Criteria) this;
        }

        public Criteria andEmbyyxGreaterThan(String value) {
            addCriterion("embyyx >", value, "embyyx");
            return (Criteria) this;
        }

        public Criteria andEmbyyxGreaterThanOrEqualTo(String value) {
            addCriterion("embyyx >=", value, "embyyx");
            return (Criteria) this;
        }

        public Criteria andEmbyyxLessThan(String value) {
            addCriterion("embyyx <", value, "embyyx");
            return (Criteria) this;
        }

        public Criteria andEmbyyxLessThanOrEqualTo(String value) {
            addCriterion("embyyx <=", value, "embyyx");
            return (Criteria) this;
        }

        public Criteria andEmbyyxLike(String value) {
            addCriterion("embyyx like", value, "embyyx");
            return (Criteria) this;
        }

        public Criteria andEmbyyxNotLike(String value) {
            addCriterion("embyyx not like", value, "embyyx");
            return (Criteria) this;
        }

        public Criteria andEmbyyxIn(List<String> values) {
            addCriterion("embyyx in", values, "embyyx");
            return (Criteria) this;
        }

        public Criteria andEmbyyxNotIn(List<String> values) {
            addCriterion("embyyx not in", values, "embyyx");
            return (Criteria) this;
        }

        public Criteria andEmbyyxBetween(String value1, String value2) {
            addCriterion("embyyx between", value1, value2, "embyyx");
            return (Criteria) this;
        }

        public Criteria andEmbyyxNotBetween(String value1, String value2) {
            addCriterion("embyyx not between", value1, value2, "embyyx");
            return (Criteria) this;
        }

        public Criteria andEmzyIsNull() {
            addCriterion("emzy is null");
            return (Criteria) this;
        }

        public Criteria andEmzyIsNotNull() {
            addCriterion("emzy is not null");
            return (Criteria) this;
        }

        public Criteria andEmzyEqualTo(String value) {
            addCriterion("emzy =", value, "emzy");
            return (Criteria) this;
        }

        public Criteria andEmzyNotEqualTo(String value) {
            addCriterion("emzy <>", value, "emzy");
            return (Criteria) this;
        }

        public Criteria andEmzyGreaterThan(String value) {
            addCriterion("emzy >", value, "emzy");
            return (Criteria) this;
        }

        public Criteria andEmzyGreaterThanOrEqualTo(String value) {
            addCriterion("emzy >=", value, "emzy");
            return (Criteria) this;
        }

        public Criteria andEmzyLessThan(String value) {
            addCriterion("emzy <", value, "emzy");
            return (Criteria) this;
        }

        public Criteria andEmzyLessThanOrEqualTo(String value) {
            addCriterion("emzy <=", value, "emzy");
            return (Criteria) this;
        }

        public Criteria andEmzyLike(String value) {
            addCriterion("emzy like", value, "emzy");
            return (Criteria) this;
        }

        public Criteria andEmzyNotLike(String value) {
            addCriterion("emzy not like", value, "emzy");
            return (Criteria) this;
        }

        public Criteria andEmzyIn(List<String> values) {
            addCriterion("emzy in", values, "emzy");
            return (Criteria) this;
        }

        public Criteria andEmzyNotIn(List<String> values) {
            addCriterion("emzy not in", values, "emzy");
            return (Criteria) this;
        }

        public Criteria andEmzyBetween(String value1, String value2) {
            addCriterion("emzy between", value1, value2, "emzy");
            return (Criteria) this;
        }

        public Criteria andEmzyNotBetween(String value1, String value2) {
            addCriterion("emzy not between", value1, value2, "emzy");
            return (Criteria) this;
        }

        public Criteria andEmzyzgIsNull() {
            addCriterion("emzyzg is null");
            return (Criteria) this;
        }

        public Criteria andEmzyzgIsNotNull() {
            addCriterion("emzyzg is not null");
            return (Criteria) this;
        }

        public Criteria andEmzyzgEqualTo(String value) {
            addCriterion("emzyzg =", value, "emzyzg");
            return (Criteria) this;
        }

        public Criteria andEmzyzgNotEqualTo(String value) {
            addCriterion("emzyzg <>", value, "emzyzg");
            return (Criteria) this;
        }

        public Criteria andEmzyzgGreaterThan(String value) {
            addCriterion("emzyzg >", value, "emzyzg");
            return (Criteria) this;
        }

        public Criteria andEmzyzgGreaterThanOrEqualTo(String value) {
            addCriterion("emzyzg >=", value, "emzyzg");
            return (Criteria) this;
        }

        public Criteria andEmzyzgLessThan(String value) {
            addCriterion("emzyzg <", value, "emzyzg");
            return (Criteria) this;
        }

        public Criteria andEmzyzgLessThanOrEqualTo(String value) {
            addCriterion("emzyzg <=", value, "emzyzg");
            return (Criteria) this;
        }

        public Criteria andEmzyzgLike(String value) {
            addCriterion("emzyzg like", value, "emzyzg");
            return (Criteria) this;
        }

        public Criteria andEmzyzgNotLike(String value) {
            addCriterion("emzyzg not like", value, "emzyzg");
            return (Criteria) this;
        }

        public Criteria andEmzyzgIn(List<String> values) {
            addCriterion("emzyzg in", values, "emzyzg");
            return (Criteria) this;
        }

        public Criteria andEmzyzgNotIn(List<String> values) {
            addCriterion("emzyzg not in", values, "emzyzg");
            return (Criteria) this;
        }

        public Criteria andEmzyzgBetween(String value1, String value2) {
            addCriterion("emzyzg between", value1, value2, "emzyzg");
            return (Criteria) this;
        }

        public Criteria andEmzyzgNotBetween(String value1, String value2) {
            addCriterion("emzyzg not between", value1, value2, "emzyzg");
            return (Criteria) this;
        }

        public Criteria andEmsxIsNull() {
            addCriterion("emsx is null");
            return (Criteria) this;
        }

        public Criteria andEmsxIsNotNull() {
            addCriterion("emsx is not null");
            return (Criteria) this;
        }

        public Criteria andEmsxEqualTo(String value) {
            addCriterion("emsx =", value, "emsx");
            return (Criteria) this;
        }

        public Criteria andEmsxNotEqualTo(String value) {
            addCriterion("emsx <>", value, "emsx");
            return (Criteria) this;
        }

        public Criteria andEmsxGreaterThan(String value) {
            addCriterion("emsx >", value, "emsx");
            return (Criteria) this;
        }

        public Criteria andEmsxGreaterThanOrEqualTo(String value) {
            addCriterion("emsx >=", value, "emsx");
            return (Criteria) this;
        }

        public Criteria andEmsxLessThan(String value) {
            addCriterion("emsx <", value, "emsx");
            return (Criteria) this;
        }

        public Criteria andEmsxLessThanOrEqualTo(String value) {
            addCriterion("emsx <=", value, "emsx");
            return (Criteria) this;
        }

        public Criteria andEmsxLike(String value) {
            addCriterion("emsx like", value, "emsx");
            return (Criteria) this;
        }

        public Criteria andEmsxNotLike(String value) {
            addCriterion("emsx not like", value, "emsx");
            return (Criteria) this;
        }

        public Criteria andEmsxIn(List<String> values) {
            addCriterion("emsx in", values, "emsx");
            return (Criteria) this;
        }

        public Criteria andEmsxNotIn(List<String> values) {
            addCriterion("emsx not in", values, "emsx");
            return (Criteria) this;
        }

        public Criteria andEmsxBetween(String value1, String value2) {
            addCriterion("emsx between", value1, value2, "emsx");
            return (Criteria) this;
        }

        public Criteria andEmsxNotBetween(String value1, String value2) {
            addCriterion("emsx not between", value1, value2, "emsx");
            return (Criteria) this;
        }

        public Criteria andEmxwIsNull() {
            addCriterion("emxw is null");
            return (Criteria) this;
        }

        public Criteria andEmxwIsNotNull() {
            addCriterion("emxw is not null");
            return (Criteria) this;
        }

        public Criteria andEmxwEqualTo(String value) {
            addCriterion("emxw =", value, "emxw");
            return (Criteria) this;
        }

        public Criteria andEmxwNotEqualTo(String value) {
            addCriterion("emxw <>", value, "emxw");
            return (Criteria) this;
        }

        public Criteria andEmxwGreaterThan(String value) {
            addCriterion("emxw >", value, "emxw");
            return (Criteria) this;
        }

        public Criteria andEmxwGreaterThanOrEqualTo(String value) {
            addCriterion("emxw >=", value, "emxw");
            return (Criteria) this;
        }

        public Criteria andEmxwLessThan(String value) {
            addCriterion("emxw <", value, "emxw");
            return (Criteria) this;
        }

        public Criteria andEmxwLessThanOrEqualTo(String value) {
            addCriterion("emxw <=", value, "emxw");
            return (Criteria) this;
        }

        public Criteria andEmxwLike(String value) {
            addCriterion("emxw like", value, "emxw");
            return (Criteria) this;
        }

        public Criteria andEmxwNotLike(String value) {
            addCriterion("emxw not like", value, "emxw");
            return (Criteria) this;
        }

        public Criteria andEmxwIn(List<String> values) {
            addCriterion("emxw in", values, "emxw");
            return (Criteria) this;
        }

        public Criteria andEmxwNotIn(List<String> values) {
            addCriterion("emxw not in", values, "emxw");
            return (Criteria) this;
        }

        public Criteria andEmxwBetween(String value1, String value2) {
            addCriterion("emxw between", value1, value2, "emxw");
            return (Criteria) this;
        }

        public Criteria andEmxwNotBetween(String value1, String value2) {
            addCriterion("emxw not between", value1, value2, "emxw");
            return (Criteria) this;
        }

        public Criteria andEmbzIsNull() {
            addCriterion("embz is null");
            return (Criteria) this;
        }

        public Criteria andEmbzIsNotNull() {
            addCriterion("embz is not null");
            return (Criteria) this;
        }

        public Criteria andEmbzEqualTo(String value) {
            addCriterion("embz =", value, "embz");
            return (Criteria) this;
        }

        public Criteria andEmbzNotEqualTo(String value) {
            addCriterion("embz <>", value, "embz");
            return (Criteria) this;
        }

        public Criteria andEmbzGreaterThan(String value) {
            addCriterion("embz >", value, "embz");
            return (Criteria) this;
        }

        public Criteria andEmbzGreaterThanOrEqualTo(String value) {
            addCriterion("embz >=", value, "embz");
            return (Criteria) this;
        }

        public Criteria andEmbzLessThan(String value) {
            addCriterion("embz <", value, "embz");
            return (Criteria) this;
        }

        public Criteria andEmbzLessThanOrEqualTo(String value) {
            addCriterion("embz <=", value, "embz");
            return (Criteria) this;
        }

        public Criteria andEmbzLike(String value) {
            addCriterion("embz like", value, "embz");
            return (Criteria) this;
        }

        public Criteria andEmbzNotLike(String value) {
            addCriterion("embz not like", value, "embz");
            return (Criteria) this;
        }

        public Criteria andEmbzIn(List<String> values) {
            addCriterion("embz in", values, "embz");
            return (Criteria) this;
        }

        public Criteria andEmbzNotIn(List<String> values) {
            addCriterion("embz not in", values, "embz");
            return (Criteria) this;
        }

        public Criteria andEmbzBetween(String value1, String value2) {
            addCriterion("embz between", value1, value2, "embz");
            return (Criteria) this;
        }

        public Criteria andEmbzNotBetween(String value1, String value2) {
            addCriterion("embz not between", value1, value2, "embz");
            return (Criteria) this;
        }

        public Criteria andEmsfzIsNull() {
            addCriterion("emsfz is null");
            return (Criteria) this;
        }

        public Criteria andEmsfzIsNotNull() {
            addCriterion("emsfz is not null");
            return (Criteria) this;
        }

        public Criteria andEmsfzEqualTo(String value) {
            addCriterion("emsfz =", value, "emsfz");
            return (Criteria) this;
        }

        public Criteria andEmsfzNotEqualTo(String value) {
            addCriterion("emsfz <>", value, "emsfz");
            return (Criteria) this;
        }

        public Criteria andEmsfzGreaterThan(String value) {
            addCriterion("emsfz >", value, "emsfz");
            return (Criteria) this;
        }

        public Criteria andEmsfzGreaterThanOrEqualTo(String value) {
            addCriterion("emsfz >=", value, "emsfz");
            return (Criteria) this;
        }

        public Criteria andEmsfzLessThan(String value) {
            addCriterion("emsfz <", value, "emsfz");
            return (Criteria) this;
        }

        public Criteria andEmsfzLessThanOrEqualTo(String value) {
            addCriterion("emsfz <=", value, "emsfz");
            return (Criteria) this;
        }

        public Criteria andEmsfzLike(String value) {
            addCriterion("emsfz like", value, "emsfz");
            return (Criteria) this;
        }

        public Criteria andEmsfzNotLike(String value) {
            addCriterion("emsfz not like", value, "emsfz");
            return (Criteria) this;
        }

        public Criteria andEmsfzIn(List<String> values) {
            addCriterion("emsfz in", values, "emsfz");
            return (Criteria) this;
        }

        public Criteria andEmsfzNotIn(List<String> values) {
            addCriterion("emsfz not in", values, "emsfz");
            return (Criteria) this;
        }

        public Criteria andEmsfzBetween(String value1, String value2) {
            addCriterion("emsfz between", value1, value2, "emsfz");
            return (Criteria) this;
        }

        public Criteria andEmsfzNotBetween(String value1, String value2) {
            addCriterion("emsfz not between", value1, value2, "emsfz");
            return (Criteria) this;
        }

        public Criteria andEmhkdzIsNull() {
            addCriterion("emhkdz is null");
            return (Criteria) this;
        }

        public Criteria andEmhkdzIsNotNull() {
            addCriterion("emhkdz is not null");
            return (Criteria) this;
        }

        public Criteria andEmhkdzEqualTo(String value) {
            addCriterion("emhkdz =", value, "emhkdz");
            return (Criteria) this;
        }

        public Criteria andEmhkdzNotEqualTo(String value) {
            addCriterion("emhkdz <>", value, "emhkdz");
            return (Criteria) this;
        }

        public Criteria andEmhkdzGreaterThan(String value) {
            addCriterion("emhkdz >", value, "emhkdz");
            return (Criteria) this;
        }

        public Criteria andEmhkdzGreaterThanOrEqualTo(String value) {
            addCriterion("emhkdz >=", value, "emhkdz");
            return (Criteria) this;
        }

        public Criteria andEmhkdzLessThan(String value) {
            addCriterion("emhkdz <", value, "emhkdz");
            return (Criteria) this;
        }

        public Criteria andEmhkdzLessThanOrEqualTo(String value) {
            addCriterion("emhkdz <=", value, "emhkdz");
            return (Criteria) this;
        }

        public Criteria andEmhkdzLike(String value) {
            addCriterion("emhkdz like", value, "emhkdz");
            return (Criteria) this;
        }

        public Criteria andEmhkdzNotLike(String value) {
            addCriterion("emhkdz not like", value, "emhkdz");
            return (Criteria) this;
        }

        public Criteria andEmhkdzIn(List<String> values) {
            addCriterion("emhkdz in", values, "emhkdz");
            return (Criteria) this;
        }

        public Criteria andEmhkdzNotIn(List<String> values) {
            addCriterion("emhkdz not in", values, "emhkdz");
            return (Criteria) this;
        }

        public Criteria andEmhkdzBetween(String value1, String value2) {
            addCriterion("emhkdz between", value1, value2, "emhkdz");
            return (Criteria) this;
        }

        public Criteria andEmhkdzNotBetween(String value1, String value2) {
            addCriterion("emhkdz not between", value1, value2, "emhkdz");
            return (Criteria) this;
        }

        public Criteria andEmxzdzIsNull() {
            addCriterion("emxzdz is null");
            return (Criteria) this;
        }

        public Criteria andEmxzdzIsNotNull() {
            addCriterion("emxzdz is not null");
            return (Criteria) this;
        }

        public Criteria andEmxzdzEqualTo(String value) {
            addCriterion("emxzdz =", value, "emxzdz");
            return (Criteria) this;
        }

        public Criteria andEmxzdzNotEqualTo(String value) {
            addCriterion("emxzdz <>", value, "emxzdz");
            return (Criteria) this;
        }

        public Criteria andEmxzdzGreaterThan(String value) {
            addCriterion("emxzdz >", value, "emxzdz");
            return (Criteria) this;
        }

        public Criteria andEmxzdzGreaterThanOrEqualTo(String value) {
            addCriterion("emxzdz >=", value, "emxzdz");
            return (Criteria) this;
        }

        public Criteria andEmxzdzLessThan(String value) {
            addCriterion("emxzdz <", value, "emxzdz");
            return (Criteria) this;
        }

        public Criteria andEmxzdzLessThanOrEqualTo(String value) {
            addCriterion("emxzdz <=", value, "emxzdz");
            return (Criteria) this;
        }

        public Criteria andEmxzdzLike(String value) {
            addCriterion("emxzdz like", value, "emxzdz");
            return (Criteria) this;
        }

        public Criteria andEmxzdzNotLike(String value) {
            addCriterion("emxzdz not like", value, "emxzdz");
            return (Criteria) this;
        }

        public Criteria andEmxzdzIn(List<String> values) {
            addCriterion("emxzdz in", values, "emxzdz");
            return (Criteria) this;
        }

        public Criteria andEmxzdzNotIn(List<String> values) {
            addCriterion("emxzdz not in", values, "emxzdz");
            return (Criteria) this;
        }

        public Criteria andEmxzdzBetween(String value1, String value2) {
            addCriterion("emxzdz between", value1, value2, "emxzdz");
            return (Criteria) this;
        }

        public Criteria andEmxzdzNotBetween(String value1, String value2) {
            addCriterion("emxzdz not between", value1, value2, "emxzdz");
            return (Criteria) this;
        }

        public Criteria andEmlxdhIsNull() {
            addCriterion("emlxdh is null");
            return (Criteria) this;
        }

        public Criteria andEmlxdhIsNotNull() {
            addCriterion("emlxdh is not null");
            return (Criteria) this;
        }

        public Criteria andEmlxdhEqualTo(String value) {
            addCriterion("emlxdh =", value, "emlxdh");
            return (Criteria) this;
        }

        public Criteria andEmlxdhNotEqualTo(String value) {
            addCriterion("emlxdh <>", value, "emlxdh");
            return (Criteria) this;
        }

        public Criteria andEmlxdhGreaterThan(String value) {
            addCriterion("emlxdh >", value, "emlxdh");
            return (Criteria) this;
        }

        public Criteria andEmlxdhGreaterThanOrEqualTo(String value) {
            addCriterion("emlxdh >=", value, "emlxdh");
            return (Criteria) this;
        }

        public Criteria andEmlxdhLessThan(String value) {
            addCriterion("emlxdh <", value, "emlxdh");
            return (Criteria) this;
        }

        public Criteria andEmlxdhLessThanOrEqualTo(String value) {
            addCriterion("emlxdh <=", value, "emlxdh");
            return (Criteria) this;
        }

        public Criteria andEmlxdhLike(String value) {
            addCriterion("emlxdh like", value, "emlxdh");
            return (Criteria) this;
        }

        public Criteria andEmlxdhNotLike(String value) {
            addCriterion("emlxdh not like", value, "emlxdh");
            return (Criteria) this;
        }

        public Criteria andEmlxdhIn(List<String> values) {
            addCriterion("emlxdh in", values, "emlxdh");
            return (Criteria) this;
        }

        public Criteria andEmlxdhNotIn(List<String> values) {
            addCriterion("emlxdh not in", values, "emlxdh");
            return (Criteria) this;
        }

        public Criteria andEmlxdhBetween(String value1, String value2) {
            addCriterion("emlxdh between", value1, value2, "emlxdh");
            return (Criteria) this;
        }

        public Criteria andEmlxdhNotBetween(String value1, String value2) {
            addCriterion("emlxdh not between", value1, value2, "emlxdh");
            return (Criteria) this;
        }

        public Criteria andEmsjIsNull() {
            addCriterion("emsj is null");
            return (Criteria) this;
        }

        public Criteria andEmsjIsNotNull() {
            addCriterion("emsj is not null");
            return (Criteria) this;
        }

        public Criteria andEmsjEqualTo(String value) {
            addCriterion("emsj =", value, "emsj");
            return (Criteria) this;
        }

        public Criteria andEmsjNotEqualTo(String value) {
            addCriterion("emsj <>", value, "emsj");
            return (Criteria) this;
        }

        public Criteria andEmsjGreaterThan(String value) {
            addCriterion("emsj >", value, "emsj");
            return (Criteria) this;
        }

        public Criteria andEmsjGreaterThanOrEqualTo(String value) {
            addCriterion("emsj >=", value, "emsj");
            return (Criteria) this;
        }

        public Criteria andEmsjLessThan(String value) {
            addCriterion("emsj <", value, "emsj");
            return (Criteria) this;
        }

        public Criteria andEmsjLessThanOrEqualTo(String value) {
            addCriterion("emsj <=", value, "emsj");
            return (Criteria) this;
        }

        public Criteria andEmsjLike(String value) {
            addCriterion("emsj like", value, "emsj");
            return (Criteria) this;
        }

        public Criteria andEmsjNotLike(String value) {
            addCriterion("emsj not like", value, "emsj");
            return (Criteria) this;
        }

        public Criteria andEmsjIn(List<String> values) {
            addCriterion("emsj in", values, "emsj");
            return (Criteria) this;
        }

        public Criteria andEmsjNotIn(List<String> values) {
            addCriterion("emsj not in", values, "emsj");
            return (Criteria) this;
        }

        public Criteria andEmsjBetween(String value1, String value2) {
            addCriterion("emsj between", value1, value2, "emsj");
            return (Criteria) this;
        }

        public Criteria andEmsjNotBetween(String value1, String value2) {
            addCriterion("emsj not between", value1, value2, "emsj");
            return (Criteria) this;
        }

        public Criteria andEmemailIsNull() {
            addCriterion("ememail is null");
            return (Criteria) this;
        }

        public Criteria andEmemailIsNotNull() {
            addCriterion("ememail is not null");
            return (Criteria) this;
        }

        public Criteria andEmemailEqualTo(String value) {
            addCriterion("ememail =", value, "ememail");
            return (Criteria) this;
        }

        public Criteria andEmemailNotEqualTo(String value) {
            addCriterion("ememail <>", value, "ememail");
            return (Criteria) this;
        }

        public Criteria andEmemailGreaterThan(String value) {
            addCriterion("ememail >", value, "ememail");
            return (Criteria) this;
        }

        public Criteria andEmemailGreaterThanOrEqualTo(String value) {
            addCriterion("ememail >=", value, "ememail");
            return (Criteria) this;
        }

        public Criteria andEmemailLessThan(String value) {
            addCriterion("ememail <", value, "ememail");
            return (Criteria) this;
        }

        public Criteria andEmemailLessThanOrEqualTo(String value) {
            addCriterion("ememail <=", value, "ememail");
            return (Criteria) this;
        }

        public Criteria andEmemailLike(String value) {
            addCriterion("ememail like", value, "ememail");
            return (Criteria) this;
        }

        public Criteria andEmemailNotLike(String value) {
            addCriterion("ememail not like", value, "ememail");
            return (Criteria) this;
        }

        public Criteria andEmemailIn(List<String> values) {
            addCriterion("ememail in", values, "ememail");
            return (Criteria) this;
        }

        public Criteria andEmemailNotIn(List<String> values) {
            addCriterion("ememail not in", values, "ememail");
            return (Criteria) this;
        }

        public Criteria andEmemailBetween(String value1, String value2) {
            addCriterion("ememail between", value1, value2, "ememail");
            return (Criteria) this;
        }

        public Criteria andEmemailNotBetween(String value1, String value2) {
            addCriterion("ememail not between", value1, value2, "ememail");
            return (Criteria) this;
        }

        public Criteria andEmkhyhIsNull() {
            addCriterion("emkhyh is null");
            return (Criteria) this;
        }

        public Criteria andEmkhyhIsNotNull() {
            addCriterion("emkhyh is not null");
            return (Criteria) this;
        }

        public Criteria andEmkhyhEqualTo(String value) {
            addCriterion("emkhyh =", value, "emkhyh");
            return (Criteria) this;
        }

        public Criteria andEmkhyhNotEqualTo(String value) {
            addCriterion("emkhyh <>", value, "emkhyh");
            return (Criteria) this;
        }

        public Criteria andEmkhyhGreaterThan(String value) {
            addCriterion("emkhyh >", value, "emkhyh");
            return (Criteria) this;
        }

        public Criteria andEmkhyhGreaterThanOrEqualTo(String value) {
            addCriterion("emkhyh >=", value, "emkhyh");
            return (Criteria) this;
        }

        public Criteria andEmkhyhLessThan(String value) {
            addCriterion("emkhyh <", value, "emkhyh");
            return (Criteria) this;
        }

        public Criteria andEmkhyhLessThanOrEqualTo(String value) {
            addCriterion("emkhyh <=", value, "emkhyh");
            return (Criteria) this;
        }

        public Criteria andEmkhyhLike(String value) {
            addCriterion("emkhyh like", value, "emkhyh");
            return (Criteria) this;
        }

        public Criteria andEmkhyhNotLike(String value) {
            addCriterion("emkhyh not like", value, "emkhyh");
            return (Criteria) this;
        }

        public Criteria andEmkhyhIn(List<String> values) {
            addCriterion("emkhyh in", values, "emkhyh");
            return (Criteria) this;
        }

        public Criteria andEmkhyhNotIn(List<String> values) {
            addCriterion("emkhyh not in", values, "emkhyh");
            return (Criteria) this;
        }

        public Criteria andEmkhyhBetween(String value1, String value2) {
            addCriterion("emkhyh between", value1, value2, "emkhyh");
            return (Criteria) this;
        }

        public Criteria andEmkhyhNotBetween(String value1, String value2) {
            addCriterion("emkhyh not between", value1, value2, "emkhyh");
            return (Criteria) this;
        }

        public Criteria andEmyhzhIsNull() {
            addCriterion("emyhzh is null");
            return (Criteria) this;
        }

        public Criteria andEmyhzhIsNotNull() {
            addCriterion("emyhzh is not null");
            return (Criteria) this;
        }

        public Criteria andEmyhzhEqualTo(String value) {
            addCriterion("emyhzh =", value, "emyhzh");
            return (Criteria) this;
        }

        public Criteria andEmyhzhNotEqualTo(String value) {
            addCriterion("emyhzh <>", value, "emyhzh");
            return (Criteria) this;
        }

        public Criteria andEmyhzhGreaterThan(String value) {
            addCriterion("emyhzh >", value, "emyhzh");
            return (Criteria) this;
        }

        public Criteria andEmyhzhGreaterThanOrEqualTo(String value) {
            addCriterion("emyhzh >=", value, "emyhzh");
            return (Criteria) this;
        }

        public Criteria andEmyhzhLessThan(String value) {
            addCriterion("emyhzh <", value, "emyhzh");
            return (Criteria) this;
        }

        public Criteria andEmyhzhLessThanOrEqualTo(String value) {
            addCriterion("emyhzh <=", value, "emyhzh");
            return (Criteria) this;
        }

        public Criteria andEmyhzhLike(String value) {
            addCriterion("emyhzh like", value, "emyhzh");
            return (Criteria) this;
        }

        public Criteria andEmyhzhNotLike(String value) {
            addCriterion("emyhzh not like", value, "emyhzh");
            return (Criteria) this;
        }

        public Criteria andEmyhzhIn(List<String> values) {
            addCriterion("emyhzh in", values, "emyhzh");
            return (Criteria) this;
        }

        public Criteria andEmyhzhNotIn(List<String> values) {
            addCriterion("emyhzh not in", values, "emyhzh");
            return (Criteria) this;
        }

        public Criteria andEmyhzhBetween(String value1, String value2) {
            addCriterion("emyhzh between", value1, value2, "emyhzh");
            return (Criteria) this;
        }

        public Criteria andEmyhzhNotBetween(String value1, String value2) {
            addCriterion("emyhzh not between", value1, value2, "emyhzh");
            return (Criteria) this;
        }

        public Criteria andEmjjlxrIsNull() {
            addCriterion("emjjlxr is null");
            return (Criteria) this;
        }

        public Criteria andEmjjlxrIsNotNull() {
            addCriterion("emjjlxr is not null");
            return (Criteria) this;
        }

        public Criteria andEmjjlxrEqualTo(String value) {
            addCriterion("emjjlxr =", value, "emjjlxr");
            return (Criteria) this;
        }

        public Criteria andEmjjlxrNotEqualTo(String value) {
            addCriterion("emjjlxr <>", value, "emjjlxr");
            return (Criteria) this;
        }

        public Criteria andEmjjlxrGreaterThan(String value) {
            addCriterion("emjjlxr >", value, "emjjlxr");
            return (Criteria) this;
        }

        public Criteria andEmjjlxrGreaterThanOrEqualTo(String value) {
            addCriterion("emjjlxr >=", value, "emjjlxr");
            return (Criteria) this;
        }

        public Criteria andEmjjlxrLessThan(String value) {
            addCriterion("emjjlxr <", value, "emjjlxr");
            return (Criteria) this;
        }

        public Criteria andEmjjlxrLessThanOrEqualTo(String value) {
            addCriterion("emjjlxr <=", value, "emjjlxr");
            return (Criteria) this;
        }

        public Criteria andEmjjlxrLike(String value) {
            addCriterion("emjjlxr like", value, "emjjlxr");
            return (Criteria) this;
        }

        public Criteria andEmjjlxrNotLike(String value) {
            addCriterion("emjjlxr not like", value, "emjjlxr");
            return (Criteria) this;
        }

        public Criteria andEmjjlxrIn(List<String> values) {
            addCriterion("emjjlxr in", values, "emjjlxr");
            return (Criteria) this;
        }

        public Criteria andEmjjlxrNotIn(List<String> values) {
            addCriterion("emjjlxr not in", values, "emjjlxr");
            return (Criteria) this;
        }

        public Criteria andEmjjlxrBetween(String value1, String value2) {
            addCriterion("emjjlxr between", value1, value2, "emjjlxr");
            return (Criteria) this;
        }

        public Criteria andEmjjlxrNotBetween(String value1, String value2) {
            addCriterion("emjjlxr not between", value1, value2, "emjjlxr");
            return (Criteria) this;
        }

        public Criteria andEmrzrqIsNull() {
            addCriterion("emrzrq is null");
            return (Criteria) this;
        }

        public Criteria andEmrzrqIsNotNull() {
            addCriterion("emrzrq is not null");
            return (Criteria) this;
        }

        public Criteria andEmrzrqEqualTo(Date value) {
            addCriterionForJDBCDate("emrzrq =", value, "emrzrq");
            return (Criteria) this;
        }

        public Criteria andEmrzrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("emrzrq <>", value, "emrzrq");
            return (Criteria) this;
        }

        public Criteria andEmrzrqGreaterThan(Date value) {
            addCriterionForJDBCDate("emrzrq >", value, "emrzrq");
            return (Criteria) this;
        }

        public Criteria andEmrzrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("emrzrq >=", value, "emrzrq");
            return (Criteria) this;
        }

        public Criteria andEmrzrqLessThan(Date value) {
            addCriterionForJDBCDate("emrzrq <", value, "emrzrq");
            return (Criteria) this;
        }

        public Criteria andEmrzrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("emrzrq <=", value, "emrzrq");
            return (Criteria) this;
        }

        public Criteria andEmrzrqIn(List<Date> values) {
            addCriterionForJDBCDate("emrzrq in", values, "emrzrq");
            return (Criteria) this;
        }

        public Criteria andEmrzrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("emrzrq not in", values, "emrzrq");
            return (Criteria) this;
        }

        public Criteria andEmrzrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("emrzrq between", value1, value2, "emrzrq");
            return (Criteria) this;
        }

        public Criteria andEmrzrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("emrzrq not between", value1, value2, "emrzrq");
            return (Criteria) this;
        }

        public Criteria andEmsyrqIsNull() {
            addCriterion("emsyrq is null");
            return (Criteria) this;
        }

        public Criteria andEmsyrqIsNotNull() {
            addCriterion("emsyrq is not null");
            return (Criteria) this;
        }

        public Criteria andEmsyrqEqualTo(Date value) {
            addCriterionForJDBCDate("emsyrq =", value, "emsyrq");
            return (Criteria) this;
        }

        public Criteria andEmsyrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("emsyrq <>", value, "emsyrq");
            return (Criteria) this;
        }

        public Criteria andEmsyrqGreaterThan(Date value) {
            addCriterionForJDBCDate("emsyrq >", value, "emsyrq");
            return (Criteria) this;
        }

        public Criteria andEmsyrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("emsyrq >=", value, "emsyrq");
            return (Criteria) this;
        }

        public Criteria andEmsyrqLessThan(Date value) {
            addCriterionForJDBCDate("emsyrq <", value, "emsyrq");
            return (Criteria) this;
        }

        public Criteria andEmsyrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("emsyrq <=", value, "emsyrq");
            return (Criteria) this;
        }

        public Criteria andEmsyrqIn(List<Date> values) {
            addCriterionForJDBCDate("emsyrq in", values, "emsyrq");
            return (Criteria) this;
        }

        public Criteria andEmsyrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("emsyrq not in", values, "emsyrq");
            return (Criteria) this;
        }

        public Criteria andEmsyrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("emsyrq between", value1, value2, "emsyrq");
            return (Criteria) this;
        }

        public Criteria andEmsyrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("emsyrq not between", value1, value2, "emsyrq");
            return (Criteria) this;
        }

        public Criteria andEmcsrqIsNull() {
            addCriterion("emcsrq is null");
            return (Criteria) this;
        }

        public Criteria andEmcsrqIsNotNull() {
            addCriterion("emcsrq is not null");
            return (Criteria) this;
        }

        public Criteria andEmcsrqEqualTo(Date value) {
            addCriterionForJDBCDate("emcsrq =", value, "emcsrq");
            return (Criteria) this;
        }

        public Criteria andEmcsrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("emcsrq <>", value, "emcsrq");
            return (Criteria) this;
        }

        public Criteria andEmcsrqGreaterThan(Date value) {
            addCriterionForJDBCDate("emcsrq >", value, "emcsrq");
            return (Criteria) this;
        }

        public Criteria andEmcsrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("emcsrq >=", value, "emcsrq");
            return (Criteria) this;
        }

        public Criteria andEmcsrqLessThan(Date value) {
            addCriterionForJDBCDate("emcsrq <", value, "emcsrq");
            return (Criteria) this;
        }

        public Criteria andEmcsrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("emcsrq <=", value, "emcsrq");
            return (Criteria) this;
        }

        public Criteria andEmcsrqIn(List<Date> values) {
            addCriterionForJDBCDate("emcsrq in", values, "emcsrq");
            return (Criteria) this;
        }

        public Criteria andEmcsrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("emcsrq not in", values, "emcsrq");
            return (Criteria) this;
        }

        public Criteria andEmcsrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("emcsrq between", value1, value2, "emcsrq");
            return (Criteria) this;
        }

        public Criteria andEmcsrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("emcsrq not between", value1, value2, "emcsrq");
            return (Criteria) this;
        }

        public Criteria andEmhtksIsNull() {
            addCriterion("emhtks is null");
            return (Criteria) this;
        }

        public Criteria andEmhtksIsNotNull() {
            addCriterion("emhtks is not null");
            return (Criteria) this;
        }

        public Criteria andEmhtksEqualTo(Date value) {
            addCriterionForJDBCDate("emhtks =", value, "emhtks");
            return (Criteria) this;
        }

        public Criteria andEmhtksNotEqualTo(Date value) {
            addCriterionForJDBCDate("emhtks <>", value, "emhtks");
            return (Criteria) this;
        }

        public Criteria andEmhtksGreaterThan(Date value) {
            addCriterionForJDBCDate("emhtks >", value, "emhtks");
            return (Criteria) this;
        }

        public Criteria andEmhtksGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("emhtks >=", value, "emhtks");
            return (Criteria) this;
        }

        public Criteria andEmhtksLessThan(Date value) {
            addCriterionForJDBCDate("emhtks <", value, "emhtks");
            return (Criteria) this;
        }

        public Criteria andEmhtksLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("emhtks <=", value, "emhtks");
            return (Criteria) this;
        }

        public Criteria andEmhtksIn(List<Date> values) {
            addCriterionForJDBCDate("emhtks in", values, "emhtks");
            return (Criteria) this;
        }

        public Criteria andEmhtksNotIn(List<Date> values) {
            addCriterionForJDBCDate("emhtks not in", values, "emhtks");
            return (Criteria) this;
        }

        public Criteria andEmhtksBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("emhtks between", value1, value2, "emhtks");
            return (Criteria) this;
        }

        public Criteria andEmhtksNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("emhtks not between", value1, value2, "emhtks");
            return (Criteria) this;
        }

        public Criteria andEmhtjsIsNull() {
            addCriterion("emhtjs is null");
            return (Criteria) this;
        }

        public Criteria andEmhtjsIsNotNull() {
            addCriterion("emhtjs is not null");
            return (Criteria) this;
        }

        public Criteria andEmhtjsEqualTo(Date value) {
            addCriterionForJDBCDate("emhtjs =", value, "emhtjs");
            return (Criteria) this;
        }

        public Criteria andEmhtjsNotEqualTo(Date value) {
            addCriterionForJDBCDate("emhtjs <>", value, "emhtjs");
            return (Criteria) this;
        }

        public Criteria andEmhtjsGreaterThan(Date value) {
            addCriterionForJDBCDate("emhtjs >", value, "emhtjs");
            return (Criteria) this;
        }

        public Criteria andEmhtjsGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("emhtjs >=", value, "emhtjs");
            return (Criteria) this;
        }

        public Criteria andEmhtjsLessThan(Date value) {
            addCriterionForJDBCDate("emhtjs <", value, "emhtjs");
            return (Criteria) this;
        }

        public Criteria andEmhtjsLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("emhtjs <=", value, "emhtjs");
            return (Criteria) this;
        }

        public Criteria andEmhtjsIn(List<Date> values) {
            addCriterionForJDBCDate("emhtjs in", values, "emhtjs");
            return (Criteria) this;
        }

        public Criteria andEmhtjsNotIn(List<Date> values) {
            addCriterionForJDBCDate("emhtjs not in", values, "emhtjs");
            return (Criteria) this;
        }

        public Criteria andEmhtjsBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("emhtjs between", value1, value2, "emhtjs");
            return (Criteria) this;
        }

        public Criteria andEmhtjsNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("emhtjs not between", value1, value2, "emhtjs");
            return (Criteria) this;
        }

        public Criteria andEmkzbhIsNull() {
            addCriterion("emkzbh is null");
            return (Criteria) this;
        }

        public Criteria andEmkzbhIsNotNull() {
            addCriterion("emkzbh is not null");
            return (Criteria) this;
        }

        public Criteria andEmkzbhEqualTo(String value) {
            addCriterion("emkzbh =", value, "emkzbh");
            return (Criteria) this;
        }

        public Criteria andEmkzbhNotEqualTo(String value) {
            addCriterion("emkzbh <>", value, "emkzbh");
            return (Criteria) this;
        }

        public Criteria andEmkzbhGreaterThan(String value) {
            addCriterion("emkzbh >", value, "emkzbh");
            return (Criteria) this;
        }

        public Criteria andEmkzbhGreaterThanOrEqualTo(String value) {
            addCriterion("emkzbh >=", value, "emkzbh");
            return (Criteria) this;
        }

        public Criteria andEmkzbhLessThan(String value) {
            addCriterion("emkzbh <", value, "emkzbh");
            return (Criteria) this;
        }

        public Criteria andEmkzbhLessThanOrEqualTo(String value) {
            addCriterion("emkzbh <=", value, "emkzbh");
            return (Criteria) this;
        }

        public Criteria andEmkzbhLike(String value) {
            addCriterion("emkzbh like", value, "emkzbh");
            return (Criteria) this;
        }

        public Criteria andEmkzbhNotLike(String value) {
            addCriterion("emkzbh not like", value, "emkzbh");
            return (Criteria) this;
        }

        public Criteria andEmkzbhIn(List<String> values) {
            addCriterion("emkzbh in", values, "emkzbh");
            return (Criteria) this;
        }

        public Criteria andEmkzbhNotIn(List<String> values) {
            addCriterion("emkzbh not in", values, "emkzbh");
            return (Criteria) this;
        }

        public Criteria andEmkzbhBetween(String value1, String value2) {
            addCriterion("emkzbh between", value1, value2, "emkzbh");
            return (Criteria) this;
        }

        public Criteria andEmkzbhNotBetween(String value1, String value2) {
            addCriterion("emkzbh not between", value1, value2, "emkzbh");
            return (Criteria) this;
        }

        public Criteria andEmknbhIsNull() {
            addCriterion("emknbh is null");
            return (Criteria) this;
        }

        public Criteria andEmknbhIsNotNull() {
            addCriterion("emknbh is not null");
            return (Criteria) this;
        }

        public Criteria andEmknbhEqualTo(String value) {
            addCriterion("emknbh =", value, "emknbh");
            return (Criteria) this;
        }

        public Criteria andEmknbhNotEqualTo(String value) {
            addCriterion("emknbh <>", value, "emknbh");
            return (Criteria) this;
        }

        public Criteria andEmknbhGreaterThan(String value) {
            addCriterion("emknbh >", value, "emknbh");
            return (Criteria) this;
        }

        public Criteria andEmknbhGreaterThanOrEqualTo(String value) {
            addCriterion("emknbh >=", value, "emknbh");
            return (Criteria) this;
        }

        public Criteria andEmknbhLessThan(String value) {
            addCriterion("emknbh <", value, "emknbh");
            return (Criteria) this;
        }

        public Criteria andEmknbhLessThanOrEqualTo(String value) {
            addCriterion("emknbh <=", value, "emknbh");
            return (Criteria) this;
        }

        public Criteria andEmknbhLike(String value) {
            addCriterion("emknbh like", value, "emknbh");
            return (Criteria) this;
        }

        public Criteria andEmknbhNotLike(String value) {
            addCriterion("emknbh not like", value, "emknbh");
            return (Criteria) this;
        }

        public Criteria andEmknbhIn(List<String> values) {
            addCriterion("emknbh in", values, "emknbh");
            return (Criteria) this;
        }

        public Criteria andEmknbhNotIn(List<String> values) {
            addCriterion("emknbh not in", values, "emknbh");
            return (Criteria) this;
        }

        public Criteria andEmknbhBetween(String value1, String value2) {
            addCriterion("emknbh between", value1, value2, "emknbh");
            return (Criteria) this;
        }

        public Criteria andEmknbhNotBetween(String value1, String value2) {
            addCriterion("emknbh not between", value1, value2, "emknbh");
            return (Criteria) this;
        }

        public Criteria andEmtjrIsNull() {
            addCriterion("emtjr is null");
            return (Criteria) this;
        }

        public Criteria andEmtjrIsNotNull() {
            addCriterion("emtjr is not null");
            return (Criteria) this;
        }

        public Criteria andEmtjrEqualTo(String value) {
            addCriterion("emtjr =", value, "emtjr");
            return (Criteria) this;
        }

        public Criteria andEmtjrNotEqualTo(String value) {
            addCriterion("emtjr <>", value, "emtjr");
            return (Criteria) this;
        }

        public Criteria andEmtjrGreaterThan(String value) {
            addCriterion("emtjr >", value, "emtjr");
            return (Criteria) this;
        }

        public Criteria andEmtjrGreaterThanOrEqualTo(String value) {
            addCriterion("emtjr >=", value, "emtjr");
            return (Criteria) this;
        }

        public Criteria andEmtjrLessThan(String value) {
            addCriterion("emtjr <", value, "emtjr");
            return (Criteria) this;
        }

        public Criteria andEmtjrLessThanOrEqualTo(String value) {
            addCriterion("emtjr <=", value, "emtjr");
            return (Criteria) this;
        }

        public Criteria andEmtjrLike(String value) {
            addCriterion("emtjr like", value, "emtjr");
            return (Criteria) this;
        }

        public Criteria andEmtjrNotLike(String value) {
            addCriterion("emtjr not like", value, "emtjr");
            return (Criteria) this;
        }

        public Criteria andEmtjrIn(List<String> values) {
            addCriterion("emtjr in", values, "emtjr");
            return (Criteria) this;
        }

        public Criteria andEmtjrNotIn(List<String> values) {
            addCriterion("emtjr not in", values, "emtjr");
            return (Criteria) this;
        }

        public Criteria andEmtjrBetween(String value1, String value2) {
            addCriterion("emtjr between", value1, value2, "emtjr");
            return (Criteria) this;
        }

        public Criteria andEmtjrNotBetween(String value1, String value2) {
            addCriterion("emtjr not between", value1, value2, "emtjr");
            return (Criteria) this;
        }

        public Criteria andEmzdzkqIsNull() {
            addCriterion("emzdzkq is null");
            return (Criteria) this;
        }

        public Criteria andEmzdzkqIsNotNull() {
            addCriterion("emzdzkq is not null");
            return (Criteria) this;
        }

        public Criteria andEmzdzkqEqualTo(String value) {
            addCriterion("emzdzkq =", value, "emzdzkq");
            return (Criteria) this;
        }

        public Criteria andEmzdzkqNotEqualTo(String value) {
            addCriterion("emzdzkq <>", value, "emzdzkq");
            return (Criteria) this;
        }

        public Criteria andEmzdzkqGreaterThan(String value) {
            addCriterion("emzdzkq >", value, "emzdzkq");
            return (Criteria) this;
        }

        public Criteria andEmzdzkqGreaterThanOrEqualTo(String value) {
            addCriterion("emzdzkq >=", value, "emzdzkq");
            return (Criteria) this;
        }

        public Criteria andEmzdzkqLessThan(String value) {
            addCriterion("emzdzkq <", value, "emzdzkq");
            return (Criteria) this;
        }

        public Criteria andEmzdzkqLessThanOrEqualTo(String value) {
            addCriterion("emzdzkq <=", value, "emzdzkq");
            return (Criteria) this;
        }

        public Criteria andEmzdzkqLike(String value) {
            addCriterion("emzdzkq like", value, "emzdzkq");
            return (Criteria) this;
        }

        public Criteria andEmzdzkqNotLike(String value) {
            addCriterion("emzdzkq not like", value, "emzdzkq");
            return (Criteria) this;
        }

        public Criteria andEmzdzkqIn(List<String> values) {
            addCriterion("emzdzkq in", values, "emzdzkq");
            return (Criteria) this;
        }

        public Criteria andEmzdzkqNotIn(List<String> values) {
            addCriterion("emzdzkq not in", values, "emzdzkq");
            return (Criteria) this;
        }

        public Criteria andEmzdzkqBetween(String value1, String value2) {
            addCriterion("emzdzkq between", value1, value2, "emzdzkq");
            return (Criteria) this;
        }

        public Criteria andEmzdzkqNotBetween(String value1, String value2) {
            addCriterion("emzdzkq not between", value1, value2, "emzdzkq");
            return (Criteria) this;
        }

        public Criteria andEmgszkqIsNull() {
            addCriterion("emgszkq is null");
            return (Criteria) this;
        }

        public Criteria andEmgszkqIsNotNull() {
            addCriterion("emgszkq is not null");
            return (Criteria) this;
        }

        public Criteria andEmgszkqEqualTo(String value) {
            addCriterion("emgszkq =", value, "emgszkq");
            return (Criteria) this;
        }

        public Criteria andEmgszkqNotEqualTo(String value) {
            addCriterion("emgszkq <>", value, "emgszkq");
            return (Criteria) this;
        }

        public Criteria andEmgszkqGreaterThan(String value) {
            addCriterion("emgszkq >", value, "emgszkq");
            return (Criteria) this;
        }

        public Criteria andEmgszkqGreaterThanOrEqualTo(String value) {
            addCriterion("emgszkq >=", value, "emgszkq");
            return (Criteria) this;
        }

        public Criteria andEmgszkqLessThan(String value) {
            addCriterion("emgszkq <", value, "emgszkq");
            return (Criteria) this;
        }

        public Criteria andEmgszkqLessThanOrEqualTo(String value) {
            addCriterion("emgszkq <=", value, "emgszkq");
            return (Criteria) this;
        }

        public Criteria andEmgszkqLike(String value) {
            addCriterion("emgszkq like", value, "emgszkq");
            return (Criteria) this;
        }

        public Criteria andEmgszkqNotLike(String value) {
            addCriterion("emgszkq not like", value, "emgszkq");
            return (Criteria) this;
        }

        public Criteria andEmgszkqIn(List<String> values) {
            addCriterion("emgszkq in", values, "emgszkq");
            return (Criteria) this;
        }

        public Criteria andEmgszkqNotIn(List<String> values) {
            addCriterion("emgszkq not in", values, "emgszkq");
            return (Criteria) this;
        }

        public Criteria andEmgszkqBetween(String value1, String value2) {
            addCriterion("emgszkq between", value1, value2, "emgszkq");
            return (Criteria) this;
        }

        public Criteria andEmgszkqNotBetween(String value1, String value2) {
            addCriterion("emgszkq not between", value1, value2, "emgszkq");
            return (Criteria) this;
        }

        public Criteria andEmspzkqIsNull() {
            addCriterion("emspzkq is null");
            return (Criteria) this;
        }

        public Criteria andEmspzkqIsNotNull() {
            addCriterion("emspzkq is not null");
            return (Criteria) this;
        }

        public Criteria andEmspzkqEqualTo(String value) {
            addCriterion("emspzkq =", value, "emspzkq");
            return (Criteria) this;
        }

        public Criteria andEmspzkqNotEqualTo(String value) {
            addCriterion("emspzkq <>", value, "emspzkq");
            return (Criteria) this;
        }

        public Criteria andEmspzkqGreaterThan(String value) {
            addCriterion("emspzkq >", value, "emspzkq");
            return (Criteria) this;
        }

        public Criteria andEmspzkqGreaterThanOrEqualTo(String value) {
            addCriterion("emspzkq >=", value, "emspzkq");
            return (Criteria) this;
        }

        public Criteria andEmspzkqLessThan(String value) {
            addCriterion("emspzkq <", value, "emspzkq");
            return (Criteria) this;
        }

        public Criteria andEmspzkqLessThanOrEqualTo(String value) {
            addCriterion("emspzkq <=", value, "emspzkq");
            return (Criteria) this;
        }

        public Criteria andEmspzkqLike(String value) {
            addCriterion("emspzkq like", value, "emspzkq");
            return (Criteria) this;
        }

        public Criteria andEmspzkqNotLike(String value) {
            addCriterion("emspzkq not like", value, "emspzkq");
            return (Criteria) this;
        }

        public Criteria andEmspzkqIn(List<String> values) {
            addCriterion("emspzkq in", values, "emspzkq");
            return (Criteria) this;
        }

        public Criteria andEmspzkqNotIn(List<String> values) {
            addCriterion("emspzkq not in", values, "emspzkq");
            return (Criteria) this;
        }

        public Criteria andEmspzkqBetween(String value1, String value2) {
            addCriterion("emspzkq between", value1, value2, "emspzkq");
            return (Criteria) this;
        }

        public Criteria andEmspzkqNotBetween(String value1, String value2) {
            addCriterion("emspzkq not between", value1, value2, "emspzkq");
            return (Criteria) this;
        }

        public Criteria andEmjmqIsNull() {
            addCriterion("emjmq is null");
            return (Criteria) this;
        }

        public Criteria andEmjmqIsNotNull() {
            addCriterion("emjmq is not null");
            return (Criteria) this;
        }

        public Criteria andEmjmqEqualTo(String value) {
            addCriterion("emjmq =", value, "emjmq");
            return (Criteria) this;
        }

        public Criteria andEmjmqNotEqualTo(String value) {
            addCriterion("emjmq <>", value, "emjmq");
            return (Criteria) this;
        }

        public Criteria andEmjmqGreaterThan(String value) {
            addCriterion("emjmq >", value, "emjmq");
            return (Criteria) this;
        }

        public Criteria andEmjmqGreaterThanOrEqualTo(String value) {
            addCriterion("emjmq >=", value, "emjmq");
            return (Criteria) this;
        }

        public Criteria andEmjmqLessThan(String value) {
            addCriterion("emjmq <", value, "emjmq");
            return (Criteria) this;
        }

        public Criteria andEmjmqLessThanOrEqualTo(String value) {
            addCriterion("emjmq <=", value, "emjmq");
            return (Criteria) this;
        }

        public Criteria andEmjmqLike(String value) {
            addCriterion("emjmq like", value, "emjmq");
            return (Criteria) this;
        }

        public Criteria andEmjmqNotLike(String value) {
            addCriterion("emjmq not like", value, "emjmq");
            return (Criteria) this;
        }

        public Criteria andEmjmqIn(List<String> values) {
            addCriterion("emjmq in", values, "emjmq");
            return (Criteria) this;
        }

        public Criteria andEmjmqNotIn(List<String> values) {
            addCriterion("emjmq not in", values, "emjmq");
            return (Criteria) this;
        }

        public Criteria andEmjmqBetween(String value1, String value2) {
            addCriterion("emjmq between", value1, value2, "emjmq");
            return (Criteria) this;
        }

        public Criteria andEmjmqNotBetween(String value1, String value2) {
            addCriterion("emjmq not between", value1, value2, "emjmq");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiIsNull() {
            addCriterion("zhuangtai is null");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiIsNotNull() {
            addCriterion("zhuangtai is not null");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiEqualTo(Integer value) {
            addCriterion("zhuangtai =", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiNotEqualTo(Integer value) {
            addCriterion("zhuangtai <>", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiGreaterThan(Integer value) {
            addCriterion("zhuangtai >", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiGreaterThanOrEqualTo(Integer value) {
            addCriterion("zhuangtai >=", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiLessThan(Integer value) {
            addCriterion("zhuangtai <", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiLessThanOrEqualTo(Integer value) {
            addCriterion("zhuangtai <=", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiIn(List<Integer> values) {
            addCriterion("zhuangtai in", values, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiNotIn(List<Integer> values) {
            addCriterion("zhuangtai not in", values, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiBetween(Integer value1, Integer value2) {
            addCriterion("zhuangtai between", value1, value2, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiNotBetween(Integer value1, Integer value2) {
            addCriterion("zhuangtai not between", value1, value2, "zhuangtai");
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