package com.accp.domain;

import java.util.ArrayList;
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

        public Criteria andViptypeIsNull() {
            addCriterion("viptype is null");
            return (Criteria) this;
        }

        public Criteria andViptypeIsNotNull() {
            addCriterion("viptype is not null");
            return (Criteria) this;
        }

        public Criteria andViptypeEqualTo(String value) {
            addCriterion("viptype =", value, "viptype");
            return (Criteria) this;
        }

        public Criteria andViptypeNotEqualTo(String value) {
            addCriterion("viptype <>", value, "viptype");
            return (Criteria) this;
        }

        public Criteria andViptypeGreaterThan(String value) {
            addCriterion("viptype >", value, "viptype");
            return (Criteria) this;
        }

        public Criteria andViptypeGreaterThanOrEqualTo(String value) {
            addCriterion("viptype >=", value, "viptype");
            return (Criteria) this;
        }

        public Criteria andViptypeLessThan(String value) {
            addCriterion("viptype <", value, "viptype");
            return (Criteria) this;
        }

        public Criteria andViptypeLessThanOrEqualTo(String value) {
            addCriterion("viptype <=", value, "viptype");
            return (Criteria) this;
        }

        public Criteria andViptypeLike(String value) {
            addCriterion("viptype like", value, "viptype");
            return (Criteria) this;
        }

        public Criteria andViptypeNotLike(String value) {
            addCriterion("viptype not like", value, "viptype");
            return (Criteria) this;
        }

        public Criteria andViptypeIn(List<String> values) {
            addCriterion("viptype in", values, "viptype");
            return (Criteria) this;
        }

        public Criteria andViptypeNotIn(List<String> values) {
            addCriterion("viptype not in", values, "viptype");
            return (Criteria) this;
        }

        public Criteria andViptypeBetween(String value1, String value2) {
            addCriterion("viptype between", value1, value2, "viptype");
            return (Criteria) this;
        }

        public Criteria andViptypeNotBetween(String value1, String value2) {
            addCriterion("viptype not between", value1, value2, "viptype");
            return (Criteria) this;
        }

        public Criteria andMoneytypeIsNull() {
            addCriterion("moneytype is null");
            return (Criteria) this;
        }

        public Criteria andMoneytypeIsNotNull() {
            addCriterion("moneytype is not null");
            return (Criteria) this;
        }

        public Criteria andMoneytypeEqualTo(String value) {
            addCriterion("moneytype =", value, "moneytype");
            return (Criteria) this;
        }

        public Criteria andMoneytypeNotEqualTo(String value) {
            addCriterion("moneytype <>", value, "moneytype");
            return (Criteria) this;
        }

        public Criteria andMoneytypeGreaterThan(String value) {
            addCriterion("moneytype >", value, "moneytype");
            return (Criteria) this;
        }

        public Criteria andMoneytypeGreaterThanOrEqualTo(String value) {
            addCriterion("moneytype >=", value, "moneytype");
            return (Criteria) this;
        }

        public Criteria andMoneytypeLessThan(String value) {
            addCriterion("moneytype <", value, "moneytype");
            return (Criteria) this;
        }

        public Criteria andMoneytypeLessThanOrEqualTo(String value) {
            addCriterion("moneytype <=", value, "moneytype");
            return (Criteria) this;
        }

        public Criteria andMoneytypeLike(String value) {
            addCriterion("moneytype like", value, "moneytype");
            return (Criteria) this;
        }

        public Criteria andMoneytypeNotLike(String value) {
            addCriterion("moneytype not like", value, "moneytype");
            return (Criteria) this;
        }

        public Criteria andMoneytypeIn(List<String> values) {
            addCriterion("moneytype in", values, "moneytype");
            return (Criteria) this;
        }

        public Criteria andMoneytypeNotIn(List<String> values) {
            addCriterion("moneytype not in", values, "moneytype");
            return (Criteria) this;
        }

        public Criteria andMoneytypeBetween(String value1, String value2) {
            addCriterion("moneytype between", value1, value2, "moneytype");
            return (Criteria) this;
        }

        public Criteria andMoneytypeNotBetween(String value1, String value2) {
            addCriterion("moneytype not between", value1, value2, "moneytype");
            return (Criteria) this;
        }

        public Criteria andYouxianqiIsNull() {
            addCriterion("youxianqi is null");
            return (Criteria) this;
        }

        public Criteria andYouxianqiIsNotNull() {
            addCriterion("youxianqi is not null");
            return (Criteria) this;
        }

        public Criteria andYouxianqiEqualTo(Integer value) {
            addCriterion("youxianqi =", value, "youxianqi");
            return (Criteria) this;
        }

        public Criteria andYouxianqiNotEqualTo(Integer value) {
            addCriterion("youxianqi <>", value, "youxianqi");
            return (Criteria) this;
        }

        public Criteria andYouxianqiGreaterThan(Integer value) {
            addCriterion("youxianqi >", value, "youxianqi");
            return (Criteria) this;
        }

        public Criteria andYouxianqiGreaterThanOrEqualTo(Integer value) {
            addCriterion("youxianqi >=", value, "youxianqi");
            return (Criteria) this;
        }

        public Criteria andYouxianqiLessThan(Integer value) {
            addCriterion("youxianqi <", value, "youxianqi");
            return (Criteria) this;
        }

        public Criteria andYouxianqiLessThanOrEqualTo(Integer value) {
            addCriterion("youxianqi <=", value, "youxianqi");
            return (Criteria) this;
        }

        public Criteria andYouxianqiIn(List<Integer> values) {
            addCriterion("youxianqi in", values, "youxianqi");
            return (Criteria) this;
        }

        public Criteria andYouxianqiNotIn(List<Integer> values) {
            addCriterion("youxianqi not in", values, "youxianqi");
            return (Criteria) this;
        }

        public Criteria andYouxianqiBetween(Integer value1, Integer value2) {
            addCriterion("youxianqi between", value1, value2, "youxianqi");
            return (Criteria) this;
        }

        public Criteria andYouxianqiNotBetween(Integer value1, Integer value2) {
            addCriterion("youxianqi not between", value1, value2, "youxianqi");
            return (Criteria) this;
        }

        public Criteria andHuifeiIsNull() {
            addCriterion("huifei is null");
            return (Criteria) this;
        }

        public Criteria andHuifeiIsNotNull() {
            addCriterion("huifei is not null");
            return (Criteria) this;
        }

        public Criteria andHuifeiEqualTo(Integer value) {
            addCriterion("huifei =", value, "huifei");
            return (Criteria) this;
        }

        public Criteria andHuifeiNotEqualTo(Integer value) {
            addCriterion("huifei <>", value, "huifei");
            return (Criteria) this;
        }

        public Criteria andHuifeiGreaterThan(Integer value) {
            addCriterion("huifei >", value, "huifei");
            return (Criteria) this;
        }

        public Criteria andHuifeiGreaterThanOrEqualTo(Integer value) {
            addCriterion("huifei >=", value, "huifei");
            return (Criteria) this;
        }

        public Criteria andHuifeiLessThan(Integer value) {
            addCriterion("huifei <", value, "huifei");
            return (Criteria) this;
        }

        public Criteria andHuifeiLessThanOrEqualTo(Integer value) {
            addCriterion("huifei <=", value, "huifei");
            return (Criteria) this;
        }

        public Criteria andHuifeiIn(List<Integer> values) {
            addCriterion("huifei in", values, "huifei");
            return (Criteria) this;
        }

        public Criteria andHuifeiNotIn(List<Integer> values) {
            addCriterion("huifei not in", values, "huifei");
            return (Criteria) this;
        }

        public Criteria andHuifeiBetween(Integer value1, Integer value2) {
            addCriterion("huifei between", value1, value2, "huifei");
            return (Criteria) this;
        }

        public Criteria andHuifeiNotBetween(Integer value1, Integer value2) {
            addCriterion("huifei not between", value1, value2, "huifei");
            return (Criteria) this;
        }

        public Criteria andTtyyppeeIsNull() {
            addCriterion("ttyyppee is null");
            return (Criteria) this;
        }

        public Criteria andTtyyppeeIsNotNull() {
            addCriterion("ttyyppee is not null");
            return (Criteria) this;
        }

        public Criteria andTtyyppeeEqualTo(String value) {
            addCriterion("ttyyppee =", value, "ttyyppee");
            return (Criteria) this;
        }

        public Criteria andTtyyppeeNotEqualTo(String value) {
            addCriterion("ttyyppee <>", value, "ttyyppee");
            return (Criteria) this;
        }

        public Criteria andTtyyppeeGreaterThan(String value) {
            addCriterion("ttyyppee >", value, "ttyyppee");
            return (Criteria) this;
        }

        public Criteria andTtyyppeeGreaterThanOrEqualTo(String value) {
            addCriterion("ttyyppee >=", value, "ttyyppee");
            return (Criteria) this;
        }

        public Criteria andTtyyppeeLessThan(String value) {
            addCriterion("ttyyppee <", value, "ttyyppee");
            return (Criteria) this;
        }

        public Criteria andTtyyppeeLessThanOrEqualTo(String value) {
            addCriterion("ttyyppee <=", value, "ttyyppee");
            return (Criteria) this;
        }

        public Criteria andTtyyppeeLike(String value) {
            addCriterion("ttyyppee like", value, "ttyyppee");
            return (Criteria) this;
        }

        public Criteria andTtyyppeeNotLike(String value) {
            addCriterion("ttyyppee not like", value, "ttyyppee");
            return (Criteria) this;
        }

        public Criteria andTtyyppeeIn(List<String> values) {
            addCriterion("ttyyppee in", values, "ttyyppee");
            return (Criteria) this;
        }

        public Criteria andTtyyppeeNotIn(List<String> values) {
            addCriterion("ttyyppee not in", values, "ttyyppee");
            return (Criteria) this;
        }

        public Criteria andTtyyppeeBetween(String value1, String value2) {
            addCriterion("ttyyppee between", value1, value2, "ttyyppee");
            return (Criteria) this;
        }

        public Criteria andTtyyppeeNotBetween(String value1, String value2) {
            addCriterion("ttyyppee not between", value1, value2, "ttyyppee");
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