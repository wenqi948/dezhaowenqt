package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ClientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClientExample() {
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

        public Criteria andClientnameIsNull() {
            addCriterion("clientname is null");
            return (Criteria) this;
        }

        public Criteria andClientnameIsNotNull() {
            addCriterion("clientname is not null");
            return (Criteria) this;
        }

        public Criteria andClientnameEqualTo(String value) {
            addCriterion("clientname =", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotEqualTo(String value) {
            addCriterion("clientname <>", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameGreaterThan(String value) {
            addCriterion("clientname >", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameGreaterThanOrEqualTo(String value) {
            addCriterion("clientname >=", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLessThan(String value) {
            addCriterion("clientname <", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLessThanOrEqualTo(String value) {
            addCriterion("clientname <=", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLike(String value) {
            addCriterion("clientname like", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotLike(String value) {
            addCriterion("clientname not like", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameIn(List<String> values) {
            addCriterion("clientname in", values, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotIn(List<String> values) {
            addCriterion("clientname not in", values, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameBetween(String value1, String value2) {
            addCriterion("clientname between", value1, value2, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotBetween(String value1, String value2) {
            addCriterion("clientname not between", value1, value2, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientlxrIsNull() {
            addCriterion("clientlxr is null");
            return (Criteria) this;
        }

        public Criteria andClientlxrIsNotNull() {
            addCriterion("clientlxr is not null");
            return (Criteria) this;
        }

        public Criteria andClientlxrEqualTo(String value) {
            addCriterion("clientlxr =", value, "clientlxr");
            return (Criteria) this;
        }

        public Criteria andClientlxrNotEqualTo(String value) {
            addCriterion("clientlxr <>", value, "clientlxr");
            return (Criteria) this;
        }

        public Criteria andClientlxrGreaterThan(String value) {
            addCriterion("clientlxr >", value, "clientlxr");
            return (Criteria) this;
        }

        public Criteria andClientlxrGreaterThanOrEqualTo(String value) {
            addCriterion("clientlxr >=", value, "clientlxr");
            return (Criteria) this;
        }

        public Criteria andClientlxrLessThan(String value) {
            addCriterion("clientlxr <", value, "clientlxr");
            return (Criteria) this;
        }

        public Criteria andClientlxrLessThanOrEqualTo(String value) {
            addCriterion("clientlxr <=", value, "clientlxr");
            return (Criteria) this;
        }

        public Criteria andClientlxrLike(String value) {
            addCriterion("clientlxr like", value, "clientlxr");
            return (Criteria) this;
        }

        public Criteria andClientlxrNotLike(String value) {
            addCriterion("clientlxr not like", value, "clientlxr");
            return (Criteria) this;
        }

        public Criteria andClientlxrIn(List<String> values) {
            addCriterion("clientlxr in", values, "clientlxr");
            return (Criteria) this;
        }

        public Criteria andClientlxrNotIn(List<String> values) {
            addCriterion("clientlxr not in", values, "clientlxr");
            return (Criteria) this;
        }

        public Criteria andClientlxrBetween(String value1, String value2) {
            addCriterion("clientlxr between", value1, value2, "clientlxr");
            return (Criteria) this;
        }

        public Criteria andClientlxrNotBetween(String value1, String value2) {
            addCriterion("clientlxr not between", value1, value2, "clientlxr");
            return (Criteria) this;
        }

        public Criteria andClientphoneIsNull() {
            addCriterion("clientphone is null");
            return (Criteria) this;
        }

        public Criteria andClientphoneIsNotNull() {
            addCriterion("clientphone is not null");
            return (Criteria) this;
        }

        public Criteria andClientphoneEqualTo(String value) {
            addCriterion("clientphone =", value, "clientphone");
            return (Criteria) this;
        }

        public Criteria andClientphoneNotEqualTo(String value) {
            addCriterion("clientphone <>", value, "clientphone");
            return (Criteria) this;
        }

        public Criteria andClientphoneGreaterThan(String value) {
            addCriterion("clientphone >", value, "clientphone");
            return (Criteria) this;
        }

        public Criteria andClientphoneGreaterThanOrEqualTo(String value) {
            addCriterion("clientphone >=", value, "clientphone");
            return (Criteria) this;
        }

        public Criteria andClientphoneLessThan(String value) {
            addCriterion("clientphone <", value, "clientphone");
            return (Criteria) this;
        }

        public Criteria andClientphoneLessThanOrEqualTo(String value) {
            addCriterion("clientphone <=", value, "clientphone");
            return (Criteria) this;
        }

        public Criteria andClientphoneLike(String value) {
            addCriterion("clientphone like", value, "clientphone");
            return (Criteria) this;
        }

        public Criteria andClientphoneNotLike(String value) {
            addCriterion("clientphone not like", value, "clientphone");
            return (Criteria) this;
        }

        public Criteria andClientphoneIn(List<String> values) {
            addCriterion("clientphone in", values, "clientphone");
            return (Criteria) this;
        }

        public Criteria andClientphoneNotIn(List<String> values) {
            addCriterion("clientphone not in", values, "clientphone");
            return (Criteria) this;
        }

        public Criteria andClientphoneBetween(String value1, String value2) {
            addCriterion("clientphone between", value1, value2, "clientphone");
            return (Criteria) this;
        }

        public Criteria andClientphoneNotBetween(String value1, String value2) {
            addCriterion("clientphone not between", value1, value2, "clientphone");
            return (Criteria) this;
        }

        public Criteria andClientaddresssIsNull() {
            addCriterion("clientaddresss is null");
            return (Criteria) this;
        }

        public Criteria andClientaddresssIsNotNull() {
            addCriterion("clientaddresss is not null");
            return (Criteria) this;
        }

        public Criteria andClientaddresssEqualTo(String value) {
            addCriterion("clientaddresss =", value, "clientaddresss");
            return (Criteria) this;
        }

        public Criteria andClientaddresssNotEqualTo(String value) {
            addCriterion("clientaddresss <>", value, "clientaddresss");
            return (Criteria) this;
        }

        public Criteria andClientaddresssGreaterThan(String value) {
            addCriterion("clientaddresss >", value, "clientaddresss");
            return (Criteria) this;
        }

        public Criteria andClientaddresssGreaterThanOrEqualTo(String value) {
            addCriterion("clientaddresss >=", value, "clientaddresss");
            return (Criteria) this;
        }

        public Criteria andClientaddresssLessThan(String value) {
            addCriterion("clientaddresss <", value, "clientaddresss");
            return (Criteria) this;
        }

        public Criteria andClientaddresssLessThanOrEqualTo(String value) {
            addCriterion("clientaddresss <=", value, "clientaddresss");
            return (Criteria) this;
        }

        public Criteria andClientaddresssLike(String value) {
            addCriterion("clientaddresss like", value, "clientaddresss");
            return (Criteria) this;
        }

        public Criteria andClientaddresssNotLike(String value) {
            addCriterion("clientaddresss not like", value, "clientaddresss");
            return (Criteria) this;
        }

        public Criteria andClientaddresssIn(List<String> values) {
            addCriterion("clientaddresss in", values, "clientaddresss");
            return (Criteria) this;
        }

        public Criteria andClientaddresssNotIn(List<String> values) {
            addCriterion("clientaddresss not in", values, "clientaddresss");
            return (Criteria) this;
        }

        public Criteria andClientaddresssBetween(String value1, String value2) {
            addCriterion("clientaddresss between", value1, value2, "clientaddresss");
            return (Criteria) this;
        }

        public Criteria andClientaddresssNotBetween(String value1, String value2) {
            addCriterion("clientaddresss not between", value1, value2, "clientaddresss");
            return (Criteria) this;
        }

        public Criteria andClientdayIsNull() {
            addCriterion("clientday is null");
            return (Criteria) this;
        }

        public Criteria andClientdayIsNotNull() {
            addCriterion("clientday is not null");
            return (Criteria) this;
        }

        public Criteria andClientdayEqualTo(Date value) {
            addCriterionForJDBCDate("clientday =", value, "clientday");
            return (Criteria) this;
        }

        public Criteria andClientdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("clientday <>", value, "clientday");
            return (Criteria) this;
        }

        public Criteria andClientdayGreaterThan(Date value) {
            addCriterionForJDBCDate("clientday >", value, "clientday");
            return (Criteria) this;
        }

        public Criteria andClientdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("clientday >=", value, "clientday");
            return (Criteria) this;
        }

        public Criteria andClientdayLessThan(Date value) {
            addCriterionForJDBCDate("clientday <", value, "clientday");
            return (Criteria) this;
        }

        public Criteria andClientdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("clientday <=", value, "clientday");
            return (Criteria) this;
        }

        public Criteria andClientdayIn(List<Date> values) {
            addCriterionForJDBCDate("clientday in", values, "clientday");
            return (Criteria) this;
        }

        public Criteria andClientdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("clientday not in", values, "clientday");
            return (Criteria) this;
        }

        public Criteria andClientdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("clientday between", value1, value2, "clientday");
            return (Criteria) this;
        }

        public Criteria andClientdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("clientday not between", value1, value2, "clientday");
            return (Criteria) this;
        }

        public Criteria andClientzqIsNull() {
            addCriterion("clientzq is null");
            return (Criteria) this;
        }

        public Criteria andClientzqIsNotNull() {
            addCriterion("clientzq is not null");
            return (Criteria) this;
        }

        public Criteria andClientzqEqualTo(Integer value) {
            addCriterion("clientzq =", value, "clientzq");
            return (Criteria) this;
        }

        public Criteria andClientzqNotEqualTo(Integer value) {
            addCriterion("clientzq <>", value, "clientzq");
            return (Criteria) this;
        }

        public Criteria andClientzqGreaterThan(Integer value) {
            addCriterion("clientzq >", value, "clientzq");
            return (Criteria) this;
        }

        public Criteria andClientzqGreaterThanOrEqualTo(Integer value) {
            addCriterion("clientzq >=", value, "clientzq");
            return (Criteria) this;
        }

        public Criteria andClientzqLessThan(Integer value) {
            addCriterion("clientzq <", value, "clientzq");
            return (Criteria) this;
        }

        public Criteria andClientzqLessThanOrEqualTo(Integer value) {
            addCriterion("clientzq <=", value, "clientzq");
            return (Criteria) this;
        }

        public Criteria andClientzqIn(List<Integer> values) {
            addCriterion("clientzq in", values, "clientzq");
            return (Criteria) this;
        }

        public Criteria andClientzqNotIn(List<Integer> values) {
            addCriterion("clientzq not in", values, "clientzq");
            return (Criteria) this;
        }

        public Criteria andClientzqBetween(Integer value1, Integer value2) {
            addCriterion("clientzq between", value1, value2, "clientzq");
            return (Criteria) this;
        }

        public Criteria andClientzqNotBetween(Integer value1, Integer value2) {
            addCriterion("clientzq not between", value1, value2, "clientzq");
            return (Criteria) this;
        }

        public Criteria andClientmoneyIsNull() {
            addCriterion("clientmoney is null");
            return (Criteria) this;
        }

        public Criteria andClientmoneyIsNotNull() {
            addCriterion("clientmoney is not null");
            return (Criteria) this;
        }

        public Criteria andClientmoneyEqualTo(Integer value) {
            addCriterion("clientmoney =", value, "clientmoney");
            return (Criteria) this;
        }

        public Criteria andClientmoneyNotEqualTo(Integer value) {
            addCriterion("clientmoney <>", value, "clientmoney");
            return (Criteria) this;
        }

        public Criteria andClientmoneyGreaterThan(Integer value) {
            addCriterion("clientmoney >", value, "clientmoney");
            return (Criteria) this;
        }

        public Criteria andClientmoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("clientmoney >=", value, "clientmoney");
            return (Criteria) this;
        }

        public Criteria andClientmoneyLessThan(Integer value) {
            addCriterion("clientmoney <", value, "clientmoney");
            return (Criteria) this;
        }

        public Criteria andClientmoneyLessThanOrEqualTo(Integer value) {
            addCriterion("clientmoney <=", value, "clientmoney");
            return (Criteria) this;
        }

        public Criteria andClientmoneyIn(List<Integer> values) {
            addCriterion("clientmoney in", values, "clientmoney");
            return (Criteria) this;
        }

        public Criteria andClientmoneyNotIn(List<Integer> values) {
            addCriterion("clientmoney not in", values, "clientmoney");
            return (Criteria) this;
        }

        public Criteria andClientmoneyBetween(Integer value1, Integer value2) {
            addCriterion("clientmoney between", value1, value2, "clientmoney");
            return (Criteria) this;
        }

        public Criteria andClientmoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("clientmoney not between", value1, value2, "clientmoney");
            return (Criteria) this;
        }

        public Criteria andClientgwIsNull() {
            addCriterion("clientgw is null");
            return (Criteria) this;
        }

        public Criteria andClientgwIsNotNull() {
            addCriterion("clientgw is not null");
            return (Criteria) this;
        }

        public Criteria andClientgwEqualTo(String value) {
            addCriterion("clientgw =", value, "clientgw");
            return (Criteria) this;
        }

        public Criteria andClientgwNotEqualTo(String value) {
            addCriterion("clientgw <>", value, "clientgw");
            return (Criteria) this;
        }

        public Criteria andClientgwGreaterThan(String value) {
            addCriterion("clientgw >", value, "clientgw");
            return (Criteria) this;
        }

        public Criteria andClientgwGreaterThanOrEqualTo(String value) {
            addCriterion("clientgw >=", value, "clientgw");
            return (Criteria) this;
        }

        public Criteria andClientgwLessThan(String value) {
            addCriterion("clientgw <", value, "clientgw");
            return (Criteria) this;
        }

        public Criteria andClientgwLessThanOrEqualTo(String value) {
            addCriterion("clientgw <=", value, "clientgw");
            return (Criteria) this;
        }

        public Criteria andClientgwLike(String value) {
            addCriterion("clientgw like", value, "clientgw");
            return (Criteria) this;
        }

        public Criteria andClientgwNotLike(String value) {
            addCriterion("clientgw not like", value, "clientgw");
            return (Criteria) this;
        }

        public Criteria andClientgwIn(List<String> values) {
            addCriterion("clientgw in", values, "clientgw");
            return (Criteria) this;
        }

        public Criteria andClientgwNotIn(List<String> values) {
            addCriterion("clientgw not in", values, "clientgw");
            return (Criteria) this;
        }

        public Criteria andClientgwBetween(String value1, String value2) {
            addCriterion("clientgw between", value1, value2, "clientgw");
            return (Criteria) this;
        }

        public Criteria andClientgwNotBetween(String value1, String value2) {
            addCriterion("clientgw not between", value1, value2, "clientgw");
            return (Criteria) this;
        }

        public Criteria andClientgwphoneIsNull() {
            addCriterion("clientgwphone is null");
            return (Criteria) this;
        }

        public Criteria andClientgwphoneIsNotNull() {
            addCriterion("clientgwphone is not null");
            return (Criteria) this;
        }

        public Criteria andClientgwphoneEqualTo(String value) {
            addCriterion("clientgwphone =", value, "clientgwphone");
            return (Criteria) this;
        }

        public Criteria andClientgwphoneNotEqualTo(String value) {
            addCriterion("clientgwphone <>", value, "clientgwphone");
            return (Criteria) this;
        }

        public Criteria andClientgwphoneGreaterThan(String value) {
            addCriterion("clientgwphone >", value, "clientgwphone");
            return (Criteria) this;
        }

        public Criteria andClientgwphoneGreaterThanOrEqualTo(String value) {
            addCriterion("clientgwphone >=", value, "clientgwphone");
            return (Criteria) this;
        }

        public Criteria andClientgwphoneLessThan(String value) {
            addCriterion("clientgwphone <", value, "clientgwphone");
            return (Criteria) this;
        }

        public Criteria andClientgwphoneLessThanOrEqualTo(String value) {
            addCriterion("clientgwphone <=", value, "clientgwphone");
            return (Criteria) this;
        }

        public Criteria andClientgwphoneLike(String value) {
            addCriterion("clientgwphone like", value, "clientgwphone");
            return (Criteria) this;
        }

        public Criteria andClientgwphoneNotLike(String value) {
            addCriterion("clientgwphone not like", value, "clientgwphone");
            return (Criteria) this;
        }

        public Criteria andClientgwphoneIn(List<String> values) {
            addCriterion("clientgwphone in", values, "clientgwphone");
            return (Criteria) this;
        }

        public Criteria andClientgwphoneNotIn(List<String> values) {
            addCriterion("clientgwphone not in", values, "clientgwphone");
            return (Criteria) this;
        }

        public Criteria andClientgwphoneBetween(String value1, String value2) {
            addCriterion("clientgwphone between", value1, value2, "clientgwphone");
            return (Criteria) this;
        }

        public Criteria andClientgwphoneNotBetween(String value1, String value2) {
            addCriterion("clientgwphone not between", value1, value2, "clientgwphone");
            return (Criteria) this;
        }

        public Criteria andClientbzIsNull() {
            addCriterion("clientbz is null");
            return (Criteria) this;
        }

        public Criteria andClientbzIsNotNull() {
            addCriterion("clientbz is not null");
            return (Criteria) this;
        }

        public Criteria andClientbzEqualTo(String value) {
            addCriterion("clientbz =", value, "clientbz");
            return (Criteria) this;
        }

        public Criteria andClientbzNotEqualTo(String value) {
            addCriterion("clientbz <>", value, "clientbz");
            return (Criteria) this;
        }

        public Criteria andClientbzGreaterThan(String value) {
            addCriterion("clientbz >", value, "clientbz");
            return (Criteria) this;
        }

        public Criteria andClientbzGreaterThanOrEqualTo(String value) {
            addCriterion("clientbz >=", value, "clientbz");
            return (Criteria) this;
        }

        public Criteria andClientbzLessThan(String value) {
            addCriterion("clientbz <", value, "clientbz");
            return (Criteria) this;
        }

        public Criteria andClientbzLessThanOrEqualTo(String value) {
            addCriterion("clientbz <=", value, "clientbz");
            return (Criteria) this;
        }

        public Criteria andClientbzLike(String value) {
            addCriterion("clientbz like", value, "clientbz");
            return (Criteria) this;
        }

        public Criteria andClientbzNotLike(String value) {
            addCriterion("clientbz not like", value, "clientbz");
            return (Criteria) this;
        }

        public Criteria andClientbzIn(List<String> values) {
            addCriterion("clientbz in", values, "clientbz");
            return (Criteria) this;
        }

        public Criteria andClientbzNotIn(List<String> values) {
            addCriterion("clientbz not in", values, "clientbz");
            return (Criteria) this;
        }

        public Criteria andClientbzBetween(String value1, String value2) {
            addCriterion("clientbz between", value1, value2, "clientbz");
            return (Criteria) this;
        }

        public Criteria andClientbzNotBetween(String value1, String value2) {
            addCriterion("clientbz not between", value1, value2, "clientbz");
            return (Criteria) this;
        }

        public Criteria andYuliuIsNull() {
            addCriterion("yuliu is null");
            return (Criteria) this;
        }

        public Criteria andYuliuIsNotNull() {
            addCriterion("yuliu is not null");
            return (Criteria) this;
        }

        public Criteria andYuliuEqualTo(String value) {
            addCriterion("yuliu =", value, "yuliu");
            return (Criteria) this;
        }

        public Criteria andYuliuNotEqualTo(String value) {
            addCriterion("yuliu <>", value, "yuliu");
            return (Criteria) this;
        }

        public Criteria andYuliuGreaterThan(String value) {
            addCriterion("yuliu >", value, "yuliu");
            return (Criteria) this;
        }

        public Criteria andYuliuGreaterThanOrEqualTo(String value) {
            addCriterion("yuliu >=", value, "yuliu");
            return (Criteria) this;
        }

        public Criteria andYuliuLessThan(String value) {
            addCriterion("yuliu <", value, "yuliu");
            return (Criteria) this;
        }

        public Criteria andYuliuLessThanOrEqualTo(String value) {
            addCriterion("yuliu <=", value, "yuliu");
            return (Criteria) this;
        }

        public Criteria andYuliuLike(String value) {
            addCriterion("yuliu like", value, "yuliu");
            return (Criteria) this;
        }

        public Criteria andYuliuNotLike(String value) {
            addCriterion("yuliu not like", value, "yuliu");
            return (Criteria) this;
        }

        public Criteria andYuliuIn(List<String> values) {
            addCriterion("yuliu in", values, "yuliu");
            return (Criteria) this;
        }

        public Criteria andYuliuNotIn(List<String> values) {
            addCriterion("yuliu not in", values, "yuliu");
            return (Criteria) this;
        }

        public Criteria andYuliuBetween(String value1, String value2) {
            addCriterion("yuliu between", value1, value2, "yuliu");
            return (Criteria) this;
        }

        public Criteria andYuliuNotBetween(String value1, String value2) {
            addCriterion("yuliu not between", value1, value2, "yuliu");
            return (Criteria) this;
        }

        public Criteria andYuliu2IsNull() {
            addCriterion("yuliu2 is null");
            return (Criteria) this;
        }

        public Criteria andYuliu2IsNotNull() {
            addCriterion("yuliu2 is not null");
            return (Criteria) this;
        }

        public Criteria andYuliu2EqualTo(String value) {
            addCriterion("yuliu2 =", value, "yuliu2");
            return (Criteria) this;
        }

        public Criteria andYuliu2NotEqualTo(String value) {
            addCriterion("yuliu2 <>", value, "yuliu2");
            return (Criteria) this;
        }

        public Criteria andYuliu2GreaterThan(String value) {
            addCriterion("yuliu2 >", value, "yuliu2");
            return (Criteria) this;
        }

        public Criteria andYuliu2GreaterThanOrEqualTo(String value) {
            addCriterion("yuliu2 >=", value, "yuliu2");
            return (Criteria) this;
        }

        public Criteria andYuliu2LessThan(String value) {
            addCriterion("yuliu2 <", value, "yuliu2");
            return (Criteria) this;
        }

        public Criteria andYuliu2LessThanOrEqualTo(String value) {
            addCriterion("yuliu2 <=", value, "yuliu2");
            return (Criteria) this;
        }

        public Criteria andYuliu2Like(String value) {
            addCriterion("yuliu2 like", value, "yuliu2");
            return (Criteria) this;
        }

        public Criteria andYuliu2NotLike(String value) {
            addCriterion("yuliu2 not like", value, "yuliu2");
            return (Criteria) this;
        }

        public Criteria andYuliu2In(List<String> values) {
            addCriterion("yuliu2 in", values, "yuliu2");
            return (Criteria) this;
        }

        public Criteria andYuliu2NotIn(List<String> values) {
            addCriterion("yuliu2 not in", values, "yuliu2");
            return (Criteria) this;
        }

        public Criteria andYuliu2Between(String value1, String value2) {
            addCriterion("yuliu2 between", value1, value2, "yuliu2");
            return (Criteria) this;
        }

        public Criteria andYuliu2NotBetween(String value1, String value2) {
            addCriterion("yuliu2 not between", value1, value2, "yuliu2");
            return (Criteria) this;
        }

        public Criteria andYuliu3IsNull() {
            addCriterion("yuliu3 is null");
            return (Criteria) this;
        }

        public Criteria andYuliu3IsNotNull() {
            addCriterion("yuliu3 is not null");
            return (Criteria) this;
        }

        public Criteria andYuliu3EqualTo(String value) {
            addCriterion("yuliu3 =", value, "yuliu3");
            return (Criteria) this;
        }

        public Criteria andYuliu3NotEqualTo(String value) {
            addCriterion("yuliu3 <>", value, "yuliu3");
            return (Criteria) this;
        }

        public Criteria andYuliu3GreaterThan(String value) {
            addCriterion("yuliu3 >", value, "yuliu3");
            return (Criteria) this;
        }

        public Criteria andYuliu3GreaterThanOrEqualTo(String value) {
            addCriterion("yuliu3 >=", value, "yuliu3");
            return (Criteria) this;
        }

        public Criteria andYuliu3LessThan(String value) {
            addCriterion("yuliu3 <", value, "yuliu3");
            return (Criteria) this;
        }

        public Criteria andYuliu3LessThanOrEqualTo(String value) {
            addCriterion("yuliu3 <=", value, "yuliu3");
            return (Criteria) this;
        }

        public Criteria andYuliu3Like(String value) {
            addCriterion("yuliu3 like", value, "yuliu3");
            return (Criteria) this;
        }

        public Criteria andYuliu3NotLike(String value) {
            addCriterion("yuliu3 not like", value, "yuliu3");
            return (Criteria) this;
        }

        public Criteria andYuliu3In(List<String> values) {
            addCriterion("yuliu3 in", values, "yuliu3");
            return (Criteria) this;
        }

        public Criteria andYuliu3NotIn(List<String> values) {
            addCriterion("yuliu3 not in", values, "yuliu3");
            return (Criteria) this;
        }

        public Criteria andYuliu3Between(String value1, String value2) {
            addCriterion("yuliu3 between", value1, value2, "yuliu3");
            return (Criteria) this;
        }

        public Criteria andYuliu3NotBetween(String value1, String value2) {
            addCriterion("yuliu3 not between", value1, value2, "yuliu3");
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