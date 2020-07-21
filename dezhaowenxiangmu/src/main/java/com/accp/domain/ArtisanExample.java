package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ArtisanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArtisanExample() {
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

        public Criteria andStarsidIsNull() {
            addCriterion("starsid is null");
            return (Criteria) this;
        }

        public Criteria andStarsidIsNotNull() {
            addCriterion("starsid is not null");
            return (Criteria) this;
        }

        public Criteria andStarsidEqualTo(Integer value) {
            addCriterion("starsid =", value, "starsid");
            return (Criteria) this;
        }

        public Criteria andStarsidNotEqualTo(Integer value) {
            addCriterion("starsid <>", value, "starsid");
            return (Criteria) this;
        }

        public Criteria andStarsidGreaterThan(Integer value) {
            addCriterion("starsid >", value, "starsid");
            return (Criteria) this;
        }

        public Criteria andStarsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("starsid >=", value, "starsid");
            return (Criteria) this;
        }

        public Criteria andStarsidLessThan(Integer value) {
            addCriterion("starsid <", value, "starsid");
            return (Criteria) this;
        }

        public Criteria andStarsidLessThanOrEqualTo(Integer value) {
            addCriterion("starsid <=", value, "starsid");
            return (Criteria) this;
        }

        public Criteria andStarsidIn(List<Integer> values) {
            addCriterion("starsid in", values, "starsid");
            return (Criteria) this;
        }

        public Criteria andStarsidNotIn(List<Integer> values) {
            addCriterion("starsid not in", values, "starsid");
            return (Criteria) this;
        }

        public Criteria andStarsidBetween(Integer value1, Integer value2) {
            addCriterion("starsid between", value1, value2, "starsid");
            return (Criteria) this;
        }

        public Criteria andStarsidNotBetween(Integer value1, Integer value2) {
            addCriterion("starsid not between", value1, value2, "starsid");
            return (Criteria) this;
        }

        public Criteria andIsgroupIsNull() {
            addCriterion("isgroup is null");
            return (Criteria) this;
        }

        public Criteria andIsgroupIsNotNull() {
            addCriterion("isgroup is not null");
            return (Criteria) this;
        }

        public Criteria andIsgroupEqualTo(Boolean value) {
            addCriterion("isgroup =", value, "isgroup");
            return (Criteria) this;
        }

        public Criteria andIsgroupNotEqualTo(Boolean value) {
            addCriterion("isgroup <>", value, "isgroup");
            return (Criteria) this;
        }

        public Criteria andIsgroupGreaterThan(Boolean value) {
            addCriterion("isgroup >", value, "isgroup");
            return (Criteria) this;
        }

        public Criteria andIsgroupGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isgroup >=", value, "isgroup");
            return (Criteria) this;
        }

        public Criteria andIsgroupLessThan(Boolean value) {
            addCriterion("isgroup <", value, "isgroup");
            return (Criteria) this;
        }

        public Criteria andIsgroupLessThanOrEqualTo(Boolean value) {
            addCriterion("isgroup <=", value, "isgroup");
            return (Criteria) this;
        }

        public Criteria andIsgroupIn(List<Boolean> values) {
            addCriterion("isgroup in", values, "isgroup");
            return (Criteria) this;
        }

        public Criteria andIsgroupNotIn(List<Boolean> values) {
            addCriterion("isgroup not in", values, "isgroup");
            return (Criteria) this;
        }

        public Criteria andIsgroupBetween(Boolean value1, Boolean value2) {
            addCriterion("isgroup between", value1, value2, "isgroup");
            return (Criteria) this;
        }

        public Criteria andIsgroupNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isgroup not between", value1, value2, "isgroup");
            return (Criteria) this;
        }

        public Criteria andAnameIsNull() {
            addCriterion("aname is null");
            return (Criteria) this;
        }

        public Criteria andAnameIsNotNull() {
            addCriterion("aname is not null");
            return (Criteria) this;
        }

        public Criteria andAnameEqualTo(String value) {
            addCriterion("aname =", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotEqualTo(String value) {
            addCriterion("aname <>", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThan(String value) {
            addCriterion("aname >", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThanOrEqualTo(String value) {
            addCriterion("aname >=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThan(String value) {
            addCriterion("aname <", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThanOrEqualTo(String value) {
            addCriterion("aname <=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLike(String value) {
            addCriterion("aname like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotLike(String value) {
            addCriterion("aname not like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameIn(List<String> values) {
            addCriterion("aname in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotIn(List<String> values) {
            addCriterion("aname not in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameBetween(String value1, String value2) {
            addCriterion("aname between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotBetween(String value1, String value2) {
            addCriterion("aname not between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andAsexIsNull() {
            addCriterion("asex is null");
            return (Criteria) this;
        }

        public Criteria andAsexIsNotNull() {
            addCriterion("asex is not null");
            return (Criteria) this;
        }

        public Criteria andAsexEqualTo(Integer value) {
            addCriterion("asex =", value, "asex");
            return (Criteria) this;
        }

        public Criteria andAsexNotEqualTo(Integer value) {
            addCriterion("asex <>", value, "asex");
            return (Criteria) this;
        }

        public Criteria andAsexGreaterThan(Integer value) {
            addCriterion("asex >", value, "asex");
            return (Criteria) this;
        }

        public Criteria andAsexGreaterThanOrEqualTo(Integer value) {
            addCriterion("asex >=", value, "asex");
            return (Criteria) this;
        }

        public Criteria andAsexLessThan(Integer value) {
            addCriterion("asex <", value, "asex");
            return (Criteria) this;
        }

        public Criteria andAsexLessThanOrEqualTo(Integer value) {
            addCriterion("asex <=", value, "asex");
            return (Criteria) this;
        }

        public Criteria andAsexIn(List<Integer> values) {
            addCriterion("asex in", values, "asex");
            return (Criteria) this;
        }

        public Criteria andAsexNotIn(List<Integer> values) {
            addCriterion("asex not in", values, "asex");
            return (Criteria) this;
        }

        public Criteria andAsexBetween(Integer value1, Integer value2) {
            addCriterion("asex between", value1, value2, "asex");
            return (Criteria) this;
        }

        public Criteria andAsexNotBetween(Integer value1, Integer value2) {
            addCriterion("asex not between", value1, value2, "asex");
            return (Criteria) this;
        }

        public Criteria andAphoneIsNull() {
            addCriterion("aphone is null");
            return (Criteria) this;
        }

        public Criteria andAphoneIsNotNull() {
            addCriterion("aphone is not null");
            return (Criteria) this;
        }

        public Criteria andAphoneEqualTo(String value) {
            addCriterion("aphone =", value, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneNotEqualTo(String value) {
            addCriterion("aphone <>", value, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneGreaterThan(String value) {
            addCriterion("aphone >", value, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneGreaterThanOrEqualTo(String value) {
            addCriterion("aphone >=", value, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneLessThan(String value) {
            addCriterion("aphone <", value, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneLessThanOrEqualTo(String value) {
            addCriterion("aphone <=", value, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneLike(String value) {
            addCriterion("aphone like", value, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneNotLike(String value) {
            addCriterion("aphone not like", value, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneIn(List<String> values) {
            addCriterion("aphone in", values, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneNotIn(List<String> values) {
            addCriterion("aphone not in", values, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneBetween(String value1, String value2) {
            addCriterion("aphone between", value1, value2, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneNotBetween(String value1, String value2) {
            addCriterion("aphone not between", value1, value2, "aphone");
            return (Criteria) this;
        }

        public Criteria andLoginaidIsNull() {
            addCriterion("loginaid is null");
            return (Criteria) this;
        }

        public Criteria andLoginaidIsNotNull() {
            addCriterion("loginaid is not null");
            return (Criteria) this;
        }

        public Criteria andLoginaidEqualTo(String value) {
            addCriterion("loginaid =", value, "loginaid");
            return (Criteria) this;
        }

        public Criteria andLoginaidNotEqualTo(String value) {
            addCriterion("loginaid <>", value, "loginaid");
            return (Criteria) this;
        }

        public Criteria andLoginaidGreaterThan(String value) {
            addCriterion("loginaid >", value, "loginaid");
            return (Criteria) this;
        }

        public Criteria andLoginaidGreaterThanOrEqualTo(String value) {
            addCriterion("loginaid >=", value, "loginaid");
            return (Criteria) this;
        }

        public Criteria andLoginaidLessThan(String value) {
            addCriterion("loginaid <", value, "loginaid");
            return (Criteria) this;
        }

        public Criteria andLoginaidLessThanOrEqualTo(String value) {
            addCriterion("loginaid <=", value, "loginaid");
            return (Criteria) this;
        }

        public Criteria andLoginaidLike(String value) {
            addCriterion("loginaid like", value, "loginaid");
            return (Criteria) this;
        }

        public Criteria andLoginaidNotLike(String value) {
            addCriterion("loginaid not like", value, "loginaid");
            return (Criteria) this;
        }

        public Criteria andLoginaidIn(List<String> values) {
            addCriterion("loginaid in", values, "loginaid");
            return (Criteria) this;
        }

        public Criteria andLoginaidNotIn(List<String> values) {
            addCriterion("loginaid not in", values, "loginaid");
            return (Criteria) this;
        }

        public Criteria andLoginaidBetween(String value1, String value2) {
            addCriterion("loginaid between", value1, value2, "loginaid");
            return (Criteria) this;
        }

        public Criteria andLoginaidNotBetween(String value1, String value2) {
            addCriterion("loginaid not between", value1, value2, "loginaid");
            return (Criteria) this;
        }

        public Criteria andLoginapawIsNull() {
            addCriterion("loginapaw is null");
            return (Criteria) this;
        }

        public Criteria andLoginapawIsNotNull() {
            addCriterion("loginapaw is not null");
            return (Criteria) this;
        }

        public Criteria andLoginapawEqualTo(String value) {
            addCriterion("loginapaw =", value, "loginapaw");
            return (Criteria) this;
        }

        public Criteria andLoginapawNotEqualTo(String value) {
            addCriterion("loginapaw <>", value, "loginapaw");
            return (Criteria) this;
        }

        public Criteria andLoginapawGreaterThan(String value) {
            addCriterion("loginapaw >", value, "loginapaw");
            return (Criteria) this;
        }

        public Criteria andLoginapawGreaterThanOrEqualTo(String value) {
            addCriterion("loginapaw >=", value, "loginapaw");
            return (Criteria) this;
        }

        public Criteria andLoginapawLessThan(String value) {
            addCriterion("loginapaw <", value, "loginapaw");
            return (Criteria) this;
        }

        public Criteria andLoginapawLessThanOrEqualTo(String value) {
            addCriterion("loginapaw <=", value, "loginapaw");
            return (Criteria) this;
        }

        public Criteria andLoginapawLike(String value) {
            addCriterion("loginapaw like", value, "loginapaw");
            return (Criteria) this;
        }

        public Criteria andLoginapawNotLike(String value) {
            addCriterion("loginapaw not like", value, "loginapaw");
            return (Criteria) this;
        }

        public Criteria andLoginapawIn(List<String> values) {
            addCriterion("loginapaw in", values, "loginapaw");
            return (Criteria) this;
        }

        public Criteria andLoginapawNotIn(List<String> values) {
            addCriterion("loginapaw not in", values, "loginapaw");
            return (Criteria) this;
        }

        public Criteria andLoginapawBetween(String value1, String value2) {
            addCriterion("loginapaw between", value1, value2, "loginapaw");
            return (Criteria) this;
        }

        public Criteria andLoginapawNotBetween(String value1, String value2) {
            addCriterion("loginapaw not between", value1, value2, "loginapaw");
            return (Criteria) this;
        }

        public Criteria andIdcaidIsNull() {
            addCriterion("idcaid is null");
            return (Criteria) this;
        }

        public Criteria andIdcaidIsNotNull() {
            addCriterion("idcaid is not null");
            return (Criteria) this;
        }

        public Criteria andIdcaidEqualTo(String value) {
            addCriterion("idcaid =", value, "idcaid");
            return (Criteria) this;
        }

        public Criteria andIdcaidNotEqualTo(String value) {
            addCriterion("idcaid <>", value, "idcaid");
            return (Criteria) this;
        }

        public Criteria andIdcaidGreaterThan(String value) {
            addCriterion("idcaid >", value, "idcaid");
            return (Criteria) this;
        }

        public Criteria andIdcaidGreaterThanOrEqualTo(String value) {
            addCriterion("idcaid >=", value, "idcaid");
            return (Criteria) this;
        }

        public Criteria andIdcaidLessThan(String value) {
            addCriterion("idcaid <", value, "idcaid");
            return (Criteria) this;
        }

        public Criteria andIdcaidLessThanOrEqualTo(String value) {
            addCriterion("idcaid <=", value, "idcaid");
            return (Criteria) this;
        }

        public Criteria andIdcaidLike(String value) {
            addCriterion("idcaid like", value, "idcaid");
            return (Criteria) this;
        }

        public Criteria andIdcaidNotLike(String value) {
            addCriterion("idcaid not like", value, "idcaid");
            return (Criteria) this;
        }

        public Criteria andIdcaidIn(List<String> values) {
            addCriterion("idcaid in", values, "idcaid");
            return (Criteria) this;
        }

        public Criteria andIdcaidNotIn(List<String> values) {
            addCriterion("idcaid not in", values, "idcaid");
            return (Criteria) this;
        }

        public Criteria andIdcaidBetween(String value1, String value2) {
            addCriterion("idcaid between", value1, value2, "idcaid");
            return (Criteria) this;
        }

        public Criteria andIdcaidNotBetween(String value1, String value2) {
            addCriterion("idcaid not between", value1, value2, "idcaid");
            return (Criteria) this;
        }

        public Criteria andAraddressIsNull() {
            addCriterion("araddress is null");
            return (Criteria) this;
        }

        public Criteria andAraddressIsNotNull() {
            addCriterion("araddress is not null");
            return (Criteria) this;
        }

        public Criteria andAraddressEqualTo(String value) {
            addCriterion("araddress =", value, "araddress");
            return (Criteria) this;
        }

        public Criteria andAraddressNotEqualTo(String value) {
            addCriterion("araddress <>", value, "araddress");
            return (Criteria) this;
        }

        public Criteria andAraddressGreaterThan(String value) {
            addCriterion("araddress >", value, "araddress");
            return (Criteria) this;
        }

        public Criteria andAraddressGreaterThanOrEqualTo(String value) {
            addCriterion("araddress >=", value, "araddress");
            return (Criteria) this;
        }

        public Criteria andAraddressLessThan(String value) {
            addCriterion("araddress <", value, "araddress");
            return (Criteria) this;
        }

        public Criteria andAraddressLessThanOrEqualTo(String value) {
            addCriterion("araddress <=", value, "araddress");
            return (Criteria) this;
        }

        public Criteria andAraddressLike(String value) {
            addCriterion("araddress like", value, "araddress");
            return (Criteria) this;
        }

        public Criteria andAraddressNotLike(String value) {
            addCriterion("araddress not like", value, "araddress");
            return (Criteria) this;
        }

        public Criteria andAraddressIn(List<String> values) {
            addCriterion("araddress in", values, "araddress");
            return (Criteria) this;
        }

        public Criteria andAraddressNotIn(List<String> values) {
            addCriterion("araddress not in", values, "araddress");
            return (Criteria) this;
        }

        public Criteria andAraddressBetween(String value1, String value2) {
            addCriterion("araddress between", value1, value2, "araddress");
            return (Criteria) this;
        }

        public Criteria andAraddressNotBetween(String value1, String value2) {
            addCriterion("araddress not between", value1, value2, "araddress");
            return (Criteria) this;
        }

        public Criteria andCraftIsNull() {
            addCriterion("craft is null");
            return (Criteria) this;
        }

        public Criteria andCraftIsNotNull() {
            addCriterion("craft is not null");
            return (Criteria) this;
        }

        public Criteria andCraftEqualTo(String value) {
            addCriterion("craft =", value, "craft");
            return (Criteria) this;
        }

        public Criteria andCraftNotEqualTo(String value) {
            addCriterion("craft <>", value, "craft");
            return (Criteria) this;
        }

        public Criteria andCraftGreaterThan(String value) {
            addCriterion("craft >", value, "craft");
            return (Criteria) this;
        }

        public Criteria andCraftGreaterThanOrEqualTo(String value) {
            addCriterion("craft >=", value, "craft");
            return (Criteria) this;
        }

        public Criteria andCraftLessThan(String value) {
            addCriterion("craft <", value, "craft");
            return (Criteria) this;
        }

        public Criteria andCraftLessThanOrEqualTo(String value) {
            addCriterion("craft <=", value, "craft");
            return (Criteria) this;
        }

        public Criteria andCraftLike(String value) {
            addCriterion("craft like", value, "craft");
            return (Criteria) this;
        }

        public Criteria andCraftNotLike(String value) {
            addCriterion("craft not like", value, "craft");
            return (Criteria) this;
        }

        public Criteria andCraftIn(List<String> values) {
            addCriterion("craft in", values, "craft");
            return (Criteria) this;
        }

        public Criteria andCraftNotIn(List<String> values) {
            addCriterion("craft not in", values, "craft");
            return (Criteria) this;
        }

        public Criteria andCraftBetween(String value1, String value2) {
            addCriterion("craft between", value1, value2, "craft");
            return (Criteria) this;
        }

        public Criteria andCraftNotBetween(String value1, String value2) {
            addCriterion("craft not between", value1, value2, "craft");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandIsNull() {
            addCriterion("maintainBrand is null");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandIsNotNull() {
            addCriterion("maintainBrand is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandEqualTo(String value) {
            addCriterion("maintainBrand =", value, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandNotEqualTo(String value) {
            addCriterion("maintainBrand <>", value, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandGreaterThan(String value) {
            addCriterion("maintainBrand >", value, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandGreaterThanOrEqualTo(String value) {
            addCriterion("maintainBrand >=", value, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandLessThan(String value) {
            addCriterion("maintainBrand <", value, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandLessThanOrEqualTo(String value) {
            addCriterion("maintainBrand <=", value, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandLike(String value) {
            addCriterion("maintainBrand like", value, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandNotLike(String value) {
            addCriterion("maintainBrand not like", value, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandIn(List<String> values) {
            addCriterion("maintainBrand in", values, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandNotIn(List<String> values) {
            addCriterion("maintainBrand not in", values, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandBetween(String value1, String value2) {
            addCriterion("maintainBrand between", value1, value2, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandNotBetween(String value1, String value2) {
            addCriterion("maintainBrand not between", value1, value2, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andWechatIsNull() {
            addCriterion("wechat is null");
            return (Criteria) this;
        }

        public Criteria andWechatIsNotNull() {
            addCriterion("wechat is not null");
            return (Criteria) this;
        }

        public Criteria andWechatEqualTo(String value) {
            addCriterion("wechat =", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotEqualTo(String value) {
            addCriterion("wechat <>", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThan(String value) {
            addCriterion("wechat >", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThanOrEqualTo(String value) {
            addCriterion("wechat >=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThan(String value) {
            addCriterion("wechat <", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThanOrEqualTo(String value) {
            addCriterion("wechat <=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLike(String value) {
            addCriterion("wechat like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotLike(String value) {
            addCriterion("wechat not like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatIn(List<String> values) {
            addCriterion("wechat in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotIn(List<String> values) {
            addCriterion("wechat not in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatBetween(String value1, String value2) {
            addCriterion("wechat between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotBetween(String value1, String value2) {
            addCriterion("wechat not between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andHkaddressIsNull() {
            addCriterion("hkaddress is null");
            return (Criteria) this;
        }

        public Criteria andHkaddressIsNotNull() {
            addCriterion("hkaddress is not null");
            return (Criteria) this;
        }

        public Criteria andHkaddressEqualTo(String value) {
            addCriterion("hkaddress =", value, "hkaddress");
            return (Criteria) this;
        }

        public Criteria andHkaddressNotEqualTo(String value) {
            addCriterion("hkaddress <>", value, "hkaddress");
            return (Criteria) this;
        }

        public Criteria andHkaddressGreaterThan(String value) {
            addCriterion("hkaddress >", value, "hkaddress");
            return (Criteria) this;
        }

        public Criteria andHkaddressGreaterThanOrEqualTo(String value) {
            addCriterion("hkaddress >=", value, "hkaddress");
            return (Criteria) this;
        }

        public Criteria andHkaddressLessThan(String value) {
            addCriterion("hkaddress <", value, "hkaddress");
            return (Criteria) this;
        }

        public Criteria andHkaddressLessThanOrEqualTo(String value) {
            addCriterion("hkaddress <=", value, "hkaddress");
            return (Criteria) this;
        }

        public Criteria andHkaddressLike(String value) {
            addCriterion("hkaddress like", value, "hkaddress");
            return (Criteria) this;
        }

        public Criteria andHkaddressNotLike(String value) {
            addCriterion("hkaddress not like", value, "hkaddress");
            return (Criteria) this;
        }

        public Criteria andHkaddressIn(List<String> values) {
            addCriterion("hkaddress in", values, "hkaddress");
            return (Criteria) this;
        }

        public Criteria andHkaddressNotIn(List<String> values) {
            addCriterion("hkaddress not in", values, "hkaddress");
            return (Criteria) this;
        }

        public Criteria andHkaddressBetween(String value1, String value2) {
            addCriterion("hkaddress between", value1, value2, "hkaddress");
            return (Criteria) this;
        }

        public Criteria andHkaddressNotBetween(String value1, String value2) {
            addCriterion("hkaddress not between", value1, value2, "hkaddress");
            return (Criteria) this;
        }

        public Criteria andKhbankIsNull() {
            addCriterion("khbank is null");
            return (Criteria) this;
        }

        public Criteria andKhbankIsNotNull() {
            addCriterion("khbank is not null");
            return (Criteria) this;
        }

        public Criteria andKhbankEqualTo(String value) {
            addCriterion("khbank =", value, "khbank");
            return (Criteria) this;
        }

        public Criteria andKhbankNotEqualTo(String value) {
            addCriterion("khbank <>", value, "khbank");
            return (Criteria) this;
        }

        public Criteria andKhbankGreaterThan(String value) {
            addCriterion("khbank >", value, "khbank");
            return (Criteria) this;
        }

        public Criteria andKhbankGreaterThanOrEqualTo(String value) {
            addCriterion("khbank >=", value, "khbank");
            return (Criteria) this;
        }

        public Criteria andKhbankLessThan(String value) {
            addCriterion("khbank <", value, "khbank");
            return (Criteria) this;
        }

        public Criteria andKhbankLessThanOrEqualTo(String value) {
            addCriterion("khbank <=", value, "khbank");
            return (Criteria) this;
        }

        public Criteria andKhbankLike(String value) {
            addCriterion("khbank like", value, "khbank");
            return (Criteria) this;
        }

        public Criteria andKhbankNotLike(String value) {
            addCriterion("khbank not like", value, "khbank");
            return (Criteria) this;
        }

        public Criteria andKhbankIn(List<String> values) {
            addCriterion("khbank in", values, "khbank");
            return (Criteria) this;
        }

        public Criteria andKhbankNotIn(List<String> values) {
            addCriterion("khbank not in", values, "khbank");
            return (Criteria) this;
        }

        public Criteria andKhbankBetween(String value1, String value2) {
            addCriterion("khbank between", value1, value2, "khbank");
            return (Criteria) this;
        }

        public Criteria andKhbankNotBetween(String value1, String value2) {
            addCriterion("khbank not between", value1, value2, "khbank");
            return (Criteria) this;
        }

        public Criteria andBankidIsNull() {
            addCriterion("bankid is null");
            return (Criteria) this;
        }

        public Criteria andBankidIsNotNull() {
            addCriterion("bankid is not null");
            return (Criteria) this;
        }

        public Criteria andBankidEqualTo(String value) {
            addCriterion("bankid =", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotEqualTo(String value) {
            addCriterion("bankid <>", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThan(String value) {
            addCriterion("bankid >", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThanOrEqualTo(String value) {
            addCriterion("bankid >=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThan(String value) {
            addCriterion("bankid <", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThanOrEqualTo(String value) {
            addCriterion("bankid <=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLike(String value) {
            addCriterion("bankid like", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotLike(String value) {
            addCriterion("bankid not like", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidIn(List<String> values) {
            addCriterion("bankid in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotIn(List<String> values) {
            addCriterion("bankid not in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidBetween(String value1, String value2) {
            addCriterion("bankid between", value1, value2, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotBetween(String value1, String value2) {
            addCriterion("bankid not between", value1, value2, "bankid");
            return (Criteria) this;
        }

        public Criteria andRepairgonzhonIsNull() {
            addCriterion("repairgonzhon is null");
            return (Criteria) this;
        }

        public Criteria andRepairgonzhonIsNotNull() {
            addCriterion("repairgonzhon is not null");
            return (Criteria) this;
        }

        public Criteria andRepairgonzhonEqualTo(String value) {
            addCriterion("repairgonzhon =", value, "repairgonzhon");
            return (Criteria) this;
        }

        public Criteria andRepairgonzhonNotEqualTo(String value) {
            addCriterion("repairgonzhon <>", value, "repairgonzhon");
            return (Criteria) this;
        }

        public Criteria andRepairgonzhonGreaterThan(String value) {
            addCriterion("repairgonzhon >", value, "repairgonzhon");
            return (Criteria) this;
        }

        public Criteria andRepairgonzhonGreaterThanOrEqualTo(String value) {
            addCriterion("repairgonzhon >=", value, "repairgonzhon");
            return (Criteria) this;
        }

        public Criteria andRepairgonzhonLessThan(String value) {
            addCriterion("repairgonzhon <", value, "repairgonzhon");
            return (Criteria) this;
        }

        public Criteria andRepairgonzhonLessThanOrEqualTo(String value) {
            addCriterion("repairgonzhon <=", value, "repairgonzhon");
            return (Criteria) this;
        }

        public Criteria andRepairgonzhonLike(String value) {
            addCriterion("repairgonzhon like", value, "repairgonzhon");
            return (Criteria) this;
        }

        public Criteria andRepairgonzhonNotLike(String value) {
            addCriterion("repairgonzhon not like", value, "repairgonzhon");
            return (Criteria) this;
        }

        public Criteria andRepairgonzhonIn(List<String> values) {
            addCriterion("repairgonzhon in", values, "repairgonzhon");
            return (Criteria) this;
        }

        public Criteria andRepairgonzhonNotIn(List<String> values) {
            addCriterion("repairgonzhon not in", values, "repairgonzhon");
            return (Criteria) this;
        }

        public Criteria andRepairgonzhonBetween(String value1, String value2) {
            addCriterion("repairgonzhon between", value1, value2, "repairgonzhon");
            return (Criteria) this;
        }

        public Criteria andRepairgonzhonNotBetween(String value1, String value2) {
            addCriterion("repairgonzhon not between", value1, value2, "repairgonzhon");
            return (Criteria) this;
        }

        public Criteria andRepairbrandIsNull() {
            addCriterion("repairbrand is null");
            return (Criteria) this;
        }

        public Criteria andRepairbrandIsNotNull() {
            addCriterion("repairbrand is not null");
            return (Criteria) this;
        }

        public Criteria andRepairbrandEqualTo(String value) {
            addCriterion("repairbrand =", value, "repairbrand");
            return (Criteria) this;
        }

        public Criteria andRepairbrandNotEqualTo(String value) {
            addCriterion("repairbrand <>", value, "repairbrand");
            return (Criteria) this;
        }

        public Criteria andRepairbrandGreaterThan(String value) {
            addCriterion("repairbrand >", value, "repairbrand");
            return (Criteria) this;
        }

        public Criteria andRepairbrandGreaterThanOrEqualTo(String value) {
            addCriterion("repairbrand >=", value, "repairbrand");
            return (Criteria) this;
        }

        public Criteria andRepairbrandLessThan(String value) {
            addCriterion("repairbrand <", value, "repairbrand");
            return (Criteria) this;
        }

        public Criteria andRepairbrandLessThanOrEqualTo(String value) {
            addCriterion("repairbrand <=", value, "repairbrand");
            return (Criteria) this;
        }

        public Criteria andRepairbrandLike(String value) {
            addCriterion("repairbrand like", value, "repairbrand");
            return (Criteria) this;
        }

        public Criteria andRepairbrandNotLike(String value) {
            addCriterion("repairbrand not like", value, "repairbrand");
            return (Criteria) this;
        }

        public Criteria andRepairbrandIn(List<String> values) {
            addCriterion("repairbrand in", values, "repairbrand");
            return (Criteria) this;
        }

        public Criteria andRepairbrandNotIn(List<String> values) {
            addCriterion("repairbrand not in", values, "repairbrand");
            return (Criteria) this;
        }

        public Criteria andRepairbrandBetween(String value1, String value2) {
            addCriterion("repairbrand between", value1, value2, "repairbrand");
            return (Criteria) this;
        }

        public Criteria andRepairbrandNotBetween(String value1, String value2) {
            addCriterion("repairbrand not between", value1, value2, "repairbrand");
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