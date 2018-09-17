package cn.wuxi.js.lib4.crawler.entity;

import java.util.ArrayList;
import java.util.List;

public class UeppCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UeppCodeExample() {
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

        public Criteria andParentcodeIsNull() {
            addCriterion("ParentCode is null");
            return (Criteria) this;
        }

        public Criteria andParentcodeIsNotNull() {
            addCriterion("ParentCode is not null");
            return (Criteria) this;
        }

        public Criteria andParentcodeEqualTo(String value) {
            addCriterion("ParentCode =", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeNotEqualTo(String value) {
            addCriterion("ParentCode <>", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeGreaterThan(String value) {
            addCriterion("ParentCode >", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ParentCode >=", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeLessThan(String value) {
            addCriterion("ParentCode <", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeLessThanOrEqualTo(String value) {
            addCriterion("ParentCode <=", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeLike(String value) {
            addCriterion("ParentCode like", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeNotLike(String value) {
            addCriterion("ParentCode not like", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeIn(List<String> values) {
            addCriterion("ParentCode in", values, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeNotIn(List<String> values) {
            addCriterion("ParentCode not in", values, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeBetween(String value1, String value2) {
            addCriterion("ParentCode between", value1, value2, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeNotBetween(String value1, String value2) {
            addCriterion("ParentCode not between", value1, value2, "parentcode");
            return (Criteria) this;
        }

        public Criteria andCodetypeIsNull() {
            addCriterion("CodeType is null");
            return (Criteria) this;
        }

        public Criteria andCodetypeIsNotNull() {
            addCriterion("CodeType is not null");
            return (Criteria) this;
        }

        public Criteria andCodetypeEqualTo(String value) {
            addCriterion("CodeType =", value, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeNotEqualTo(String value) {
            addCriterion("CodeType <>", value, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeGreaterThan(String value) {
            addCriterion("CodeType >", value, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CodeType >=", value, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeLessThan(String value) {
            addCriterion("CodeType <", value, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeLessThanOrEqualTo(String value) {
            addCriterion("CodeType <=", value, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeLike(String value) {
            addCriterion("CodeType like", value, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeNotLike(String value) {
            addCriterion("CodeType not like", value, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeIn(List<String> values) {
            addCriterion("CodeType in", values, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeNotIn(List<String> values) {
            addCriterion("CodeType not in", values, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeBetween(String value1, String value2) {
            addCriterion("CodeType between", value1, value2, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeNotBetween(String value1, String value2) {
            addCriterion("CodeType not between", value1, value2, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("Code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("Code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("Code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("Code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("Code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("Code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("Code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("Code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("Code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("Code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("Code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("Code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("Code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andParentcodetypeIsNull() {
            addCriterion("ParentCodeType is null");
            return (Criteria) this;
        }

        public Criteria andParentcodetypeIsNotNull() {
            addCriterion("ParentCodeType is not null");
            return (Criteria) this;
        }

        public Criteria andParentcodetypeEqualTo(String value) {
            addCriterion("ParentCodeType =", value, "parentcodetype");
            return (Criteria) this;
        }

        public Criteria andParentcodetypeNotEqualTo(String value) {
            addCriterion("ParentCodeType <>", value, "parentcodetype");
            return (Criteria) this;
        }

        public Criteria andParentcodetypeGreaterThan(String value) {
            addCriterion("ParentCodeType >", value, "parentcodetype");
            return (Criteria) this;
        }

        public Criteria andParentcodetypeGreaterThanOrEqualTo(String value) {
            addCriterion("ParentCodeType >=", value, "parentcodetype");
            return (Criteria) this;
        }

        public Criteria andParentcodetypeLessThan(String value) {
            addCriterion("ParentCodeType <", value, "parentcodetype");
            return (Criteria) this;
        }

        public Criteria andParentcodetypeLessThanOrEqualTo(String value) {
            addCriterion("ParentCodeType <=", value, "parentcodetype");
            return (Criteria) this;
        }

        public Criteria andParentcodetypeLike(String value) {
            addCriterion("ParentCodeType like", value, "parentcodetype");
            return (Criteria) this;
        }

        public Criteria andParentcodetypeNotLike(String value) {
            addCriterion("ParentCodeType not like", value, "parentcodetype");
            return (Criteria) this;
        }

        public Criteria andParentcodetypeIn(List<String> values) {
            addCriterion("ParentCodeType in", values, "parentcodetype");
            return (Criteria) this;
        }

        public Criteria andParentcodetypeNotIn(List<String> values) {
            addCriterion("ParentCodeType not in", values, "parentcodetype");
            return (Criteria) this;
        }

        public Criteria andParentcodetypeBetween(String value1, String value2) {
            addCriterion("ParentCodeType between", value1, value2, "parentcodetype");
            return (Criteria) this;
        }

        public Criteria andParentcodetypeNotBetween(String value1, String value2) {
            addCriterion("ParentCodeType not between", value1, value2, "parentcodetype");
            return (Criteria) this;
        }

        public Criteria andCodeinfoIsNull() {
            addCriterion("CodeInfo is null");
            return (Criteria) this;
        }

        public Criteria andCodeinfoIsNotNull() {
            addCriterion("CodeInfo is not null");
            return (Criteria) this;
        }

        public Criteria andCodeinfoEqualTo(String value) {
            addCriterion("CodeInfo =", value, "codeinfo");
            return (Criteria) this;
        }

        public Criteria andCodeinfoNotEqualTo(String value) {
            addCriterion("CodeInfo <>", value, "codeinfo");
            return (Criteria) this;
        }

        public Criteria andCodeinfoGreaterThan(String value) {
            addCriterion("CodeInfo >", value, "codeinfo");
            return (Criteria) this;
        }

        public Criteria andCodeinfoGreaterThanOrEqualTo(String value) {
            addCriterion("CodeInfo >=", value, "codeinfo");
            return (Criteria) this;
        }

        public Criteria andCodeinfoLessThan(String value) {
            addCriterion("CodeInfo <", value, "codeinfo");
            return (Criteria) this;
        }

        public Criteria andCodeinfoLessThanOrEqualTo(String value) {
            addCriterion("CodeInfo <=", value, "codeinfo");
            return (Criteria) this;
        }

        public Criteria andCodeinfoLike(String value) {
            addCriterion("CodeInfo like", value, "codeinfo");
            return (Criteria) this;
        }

        public Criteria andCodeinfoNotLike(String value) {
            addCriterion("CodeInfo not like", value, "codeinfo");
            return (Criteria) this;
        }

        public Criteria andCodeinfoIn(List<String> values) {
            addCriterion("CodeInfo in", values, "codeinfo");
            return (Criteria) this;
        }

        public Criteria andCodeinfoNotIn(List<String> values) {
            addCriterion("CodeInfo not in", values, "codeinfo");
            return (Criteria) this;
        }

        public Criteria andCodeinfoBetween(String value1, String value2) {
            addCriterion("CodeInfo between", value1, value2, "codeinfo");
            return (Criteria) this;
        }

        public Criteria andCodeinfoNotBetween(String value1, String value2) {
            addCriterion("CodeInfo not between", value1, value2, "codeinfo");
            return (Criteria) this;
        }

        public Criteria andCodedescIsNull() {
            addCriterion("CodeDesc is null");
            return (Criteria) this;
        }

        public Criteria andCodedescIsNotNull() {
            addCriterion("CodeDesc is not null");
            return (Criteria) this;
        }

        public Criteria andCodedescEqualTo(String value) {
            addCriterion("CodeDesc =", value, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescNotEqualTo(String value) {
            addCriterion("CodeDesc <>", value, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescGreaterThan(String value) {
            addCriterion("CodeDesc >", value, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescGreaterThanOrEqualTo(String value) {
            addCriterion("CodeDesc >=", value, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescLessThan(String value) {
            addCriterion("CodeDesc <", value, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescLessThanOrEqualTo(String value) {
            addCriterion("CodeDesc <=", value, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescLike(String value) {
            addCriterion("CodeDesc like", value, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescNotLike(String value) {
            addCriterion("CodeDesc not like", value, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescIn(List<String> values) {
            addCriterion("CodeDesc in", values, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescNotIn(List<String> values) {
            addCriterion("CodeDesc not in", values, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescBetween(String value1, String value2) {
            addCriterion("CodeDesc between", value1, value2, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescNotBetween(String value1, String value2) {
            addCriterion("CodeDesc not between", value1, value2, "codedesc");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("OrderID is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("OrderID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("OrderID =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("OrderID <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("OrderID >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderID >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("OrderID <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("OrderID <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("OrderID in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("OrderID not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("OrderID between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderID not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andParentcodeLikeInsensitive(String value) {
            addCriterion("upper(ParentCode) like", value.toUpperCase(), "parentcode");
            return (Criteria) this;
        }

        public Criteria andCodetypeLikeInsensitive(String value) {
            addCriterion("upper(CodeType) like", value.toUpperCase(), "codetype");
            return (Criteria) this;
        }

        public Criteria andCodeLikeInsensitive(String value) {
            addCriterion("upper(Code) like", value.toUpperCase(), "code");
            return (Criteria) this;
        }

        public Criteria andParentcodetypeLikeInsensitive(String value) {
            addCriterion("upper(ParentCodeType) like", value.toUpperCase(), "parentcodetype");
            return (Criteria) this;
        }

        public Criteria andCodeinfoLikeInsensitive(String value) {
            addCriterion("upper(CodeInfo) like", value.toUpperCase(), "codeinfo");
            return (Criteria) this;
        }

        public Criteria andCodedescLikeInsensitive(String value) {
            addCriterion("upper(CodeDesc) like", value.toUpperCase(), "codedesc");
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