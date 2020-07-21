package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class FirmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FirmExample() {
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

        public Criteria andFirmnoIsNull() {
            addCriterion("firmno is null");
            return (Criteria) this;
        }

        public Criteria andFirmnoIsNotNull() {
            addCriterion("firmno is not null");
            return (Criteria) this;
        }

        public Criteria andFirmnoEqualTo(String value) {
            addCriterion("firmno =", value, "firmno");
            return (Criteria) this;
        }

        public Criteria andFirmnoNotEqualTo(String value) {
            addCriterion("firmno <>", value, "firmno");
            return (Criteria) this;
        }

        public Criteria andFirmnoGreaterThan(String value) {
            addCriterion("firmno >", value, "firmno");
            return (Criteria) this;
        }

        public Criteria andFirmnoGreaterThanOrEqualTo(String value) {
            addCriterion("firmno >=", value, "firmno");
            return (Criteria) this;
        }

        public Criteria andFirmnoLessThan(String value) {
            addCriterion("firmno <", value, "firmno");
            return (Criteria) this;
        }

        public Criteria andFirmnoLessThanOrEqualTo(String value) {
            addCriterion("firmno <=", value, "firmno");
            return (Criteria) this;
        }

        public Criteria andFirmnoLike(String value) {
            addCriterion("firmno like", value, "firmno");
            return (Criteria) this;
        }

        public Criteria andFirmnoNotLike(String value) {
            addCriterion("firmno not like", value, "firmno");
            return (Criteria) this;
        }

        public Criteria andFirmnoIn(List<String> values) {
            addCriterion("firmno in", values, "firmno");
            return (Criteria) this;
        }

        public Criteria andFirmnoNotIn(List<String> values) {
            addCriterion("firmno not in", values, "firmno");
            return (Criteria) this;
        }

        public Criteria andFirmnoBetween(String value1, String value2) {
            addCriterion("firmno between", value1, value2, "firmno");
            return (Criteria) this;
        }

        public Criteria andFirmnoNotBetween(String value1, String value2) {
            addCriterion("firmno not between", value1, value2, "firmno");
            return (Criteria) this;
        }

        public Criteria andCityidIsNull() {
            addCriterion("cityid is null");
            return (Criteria) this;
        }

        public Criteria andCityidIsNotNull() {
            addCriterion("cityid is not null");
            return (Criteria) this;
        }

        public Criteria andCityidEqualTo(Integer value) {
            addCriterion("cityid =", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotEqualTo(Integer value) {
            addCriterion("cityid <>", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThan(Integer value) {
            addCriterion("cityid >", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cityid >=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThan(Integer value) {
            addCriterion("cityid <", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThanOrEqualTo(Integer value) {
            addCriterion("cityid <=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidIn(List<Integer> values) {
            addCriterion("cityid in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotIn(List<Integer> values) {
            addCriterion("cityid not in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidBetween(Integer value1, Integer value2) {
            addCriterion("cityid between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotBetween(Integer value1, Integer value2) {
            addCriterion("cityid not between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andFirmnameIsNull() {
            addCriterion("firmname is null");
            return (Criteria) this;
        }

        public Criteria andFirmnameIsNotNull() {
            addCriterion("firmname is not null");
            return (Criteria) this;
        }

        public Criteria andFirmnameEqualTo(String value) {
            addCriterion("firmname =", value, "firmname");
            return (Criteria) this;
        }

        public Criteria andFirmnameNotEqualTo(String value) {
            addCriterion("firmname <>", value, "firmname");
            return (Criteria) this;
        }

        public Criteria andFirmnameGreaterThan(String value) {
            addCriterion("firmname >", value, "firmname");
            return (Criteria) this;
        }

        public Criteria andFirmnameGreaterThanOrEqualTo(String value) {
            addCriterion("firmname >=", value, "firmname");
            return (Criteria) this;
        }

        public Criteria andFirmnameLessThan(String value) {
            addCriterion("firmname <", value, "firmname");
            return (Criteria) this;
        }

        public Criteria andFirmnameLessThanOrEqualTo(String value) {
            addCriterion("firmname <=", value, "firmname");
            return (Criteria) this;
        }

        public Criteria andFirmnameLike(String value) {
            addCriterion("firmname like", value, "firmname");
            return (Criteria) this;
        }

        public Criteria andFirmnameNotLike(String value) {
            addCriterion("firmname not like", value, "firmname");
            return (Criteria) this;
        }

        public Criteria andFirmnameIn(List<String> values) {
            addCriterion("firmname in", values, "firmname");
            return (Criteria) this;
        }

        public Criteria andFirmnameNotIn(List<String> values) {
            addCriterion("firmname not in", values, "firmname");
            return (Criteria) this;
        }

        public Criteria andFirmnameBetween(String value1, String value2) {
            addCriterion("firmname between", value1, value2, "firmname");
            return (Criteria) this;
        }

        public Criteria andFirmnameNotBetween(String value1, String value2) {
            addCriterion("firmname not between", value1, value2, "firmname");
            return (Criteria) this;
        }

        public Criteria andFirmaddressIsNull() {
            addCriterion("firmaddress is null");
            return (Criteria) this;
        }

        public Criteria andFirmaddressIsNotNull() {
            addCriterion("firmaddress is not null");
            return (Criteria) this;
        }

        public Criteria andFirmaddressEqualTo(String value) {
            addCriterion("firmaddress =", value, "firmaddress");
            return (Criteria) this;
        }

        public Criteria andFirmaddressNotEqualTo(String value) {
            addCriterion("firmaddress <>", value, "firmaddress");
            return (Criteria) this;
        }

        public Criteria andFirmaddressGreaterThan(String value) {
            addCriterion("firmaddress >", value, "firmaddress");
            return (Criteria) this;
        }

        public Criteria andFirmaddressGreaterThanOrEqualTo(String value) {
            addCriterion("firmaddress >=", value, "firmaddress");
            return (Criteria) this;
        }

        public Criteria andFirmaddressLessThan(String value) {
            addCriterion("firmaddress <", value, "firmaddress");
            return (Criteria) this;
        }

        public Criteria andFirmaddressLessThanOrEqualTo(String value) {
            addCriterion("firmaddress <=", value, "firmaddress");
            return (Criteria) this;
        }

        public Criteria andFirmaddressLike(String value) {
            addCriterion("firmaddress like", value, "firmaddress");
            return (Criteria) this;
        }

        public Criteria andFirmaddressNotLike(String value) {
            addCriterion("firmaddress not like", value, "firmaddress");
            return (Criteria) this;
        }

        public Criteria andFirmaddressIn(List<String> values) {
            addCriterion("firmaddress in", values, "firmaddress");
            return (Criteria) this;
        }

        public Criteria andFirmaddressNotIn(List<String> values) {
            addCriterion("firmaddress not in", values, "firmaddress");
            return (Criteria) this;
        }

        public Criteria andFirmaddressBetween(String value1, String value2) {
            addCriterion("firmaddress between", value1, value2, "firmaddress");
            return (Criteria) this;
        }

        public Criteria andFirmaddressNotBetween(String value1, String value2) {
            addCriterion("firmaddress not between", value1, value2, "firmaddress");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andGsphoneIsNull() {
            addCriterion("gsphone is null");
            return (Criteria) this;
        }

        public Criteria andGsphoneIsNotNull() {
            addCriterion("gsphone is not null");
            return (Criteria) this;
        }

        public Criteria andGsphoneEqualTo(String value) {
            addCriterion("gsphone =", value, "gsphone");
            return (Criteria) this;
        }

        public Criteria andGsphoneNotEqualTo(String value) {
            addCriterion("gsphone <>", value, "gsphone");
            return (Criteria) this;
        }

        public Criteria andGsphoneGreaterThan(String value) {
            addCriterion("gsphone >", value, "gsphone");
            return (Criteria) this;
        }

        public Criteria andGsphoneGreaterThanOrEqualTo(String value) {
            addCriterion("gsphone >=", value, "gsphone");
            return (Criteria) this;
        }

        public Criteria andGsphoneLessThan(String value) {
            addCriterion("gsphone <", value, "gsphone");
            return (Criteria) this;
        }

        public Criteria andGsphoneLessThanOrEqualTo(String value) {
            addCriterion("gsphone <=", value, "gsphone");
            return (Criteria) this;
        }

        public Criteria andGsphoneLike(String value) {
            addCriterion("gsphone like", value, "gsphone");
            return (Criteria) this;
        }

        public Criteria andGsphoneNotLike(String value) {
            addCriterion("gsphone not like", value, "gsphone");
            return (Criteria) this;
        }

        public Criteria andGsphoneIn(List<String> values) {
            addCriterion("gsphone in", values, "gsphone");
            return (Criteria) this;
        }

        public Criteria andGsphoneNotIn(List<String> values) {
            addCriterion("gsphone not in", values, "gsphone");
            return (Criteria) this;
        }

        public Criteria andGsphoneBetween(String value1, String value2) {
            addCriterion("gsphone between", value1, value2, "gsphone");
            return (Criteria) this;
        }

        public Criteria andGsphoneNotBetween(String value1, String value2) {
            addCriterion("gsphone not between", value1, value2, "gsphone");
            return (Criteria) this;
        }

        public Criteria andLxrIsNull() {
            addCriterion("lxr is null");
            return (Criteria) this;
        }

        public Criteria andLxrIsNotNull() {
            addCriterion("lxr is not null");
            return (Criteria) this;
        }

        public Criteria andLxrEqualTo(String value) {
            addCriterion("lxr =", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrNotEqualTo(String value) {
            addCriterion("lxr <>", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrGreaterThan(String value) {
            addCriterion("lxr >", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrGreaterThanOrEqualTo(String value) {
            addCriterion("lxr >=", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrLessThan(String value) {
            addCriterion("lxr <", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrLessThanOrEqualTo(String value) {
            addCriterion("lxr <=", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrLike(String value) {
            addCriterion("lxr like", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrNotLike(String value) {
            addCriterion("lxr not like", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrIn(List<String> values) {
            addCriterion("lxr in", values, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrNotIn(List<String> values) {
            addCriterion("lxr not in", values, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrBetween(String value1, String value2) {
            addCriterion("lxr between", value1, value2, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrNotBetween(String value1, String value2) {
            addCriterion("lxr not between", value1, value2, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrphoneIsNull() {
            addCriterion("lxrphone is null");
            return (Criteria) this;
        }

        public Criteria andLxrphoneIsNotNull() {
            addCriterion("lxrphone is not null");
            return (Criteria) this;
        }

        public Criteria andLxrphoneEqualTo(String value) {
            addCriterion("lxrphone =", value, "lxrphone");
            return (Criteria) this;
        }

        public Criteria andLxrphoneNotEqualTo(String value) {
            addCriterion("lxrphone <>", value, "lxrphone");
            return (Criteria) this;
        }

        public Criteria andLxrphoneGreaterThan(String value) {
            addCriterion("lxrphone >", value, "lxrphone");
            return (Criteria) this;
        }

        public Criteria andLxrphoneGreaterThanOrEqualTo(String value) {
            addCriterion("lxrphone >=", value, "lxrphone");
            return (Criteria) this;
        }

        public Criteria andLxrphoneLessThan(String value) {
            addCriterion("lxrphone <", value, "lxrphone");
            return (Criteria) this;
        }

        public Criteria andLxrphoneLessThanOrEqualTo(String value) {
            addCriterion("lxrphone <=", value, "lxrphone");
            return (Criteria) this;
        }

        public Criteria andLxrphoneLike(String value) {
            addCriterion("lxrphone like", value, "lxrphone");
            return (Criteria) this;
        }

        public Criteria andLxrphoneNotLike(String value) {
            addCriterion("lxrphone not like", value, "lxrphone");
            return (Criteria) this;
        }

        public Criteria andLxrphoneIn(List<String> values) {
            addCriterion("lxrphone in", values, "lxrphone");
            return (Criteria) this;
        }

        public Criteria andLxrphoneNotIn(List<String> values) {
            addCriterion("lxrphone not in", values, "lxrphone");
            return (Criteria) this;
        }

        public Criteria andLxrphoneBetween(String value1, String value2) {
            addCriterion("lxrphone between", value1, value2, "lxrphone");
            return (Criteria) this;
        }

        public Criteria andLxrphoneNotBetween(String value1, String value2) {
            addCriterion("lxrphone not between", value1, value2, "lxrphone");
            return (Criteria) this;
        }

        public Criteria andScityIsNull() {
            addCriterion("scity is null");
            return (Criteria) this;
        }

        public Criteria andScityIsNotNull() {
            addCriterion("scity is not null");
            return (Criteria) this;
        }

        public Criteria andScityEqualTo(String value) {
            addCriterion("scity =", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityNotEqualTo(String value) {
            addCriterion("scity <>", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityGreaterThan(String value) {
            addCriterion("scity >", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityGreaterThanOrEqualTo(String value) {
            addCriterion("scity >=", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityLessThan(String value) {
            addCriterion("scity <", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityLessThanOrEqualTo(String value) {
            addCriterion("scity <=", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityLike(String value) {
            addCriterion("scity like", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityNotLike(String value) {
            addCriterion("scity not like", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityIn(List<String> values) {
            addCriterion("scity in", values, "scity");
            return (Criteria) this;
        }

        public Criteria andScityNotIn(List<String> values) {
            addCriterion("scity not in", values, "scity");
            return (Criteria) this;
        }

        public Criteria andScityBetween(String value1, String value2) {
            addCriterion("scity between", value1, value2, "scity");
            return (Criteria) this;
        }

        public Criteria andScityNotBetween(String value1, String value2) {
            addCriterion("scity not between", value1, value2, "scity");
            return (Criteria) this;
        }

        public Criteria andFirmsevenstIsNull() {
            addCriterion("firmsevenst is null");
            return (Criteria) this;
        }

        public Criteria andFirmsevenstIsNotNull() {
            addCriterion("firmsevenst is not null");
            return (Criteria) this;
        }

        public Criteria andFirmsevenstEqualTo(String value) {
            addCriterion("firmsevenst =", value, "firmsevenst");
            return (Criteria) this;
        }

        public Criteria andFirmsevenstNotEqualTo(String value) {
            addCriterion("firmsevenst <>", value, "firmsevenst");
            return (Criteria) this;
        }

        public Criteria andFirmsevenstGreaterThan(String value) {
            addCriterion("firmsevenst >", value, "firmsevenst");
            return (Criteria) this;
        }

        public Criteria andFirmsevenstGreaterThanOrEqualTo(String value) {
            addCriterion("firmsevenst >=", value, "firmsevenst");
            return (Criteria) this;
        }

        public Criteria andFirmsevenstLessThan(String value) {
            addCriterion("firmsevenst <", value, "firmsevenst");
            return (Criteria) this;
        }

        public Criteria andFirmsevenstLessThanOrEqualTo(String value) {
            addCriterion("firmsevenst <=", value, "firmsevenst");
            return (Criteria) this;
        }

        public Criteria andFirmsevenstLike(String value) {
            addCriterion("firmsevenst like", value, "firmsevenst");
            return (Criteria) this;
        }

        public Criteria andFirmsevenstNotLike(String value) {
            addCriterion("firmsevenst not like", value, "firmsevenst");
            return (Criteria) this;
        }

        public Criteria andFirmsevenstIn(List<String> values) {
            addCriterion("firmsevenst in", values, "firmsevenst");
            return (Criteria) this;
        }

        public Criteria andFirmsevenstNotIn(List<String> values) {
            addCriterion("firmsevenst not in", values, "firmsevenst");
            return (Criteria) this;
        }

        public Criteria andFirmsevenstBetween(String value1, String value2) {
            addCriterion("firmsevenst between", value1, value2, "firmsevenst");
            return (Criteria) this;
        }

        public Criteria andFirmsevenstNotBetween(String value1, String value2) {
            addCriterion("firmsevenst not between", value1, value2, "firmsevenst");
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