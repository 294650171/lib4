package cn.wuxi.js.lib4.crawler.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QyzzmxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QyzzmxExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
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

        public Criteria andCsywlxidIsNull() {
            addCriterion("csywlxID is null");
            return (Criteria) this;
        }

        public Criteria andCsywlxidIsNotNull() {
            addCriterion("csywlxID is not null");
            return (Criteria) this;
        }

        public Criteria andCsywlxidEqualTo(Integer value) {
            addCriterion("csywlxID =", value, "csywlxid");
            return (Criteria) this;
        }

        public Criteria andCsywlxidNotEqualTo(Integer value) {
            addCriterion("csywlxID <>", value, "csywlxid");
            return (Criteria) this;
        }

        public Criteria andCsywlxidGreaterThan(Integer value) {
            addCriterion("csywlxID >", value, "csywlxid");
            return (Criteria) this;
        }

        public Criteria andCsywlxidGreaterThanOrEqualTo(Integer value) {
            addCriterion("csywlxID >=", value, "csywlxid");
            return (Criteria) this;
        }

        public Criteria andCsywlxidLessThan(Integer value) {
            addCriterion("csywlxID <", value, "csywlxid");
            return (Criteria) this;
        }

        public Criteria andCsywlxidLessThanOrEqualTo(Integer value) {
            addCriterion("csywlxID <=", value, "csywlxid");
            return (Criteria) this;
        }

        public Criteria andCsywlxidIn(List<Integer> values) {
            addCriterion("csywlxID in", values, "csywlxid");
            return (Criteria) this;
        }

        public Criteria andCsywlxidNotIn(List<Integer> values) {
            addCriterion("csywlxID not in", values, "csywlxid");
            return (Criteria) this;
        }

        public Criteria andCsywlxidBetween(Integer value1, Integer value2) {
            addCriterion("csywlxID between", value1, value2, "csywlxid");
            return (Criteria) this;
        }

        public Criteria andCsywlxidNotBetween(Integer value1, Integer value2) {
            addCriterion("csywlxID not between", value1, value2, "csywlxid");
            return (Criteria) this;
        }

        public Criteria andCsywlxIsNull() {
            addCriterion("csywlx is null");
            return (Criteria) this;
        }

        public Criteria andCsywlxIsNotNull() {
            addCriterion("csywlx is not null");
            return (Criteria) this;
        }

        public Criteria andCsywlxEqualTo(String value) {
            addCriterion("csywlx =", value, "csywlx");
            return (Criteria) this;
        }

        public Criteria andCsywlxNotEqualTo(String value) {
            addCriterion("csywlx <>", value, "csywlx");
            return (Criteria) this;
        }

        public Criteria andCsywlxGreaterThan(String value) {
            addCriterion("csywlx >", value, "csywlx");
            return (Criteria) this;
        }

        public Criteria andCsywlxGreaterThanOrEqualTo(String value) {
            addCriterion("csywlx >=", value, "csywlx");
            return (Criteria) this;
        }

        public Criteria andCsywlxLessThan(String value) {
            addCriterion("csywlx <", value, "csywlx");
            return (Criteria) this;
        }

        public Criteria andCsywlxLessThanOrEqualTo(String value) {
            addCriterion("csywlx <=", value, "csywlx");
            return (Criteria) this;
        }

        public Criteria andCsywlxLike(String value) {
            addCriterion("csywlx like", value, "csywlx");
            return (Criteria) this;
        }

        public Criteria andCsywlxNotLike(String value) {
            addCriterion("csywlx not like", value, "csywlx");
            return (Criteria) this;
        }

        public Criteria andCsywlxIn(List<String> values) {
            addCriterion("csywlx in", values, "csywlx");
            return (Criteria) this;
        }

        public Criteria andCsywlxNotIn(List<String> values) {
            addCriterion("csywlx not in", values, "csywlx");
            return (Criteria) this;
        }

        public Criteria andCsywlxBetween(String value1, String value2) {
            addCriterion("csywlx between", value1, value2, "csywlx");
            return (Criteria) this;
        }

        public Criteria andCsywlxNotBetween(String value1, String value2) {
            addCriterion("csywlx not between", value1, value2, "csywlx");
            return (Criteria) this;
        }

        public Criteria andZslxidIsNull() {
            addCriterion("zslxID is null");
            return (Criteria) this;
        }

        public Criteria andZslxidIsNotNull() {
            addCriterion("zslxID is not null");
            return (Criteria) this;
        }

        public Criteria andZslxidEqualTo(Integer value) {
            addCriterion("zslxID =", value, "zslxid");
            return (Criteria) this;
        }

        public Criteria andZslxidNotEqualTo(Integer value) {
            addCriterion("zslxID <>", value, "zslxid");
            return (Criteria) this;
        }

        public Criteria andZslxidGreaterThan(Integer value) {
            addCriterion("zslxID >", value, "zslxid");
            return (Criteria) this;
        }

        public Criteria andZslxidGreaterThanOrEqualTo(Integer value) {
            addCriterion("zslxID >=", value, "zslxid");
            return (Criteria) this;
        }

        public Criteria andZslxidLessThan(Integer value) {
            addCriterion("zslxID <", value, "zslxid");
            return (Criteria) this;
        }

        public Criteria andZslxidLessThanOrEqualTo(Integer value) {
            addCriterion("zslxID <=", value, "zslxid");
            return (Criteria) this;
        }

        public Criteria andZslxidIn(List<Integer> values) {
            addCriterion("zslxID in", values, "zslxid");
            return (Criteria) this;
        }

        public Criteria andZslxidNotIn(List<Integer> values) {
            addCriterion("zslxID not in", values, "zslxid");
            return (Criteria) this;
        }

        public Criteria andZslxidBetween(Integer value1, Integer value2) {
            addCriterion("zslxID between", value1, value2, "zslxid");
            return (Criteria) this;
        }

        public Criteria andZslxidNotBetween(Integer value1, Integer value2) {
            addCriterion("zslxID not between", value1, value2, "zslxid");
            return (Criteria) this;
        }

        public Criteria andZslxIsNull() {
            addCriterion("zslx is null");
            return (Criteria) this;
        }

        public Criteria andZslxIsNotNull() {
            addCriterion("zslx is not null");
            return (Criteria) this;
        }

        public Criteria andZslxEqualTo(String value) {
            addCriterion("zslx =", value, "zslx");
            return (Criteria) this;
        }

        public Criteria andZslxNotEqualTo(String value) {
            addCriterion("zslx <>", value, "zslx");
            return (Criteria) this;
        }

        public Criteria andZslxGreaterThan(String value) {
            addCriterion("zslx >", value, "zslx");
            return (Criteria) this;
        }

        public Criteria andZslxGreaterThanOrEqualTo(String value) {
            addCriterion("zslx >=", value, "zslx");
            return (Criteria) this;
        }

        public Criteria andZslxLessThan(String value) {
            addCriterion("zslx <", value, "zslx");
            return (Criteria) this;
        }

        public Criteria andZslxLessThanOrEqualTo(String value) {
            addCriterion("zslx <=", value, "zslx");
            return (Criteria) this;
        }

        public Criteria andZslxLike(String value) {
            addCriterion("zslx like", value, "zslx");
            return (Criteria) this;
        }

        public Criteria andZslxNotLike(String value) {
            addCriterion("zslx not like", value, "zslx");
            return (Criteria) this;
        }

        public Criteria andZslxIn(List<String> values) {
            addCriterion("zslx in", values, "zslx");
            return (Criteria) this;
        }

        public Criteria andZslxNotIn(List<String> values) {
            addCriterion("zslx not in", values, "zslx");
            return (Criteria) this;
        }

        public Criteria andZslxBetween(String value1, String value2) {
            addCriterion("zslx between", value1, value2, "zslx");
            return (Criteria) this;
        }

        public Criteria andZslxNotBetween(String value1, String value2) {
            addCriterion("zslx not between", value1, value2, "zslx");
            return (Criteria) this;
        }

        public Criteria andZzbzIsNull() {
            addCriterion("zzbz is null");
            return (Criteria) this;
        }

        public Criteria andZzbzIsNotNull() {
            addCriterion("zzbz is not null");
            return (Criteria) this;
        }

        public Criteria andZzbzEqualTo(String value) {
            addCriterion("zzbz =", value, "zzbz");
            return (Criteria) this;
        }

        public Criteria andZzbzNotEqualTo(String value) {
            addCriterion("zzbz <>", value, "zzbz");
            return (Criteria) this;
        }

        public Criteria andZzbzGreaterThan(String value) {
            addCriterion("zzbz >", value, "zzbz");
            return (Criteria) this;
        }

        public Criteria andZzbzGreaterThanOrEqualTo(String value) {
            addCriterion("zzbz >=", value, "zzbz");
            return (Criteria) this;
        }

        public Criteria andZzbzLessThan(String value) {
            addCriterion("zzbz <", value, "zzbz");
            return (Criteria) this;
        }

        public Criteria andZzbzLessThanOrEqualTo(String value) {
            addCriterion("zzbz <=", value, "zzbz");
            return (Criteria) this;
        }

        public Criteria andZzbzLike(String value) {
            addCriterion("zzbz like", value, "zzbz");
            return (Criteria) this;
        }

        public Criteria andZzbzNotLike(String value) {
            addCriterion("zzbz not like", value, "zzbz");
            return (Criteria) this;
        }

        public Criteria andZzbzIn(List<String> values) {
            addCriterion("zzbz in", values, "zzbz");
            return (Criteria) this;
        }

        public Criteria andZzbzNotIn(List<String> values) {
            addCriterion("zzbz not in", values, "zzbz");
            return (Criteria) this;
        }

        public Criteria andZzbzBetween(String value1, String value2) {
            addCriterion("zzbz between", value1, value2, "zzbz");
            return (Criteria) this;
        }

        public Criteria andZzbzNotBetween(String value1, String value2) {
            addCriterion("zzbz not between", value1, value2, "zzbz");
            return (Criteria) this;
        }

        public Criteria andZzxlidIsNull() {
            addCriterion("zzxlID is null");
            return (Criteria) this;
        }

        public Criteria andZzxlidIsNotNull() {
            addCriterion("zzxlID is not null");
            return (Criteria) this;
        }

        public Criteria andZzxlidEqualTo(Integer value) {
            addCriterion("zzxlID =", value, "zzxlid");
            return (Criteria) this;
        }

        public Criteria andZzxlidNotEqualTo(Integer value) {
            addCriterion("zzxlID <>", value, "zzxlid");
            return (Criteria) this;
        }

        public Criteria andZzxlidGreaterThan(Integer value) {
            addCriterion("zzxlID >", value, "zzxlid");
            return (Criteria) this;
        }

        public Criteria andZzxlidGreaterThanOrEqualTo(Integer value) {
            addCriterion("zzxlID >=", value, "zzxlid");
            return (Criteria) this;
        }

        public Criteria andZzxlidLessThan(Integer value) {
            addCriterion("zzxlID <", value, "zzxlid");
            return (Criteria) this;
        }

        public Criteria andZzxlidLessThanOrEqualTo(Integer value) {
            addCriterion("zzxlID <=", value, "zzxlid");
            return (Criteria) this;
        }

        public Criteria andZzxlidIn(List<Integer> values) {
            addCriterion("zzxlID in", values, "zzxlid");
            return (Criteria) this;
        }

        public Criteria andZzxlidNotIn(List<Integer> values) {
            addCriterion("zzxlID not in", values, "zzxlid");
            return (Criteria) this;
        }

        public Criteria andZzxlidBetween(Integer value1, Integer value2) {
            addCriterion("zzxlID between", value1, value2, "zzxlid");
            return (Criteria) this;
        }

        public Criteria andZzxlidNotBetween(Integer value1, Integer value2) {
            addCriterion("zzxlID not between", value1, value2, "zzxlid");
            return (Criteria) this;
        }

        public Criteria andZzxlIsNull() {
            addCriterion("zzxl is null");
            return (Criteria) this;
        }

        public Criteria andZzxlIsNotNull() {
            addCriterion("zzxl is not null");
            return (Criteria) this;
        }

        public Criteria andZzxlEqualTo(String value) {
            addCriterion("zzxl =", value, "zzxl");
            return (Criteria) this;
        }

        public Criteria andZzxlNotEqualTo(String value) {
            addCriterion("zzxl <>", value, "zzxl");
            return (Criteria) this;
        }

        public Criteria andZzxlGreaterThan(String value) {
            addCriterion("zzxl >", value, "zzxl");
            return (Criteria) this;
        }

        public Criteria andZzxlGreaterThanOrEqualTo(String value) {
            addCriterion("zzxl >=", value, "zzxl");
            return (Criteria) this;
        }

        public Criteria andZzxlLessThan(String value) {
            addCriterion("zzxl <", value, "zzxl");
            return (Criteria) this;
        }

        public Criteria andZzxlLessThanOrEqualTo(String value) {
            addCriterion("zzxl <=", value, "zzxl");
            return (Criteria) this;
        }

        public Criteria andZzxlLike(String value) {
            addCriterion("zzxl like", value, "zzxl");
            return (Criteria) this;
        }

        public Criteria andZzxlNotLike(String value) {
            addCriterion("zzxl not like", value, "zzxl");
            return (Criteria) this;
        }

        public Criteria andZzxlIn(List<String> values) {
            addCriterion("zzxl in", values, "zzxl");
            return (Criteria) this;
        }

        public Criteria andZzxlNotIn(List<String> values) {
            addCriterion("zzxl not in", values, "zzxl");
            return (Criteria) this;
        }

        public Criteria andZzxlBetween(String value1, String value2) {
            addCriterion("zzxl between", value1, value2, "zzxl");
            return (Criteria) this;
        }

        public Criteria andZzxlNotBetween(String value1, String value2) {
            addCriterion("zzxl not between", value1, value2, "zzxl");
            return (Criteria) this;
        }

        public Criteria andZzhyidIsNull() {
            addCriterion("zzhyID is null");
            return (Criteria) this;
        }

        public Criteria andZzhyidIsNotNull() {
            addCriterion("zzhyID is not null");
            return (Criteria) this;
        }

        public Criteria andZzhyidEqualTo(Integer value) {
            addCriterion("zzhyID =", value, "zzhyid");
            return (Criteria) this;
        }

        public Criteria andZzhyidNotEqualTo(Integer value) {
            addCriterion("zzhyID <>", value, "zzhyid");
            return (Criteria) this;
        }

        public Criteria andZzhyidGreaterThan(Integer value) {
            addCriterion("zzhyID >", value, "zzhyid");
            return (Criteria) this;
        }

        public Criteria andZzhyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("zzhyID >=", value, "zzhyid");
            return (Criteria) this;
        }

        public Criteria andZzhyidLessThan(Integer value) {
            addCriterion("zzhyID <", value, "zzhyid");
            return (Criteria) this;
        }

        public Criteria andZzhyidLessThanOrEqualTo(Integer value) {
            addCriterion("zzhyID <=", value, "zzhyid");
            return (Criteria) this;
        }

        public Criteria andZzhyidIn(List<Integer> values) {
            addCriterion("zzhyID in", values, "zzhyid");
            return (Criteria) this;
        }

        public Criteria andZzhyidNotIn(List<Integer> values) {
            addCriterion("zzhyID not in", values, "zzhyid");
            return (Criteria) this;
        }

        public Criteria andZzhyidBetween(Integer value1, Integer value2) {
            addCriterion("zzhyID between", value1, value2, "zzhyid");
            return (Criteria) this;
        }

        public Criteria andZzhyidNotBetween(Integer value1, Integer value2) {
            addCriterion("zzhyID not between", value1, value2, "zzhyid");
            return (Criteria) this;
        }

        public Criteria andZzhyIsNull() {
            addCriterion("zzhy is null");
            return (Criteria) this;
        }

        public Criteria andZzhyIsNotNull() {
            addCriterion("zzhy is not null");
            return (Criteria) this;
        }

        public Criteria andZzhyEqualTo(String value) {
            addCriterion("zzhy =", value, "zzhy");
            return (Criteria) this;
        }

        public Criteria andZzhyNotEqualTo(String value) {
            addCriterion("zzhy <>", value, "zzhy");
            return (Criteria) this;
        }

        public Criteria andZzhyGreaterThan(String value) {
            addCriterion("zzhy >", value, "zzhy");
            return (Criteria) this;
        }

        public Criteria andZzhyGreaterThanOrEqualTo(String value) {
            addCriterion("zzhy >=", value, "zzhy");
            return (Criteria) this;
        }

        public Criteria andZzhyLessThan(String value) {
            addCriterion("zzhy <", value, "zzhy");
            return (Criteria) this;
        }

        public Criteria andZzhyLessThanOrEqualTo(String value) {
            addCriterion("zzhy <=", value, "zzhy");
            return (Criteria) this;
        }

        public Criteria andZzhyLike(String value) {
            addCriterion("zzhy like", value, "zzhy");
            return (Criteria) this;
        }

        public Criteria andZzhyNotLike(String value) {
            addCriterion("zzhy not like", value, "zzhy");
            return (Criteria) this;
        }

        public Criteria andZzhyIn(List<String> values) {
            addCriterion("zzhy in", values, "zzhy");
            return (Criteria) this;
        }

        public Criteria andZzhyNotIn(List<String> values) {
            addCriterion("zzhy not in", values, "zzhy");
            return (Criteria) this;
        }

        public Criteria andZzhyBetween(String value1, String value2) {
            addCriterion("zzhy between", value1, value2, "zzhy");
            return (Criteria) this;
        }

        public Criteria andZzhyNotBetween(String value1, String value2) {
            addCriterion("zzhy not between", value1, value2, "zzhy");
            return (Criteria) this;
        }

        public Criteria andZzlbidIsNull() {
            addCriterion("zzlbID is null");
            return (Criteria) this;
        }

        public Criteria andZzlbidIsNotNull() {
            addCriterion("zzlbID is not null");
            return (Criteria) this;
        }

        public Criteria andZzlbidEqualTo(Integer value) {
            addCriterion("zzlbID =", value, "zzlbid");
            return (Criteria) this;
        }

        public Criteria andZzlbidNotEqualTo(Integer value) {
            addCriterion("zzlbID <>", value, "zzlbid");
            return (Criteria) this;
        }

        public Criteria andZzlbidGreaterThan(Integer value) {
            addCriterion("zzlbID >", value, "zzlbid");
            return (Criteria) this;
        }

        public Criteria andZzlbidGreaterThanOrEqualTo(Integer value) {
            addCriterion("zzlbID >=", value, "zzlbid");
            return (Criteria) this;
        }

        public Criteria andZzlbidLessThan(Integer value) {
            addCriterion("zzlbID <", value, "zzlbid");
            return (Criteria) this;
        }

        public Criteria andZzlbidLessThanOrEqualTo(Integer value) {
            addCriterion("zzlbID <=", value, "zzlbid");
            return (Criteria) this;
        }

        public Criteria andZzlbidIn(List<Integer> values) {
            addCriterion("zzlbID in", values, "zzlbid");
            return (Criteria) this;
        }

        public Criteria andZzlbidNotIn(List<Integer> values) {
            addCriterion("zzlbID not in", values, "zzlbid");
            return (Criteria) this;
        }

        public Criteria andZzlbidBetween(Integer value1, Integer value2) {
            addCriterion("zzlbID between", value1, value2, "zzlbid");
            return (Criteria) this;
        }

        public Criteria andZzlbidNotBetween(Integer value1, Integer value2) {
            addCriterion("zzlbID not between", value1, value2, "zzlbid");
            return (Criteria) this;
        }

        public Criteria andZzlbIsNull() {
            addCriterion("zzlb is null");
            return (Criteria) this;
        }

        public Criteria andZzlbIsNotNull() {
            addCriterion("zzlb is not null");
            return (Criteria) this;
        }

        public Criteria andZzlbEqualTo(String value) {
            addCriterion("zzlb =", value, "zzlb");
            return (Criteria) this;
        }

        public Criteria andZzlbNotEqualTo(String value) {
            addCriterion("zzlb <>", value, "zzlb");
            return (Criteria) this;
        }

        public Criteria andZzlbGreaterThan(String value) {
            addCriterion("zzlb >", value, "zzlb");
            return (Criteria) this;
        }

        public Criteria andZzlbGreaterThanOrEqualTo(String value) {
            addCriterion("zzlb >=", value, "zzlb");
            return (Criteria) this;
        }

        public Criteria andZzlbLessThan(String value) {
            addCriterion("zzlb <", value, "zzlb");
            return (Criteria) this;
        }

        public Criteria andZzlbLessThanOrEqualTo(String value) {
            addCriterion("zzlb <=", value, "zzlb");
            return (Criteria) this;
        }

        public Criteria andZzlbLike(String value) {
            addCriterion("zzlb like", value, "zzlb");
            return (Criteria) this;
        }

        public Criteria andZzlbNotLike(String value) {
            addCriterion("zzlb not like", value, "zzlb");
            return (Criteria) this;
        }

        public Criteria andZzlbIn(List<String> values) {
            addCriterion("zzlb in", values, "zzlb");
            return (Criteria) this;
        }

        public Criteria andZzlbNotIn(List<String> values) {
            addCriterion("zzlb not in", values, "zzlb");
            return (Criteria) this;
        }

        public Criteria andZzlbBetween(String value1, String value2) {
            addCriterion("zzlb between", value1, value2, "zzlb");
            return (Criteria) this;
        }

        public Criteria andZzlbNotBetween(String value1, String value2) {
            addCriterion("zzlb not between", value1, value2, "zzlb");
            return (Criteria) this;
        }

        public Criteria andZzdjidIsNull() {
            addCriterion("zzdjID is null");
            return (Criteria) this;
        }

        public Criteria andZzdjidIsNotNull() {
            addCriterion("zzdjID is not null");
            return (Criteria) this;
        }

        public Criteria andZzdjidEqualTo(Integer value) {
            addCriterion("zzdjID =", value, "zzdjid");
            return (Criteria) this;
        }

        public Criteria andZzdjidNotEqualTo(Integer value) {
            addCriterion("zzdjID <>", value, "zzdjid");
            return (Criteria) this;
        }

        public Criteria andZzdjidGreaterThan(Integer value) {
            addCriterion("zzdjID >", value, "zzdjid");
            return (Criteria) this;
        }

        public Criteria andZzdjidGreaterThanOrEqualTo(Integer value) {
            addCriterion("zzdjID >=", value, "zzdjid");
            return (Criteria) this;
        }

        public Criteria andZzdjidLessThan(Integer value) {
            addCriterion("zzdjID <", value, "zzdjid");
            return (Criteria) this;
        }

        public Criteria andZzdjidLessThanOrEqualTo(Integer value) {
            addCriterion("zzdjID <=", value, "zzdjid");
            return (Criteria) this;
        }

        public Criteria andZzdjidIn(List<Integer> values) {
            addCriterion("zzdjID in", values, "zzdjid");
            return (Criteria) this;
        }

        public Criteria andZzdjidNotIn(List<Integer> values) {
            addCriterion("zzdjID not in", values, "zzdjid");
            return (Criteria) this;
        }

        public Criteria andZzdjidBetween(Integer value1, Integer value2) {
            addCriterion("zzdjID between", value1, value2, "zzdjid");
            return (Criteria) this;
        }

        public Criteria andZzdjidNotBetween(Integer value1, Integer value2) {
            addCriterion("zzdjID not between", value1, value2, "zzdjid");
            return (Criteria) this;
        }

        public Criteria andZzdjIsNull() {
            addCriterion("zzdj is null");
            return (Criteria) this;
        }

        public Criteria andZzdjIsNotNull() {
            addCriterion("zzdj is not null");
            return (Criteria) this;
        }

        public Criteria andZzdjEqualTo(String value) {
            addCriterion("zzdj =", value, "zzdj");
            return (Criteria) this;
        }

        public Criteria andZzdjNotEqualTo(String value) {
            addCriterion("zzdj <>", value, "zzdj");
            return (Criteria) this;
        }

        public Criteria andZzdjGreaterThan(String value) {
            addCriterion("zzdj >", value, "zzdj");
            return (Criteria) this;
        }

        public Criteria andZzdjGreaterThanOrEqualTo(String value) {
            addCriterion("zzdj >=", value, "zzdj");
            return (Criteria) this;
        }

        public Criteria andZzdjLessThan(String value) {
            addCriterion("zzdj <", value, "zzdj");
            return (Criteria) this;
        }

        public Criteria andZzdjLessThanOrEqualTo(String value) {
            addCriterion("zzdj <=", value, "zzdj");
            return (Criteria) this;
        }

        public Criteria andZzdjLike(String value) {
            addCriterion("zzdj like", value, "zzdj");
            return (Criteria) this;
        }

        public Criteria andZzdjNotLike(String value) {
            addCriterion("zzdj not like", value, "zzdj");
            return (Criteria) this;
        }

        public Criteria andZzdjIn(List<String> values) {
            addCriterion("zzdj in", values, "zzdj");
            return (Criteria) this;
        }

        public Criteria andZzdjNotIn(List<String> values) {
            addCriterion("zzdj not in", values, "zzdj");
            return (Criteria) this;
        }

        public Criteria andZzdjBetween(String value1, String value2) {
            addCriterion("zzdj between", value1, value2, "zzdj");
            return (Criteria) this;
        }

        public Criteria andZzdjNotBetween(String value1, String value2) {
            addCriterion("zzdj not between", value1, value2, "zzdj");
            return (Criteria) this;
        }

        public Criteria andCjywfwIsNull() {
            addCriterion("cjywfw is null");
            return (Criteria) this;
        }

        public Criteria andCjywfwIsNotNull() {
            addCriterion("cjywfw is not null");
            return (Criteria) this;
        }

        public Criteria andCjywfwEqualTo(String value) {
            addCriterion("cjywfw =", value, "cjywfw");
            return (Criteria) this;
        }

        public Criteria andCjywfwNotEqualTo(String value) {
            addCriterion("cjywfw <>", value, "cjywfw");
            return (Criteria) this;
        }

        public Criteria andCjywfwGreaterThan(String value) {
            addCriterion("cjywfw >", value, "cjywfw");
            return (Criteria) this;
        }

        public Criteria andCjywfwGreaterThanOrEqualTo(String value) {
            addCriterion("cjywfw >=", value, "cjywfw");
            return (Criteria) this;
        }

        public Criteria andCjywfwLessThan(String value) {
            addCriterion("cjywfw <", value, "cjywfw");
            return (Criteria) this;
        }

        public Criteria andCjywfwLessThanOrEqualTo(String value) {
            addCriterion("cjywfw <=", value, "cjywfw");
            return (Criteria) this;
        }

        public Criteria andCjywfwLike(String value) {
            addCriterion("cjywfw like", value, "cjywfw");
            return (Criteria) this;
        }

        public Criteria andCjywfwNotLike(String value) {
            addCriterion("cjywfw not like", value, "cjywfw");
            return (Criteria) this;
        }

        public Criteria andCjywfwIn(List<String> values) {
            addCriterion("cjywfw in", values, "cjywfw");
            return (Criteria) this;
        }

        public Criteria andCjywfwNotIn(List<String> values) {
            addCriterion("cjywfw not in", values, "cjywfw");
            return (Criteria) this;
        }

        public Criteria andCjywfwBetween(String value1, String value2) {
            addCriterion("cjywfw between", value1, value2, "cjywfw");
            return (Criteria) this;
        }

        public Criteria andCjywfwNotBetween(String value1, String value2) {
            addCriterion("cjywfw not between", value1, value2, "cjywfw");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("bz is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("bz is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("bz =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("bz <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("bz >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("bz >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("bz <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("bz <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("bz like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("bz not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("bz in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("bz not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("bz between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("bz not between", value1, value2, "bz");
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

        public Criteria andZsbhIsNull() {
            addCriterion("zsbh is null");
            return (Criteria) this;
        }

        public Criteria andZsbhIsNotNull() {
            addCriterion("zsbh is not null");
            return (Criteria) this;
        }

        public Criteria andZsbhEqualTo(String value) {
            addCriterion("zsbh =", value, "zsbh");
            return (Criteria) this;
        }

        public Criteria andZsbhNotEqualTo(String value) {
            addCriterion("zsbh <>", value, "zsbh");
            return (Criteria) this;
        }

        public Criteria andZsbhGreaterThan(String value) {
            addCriterion("zsbh >", value, "zsbh");
            return (Criteria) this;
        }

        public Criteria andZsbhGreaterThanOrEqualTo(String value) {
            addCriterion("zsbh >=", value, "zsbh");
            return (Criteria) this;
        }

        public Criteria andZsbhLessThan(String value) {
            addCriterion("zsbh <", value, "zsbh");
            return (Criteria) this;
        }

        public Criteria andZsbhLessThanOrEqualTo(String value) {
            addCriterion("zsbh <=", value, "zsbh");
            return (Criteria) this;
        }

        public Criteria andZsbhLike(String value) {
            addCriterion("zsbh like", value, "zsbh");
            return (Criteria) this;
        }

        public Criteria andZsbhNotLike(String value) {
            addCriterion("zsbh not like", value, "zsbh");
            return (Criteria) this;
        }

        public Criteria andZsbhIn(List<String> values) {
            addCriterion("zsbh in", values, "zsbh");
            return (Criteria) this;
        }

        public Criteria andZsbhNotIn(List<String> values) {
            addCriterion("zsbh not in", values, "zsbh");
            return (Criteria) this;
        }

        public Criteria andZsbhBetween(String value1, String value2) {
            addCriterion("zsbh between", value1, value2, "zsbh");
            return (Criteria) this;
        }

        public Criteria andZsbhNotBetween(String value1, String value2) {
            addCriterion("zsbh not between", value1, value2, "zsbh");
            return (Criteria) this;
        }

        public Criteria andQyidLikeInsensitive(String value) {
            addCriterion("upper(qyID) like", value.toUpperCase(), "qyid");
            return (Criteria) this;
        }

        public Criteria andCsywlxLikeInsensitive(String value) {
            addCriterion("upper(csywlx) like", value.toUpperCase(), "csywlx");
            return (Criteria) this;
        }

        public Criteria andZslxLikeInsensitive(String value) {
            addCriterion("upper(zslx) like", value.toUpperCase(), "zslx");
            return (Criteria) this;
        }

        public Criteria andZzbzLikeInsensitive(String value) {
            addCriterion("upper(zzbz) like", value.toUpperCase(), "zzbz");
            return (Criteria) this;
        }

        public Criteria andZzxlLikeInsensitive(String value) {
            addCriterion("upper(zzxl) like", value.toUpperCase(), "zzxl");
            return (Criteria) this;
        }

        public Criteria andZzhyLikeInsensitive(String value) {
            addCriterion("upper(zzhy) like", value.toUpperCase(), "zzhy");
            return (Criteria) this;
        }

        public Criteria andZzlbLikeInsensitive(String value) {
            addCriterion("upper(zzlb) like", value.toUpperCase(), "zzlb");
            return (Criteria) this;
        }

        public Criteria andZzdjLikeInsensitive(String value) {
            addCriterion("upper(zzdj) like", value.toUpperCase(), "zzdj");
            return (Criteria) this;
        }

        public Criteria andCjywfwLikeInsensitive(String value) {
            addCriterion("upper(cjywfw) like", value.toUpperCase(), "cjywfw");
            return (Criteria) this;
        }

        public Criteria andBzLikeInsensitive(String value) {
            addCriterion("upper(bz) like", value.toUpperCase(), "bz");
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

        public Criteria andZsbhLikeInsensitive(String value) {
            addCriterion("upper(zsbh) like", value.toUpperCase(), "zsbh");
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