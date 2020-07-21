package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopExample() {
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

        public Criteria andShopidIsNull() {
            addCriterion("shopid is null");
            return (Criteria) this;
        }

        public Criteria andShopidIsNotNull() {
            addCriterion("shopid is not null");
            return (Criteria) this;
        }

        public Criteria andShopidEqualTo(String value) {
            addCriterion("shopid =", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotEqualTo(String value) {
            addCriterion("shopid <>", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThan(String value) {
            addCriterion("shopid >", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThanOrEqualTo(String value) {
            addCriterion("shopid >=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThan(String value) {
            addCriterion("shopid <", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThanOrEqualTo(String value) {
            addCriterion("shopid <=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLike(String value) {
            addCriterion("shopid like", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotLike(String value) {
            addCriterion("shopid not like", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidIn(List<String> values) {
            addCriterion("shopid in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotIn(List<String> values) {
            addCriterion("shopid not in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidBetween(String value1, String value2) {
            addCriterion("shopid between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotBetween(String value1, String value2) {
            addCriterion("shopid not between", value1, value2, "shopid");
            return (Criteria) this;
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

        public Criteria andStateidIsNull() {
            addCriterion("stateid is null");
            return (Criteria) this;
        }

        public Criteria andStateidIsNotNull() {
            addCriterion("stateid is not null");
            return (Criteria) this;
        }

        public Criteria andStateidEqualTo(Integer value) {
            addCriterion("stateid =", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidNotEqualTo(Integer value) {
            addCriterion("stateid <>", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidGreaterThan(Integer value) {
            addCriterion("stateid >", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stateid >=", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidLessThan(Integer value) {
            addCriterion("stateid <", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidLessThanOrEqualTo(Integer value) {
            addCriterion("stateid <=", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidIn(List<Integer> values) {
            addCriterion("stateid in", values, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidNotIn(List<Integer> values) {
            addCriterion("stateid not in", values, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidBetween(Integer value1, Integer value2) {
            addCriterion("stateid between", value1, value2, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidNotBetween(Integer value1, Integer value2) {
            addCriterion("stateid not between", value1, value2, "stateid");
            return (Criteria) this;
        }

        public Criteria andStoreidIsNull() {
            addCriterion("storeid is null");
            return (Criteria) this;
        }

        public Criteria andStoreidIsNotNull() {
            addCriterion("storeid is not null");
            return (Criteria) this;
        }

        public Criteria andStoreidEqualTo(String value) {
            addCriterion("storeid =", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotEqualTo(String value) {
            addCriterion("storeid <>", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidGreaterThan(String value) {
            addCriterion("storeid >", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidGreaterThanOrEqualTo(String value) {
            addCriterion("storeid >=", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLessThan(String value) {
            addCriterion("storeid <", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLessThanOrEqualTo(String value) {
            addCriterion("storeid <=", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLike(String value) {
            addCriterion("storeid like", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotLike(String value) {
            addCriterion("storeid not like", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidIn(List<String> values) {
            addCriterion("storeid in", values, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotIn(List<String> values) {
            addCriterion("storeid not in", values, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidBetween(String value1, String value2) {
            addCriterion("storeid between", value1, value2, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotBetween(String value1, String value2) {
            addCriterion("storeid not between", value1, value2, "storeid");
            return (Criteria) this;
        }

        public Criteria andUnitidIsNull() {
            addCriterion("unitid is null");
            return (Criteria) this;
        }

        public Criteria andUnitidIsNotNull() {
            addCriterion("unitid is not null");
            return (Criteria) this;
        }

        public Criteria andUnitidEqualTo(Integer value) {
            addCriterion("unitid =", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotEqualTo(Integer value) {
            addCriterion("unitid <>", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidGreaterThan(Integer value) {
            addCriterion("unitid >", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("unitid >=", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidLessThan(Integer value) {
            addCriterion("unitid <", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidLessThanOrEqualTo(Integer value) {
            addCriterion("unitid <=", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidIn(List<Integer> values) {
            addCriterion("unitid in", values, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotIn(List<Integer> values) {
            addCriterion("unitid not in", values, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidBetween(Integer value1, Integer value2) {
            addCriterion("unitid between", value1, value2, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotBetween(Integer value1, Integer value2) {
            addCriterion("unitid not between", value1, value2, "unitid");
            return (Criteria) this;
        }

        public Criteria andGidIsNull() {
            addCriterion("gid is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("gid is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(Integer value) {
            addCriterion("gid =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(Integer value) {
            addCriterion("gid <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(Integer value) {
            addCriterion("gid >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gid >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(Integer value) {
            addCriterion("gid <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(Integer value) {
            addCriterion("gid <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<Integer> values) {
            addCriterion("gid in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<Integer> values) {
            addCriterion("gid not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(Integer value1, Integer value2) {
            addCriterion("gid between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(Integer value1, Integer value2) {
            addCriterion("gid not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andShopnameIsNull() {
            addCriterion("shopname is null");
            return (Criteria) this;
        }

        public Criteria andShopnameIsNotNull() {
            addCriterion("shopname is not null");
            return (Criteria) this;
        }

        public Criteria andShopnameEqualTo(String value) {
            addCriterion("shopname =", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotEqualTo(String value) {
            addCriterion("shopname <>", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThan(String value) {
            addCriterion("shopname >", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThanOrEqualTo(String value) {
            addCriterion("shopname >=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThan(String value) {
            addCriterion("shopname <", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThanOrEqualTo(String value) {
            addCriterion("shopname <=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLike(String value) {
            addCriterion("shopname like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotLike(String value) {
            addCriterion("shopname not like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameIn(List<String> values) {
            addCriterion("shopname in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotIn(List<String> values) {
            addCriterion("shopname not in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameBetween(String value1, String value2) {
            addCriterion("shopname between", value1, value2, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotBetween(String value1, String value2) {
            addCriterion("shopname not between", value1, value2, "shopname");
            return (Criteria) this;
        }

        public Criteria andSbrandIsNull() {
            addCriterion("sBrand is null");
            return (Criteria) this;
        }

        public Criteria andSbrandIsNotNull() {
            addCriterion("sBrand is not null");
            return (Criteria) this;
        }

        public Criteria andSbrandEqualTo(String value) {
            addCriterion("sBrand =", value, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSbrandNotEqualTo(String value) {
            addCriterion("sBrand <>", value, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSbrandGreaterThan(String value) {
            addCriterion("sBrand >", value, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSbrandGreaterThanOrEqualTo(String value) {
            addCriterion("sBrand >=", value, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSbrandLessThan(String value) {
            addCriterion("sBrand <", value, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSbrandLessThanOrEqualTo(String value) {
            addCriterion("sBrand <=", value, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSbrandLike(String value) {
            addCriterion("sBrand like", value, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSbrandNotLike(String value) {
            addCriterion("sBrand not like", value, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSbrandIn(List<String> values) {
            addCriterion("sBrand in", values, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSbrandNotIn(List<String> values) {
            addCriterion("sBrand not in", values, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSbrandBetween(String value1, String value2) {
            addCriterion("sBrand between", value1, value2, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSbrandNotBetween(String value1, String value2) {
            addCriterion("sBrand not between", value1, value2, "sbrand");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Integer value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Integer value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Integer value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Integer value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Integer value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Integer> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Integer> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Integer value1, Integer value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andPictrueurlIsNull() {
            addCriterion("pictrueUrl is null");
            return (Criteria) this;
        }

        public Criteria andPictrueurlIsNotNull() {
            addCriterion("pictrueUrl is not null");
            return (Criteria) this;
        }

        public Criteria andPictrueurlEqualTo(String value) {
            addCriterion("pictrueUrl =", value, "pictrueurl");
            return (Criteria) this;
        }

        public Criteria andPictrueurlNotEqualTo(String value) {
            addCriterion("pictrueUrl <>", value, "pictrueurl");
            return (Criteria) this;
        }

        public Criteria andPictrueurlGreaterThan(String value) {
            addCriterion("pictrueUrl >", value, "pictrueurl");
            return (Criteria) this;
        }

        public Criteria andPictrueurlGreaterThanOrEqualTo(String value) {
            addCriterion("pictrueUrl >=", value, "pictrueurl");
            return (Criteria) this;
        }

        public Criteria andPictrueurlLessThan(String value) {
            addCriterion("pictrueUrl <", value, "pictrueurl");
            return (Criteria) this;
        }

        public Criteria andPictrueurlLessThanOrEqualTo(String value) {
            addCriterion("pictrueUrl <=", value, "pictrueurl");
            return (Criteria) this;
        }

        public Criteria andPictrueurlLike(String value) {
            addCriterion("pictrueUrl like", value, "pictrueurl");
            return (Criteria) this;
        }

        public Criteria andPictrueurlNotLike(String value) {
            addCriterion("pictrueUrl not like", value, "pictrueurl");
            return (Criteria) this;
        }

        public Criteria andPictrueurlIn(List<String> values) {
            addCriterion("pictrueUrl in", values, "pictrueurl");
            return (Criteria) this;
        }

        public Criteria andPictrueurlNotIn(List<String> values) {
            addCriterion("pictrueUrl not in", values, "pictrueurl");
            return (Criteria) this;
        }

        public Criteria andPictrueurlBetween(String value1, String value2) {
            addCriterion("pictrueUrl between", value1, value2, "pictrueurl");
            return (Criteria) this;
        }

        public Criteria andPictrueurlNotBetween(String value1, String value2) {
            addCriterion("pictrueUrl not between", value1, value2, "pictrueurl");
            return (Criteria) this;
        }

        public Criteria andStockpriceIsNull() {
            addCriterion("stockprice is null");
            return (Criteria) this;
        }

        public Criteria andStockpriceIsNotNull() {
            addCriterion("stockprice is not null");
            return (Criteria) this;
        }

        public Criteria andStockpriceEqualTo(Float value) {
            addCriterion("stockprice =", value, "stockprice");
            return (Criteria) this;
        }

        public Criteria andStockpriceNotEqualTo(Float value) {
            addCriterion("stockprice <>", value, "stockprice");
            return (Criteria) this;
        }

        public Criteria andStockpriceGreaterThan(Float value) {
            addCriterion("stockprice >", value, "stockprice");
            return (Criteria) this;
        }

        public Criteria andStockpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("stockprice >=", value, "stockprice");
            return (Criteria) this;
        }

        public Criteria andStockpriceLessThan(Float value) {
            addCriterion("stockprice <", value, "stockprice");
            return (Criteria) this;
        }

        public Criteria andStockpriceLessThanOrEqualTo(Float value) {
            addCriterion("stockprice <=", value, "stockprice");
            return (Criteria) this;
        }

        public Criteria andStockpriceIn(List<Float> values) {
            addCriterion("stockprice in", values, "stockprice");
            return (Criteria) this;
        }

        public Criteria andStockpriceNotIn(List<Float> values) {
            addCriterion("stockprice not in", values, "stockprice");
            return (Criteria) this;
        }

        public Criteria andStockpriceBetween(Float value1, Float value2) {
            addCriterion("stockprice between", value1, value2, "stockprice");
            return (Criteria) this;
        }

        public Criteria andStockpriceNotBetween(Float value1, Float value2) {
            addCriterion("stockprice not between", value1, value2, "stockprice");
            return (Criteria) this;
        }

        public Criteria andBjmoneyIsNull() {
            addCriterion("bjmoney is null");
            return (Criteria) this;
        }

        public Criteria andBjmoneyIsNotNull() {
            addCriterion("bjmoney is not null");
            return (Criteria) this;
        }

        public Criteria andBjmoneyEqualTo(Float value) {
            addCriterion("bjmoney =", value, "bjmoney");
            return (Criteria) this;
        }

        public Criteria andBjmoneyNotEqualTo(Float value) {
            addCriterion("bjmoney <>", value, "bjmoney");
            return (Criteria) this;
        }

        public Criteria andBjmoneyGreaterThan(Float value) {
            addCriterion("bjmoney >", value, "bjmoney");
            return (Criteria) this;
        }

        public Criteria andBjmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("bjmoney >=", value, "bjmoney");
            return (Criteria) this;
        }

        public Criteria andBjmoneyLessThan(Float value) {
            addCriterion("bjmoney <", value, "bjmoney");
            return (Criteria) this;
        }

        public Criteria andBjmoneyLessThanOrEqualTo(Float value) {
            addCriterion("bjmoney <=", value, "bjmoney");
            return (Criteria) this;
        }

        public Criteria andBjmoneyIn(List<Float> values) {
            addCriterion("bjmoney in", values, "bjmoney");
            return (Criteria) this;
        }

        public Criteria andBjmoneyNotIn(List<Float> values) {
            addCriterion("bjmoney not in", values, "bjmoney");
            return (Criteria) this;
        }

        public Criteria andBjmoneyBetween(Float value1, Float value2) {
            addCriterion("bjmoney between", value1, value2, "bjmoney");
            return (Criteria) this;
        }

        public Criteria andBjmoneyNotBetween(Float value1, Float value2) {
            addCriterion("bjmoney not between", value1, value2, "bjmoney");
            return (Criteria) this;
        }

        public Criteria andHymoneyIsNull() {
            addCriterion("hymoney is null");
            return (Criteria) this;
        }

        public Criteria andHymoneyIsNotNull() {
            addCriterion("hymoney is not null");
            return (Criteria) this;
        }

        public Criteria andHymoneyEqualTo(Float value) {
            addCriterion("hymoney =", value, "hymoney");
            return (Criteria) this;
        }

        public Criteria andHymoneyNotEqualTo(Float value) {
            addCriterion("hymoney <>", value, "hymoney");
            return (Criteria) this;
        }

        public Criteria andHymoneyGreaterThan(Float value) {
            addCriterion("hymoney >", value, "hymoney");
            return (Criteria) this;
        }

        public Criteria andHymoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("hymoney >=", value, "hymoney");
            return (Criteria) this;
        }

        public Criteria andHymoneyLessThan(Float value) {
            addCriterion("hymoney <", value, "hymoney");
            return (Criteria) this;
        }

        public Criteria andHymoneyLessThanOrEqualTo(Float value) {
            addCriterion("hymoney <=", value, "hymoney");
            return (Criteria) this;
        }

        public Criteria andHymoneyIn(List<Float> values) {
            addCriterion("hymoney in", values, "hymoney");
            return (Criteria) this;
        }

        public Criteria andHymoneyNotIn(List<Float> values) {
            addCriterion("hymoney not in", values, "hymoney");
            return (Criteria) this;
        }

        public Criteria andHymoneyBetween(Float value1, Float value2) {
            addCriterion("hymoney between", value1, value2, "hymoney");
            return (Criteria) this;
        }

        public Criteria andHymoneyNotBetween(Float value1, Float value2) {
            addCriterion("hymoney not between", value1, value2, "hymoney");
            return (Criteria) this;
        }

        public Criteria andVipmoneyIsNull() {
            addCriterion("vipmoney is null");
            return (Criteria) this;
        }

        public Criteria andVipmoneyIsNotNull() {
            addCriterion("vipmoney is not null");
            return (Criteria) this;
        }

        public Criteria andVipmoneyEqualTo(Float value) {
            addCriterion("vipmoney =", value, "vipmoney");
            return (Criteria) this;
        }

        public Criteria andVipmoneyNotEqualTo(Float value) {
            addCriterion("vipmoney <>", value, "vipmoney");
            return (Criteria) this;
        }

        public Criteria andVipmoneyGreaterThan(Float value) {
            addCriterion("vipmoney >", value, "vipmoney");
            return (Criteria) this;
        }

        public Criteria andVipmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("vipmoney >=", value, "vipmoney");
            return (Criteria) this;
        }

        public Criteria andVipmoneyLessThan(Float value) {
            addCriterion("vipmoney <", value, "vipmoney");
            return (Criteria) this;
        }

        public Criteria andVipmoneyLessThanOrEqualTo(Float value) {
            addCriterion("vipmoney <=", value, "vipmoney");
            return (Criteria) this;
        }

        public Criteria andVipmoneyIn(List<Float> values) {
            addCriterion("vipmoney in", values, "vipmoney");
            return (Criteria) this;
        }

        public Criteria andVipmoneyNotIn(List<Float> values) {
            addCriterion("vipmoney not in", values, "vipmoney");
            return (Criteria) this;
        }

        public Criteria andVipmoneyBetween(Float value1, Float value2) {
            addCriterion("vipmoney between", value1, value2, "vipmoney");
            return (Criteria) this;
        }

        public Criteria andVipmoneyNotBetween(Float value1, Float value2) {
            addCriterion("vipmoney not between", value1, value2, "vipmoney");
            return (Criteria) this;
        }

        public Criteria andRxypriceIsNull() {
            addCriterion("rxyprice is null");
            return (Criteria) this;
        }

        public Criteria andRxypriceIsNotNull() {
            addCriterion("rxyprice is not null");
            return (Criteria) this;
        }

        public Criteria andRxypriceEqualTo(Float value) {
            addCriterion("rxyprice =", value, "rxyprice");
            return (Criteria) this;
        }

        public Criteria andRxypriceNotEqualTo(Float value) {
            addCriterion("rxyprice <>", value, "rxyprice");
            return (Criteria) this;
        }

        public Criteria andRxypriceGreaterThan(Float value) {
            addCriterion("rxyprice >", value, "rxyprice");
            return (Criteria) this;
        }

        public Criteria andRxypriceGreaterThanOrEqualTo(Float value) {
            addCriterion("rxyprice >=", value, "rxyprice");
            return (Criteria) this;
        }

        public Criteria andRxypriceLessThan(Float value) {
            addCriterion("rxyprice <", value, "rxyprice");
            return (Criteria) this;
        }

        public Criteria andRxypriceLessThanOrEqualTo(Float value) {
            addCriterion("rxyprice <=", value, "rxyprice");
            return (Criteria) this;
        }

        public Criteria andRxypriceIn(List<Float> values) {
            addCriterion("rxyprice in", values, "rxyprice");
            return (Criteria) this;
        }

        public Criteria andRxypriceNotIn(List<Float> values) {
            addCriterion("rxyprice not in", values, "rxyprice");
            return (Criteria) this;
        }

        public Criteria andRxypriceBetween(Float value1, Float value2) {
            addCriterion("rxyprice between", value1, value2, "rxyprice");
            return (Criteria) this;
        }

        public Criteria andRxypriceNotBetween(Float value1, Float value2) {
            addCriterion("rxyprice not between", value1, value2, "rxyprice");
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