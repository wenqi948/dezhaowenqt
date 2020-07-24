package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class TeamtimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamtimeExample() {
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

        public Criteria andTtidIsNull() {
            addCriterion("ttid is null");
            return (Criteria) this;
        }

        public Criteria andTtidIsNotNull() {
            addCriterion("ttid is not null");
            return (Criteria) this;
        }

        public Criteria andTtidEqualTo(Integer value) {
            addCriterion("ttid =", value, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidNotEqualTo(Integer value) {
            addCriterion("ttid <>", value, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidGreaterThan(Integer value) {
            addCriterion("ttid >", value, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ttid >=", value, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidLessThan(Integer value) {
            addCriterion("ttid <", value, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidLessThanOrEqualTo(Integer value) {
            addCriterion("ttid <=", value, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidIn(List<Integer> values) {
            addCriterion("ttid in", values, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidNotIn(List<Integer> values) {
            addCriterion("ttid not in", values, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidBetween(Integer value1, Integer value2) {
            addCriterion("ttid between", value1, value2, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidNotBetween(Integer value1, Integer value2) {
            addCriterion("ttid not between", value1, value2, "ttid");
            return (Criteria) this;
        }

        public Criteria andTeamnameIsNull() {
            addCriterion("teamname is null");
            return (Criteria) this;
        }

        public Criteria andTeamnameIsNotNull() {
            addCriterion("teamname is not null");
            return (Criteria) this;
        }

        public Criteria andTeamnameEqualTo(String value) {
            addCriterion("teamname =", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotEqualTo(String value) {
            addCriterion("teamname <>", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameGreaterThan(String value) {
            addCriterion("teamname >", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameGreaterThanOrEqualTo(String value) {
            addCriterion("teamname >=", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameLessThan(String value) {
            addCriterion("teamname <", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameLessThanOrEqualTo(String value) {
            addCriterion("teamname <=", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameLike(String value) {
            addCriterion("teamname like", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotLike(String value) {
            addCriterion("teamname not like", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameIn(List<String> values) {
            addCriterion("teamname in", values, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotIn(List<String> values) {
            addCriterion("teamname not in", values, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameBetween(String value1, String value2) {
            addCriterion("teamname between", value1, value2, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotBetween(String value1, String value2) {
            addCriterion("teamname not between", value1, value2, "teamname");
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

        public Criteria andMoneyznbtIsNull() {
            addCriterion("moneyznbt is null");
            return (Criteria) this;
        }

        public Criteria andMoneyznbtIsNotNull() {
            addCriterion("moneyznbt is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyznbtEqualTo(Double value) {
            addCriterion("moneyznbt =", value, "moneyznbt");
            return (Criteria) this;
        }

        public Criteria andMoneyznbtNotEqualTo(Double value) {
            addCriterion("moneyznbt <>", value, "moneyznbt");
            return (Criteria) this;
        }

        public Criteria andMoneyznbtGreaterThan(Double value) {
            addCriterion("moneyznbt >", value, "moneyznbt");
            return (Criteria) this;
        }

        public Criteria andMoneyznbtGreaterThanOrEqualTo(Double value) {
            addCriterion("moneyznbt >=", value, "moneyznbt");
            return (Criteria) this;
        }

        public Criteria andMoneyznbtLessThan(Double value) {
            addCriterion("moneyznbt <", value, "moneyznbt");
            return (Criteria) this;
        }

        public Criteria andMoneyznbtLessThanOrEqualTo(Double value) {
            addCriterion("moneyznbt <=", value, "moneyznbt");
            return (Criteria) this;
        }

        public Criteria andMoneyznbtIn(List<Double> values) {
            addCriterion("moneyznbt in", values, "moneyznbt");
            return (Criteria) this;
        }

        public Criteria andMoneyznbtNotIn(List<Double> values) {
            addCriterion("moneyznbt not in", values, "moneyznbt");
            return (Criteria) this;
        }

        public Criteria andMoneyznbtBetween(Double value1, Double value2) {
            addCriterion("moneyznbt between", value1, value2, "moneyznbt");
            return (Criteria) this;
        }

        public Criteria andMoneyznbtNotBetween(Double value1, Double value2) {
            addCriterion("moneyznbt not between", value1, value2, "moneyznbt");
            return (Criteria) this;
        }

        public Criteria andZnwsIsNull() {
            addCriterion("znws is null");
            return (Criteria) this;
        }

        public Criteria andZnwsIsNotNull() {
            addCriterion("znws is not null");
            return (Criteria) this;
        }

        public Criteria andZnwsEqualTo(Double value) {
            addCriterion("znws =", value, "znws");
            return (Criteria) this;
        }

        public Criteria andZnwsNotEqualTo(Double value) {
            addCriterion("znws <>", value, "znws");
            return (Criteria) this;
        }

        public Criteria andZnwsGreaterThan(Double value) {
            addCriterion("znws >", value, "znws");
            return (Criteria) this;
        }

        public Criteria andZnwsGreaterThanOrEqualTo(Double value) {
            addCriterion("znws >=", value, "znws");
            return (Criteria) this;
        }

        public Criteria andZnwsLessThan(Double value) {
            addCriterion("znws <", value, "znws");
            return (Criteria) this;
        }

        public Criteria andZnwsLessThanOrEqualTo(Double value) {
            addCriterion("znws <=", value, "znws");
            return (Criteria) this;
        }

        public Criteria andZnwsIn(List<Double> values) {
            addCriterion("znws in", values, "znws");
            return (Criteria) this;
        }

        public Criteria andZnwsNotIn(List<Double> values) {
            addCriterion("znws not in", values, "znws");
            return (Criteria) this;
        }

        public Criteria andZnwsBetween(Double value1, Double value2) {
            addCriterion("znws between", value1, value2, "znws");
            return (Criteria) this;
        }

        public Criteria andZnwsNotBetween(Double value1, Double value2) {
            addCriterion("znws not between", value1, value2, "znws");
            return (Criteria) this;
        }

        public Criteria andZwbtIsNull() {
            addCriterion("zwbt is null");
            return (Criteria) this;
        }

        public Criteria andZwbtIsNotNull() {
            addCriterion("zwbt is not null");
            return (Criteria) this;
        }

        public Criteria andZwbtEqualTo(Double value) {
            addCriterion("zwbt =", value, "zwbt");
            return (Criteria) this;
        }

        public Criteria andZwbtNotEqualTo(Double value) {
            addCriterion("zwbt <>", value, "zwbt");
            return (Criteria) this;
        }

        public Criteria andZwbtGreaterThan(Double value) {
            addCriterion("zwbt >", value, "zwbt");
            return (Criteria) this;
        }

        public Criteria andZwbtGreaterThanOrEqualTo(Double value) {
            addCriterion("zwbt >=", value, "zwbt");
            return (Criteria) this;
        }

        public Criteria andZwbtLessThan(Double value) {
            addCriterion("zwbt <", value, "zwbt");
            return (Criteria) this;
        }

        public Criteria andZwbtLessThanOrEqualTo(Double value) {
            addCriterion("zwbt <=", value, "zwbt");
            return (Criteria) this;
        }

        public Criteria andZwbtIn(List<Double> values) {
            addCriterion("zwbt in", values, "zwbt");
            return (Criteria) this;
        }

        public Criteria andZwbtNotIn(List<Double> values) {
            addCriterion("zwbt not in", values, "zwbt");
            return (Criteria) this;
        }

        public Criteria andZwbtBetween(Double value1, Double value2) {
            addCriterion("zwbt between", value1, value2, "zwbt");
            return (Criteria) this;
        }

        public Criteria andZwbtNotBetween(Double value1, Double value2) {
            addCriterion("zwbt not between", value1, value2, "zwbt");
            return (Criteria) this;
        }

        public Criteria andZwwsIsNull() {
            addCriterion("zwws is null");
            return (Criteria) this;
        }

        public Criteria andZwwsIsNotNull() {
            addCriterion("zwws is not null");
            return (Criteria) this;
        }

        public Criteria andZwwsEqualTo(Double value) {
            addCriterion("zwws =", value, "zwws");
            return (Criteria) this;
        }

        public Criteria andZwwsNotEqualTo(Double value) {
            addCriterion("zwws <>", value, "zwws");
            return (Criteria) this;
        }

        public Criteria andZwwsGreaterThan(Double value) {
            addCriterion("zwws >", value, "zwws");
            return (Criteria) this;
        }

        public Criteria andZwwsGreaterThanOrEqualTo(Double value) {
            addCriterion("zwws >=", value, "zwws");
            return (Criteria) this;
        }

        public Criteria andZwwsLessThan(Double value) {
            addCriterion("zwws <", value, "zwws");
            return (Criteria) this;
        }

        public Criteria andZwwsLessThanOrEqualTo(Double value) {
            addCriterion("zwws <=", value, "zwws");
            return (Criteria) this;
        }

        public Criteria andZwwsIn(List<Double> values) {
            addCriterion("zwws in", values, "zwws");
            return (Criteria) this;
        }

        public Criteria andZwwsNotIn(List<Double> values) {
            addCriterion("zwws not in", values, "zwws");
            return (Criteria) this;
        }

        public Criteria andZwwsBetween(Double value1, Double value2) {
            addCriterion("zwws between", value1, value2, "zwws");
            return (Criteria) this;
        }

        public Criteria andZwwsNotBetween(Double value1, Double value2) {
            addCriterion("zwws not between", value1, value2, "zwws");
            return (Criteria) this;
        }

        public Criteria andZtbtIsNull() {
            addCriterion("ztbt is null");
            return (Criteria) this;
        }

        public Criteria andZtbtIsNotNull() {
            addCriterion("ztbt is not null");
            return (Criteria) this;
        }

        public Criteria andZtbtEqualTo(Double value) {
            addCriterion("ztbt =", value, "ztbt");
            return (Criteria) this;
        }

        public Criteria andZtbtNotEqualTo(Double value) {
            addCriterion("ztbt <>", value, "ztbt");
            return (Criteria) this;
        }

        public Criteria andZtbtGreaterThan(Double value) {
            addCriterion("ztbt >", value, "ztbt");
            return (Criteria) this;
        }

        public Criteria andZtbtGreaterThanOrEqualTo(Double value) {
            addCriterion("ztbt >=", value, "ztbt");
            return (Criteria) this;
        }

        public Criteria andZtbtLessThan(Double value) {
            addCriterion("ztbt <", value, "ztbt");
            return (Criteria) this;
        }

        public Criteria andZtbtLessThanOrEqualTo(Double value) {
            addCriterion("ztbt <=", value, "ztbt");
            return (Criteria) this;
        }

        public Criteria andZtbtIn(List<Double> values) {
            addCriterion("ztbt in", values, "ztbt");
            return (Criteria) this;
        }

        public Criteria andZtbtNotIn(List<Double> values) {
            addCriterion("ztbt not in", values, "ztbt");
            return (Criteria) this;
        }

        public Criteria andZtbtBetween(Double value1, Double value2) {
            addCriterion("ztbt between", value1, value2, "ztbt");
            return (Criteria) this;
        }

        public Criteria andZtbtNotBetween(Double value1, Double value2) {
            addCriterion("ztbt not between", value1, value2, "ztbt");
            return (Criteria) this;
        }

        public Criteria andZtwsIsNull() {
            addCriterion("ztws is null");
            return (Criteria) this;
        }

        public Criteria andZtwsIsNotNull() {
            addCriterion("ztws is not null");
            return (Criteria) this;
        }

        public Criteria andZtwsEqualTo(Double value) {
            addCriterion("ztws =", value, "ztws");
            return (Criteria) this;
        }

        public Criteria andZtwsNotEqualTo(Double value) {
            addCriterion("ztws <>", value, "ztws");
            return (Criteria) this;
        }

        public Criteria andZtwsGreaterThan(Double value) {
            addCriterion("ztws >", value, "ztws");
            return (Criteria) this;
        }

        public Criteria andZtwsGreaterThanOrEqualTo(Double value) {
            addCriterion("ztws >=", value, "ztws");
            return (Criteria) this;
        }

        public Criteria andZtwsLessThan(Double value) {
            addCriterion("ztws <", value, "ztws");
            return (Criteria) this;
        }

        public Criteria andZtwsLessThanOrEqualTo(Double value) {
            addCriterion("ztws <=", value, "ztws");
            return (Criteria) this;
        }

        public Criteria andZtwsIn(List<Double> values) {
            addCriterion("ztws in", values, "ztws");
            return (Criteria) this;
        }

        public Criteria andZtwsNotIn(List<Double> values) {
            addCriterion("ztws not in", values, "ztws");
            return (Criteria) this;
        }

        public Criteria andZtwsBetween(Double value1, Double value2) {
            addCriterion("ztws between", value1, value2, "ztws");
            return (Criteria) this;
        }

        public Criteria andZtwsNotBetween(Double value1, Double value2) {
            addCriterion("ztws not between", value1, value2, "ztws");
            return (Criteria) this;
        }

        public Criteria andRymoneyIsNull() {
            addCriterion("rymoney is null");
            return (Criteria) this;
        }

        public Criteria andRymoneyIsNotNull() {
            addCriterion("rymoney is not null");
            return (Criteria) this;
        }

        public Criteria andRymoneyEqualTo(Double value) {
            addCriterion("rymoney =", value, "rymoney");
            return (Criteria) this;
        }

        public Criteria andRymoneyNotEqualTo(Double value) {
            addCriterion("rymoney <>", value, "rymoney");
            return (Criteria) this;
        }

        public Criteria andRymoneyGreaterThan(Double value) {
            addCriterion("rymoney >", value, "rymoney");
            return (Criteria) this;
        }

        public Criteria andRymoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("rymoney >=", value, "rymoney");
            return (Criteria) this;
        }

        public Criteria andRymoneyLessThan(Double value) {
            addCriterion("rymoney <", value, "rymoney");
            return (Criteria) this;
        }

        public Criteria andRymoneyLessThanOrEqualTo(Double value) {
            addCriterion("rymoney <=", value, "rymoney");
            return (Criteria) this;
        }

        public Criteria andRymoneyIn(List<Double> values) {
            addCriterion("rymoney in", values, "rymoney");
            return (Criteria) this;
        }

        public Criteria andRymoneyNotIn(List<Double> values) {
            addCriterion("rymoney not in", values, "rymoney");
            return (Criteria) this;
        }

        public Criteria andRymoneyBetween(Double value1, Double value2) {
            addCriterion("rymoney between", value1, value2, "rymoney");
            return (Criteria) this;
        }

        public Criteria andRymoneyNotBetween(Double value1, Double value2) {
            addCriterion("rymoney not between", value1, value2, "rymoney");
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