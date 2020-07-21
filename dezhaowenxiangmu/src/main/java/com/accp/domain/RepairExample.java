package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class RepairExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepairExample() {
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

        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Integer value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Integer value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Integer value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Integer value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Integer value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Integer> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Integer> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Integer value1, Integer value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Integer value1, Integer value2) {
            addCriterion("rid not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andFtypeIsNull() {
            addCriterion("ftype is null");
            return (Criteria) this;
        }

        public Criteria andFtypeIsNotNull() {
            addCriterion("ftype is not null");
            return (Criteria) this;
        }

        public Criteria andFtypeEqualTo(Integer value) {
            addCriterion("ftype =", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeNotEqualTo(Integer value) {
            addCriterion("ftype <>", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeGreaterThan(Integer value) {
            addCriterion("ftype >", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ftype >=", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeLessThan(Integer value) {
            addCriterion("ftype <", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeLessThanOrEqualTo(Integer value) {
            addCriterion("ftype <=", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeIn(List<Integer> values) {
            addCriterion("ftype in", values, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeNotIn(List<Integer> values) {
            addCriterion("ftype not in", values, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeBetween(Integer value1, Integer value2) {
            addCriterion("ftype between", value1, value2, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ftype not between", value1, value2, "ftype");
            return (Criteria) this;
        }

        public Criteria andXtypeIsNull() {
            addCriterion("xtype is null");
            return (Criteria) this;
        }

        public Criteria andXtypeIsNotNull() {
            addCriterion("xtype is not null");
            return (Criteria) this;
        }

        public Criteria andXtypeEqualTo(Integer value) {
            addCriterion("xtype =", value, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeNotEqualTo(Integer value) {
            addCriterion("xtype <>", value, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeGreaterThan(Integer value) {
            addCriterion("xtype >", value, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("xtype >=", value, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeLessThan(Integer value) {
            addCriterion("xtype <", value, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeLessThanOrEqualTo(Integer value) {
            addCriterion("xtype <=", value, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeIn(List<Integer> values) {
            addCriterion("xtype in", values, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeNotIn(List<Integer> values) {
            addCriterion("xtype not in", values, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeBetween(Integer value1, Integer value2) {
            addCriterion("xtype between", value1, value2, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("xtype not between", value1, value2, "xtype");
            return (Criteria) this;
        }

        public Criteria andRepairnameIsNull() {
            addCriterion("repairname is null");
            return (Criteria) this;
        }

        public Criteria andRepairnameIsNotNull() {
            addCriterion("repairname is not null");
            return (Criteria) this;
        }

        public Criteria andRepairnameEqualTo(String value) {
            addCriterion("repairname =", value, "repairname");
            return (Criteria) this;
        }

        public Criteria andRepairnameNotEqualTo(String value) {
            addCriterion("repairname <>", value, "repairname");
            return (Criteria) this;
        }

        public Criteria andRepairnameGreaterThan(String value) {
            addCriterion("repairname >", value, "repairname");
            return (Criteria) this;
        }

        public Criteria andRepairnameGreaterThanOrEqualTo(String value) {
            addCriterion("repairname >=", value, "repairname");
            return (Criteria) this;
        }

        public Criteria andRepairnameLessThan(String value) {
            addCriterion("repairname <", value, "repairname");
            return (Criteria) this;
        }

        public Criteria andRepairnameLessThanOrEqualTo(String value) {
            addCriterion("repairname <=", value, "repairname");
            return (Criteria) this;
        }

        public Criteria andRepairnameLike(String value) {
            addCriterion("repairname like", value, "repairname");
            return (Criteria) this;
        }

        public Criteria andRepairnameNotLike(String value) {
            addCriterion("repairname not like", value, "repairname");
            return (Criteria) this;
        }

        public Criteria andRepairnameIn(List<String> values) {
            addCriterion("repairname in", values, "repairname");
            return (Criteria) this;
        }

        public Criteria andRepairnameNotIn(List<String> values) {
            addCriterion("repairname not in", values, "repairname");
            return (Criteria) this;
        }

        public Criteria andRepairnameBetween(String value1, String value2) {
            addCriterion("repairname between", value1, value2, "repairname");
            return (Criteria) this;
        }

        public Criteria andRepairnameNotBetween(String value1, String value2) {
            addCriterion("repairname not between", value1, value2, "repairname");
            return (Criteria) this;
        }

        public Criteria andRepeventIsNull() {
            addCriterion("repevent is null");
            return (Criteria) this;
        }

        public Criteria andRepeventIsNotNull() {
            addCriterion("repevent is not null");
            return (Criteria) this;
        }

        public Criteria andRepeventEqualTo(String value) {
            addCriterion("repevent =", value, "repevent");
            return (Criteria) this;
        }

        public Criteria andRepeventNotEqualTo(String value) {
            addCriterion("repevent <>", value, "repevent");
            return (Criteria) this;
        }

        public Criteria andRepeventGreaterThan(String value) {
            addCriterion("repevent >", value, "repevent");
            return (Criteria) this;
        }

        public Criteria andRepeventGreaterThanOrEqualTo(String value) {
            addCriterion("repevent >=", value, "repevent");
            return (Criteria) this;
        }

        public Criteria andRepeventLessThan(String value) {
            addCriterion("repevent <", value, "repevent");
            return (Criteria) this;
        }

        public Criteria andRepeventLessThanOrEqualTo(String value) {
            addCriterion("repevent <=", value, "repevent");
            return (Criteria) this;
        }

        public Criteria andRepeventLike(String value) {
            addCriterion("repevent like", value, "repevent");
            return (Criteria) this;
        }

        public Criteria andRepeventNotLike(String value) {
            addCriterion("repevent not like", value, "repevent");
            return (Criteria) this;
        }

        public Criteria andRepeventIn(List<String> values) {
            addCriterion("repevent in", values, "repevent");
            return (Criteria) this;
        }

        public Criteria andRepeventNotIn(List<String> values) {
            addCriterion("repevent not in", values, "repevent");
            return (Criteria) this;
        }

        public Criteria andRepeventBetween(String value1, String value2) {
            addCriterion("repevent between", value1, value2, "repevent");
            return (Criteria) this;
        }

        public Criteria andRepeventNotBetween(String value1, String value2) {
            addCriterion("repevent not between", value1, value2, "repevent");
            return (Criteria) this;
        }

        public Criteria andRjbmoneyIsNull() {
            addCriterion("rjbmoney is null");
            return (Criteria) this;
        }

        public Criteria andRjbmoneyIsNotNull() {
            addCriterion("rjbmoney is not null");
            return (Criteria) this;
        }

        public Criteria andRjbmoneyEqualTo(Float value) {
            addCriterion("rjbmoney =", value, "rjbmoney");
            return (Criteria) this;
        }

        public Criteria andRjbmoneyNotEqualTo(Float value) {
            addCriterion("rjbmoney <>", value, "rjbmoney");
            return (Criteria) this;
        }

        public Criteria andRjbmoneyGreaterThan(Float value) {
            addCriterion("rjbmoney >", value, "rjbmoney");
            return (Criteria) this;
        }

        public Criteria andRjbmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("rjbmoney >=", value, "rjbmoney");
            return (Criteria) this;
        }

        public Criteria andRjbmoneyLessThan(Float value) {
            addCriterion("rjbmoney <", value, "rjbmoney");
            return (Criteria) this;
        }

        public Criteria andRjbmoneyLessThanOrEqualTo(Float value) {
            addCriterion("rjbmoney <=", value, "rjbmoney");
            return (Criteria) this;
        }

        public Criteria andRjbmoneyIn(List<Float> values) {
            addCriterion("rjbmoney in", values, "rjbmoney");
            return (Criteria) this;
        }

        public Criteria andRjbmoneyNotIn(List<Float> values) {
            addCriterion("rjbmoney not in", values, "rjbmoney");
            return (Criteria) this;
        }

        public Criteria andRjbmoneyBetween(Float value1, Float value2) {
            addCriterion("rjbmoney between", value1, value2, "rjbmoney");
            return (Criteria) this;
        }

        public Criteria andRjbmoneyNotBetween(Float value1, Float value2) {
            addCriterion("rjbmoney not between", value1, value2, "rjbmoney");
            return (Criteria) this;
        }

        public Criteria andRhymoneyIsNull() {
            addCriterion("rhymoney is null");
            return (Criteria) this;
        }

        public Criteria andRhymoneyIsNotNull() {
            addCriterion("rhymoney is not null");
            return (Criteria) this;
        }

        public Criteria andRhymoneyEqualTo(Float value) {
            addCriterion("rhymoney =", value, "rhymoney");
            return (Criteria) this;
        }

        public Criteria andRhymoneyNotEqualTo(Float value) {
            addCriterion("rhymoney <>", value, "rhymoney");
            return (Criteria) this;
        }

        public Criteria andRhymoneyGreaterThan(Float value) {
            addCriterion("rhymoney >", value, "rhymoney");
            return (Criteria) this;
        }

        public Criteria andRhymoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("rhymoney >=", value, "rhymoney");
            return (Criteria) this;
        }

        public Criteria andRhymoneyLessThan(Float value) {
            addCriterion("rhymoney <", value, "rhymoney");
            return (Criteria) this;
        }

        public Criteria andRhymoneyLessThanOrEqualTo(Float value) {
            addCriterion("rhymoney <=", value, "rhymoney");
            return (Criteria) this;
        }

        public Criteria andRhymoneyIn(List<Float> values) {
            addCriterion("rhymoney in", values, "rhymoney");
            return (Criteria) this;
        }

        public Criteria andRhymoneyNotIn(List<Float> values) {
            addCriterion("rhymoney not in", values, "rhymoney");
            return (Criteria) this;
        }

        public Criteria andRhymoneyBetween(Float value1, Float value2) {
            addCriterion("rhymoney between", value1, value2, "rhymoney");
            return (Criteria) this;
        }

        public Criteria andRhymoneyNotBetween(Float value1, Float value2) {
            addCriterion("rhymoney not between", value1, value2, "rhymoney");
            return (Criteria) this;
        }

        public Criteria andRvipmoneyIsNull() {
            addCriterion("rvipmoney is null");
            return (Criteria) this;
        }

        public Criteria andRvipmoneyIsNotNull() {
            addCriterion("rvipmoney is not null");
            return (Criteria) this;
        }

        public Criteria andRvipmoneyEqualTo(Float value) {
            addCriterion("rvipmoney =", value, "rvipmoney");
            return (Criteria) this;
        }

        public Criteria andRvipmoneyNotEqualTo(Float value) {
            addCriterion("rvipmoney <>", value, "rvipmoney");
            return (Criteria) this;
        }

        public Criteria andRvipmoneyGreaterThan(Float value) {
            addCriterion("rvipmoney >", value, "rvipmoney");
            return (Criteria) this;
        }

        public Criteria andRvipmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("rvipmoney >=", value, "rvipmoney");
            return (Criteria) this;
        }

        public Criteria andRvipmoneyLessThan(Float value) {
            addCriterion("rvipmoney <", value, "rvipmoney");
            return (Criteria) this;
        }

        public Criteria andRvipmoneyLessThanOrEqualTo(Float value) {
            addCriterion("rvipmoney <=", value, "rvipmoney");
            return (Criteria) this;
        }

        public Criteria andRvipmoneyIn(List<Float> values) {
            addCriterion("rvipmoney in", values, "rvipmoney");
            return (Criteria) this;
        }

        public Criteria andRvipmoneyNotIn(List<Float> values) {
            addCriterion("rvipmoney not in", values, "rvipmoney");
            return (Criteria) this;
        }

        public Criteria andRvipmoneyBetween(Float value1, Float value2) {
            addCriterion("rvipmoney between", value1, value2, "rvipmoney");
            return (Criteria) this;
        }

        public Criteria andRvipmoneyNotBetween(Float value1, Float value2) {
            addCriterion("rvipmoney not between", value1, value2, "rvipmoney");
            return (Criteria) this;
        }

        public Criteria andRepxypericeIsNull() {
            addCriterion("repxyperice is null");
            return (Criteria) this;
        }

        public Criteria andRepxypericeIsNotNull() {
            addCriterion("repxyperice is not null");
            return (Criteria) this;
        }

        public Criteria andRepxypericeEqualTo(Float value) {
            addCriterion("repxyperice =", value, "repxyperice");
            return (Criteria) this;
        }

        public Criteria andRepxypericeNotEqualTo(Float value) {
            addCriterion("repxyperice <>", value, "repxyperice");
            return (Criteria) this;
        }

        public Criteria andRepxypericeGreaterThan(Float value) {
            addCriterion("repxyperice >", value, "repxyperice");
            return (Criteria) this;
        }

        public Criteria andRepxypericeGreaterThanOrEqualTo(Float value) {
            addCriterion("repxyperice >=", value, "repxyperice");
            return (Criteria) this;
        }

        public Criteria andRepxypericeLessThan(Float value) {
            addCriterion("repxyperice <", value, "repxyperice");
            return (Criteria) this;
        }

        public Criteria andRepxypericeLessThanOrEqualTo(Float value) {
            addCriterion("repxyperice <=", value, "repxyperice");
            return (Criteria) this;
        }

        public Criteria andRepxypericeIn(List<Float> values) {
            addCriterion("repxyperice in", values, "repxyperice");
            return (Criteria) this;
        }

        public Criteria andRepxypericeNotIn(List<Float> values) {
            addCriterion("repxyperice not in", values, "repxyperice");
            return (Criteria) this;
        }

        public Criteria andRepxypericeBetween(Float value1, Float value2) {
            addCriterion("repxyperice between", value1, value2, "repxyperice");
            return (Criteria) this;
        }

        public Criteria andRepxypericeNotBetween(Float value1, Float value2) {
            addCriterion("repxyperice not between", value1, value2, "repxyperice");
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