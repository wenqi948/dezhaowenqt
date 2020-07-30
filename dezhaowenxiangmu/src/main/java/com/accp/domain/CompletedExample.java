package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompletedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompletedExample() {
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

        public Criteria andCmidIsNull() {
            addCriterion("cmid is null");
            return (Criteria) this;
        }

        public Criteria andCmidIsNotNull() {
            addCriterion("cmid is not null");
            return (Criteria) this;
        }

        public Criteria andCmidEqualTo(Integer value) {
            addCriterion("cmid =", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidNotEqualTo(Integer value) {
            addCriterion("cmid <>", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidGreaterThan(Integer value) {
            addCriterion("cmid >", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cmid >=", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidLessThan(Integer value) {
            addCriterion("cmid <", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidLessThanOrEqualTo(Integer value) {
            addCriterion("cmid <=", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidIn(List<Integer> values) {
            addCriterion("cmid in", values, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidNotIn(List<Integer> values) {
            addCriterion("cmid not in", values, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidBetween(Integer value1, Integer value2) {
            addCriterion("cmid between", value1, value2, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidNotBetween(Integer value1, Integer value2) {
            addCriterion("cmid not between", value1, value2, "cmid");
            return (Criteria) this;
        }

        public Criteria andDanhaoIsNull() {
            addCriterion("danhao is null");
            return (Criteria) this;
        }

        public Criteria andDanhaoIsNotNull() {
            addCriterion("danhao is not null");
            return (Criteria) this;
        }

        public Criteria andDanhaoEqualTo(Integer value) {
            addCriterion("danhao =", value, "danhao");
            return (Criteria) this;
        }

        public Criteria andDanhaoNotEqualTo(Integer value) {
            addCriterion("danhao <>", value, "danhao");
            return (Criteria) this;
        }

        public Criteria andDanhaoGreaterThan(Integer value) {
            addCriterion("danhao >", value, "danhao");
            return (Criteria) this;
        }

        public Criteria andDanhaoGreaterThanOrEqualTo(Integer value) {
            addCriterion("danhao >=", value, "danhao");
            return (Criteria) this;
        }

        public Criteria andDanhaoLessThan(Integer value) {
            addCriterion("danhao <", value, "danhao");
            return (Criteria) this;
        }

        public Criteria andDanhaoLessThanOrEqualTo(Integer value) {
            addCriterion("danhao <=", value, "danhao");
            return (Criteria) this;
        }

        public Criteria andDanhaoIn(List<Integer> values) {
            addCriterion("danhao in", values, "danhao");
            return (Criteria) this;
        }

        public Criteria andDanhaoNotIn(List<Integer> values) {
            addCriterion("danhao not in", values, "danhao");
            return (Criteria) this;
        }

        public Criteria andDanhaoBetween(Integer value1, Integer value2) {
            addCriterion("danhao between", value1, value2, "danhao");
            return (Criteria) this;
        }

        public Criteria andDanhaoNotBetween(Integer value1, Integer value2) {
            addCriterion("danhao not between", value1, value2, "danhao");
            return (Criteria) this;
        }

        public Criteria andYjwgIsNull() {
            addCriterion("yjwg is null");
            return (Criteria) this;
        }

        public Criteria andYjwgIsNotNull() {
            addCriterion("yjwg is not null");
            return (Criteria) this;
        }

        public Criteria andYjwgEqualTo(String value) {
            addCriterion("yjwg =", value, "yjwg");
            return (Criteria) this;
        }

        public Criteria andYjwgNotEqualTo(String value) {
            addCriterion("yjwg <>", value, "yjwg");
            return (Criteria) this;
        }

        public Criteria andYjwgGreaterThan(String value) {
            addCriterion("yjwg >", value, "yjwg");
            return (Criteria) this;
        }

        public Criteria andYjwgGreaterThanOrEqualTo(String value) {
            addCriterion("yjwg >=", value, "yjwg");
            return (Criteria) this;
        }

        public Criteria andYjwgLessThan(String value) {
            addCriterion("yjwg <", value, "yjwg");
            return (Criteria) this;
        }

        public Criteria andYjwgLessThanOrEqualTo(String value) {
            addCriterion("yjwg <=", value, "yjwg");
            return (Criteria) this;
        }

        public Criteria andYjwgLike(String value) {
            addCriterion("yjwg like", value, "yjwg");
            return (Criteria) this;
        }

        public Criteria andYjwgNotLike(String value) {
            addCriterion("yjwg not like", value, "yjwg");
            return (Criteria) this;
        }

        public Criteria andYjwgIn(List<String> values) {
            addCriterion("yjwg in", values, "yjwg");
            return (Criteria) this;
        }

        public Criteria andYjwgNotIn(List<String> values) {
            addCriterion("yjwg not in", values, "yjwg");
            return (Criteria) this;
        }

        public Criteria andYjwgBetween(String value1, String value2) {
            addCriterion("yjwg between", value1, value2, "yjwg");
            return (Criteria) this;
        }

        public Criteria andYjwgNotBetween(String value1, String value2) {
            addCriterion("yjwg not between", value1, value2, "yjwg");
            return (Criteria) this;
        }

        public Criteria andSjwgIsNull() {
            addCriterion("sjwg is null");
            return (Criteria) this;
        }

        public Criteria andSjwgIsNotNull() {
            addCriterion("sjwg is not null");
            return (Criteria) this;
        }

        public Criteria andSjwgEqualTo(String value) {
            addCriterion("sjwg =", value, "sjwg");
            return (Criteria) this;
        }

        public Criteria andSjwgNotEqualTo(String value) {
            addCriterion("sjwg <>", value, "sjwg");
            return (Criteria) this;
        }

        public Criteria andSjwgGreaterThan(String value) {
            addCriterion("sjwg >", value, "sjwg");
            return (Criteria) this;
        }

        public Criteria andSjwgGreaterThanOrEqualTo(String value) {
            addCriterion("sjwg >=", value, "sjwg");
            return (Criteria) this;
        }

        public Criteria andSjwgLessThan(String value) {
            addCriterion("sjwg <", value, "sjwg");
            return (Criteria) this;
        }

        public Criteria andSjwgLessThanOrEqualTo(String value) {
            addCriterion("sjwg <=", value, "sjwg");
            return (Criteria) this;
        }

        public Criteria andSjwgLike(String value) {
            addCriterion("sjwg like", value, "sjwg");
            return (Criteria) this;
        }

        public Criteria andSjwgNotLike(String value) {
            addCriterion("sjwg not like", value, "sjwg");
            return (Criteria) this;
        }

        public Criteria andSjwgIn(List<String> values) {
            addCriterion("sjwg in", values, "sjwg");
            return (Criteria) this;
        }

        public Criteria andSjwgNotIn(List<String> values) {
            addCriterion("sjwg not in", values, "sjwg");
            return (Criteria) this;
        }

        public Criteria andSjwgBetween(String value1, String value2) {
            addCriterion("sjwg between", value1, value2, "sjwg");
            return (Criteria) this;
        }

        public Criteria andSjwgNotBetween(String value1, String value2) {
            addCriterion("sjwg not between", value1, value2, "sjwg");
            return (Criteria) this;
        }

        public Criteria andWgyyIsNull() {
            addCriterion("wgyy is null");
            return (Criteria) this;
        }

        public Criteria andWgyyIsNotNull() {
            addCriterion("wgyy is not null");
            return (Criteria) this;
        }

        public Criteria andWgyyEqualTo(String value) {
            addCriterion("wgyy =", value, "wgyy");
            return (Criteria) this;
        }

        public Criteria andWgyyNotEqualTo(String value) {
            addCriterion("wgyy <>", value, "wgyy");
            return (Criteria) this;
        }

        public Criteria andWgyyGreaterThan(String value) {
            addCriterion("wgyy >", value, "wgyy");
            return (Criteria) this;
        }

        public Criteria andWgyyGreaterThanOrEqualTo(String value) {
            addCriterion("wgyy >=", value, "wgyy");
            return (Criteria) this;
        }

        public Criteria andWgyyLessThan(String value) {
            addCriterion("wgyy <", value, "wgyy");
            return (Criteria) this;
        }

        public Criteria andWgyyLessThanOrEqualTo(String value) {
            addCriterion("wgyy <=", value, "wgyy");
            return (Criteria) this;
        }

        public Criteria andWgyyLike(String value) {
            addCriterion("wgyy like", value, "wgyy");
            return (Criteria) this;
        }

        public Criteria andWgyyNotLike(String value) {
            addCriterion("wgyy not like", value, "wgyy");
            return (Criteria) this;
        }

        public Criteria andWgyyIn(List<String> values) {
            addCriterion("wgyy in", values, "wgyy");
            return (Criteria) this;
        }

        public Criteria andWgyyNotIn(List<String> values) {
            addCriterion("wgyy not in", values, "wgyy");
            return (Criteria) this;
        }

        public Criteria andWgyyBetween(String value1, String value2) {
            addCriterion("wgyy between", value1, value2, "wgyy");
            return (Criteria) this;
        }

        public Criteria andWgyyNotBetween(String value1, String value2) {
            addCriterion("wgyy not between", value1, value2, "wgyy");
            return (Criteria) this;
        }

        public Criteria andZjyidIsNull() {
            addCriterion("zjyid is null");
            return (Criteria) this;
        }

        public Criteria andZjyidIsNotNull() {
            addCriterion("zjyid is not null");
            return (Criteria) this;
        }

        public Criteria andZjyidEqualTo(String value) {
            addCriterion("zjyid =", value, "zjyid");
            return (Criteria) this;
        }

        public Criteria andZjyidNotEqualTo(String value) {
            addCriterion("zjyid <>", value, "zjyid");
            return (Criteria) this;
        }

        public Criteria andZjyidGreaterThan(String value) {
            addCriterion("zjyid >", value, "zjyid");
            return (Criteria) this;
        }

        public Criteria andZjyidGreaterThanOrEqualTo(String value) {
            addCriterion("zjyid >=", value, "zjyid");
            return (Criteria) this;
        }

        public Criteria andZjyidLessThan(String value) {
            addCriterion("zjyid <", value, "zjyid");
            return (Criteria) this;
        }

        public Criteria andZjyidLessThanOrEqualTo(String value) {
            addCriterion("zjyid <=", value, "zjyid");
            return (Criteria) this;
        }

        public Criteria andZjyidLike(String value) {
            addCriterion("zjyid like", value, "zjyid");
            return (Criteria) this;
        }

        public Criteria andZjyidNotLike(String value) {
            addCriterion("zjyid not like", value, "zjyid");
            return (Criteria) this;
        }

        public Criteria andZjyidIn(List<String> values) {
            addCriterion("zjyid in", values, "zjyid");
            return (Criteria) this;
        }

        public Criteria andZjyidNotIn(List<String> values) {
            addCriterion("zjyid not in", values, "zjyid");
            return (Criteria) this;
        }

        public Criteria andZjyidBetween(String value1, String value2) {
            addCriterion("zjyid between", value1, value2, "zjyid");
            return (Criteria) this;
        }

        public Criteria andZjyidNotBetween(String value1, String value2) {
            addCriterion("zjyid not between", value1, value2, "zjyid");
            return (Criteria) this;
        }

        public Criteria andCfmoneyIsNull() {
            addCriterion("cfmoney is null");
            return (Criteria) this;
        }

        public Criteria andCfmoneyIsNotNull() {
            addCriterion("cfmoney is not null");
            return (Criteria) this;
        }

        public Criteria andCfmoneyEqualTo(Integer value) {
            addCriterion("cfmoney =", value, "cfmoney");
            return (Criteria) this;
        }

        public Criteria andCfmoneyNotEqualTo(Integer value) {
            addCriterion("cfmoney <>", value, "cfmoney");
            return (Criteria) this;
        }

        public Criteria andCfmoneyGreaterThan(Integer value) {
            addCriterion("cfmoney >", value, "cfmoney");
            return (Criteria) this;
        }

        public Criteria andCfmoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("cfmoney >=", value, "cfmoney");
            return (Criteria) this;
        }

        public Criteria andCfmoneyLessThan(Integer value) {
            addCriterion("cfmoney <", value, "cfmoney");
            return (Criteria) this;
        }

        public Criteria andCfmoneyLessThanOrEqualTo(Integer value) {
            addCriterion("cfmoney <=", value, "cfmoney");
            return (Criteria) this;
        }

        public Criteria andCfmoneyIn(List<Integer> values) {
            addCriterion("cfmoney in", values, "cfmoney");
            return (Criteria) this;
        }

        public Criteria andCfmoneyNotIn(List<Integer> values) {
            addCriterion("cfmoney not in", values, "cfmoney");
            return (Criteria) this;
        }

        public Criteria andCfmoneyBetween(Integer value1, Integer value2) {
            addCriterion("cfmoney between", value1, value2, "cfmoney");
            return (Criteria) this;
        }

        public Criteria andCfmoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("cfmoney not between", value1, value2, "cfmoney");
            return (Criteria) this;
        }

        public Criteria andIshgIsNull() {
            addCriterion("ishg is null");
            return (Criteria) this;
        }

        public Criteria andIshgIsNotNull() {
            addCriterion("ishg is not null");
            return (Criteria) this;
        }

        public Criteria andIshgEqualTo(String value) {
            addCriterion("ishg =", value, "ishg");
            return (Criteria) this;
        }

        public Criteria andIshgNotEqualTo(String value) {
            addCriterion("ishg <>", value, "ishg");
            return (Criteria) this;
        }

        public Criteria andIshgGreaterThan(String value) {
            addCriterion("ishg >", value, "ishg");
            return (Criteria) this;
        }

        public Criteria andIshgGreaterThanOrEqualTo(String value) {
            addCriterion("ishg >=", value, "ishg");
            return (Criteria) this;
        }

        public Criteria andIshgLessThan(String value) {
            addCriterion("ishg <", value, "ishg");
            return (Criteria) this;
        }

        public Criteria andIshgLessThanOrEqualTo(String value) {
            addCriterion("ishg <=", value, "ishg");
            return (Criteria) this;
        }

        public Criteria andIshgLike(String value) {
            addCriterion("ishg like", value, "ishg");
            return (Criteria) this;
        }

        public Criteria andIshgNotLike(String value) {
            addCriterion("ishg not like", value, "ishg");
            return (Criteria) this;
        }

        public Criteria andIshgIn(List<String> values) {
            addCriterion("ishg in", values, "ishg");
            return (Criteria) this;
        }

        public Criteria andIshgNotIn(List<String> values) {
            addCriterion("ishg not in", values, "ishg");
            return (Criteria) this;
        }

        public Criteria andIshgBetween(String value1, String value2) {
            addCriterion("ishg between", value1, value2, "ishg");
            return (Criteria) this;
        }

        public Criteria andIshgNotBetween(String value1, String value2) {
            addCriterion("ishg not between", value1, value2, "ishg");
            return (Criteria) this;
        }

        public Criteria andFgyyIsNull() {
            addCriterion("fgyy is null");
            return (Criteria) this;
        }

        public Criteria andFgyyIsNotNull() {
            addCriterion("fgyy is not null");
            return (Criteria) this;
        }

        public Criteria andFgyyEqualTo(String value) {
            addCriterion("fgyy =", value, "fgyy");
            return (Criteria) this;
        }

        public Criteria andFgyyNotEqualTo(String value) {
            addCriterion("fgyy <>", value, "fgyy");
            return (Criteria) this;
        }

        public Criteria andFgyyGreaterThan(String value) {
            addCriterion("fgyy >", value, "fgyy");
            return (Criteria) this;
        }

        public Criteria andFgyyGreaterThanOrEqualTo(String value) {
            addCriterion("fgyy >=", value, "fgyy");
            return (Criteria) this;
        }

        public Criteria andFgyyLessThan(String value) {
            addCriterion("fgyy <", value, "fgyy");
            return (Criteria) this;
        }

        public Criteria andFgyyLessThanOrEqualTo(String value) {
            addCriterion("fgyy <=", value, "fgyy");
            return (Criteria) this;
        }

        public Criteria andFgyyLike(String value) {
            addCriterion("fgyy like", value, "fgyy");
            return (Criteria) this;
        }

        public Criteria andFgyyNotLike(String value) {
            addCriterion("fgyy not like", value, "fgyy");
            return (Criteria) this;
        }

        public Criteria andFgyyIn(List<String> values) {
            addCriterion("fgyy in", values, "fgyy");
            return (Criteria) this;
        }

        public Criteria andFgyyNotIn(List<String> values) {
            addCriterion("fgyy not in", values, "fgyy");
            return (Criteria) this;
        }

        public Criteria andFgyyBetween(String value1, String value2) {
            addCriterion("fgyy between", value1, value2, "fgyy");
            return (Criteria) this;
        }

        public Criteria andFgyyNotBetween(String value1, String value2) {
            addCriterion("fgyy not between", value1, value2, "fgyy");
            return (Criteria) this;
        }

        public Criteria andBhgcfjeIsNull() {
            addCriterion("bhgcfje is null");
            return (Criteria) this;
        }

        public Criteria andBhgcfjeIsNotNull() {
            addCriterion("bhgcfje is not null");
            return (Criteria) this;
        }

        public Criteria andBhgcfjeEqualTo(String value) {
            addCriterion("bhgcfje =", value, "bhgcfje");
            return (Criteria) this;
        }

        public Criteria andBhgcfjeNotEqualTo(String value) {
            addCriterion("bhgcfje <>", value, "bhgcfje");
            return (Criteria) this;
        }

        public Criteria andBhgcfjeGreaterThan(String value) {
            addCriterion("bhgcfje >", value, "bhgcfje");
            return (Criteria) this;
        }

        public Criteria andBhgcfjeGreaterThanOrEqualTo(String value) {
            addCriterion("bhgcfje >=", value, "bhgcfje");
            return (Criteria) this;
        }

        public Criteria andBhgcfjeLessThan(String value) {
            addCriterion("bhgcfje <", value, "bhgcfje");
            return (Criteria) this;
        }

        public Criteria andBhgcfjeLessThanOrEqualTo(String value) {
            addCriterion("bhgcfje <=", value, "bhgcfje");
            return (Criteria) this;
        }

        public Criteria andBhgcfjeLike(String value) {
            addCriterion("bhgcfje like", value, "bhgcfje");
            return (Criteria) this;
        }

        public Criteria andBhgcfjeNotLike(String value) {
            addCriterion("bhgcfje not like", value, "bhgcfje");
            return (Criteria) this;
        }

        public Criteria andBhgcfjeIn(List<String> values) {
            addCriterion("bhgcfje in", values, "bhgcfje");
            return (Criteria) this;
        }

        public Criteria andBhgcfjeNotIn(List<String> values) {
            addCriterion("bhgcfje not in", values, "bhgcfje");
            return (Criteria) this;
        }

        public Criteria andBhgcfjeBetween(String value1, String value2) {
            addCriterion("bhgcfje between", value1, value2, "bhgcfje");
            return (Criteria) this;
        }

        public Criteria andBhgcfjeNotBetween(String value1, String value2) {
            addCriterion("bhgcfje not between", value1, value2, "bhgcfje");
            return (Criteria) this;
        }

        public Criteria andBhgzjrIsNull() {
            addCriterion("bhgzjr is null");
            return (Criteria) this;
        }

        public Criteria andBhgzjrIsNotNull() {
            addCriterion("bhgzjr is not null");
            return (Criteria) this;
        }

        public Criteria andBhgzjrEqualTo(String value) {
            addCriterion("bhgzjr =", value, "bhgzjr");
            return (Criteria) this;
        }

        public Criteria andBhgzjrNotEqualTo(String value) {
            addCriterion("bhgzjr <>", value, "bhgzjr");
            return (Criteria) this;
        }

        public Criteria andBhgzjrGreaterThan(String value) {
            addCriterion("bhgzjr >", value, "bhgzjr");
            return (Criteria) this;
        }

        public Criteria andBhgzjrGreaterThanOrEqualTo(String value) {
            addCriterion("bhgzjr >=", value, "bhgzjr");
            return (Criteria) this;
        }

        public Criteria andBhgzjrLessThan(String value) {
            addCriterion("bhgzjr <", value, "bhgzjr");
            return (Criteria) this;
        }

        public Criteria andBhgzjrLessThanOrEqualTo(String value) {
            addCriterion("bhgzjr <=", value, "bhgzjr");
            return (Criteria) this;
        }

        public Criteria andBhgzjrLike(String value) {
            addCriterion("bhgzjr like", value, "bhgzjr");
            return (Criteria) this;
        }

        public Criteria andBhgzjrNotLike(String value) {
            addCriterion("bhgzjr not like", value, "bhgzjr");
            return (Criteria) this;
        }

        public Criteria andBhgzjrIn(List<String> values) {
            addCriterion("bhgzjr in", values, "bhgzjr");
            return (Criteria) this;
        }

        public Criteria andBhgzjrNotIn(List<String> values) {
            addCriterion("bhgzjr not in", values, "bhgzjr");
            return (Criteria) this;
        }

        public Criteria andBhgzjrBetween(String value1, String value2) {
            addCriterion("bhgzjr between", value1, value2, "bhgzjr");
            return (Criteria) this;
        }

        public Criteria andBhgzjrNotBetween(String value1, String value2) {
            addCriterion("bhgzjr not between", value1, value2, "bhgzjr");
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