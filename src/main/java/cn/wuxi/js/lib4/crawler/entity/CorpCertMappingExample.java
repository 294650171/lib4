package cn.wuxi.js.lib4.crawler.entity;

import java.util.ArrayList;
import java.util.List;

public class CorpCertMappingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CorpCertMappingExample() {
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

        public Criteria andCertnameIsNull() {
            addCriterion("certname is null");
            return (Criteria) this;
        }

        public Criteria andCertnameIsNotNull() {
            addCriterion("certname is not null");
            return (Criteria) this;
        }

        public Criteria andCertnameEqualTo(String value) {
            addCriterion("certname =", value, "certname");
            return (Criteria) this;
        }

        public Criteria andCertnameNotEqualTo(String value) {
            addCriterion("certname <>", value, "certname");
            return (Criteria) this;
        }

        public Criteria andCertnameGreaterThan(String value) {
            addCriterion("certname >", value, "certname");
            return (Criteria) this;
        }

        public Criteria andCertnameGreaterThanOrEqualTo(String value) {
            addCriterion("certname >=", value, "certname");
            return (Criteria) this;
        }

        public Criteria andCertnameLessThan(String value) {
            addCriterion("certname <", value, "certname");
            return (Criteria) this;
        }

        public Criteria andCertnameLessThanOrEqualTo(String value) {
            addCriterion("certname <=", value, "certname");
            return (Criteria) this;
        }

        public Criteria andCertnameLike(String value) {
            addCriterion("certname like", value, "certname");
            return (Criteria) this;
        }

        public Criteria andCertnameNotLike(String value) {
            addCriterion("certname not like", value, "certname");
            return (Criteria) this;
        }

        public Criteria andCertnameIn(List<String> values) {
            addCriterion("certname in", values, "certname");
            return (Criteria) this;
        }

        public Criteria andCertnameNotIn(List<String> values) {
            addCriterion("certname not in", values, "certname");
            return (Criteria) this;
        }

        public Criteria andCertnameBetween(String value1, String value2) {
            addCriterion("certname between", value1, value2, "certname");
            return (Criteria) this;
        }

        public Criteria andCertnameNotBetween(String value1, String value2) {
            addCriterion("certname not between", value1, value2, "certname");
            return (Criteria) this;
        }

        public Criteria andMajortypenameIsNull() {
            addCriterion("majortypename is null");
            return (Criteria) this;
        }

        public Criteria andMajortypenameIsNotNull() {
            addCriterion("majortypename is not null");
            return (Criteria) this;
        }

        public Criteria andMajortypenameEqualTo(String value) {
            addCriterion("majortypename =", value, "majortypename");
            return (Criteria) this;
        }

        public Criteria andMajortypenameNotEqualTo(String value) {
            addCriterion("majortypename <>", value, "majortypename");
            return (Criteria) this;
        }

        public Criteria andMajortypenameGreaterThan(String value) {
            addCriterion("majortypename >", value, "majortypename");
            return (Criteria) this;
        }

        public Criteria andMajortypenameGreaterThanOrEqualTo(String value) {
            addCriterion("majortypename >=", value, "majortypename");
            return (Criteria) this;
        }

        public Criteria andMajortypenameLessThan(String value) {
            addCriterion("majortypename <", value, "majortypename");
            return (Criteria) this;
        }

        public Criteria andMajortypenameLessThanOrEqualTo(String value) {
            addCriterion("majortypename <=", value, "majortypename");
            return (Criteria) this;
        }

        public Criteria andMajortypenameLike(String value) {
            addCriterion("majortypename like", value, "majortypename");
            return (Criteria) this;
        }

        public Criteria andMajortypenameNotLike(String value) {
            addCriterion("majortypename not like", value, "majortypename");
            return (Criteria) this;
        }

        public Criteria andMajortypenameIn(List<String> values) {
            addCriterion("majortypename in", values, "majortypename");
            return (Criteria) this;
        }

        public Criteria andMajortypenameNotIn(List<String> values) {
            addCriterion("majortypename not in", values, "majortypename");
            return (Criteria) this;
        }

        public Criteria andMajortypenameBetween(String value1, String value2) {
            addCriterion("majortypename between", value1, value2, "majortypename");
            return (Criteria) this;
        }

        public Criteria andMajortypenameNotBetween(String value1, String value2) {
            addCriterion("majortypename not between", value1, value2, "majortypename");
            return (Criteria) this;
        }

        public Criteria andMajortypenoIsNull() {
            addCriterion("majortypeno is null");
            return (Criteria) this;
        }

        public Criteria andMajortypenoIsNotNull() {
            addCriterion("majortypeno is not null");
            return (Criteria) this;
        }

        public Criteria andMajortypenoEqualTo(String value) {
            addCriterion("majortypeno =", value, "majortypeno");
            return (Criteria) this;
        }

        public Criteria andMajortypenoNotEqualTo(String value) {
            addCriterion("majortypeno <>", value, "majortypeno");
            return (Criteria) this;
        }

        public Criteria andMajortypenoGreaterThan(String value) {
            addCriterion("majortypeno >", value, "majortypeno");
            return (Criteria) this;
        }

        public Criteria andMajortypenoGreaterThanOrEqualTo(String value) {
            addCriterion("majortypeno >=", value, "majortypeno");
            return (Criteria) this;
        }

        public Criteria andMajortypenoLessThan(String value) {
            addCriterion("majortypeno <", value, "majortypeno");
            return (Criteria) this;
        }

        public Criteria andMajortypenoLessThanOrEqualTo(String value) {
            addCriterion("majortypeno <=", value, "majortypeno");
            return (Criteria) this;
        }

        public Criteria andMajortypenoLike(String value) {
            addCriterion("majortypeno like", value, "majortypeno");
            return (Criteria) this;
        }

        public Criteria andMajortypenoNotLike(String value) {
            addCriterion("majortypeno not like", value, "majortypeno");
            return (Criteria) this;
        }

        public Criteria andMajortypenoIn(List<String> values) {
            addCriterion("majortypeno in", values, "majortypeno");
            return (Criteria) this;
        }

        public Criteria andMajortypenoNotIn(List<String> values) {
            addCriterion("majortypeno not in", values, "majortypeno");
            return (Criteria) this;
        }

        public Criteria andMajortypenoBetween(String value1, String value2) {
            addCriterion("majortypeno between", value1, value2, "majortypeno");
            return (Criteria) this;
        }

        public Criteria andMajortypenoNotBetween(String value1, String value2) {
            addCriterion("majortypeno not between", value1, value2, "majortypeno");
            return (Criteria) this;
        }

        public Criteria andTradetypenameIsNull() {
            addCriterion("tradetypename is null");
            return (Criteria) this;
        }

        public Criteria andTradetypenameIsNotNull() {
            addCriterion("tradetypename is not null");
            return (Criteria) this;
        }

        public Criteria andTradetypenameEqualTo(String value) {
            addCriterion("tradetypename =", value, "tradetypename");
            return (Criteria) this;
        }

        public Criteria andTradetypenameNotEqualTo(String value) {
            addCriterion("tradetypename <>", value, "tradetypename");
            return (Criteria) this;
        }

        public Criteria andTradetypenameGreaterThan(String value) {
            addCriterion("tradetypename >", value, "tradetypename");
            return (Criteria) this;
        }

        public Criteria andTradetypenameGreaterThanOrEqualTo(String value) {
            addCriterion("tradetypename >=", value, "tradetypename");
            return (Criteria) this;
        }

        public Criteria andTradetypenameLessThan(String value) {
            addCriterion("tradetypename <", value, "tradetypename");
            return (Criteria) this;
        }

        public Criteria andTradetypenameLessThanOrEqualTo(String value) {
            addCriterion("tradetypename <=", value, "tradetypename");
            return (Criteria) this;
        }

        public Criteria andTradetypenameLike(String value) {
            addCriterion("tradetypename like", value, "tradetypename");
            return (Criteria) this;
        }

        public Criteria andTradetypenameNotLike(String value) {
            addCriterion("tradetypename not like", value, "tradetypename");
            return (Criteria) this;
        }

        public Criteria andTradetypenameIn(List<String> values) {
            addCriterion("tradetypename in", values, "tradetypename");
            return (Criteria) this;
        }

        public Criteria andTradetypenameNotIn(List<String> values) {
            addCriterion("tradetypename not in", values, "tradetypename");
            return (Criteria) this;
        }

        public Criteria andTradetypenameBetween(String value1, String value2) {
            addCriterion("tradetypename between", value1, value2, "tradetypename");
            return (Criteria) this;
        }

        public Criteria andTradetypenameNotBetween(String value1, String value2) {
            addCriterion("tradetypename not between", value1, value2, "tradetypename");
            return (Criteria) this;
        }

        public Criteria andCerttypenameIsNull() {
            addCriterion("certtypename is null");
            return (Criteria) this;
        }

        public Criteria andCerttypenameIsNotNull() {
            addCriterion("certtypename is not null");
            return (Criteria) this;
        }

        public Criteria andCerttypenameEqualTo(String value) {
            addCriterion("certtypename =", value, "certtypename");
            return (Criteria) this;
        }

        public Criteria andCerttypenameNotEqualTo(String value) {
            addCriterion("certtypename <>", value, "certtypename");
            return (Criteria) this;
        }

        public Criteria andCerttypenameGreaterThan(String value) {
            addCriterion("certtypename >", value, "certtypename");
            return (Criteria) this;
        }

        public Criteria andCerttypenameGreaterThanOrEqualTo(String value) {
            addCriterion("certtypename >=", value, "certtypename");
            return (Criteria) this;
        }

        public Criteria andCerttypenameLessThan(String value) {
            addCriterion("certtypename <", value, "certtypename");
            return (Criteria) this;
        }

        public Criteria andCerttypenameLessThanOrEqualTo(String value) {
            addCriterion("certtypename <=", value, "certtypename");
            return (Criteria) this;
        }

        public Criteria andCerttypenameLike(String value) {
            addCriterion("certtypename like", value, "certtypename");
            return (Criteria) this;
        }

        public Criteria andCerttypenameNotLike(String value) {
            addCriterion("certtypename not like", value, "certtypename");
            return (Criteria) this;
        }

        public Criteria andCerttypenameIn(List<String> values) {
            addCriterion("certtypename in", values, "certtypename");
            return (Criteria) this;
        }

        public Criteria andCerttypenameNotIn(List<String> values) {
            addCriterion("certtypename not in", values, "certtypename");
            return (Criteria) this;
        }

        public Criteria andCerttypenameBetween(String value1, String value2) {
            addCriterion("certtypename between", value1, value2, "certtypename");
            return (Criteria) this;
        }

        public Criteria andCerttypenameNotBetween(String value1, String value2) {
            addCriterion("certtypename not between", value1, value2, "certtypename");
            return (Criteria) this;
        }

        public Criteria andCertnameLikeInsensitive(String value) {
            addCriterion("upper(certname) like", value.toUpperCase(), "certname");
            return (Criteria) this;
        }

        public Criteria andMajortypenameLikeInsensitive(String value) {
            addCriterion("upper(majortypename) like", value.toUpperCase(), "majortypename");
            return (Criteria) this;
        }

        public Criteria andMajortypenoLikeInsensitive(String value) {
            addCriterion("upper(majortypeno) like", value.toUpperCase(), "majortypeno");
            return (Criteria) this;
        }

        public Criteria andTradetypenameLikeInsensitive(String value) {
            addCriterion("upper(tradetypename) like", value.toUpperCase(), "tradetypename");
            return (Criteria) this;
        }

        public Criteria andCerttypenameLikeInsensitive(String value) {
            addCriterion("upper(certtypename) like", value.toUpperCase(), "certtypename");
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