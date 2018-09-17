package cn.wuxi.js.lib4.crawler.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QycsywExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QycsywExample() {
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
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

        public Criteria andBalxidIsNull() {
            addCriterion("balxID is null");
            return (Criteria) this;
        }

        public Criteria andBalxidIsNotNull() {
            addCriterion("balxID is not null");
            return (Criteria) this;
        }

        public Criteria andBalxidEqualTo(Integer value) {
            addCriterion("balxID =", value, "balxid");
            return (Criteria) this;
        }

        public Criteria andBalxidNotEqualTo(Integer value) {
            addCriterion("balxID <>", value, "balxid");
            return (Criteria) this;
        }

        public Criteria andBalxidGreaterThan(Integer value) {
            addCriterion("balxID >", value, "balxid");
            return (Criteria) this;
        }

        public Criteria andBalxidGreaterThanOrEqualTo(Integer value) {
            addCriterion("balxID >=", value, "balxid");
            return (Criteria) this;
        }

        public Criteria andBalxidLessThan(Integer value) {
            addCriterion("balxID <", value, "balxid");
            return (Criteria) this;
        }

        public Criteria andBalxidLessThanOrEqualTo(Integer value) {
            addCriterion("balxID <=", value, "balxid");
            return (Criteria) this;
        }

        public Criteria andBalxidIn(List<Integer> values) {
            addCriterion("balxID in", values, "balxid");
            return (Criteria) this;
        }

        public Criteria andBalxidNotIn(List<Integer> values) {
            addCriterion("balxID not in", values, "balxid");
            return (Criteria) this;
        }

        public Criteria andBalxidBetween(Integer value1, Integer value2) {
            addCriterion("balxID between", value1, value2, "balxid");
            return (Criteria) this;
        }

        public Criteria andBalxidNotBetween(Integer value1, Integer value2) {
            addCriterion("balxID not between", value1, value2, "balxid");
            return (Criteria) this;
        }

        public Criteria andBalxIsNull() {
            addCriterion("balx is null");
            return (Criteria) this;
        }

        public Criteria andBalxIsNotNull() {
            addCriterion("balx is not null");
            return (Criteria) this;
        }

        public Criteria andBalxEqualTo(String value) {
            addCriterion("balx =", value, "balx");
            return (Criteria) this;
        }

        public Criteria andBalxNotEqualTo(String value) {
            addCriterion("balx <>", value, "balx");
            return (Criteria) this;
        }

        public Criteria andBalxGreaterThan(String value) {
            addCriterion("balx >", value, "balx");
            return (Criteria) this;
        }

        public Criteria andBalxGreaterThanOrEqualTo(String value) {
            addCriterion("balx >=", value, "balx");
            return (Criteria) this;
        }

        public Criteria andBalxLessThan(String value) {
            addCriterion("balx <", value, "balx");
            return (Criteria) this;
        }

        public Criteria andBalxLessThanOrEqualTo(String value) {
            addCriterion("balx <=", value, "balx");
            return (Criteria) this;
        }

        public Criteria andBalxLike(String value) {
            addCriterion("balx like", value, "balx");
            return (Criteria) this;
        }

        public Criteria andBalxNotLike(String value) {
            addCriterion("balx not like", value, "balx");
            return (Criteria) this;
        }

        public Criteria andBalxIn(List<String> values) {
            addCriterion("balx in", values, "balx");
            return (Criteria) this;
        }

        public Criteria andBalxNotIn(List<String> values) {
            addCriterion("balx not in", values, "balx");
            return (Criteria) this;
        }

        public Criteria andBalxBetween(String value1, String value2) {
            addCriterion("balx between", value1, value2, "balx");
            return (Criteria) this;
        }

        public Criteria andBalxNotBetween(String value1, String value2) {
            addCriterion("balx not between", value1, value2, "balx");
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

        public Criteria andQyidLikeInsensitive(String value) {
            addCriterion("upper(qyID) like", value.toUpperCase(), "qyid");
            return (Criteria) this;
        }

        public Criteria andCsywlxLikeInsensitive(String value) {
            addCriterion("upper(csywlx) like", value.toUpperCase(), "csywlx");
            return (Criteria) this;
        }

        public Criteria andBalxLikeInsensitive(String value) {
            addCriterion("upper(balx) like", value.toUpperCase(), "balx");
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