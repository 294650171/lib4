package cn.wuxi.js.lib4.crawler.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QyjbxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QyjbxxExample() {
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

        public Criteria andQyidIsNull() {
            addCriterion("qyID is null");
            return (Criteria) this;
        }

        public Criteria andQyidIsNotNull() {
            addCriterion("qyID is not null");
            return (Criteria) this;
        }

        public Criteria andQyidEqualTo(String value) {
            addCriterion("qyID =", value, "qyid");
            return (Criteria) this;
        }

        public Criteria andQyidNotEqualTo(String value) {
            addCriterion("qyID <>", value, "qyid");
            return (Criteria) this;
        }

        public Criteria andQyidGreaterThan(String value) {
            addCriterion("qyID >", value, "qyid");
            return (Criteria) this;
        }

        public Criteria andQyidGreaterThanOrEqualTo(String value) {
            addCriterion("qyID >=", value, "qyid");
            return (Criteria) this;
        }

        public Criteria andQyidLessThan(String value) {
            addCriterion("qyID <", value, "qyid");
            return (Criteria) this;
        }

        public Criteria andQyidLessThanOrEqualTo(String value) {
            addCriterion("qyID <=", value, "qyid");
            return (Criteria) this;
        }

        public Criteria andQyidLike(String value) {
            addCriterion("qyID like", value, "qyid");
            return (Criteria) this;
        }

        public Criteria andQyidNotLike(String value) {
            addCriterion("qyID not like", value, "qyid");
            return (Criteria) this;
        }

        public Criteria andQyidIn(List<String> values) {
            addCriterion("qyID in", values, "qyid");
            return (Criteria) this;
        }

        public Criteria andQyidNotIn(List<String> values) {
            addCriterion("qyID not in", values, "qyid");
            return (Criteria) this;
        }

        public Criteria andQyidBetween(String value1, String value2) {
            addCriterion("qyID between", value1, value2, "qyid");
            return (Criteria) this;
        }

        public Criteria andQyidNotBetween(String value1, String value2) {
            addCriterion("qyID not between", value1, value2, "qyid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("UserID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("UserID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("UserID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("UserID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("UserID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("UserID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("UserID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("UserID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("UserID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("UserID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("UserID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("UserID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("UserID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andQymcIsNull() {
            addCriterion("qymc is null");
            return (Criteria) this;
        }

        public Criteria andQymcIsNotNull() {
            addCriterion("qymc is not null");
            return (Criteria) this;
        }

        public Criteria andQymcEqualTo(String value) {
            addCriterion("qymc =", value, "qymc");
            return (Criteria) this;
        }

        public Criteria andQymcNotEqualTo(String value) {
            addCriterion("qymc <>", value, "qymc");
            return (Criteria) this;
        }

        public Criteria andQymcGreaterThan(String value) {
            addCriterion("qymc >", value, "qymc");
            return (Criteria) this;
        }

        public Criteria andQymcGreaterThanOrEqualTo(String value) {
            addCriterion("qymc >=", value, "qymc");
            return (Criteria) this;
        }

        public Criteria andQymcLessThan(String value) {
            addCriterion("qymc <", value, "qymc");
            return (Criteria) this;
        }

        public Criteria andQymcLessThanOrEqualTo(String value) {
            addCriterion("qymc <=", value, "qymc");
            return (Criteria) this;
        }

        public Criteria andQymcLike(String value) {
            addCriterion("qymc like", value, "qymc");
            return (Criteria) this;
        }

        public Criteria andQymcNotLike(String value) {
            addCriterion("qymc not like", value, "qymc");
            return (Criteria) this;
        }

        public Criteria andQymcIn(List<String> values) {
            addCriterion("qymc in", values, "qymc");
            return (Criteria) this;
        }

        public Criteria andQymcNotIn(List<String> values) {
            addCriterion("qymc not in", values, "qymc");
            return (Criteria) this;
        }

        public Criteria andQymcBetween(String value1, String value2) {
            addCriterion("qymc between", value1, value2, "qymc");
            return (Criteria) this;
        }

        public Criteria andQymcNotBetween(String value1, String value2) {
            addCriterion("qymc not between", value1, value2, "qymc");
            return (Criteria) this;
        }

        public Criteria andZzjgdmIsNull() {
            addCriterion("zzjgdm is null");
            return (Criteria) this;
        }

        public Criteria andZzjgdmIsNotNull() {
            addCriterion("zzjgdm is not null");
            return (Criteria) this;
        }

        public Criteria andZzjgdmEqualTo(String value) {
            addCriterion("zzjgdm =", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmNotEqualTo(String value) {
            addCriterion("zzjgdm <>", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmGreaterThan(String value) {
            addCriterion("zzjgdm >", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmGreaterThanOrEqualTo(String value) {
            addCriterion("zzjgdm >=", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmLessThan(String value) {
            addCriterion("zzjgdm <", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmLessThanOrEqualTo(String value) {
            addCriterion("zzjgdm <=", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmLike(String value) {
            addCriterion("zzjgdm like", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmNotLike(String value) {
            addCriterion("zzjgdm not like", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmIn(List<String> values) {
            addCriterion("zzjgdm in", values, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmNotIn(List<String> values) {
            addCriterion("zzjgdm not in", values, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmBetween(String value1, String value2) {
            addCriterion("zzjgdm between", value1, value2, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmNotBetween(String value1, String value2) {
            addCriterion("zzjgdm not between", value1, value2, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andYyzzzchIsNull() {
            addCriterion("yyzzzch is null");
            return (Criteria) this;
        }

        public Criteria andYyzzzchIsNotNull() {
            addCriterion("yyzzzch is not null");
            return (Criteria) this;
        }

        public Criteria andYyzzzchEqualTo(String value) {
            addCriterion("yyzzzch =", value, "yyzzzch");
            return (Criteria) this;
        }

        public Criteria andYyzzzchNotEqualTo(String value) {
            addCriterion("yyzzzch <>", value, "yyzzzch");
            return (Criteria) this;
        }

        public Criteria andYyzzzchGreaterThan(String value) {
            addCriterion("yyzzzch >", value, "yyzzzch");
            return (Criteria) this;
        }

        public Criteria andYyzzzchGreaterThanOrEqualTo(String value) {
            addCriterion("yyzzzch >=", value, "yyzzzch");
            return (Criteria) this;
        }

        public Criteria andYyzzzchLessThan(String value) {
            addCriterion("yyzzzch <", value, "yyzzzch");
            return (Criteria) this;
        }

        public Criteria andYyzzzchLessThanOrEqualTo(String value) {
            addCriterion("yyzzzch <=", value, "yyzzzch");
            return (Criteria) this;
        }

        public Criteria andYyzzzchLike(String value) {
            addCriterion("yyzzzch like", value, "yyzzzch");
            return (Criteria) this;
        }

        public Criteria andYyzzzchNotLike(String value) {
            addCriterion("yyzzzch not like", value, "yyzzzch");
            return (Criteria) this;
        }

        public Criteria andYyzzzchIn(List<String> values) {
            addCriterion("yyzzzch in", values, "yyzzzch");
            return (Criteria) this;
        }

        public Criteria andYyzzzchNotIn(List<String> values) {
            addCriterion("yyzzzch not in", values, "yyzzzch");
            return (Criteria) this;
        }

        public Criteria andYyzzzchBetween(String value1, String value2) {
            addCriterion("yyzzzch between", value1, value2, "yyzzzch");
            return (Criteria) this;
        }

        public Criteria andYyzzzchNotBetween(String value1, String value2) {
            addCriterion("yyzzzch not between", value1, value2, "yyzzzch");
            return (Criteria) this;
        }

        public Criteria andKhyhIsNull() {
            addCriterion("khyh is null");
            return (Criteria) this;
        }

        public Criteria andKhyhIsNotNull() {
            addCriterion("khyh is not null");
            return (Criteria) this;
        }

        public Criteria andKhyhEqualTo(String value) {
            addCriterion("khyh =", value, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhyhNotEqualTo(String value) {
            addCriterion("khyh <>", value, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhyhGreaterThan(String value) {
            addCriterion("khyh >", value, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhyhGreaterThanOrEqualTo(String value) {
            addCriterion("khyh >=", value, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhyhLessThan(String value) {
            addCriterion("khyh <", value, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhyhLessThanOrEqualTo(String value) {
            addCriterion("khyh <=", value, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhyhLike(String value) {
            addCriterion("khyh like", value, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhyhNotLike(String value) {
            addCriterion("khyh not like", value, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhyhIn(List<String> values) {
            addCriterion("khyh in", values, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhyhNotIn(List<String> values) {
            addCriterion("khyh not in", values, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhyhBetween(String value1, String value2) {
            addCriterion("khyh between", value1, value2, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhyhNotBetween(String value1, String value2) {
            addCriterion("khyh not between", value1, value2, "khyh");
            return (Criteria) this;
        }

        public Criteria andYhzhIsNull() {
            addCriterion("yhzh is null");
            return (Criteria) this;
        }

        public Criteria andYhzhIsNotNull() {
            addCriterion("yhzh is not null");
            return (Criteria) this;
        }

        public Criteria andYhzhEqualTo(String value) {
            addCriterion("yhzh =", value, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhNotEqualTo(String value) {
            addCriterion("yhzh <>", value, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhGreaterThan(String value) {
            addCriterion("yhzh >", value, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhGreaterThanOrEqualTo(String value) {
            addCriterion("yhzh >=", value, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhLessThan(String value) {
            addCriterion("yhzh <", value, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhLessThanOrEqualTo(String value) {
            addCriterion("yhzh <=", value, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhLike(String value) {
            addCriterion("yhzh like", value, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhNotLike(String value) {
            addCriterion("yhzh not like", value, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhIn(List<String> values) {
            addCriterion("yhzh in", values, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhNotIn(List<String> values) {
            addCriterion("yhzh not in", values, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhBetween(String value1, String value2) {
            addCriterion("yhzh between", value1, value2, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhNotBetween(String value1, String value2) {
            addCriterion("yhzh not between", value1, value2, "yhzh");
            return (Criteria) this;
        }

        public Criteria andSfsyqIsNull() {
            addCriterion("sfsyq is null");
            return (Criteria) this;
        }

        public Criteria andSfsyqIsNotNull() {
            addCriterion("sfsyq is not null");
            return (Criteria) this;
        }

        public Criteria andSfsyqEqualTo(String value) {
            addCriterion("sfsyq =", value, "sfsyq");
            return (Criteria) this;
        }

        public Criteria andSfsyqNotEqualTo(String value) {
            addCriterion("sfsyq <>", value, "sfsyq");
            return (Criteria) this;
        }

        public Criteria andSfsyqGreaterThan(String value) {
            addCriterion("sfsyq >", value, "sfsyq");
            return (Criteria) this;
        }

        public Criteria andSfsyqGreaterThanOrEqualTo(String value) {
            addCriterion("sfsyq >=", value, "sfsyq");
            return (Criteria) this;
        }

        public Criteria andSfsyqLessThan(String value) {
            addCriterion("sfsyq <", value, "sfsyq");
            return (Criteria) this;
        }

        public Criteria andSfsyqLessThanOrEqualTo(String value) {
            addCriterion("sfsyq <=", value, "sfsyq");
            return (Criteria) this;
        }

        public Criteria andSfsyqLike(String value) {
            addCriterion("sfsyq like", value, "sfsyq");
            return (Criteria) this;
        }

        public Criteria andSfsyqNotLike(String value) {
            addCriterion("sfsyq not like", value, "sfsyq");
            return (Criteria) this;
        }

        public Criteria andSfsyqIn(List<String> values) {
            addCriterion("sfsyq in", values, "sfsyq");
            return (Criteria) this;
        }

        public Criteria andSfsyqNotIn(List<String> values) {
            addCriterion("sfsyq not in", values, "sfsyq");
            return (Criteria) this;
        }

        public Criteria andSfsyqBetween(String value1, String value2) {
            addCriterion("sfsyq between", value1, value2, "sfsyq");
            return (Criteria) this;
        }

        public Criteria andSfsyqNotBetween(String value1, String value2) {
            addCriterion("sfsyq not between", value1, value2, "sfsyq");
            return (Criteria) this;
        }

        public Criteria andGcjsryZsIsNull() {
            addCriterion("gcjsry_zs is null");
            return (Criteria) this;
        }

        public Criteria andGcjsryZsIsNotNull() {
            addCriterion("gcjsry_zs is not null");
            return (Criteria) this;
        }

        public Criteria andGcjsryZsEqualTo(Integer value) {
            addCriterion("gcjsry_zs =", value, "gcjsryZs");
            return (Criteria) this;
        }

        public Criteria andGcjsryZsNotEqualTo(Integer value) {
            addCriterion("gcjsry_zs <>", value, "gcjsryZs");
            return (Criteria) this;
        }

        public Criteria andGcjsryZsGreaterThan(Integer value) {
            addCriterion("gcjsry_zs >", value, "gcjsryZs");
            return (Criteria) this;
        }

        public Criteria andGcjsryZsGreaterThanOrEqualTo(Integer value) {
            addCriterion("gcjsry_zs >=", value, "gcjsryZs");
            return (Criteria) this;
        }

        public Criteria andGcjsryZsLessThan(Integer value) {
            addCriterion("gcjsry_zs <", value, "gcjsryZs");
            return (Criteria) this;
        }

        public Criteria andGcjsryZsLessThanOrEqualTo(Integer value) {
            addCriterion("gcjsry_zs <=", value, "gcjsryZs");
            return (Criteria) this;
        }

        public Criteria andGcjsryZsIn(List<Integer> values) {
            addCriterion("gcjsry_zs in", values, "gcjsryZs");
            return (Criteria) this;
        }

        public Criteria andGcjsryZsNotIn(List<Integer> values) {
            addCriterion("gcjsry_zs not in", values, "gcjsryZs");
            return (Criteria) this;
        }

        public Criteria andGcjsryZsBetween(Integer value1, Integer value2) {
            addCriterion("gcjsry_zs between", value1, value2, "gcjsryZs");
            return (Criteria) this;
        }

        public Criteria andGcjsryZsNotBetween(Integer value1, Integer value2) {
            addCriterion("gcjsry_zs not between", value1, value2, "gcjsryZs");
            return (Criteria) this;
        }

        public Criteria andGcjsryGjzcrsIsNull() {
            addCriterion("gcjsry_gjzcrs is null");
            return (Criteria) this;
        }

        public Criteria andGcjsryGjzcrsIsNotNull() {
            addCriterion("gcjsry_gjzcrs is not null");
            return (Criteria) this;
        }

        public Criteria andGcjsryGjzcrsEqualTo(Integer value) {
            addCriterion("gcjsry_gjzcrs =", value, "gcjsryGjzcrs");
            return (Criteria) this;
        }

        public Criteria andGcjsryGjzcrsNotEqualTo(Integer value) {
            addCriterion("gcjsry_gjzcrs <>", value, "gcjsryGjzcrs");
            return (Criteria) this;
        }

        public Criteria andGcjsryGjzcrsGreaterThan(Integer value) {
            addCriterion("gcjsry_gjzcrs >", value, "gcjsryGjzcrs");
            return (Criteria) this;
        }

        public Criteria andGcjsryGjzcrsGreaterThanOrEqualTo(Integer value) {
            addCriterion("gcjsry_gjzcrs >=", value, "gcjsryGjzcrs");
            return (Criteria) this;
        }

        public Criteria andGcjsryGjzcrsLessThan(Integer value) {
            addCriterion("gcjsry_gjzcrs <", value, "gcjsryGjzcrs");
            return (Criteria) this;
        }

        public Criteria andGcjsryGjzcrsLessThanOrEqualTo(Integer value) {
            addCriterion("gcjsry_gjzcrs <=", value, "gcjsryGjzcrs");
            return (Criteria) this;
        }

        public Criteria andGcjsryGjzcrsIn(List<Integer> values) {
            addCriterion("gcjsry_gjzcrs in", values, "gcjsryGjzcrs");
            return (Criteria) this;
        }

        public Criteria andGcjsryGjzcrsNotIn(List<Integer> values) {
            addCriterion("gcjsry_gjzcrs not in", values, "gcjsryGjzcrs");
            return (Criteria) this;
        }

        public Criteria andGcjsryGjzcrsBetween(Integer value1, Integer value2) {
            addCriterion("gcjsry_gjzcrs between", value1, value2, "gcjsryGjzcrs");
            return (Criteria) this;
        }

        public Criteria andGcjsryGjzcrsNotBetween(Integer value1, Integer value2) {
            addCriterion("gcjsry_gjzcrs not between", value1, value2, "gcjsryGjzcrs");
            return (Criteria) this;
        }

        public Criteria andGcjsryZjzcrsIsNull() {
            addCriterion("gcjsry_zjzcrs is null");
            return (Criteria) this;
        }

        public Criteria andGcjsryZjzcrsIsNotNull() {
            addCriterion("gcjsry_zjzcrs is not null");
            return (Criteria) this;
        }

        public Criteria andGcjsryZjzcrsEqualTo(Integer value) {
            addCriterion("gcjsry_zjzcrs =", value, "gcjsryZjzcrs");
            return (Criteria) this;
        }

        public Criteria andGcjsryZjzcrsNotEqualTo(Integer value) {
            addCriterion("gcjsry_zjzcrs <>", value, "gcjsryZjzcrs");
            return (Criteria) this;
        }

        public Criteria andGcjsryZjzcrsGreaterThan(Integer value) {
            addCriterion("gcjsry_zjzcrs >", value, "gcjsryZjzcrs");
            return (Criteria) this;
        }

        public Criteria andGcjsryZjzcrsGreaterThanOrEqualTo(Integer value) {
            addCriterion("gcjsry_zjzcrs >=", value, "gcjsryZjzcrs");
            return (Criteria) this;
        }

        public Criteria andGcjsryZjzcrsLessThan(Integer value) {
            addCriterion("gcjsry_zjzcrs <", value, "gcjsryZjzcrs");
            return (Criteria) this;
        }

        public Criteria andGcjsryZjzcrsLessThanOrEqualTo(Integer value) {
            addCriterion("gcjsry_zjzcrs <=", value, "gcjsryZjzcrs");
            return (Criteria) this;
        }

        public Criteria andGcjsryZjzcrsIn(List<Integer> values) {
            addCriterion("gcjsry_zjzcrs in", values, "gcjsryZjzcrs");
            return (Criteria) this;
        }

        public Criteria andGcjsryZjzcrsNotIn(List<Integer> values) {
            addCriterion("gcjsry_zjzcrs not in", values, "gcjsryZjzcrs");
            return (Criteria) this;
        }

        public Criteria andGcjsryZjzcrsBetween(Integer value1, Integer value2) {
            addCriterion("gcjsry_zjzcrs between", value1, value2, "gcjsryZjzcrs");
            return (Criteria) this;
        }

        public Criteria andGcjsryZjzcrsNotBetween(Integer value1, Integer value2) {
            addCriterion("gcjsry_zjzcrs not between", value1, value2, "gcjsryZjzcrs");
            return (Criteria) this;
        }

        public Criteria andSylxidIsNull() {
            addCriterion("sylxID is null");
            return (Criteria) this;
        }

        public Criteria andSylxidIsNotNull() {
            addCriterion("sylxID is not null");
            return (Criteria) this;
        }

        public Criteria andSylxidEqualTo(Integer value) {
            addCriterion("sylxID =", value, "sylxid");
            return (Criteria) this;
        }

        public Criteria andSylxidNotEqualTo(Integer value) {
            addCriterion("sylxID <>", value, "sylxid");
            return (Criteria) this;
        }

        public Criteria andSylxidGreaterThan(Integer value) {
            addCriterion("sylxID >", value, "sylxid");
            return (Criteria) this;
        }

        public Criteria andSylxidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sylxID >=", value, "sylxid");
            return (Criteria) this;
        }

        public Criteria andSylxidLessThan(Integer value) {
            addCriterion("sylxID <", value, "sylxid");
            return (Criteria) this;
        }

        public Criteria andSylxidLessThanOrEqualTo(Integer value) {
            addCriterion("sylxID <=", value, "sylxid");
            return (Criteria) this;
        }

        public Criteria andSylxidIn(List<Integer> values) {
            addCriterion("sylxID in", values, "sylxid");
            return (Criteria) this;
        }

        public Criteria andSylxidNotIn(List<Integer> values) {
            addCriterion("sylxID not in", values, "sylxid");
            return (Criteria) this;
        }

        public Criteria andSylxidBetween(Integer value1, Integer value2) {
            addCriterion("sylxID between", value1, value2, "sylxid");
            return (Criteria) this;
        }

        public Criteria andSylxidNotBetween(Integer value1, Integer value2) {
            addCriterion("sylxID not between", value1, value2, "sylxid");
            return (Criteria) this;
        }

        public Criteria andSylxIsNull() {
            addCriterion("sylx is null");
            return (Criteria) this;
        }

        public Criteria andSylxIsNotNull() {
            addCriterion("sylx is not null");
            return (Criteria) this;
        }

        public Criteria andSylxEqualTo(String value) {
            addCriterion("sylx =", value, "sylx");
            return (Criteria) this;
        }

        public Criteria andSylxNotEqualTo(String value) {
            addCriterion("sylx <>", value, "sylx");
            return (Criteria) this;
        }

        public Criteria andSylxGreaterThan(String value) {
            addCriterion("sylx >", value, "sylx");
            return (Criteria) this;
        }

        public Criteria andSylxGreaterThanOrEqualTo(String value) {
            addCriterion("sylx >=", value, "sylx");
            return (Criteria) this;
        }

        public Criteria andSylxLessThan(String value) {
            addCriterion("sylx <", value, "sylx");
            return (Criteria) this;
        }

        public Criteria andSylxLessThanOrEqualTo(String value) {
            addCriterion("sylx <=", value, "sylx");
            return (Criteria) this;
        }

        public Criteria andSylxLike(String value) {
            addCriterion("sylx like", value, "sylx");
            return (Criteria) this;
        }

        public Criteria andSylxNotLike(String value) {
            addCriterion("sylx not like", value, "sylx");
            return (Criteria) this;
        }

        public Criteria andSylxIn(List<String> values) {
            addCriterion("sylx in", values, "sylx");
            return (Criteria) this;
        }

        public Criteria andSylxNotIn(List<String> values) {
            addCriterion("sylx not in", values, "sylx");
            return (Criteria) this;
        }

        public Criteria andSylxBetween(String value1, String value2) {
            addCriterion("sylx between", value1, value2, "sylx");
            return (Criteria) this;
        }

        public Criteria andSylxNotBetween(String value1, String value2) {
            addCriterion("sylx not between", value1, value2, "sylx");
            return (Criteria) this;
        }

        public Criteria andProvinceidIsNull() {
            addCriterion("ProvinceID is null");
            return (Criteria) this;
        }

        public Criteria andProvinceidIsNotNull() {
            addCriterion("ProvinceID is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceidEqualTo(String value) {
            addCriterion("ProvinceID =", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotEqualTo(String value) {
            addCriterion("ProvinceID <>", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidGreaterThan(String value) {
            addCriterion("ProvinceID >", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidGreaterThanOrEqualTo(String value) {
            addCriterion("ProvinceID >=", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLessThan(String value) {
            addCriterion("ProvinceID <", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLessThanOrEqualTo(String value) {
            addCriterion("ProvinceID <=", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLike(String value) {
            addCriterion("ProvinceID like", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotLike(String value) {
            addCriterion("ProvinceID not like", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidIn(List<String> values) {
            addCriterion("ProvinceID in", values, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotIn(List<String> values) {
            addCriterion("ProvinceID not in", values, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidBetween(String value1, String value2) {
            addCriterion("ProvinceID between", value1, value2, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotBetween(String value1, String value2) {
            addCriterion("ProvinceID not between", value1, value2, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("Province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("Province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("Province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("Province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("Province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("Province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("Province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("Province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("Province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("Province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("Province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("Province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("Province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("Province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityidIsNull() {
            addCriterion("CityID is null");
            return (Criteria) this;
        }

        public Criteria andCityidIsNotNull() {
            addCriterion("CityID is not null");
            return (Criteria) this;
        }

        public Criteria andCityidEqualTo(String value) {
            addCriterion("CityID =", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotEqualTo(String value) {
            addCriterion("CityID <>", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThan(String value) {
            addCriterion("CityID >", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThanOrEqualTo(String value) {
            addCriterion("CityID >=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThan(String value) {
            addCriterion("CityID <", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThanOrEqualTo(String value) {
            addCriterion("CityID <=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLike(String value) {
            addCriterion("CityID like", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotLike(String value) {
            addCriterion("CityID not like", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidIn(List<String> values) {
            addCriterion("CityID in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotIn(List<String> values) {
            addCriterion("CityID not in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidBetween(String value1, String value2) {
            addCriterion("CityID between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotBetween(String value1, String value2) {
            addCriterion("CityID not between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("City is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("City is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("City =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("City <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("City >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("City >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("City <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("City <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("City like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("City not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("City in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("City not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("City between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("City not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCountyidIsNull() {
            addCriterion("CountyID is null");
            return (Criteria) this;
        }

        public Criteria andCountyidIsNotNull() {
            addCriterion("CountyID is not null");
            return (Criteria) this;
        }

        public Criteria andCountyidEqualTo(String value) {
            addCriterion("CountyID =", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidNotEqualTo(String value) {
            addCriterion("CountyID <>", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidGreaterThan(String value) {
            addCriterion("CountyID >", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidGreaterThanOrEqualTo(String value) {
            addCriterion("CountyID >=", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidLessThan(String value) {
            addCriterion("CountyID <", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidLessThanOrEqualTo(String value) {
            addCriterion("CountyID <=", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidLike(String value) {
            addCriterion("CountyID like", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidNotLike(String value) {
            addCriterion("CountyID not like", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidIn(List<String> values) {
            addCriterion("CountyID in", values, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidNotIn(List<String> values) {
            addCriterion("CountyID not in", values, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidBetween(String value1, String value2) {
            addCriterion("CountyID between", value1, value2, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidNotBetween(String value1, String value2) {
            addCriterion("CountyID not between", value1, value2, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyIsNull() {
            addCriterion("County is null");
            return (Criteria) this;
        }

        public Criteria andCountyIsNotNull() {
            addCriterion("County is not null");
            return (Criteria) this;
        }

        public Criteria andCountyEqualTo(String value) {
            addCriterion("County =", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotEqualTo(String value) {
            addCriterion("County <>", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThan(String value) {
            addCriterion("County >", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThanOrEqualTo(String value) {
            addCriterion("County >=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThan(String value) {
            addCriterion("County <", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThanOrEqualTo(String value) {
            addCriterion("County <=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLike(String value) {
            addCriterion("County like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotLike(String value) {
            addCriterion("County not like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyIn(List<String> values) {
            addCriterion("County in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotIn(List<String> values) {
            addCriterion("County not in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyBetween(String value1, String value2) {
            addCriterion("County between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotBetween(String value1, String value2) {
            addCriterion("County not between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andZcddIsNull() {
            addCriterion("zcdd is null");
            return (Criteria) this;
        }

        public Criteria andZcddIsNotNull() {
            addCriterion("zcdd is not null");
            return (Criteria) this;
        }

        public Criteria andZcddEqualTo(String value) {
            addCriterion("zcdd =", value, "zcdd");
            return (Criteria) this;
        }

        public Criteria andZcddNotEqualTo(String value) {
            addCriterion("zcdd <>", value, "zcdd");
            return (Criteria) this;
        }

        public Criteria andZcddGreaterThan(String value) {
            addCriterion("zcdd >", value, "zcdd");
            return (Criteria) this;
        }

        public Criteria andZcddGreaterThanOrEqualTo(String value) {
            addCriterion("zcdd >=", value, "zcdd");
            return (Criteria) this;
        }

        public Criteria andZcddLessThan(String value) {
            addCriterion("zcdd <", value, "zcdd");
            return (Criteria) this;
        }

        public Criteria andZcddLessThanOrEqualTo(String value) {
            addCriterion("zcdd <=", value, "zcdd");
            return (Criteria) this;
        }

        public Criteria andZcddLike(String value) {
            addCriterion("zcdd like", value, "zcdd");
            return (Criteria) this;
        }

        public Criteria andZcddNotLike(String value) {
            addCriterion("zcdd not like", value, "zcdd");
            return (Criteria) this;
        }

        public Criteria andZcddIn(List<String> values) {
            addCriterion("zcdd in", values, "zcdd");
            return (Criteria) this;
        }

        public Criteria andZcddNotIn(List<String> values) {
            addCriterion("zcdd not in", values, "zcdd");
            return (Criteria) this;
        }

        public Criteria andZcddBetween(String value1, String value2) {
            addCriterion("zcdd between", value1, value2, "zcdd");
            return (Criteria) this;
        }

        public Criteria andZcddNotBetween(String value1, String value2) {
            addCriterion("zcdd not between", value1, value2, "zcdd");
            return (Criteria) this;
        }

        public Criteria andJjxzidIsNull() {
            addCriterion("jjxzID is null");
            return (Criteria) this;
        }

        public Criteria andJjxzidIsNotNull() {
            addCriterion("jjxzID is not null");
            return (Criteria) this;
        }

        public Criteria andJjxzidEqualTo(Integer value) {
            addCriterion("jjxzID =", value, "jjxzid");
            return (Criteria) this;
        }

        public Criteria andJjxzidNotEqualTo(Integer value) {
            addCriterion("jjxzID <>", value, "jjxzid");
            return (Criteria) this;
        }

        public Criteria andJjxzidGreaterThan(Integer value) {
            addCriterion("jjxzID >", value, "jjxzid");
            return (Criteria) this;
        }

        public Criteria andJjxzidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jjxzID >=", value, "jjxzid");
            return (Criteria) this;
        }

        public Criteria andJjxzidLessThan(Integer value) {
            addCriterion("jjxzID <", value, "jjxzid");
            return (Criteria) this;
        }

        public Criteria andJjxzidLessThanOrEqualTo(Integer value) {
            addCriterion("jjxzID <=", value, "jjxzid");
            return (Criteria) this;
        }

        public Criteria andJjxzidIn(List<Integer> values) {
            addCriterion("jjxzID in", values, "jjxzid");
            return (Criteria) this;
        }

        public Criteria andJjxzidNotIn(List<Integer> values) {
            addCriterion("jjxzID not in", values, "jjxzid");
            return (Criteria) this;
        }

        public Criteria andJjxzidBetween(Integer value1, Integer value2) {
            addCriterion("jjxzID between", value1, value2, "jjxzid");
            return (Criteria) this;
        }

        public Criteria andJjxzidNotBetween(Integer value1, Integer value2) {
            addCriterion("jjxzID not between", value1, value2, "jjxzid");
            return (Criteria) this;
        }

        public Criteria andJjxzIsNull() {
            addCriterion("jjxz is null");
            return (Criteria) this;
        }

        public Criteria andJjxzIsNotNull() {
            addCriterion("jjxz is not null");
            return (Criteria) this;
        }

        public Criteria andJjxzEqualTo(String value) {
            addCriterion("jjxz =", value, "jjxz");
            return (Criteria) this;
        }

        public Criteria andJjxzNotEqualTo(String value) {
            addCriterion("jjxz <>", value, "jjxz");
            return (Criteria) this;
        }

        public Criteria andJjxzGreaterThan(String value) {
            addCriterion("jjxz >", value, "jjxz");
            return (Criteria) this;
        }

        public Criteria andJjxzGreaterThanOrEqualTo(String value) {
            addCriterion("jjxz >=", value, "jjxz");
            return (Criteria) this;
        }

        public Criteria andJjxzLessThan(String value) {
            addCriterion("jjxz <", value, "jjxz");
            return (Criteria) this;
        }

        public Criteria andJjxzLessThanOrEqualTo(String value) {
            addCriterion("jjxz <=", value, "jjxz");
            return (Criteria) this;
        }

        public Criteria andJjxzLike(String value) {
            addCriterion("jjxz like", value, "jjxz");
            return (Criteria) this;
        }

        public Criteria andJjxzNotLike(String value) {
            addCriterion("jjxz not like", value, "jjxz");
            return (Criteria) this;
        }

        public Criteria andJjxzIn(List<String> values) {
            addCriterion("jjxz in", values, "jjxz");
            return (Criteria) this;
        }

        public Criteria andJjxzNotIn(List<String> values) {
            addCriterion("jjxz not in", values, "jjxz");
            return (Criteria) this;
        }

        public Criteria andJjxzBetween(String value1, String value2) {
            addCriterion("jjxz between", value1, value2, "jjxz");
            return (Criteria) this;
        }

        public Criteria andJjxzNotBetween(String value1, String value2) {
            addCriterion("jjxz not between", value1, value2, "jjxz");
            return (Criteria) this;
        }

        public Criteria andZczbIsNull() {
            addCriterion("zczb is null");
            return (Criteria) this;
        }

        public Criteria andZczbIsNotNull() {
            addCriterion("zczb is not null");
            return (Criteria) this;
        }

        public Criteria andZczbEqualTo(String value) {
            addCriterion("zczb =", value, "zczb");
            return (Criteria) this;
        }

        public Criteria andZczbNotEqualTo(String value) {
            addCriterion("zczb <>", value, "zczb");
            return (Criteria) this;
        }

        public Criteria andZczbGreaterThan(String value) {
            addCriterion("zczb >", value, "zczb");
            return (Criteria) this;
        }

        public Criteria andZczbGreaterThanOrEqualTo(String value) {
            addCriterion("zczb >=", value, "zczb");
            return (Criteria) this;
        }

        public Criteria andZczbLessThan(String value) {
            addCriterion("zczb <", value, "zczb");
            return (Criteria) this;
        }

        public Criteria andZczbLessThanOrEqualTo(String value) {
            addCriterion("zczb <=", value, "zczb");
            return (Criteria) this;
        }

        public Criteria andZczbLike(String value) {
            addCriterion("zczb like", value, "zczb");
            return (Criteria) this;
        }

        public Criteria andZczbNotLike(String value) {
            addCriterion("zczb not like", value, "zczb");
            return (Criteria) this;
        }

        public Criteria andZczbIn(List<String> values) {
            addCriterion("zczb in", values, "zczb");
            return (Criteria) this;
        }

        public Criteria andZczbNotIn(List<String> values) {
            addCriterion("zczb not in", values, "zczb");
            return (Criteria) this;
        }

        public Criteria andZczbBetween(String value1, String value2) {
            addCriterion("zczb between", value1, value2, "zczb");
            return (Criteria) this;
        }

        public Criteria andZczbNotBetween(String value1, String value2) {
            addCriterion("zczb not between", value1, value2, "zczb");
            return (Criteria) this;
        }

        public Criteria andZyfwIsNull() {
            addCriterion("zyfw is null");
            return (Criteria) this;
        }

        public Criteria andZyfwIsNotNull() {
            addCriterion("zyfw is not null");
            return (Criteria) this;
        }

        public Criteria andZyfwEqualTo(String value) {
            addCriterion("zyfw =", value, "zyfw");
            return (Criteria) this;
        }

        public Criteria andZyfwNotEqualTo(String value) {
            addCriterion("zyfw <>", value, "zyfw");
            return (Criteria) this;
        }

        public Criteria andZyfwGreaterThan(String value) {
            addCriterion("zyfw >", value, "zyfw");
            return (Criteria) this;
        }

        public Criteria andZyfwGreaterThanOrEqualTo(String value) {
            addCriterion("zyfw >=", value, "zyfw");
            return (Criteria) this;
        }

        public Criteria andZyfwLessThan(String value) {
            addCriterion("zyfw <", value, "zyfw");
            return (Criteria) this;
        }

        public Criteria andZyfwLessThanOrEqualTo(String value) {
            addCriterion("zyfw <=", value, "zyfw");
            return (Criteria) this;
        }

        public Criteria andZyfwLike(String value) {
            addCriterion("zyfw like", value, "zyfw");
            return (Criteria) this;
        }

        public Criteria andZyfwNotLike(String value) {
            addCriterion("zyfw not like", value, "zyfw");
            return (Criteria) this;
        }

        public Criteria andZyfwIn(List<String> values) {
            addCriterion("zyfw in", values, "zyfw");
            return (Criteria) this;
        }

        public Criteria andZyfwNotIn(List<String> values) {
            addCriterion("zyfw not in", values, "zyfw");
            return (Criteria) this;
        }

        public Criteria andZyfwBetween(String value1, String value2) {
            addCriterion("zyfw between", value1, value2, "zyfw");
            return (Criteria) this;
        }

        public Criteria andZyfwNotBetween(String value1, String value2) {
            addCriterion("zyfw not between", value1, value2, "zyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwIsNull() {
            addCriterion("jyfw is null");
            return (Criteria) this;
        }

        public Criteria andJyfwIsNotNull() {
            addCriterion("jyfw is not null");
            return (Criteria) this;
        }

        public Criteria andJyfwEqualTo(String value) {
            addCriterion("jyfw =", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwNotEqualTo(String value) {
            addCriterion("jyfw <>", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwGreaterThan(String value) {
            addCriterion("jyfw >", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwGreaterThanOrEqualTo(String value) {
            addCriterion("jyfw >=", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwLessThan(String value) {
            addCriterion("jyfw <", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwLessThanOrEqualTo(String value) {
            addCriterion("jyfw <=", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwLike(String value) {
            addCriterion("jyfw like", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwNotLike(String value) {
            addCriterion("jyfw not like", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwIn(List<String> values) {
            addCriterion("jyfw in", values, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwNotIn(List<String> values) {
            addCriterion("jyfw not in", values, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwBetween(String value1, String value2) {
            addCriterion("jyfw between", value1, value2, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwNotBetween(String value1, String value2) {
            addCriterion("jyfw not between", value1, value2, "jyfw");
            return (Criteria) this;
        }

        public Criteria andClrqIsNull() {
            addCriterion("clrq is null");
            return (Criteria) this;
        }

        public Criteria andClrqIsNotNull() {
            addCriterion("clrq is not null");
            return (Criteria) this;
        }

        public Criteria andClrqEqualTo(Date value) {
            addCriterion("clrq =", value, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqNotEqualTo(Date value) {
            addCriterion("clrq <>", value, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqGreaterThan(Date value) {
            addCriterion("clrq >", value, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqGreaterThanOrEqualTo(Date value) {
            addCriterion("clrq >=", value, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqLessThan(Date value) {
            addCriterion("clrq <", value, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqLessThanOrEqualTo(Date value) {
            addCriterion("clrq <=", value, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqIn(List<Date> values) {
            addCriterion("clrq in", values, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqNotIn(List<Date> values) {
            addCriterion("clrq not in", values, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqBetween(Date value1, Date value2) {
            addCriterion("clrq between", value1, value2, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqNotBetween(Date value1, Date value2) {
            addCriterion("clrq not between", value1, value2, "clrq");
            return (Criteria) this;
        }

        public Criteria andQyjjIsNull() {
            addCriterion("qyjj is null");
            return (Criteria) this;
        }

        public Criteria andQyjjIsNotNull() {
            addCriterion("qyjj is not null");
            return (Criteria) this;
        }

        public Criteria andQyjjEqualTo(String value) {
            addCriterion("qyjj =", value, "qyjj");
            return (Criteria) this;
        }

        public Criteria andQyjjNotEqualTo(String value) {
            addCriterion("qyjj <>", value, "qyjj");
            return (Criteria) this;
        }

        public Criteria andQyjjGreaterThan(String value) {
            addCriterion("qyjj >", value, "qyjj");
            return (Criteria) this;
        }

        public Criteria andQyjjGreaterThanOrEqualTo(String value) {
            addCriterion("qyjj >=", value, "qyjj");
            return (Criteria) this;
        }

        public Criteria andQyjjLessThan(String value) {
            addCriterion("qyjj <", value, "qyjj");
            return (Criteria) this;
        }

        public Criteria andQyjjLessThanOrEqualTo(String value) {
            addCriterion("qyjj <=", value, "qyjj");
            return (Criteria) this;
        }

        public Criteria andQyjjLike(String value) {
            addCriterion("qyjj like", value, "qyjj");
            return (Criteria) this;
        }

        public Criteria andQyjjNotLike(String value) {
            addCriterion("qyjj not like", value, "qyjj");
            return (Criteria) this;
        }

        public Criteria andQyjjIn(List<String> values) {
            addCriterion("qyjj in", values, "qyjj");
            return (Criteria) this;
        }

        public Criteria andQyjjNotIn(List<String> values) {
            addCriterion("qyjj not in", values, "qyjj");
            return (Criteria) this;
        }

        public Criteria andQyjjBetween(String value1, String value2) {
            addCriterion("qyjj between", value1, value2, "qyjj");
            return (Criteria) this;
        }

        public Criteria andQyjjNotBetween(String value1, String value2) {
            addCriterion("qyjj not between", value1, value2, "qyjj");
            return (Criteria) this;
        }

        public Criteria andXxddIsNull() {
            addCriterion("xxdd is null");
            return (Criteria) this;
        }

        public Criteria andXxddIsNotNull() {
            addCriterion("xxdd is not null");
            return (Criteria) this;
        }

        public Criteria andXxddEqualTo(String value) {
            addCriterion("xxdd =", value, "xxdd");
            return (Criteria) this;
        }

        public Criteria andXxddNotEqualTo(String value) {
            addCriterion("xxdd <>", value, "xxdd");
            return (Criteria) this;
        }

        public Criteria andXxddGreaterThan(String value) {
            addCriterion("xxdd >", value, "xxdd");
            return (Criteria) this;
        }

        public Criteria andXxddGreaterThanOrEqualTo(String value) {
            addCriterion("xxdd >=", value, "xxdd");
            return (Criteria) this;
        }

        public Criteria andXxddLessThan(String value) {
            addCriterion("xxdd <", value, "xxdd");
            return (Criteria) this;
        }

        public Criteria andXxddLessThanOrEqualTo(String value) {
            addCriterion("xxdd <=", value, "xxdd");
            return (Criteria) this;
        }

        public Criteria andXxddLike(String value) {
            addCriterion("xxdd like", value, "xxdd");
            return (Criteria) this;
        }

        public Criteria andXxddNotLike(String value) {
            addCriterion("xxdd not like", value, "xxdd");
            return (Criteria) this;
        }

        public Criteria andXxddIn(List<String> values) {
            addCriterion("xxdd in", values, "xxdd");
            return (Criteria) this;
        }

        public Criteria andXxddNotIn(List<String> values) {
            addCriterion("xxdd not in", values, "xxdd");
            return (Criteria) this;
        }

        public Criteria andXxddBetween(String value1, String value2) {
            addCriterion("xxdd between", value1, value2, "xxdd");
            return (Criteria) this;
        }

        public Criteria andXxddNotBetween(String value1, String value2) {
            addCriterion("xxdd not between", value1, value2, "xxdd");
            return (Criteria) this;
        }

        public Criteria andYzbmIsNull() {
            addCriterion("yzbm is null");
            return (Criteria) this;
        }

        public Criteria andYzbmIsNotNull() {
            addCriterion("yzbm is not null");
            return (Criteria) this;
        }

        public Criteria andYzbmEqualTo(String value) {
            addCriterion("yzbm =", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotEqualTo(String value) {
            addCriterion("yzbm <>", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmGreaterThan(String value) {
            addCriterion("yzbm >", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmGreaterThanOrEqualTo(String value) {
            addCriterion("yzbm >=", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmLessThan(String value) {
            addCriterion("yzbm <", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmLessThanOrEqualTo(String value) {
            addCriterion("yzbm <=", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmLike(String value) {
            addCriterion("yzbm like", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotLike(String value) {
            addCriterion("yzbm not like", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmIn(List<String> values) {
            addCriterion("yzbm in", values, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotIn(List<String> values) {
            addCriterion("yzbm not in", values, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmBetween(String value1, String value2) {
            addCriterion("yzbm between", value1, value2, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotBetween(String value1, String value2) {
            addCriterion("yzbm not between", value1, value2, "yzbm");
            return (Criteria) this;
        }

        public Criteria andCzIsNull() {
            addCriterion("cz is null");
            return (Criteria) this;
        }

        public Criteria andCzIsNotNull() {
            addCriterion("cz is not null");
            return (Criteria) this;
        }

        public Criteria andCzEqualTo(String value) {
            addCriterion("cz =", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzNotEqualTo(String value) {
            addCriterion("cz <>", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzGreaterThan(String value) {
            addCriterion("cz >", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzGreaterThanOrEqualTo(String value) {
            addCriterion("cz >=", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzLessThan(String value) {
            addCriterion("cz <", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzLessThanOrEqualTo(String value) {
            addCriterion("cz <=", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzLike(String value) {
            addCriterion("cz like", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzNotLike(String value) {
            addCriterion("cz not like", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzIn(List<String> values) {
            addCriterion("cz in", values, "cz");
            return (Criteria) this;
        }

        public Criteria andCzNotIn(List<String> values) {
            addCriterion("cz not in", values, "cz");
            return (Criteria) this;
        }

        public Criteria andCzBetween(String value1, String value2) {
            addCriterion("cz between", value1, value2, "cz");
            return (Criteria) this;
        }

        public Criteria andCzNotBetween(String value1, String value2) {
            addCriterion("cz not between", value1, value2, "cz");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andWebaddressIsNull() {
            addCriterion("webAddress is null");
            return (Criteria) this;
        }

        public Criteria andWebaddressIsNotNull() {
            addCriterion("webAddress is not null");
            return (Criteria) this;
        }

        public Criteria andWebaddressEqualTo(String value) {
            addCriterion("webAddress =", value, "webaddress");
            return (Criteria) this;
        }

        public Criteria andWebaddressNotEqualTo(String value) {
            addCriterion("webAddress <>", value, "webaddress");
            return (Criteria) this;
        }

        public Criteria andWebaddressGreaterThan(String value) {
            addCriterion("webAddress >", value, "webaddress");
            return (Criteria) this;
        }

        public Criteria andWebaddressGreaterThanOrEqualTo(String value) {
            addCriterion("webAddress >=", value, "webaddress");
            return (Criteria) this;
        }

        public Criteria andWebaddressLessThan(String value) {
            addCriterion("webAddress <", value, "webaddress");
            return (Criteria) this;
        }

        public Criteria andWebaddressLessThanOrEqualTo(String value) {
            addCriterion("webAddress <=", value, "webaddress");
            return (Criteria) this;
        }

        public Criteria andWebaddressLike(String value) {
            addCriterion("webAddress like", value, "webaddress");
            return (Criteria) this;
        }

        public Criteria andWebaddressNotLike(String value) {
            addCriterion("webAddress not like", value, "webaddress");
            return (Criteria) this;
        }

        public Criteria andWebaddressIn(List<String> values) {
            addCriterion("webAddress in", values, "webaddress");
            return (Criteria) this;
        }

        public Criteria andWebaddressNotIn(List<String> values) {
            addCriterion("webAddress not in", values, "webaddress");
            return (Criteria) this;
        }

        public Criteria andWebaddressBetween(String value1, String value2) {
            addCriterion("webAddress between", value1, value2, "webaddress");
            return (Criteria) this;
        }

        public Criteria andWebaddressNotBetween(String value1, String value2) {
            addCriterion("webAddress not between", value1, value2, "webaddress");
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

        public Criteria andLxdhIsNull() {
            addCriterion("lxdh is null");
            return (Criteria) this;
        }

        public Criteria andLxdhIsNotNull() {
            addCriterion("lxdh is not null");
            return (Criteria) this;
        }

        public Criteria andLxdhEqualTo(String value) {
            addCriterion("lxdh =", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotEqualTo(String value) {
            addCriterion("lxdh <>", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhGreaterThan(String value) {
            addCriterion("lxdh >", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhGreaterThanOrEqualTo(String value) {
            addCriterion("lxdh >=", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLessThan(String value) {
            addCriterion("lxdh <", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLessThanOrEqualTo(String value) {
            addCriterion("lxdh <=", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLike(String value) {
            addCriterion("lxdh like", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotLike(String value) {
            addCriterion("lxdh not like", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhIn(List<String> values) {
            addCriterion("lxdh in", values, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotIn(List<String> values) {
            addCriterion("lxdh not in", values, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhBetween(String value1, String value2) {
            addCriterion("lxdh between", value1, value2, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotBetween(String value1, String value2) {
            addCriterion("lxdh not between", value1, value2, "lxdh");
            return (Criteria) this;
        }

        public Criteria andFddbrRyidIsNull() {
            addCriterion("fddbr_ryid is null");
            return (Criteria) this;
        }

        public Criteria andFddbrRyidIsNotNull() {
            addCriterion("fddbr_ryid is not null");
            return (Criteria) this;
        }

        public Criteria andFddbrRyidEqualTo(String value) {
            addCriterion("fddbr_ryid =", value, "fddbrRyid");
            return (Criteria) this;
        }

        public Criteria andFddbrRyidNotEqualTo(String value) {
            addCriterion("fddbr_ryid <>", value, "fddbrRyid");
            return (Criteria) this;
        }

        public Criteria andFddbrRyidGreaterThan(String value) {
            addCriterion("fddbr_ryid >", value, "fddbrRyid");
            return (Criteria) this;
        }

        public Criteria andFddbrRyidGreaterThanOrEqualTo(String value) {
            addCriterion("fddbr_ryid >=", value, "fddbrRyid");
            return (Criteria) this;
        }

        public Criteria andFddbrRyidLessThan(String value) {
            addCriterion("fddbr_ryid <", value, "fddbrRyid");
            return (Criteria) this;
        }

        public Criteria andFddbrRyidLessThanOrEqualTo(String value) {
            addCriterion("fddbr_ryid <=", value, "fddbrRyid");
            return (Criteria) this;
        }

        public Criteria andFddbrRyidLike(String value) {
            addCriterion("fddbr_ryid like", value, "fddbrRyid");
            return (Criteria) this;
        }

        public Criteria andFddbrRyidNotLike(String value) {
            addCriterion("fddbr_ryid not like", value, "fddbrRyid");
            return (Criteria) this;
        }

        public Criteria andFddbrRyidIn(List<String> values) {
            addCriterion("fddbr_ryid in", values, "fddbrRyid");
            return (Criteria) this;
        }

        public Criteria andFddbrRyidNotIn(List<String> values) {
            addCriterion("fddbr_ryid not in", values, "fddbrRyid");
            return (Criteria) this;
        }

        public Criteria andFddbrRyidBetween(String value1, String value2) {
            addCriterion("fddbr_ryid between", value1, value2, "fddbrRyid");
            return (Criteria) this;
        }

        public Criteria andFddbrRyidNotBetween(String value1, String value2) {
            addCriterion("fddbr_ryid not between", value1, value2, "fddbrRyid");
            return (Criteria) this;
        }

        public Criteria andFddbrIsNull() {
            addCriterion("fddbr is null");
            return (Criteria) this;
        }

        public Criteria andFddbrIsNotNull() {
            addCriterion("fddbr is not null");
            return (Criteria) this;
        }

        public Criteria andFddbrEqualTo(String value) {
            addCriterion("fddbr =", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrNotEqualTo(String value) {
            addCriterion("fddbr <>", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrGreaterThan(String value) {
            addCriterion("fddbr >", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrGreaterThanOrEqualTo(String value) {
            addCriterion("fddbr >=", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrLessThan(String value) {
            addCriterion("fddbr <", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrLessThanOrEqualTo(String value) {
            addCriterion("fddbr <=", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrLike(String value) {
            addCriterion("fddbr like", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrNotLike(String value) {
            addCriterion("fddbr not like", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrIn(List<String> values) {
            addCriterion("fddbr in", values, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrNotIn(List<String> values) {
            addCriterion("fddbr not in", values, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrBetween(String value1, String value2) {
            addCriterion("fddbr between", value1, value2, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrNotBetween(String value1, String value2) {
            addCriterion("fddbr not between", value1, value2, "fddbr");
            return (Criteria) this;
        }

        public Criteria andQyfzrRyidIsNull() {
            addCriterion("qyfzr_ryid is null");
            return (Criteria) this;
        }

        public Criteria andQyfzrRyidIsNotNull() {
            addCriterion("qyfzr_ryid is not null");
            return (Criteria) this;
        }

        public Criteria andQyfzrRyidEqualTo(String value) {
            addCriterion("qyfzr_ryid =", value, "qyfzrRyid");
            return (Criteria) this;
        }

        public Criteria andQyfzrRyidNotEqualTo(String value) {
            addCriterion("qyfzr_ryid <>", value, "qyfzrRyid");
            return (Criteria) this;
        }

        public Criteria andQyfzrRyidGreaterThan(String value) {
            addCriterion("qyfzr_ryid >", value, "qyfzrRyid");
            return (Criteria) this;
        }

        public Criteria andQyfzrRyidGreaterThanOrEqualTo(String value) {
            addCriterion("qyfzr_ryid >=", value, "qyfzrRyid");
            return (Criteria) this;
        }

        public Criteria andQyfzrRyidLessThan(String value) {
            addCriterion("qyfzr_ryid <", value, "qyfzrRyid");
            return (Criteria) this;
        }

        public Criteria andQyfzrRyidLessThanOrEqualTo(String value) {
            addCriterion("qyfzr_ryid <=", value, "qyfzrRyid");
            return (Criteria) this;
        }

        public Criteria andQyfzrRyidLike(String value) {
            addCriterion("qyfzr_ryid like", value, "qyfzrRyid");
            return (Criteria) this;
        }

        public Criteria andQyfzrRyidNotLike(String value) {
            addCriterion("qyfzr_ryid not like", value, "qyfzrRyid");
            return (Criteria) this;
        }

        public Criteria andQyfzrRyidIn(List<String> values) {
            addCriterion("qyfzr_ryid in", values, "qyfzrRyid");
            return (Criteria) this;
        }

        public Criteria andQyfzrRyidNotIn(List<String> values) {
            addCriterion("qyfzr_ryid not in", values, "qyfzrRyid");
            return (Criteria) this;
        }

        public Criteria andQyfzrRyidBetween(String value1, String value2) {
            addCriterion("qyfzr_ryid between", value1, value2, "qyfzrRyid");
            return (Criteria) this;
        }

        public Criteria andQyfzrRyidNotBetween(String value1, String value2) {
            addCriterion("qyfzr_ryid not between", value1, value2, "qyfzrRyid");
            return (Criteria) this;
        }

        public Criteria andQyfzrIsNull() {
            addCriterion("qyfzr is null");
            return (Criteria) this;
        }

        public Criteria andQyfzrIsNotNull() {
            addCriterion("qyfzr is not null");
            return (Criteria) this;
        }

        public Criteria andQyfzrEqualTo(String value) {
            addCriterion("qyfzr =", value, "qyfzr");
            return (Criteria) this;
        }

        public Criteria andQyfzrNotEqualTo(String value) {
            addCriterion("qyfzr <>", value, "qyfzr");
            return (Criteria) this;
        }

        public Criteria andQyfzrGreaterThan(String value) {
            addCriterion("qyfzr >", value, "qyfzr");
            return (Criteria) this;
        }

        public Criteria andQyfzrGreaterThanOrEqualTo(String value) {
            addCriterion("qyfzr >=", value, "qyfzr");
            return (Criteria) this;
        }

        public Criteria andQyfzrLessThan(String value) {
            addCriterion("qyfzr <", value, "qyfzr");
            return (Criteria) this;
        }

        public Criteria andQyfzrLessThanOrEqualTo(String value) {
            addCriterion("qyfzr <=", value, "qyfzr");
            return (Criteria) this;
        }

        public Criteria andQyfzrLike(String value) {
            addCriterion("qyfzr like", value, "qyfzr");
            return (Criteria) this;
        }

        public Criteria andQyfzrNotLike(String value) {
            addCriterion("qyfzr not like", value, "qyfzr");
            return (Criteria) this;
        }

        public Criteria andQyfzrIn(List<String> values) {
            addCriterion("qyfzr in", values, "qyfzr");
            return (Criteria) this;
        }

        public Criteria andQyfzrNotIn(List<String> values) {
            addCriterion("qyfzr not in", values, "qyfzr");
            return (Criteria) this;
        }

        public Criteria andQyfzrBetween(String value1, String value2) {
            addCriterion("qyfzr between", value1, value2, "qyfzr");
            return (Criteria) this;
        }

        public Criteria andQyfzrNotBetween(String value1, String value2) {
            addCriterion("qyfzr not between", value1, value2, "qyfzr");
            return (Criteria) this;
        }

        public Criteria andCwfzrRyidIsNull() {
            addCriterion("cwfzr_ryid is null");
            return (Criteria) this;
        }

        public Criteria andCwfzrRyidIsNotNull() {
            addCriterion("cwfzr_ryid is not null");
            return (Criteria) this;
        }

        public Criteria andCwfzrRyidEqualTo(String value) {
            addCriterion("cwfzr_ryid =", value, "cwfzrRyid");
            return (Criteria) this;
        }

        public Criteria andCwfzrRyidNotEqualTo(String value) {
            addCriterion("cwfzr_ryid <>", value, "cwfzrRyid");
            return (Criteria) this;
        }

        public Criteria andCwfzrRyidGreaterThan(String value) {
            addCriterion("cwfzr_ryid >", value, "cwfzrRyid");
            return (Criteria) this;
        }

        public Criteria andCwfzrRyidGreaterThanOrEqualTo(String value) {
            addCriterion("cwfzr_ryid >=", value, "cwfzrRyid");
            return (Criteria) this;
        }

        public Criteria andCwfzrRyidLessThan(String value) {
            addCriterion("cwfzr_ryid <", value, "cwfzrRyid");
            return (Criteria) this;
        }

        public Criteria andCwfzrRyidLessThanOrEqualTo(String value) {
            addCriterion("cwfzr_ryid <=", value, "cwfzrRyid");
            return (Criteria) this;
        }

        public Criteria andCwfzrRyidLike(String value) {
            addCriterion("cwfzr_ryid like", value, "cwfzrRyid");
            return (Criteria) this;
        }

        public Criteria andCwfzrRyidNotLike(String value) {
            addCriterion("cwfzr_ryid not like", value, "cwfzrRyid");
            return (Criteria) this;
        }

        public Criteria andCwfzrRyidIn(List<String> values) {
            addCriterion("cwfzr_ryid in", values, "cwfzrRyid");
            return (Criteria) this;
        }

        public Criteria andCwfzrRyidNotIn(List<String> values) {
            addCriterion("cwfzr_ryid not in", values, "cwfzrRyid");
            return (Criteria) this;
        }

        public Criteria andCwfzrRyidBetween(String value1, String value2) {
            addCriterion("cwfzr_ryid between", value1, value2, "cwfzrRyid");
            return (Criteria) this;
        }

        public Criteria andCwfzrRyidNotBetween(String value1, String value2) {
            addCriterion("cwfzr_ryid not between", value1, value2, "cwfzrRyid");
            return (Criteria) this;
        }

        public Criteria andCwfzrIsNull() {
            addCriterion("cwfzr is null");
            return (Criteria) this;
        }

        public Criteria andCwfzrIsNotNull() {
            addCriterion("cwfzr is not null");
            return (Criteria) this;
        }

        public Criteria andCwfzrEqualTo(String value) {
            addCriterion("cwfzr =", value, "cwfzr");
            return (Criteria) this;
        }

        public Criteria andCwfzrNotEqualTo(String value) {
            addCriterion("cwfzr <>", value, "cwfzr");
            return (Criteria) this;
        }

        public Criteria andCwfzrGreaterThan(String value) {
            addCriterion("cwfzr >", value, "cwfzr");
            return (Criteria) this;
        }

        public Criteria andCwfzrGreaterThanOrEqualTo(String value) {
            addCriterion("cwfzr >=", value, "cwfzr");
            return (Criteria) this;
        }

        public Criteria andCwfzrLessThan(String value) {
            addCriterion("cwfzr <", value, "cwfzr");
            return (Criteria) this;
        }

        public Criteria andCwfzrLessThanOrEqualTo(String value) {
            addCriterion("cwfzr <=", value, "cwfzr");
            return (Criteria) this;
        }

        public Criteria andCwfzrLike(String value) {
            addCriterion("cwfzr like", value, "cwfzr");
            return (Criteria) this;
        }

        public Criteria andCwfzrNotLike(String value) {
            addCriterion("cwfzr not like", value, "cwfzr");
            return (Criteria) this;
        }

        public Criteria andCwfzrIn(List<String> values) {
            addCriterion("cwfzr in", values, "cwfzr");
            return (Criteria) this;
        }

        public Criteria andCwfzrNotIn(List<String> values) {
            addCriterion("cwfzr not in", values, "cwfzr");
            return (Criteria) this;
        }

        public Criteria andCwfzrBetween(String value1, String value2) {
            addCriterion("cwfzr between", value1, value2, "cwfzr");
            return (Criteria) this;
        }

        public Criteria andCwfzrNotBetween(String value1, String value2) {
            addCriterion("cwfzr not between", value1, value2, "cwfzr");
            return (Criteria) this;
        }

        public Criteria andJsfzrRyidIsNull() {
            addCriterion("jsfzr_ryid is null");
            return (Criteria) this;
        }

        public Criteria andJsfzrRyidIsNotNull() {
            addCriterion("jsfzr_ryid is not null");
            return (Criteria) this;
        }

        public Criteria andJsfzrRyidEqualTo(String value) {
            addCriterion("jsfzr_ryid =", value, "jsfzrRyid");
            return (Criteria) this;
        }

        public Criteria andJsfzrRyidNotEqualTo(String value) {
            addCriterion("jsfzr_ryid <>", value, "jsfzrRyid");
            return (Criteria) this;
        }

        public Criteria andJsfzrRyidGreaterThan(String value) {
            addCriterion("jsfzr_ryid >", value, "jsfzrRyid");
            return (Criteria) this;
        }

        public Criteria andJsfzrRyidGreaterThanOrEqualTo(String value) {
            addCriterion("jsfzr_ryid >=", value, "jsfzrRyid");
            return (Criteria) this;
        }

        public Criteria andJsfzrRyidLessThan(String value) {
            addCriterion("jsfzr_ryid <", value, "jsfzrRyid");
            return (Criteria) this;
        }

        public Criteria andJsfzrRyidLessThanOrEqualTo(String value) {
            addCriterion("jsfzr_ryid <=", value, "jsfzrRyid");
            return (Criteria) this;
        }

        public Criteria andJsfzrRyidLike(String value) {
            addCriterion("jsfzr_ryid like", value, "jsfzrRyid");
            return (Criteria) this;
        }

        public Criteria andJsfzrRyidNotLike(String value) {
            addCriterion("jsfzr_ryid not like", value, "jsfzrRyid");
            return (Criteria) this;
        }

        public Criteria andJsfzrRyidIn(List<String> values) {
            addCriterion("jsfzr_ryid in", values, "jsfzrRyid");
            return (Criteria) this;
        }

        public Criteria andJsfzrRyidNotIn(List<String> values) {
            addCriterion("jsfzr_ryid not in", values, "jsfzrRyid");
            return (Criteria) this;
        }

        public Criteria andJsfzrRyidBetween(String value1, String value2) {
            addCriterion("jsfzr_ryid between", value1, value2, "jsfzrRyid");
            return (Criteria) this;
        }

        public Criteria andJsfzrRyidNotBetween(String value1, String value2) {
            addCriterion("jsfzr_ryid not between", value1, value2, "jsfzrRyid");
            return (Criteria) this;
        }

        public Criteria andJsfzrIsNull() {
            addCriterion("jsfzr is null");
            return (Criteria) this;
        }

        public Criteria andJsfzrIsNotNull() {
            addCriterion("jsfzr is not null");
            return (Criteria) this;
        }

        public Criteria andJsfzrEqualTo(String value) {
            addCriterion("jsfzr =", value, "jsfzr");
            return (Criteria) this;
        }

        public Criteria andJsfzrNotEqualTo(String value) {
            addCriterion("jsfzr <>", value, "jsfzr");
            return (Criteria) this;
        }

        public Criteria andJsfzrGreaterThan(String value) {
            addCriterion("jsfzr >", value, "jsfzr");
            return (Criteria) this;
        }

        public Criteria andJsfzrGreaterThanOrEqualTo(String value) {
            addCriterion("jsfzr >=", value, "jsfzr");
            return (Criteria) this;
        }

        public Criteria andJsfzrLessThan(String value) {
            addCriterion("jsfzr <", value, "jsfzr");
            return (Criteria) this;
        }

        public Criteria andJsfzrLessThanOrEqualTo(String value) {
            addCriterion("jsfzr <=", value, "jsfzr");
            return (Criteria) this;
        }

        public Criteria andJsfzrLike(String value) {
            addCriterion("jsfzr like", value, "jsfzr");
            return (Criteria) this;
        }

        public Criteria andJsfzrNotLike(String value) {
            addCriterion("jsfzr not like", value, "jsfzr");
            return (Criteria) this;
        }

        public Criteria andJsfzrIn(List<String> values) {
            addCriterion("jsfzr in", values, "jsfzr");
            return (Criteria) this;
        }

        public Criteria andJsfzrNotIn(List<String> values) {
            addCriterion("jsfzr not in", values, "jsfzr");
            return (Criteria) this;
        }

        public Criteria andJsfzrBetween(String value1, String value2) {
            addCriterion("jsfzr between", value1, value2, "jsfzr");
            return (Criteria) this;
        }

        public Criteria andJsfzrNotBetween(String value1, String value2) {
            addCriterion("jsfzr not between", value1, value2, "jsfzr");
            return (Criteria) this;
        }

        public Criteria andAqfzrRyidIsNull() {
            addCriterion("aqfzr_ryid is null");
            return (Criteria) this;
        }

        public Criteria andAqfzrRyidIsNotNull() {
            addCriterion("aqfzr_ryid is not null");
            return (Criteria) this;
        }

        public Criteria andAqfzrRyidEqualTo(String value) {
            addCriterion("aqfzr_ryid =", value, "aqfzrRyid");
            return (Criteria) this;
        }

        public Criteria andAqfzrRyidNotEqualTo(String value) {
            addCriterion("aqfzr_ryid <>", value, "aqfzrRyid");
            return (Criteria) this;
        }

        public Criteria andAqfzrRyidGreaterThan(String value) {
            addCriterion("aqfzr_ryid >", value, "aqfzrRyid");
            return (Criteria) this;
        }

        public Criteria andAqfzrRyidGreaterThanOrEqualTo(String value) {
            addCriterion("aqfzr_ryid >=", value, "aqfzrRyid");
            return (Criteria) this;
        }

        public Criteria andAqfzrRyidLessThan(String value) {
            addCriterion("aqfzr_ryid <", value, "aqfzrRyid");
            return (Criteria) this;
        }

        public Criteria andAqfzrRyidLessThanOrEqualTo(String value) {
            addCriterion("aqfzr_ryid <=", value, "aqfzrRyid");
            return (Criteria) this;
        }

        public Criteria andAqfzrRyidLike(String value) {
            addCriterion("aqfzr_ryid like", value, "aqfzrRyid");
            return (Criteria) this;
        }

        public Criteria andAqfzrRyidNotLike(String value) {
            addCriterion("aqfzr_ryid not like", value, "aqfzrRyid");
            return (Criteria) this;
        }

        public Criteria andAqfzrRyidIn(List<String> values) {
            addCriterion("aqfzr_ryid in", values, "aqfzrRyid");
            return (Criteria) this;
        }

        public Criteria andAqfzrRyidNotIn(List<String> values) {
            addCriterion("aqfzr_ryid not in", values, "aqfzrRyid");
            return (Criteria) this;
        }

        public Criteria andAqfzrRyidBetween(String value1, String value2) {
            addCriterion("aqfzr_ryid between", value1, value2, "aqfzrRyid");
            return (Criteria) this;
        }

        public Criteria andAqfzrRyidNotBetween(String value1, String value2) {
            addCriterion("aqfzr_ryid not between", value1, value2, "aqfzrRyid");
            return (Criteria) this;
        }

        public Criteria andAqfzrIsNull() {
            addCriterion("aqfzr is null");
            return (Criteria) this;
        }

        public Criteria andAqfzrIsNotNull() {
            addCriterion("aqfzr is not null");
            return (Criteria) this;
        }

        public Criteria andAqfzrEqualTo(String value) {
            addCriterion("aqfzr =", value, "aqfzr");
            return (Criteria) this;
        }

        public Criteria andAqfzrNotEqualTo(String value) {
            addCriterion("aqfzr <>", value, "aqfzr");
            return (Criteria) this;
        }

        public Criteria andAqfzrGreaterThan(String value) {
            addCriterion("aqfzr >", value, "aqfzr");
            return (Criteria) this;
        }

        public Criteria andAqfzrGreaterThanOrEqualTo(String value) {
            addCriterion("aqfzr >=", value, "aqfzr");
            return (Criteria) this;
        }

        public Criteria andAqfzrLessThan(String value) {
            addCriterion("aqfzr <", value, "aqfzr");
            return (Criteria) this;
        }

        public Criteria andAqfzrLessThanOrEqualTo(String value) {
            addCriterion("aqfzr <=", value, "aqfzr");
            return (Criteria) this;
        }

        public Criteria andAqfzrLike(String value) {
            addCriterion("aqfzr like", value, "aqfzr");
            return (Criteria) this;
        }

        public Criteria andAqfzrNotLike(String value) {
            addCriterion("aqfzr not like", value, "aqfzr");
            return (Criteria) this;
        }

        public Criteria andAqfzrIn(List<String> values) {
            addCriterion("aqfzr in", values, "aqfzr");
            return (Criteria) this;
        }

        public Criteria andAqfzrNotIn(List<String> values) {
            addCriterion("aqfzr not in", values, "aqfzr");
            return (Criteria) this;
        }

        public Criteria andAqfzrBetween(String value1, String value2) {
            addCriterion("aqfzr between", value1, value2, "aqfzr");
            return (Criteria) this;
        }

        public Criteria andAqfzrNotBetween(String value1, String value2) {
            addCriterion("aqfzr not between", value1, value2, "aqfzr");
            return (Criteria) this;
        }

        public Criteria andDatastateIsNull() {
            addCriterion("DataState is null");
            return (Criteria) this;
        }

        public Criteria andDatastateIsNotNull() {
            addCriterion("DataState is not null");
            return (Criteria) this;
        }

        public Criteria andDatastateEqualTo(Integer value) {
            addCriterion("DataState =", value, "datastate");
            return (Criteria) this;
        }

        public Criteria andDatastateNotEqualTo(Integer value) {
            addCriterion("DataState <>", value, "datastate");
            return (Criteria) this;
        }

        public Criteria andDatastateGreaterThan(Integer value) {
            addCriterion("DataState >", value, "datastate");
            return (Criteria) this;
        }

        public Criteria andDatastateGreaterThanOrEqualTo(Integer value) {
            addCriterion("DataState >=", value, "datastate");
            return (Criteria) this;
        }

        public Criteria andDatastateLessThan(Integer value) {
            addCriterion("DataState <", value, "datastate");
            return (Criteria) this;
        }

        public Criteria andDatastateLessThanOrEqualTo(Integer value) {
            addCriterion("DataState <=", value, "datastate");
            return (Criteria) this;
        }

        public Criteria andDatastateIn(List<Integer> values) {
            addCriterion("DataState in", values, "datastate");
            return (Criteria) this;
        }

        public Criteria andDatastateNotIn(List<Integer> values) {
            addCriterion("DataState not in", values, "datastate");
            return (Criteria) this;
        }

        public Criteria andDatastateBetween(Integer value1, Integer value2) {
            addCriterion("DataState between", value1, value2, "datastate");
            return (Criteria) this;
        }

        public Criteria andDatastateNotBetween(Integer value1, Integer value2) {
            addCriterion("DataState not between", value1, value2, "datastate");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("tag like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("tag not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("tag not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andXgrIsNull() {
            addCriterion("xgr is null");
            return (Criteria) this;
        }

        public Criteria andXgrIsNotNull() {
            addCriterion("xgr is not null");
            return (Criteria) this;
        }

        public Criteria andXgrEqualTo(String value) {
            addCriterion("xgr =", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrNotEqualTo(String value) {
            addCriterion("xgr <>", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrGreaterThan(String value) {
            addCriterion("xgr >", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrGreaterThanOrEqualTo(String value) {
            addCriterion("xgr >=", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrLessThan(String value) {
            addCriterion("xgr <", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrLessThanOrEqualTo(String value) {
            addCriterion("xgr <=", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrLike(String value) {
            addCriterion("xgr like", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrNotLike(String value) {
            addCriterion("xgr not like", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrIn(List<String> values) {
            addCriterion("xgr in", values, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrNotIn(List<String> values) {
            addCriterion("xgr not in", values, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrBetween(String value1, String value2) {
            addCriterion("xgr between", value1, value2, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrNotBetween(String value1, String value2) {
            addCriterion("xgr not between", value1, value2, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrqsjIsNull() {
            addCriterion("xgrqsj is null");
            return (Criteria) this;
        }

        public Criteria andXgrqsjIsNotNull() {
            addCriterion("xgrqsj is not null");
            return (Criteria) this;
        }

        public Criteria andXgrqsjEqualTo(Date value) {
            addCriterion("xgrqsj =", value, "xgrqsj");
            return (Criteria) this;
        }

        public Criteria andXgrqsjNotEqualTo(Date value) {
            addCriterion("xgrqsj <>", value, "xgrqsj");
            return (Criteria) this;
        }

        public Criteria andXgrqsjGreaterThan(Date value) {
            addCriterion("xgrqsj >", value, "xgrqsj");
            return (Criteria) this;
        }

        public Criteria andXgrqsjGreaterThanOrEqualTo(Date value) {
            addCriterion("xgrqsj >=", value, "xgrqsj");
            return (Criteria) this;
        }

        public Criteria andXgrqsjLessThan(Date value) {
            addCriterion("xgrqsj <", value, "xgrqsj");
            return (Criteria) this;
        }

        public Criteria andXgrqsjLessThanOrEqualTo(Date value) {
            addCriterion("xgrqsj <=", value, "xgrqsj");
            return (Criteria) this;
        }

        public Criteria andXgrqsjIn(List<Date> values) {
            addCriterion("xgrqsj in", values, "xgrqsj");
            return (Criteria) this;
        }

        public Criteria andXgrqsjNotIn(List<Date> values) {
            addCriterion("xgrqsj not in", values, "xgrqsj");
            return (Criteria) this;
        }

        public Criteria andXgrqsjBetween(Date value1, Date value2) {
            addCriterion("xgrqsj between", value1, value2, "xgrqsj");
            return (Criteria) this;
        }

        public Criteria andXgrqsjNotBetween(Date value1, Date value2) {
            addCriterion("xgrqsj not between", value1, value2, "xgrqsj");
            return (Criteria) this;
        }

        public Criteria andXmjlzsIsNull() {
            addCriterion("xmjlzs is null");
            return (Criteria) this;
        }

        public Criteria andXmjlzsIsNotNull() {
            addCriterion("xmjlzs is not null");
            return (Criteria) this;
        }

        public Criteria andXmjlzsEqualTo(Integer value) {
            addCriterion("xmjlzs =", value, "xmjlzs");
            return (Criteria) this;
        }

        public Criteria andXmjlzsNotEqualTo(Integer value) {
            addCriterion("xmjlzs <>", value, "xmjlzs");
            return (Criteria) this;
        }

        public Criteria andXmjlzsGreaterThan(Integer value) {
            addCriterion("xmjlzs >", value, "xmjlzs");
            return (Criteria) this;
        }

        public Criteria andXmjlzsGreaterThanOrEqualTo(Integer value) {
            addCriterion("xmjlzs >=", value, "xmjlzs");
            return (Criteria) this;
        }

        public Criteria andXmjlzsLessThan(Integer value) {
            addCriterion("xmjlzs <", value, "xmjlzs");
            return (Criteria) this;
        }

        public Criteria andXmjlzsLessThanOrEqualTo(Integer value) {
            addCriterion("xmjlzs <=", value, "xmjlzs");
            return (Criteria) this;
        }

        public Criteria andXmjlzsIn(List<Integer> values) {
            addCriterion("xmjlzs in", values, "xmjlzs");
            return (Criteria) this;
        }

        public Criteria andXmjlzsNotIn(List<Integer> values) {
            addCriterion("xmjlzs not in", values, "xmjlzs");
            return (Criteria) this;
        }

        public Criteria andXmjlzsBetween(Integer value1, Integer value2) {
            addCriterion("xmjlzs between", value1, value2, "xmjlzs");
            return (Criteria) this;
        }

        public Criteria andXmjlzsNotBetween(Integer value1, Integer value2) {
            addCriterion("xmjlzs not between", value1, value2, "xmjlzs");
            return (Criteria) this;
        }

        public Criteria andAqyIsNull() {
            addCriterion("aqy is null");
            return (Criteria) this;
        }

        public Criteria andAqyIsNotNull() {
            addCriterion("aqy is not null");
            return (Criteria) this;
        }

        public Criteria andAqyEqualTo(Integer value) {
            addCriterion("aqy =", value, "aqy");
            return (Criteria) this;
        }

        public Criteria andAqyNotEqualTo(Integer value) {
            addCriterion("aqy <>", value, "aqy");
            return (Criteria) this;
        }

        public Criteria andAqyGreaterThan(Integer value) {
            addCriterion("aqy >", value, "aqy");
            return (Criteria) this;
        }

        public Criteria andAqyGreaterThanOrEqualTo(Integer value) {
            addCriterion("aqy >=", value, "aqy");
            return (Criteria) this;
        }

        public Criteria andAqyLessThan(Integer value) {
            addCriterion("aqy <", value, "aqy");
            return (Criteria) this;
        }

        public Criteria andAqyLessThanOrEqualTo(Integer value) {
            addCriterion("aqy <=", value, "aqy");
            return (Criteria) this;
        }

        public Criteria andAqyIn(List<Integer> values) {
            addCriterion("aqy in", values, "aqy");
            return (Criteria) this;
        }

        public Criteria andAqyNotIn(List<Integer> values) {
            addCriterion("aqy not in", values, "aqy");
            return (Criteria) this;
        }

        public Criteria andAqyBetween(Integer value1, Integer value2) {
            addCriterion("aqy between", value1, value2, "aqy");
            return (Criteria) this;
        }

        public Criteria andAqyNotBetween(Integer value1, Integer value2) {
            addCriterion("aqy not between", value1, value2, "aqy");
            return (Criteria) this;
        }

        public Criteria andZjyIsNull() {
            addCriterion("zjy is null");
            return (Criteria) this;
        }

        public Criteria andZjyIsNotNull() {
            addCriterion("zjy is not null");
            return (Criteria) this;
        }

        public Criteria andZjyEqualTo(Integer value) {
            addCriterion("zjy =", value, "zjy");
            return (Criteria) this;
        }

        public Criteria andZjyNotEqualTo(Integer value) {
            addCriterion("zjy <>", value, "zjy");
            return (Criteria) this;
        }

        public Criteria andZjyGreaterThan(Integer value) {
            addCriterion("zjy >", value, "zjy");
            return (Criteria) this;
        }

        public Criteria andZjyGreaterThanOrEqualTo(Integer value) {
            addCriterion("zjy >=", value, "zjy");
            return (Criteria) this;
        }

        public Criteria andZjyLessThan(Integer value) {
            addCriterion("zjy <", value, "zjy");
            return (Criteria) this;
        }

        public Criteria andZjyLessThanOrEqualTo(Integer value) {
            addCriterion("zjy <=", value, "zjy");
            return (Criteria) this;
        }

        public Criteria andZjyIn(List<Integer> values) {
            addCriterion("zjy in", values, "zjy");
            return (Criteria) this;
        }

        public Criteria andZjyNotIn(List<Integer> values) {
            addCriterion("zjy not in", values, "zjy");
            return (Criteria) this;
        }

        public Criteria andZjyBetween(Integer value1, Integer value2) {
            addCriterion("zjy between", value1, value2, "zjy");
            return (Criteria) this;
        }

        public Criteria andZjyNotBetween(Integer value1, Integer value2) {
            addCriterion("zjy not between", value1, value2, "zjy");
            return (Criteria) this;
        }

        public Criteria andSgyIsNull() {
            addCriterion("sgy is null");
            return (Criteria) this;
        }

        public Criteria andSgyIsNotNull() {
            addCriterion("sgy is not null");
            return (Criteria) this;
        }

        public Criteria andSgyEqualTo(Integer value) {
            addCriterion("sgy =", value, "sgy");
            return (Criteria) this;
        }

        public Criteria andSgyNotEqualTo(Integer value) {
            addCriterion("sgy <>", value, "sgy");
            return (Criteria) this;
        }

        public Criteria andSgyGreaterThan(Integer value) {
            addCriterion("sgy >", value, "sgy");
            return (Criteria) this;
        }

        public Criteria andSgyGreaterThanOrEqualTo(Integer value) {
            addCriterion("sgy >=", value, "sgy");
            return (Criteria) this;
        }

        public Criteria andSgyLessThan(Integer value) {
            addCriterion("sgy <", value, "sgy");
            return (Criteria) this;
        }

        public Criteria andSgyLessThanOrEqualTo(Integer value) {
            addCriterion("sgy <=", value, "sgy");
            return (Criteria) this;
        }

        public Criteria andSgyIn(List<Integer> values) {
            addCriterion("sgy in", values, "sgy");
            return (Criteria) this;
        }

        public Criteria andSgyNotIn(List<Integer> values) {
            addCriterion("sgy not in", values, "sgy");
            return (Criteria) this;
        }

        public Criteria andSgyBetween(Integer value1, Integer value2) {
            addCriterion("sgy between", value1, value2, "sgy");
            return (Criteria) this;
        }

        public Criteria andSgyNotBetween(Integer value1, Integer value2) {
            addCriterion("sgy not between", value1, value2, "sgy");
            return (Criteria) this;
        }

        public Criteria andTyshxydmIsNull() {
            addCriterion("tyshxydm is null");
            return (Criteria) this;
        }

        public Criteria andTyshxydmIsNotNull() {
            addCriterion("tyshxydm is not null");
            return (Criteria) this;
        }

        public Criteria andTyshxydmEqualTo(String value) {
            addCriterion("tyshxydm =", value, "tyshxydm");
            return (Criteria) this;
        }

        public Criteria andTyshxydmNotEqualTo(String value) {
            addCriterion("tyshxydm <>", value, "tyshxydm");
            return (Criteria) this;
        }

        public Criteria andTyshxydmGreaterThan(String value) {
            addCriterion("tyshxydm >", value, "tyshxydm");
            return (Criteria) this;
        }

        public Criteria andTyshxydmGreaterThanOrEqualTo(String value) {
            addCriterion("tyshxydm >=", value, "tyshxydm");
            return (Criteria) this;
        }

        public Criteria andTyshxydmLessThan(String value) {
            addCriterion("tyshxydm <", value, "tyshxydm");
            return (Criteria) this;
        }

        public Criteria andTyshxydmLessThanOrEqualTo(String value) {
            addCriterion("tyshxydm <=", value, "tyshxydm");
            return (Criteria) this;
        }

        public Criteria andTyshxydmLike(String value) {
            addCriterion("tyshxydm like", value, "tyshxydm");
            return (Criteria) this;
        }

        public Criteria andTyshxydmNotLike(String value) {
            addCriterion("tyshxydm not like", value, "tyshxydm");
            return (Criteria) this;
        }

        public Criteria andTyshxydmIn(List<String> values) {
            addCriterion("tyshxydm in", values, "tyshxydm");
            return (Criteria) this;
        }

        public Criteria andTyshxydmNotIn(List<String> values) {
            addCriterion("tyshxydm not in", values, "tyshxydm");
            return (Criteria) this;
        }

        public Criteria andTyshxydmBetween(String value1, String value2) {
            addCriterion("tyshxydm between", value1, value2, "tyshxydm");
            return (Criteria) this;
        }

        public Criteria andTyshxydmNotBetween(String value1, String value2) {
            addCriterion("tyshxydm not between", value1, value2, "tyshxydm");
            return (Criteria) this;
        }

        public Criteria andQyidLikeInsensitive(String value) {
            addCriterion("upper(qyID) like", value.toUpperCase(), "qyid");
            return (Criteria) this;
        }

        public Criteria andUseridLikeInsensitive(String value) {
            addCriterion("upper(UserID) like", value.toUpperCase(), "userid");
            return (Criteria) this;
        }

        public Criteria andQymcLikeInsensitive(String value) {
            addCriterion("upper(qymc) like", value.toUpperCase(), "qymc");
            return (Criteria) this;
        }

        public Criteria andZzjgdmLikeInsensitive(String value) {
            addCriterion("upper(zzjgdm) like", value.toUpperCase(), "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andYyzzzchLikeInsensitive(String value) {
            addCriterion("upper(yyzzzch) like", value.toUpperCase(), "yyzzzch");
            return (Criteria) this;
        }

        public Criteria andKhyhLikeInsensitive(String value) {
            addCriterion("upper(khyh) like", value.toUpperCase(), "khyh");
            return (Criteria) this;
        }

        public Criteria andYhzhLikeInsensitive(String value) {
            addCriterion("upper(yhzh) like", value.toUpperCase(), "yhzh");
            return (Criteria) this;
        }

        public Criteria andSfsyqLikeInsensitive(String value) {
            addCriterion("upper(sfsyq) like", value.toUpperCase(), "sfsyq");
            return (Criteria) this;
        }

        public Criteria andSylxLikeInsensitive(String value) {
            addCriterion("upper(sylx) like", value.toUpperCase(), "sylx");
            return (Criteria) this;
        }

        public Criteria andProvinceidLikeInsensitive(String value) {
            addCriterion("upper(ProvinceID) like", value.toUpperCase(), "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceLikeInsensitive(String value) {
            addCriterion("upper(Province) like", value.toUpperCase(), "province");
            return (Criteria) this;
        }

        public Criteria andCityidLikeInsensitive(String value) {
            addCriterion("upper(CityID) like", value.toUpperCase(), "cityid");
            return (Criteria) this;
        }

        public Criteria andCityLikeInsensitive(String value) {
            addCriterion("upper(City) like", value.toUpperCase(), "city");
            return (Criteria) this;
        }

        public Criteria andCountyidLikeInsensitive(String value) {
            addCriterion("upper(CountyID) like", value.toUpperCase(), "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyLikeInsensitive(String value) {
            addCriterion("upper(County) like", value.toUpperCase(), "county");
            return (Criteria) this;
        }

        public Criteria andZcddLikeInsensitive(String value) {
            addCriterion("upper(zcdd) like", value.toUpperCase(), "zcdd");
            return (Criteria) this;
        }

        public Criteria andJjxzLikeInsensitive(String value) {
            addCriterion("upper(jjxz) like", value.toUpperCase(), "jjxz");
            return (Criteria) this;
        }

        public Criteria andZczbLikeInsensitive(String value) {
            addCriterion("upper(zczb) like", value.toUpperCase(), "zczb");
            return (Criteria) this;
        }

        public Criteria andZyfwLikeInsensitive(String value) {
            addCriterion("upper(zyfw) like", value.toUpperCase(), "zyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwLikeInsensitive(String value) {
            addCriterion("upper(jyfw) like", value.toUpperCase(), "jyfw");
            return (Criteria) this;
        }

        public Criteria andQyjjLikeInsensitive(String value) {
            addCriterion("upper(qyjj) like", value.toUpperCase(), "qyjj");
            return (Criteria) this;
        }

        public Criteria andXxddLikeInsensitive(String value) {
            addCriterion("upper(xxdd) like", value.toUpperCase(), "xxdd");
            return (Criteria) this;
        }

        public Criteria andYzbmLikeInsensitive(String value) {
            addCriterion("upper(yzbm) like", value.toUpperCase(), "yzbm");
            return (Criteria) this;
        }

        public Criteria andCzLikeInsensitive(String value) {
            addCriterion("upper(cz) like", value.toUpperCase(), "cz");
            return (Criteria) this;
        }

        public Criteria andEmailLikeInsensitive(String value) {
            addCriterion("upper(email) like", value.toUpperCase(), "email");
            return (Criteria) this;
        }

        public Criteria andWebaddressLikeInsensitive(String value) {
            addCriterion("upper(webAddress) like", value.toUpperCase(), "webaddress");
            return (Criteria) this;
        }

        public Criteria andLxrLikeInsensitive(String value) {
            addCriterion("upper(lxr) like", value.toUpperCase(), "lxr");
            return (Criteria) this;
        }

        public Criteria andLxdhLikeInsensitive(String value) {
            addCriterion("upper(lxdh) like", value.toUpperCase(), "lxdh");
            return (Criteria) this;
        }

        public Criteria andFddbrRyidLikeInsensitive(String value) {
            addCriterion("upper(fddbr_ryid) like", value.toUpperCase(), "fddbrRyid");
            return (Criteria) this;
        }

        public Criteria andFddbrLikeInsensitive(String value) {
            addCriterion("upper(fddbr) like", value.toUpperCase(), "fddbr");
            return (Criteria) this;
        }

        public Criteria andQyfzrRyidLikeInsensitive(String value) {
            addCriterion("upper(qyfzr_ryid) like", value.toUpperCase(), "qyfzrRyid");
            return (Criteria) this;
        }

        public Criteria andQyfzrLikeInsensitive(String value) {
            addCriterion("upper(qyfzr) like", value.toUpperCase(), "qyfzr");
            return (Criteria) this;
        }

        public Criteria andCwfzrRyidLikeInsensitive(String value) {
            addCriterion("upper(cwfzr_ryid) like", value.toUpperCase(), "cwfzrRyid");
            return (Criteria) this;
        }

        public Criteria andCwfzrLikeInsensitive(String value) {
            addCriterion("upper(cwfzr) like", value.toUpperCase(), "cwfzr");
            return (Criteria) this;
        }

        public Criteria andJsfzrRyidLikeInsensitive(String value) {
            addCriterion("upper(jsfzr_ryid) like", value.toUpperCase(), "jsfzrRyid");
            return (Criteria) this;
        }

        public Criteria andJsfzrLikeInsensitive(String value) {
            addCriterion("upper(jsfzr) like", value.toUpperCase(), "jsfzr");
            return (Criteria) this;
        }

        public Criteria andAqfzrRyidLikeInsensitive(String value) {
            addCriterion("upper(aqfzr_ryid) like", value.toUpperCase(), "aqfzrRyid");
            return (Criteria) this;
        }

        public Criteria andAqfzrLikeInsensitive(String value) {
            addCriterion("upper(aqfzr) like", value.toUpperCase(), "aqfzr");
            return (Criteria) this;
        }

        public Criteria andTagLikeInsensitive(String value) {
            addCriterion("upper(tag) like", value.toUpperCase(), "tag");
            return (Criteria) this;
        }

        public Criteria andXgrLikeInsensitive(String value) {
            addCriterion("upper(xgr) like", value.toUpperCase(), "xgr");
            return (Criteria) this;
        }

        public Criteria andTyshxydmLikeInsensitive(String value) {
            addCriterion("upper(tyshxydm) like", value.toUpperCase(), "tyshxydm");
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