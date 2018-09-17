package cn.wuxi.js.lib4.crawler.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QyzsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QyzsExample() {
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

        public Criteria andZsjlidIsNull() {
            addCriterion("zsjlId is null");
            return (Criteria) this;
        }

        public Criteria andZsjlidIsNotNull() {
            addCriterion("zsjlId is not null");
            return (Criteria) this;
        }

        public Criteria andZsjlidEqualTo(String value) {
            addCriterion("zsjlId =", value, "zsjlid");
            return (Criteria) this;
        }

        public Criteria andZsjlidNotEqualTo(String value) {
            addCriterion("zsjlId <>", value, "zsjlid");
            return (Criteria) this;
        }

        public Criteria andZsjlidGreaterThan(String value) {
            addCriterion("zsjlId >", value, "zsjlid");
            return (Criteria) this;
        }

        public Criteria andZsjlidGreaterThanOrEqualTo(String value) {
            addCriterion("zsjlId >=", value, "zsjlid");
            return (Criteria) this;
        }

        public Criteria andZsjlidLessThan(String value) {
            addCriterion("zsjlId <", value, "zsjlid");
            return (Criteria) this;
        }

        public Criteria andZsjlidLessThanOrEqualTo(String value) {
            addCriterion("zsjlId <=", value, "zsjlid");
            return (Criteria) this;
        }

        public Criteria andZsjlidLike(String value) {
            addCriterion("zsjlId like", value, "zsjlid");
            return (Criteria) this;
        }

        public Criteria andZsjlidNotLike(String value) {
            addCriterion("zsjlId not like", value, "zsjlid");
            return (Criteria) this;
        }

        public Criteria andZsjlidIn(List<String> values) {
            addCriterion("zsjlId in", values, "zsjlid");
            return (Criteria) this;
        }

        public Criteria andZsjlidNotIn(List<String> values) {
            addCriterion("zsjlId not in", values, "zsjlid");
            return (Criteria) this;
        }

        public Criteria andZsjlidBetween(String value1, String value2) {
            addCriterion("zsjlId between", value1, value2, "zsjlid");
            return (Criteria) this;
        }

        public Criteria andZsjlidNotBetween(String value1, String value2) {
            addCriterion("zsjlId not between", value1, value2, "zsjlid");
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

        public Criteria andSfzzzIsNull() {
            addCriterion("sfzzz is null");
            return (Criteria) this;
        }

        public Criteria andSfzzzIsNotNull() {
            addCriterion("sfzzz is not null");
            return (Criteria) this;
        }

        public Criteria andSfzzzEqualTo(Integer value) {
            addCriterion("sfzzz =", value, "sfzzz");
            return (Criteria) this;
        }

        public Criteria andSfzzzNotEqualTo(Integer value) {
            addCriterion("sfzzz <>", value, "sfzzz");
            return (Criteria) this;
        }

        public Criteria andSfzzzGreaterThan(Integer value) {
            addCriterion("sfzzz >", value, "sfzzz");
            return (Criteria) this;
        }

        public Criteria andSfzzzGreaterThanOrEqualTo(Integer value) {
            addCriterion("sfzzz >=", value, "sfzzz");
            return (Criteria) this;
        }

        public Criteria andSfzzzLessThan(Integer value) {
            addCriterion("sfzzz <", value, "sfzzz");
            return (Criteria) this;
        }

        public Criteria andSfzzzLessThanOrEqualTo(Integer value) {
            addCriterion("sfzzz <=", value, "sfzzz");
            return (Criteria) this;
        }

        public Criteria andSfzzzIn(List<Integer> values) {
            addCriterion("sfzzz in", values, "sfzzz");
            return (Criteria) this;
        }

        public Criteria andSfzzzNotIn(List<Integer> values) {
            addCriterion("sfzzz not in", values, "sfzzz");
            return (Criteria) this;
        }

        public Criteria andSfzzzBetween(Integer value1, Integer value2) {
            addCriterion("sfzzz between", value1, value2, "sfzzz");
            return (Criteria) this;
        }

        public Criteria andSfzzzNotBetween(Integer value1, Integer value2) {
            addCriterion("sfzzz not between", value1, value2, "sfzzz");
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

        public Criteria andZsyxqrqIsNull() {
            addCriterion("zsyxqrq is null");
            return (Criteria) this;
        }

        public Criteria andZsyxqrqIsNotNull() {
            addCriterion("zsyxqrq is not null");
            return (Criteria) this;
        }

        public Criteria andZsyxqrqEqualTo(Date value) {
            addCriterion("zsyxqrq =", value, "zsyxqrq");
            return (Criteria) this;
        }

        public Criteria andZsyxqrqNotEqualTo(Date value) {
            addCriterion("zsyxqrq <>", value, "zsyxqrq");
            return (Criteria) this;
        }

        public Criteria andZsyxqrqGreaterThan(Date value) {
            addCriterion("zsyxqrq >", value, "zsyxqrq");
            return (Criteria) this;
        }

        public Criteria andZsyxqrqGreaterThanOrEqualTo(Date value) {
            addCriterion("zsyxqrq >=", value, "zsyxqrq");
            return (Criteria) this;
        }

        public Criteria andZsyxqrqLessThan(Date value) {
            addCriterion("zsyxqrq <", value, "zsyxqrq");
            return (Criteria) this;
        }

        public Criteria andZsyxqrqLessThanOrEqualTo(Date value) {
            addCriterion("zsyxqrq <=", value, "zsyxqrq");
            return (Criteria) this;
        }

        public Criteria andZsyxqrqIn(List<Date> values) {
            addCriterion("zsyxqrq in", values, "zsyxqrq");
            return (Criteria) this;
        }

        public Criteria andZsyxqrqNotIn(List<Date> values) {
            addCriterion("zsyxqrq not in", values, "zsyxqrq");
            return (Criteria) this;
        }

        public Criteria andZsyxqrqBetween(Date value1, Date value2) {
            addCriterion("zsyxqrq between", value1, value2, "zsyxqrq");
            return (Criteria) this;
        }

        public Criteria andZsyxqrqNotBetween(Date value1, Date value2) {
            addCriterion("zsyxqrq not between", value1, value2, "zsyxqrq");
            return (Criteria) this;
        }

        public Criteria andZsyxzrqIsNull() {
            addCriterion("zsyxzrq is null");
            return (Criteria) this;
        }

        public Criteria andZsyxzrqIsNotNull() {
            addCriterion("zsyxzrq is not null");
            return (Criteria) this;
        }

        public Criteria andZsyxzrqEqualTo(Date value) {
            addCriterion("zsyxzrq =", value, "zsyxzrq");
            return (Criteria) this;
        }

        public Criteria andZsyxzrqNotEqualTo(Date value) {
            addCriterion("zsyxzrq <>", value, "zsyxzrq");
            return (Criteria) this;
        }

        public Criteria andZsyxzrqGreaterThan(Date value) {
            addCriterion("zsyxzrq >", value, "zsyxzrq");
            return (Criteria) this;
        }

        public Criteria andZsyxzrqGreaterThanOrEqualTo(Date value) {
            addCriterion("zsyxzrq >=", value, "zsyxzrq");
            return (Criteria) this;
        }

        public Criteria andZsyxzrqLessThan(Date value) {
            addCriterion("zsyxzrq <", value, "zsyxzrq");
            return (Criteria) this;
        }

        public Criteria andZsyxzrqLessThanOrEqualTo(Date value) {
            addCriterion("zsyxzrq <=", value, "zsyxzrq");
            return (Criteria) this;
        }

        public Criteria andZsyxzrqIn(List<Date> values) {
            addCriterion("zsyxzrq in", values, "zsyxzrq");
            return (Criteria) this;
        }

        public Criteria andZsyxzrqNotIn(List<Date> values) {
            addCriterion("zsyxzrq not in", values, "zsyxzrq");
            return (Criteria) this;
        }

        public Criteria andZsyxzrqBetween(Date value1, Date value2) {
            addCriterion("zsyxzrq between", value1, value2, "zsyxzrq");
            return (Criteria) this;
        }

        public Criteria andZsyxzrqNotBetween(Date value1, Date value2) {
            addCriterion("zsyxzrq not between", value1, value2, "zsyxzrq");
            return (Criteria) this;
        }

        public Criteria andFzdwIsNull() {
            addCriterion("fzdw is null");
            return (Criteria) this;
        }

        public Criteria andFzdwIsNotNull() {
            addCriterion("fzdw is not null");
            return (Criteria) this;
        }

        public Criteria andFzdwEqualTo(String value) {
            addCriterion("fzdw =", value, "fzdw");
            return (Criteria) this;
        }

        public Criteria andFzdwNotEqualTo(String value) {
            addCriterion("fzdw <>", value, "fzdw");
            return (Criteria) this;
        }

        public Criteria andFzdwGreaterThan(String value) {
            addCriterion("fzdw >", value, "fzdw");
            return (Criteria) this;
        }

        public Criteria andFzdwGreaterThanOrEqualTo(String value) {
            addCriterion("fzdw >=", value, "fzdw");
            return (Criteria) this;
        }

        public Criteria andFzdwLessThan(String value) {
            addCriterion("fzdw <", value, "fzdw");
            return (Criteria) this;
        }

        public Criteria andFzdwLessThanOrEqualTo(String value) {
            addCriterion("fzdw <=", value, "fzdw");
            return (Criteria) this;
        }

        public Criteria andFzdwLike(String value) {
            addCriterion("fzdw like", value, "fzdw");
            return (Criteria) this;
        }

        public Criteria andFzdwNotLike(String value) {
            addCriterion("fzdw not like", value, "fzdw");
            return (Criteria) this;
        }

        public Criteria andFzdwIn(List<String> values) {
            addCriterion("fzdw in", values, "fzdw");
            return (Criteria) this;
        }

        public Criteria andFzdwNotIn(List<String> values) {
            addCriterion("fzdw not in", values, "fzdw");
            return (Criteria) this;
        }

        public Criteria andFzdwBetween(String value1, String value2) {
            addCriterion("fzdw between", value1, value2, "fzdw");
            return (Criteria) this;
        }

        public Criteria andFzdwNotBetween(String value1, String value2) {
            addCriterion("fzdw not between", value1, value2, "fzdw");
            return (Criteria) this;
        }

        public Criteria andFzrqIsNull() {
            addCriterion("fzrq is null");
            return (Criteria) this;
        }

        public Criteria andFzrqIsNotNull() {
            addCriterion("fzrq is not null");
            return (Criteria) this;
        }

        public Criteria andFzrqEqualTo(Date value) {
            addCriterion("fzrq =", value, "fzrq");
            return (Criteria) this;
        }

        public Criteria andFzrqNotEqualTo(Date value) {
            addCriterion("fzrq <>", value, "fzrq");
            return (Criteria) this;
        }

        public Criteria andFzrqGreaterThan(Date value) {
            addCriterion("fzrq >", value, "fzrq");
            return (Criteria) this;
        }

        public Criteria andFzrqGreaterThanOrEqualTo(Date value) {
            addCriterion("fzrq >=", value, "fzrq");
            return (Criteria) this;
        }

        public Criteria andFzrqLessThan(Date value) {
            addCriterion("fzrq <", value, "fzrq");
            return (Criteria) this;
        }

        public Criteria andFzrqLessThanOrEqualTo(Date value) {
            addCriterion("fzrq <=", value, "fzrq");
            return (Criteria) this;
        }

        public Criteria andFzrqIn(List<Date> values) {
            addCriterion("fzrq in", values, "fzrq");
            return (Criteria) this;
        }

        public Criteria andFzrqNotIn(List<Date> values) {
            addCriterion("fzrq not in", values, "fzrq");
            return (Criteria) this;
        }

        public Criteria andFzrqBetween(Date value1, Date value2) {
            addCriterion("fzrq between", value1, value2, "fzrq");
            return (Criteria) this;
        }

        public Criteria andFzrqNotBetween(Date value1, Date value2) {
            addCriterion("fzrq not between", value1, value2, "fzrq");
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

        public Criteria andPrintnoIsNull() {
            addCriterion("PrintNo is null");
            return (Criteria) this;
        }

        public Criteria andPrintnoIsNotNull() {
            addCriterion("PrintNo is not null");
            return (Criteria) this;
        }

        public Criteria andPrintnoEqualTo(String value) {
            addCriterion("PrintNo =", value, "printno");
            return (Criteria) this;
        }

        public Criteria andPrintnoNotEqualTo(String value) {
            addCriterion("PrintNo <>", value, "printno");
            return (Criteria) this;
        }

        public Criteria andPrintnoGreaterThan(String value) {
            addCriterion("PrintNo >", value, "printno");
            return (Criteria) this;
        }

        public Criteria andPrintnoGreaterThanOrEqualTo(String value) {
            addCriterion("PrintNo >=", value, "printno");
            return (Criteria) this;
        }

        public Criteria andPrintnoLessThan(String value) {
            addCriterion("PrintNo <", value, "printno");
            return (Criteria) this;
        }

        public Criteria andPrintnoLessThanOrEqualTo(String value) {
            addCriterion("PrintNo <=", value, "printno");
            return (Criteria) this;
        }

        public Criteria andPrintnoLike(String value) {
            addCriterion("PrintNo like", value, "printno");
            return (Criteria) this;
        }

        public Criteria andPrintnoNotLike(String value) {
            addCriterion("PrintNo not like", value, "printno");
            return (Criteria) this;
        }

        public Criteria andPrintnoIn(List<String> values) {
            addCriterion("PrintNo in", values, "printno");
            return (Criteria) this;
        }

        public Criteria andPrintnoNotIn(List<String> values) {
            addCriterion("PrintNo not in", values, "printno");
            return (Criteria) this;
        }

        public Criteria andPrintnoBetween(String value1, String value2) {
            addCriterion("PrintNo between", value1, value2, "printno");
            return (Criteria) this;
        }

        public Criteria andPrintnoNotBetween(String value1, String value2) {
            addCriterion("PrintNo not between", value1, value2, "printno");
            return (Criteria) this;
        }

        public Criteria andZsjlidLikeInsensitive(String value) {
            addCriterion("upper(zsjlId) like", value.toUpperCase(), "zsjlid");
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

        public Criteria andZsbhLikeInsensitive(String value) {
            addCriterion("upper(zsbh) like", value.toUpperCase(), "zsbh");
            return (Criteria) this;
        }

        public Criteria andFzdwLikeInsensitive(String value) {
            addCriterion("upper(fzdw) like", value.toUpperCase(), "fzdw");
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

        public Criteria andPrintnoLikeInsensitive(String value) {
            addCriterion("upper(PrintNo) like", value.toUpperCase(), "printno");
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