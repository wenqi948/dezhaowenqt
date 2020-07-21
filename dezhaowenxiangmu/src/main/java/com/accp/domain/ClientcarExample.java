package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ClientcarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClientcarExample() {
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

        public Criteria andCarnoIsNull() {
            addCriterion("carno is null");
            return (Criteria) this;
        }

        public Criteria andCarnoIsNotNull() {
            addCriterion("carno is not null");
            return (Criteria) this;
        }

        public Criteria andCarnoEqualTo(String value) {
            addCriterion("carno =", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoNotEqualTo(String value) {
            addCriterion("carno <>", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoGreaterThan(String value) {
            addCriterion("carno >", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoGreaterThanOrEqualTo(String value) {
            addCriterion("carno >=", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoLessThan(String value) {
            addCriterion("carno <", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoLessThanOrEqualTo(String value) {
            addCriterion("carno <=", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoLike(String value) {
            addCriterion("carno like", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoNotLike(String value) {
            addCriterion("carno not like", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoIn(List<String> values) {
            addCriterion("carno in", values, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoNotIn(List<String> values) {
            addCriterion("carno not in", values, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoBetween(String value1, String value2) {
            addCriterion("carno between", value1, value2, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoNotBetween(String value1, String value2) {
            addCriterion("carno not between", value1, value2, "carno");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNull() {
            addCriterion("typeId is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("typeId is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(String value) {
            addCriterion("typeId =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(String value) {
            addCriterion("typeId <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(String value) {
            addCriterion("typeId >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(String value) {
            addCriterion("typeId >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(String value) {
            addCriterion("typeId <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(String value) {
            addCriterion("typeId <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLike(String value) {
            addCriterion("typeId like", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotLike(String value) {
            addCriterion("typeId not like", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<String> values) {
            addCriterion("typeId in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<String> values) {
            addCriterion("typeId not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(String value1, String value2) {
            addCriterion("typeId between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(String value1, String value2) {
            addCriterion("typeId not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andPeopleIsNull() {
            addCriterion("people is null");
            return (Criteria) this;
        }

        public Criteria andPeopleIsNotNull() {
            addCriterion("people is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleEqualTo(String value) {
            addCriterion("people =", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotEqualTo(String value) {
            addCriterion("people <>", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThan(String value) {
            addCriterion("people >", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("people >=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThan(String value) {
            addCriterion("people <", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThanOrEqualTo(String value) {
            addCriterion("people <=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLike(String value) {
            addCriterion("people like", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotLike(String value) {
            addCriterion("people not like", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleIn(List<String> values) {
            addCriterion("people in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotIn(List<String> values) {
            addCriterion("people not in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleBetween(String value1, String value2) {
            addCriterion("people between", value1, value2, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotBetween(String value1, String value2) {
            addCriterion("people not between", value1, value2, "people");
            return (Criteria) this;
        }

        public Criteria andPeoplephoneIsNull() {
            addCriterion("peoplePhone is null");
            return (Criteria) this;
        }

        public Criteria andPeoplephoneIsNotNull() {
            addCriterion("peoplePhone is not null");
            return (Criteria) this;
        }

        public Criteria andPeoplephoneEqualTo(String value) {
            addCriterion("peoplePhone =", value, "peoplephone");
            return (Criteria) this;
        }

        public Criteria andPeoplephoneNotEqualTo(String value) {
            addCriterion("peoplePhone <>", value, "peoplephone");
            return (Criteria) this;
        }

        public Criteria andPeoplephoneGreaterThan(String value) {
            addCriterion("peoplePhone >", value, "peoplephone");
            return (Criteria) this;
        }

        public Criteria andPeoplephoneGreaterThanOrEqualTo(String value) {
            addCriterion("peoplePhone >=", value, "peoplephone");
            return (Criteria) this;
        }

        public Criteria andPeoplephoneLessThan(String value) {
            addCriterion("peoplePhone <", value, "peoplephone");
            return (Criteria) this;
        }

        public Criteria andPeoplephoneLessThanOrEqualTo(String value) {
            addCriterion("peoplePhone <=", value, "peoplephone");
            return (Criteria) this;
        }

        public Criteria andPeoplephoneLike(String value) {
            addCriterion("peoplePhone like", value, "peoplephone");
            return (Criteria) this;
        }

        public Criteria andPeoplephoneNotLike(String value) {
            addCriterion("peoplePhone not like", value, "peoplephone");
            return (Criteria) this;
        }

        public Criteria andPeoplephoneIn(List<String> values) {
            addCriterion("peoplePhone in", values, "peoplephone");
            return (Criteria) this;
        }

        public Criteria andPeoplephoneNotIn(List<String> values) {
            addCriterion("peoplePhone not in", values, "peoplephone");
            return (Criteria) this;
        }

        public Criteria andPeoplephoneBetween(String value1, String value2) {
            addCriterion("peoplePhone between", value1, value2, "peoplephone");
            return (Criteria) this;
        }

        public Criteria andPeoplephoneNotBetween(String value1, String value2) {
            addCriterion("peoplePhone not between", value1, value2, "peoplephone");
            return (Criteria) this;
        }

        public Criteria andPeopledayIsNull() {
            addCriterion("peopleday is null");
            return (Criteria) this;
        }

        public Criteria andPeopledayIsNotNull() {
            addCriterion("peopleday is not null");
            return (Criteria) this;
        }

        public Criteria andPeopledayEqualTo(Date value) {
            addCriterionForJDBCDate("peopleday =", value, "peopleday");
            return (Criteria) this;
        }

        public Criteria andPeopledayNotEqualTo(Date value) {
            addCriterionForJDBCDate("peopleday <>", value, "peopleday");
            return (Criteria) this;
        }

        public Criteria andPeopledayGreaterThan(Date value) {
            addCriterionForJDBCDate("peopleday >", value, "peopleday");
            return (Criteria) this;
        }

        public Criteria andPeopledayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("peopleday >=", value, "peopleday");
            return (Criteria) this;
        }

        public Criteria andPeopledayLessThan(Date value) {
            addCriterionForJDBCDate("peopleday <", value, "peopleday");
            return (Criteria) this;
        }

        public Criteria andPeopledayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("peopleday <=", value, "peopleday");
            return (Criteria) this;
        }

        public Criteria andPeopledayIn(List<Date> values) {
            addCriterionForJDBCDate("peopleday in", values, "peopleday");
            return (Criteria) this;
        }

        public Criteria andPeopledayNotIn(List<Date> values) {
            addCriterionForJDBCDate("peopleday not in", values, "peopleday");
            return (Criteria) this;
        }

        public Criteria andPeopledayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("peopleday between", value1, value2, "peopleday");
            return (Criteria) this;
        }

        public Criteria andPeopledayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("peopleday not between", value1, value2, "peopleday");
            return (Criteria) this;
        }

        public Criteria andCarguishuIsNull() {
            addCriterion("carguishu is null");
            return (Criteria) this;
        }

        public Criteria andCarguishuIsNotNull() {
            addCriterion("carguishu is not null");
            return (Criteria) this;
        }

        public Criteria andCarguishuEqualTo(String value) {
            addCriterion("carguishu =", value, "carguishu");
            return (Criteria) this;
        }

        public Criteria andCarguishuNotEqualTo(String value) {
            addCriterion("carguishu <>", value, "carguishu");
            return (Criteria) this;
        }

        public Criteria andCarguishuGreaterThan(String value) {
            addCriterion("carguishu >", value, "carguishu");
            return (Criteria) this;
        }

        public Criteria andCarguishuGreaterThanOrEqualTo(String value) {
            addCriterion("carguishu >=", value, "carguishu");
            return (Criteria) this;
        }

        public Criteria andCarguishuLessThan(String value) {
            addCriterion("carguishu <", value, "carguishu");
            return (Criteria) this;
        }

        public Criteria andCarguishuLessThanOrEqualTo(String value) {
            addCriterion("carguishu <=", value, "carguishu");
            return (Criteria) this;
        }

        public Criteria andCarguishuLike(String value) {
            addCriterion("carguishu like", value, "carguishu");
            return (Criteria) this;
        }

        public Criteria andCarguishuNotLike(String value) {
            addCriterion("carguishu not like", value, "carguishu");
            return (Criteria) this;
        }

        public Criteria andCarguishuIn(List<String> values) {
            addCriterion("carguishu in", values, "carguishu");
            return (Criteria) this;
        }

        public Criteria andCarguishuNotIn(List<String> values) {
            addCriterion("carguishu not in", values, "carguishu");
            return (Criteria) this;
        }

        public Criteria andCarguishuBetween(String value1, String value2) {
            addCriterion("carguishu between", value1, value2, "carguishu");
            return (Criteria) this;
        }

        public Criteria andCarguishuNotBetween(String value1, String value2) {
            addCriterion("carguishu not between", value1, value2, "carguishu");
            return (Criteria) this;
        }

        public Criteria andCardaoqiIsNull() {
            addCriterion("cardaoqi is null");
            return (Criteria) this;
        }

        public Criteria andCardaoqiIsNotNull() {
            addCriterion("cardaoqi is not null");
            return (Criteria) this;
        }

        public Criteria andCardaoqiEqualTo(Date value) {
            addCriterionForJDBCDate("cardaoqi =", value, "cardaoqi");
            return (Criteria) this;
        }

        public Criteria andCardaoqiNotEqualTo(Date value) {
            addCriterionForJDBCDate("cardaoqi <>", value, "cardaoqi");
            return (Criteria) this;
        }

        public Criteria andCardaoqiGreaterThan(Date value) {
            addCriterionForJDBCDate("cardaoqi >", value, "cardaoqi");
            return (Criteria) this;
        }

        public Criteria andCardaoqiGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cardaoqi >=", value, "cardaoqi");
            return (Criteria) this;
        }

        public Criteria andCardaoqiLessThan(Date value) {
            addCriterionForJDBCDate("cardaoqi <", value, "cardaoqi");
            return (Criteria) this;
        }

        public Criteria andCardaoqiLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cardaoqi <=", value, "cardaoqi");
            return (Criteria) this;
        }

        public Criteria andCardaoqiIn(List<Date> values) {
            addCriterionForJDBCDate("cardaoqi in", values, "cardaoqi");
            return (Criteria) this;
        }

        public Criteria andCardaoqiNotIn(List<Date> values) {
            addCriterionForJDBCDate("cardaoqi not in", values, "cardaoqi");
            return (Criteria) this;
        }

        public Criteria andCardaoqiBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cardaoqi between", value1, value2, "cardaoqi");
            return (Criteria) this;
        }

        public Criteria andCardaoqiNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cardaoqi not between", value1, value2, "cardaoqi");
            return (Criteria) this;
        }

        public Criteria andChejiahaoIsNull() {
            addCriterion("chejiahao is null");
            return (Criteria) this;
        }

        public Criteria andChejiahaoIsNotNull() {
            addCriterion("chejiahao is not null");
            return (Criteria) this;
        }

        public Criteria andChejiahaoEqualTo(String value) {
            addCriterion("chejiahao =", value, "chejiahao");
            return (Criteria) this;
        }

        public Criteria andChejiahaoNotEqualTo(String value) {
            addCriterion("chejiahao <>", value, "chejiahao");
            return (Criteria) this;
        }

        public Criteria andChejiahaoGreaterThan(String value) {
            addCriterion("chejiahao >", value, "chejiahao");
            return (Criteria) this;
        }

        public Criteria andChejiahaoGreaterThanOrEqualTo(String value) {
            addCriterion("chejiahao >=", value, "chejiahao");
            return (Criteria) this;
        }

        public Criteria andChejiahaoLessThan(String value) {
            addCriterion("chejiahao <", value, "chejiahao");
            return (Criteria) this;
        }

        public Criteria andChejiahaoLessThanOrEqualTo(String value) {
            addCriterion("chejiahao <=", value, "chejiahao");
            return (Criteria) this;
        }

        public Criteria andChejiahaoLike(String value) {
            addCriterion("chejiahao like", value, "chejiahao");
            return (Criteria) this;
        }

        public Criteria andChejiahaoNotLike(String value) {
            addCriterion("chejiahao not like", value, "chejiahao");
            return (Criteria) this;
        }

        public Criteria andChejiahaoIn(List<String> values) {
            addCriterion("chejiahao in", values, "chejiahao");
            return (Criteria) this;
        }

        public Criteria andChejiahaoNotIn(List<String> values) {
            addCriterion("chejiahao not in", values, "chejiahao");
            return (Criteria) this;
        }

        public Criteria andChejiahaoBetween(String value1, String value2) {
            addCriterion("chejiahao between", value1, value2, "chejiahao");
            return (Criteria) this;
        }

        public Criteria andChejiahaoNotBetween(String value1, String value2) {
            addCriterion("chejiahao not between", value1, value2, "chejiahao");
            return (Criteria) this;
        }

        public Criteria andFadongjiIsNull() {
            addCriterion("fadongji is null");
            return (Criteria) this;
        }

        public Criteria andFadongjiIsNotNull() {
            addCriterion("fadongji is not null");
            return (Criteria) this;
        }

        public Criteria andFadongjiEqualTo(String value) {
            addCriterion("fadongji =", value, "fadongji");
            return (Criteria) this;
        }

        public Criteria andFadongjiNotEqualTo(String value) {
            addCriterion("fadongji <>", value, "fadongji");
            return (Criteria) this;
        }

        public Criteria andFadongjiGreaterThan(String value) {
            addCriterion("fadongji >", value, "fadongji");
            return (Criteria) this;
        }

        public Criteria andFadongjiGreaterThanOrEqualTo(String value) {
            addCriterion("fadongji >=", value, "fadongji");
            return (Criteria) this;
        }

        public Criteria andFadongjiLessThan(String value) {
            addCriterion("fadongji <", value, "fadongji");
            return (Criteria) this;
        }

        public Criteria andFadongjiLessThanOrEqualTo(String value) {
            addCriterion("fadongji <=", value, "fadongji");
            return (Criteria) this;
        }

        public Criteria andFadongjiLike(String value) {
            addCriterion("fadongji like", value, "fadongji");
            return (Criteria) this;
        }

        public Criteria andFadongjiNotLike(String value) {
            addCriterion("fadongji not like", value, "fadongji");
            return (Criteria) this;
        }

        public Criteria andFadongjiIn(List<String> values) {
            addCriterion("fadongji in", values, "fadongji");
            return (Criteria) this;
        }

        public Criteria andFadongjiNotIn(List<String> values) {
            addCriterion("fadongji not in", values, "fadongji");
            return (Criteria) this;
        }

        public Criteria andFadongjiBetween(String value1, String value2) {
            addCriterion("fadongji between", value1, value2, "fadongji");
            return (Criteria) this;
        }

        public Criteria andFadongjiNotBetween(String value1, String value2) {
            addCriterion("fadongji not between", value1, value2, "fadongji");
            return (Criteria) this;
        }

        public Criteria andCarniankuanIsNull() {
            addCriterion("carniankuan is null");
            return (Criteria) this;
        }

        public Criteria andCarniankuanIsNotNull() {
            addCriterion("carniankuan is not null");
            return (Criteria) this;
        }

        public Criteria andCarniankuanEqualTo(Integer value) {
            addCriterion("carniankuan =", value, "carniankuan");
            return (Criteria) this;
        }

        public Criteria andCarniankuanNotEqualTo(Integer value) {
            addCriterion("carniankuan <>", value, "carniankuan");
            return (Criteria) this;
        }

        public Criteria andCarniankuanGreaterThan(Integer value) {
            addCriterion("carniankuan >", value, "carniankuan");
            return (Criteria) this;
        }

        public Criteria andCarniankuanGreaterThanOrEqualTo(Integer value) {
            addCriterion("carniankuan >=", value, "carniankuan");
            return (Criteria) this;
        }

        public Criteria andCarniankuanLessThan(Integer value) {
            addCriterion("carniankuan <", value, "carniankuan");
            return (Criteria) this;
        }

        public Criteria andCarniankuanLessThanOrEqualTo(Integer value) {
            addCriterion("carniankuan <=", value, "carniankuan");
            return (Criteria) this;
        }

        public Criteria andCarniankuanIn(List<Integer> values) {
            addCriterion("carniankuan in", values, "carniankuan");
            return (Criteria) this;
        }

        public Criteria andCarniankuanNotIn(List<Integer> values) {
            addCriterion("carniankuan not in", values, "carniankuan");
            return (Criteria) this;
        }

        public Criteria andCarniankuanBetween(Integer value1, Integer value2) {
            addCriterion("carniankuan between", value1, value2, "carniankuan");
            return (Criteria) this;
        }

        public Criteria andCarniankuanNotBetween(Integer value1, Integer value2) {
            addCriterion("carniankuan not between", value1, value2, "carniankuan");
            return (Criteria) this;
        }

        public Criteria andLichengIsNull() {
            addCriterion("licheng is null");
            return (Criteria) this;
        }

        public Criteria andLichengIsNotNull() {
            addCriterion("licheng is not null");
            return (Criteria) this;
        }

        public Criteria andLichengEqualTo(Integer value) {
            addCriterion("licheng =", value, "licheng");
            return (Criteria) this;
        }

        public Criteria andLichengNotEqualTo(Integer value) {
            addCriterion("licheng <>", value, "licheng");
            return (Criteria) this;
        }

        public Criteria andLichengGreaterThan(Integer value) {
            addCriterion("licheng >", value, "licheng");
            return (Criteria) this;
        }

        public Criteria andLichengGreaterThanOrEqualTo(Integer value) {
            addCriterion("licheng >=", value, "licheng");
            return (Criteria) this;
        }

        public Criteria andLichengLessThan(Integer value) {
            addCriterion("licheng <", value, "licheng");
            return (Criteria) this;
        }

        public Criteria andLichengLessThanOrEqualTo(Integer value) {
            addCriterion("licheng <=", value, "licheng");
            return (Criteria) this;
        }

        public Criteria andLichengIn(List<Integer> values) {
            addCriterion("licheng in", values, "licheng");
            return (Criteria) this;
        }

        public Criteria andLichengNotIn(List<Integer> values) {
            addCriterion("licheng not in", values, "licheng");
            return (Criteria) this;
        }

        public Criteria andLichengBetween(Integer value1, Integer value2) {
            addCriterion("licheng between", value1, value2, "licheng");
            return (Criteria) this;
        }

        public Criteria andLichengNotBetween(Integer value1, Integer value2) {
            addCriterion("licheng not between", value1, value2, "licheng");
            return (Criteria) this;
        }

        public Criteria andFadongjippIsNull() {
            addCriterion("fadongjipp is null");
            return (Criteria) this;
        }

        public Criteria andFadongjippIsNotNull() {
            addCriterion("fadongjipp is not null");
            return (Criteria) this;
        }

        public Criteria andFadongjippEqualTo(String value) {
            addCriterion("fadongjipp =", value, "fadongjipp");
            return (Criteria) this;
        }

        public Criteria andFadongjippNotEqualTo(String value) {
            addCriterion("fadongjipp <>", value, "fadongjipp");
            return (Criteria) this;
        }

        public Criteria andFadongjippGreaterThan(String value) {
            addCriterion("fadongjipp >", value, "fadongjipp");
            return (Criteria) this;
        }

        public Criteria andFadongjippGreaterThanOrEqualTo(String value) {
            addCriterion("fadongjipp >=", value, "fadongjipp");
            return (Criteria) this;
        }

        public Criteria andFadongjippLessThan(String value) {
            addCriterion("fadongjipp <", value, "fadongjipp");
            return (Criteria) this;
        }

        public Criteria andFadongjippLessThanOrEqualTo(String value) {
            addCriterion("fadongjipp <=", value, "fadongjipp");
            return (Criteria) this;
        }

        public Criteria andFadongjippLike(String value) {
            addCriterion("fadongjipp like", value, "fadongjipp");
            return (Criteria) this;
        }

        public Criteria andFadongjippNotLike(String value) {
            addCriterion("fadongjipp not like", value, "fadongjipp");
            return (Criteria) this;
        }

        public Criteria andFadongjippIn(List<String> values) {
            addCriterion("fadongjipp in", values, "fadongjipp");
            return (Criteria) this;
        }

        public Criteria andFadongjippNotIn(List<String> values) {
            addCriterion("fadongjipp not in", values, "fadongjipp");
            return (Criteria) this;
        }

        public Criteria andFadongjippBetween(String value1, String value2) {
            addCriterion("fadongjipp between", value1, value2, "fadongjipp");
            return (Criteria) this;
        }

        public Criteria andFadongjippNotBetween(String value1, String value2) {
            addCriterion("fadongjipp not between", value1, value2, "fadongjipp");
            return (Criteria) this;
        }

        public Criteria andZaizhongIsNull() {
            addCriterion("zaizhong is null");
            return (Criteria) this;
        }

        public Criteria andZaizhongIsNotNull() {
            addCriterion("zaizhong is not null");
            return (Criteria) this;
        }

        public Criteria andZaizhongEqualTo(Float value) {
            addCriterion("zaizhong =", value, "zaizhong");
            return (Criteria) this;
        }

        public Criteria andZaizhongNotEqualTo(Float value) {
            addCriterion("zaizhong <>", value, "zaizhong");
            return (Criteria) this;
        }

        public Criteria andZaizhongGreaterThan(Float value) {
            addCriterion("zaizhong >", value, "zaizhong");
            return (Criteria) this;
        }

        public Criteria andZaizhongGreaterThanOrEqualTo(Float value) {
            addCriterion("zaizhong >=", value, "zaizhong");
            return (Criteria) this;
        }

        public Criteria andZaizhongLessThan(Float value) {
            addCriterion("zaizhong <", value, "zaizhong");
            return (Criteria) this;
        }

        public Criteria andZaizhongLessThanOrEqualTo(Float value) {
            addCriterion("zaizhong <=", value, "zaizhong");
            return (Criteria) this;
        }

        public Criteria andZaizhongIn(List<Float> values) {
            addCriterion("zaizhong in", values, "zaizhong");
            return (Criteria) this;
        }

        public Criteria andZaizhongNotIn(List<Float> values) {
            addCriterion("zaizhong not in", values, "zaizhong");
            return (Criteria) this;
        }

        public Criteria andZaizhongBetween(Float value1, Float value2) {
            addCriterion("zaizhong between", value1, value2, "zaizhong");
            return (Criteria) this;
        }

        public Criteria andZaizhongNotBetween(Float value1, Float value2) {
            addCriterion("zaizhong not between", value1, value2, "zaizhong");
            return (Criteria) this;
        }

        public Criteria andBuydayIsNull() {
            addCriterion("buyday is null");
            return (Criteria) this;
        }

        public Criteria andBuydayIsNotNull() {
            addCriterion("buyday is not null");
            return (Criteria) this;
        }

        public Criteria andBuydayEqualTo(Date value) {
            addCriterionForJDBCDate("buyday =", value, "buyday");
            return (Criteria) this;
        }

        public Criteria andBuydayNotEqualTo(Date value) {
            addCriterionForJDBCDate("buyday <>", value, "buyday");
            return (Criteria) this;
        }

        public Criteria andBuydayGreaterThan(Date value) {
            addCriterionForJDBCDate("buyday >", value, "buyday");
            return (Criteria) this;
        }

        public Criteria andBuydayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("buyday >=", value, "buyday");
            return (Criteria) this;
        }

        public Criteria andBuydayLessThan(Date value) {
            addCriterionForJDBCDate("buyday <", value, "buyday");
            return (Criteria) this;
        }

        public Criteria andBuydayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("buyday <=", value, "buyday");
            return (Criteria) this;
        }

        public Criteria andBuydayIn(List<Date> values) {
            addCriterionForJDBCDate("buyday in", values, "buyday");
            return (Criteria) this;
        }

        public Criteria andBuydayNotIn(List<Date> values) {
            addCriterionForJDBCDate("buyday not in", values, "buyday");
            return (Criteria) this;
        }

        public Criteria andBuydayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("buyday between", value1, value2, "buyday");
            return (Criteria) this;
        }

        public Criteria andBuydayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("buyday not between", value1, value2, "buyday");
            return (Criteria) this;
        }

        public Criteria andShangpaidayIsNull() {
            addCriterion("shangpaiday is null");
            return (Criteria) this;
        }

        public Criteria andShangpaidayIsNotNull() {
            addCriterion("shangpaiday is not null");
            return (Criteria) this;
        }

        public Criteria andShangpaidayEqualTo(Date value) {
            addCriterionForJDBCDate("shangpaiday =", value, "shangpaiday");
            return (Criteria) this;
        }

        public Criteria andShangpaidayNotEqualTo(Date value) {
            addCriterionForJDBCDate("shangpaiday <>", value, "shangpaiday");
            return (Criteria) this;
        }

        public Criteria andShangpaidayGreaterThan(Date value) {
            addCriterionForJDBCDate("shangpaiday >", value, "shangpaiday");
            return (Criteria) this;
        }

        public Criteria andShangpaidayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shangpaiday >=", value, "shangpaiday");
            return (Criteria) this;
        }

        public Criteria andShangpaidayLessThan(Date value) {
            addCriterionForJDBCDate("shangpaiday <", value, "shangpaiday");
            return (Criteria) this;
        }

        public Criteria andShangpaidayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shangpaiday <=", value, "shangpaiday");
            return (Criteria) this;
        }

        public Criteria andShangpaidayIn(List<Date> values) {
            addCriterionForJDBCDate("shangpaiday in", values, "shangpaiday");
            return (Criteria) this;
        }

        public Criteria andShangpaidayNotIn(List<Date> values) {
            addCriterionForJDBCDate("shangpaiday not in", values, "shangpaiday");
            return (Criteria) this;
        }

        public Criteria andShangpaidayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shangpaiday between", value1, value2, "shangpaiday");
            return (Criteria) this;
        }

        public Criteria andShangpaidayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shangpaiday not between", value1, value2, "shangpaiday");
            return (Criteria) this;
        }

        public Criteria andChejianIsNull() {
            addCriterion("chejian is null");
            return (Criteria) this;
        }

        public Criteria andChejianIsNotNull() {
            addCriterion("chejian is not null");
            return (Criteria) this;
        }

        public Criteria andChejianEqualTo(Date value) {
            addCriterionForJDBCDate("chejian =", value, "chejian");
            return (Criteria) this;
        }

        public Criteria andChejianNotEqualTo(Date value) {
            addCriterionForJDBCDate("chejian <>", value, "chejian");
            return (Criteria) this;
        }

        public Criteria andChejianGreaterThan(Date value) {
            addCriterionForJDBCDate("chejian >", value, "chejian");
            return (Criteria) this;
        }

        public Criteria andChejianGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("chejian >=", value, "chejian");
            return (Criteria) this;
        }

        public Criteria andChejianLessThan(Date value) {
            addCriterionForJDBCDate("chejian <", value, "chejian");
            return (Criteria) this;
        }

        public Criteria andChejianLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("chejian <=", value, "chejian");
            return (Criteria) this;
        }

        public Criteria andChejianIn(List<Date> values) {
            addCriterionForJDBCDate("chejian in", values, "chejian");
            return (Criteria) this;
        }

        public Criteria andChejianNotIn(List<Date> values) {
            addCriterionForJDBCDate("chejian not in", values, "chejian");
            return (Criteria) this;
        }

        public Criteria andChejianBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("chejian between", value1, value2, "chejian");
            return (Criteria) this;
        }

        public Criteria andChejianNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("chejian not between", value1, value2, "chejian");
            return (Criteria) this;
        }

        public Criteria andRanyouIsNull() {
            addCriterion("ranyou is null");
            return (Criteria) this;
        }

        public Criteria andRanyouIsNotNull() {
            addCriterion("ranyou is not null");
            return (Criteria) this;
        }

        public Criteria andRanyouEqualTo(String value) {
            addCriterion("ranyou =", value, "ranyou");
            return (Criteria) this;
        }

        public Criteria andRanyouNotEqualTo(String value) {
            addCriterion("ranyou <>", value, "ranyou");
            return (Criteria) this;
        }

        public Criteria andRanyouGreaterThan(String value) {
            addCriterion("ranyou >", value, "ranyou");
            return (Criteria) this;
        }

        public Criteria andRanyouGreaterThanOrEqualTo(String value) {
            addCriterion("ranyou >=", value, "ranyou");
            return (Criteria) this;
        }

        public Criteria andRanyouLessThan(String value) {
            addCriterion("ranyou <", value, "ranyou");
            return (Criteria) this;
        }

        public Criteria andRanyouLessThanOrEqualTo(String value) {
            addCriterion("ranyou <=", value, "ranyou");
            return (Criteria) this;
        }

        public Criteria andRanyouLike(String value) {
            addCriterion("ranyou like", value, "ranyou");
            return (Criteria) this;
        }

        public Criteria andRanyouNotLike(String value) {
            addCriterion("ranyou not like", value, "ranyou");
            return (Criteria) this;
        }

        public Criteria andRanyouIn(List<String> values) {
            addCriterion("ranyou in", values, "ranyou");
            return (Criteria) this;
        }

        public Criteria andRanyouNotIn(List<String> values) {
            addCriterion("ranyou not in", values, "ranyou");
            return (Criteria) this;
        }

        public Criteria andRanyouBetween(String value1, String value2) {
            addCriterion("ranyou between", value1, value2, "ranyou");
            return (Criteria) this;
        }

        public Criteria andRanyouNotBetween(String value1, String value2) {
            addCriterion("ranyou not between", value1, value2, "ranyou");
            return (Criteria) this;
        }

        public Criteria andChexiIsNull() {
            addCriterion("chexi is null");
            return (Criteria) this;
        }

        public Criteria andChexiIsNotNull() {
            addCriterion("chexi is not null");
            return (Criteria) this;
        }

        public Criteria andChexiEqualTo(String value) {
            addCriterion("chexi =", value, "chexi");
            return (Criteria) this;
        }

        public Criteria andChexiNotEqualTo(String value) {
            addCriterion("chexi <>", value, "chexi");
            return (Criteria) this;
        }

        public Criteria andChexiGreaterThan(String value) {
            addCriterion("chexi >", value, "chexi");
            return (Criteria) this;
        }

        public Criteria andChexiGreaterThanOrEqualTo(String value) {
            addCriterion("chexi >=", value, "chexi");
            return (Criteria) this;
        }

        public Criteria andChexiLessThan(String value) {
            addCriterion("chexi <", value, "chexi");
            return (Criteria) this;
        }

        public Criteria andChexiLessThanOrEqualTo(String value) {
            addCriterion("chexi <=", value, "chexi");
            return (Criteria) this;
        }

        public Criteria andChexiLike(String value) {
            addCriterion("chexi like", value, "chexi");
            return (Criteria) this;
        }

        public Criteria andChexiNotLike(String value) {
            addCriterion("chexi not like", value, "chexi");
            return (Criteria) this;
        }

        public Criteria andChexiIn(List<String> values) {
            addCriterion("chexi in", values, "chexi");
            return (Criteria) this;
        }

        public Criteria andChexiNotIn(List<String> values) {
            addCriterion("chexi not in", values, "chexi");
            return (Criteria) this;
        }

        public Criteria andChexiBetween(String value1, String value2) {
            addCriterion("chexi between", value1, value2, "chexi");
            return (Criteria) this;
        }

        public Criteria andChexiNotBetween(String value1, String value2) {
            addCriterion("chexi not between", value1, value2, "chexi");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangIsNull() {
            addCriterion("jiaoqiang is null");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangIsNotNull() {
            addCriterion("jiaoqiang is not null");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangEqualTo(String value) {
            addCriterion("jiaoqiang =", value, "jiaoqiang");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangNotEqualTo(String value) {
            addCriterion("jiaoqiang <>", value, "jiaoqiang");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangGreaterThan(String value) {
            addCriterion("jiaoqiang >", value, "jiaoqiang");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangGreaterThanOrEqualTo(String value) {
            addCriterion("jiaoqiang >=", value, "jiaoqiang");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangLessThan(String value) {
            addCriterion("jiaoqiang <", value, "jiaoqiang");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangLessThanOrEqualTo(String value) {
            addCriterion("jiaoqiang <=", value, "jiaoqiang");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangLike(String value) {
            addCriterion("jiaoqiang like", value, "jiaoqiang");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangNotLike(String value) {
            addCriterion("jiaoqiang not like", value, "jiaoqiang");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangIn(List<String> values) {
            addCriterion("jiaoqiang in", values, "jiaoqiang");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangNotIn(List<String> values) {
            addCriterion("jiaoqiang not in", values, "jiaoqiang");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangBetween(String value1, String value2) {
            addCriterion("jiaoqiang between", value1, value2, "jiaoqiang");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangNotBetween(String value1, String value2) {
            addCriterion("jiaoqiang not between", value1, value2, "jiaoqiang");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangdayIsNull() {
            addCriterion("jiaoqiangday is null");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangdayIsNotNull() {
            addCriterion("jiaoqiangday is not null");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangdayEqualTo(Date value) {
            addCriterionForJDBCDate("jiaoqiangday =", value, "jiaoqiangday");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("jiaoqiangday <>", value, "jiaoqiangday");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangdayGreaterThan(Date value) {
            addCriterionForJDBCDate("jiaoqiangday >", value, "jiaoqiangday");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jiaoqiangday >=", value, "jiaoqiangday");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangdayLessThan(Date value) {
            addCriterionForJDBCDate("jiaoqiangday <", value, "jiaoqiangday");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jiaoqiangday <=", value, "jiaoqiangday");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangdayIn(List<Date> values) {
            addCriterionForJDBCDate("jiaoqiangday in", values, "jiaoqiangday");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("jiaoqiangday not in", values, "jiaoqiangday");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jiaoqiangday between", value1, value2, "jiaoqiangday");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jiaoqiangday not between", value1, value2, "jiaoqiangday");
            return (Criteria) this;
        }

        public Criteria andShangyeIsNull() {
            addCriterion("shangye is null");
            return (Criteria) this;
        }

        public Criteria andShangyeIsNotNull() {
            addCriterion("shangye is not null");
            return (Criteria) this;
        }

        public Criteria andShangyeEqualTo(String value) {
            addCriterion("shangye =", value, "shangye");
            return (Criteria) this;
        }

        public Criteria andShangyeNotEqualTo(String value) {
            addCriterion("shangye <>", value, "shangye");
            return (Criteria) this;
        }

        public Criteria andShangyeGreaterThan(String value) {
            addCriterion("shangye >", value, "shangye");
            return (Criteria) this;
        }

        public Criteria andShangyeGreaterThanOrEqualTo(String value) {
            addCriterion("shangye >=", value, "shangye");
            return (Criteria) this;
        }

        public Criteria andShangyeLessThan(String value) {
            addCriterion("shangye <", value, "shangye");
            return (Criteria) this;
        }

        public Criteria andShangyeLessThanOrEqualTo(String value) {
            addCriterion("shangye <=", value, "shangye");
            return (Criteria) this;
        }

        public Criteria andShangyeLike(String value) {
            addCriterion("shangye like", value, "shangye");
            return (Criteria) this;
        }

        public Criteria andShangyeNotLike(String value) {
            addCriterion("shangye not like", value, "shangye");
            return (Criteria) this;
        }

        public Criteria andShangyeIn(List<String> values) {
            addCriterion("shangye in", values, "shangye");
            return (Criteria) this;
        }

        public Criteria andShangyeNotIn(List<String> values) {
            addCriterion("shangye not in", values, "shangye");
            return (Criteria) this;
        }

        public Criteria andShangyeBetween(String value1, String value2) {
            addCriterion("shangye between", value1, value2, "shangye");
            return (Criteria) this;
        }

        public Criteria andShangyeNotBetween(String value1, String value2) {
            addCriterion("shangye not between", value1, value2, "shangye");
            return (Criteria) this;
        }

        public Criteria andShangyedayIsNull() {
            addCriterion("shangyeday is null");
            return (Criteria) this;
        }

        public Criteria andShangyedayIsNotNull() {
            addCriterion("shangyeday is not null");
            return (Criteria) this;
        }

        public Criteria andShangyedayEqualTo(Date value) {
            addCriterionForJDBCDate("shangyeday =", value, "shangyeday");
            return (Criteria) this;
        }

        public Criteria andShangyedayNotEqualTo(Date value) {
            addCriterionForJDBCDate("shangyeday <>", value, "shangyeday");
            return (Criteria) this;
        }

        public Criteria andShangyedayGreaterThan(Date value) {
            addCriterionForJDBCDate("shangyeday >", value, "shangyeday");
            return (Criteria) this;
        }

        public Criteria andShangyedayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shangyeday >=", value, "shangyeday");
            return (Criteria) this;
        }

        public Criteria andShangyedayLessThan(Date value) {
            addCriterionForJDBCDate("shangyeday <", value, "shangyeday");
            return (Criteria) this;
        }

        public Criteria andShangyedayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shangyeday <=", value, "shangyeday");
            return (Criteria) this;
        }

        public Criteria andShangyedayIn(List<Date> values) {
            addCriterionForJDBCDate("shangyeday in", values, "shangyeday");
            return (Criteria) this;
        }

        public Criteria andShangyedayNotIn(List<Date> values) {
            addCriterionForJDBCDate("shangyeday not in", values, "shangyeday");
            return (Criteria) this;
        }

        public Criteria andShangyedayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shangyeday between", value1, value2, "shangyeday");
            return (Criteria) this;
        }

        public Criteria andShangyedayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shangyeday not between", value1, value2, "shangyeday");
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