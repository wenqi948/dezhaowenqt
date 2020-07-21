package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CashiersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CashiersExample() {
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

        public Criteria andCasidIsNull() {
            addCriterion("casid is null");
            return (Criteria) this;
        }

        public Criteria andCasidIsNotNull() {
            addCriterion("casid is not null");
            return (Criteria) this;
        }

        public Criteria andCasidEqualTo(Integer value) {
            addCriterion("casid =", value, "casid");
            return (Criteria) this;
        }

        public Criteria andCasidNotEqualTo(Integer value) {
            addCriterion("casid <>", value, "casid");
            return (Criteria) this;
        }

        public Criteria andCasidGreaterThan(Integer value) {
            addCriterion("casid >", value, "casid");
            return (Criteria) this;
        }

        public Criteria andCasidGreaterThanOrEqualTo(Integer value) {
            addCriterion("casid >=", value, "casid");
            return (Criteria) this;
        }

        public Criteria andCasidLessThan(Integer value) {
            addCriterion("casid <", value, "casid");
            return (Criteria) this;
        }

        public Criteria andCasidLessThanOrEqualTo(Integer value) {
            addCriterion("casid <=", value, "casid");
            return (Criteria) this;
        }

        public Criteria andCasidIn(List<Integer> values) {
            addCriterion("casid in", values, "casid");
            return (Criteria) this;
        }

        public Criteria andCasidNotIn(List<Integer> values) {
            addCriterion("casid not in", values, "casid");
            return (Criteria) this;
        }

        public Criteria andCasidBetween(Integer value1, Integer value2) {
            addCriterion("casid between", value1, value2, "casid");
            return (Criteria) this;
        }

        public Criteria andCasidNotBetween(Integer value1, Integer value2) {
            addCriterion("casid not between", value1, value2, "casid");
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

        public Criteria andCashierspriceIsNull() {
            addCriterion("cashiersprice is null");
            return (Criteria) this;
        }

        public Criteria andCashierspriceIsNotNull() {
            addCriterion("cashiersprice is not null");
            return (Criteria) this;
        }

        public Criteria andCashierspriceEqualTo(Float value) {
            addCriterion("cashiersprice =", value, "cashiersprice");
            return (Criteria) this;
        }

        public Criteria andCashierspriceNotEqualTo(Float value) {
            addCriterion("cashiersprice <>", value, "cashiersprice");
            return (Criteria) this;
        }

        public Criteria andCashierspriceGreaterThan(Float value) {
            addCriterion("cashiersprice >", value, "cashiersprice");
            return (Criteria) this;
        }

        public Criteria andCashierspriceGreaterThanOrEqualTo(Float value) {
            addCriterion("cashiersprice >=", value, "cashiersprice");
            return (Criteria) this;
        }

        public Criteria andCashierspriceLessThan(Float value) {
            addCriterion("cashiersprice <", value, "cashiersprice");
            return (Criteria) this;
        }

        public Criteria andCashierspriceLessThanOrEqualTo(Float value) {
            addCriterion("cashiersprice <=", value, "cashiersprice");
            return (Criteria) this;
        }

        public Criteria andCashierspriceIn(List<Float> values) {
            addCriterion("cashiersprice in", values, "cashiersprice");
            return (Criteria) this;
        }

        public Criteria andCashierspriceNotIn(List<Float> values) {
            addCriterion("cashiersprice not in", values, "cashiersprice");
            return (Criteria) this;
        }

        public Criteria andCashierspriceBetween(Float value1, Float value2) {
            addCriterion("cashiersprice between", value1, value2, "cashiersprice");
            return (Criteria) this;
        }

        public Criteria andCashierspriceNotBetween(Float value1, Float value2) {
            addCriterion("cashiersprice not between", value1, value2, "cashiersprice");
            return (Criteria) this;
        }

        public Criteria andShijpriceIsNull() {
            addCriterion("shijprice is null");
            return (Criteria) this;
        }

        public Criteria andShijpriceIsNotNull() {
            addCriterion("shijprice is not null");
            return (Criteria) this;
        }

        public Criteria andShijpriceEqualTo(Float value) {
            addCriterion("shijprice =", value, "shijprice");
            return (Criteria) this;
        }

        public Criteria andShijpriceNotEqualTo(Float value) {
            addCriterion("shijprice <>", value, "shijprice");
            return (Criteria) this;
        }

        public Criteria andShijpriceGreaterThan(Float value) {
            addCriterion("shijprice >", value, "shijprice");
            return (Criteria) this;
        }

        public Criteria andShijpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("shijprice >=", value, "shijprice");
            return (Criteria) this;
        }

        public Criteria andShijpriceLessThan(Float value) {
            addCriterion("shijprice <", value, "shijprice");
            return (Criteria) this;
        }

        public Criteria andShijpriceLessThanOrEqualTo(Float value) {
            addCriterion("shijprice <=", value, "shijprice");
            return (Criteria) this;
        }

        public Criteria andShijpriceIn(List<Float> values) {
            addCriterion("shijprice in", values, "shijprice");
            return (Criteria) this;
        }

        public Criteria andShijpriceNotIn(List<Float> values) {
            addCriterion("shijprice not in", values, "shijprice");
            return (Criteria) this;
        }

        public Criteria andShijpriceBetween(Float value1, Float value2) {
            addCriterion("shijprice between", value1, value2, "shijprice");
            return (Criteria) this;
        }

        public Criteria andShijpriceNotBetween(Float value1, Float value2) {
            addCriterion("shijprice not between", value1, value2, "shijprice");
            return (Criteria) this;
        }

        public Criteria andPaymenttempIsNull() {
            addCriterion("paymenttemp is null");
            return (Criteria) this;
        }

        public Criteria andPaymenttempIsNotNull() {
            addCriterion("paymenttemp is not null");
            return (Criteria) this;
        }

        public Criteria andPaymenttempEqualTo(String value) {
            addCriterion("paymenttemp =", value, "paymenttemp");
            return (Criteria) this;
        }

        public Criteria andPaymenttempNotEqualTo(String value) {
            addCriterion("paymenttemp <>", value, "paymenttemp");
            return (Criteria) this;
        }

        public Criteria andPaymenttempGreaterThan(String value) {
            addCriterion("paymenttemp >", value, "paymenttemp");
            return (Criteria) this;
        }

        public Criteria andPaymenttempGreaterThanOrEqualTo(String value) {
            addCriterion("paymenttemp >=", value, "paymenttemp");
            return (Criteria) this;
        }

        public Criteria andPaymenttempLessThan(String value) {
            addCriterion("paymenttemp <", value, "paymenttemp");
            return (Criteria) this;
        }

        public Criteria andPaymenttempLessThanOrEqualTo(String value) {
            addCriterion("paymenttemp <=", value, "paymenttemp");
            return (Criteria) this;
        }

        public Criteria andPaymenttempLike(String value) {
            addCriterion("paymenttemp like", value, "paymenttemp");
            return (Criteria) this;
        }

        public Criteria andPaymenttempNotLike(String value) {
            addCriterion("paymenttemp not like", value, "paymenttemp");
            return (Criteria) this;
        }

        public Criteria andPaymenttempIn(List<String> values) {
            addCriterion("paymenttemp in", values, "paymenttemp");
            return (Criteria) this;
        }

        public Criteria andPaymenttempNotIn(List<String> values) {
            addCriterion("paymenttemp not in", values, "paymenttemp");
            return (Criteria) this;
        }

        public Criteria andPaymenttempBetween(String value1, String value2) {
            addCriterion("paymenttemp between", value1, value2, "paymenttemp");
            return (Criteria) this;
        }

        public Criteria andPaymenttempNotBetween(String value1, String value2) {
            addCriterion("paymenttemp not between", value1, value2, "paymenttemp");
            return (Criteria) this;
        }

        public Criteria andJfdkIsNull() {
            addCriterion("jfdk is null");
            return (Criteria) this;
        }

        public Criteria andJfdkIsNotNull() {
            addCriterion("jfdk is not null");
            return (Criteria) this;
        }

        public Criteria andJfdkEqualTo(Float value) {
            addCriterion("jfdk =", value, "jfdk");
            return (Criteria) this;
        }

        public Criteria andJfdkNotEqualTo(Float value) {
            addCriterion("jfdk <>", value, "jfdk");
            return (Criteria) this;
        }

        public Criteria andJfdkGreaterThan(Float value) {
            addCriterion("jfdk >", value, "jfdk");
            return (Criteria) this;
        }

        public Criteria andJfdkGreaterThanOrEqualTo(Float value) {
            addCriterion("jfdk >=", value, "jfdk");
            return (Criteria) this;
        }

        public Criteria andJfdkLessThan(Float value) {
            addCriterion("jfdk <", value, "jfdk");
            return (Criteria) this;
        }

        public Criteria andJfdkLessThanOrEqualTo(Float value) {
            addCriterion("jfdk <=", value, "jfdk");
            return (Criteria) this;
        }

        public Criteria andJfdkIn(List<Float> values) {
            addCriterion("jfdk in", values, "jfdk");
            return (Criteria) this;
        }

        public Criteria andJfdkNotIn(List<Float> values) {
            addCriterion("jfdk not in", values, "jfdk");
            return (Criteria) this;
        }

        public Criteria andJfdkBetween(Float value1, Float value2) {
            addCriterion("jfdk between", value1, value2, "jfdk");
            return (Criteria) this;
        }

        public Criteria andJfdkNotBetween(Float value1, Float value2) {
            addCriterion("jfdk not between", value1, value2, "jfdk");
            return (Criteria) this;
        }

        public Criteria andCashierstimesIsNull() {
            addCriterion("cashierstimes is null");
            return (Criteria) this;
        }

        public Criteria andCashierstimesIsNotNull() {
            addCriterion("cashierstimes is not null");
            return (Criteria) this;
        }

        public Criteria andCashierstimesEqualTo(Date value) {
            addCriterionForJDBCDate("cashierstimes =", value, "cashierstimes");
            return (Criteria) this;
        }

        public Criteria andCashierstimesNotEqualTo(Date value) {
            addCriterionForJDBCDate("cashierstimes <>", value, "cashierstimes");
            return (Criteria) this;
        }

        public Criteria andCashierstimesGreaterThan(Date value) {
            addCriterionForJDBCDate("cashierstimes >", value, "cashierstimes");
            return (Criteria) this;
        }

        public Criteria andCashierstimesGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cashierstimes >=", value, "cashierstimes");
            return (Criteria) this;
        }

        public Criteria andCashierstimesLessThan(Date value) {
            addCriterionForJDBCDate("cashierstimes <", value, "cashierstimes");
            return (Criteria) this;
        }

        public Criteria andCashierstimesLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cashierstimes <=", value, "cashierstimes");
            return (Criteria) this;
        }

        public Criteria andCashierstimesIn(List<Date> values) {
            addCriterionForJDBCDate("cashierstimes in", values, "cashierstimes");
            return (Criteria) this;
        }

        public Criteria andCashierstimesNotIn(List<Date> values) {
            addCriterionForJDBCDate("cashierstimes not in", values, "cashierstimes");
            return (Criteria) this;
        }

        public Criteria andCashierstimesBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cashierstimes between", value1, value2, "cashierstimes");
            return (Criteria) this;
        }

        public Criteria andCashierstimesNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cashierstimes not between", value1, value2, "cashierstimes");
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