package cn.wuxi.js.lib4.crawler.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CorpCertExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CorpCertExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCorpIdIsNull() {
            addCriterion("corp_id is null");
            return (Criteria) this;
        }

        public Criteria andCorpIdIsNotNull() {
            addCriterion("corp_id is not null");
            return (Criteria) this;
        }

        public Criteria andCorpIdEqualTo(String value) {
            addCriterion("corp_id =", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdNotEqualTo(String value) {
            addCriterion("corp_id <>", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdGreaterThan(String value) {
            addCriterion("corp_id >", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdGreaterThanOrEqualTo(String value) {
            addCriterion("corp_id >=", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdLessThan(String value) {
            addCriterion("corp_id <", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdLessThanOrEqualTo(String value) {
            addCriterion("corp_id <=", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdLike(String value) {
            addCriterion("corp_id like", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdNotLike(String value) {
            addCriterion("corp_id not like", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdIn(List<String> values) {
            addCriterion("corp_id in", values, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdNotIn(List<String> values) {
            addCriterion("corp_id not in", values, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdBetween(String value1, String value2) {
            addCriterion("corp_id between", value1, value2, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdNotBetween(String value1, String value2) {
            addCriterion("corp_id not between", value1, value2, "corpId");
            return (Criteria) this;
        }

        public Criteria andCertTypeIdIsNull() {
            addCriterion("cert_type_id is null");
            return (Criteria) this;
        }

        public Criteria andCertTypeIdIsNotNull() {
            addCriterion("cert_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andCertTypeIdEqualTo(Integer value) {
            addCriterion("cert_type_id =", value, "certTypeId");
            return (Criteria) this;
        }

        public Criteria andCertTypeIdNotEqualTo(Integer value) {
            addCriterion("cert_type_id <>", value, "certTypeId");
            return (Criteria) this;
        }

        public Criteria andCertTypeIdGreaterThan(Integer value) {
            addCriterion("cert_type_id >", value, "certTypeId");
            return (Criteria) this;
        }

        public Criteria andCertTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cert_type_id >=", value, "certTypeId");
            return (Criteria) this;
        }

        public Criteria andCertTypeIdLessThan(Integer value) {
            addCriterion("cert_type_id <", value, "certTypeId");
            return (Criteria) this;
        }

        public Criteria andCertTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("cert_type_id <=", value, "certTypeId");
            return (Criteria) this;
        }

        public Criteria andCertTypeIdIn(List<Integer> values) {
            addCriterion("cert_type_id in", values, "certTypeId");
            return (Criteria) this;
        }

        public Criteria andCertTypeIdNotIn(List<Integer> values) {
            addCriterion("cert_type_id not in", values, "certTypeId");
            return (Criteria) this;
        }

        public Criteria andCertTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("cert_type_id between", value1, value2, "certTypeId");
            return (Criteria) this;
        }

        public Criteria andCertTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cert_type_id not between", value1, value2, "certTypeId");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNull() {
            addCriterion("cert_type is null");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNotNull() {
            addCriterion("cert_type is not null");
            return (Criteria) this;
        }

        public Criteria andCertTypeEqualTo(String value) {
            addCriterion("cert_type =", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotEqualTo(String value) {
            addCriterion("cert_type <>", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThan(String value) {
            addCriterion("cert_type >", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cert_type >=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThan(String value) {
            addCriterion("cert_type <", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThanOrEqualTo(String value) {
            addCriterion("cert_type <=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLike(String value) {
            addCriterion("cert_type like", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotLike(String value) {
            addCriterion("cert_type not like", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeIn(List<String> values) {
            addCriterion("cert_type in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotIn(List<String> values) {
            addCriterion("cert_type not in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeBetween(String value1, String value2) {
            addCriterion("cert_type between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotBetween(String value1, String value2) {
            addCriterion("cert_type not between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andCertNoIsNull() {
            addCriterion("cert_no is null");
            return (Criteria) this;
        }

        public Criteria andCertNoIsNotNull() {
            addCriterion("cert_no is not null");
            return (Criteria) this;
        }

        public Criteria andCertNoEqualTo(String value) {
            addCriterion("cert_no =", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotEqualTo(String value) {
            addCriterion("cert_no <>", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoGreaterThan(String value) {
            addCriterion("cert_no >", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoGreaterThanOrEqualTo(String value) {
            addCriterion("cert_no >=", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLessThan(String value) {
            addCriterion("cert_no <", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLessThanOrEqualTo(String value) {
            addCriterion("cert_no <=", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLike(String value) {
            addCriterion("cert_no like", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotLike(String value) {
            addCriterion("cert_no not like", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoIn(List<String> values) {
            addCriterion("cert_no in", values, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotIn(List<String> values) {
            addCriterion("cert_no not in", values, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoBetween(String value1, String value2) {
            addCriterion("cert_no between", value1, value2, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotBetween(String value1, String value2) {
            addCriterion("cert_no not between", value1, value2, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNameIsNull() {
            addCriterion("cert_name is null");
            return (Criteria) this;
        }

        public Criteria andCertNameIsNotNull() {
            addCriterion("cert_name is not null");
            return (Criteria) this;
        }

        public Criteria andCertNameEqualTo(String value) {
            addCriterion("cert_name =", value, "certName");
            return (Criteria) this;
        }

        public Criteria andCertNameNotEqualTo(String value) {
            addCriterion("cert_name <>", value, "certName");
            return (Criteria) this;
        }

        public Criteria andCertNameGreaterThan(String value) {
            addCriterion("cert_name >", value, "certName");
            return (Criteria) this;
        }

        public Criteria andCertNameGreaterThanOrEqualTo(String value) {
            addCriterion("cert_name >=", value, "certName");
            return (Criteria) this;
        }

        public Criteria andCertNameLessThan(String value) {
            addCriterion("cert_name <", value, "certName");
            return (Criteria) this;
        }

        public Criteria andCertNameLessThanOrEqualTo(String value) {
            addCriterion("cert_name <=", value, "certName");
            return (Criteria) this;
        }

        public Criteria andCertNameLike(String value) {
            addCriterion("cert_name like", value, "certName");
            return (Criteria) this;
        }

        public Criteria andCertNameNotLike(String value) {
            addCriterion("cert_name not like", value, "certName");
            return (Criteria) this;
        }

        public Criteria andCertNameIn(List<String> values) {
            addCriterion("cert_name in", values, "certName");
            return (Criteria) this;
        }

        public Criteria andCertNameNotIn(List<String> values) {
            addCriterion("cert_name not in", values, "certName");
            return (Criteria) this;
        }

        public Criteria andCertNameBetween(String value1, String value2) {
            addCriterion("cert_name between", value1, value2, "certName");
            return (Criteria) this;
        }

        public Criteria andCertNameNotBetween(String value1, String value2) {
            addCriterion("cert_name not between", value1, value2, "certName");
            return (Criteria) this;
        }

        public Criteria andIssueDateIsNull() {
            addCriterion("issue_date is null");
            return (Criteria) this;
        }

        public Criteria andIssueDateIsNotNull() {
            addCriterion("issue_date is not null");
            return (Criteria) this;
        }

        public Criteria andIssueDateEqualTo(Date value) {
            addCriterion("issue_date =", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateNotEqualTo(Date value) {
            addCriterion("issue_date <>", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateGreaterThan(Date value) {
            addCriterion("issue_date >", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateGreaterThanOrEqualTo(Date value) {
            addCriterion("issue_date >=", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateLessThan(Date value) {
            addCriterion("issue_date <", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateLessThanOrEqualTo(Date value) {
            addCriterion("issue_date <=", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateIn(List<Date> values) {
            addCriterion("issue_date in", values, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateNotIn(List<Date> values) {
            addCriterion("issue_date not in", values, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateBetween(Date value1, Date value2) {
            addCriterion("issue_date between", value1, value2, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateNotBetween(Date value1, Date value2) {
            addCriterion("issue_date not between", value1, value2, "issueDate");
            return (Criteria) this;
        }

        public Criteria andValidDateIsNull() {
            addCriterion("valid_date is null");
            return (Criteria) this;
        }

        public Criteria andValidDateIsNotNull() {
            addCriterion("valid_date is not null");
            return (Criteria) this;
        }

        public Criteria andValidDateEqualTo(Date value) {
            addCriterion("valid_date =", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotEqualTo(Date value) {
            addCriterion("valid_date <>", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateGreaterThan(Date value) {
            addCriterion("valid_date >", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateGreaterThanOrEqualTo(Date value) {
            addCriterion("valid_date >=", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLessThan(Date value) {
            addCriterion("valid_date <", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLessThanOrEqualTo(Date value) {
            addCriterion("valid_date <=", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateIn(List<Date> values) {
            addCriterion("valid_date in", values, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotIn(List<Date> values) {
            addCriterion("valid_date not in", values, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateBetween(Date value1, Date value2) {
            addCriterion("valid_date between", value1, value2, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotBetween(Date value1, Date value2) {
            addCriterion("valid_date not between", value1, value2, "validDate");
            return (Criteria) this;
        }

        public Criteria andIssueAuthorityIsNull() {
            addCriterion("issue_authority is null");
            return (Criteria) this;
        }

        public Criteria andIssueAuthorityIsNotNull() {
            addCriterion("issue_authority is not null");
            return (Criteria) this;
        }

        public Criteria andIssueAuthorityEqualTo(String value) {
            addCriterion("issue_authority =", value, "issueAuthority");
            return (Criteria) this;
        }

        public Criteria andIssueAuthorityNotEqualTo(String value) {
            addCriterion("issue_authority <>", value, "issueAuthority");
            return (Criteria) this;
        }

        public Criteria andIssueAuthorityGreaterThan(String value) {
            addCriterion("issue_authority >", value, "issueAuthority");
            return (Criteria) this;
        }

        public Criteria andIssueAuthorityGreaterThanOrEqualTo(String value) {
            addCriterion("issue_authority >=", value, "issueAuthority");
            return (Criteria) this;
        }

        public Criteria andIssueAuthorityLessThan(String value) {
            addCriterion("issue_authority <", value, "issueAuthority");
            return (Criteria) this;
        }

        public Criteria andIssueAuthorityLessThanOrEqualTo(String value) {
            addCriterion("issue_authority <=", value, "issueAuthority");
            return (Criteria) this;
        }

        public Criteria andIssueAuthorityLike(String value) {
            addCriterion("issue_authority like", value, "issueAuthority");
            return (Criteria) this;
        }

        public Criteria andIssueAuthorityNotLike(String value) {
            addCriterion("issue_authority not like", value, "issueAuthority");
            return (Criteria) this;
        }

        public Criteria andIssueAuthorityIn(List<String> values) {
            addCriterion("issue_authority in", values, "issueAuthority");
            return (Criteria) this;
        }

        public Criteria andIssueAuthorityNotIn(List<String> values) {
            addCriterion("issue_authority not in", values, "issueAuthority");
            return (Criteria) this;
        }

        public Criteria andIssueAuthorityBetween(String value1, String value2) {
            addCriterion("issue_authority between", value1, value2, "issueAuthority");
            return (Criteria) this;
        }

        public Criteria andIssueAuthorityNotBetween(String value1, String value2) {
            addCriterion("issue_authority not between", value1, value2, "issueAuthority");
            return (Criteria) this;
        }

        public Criteria andCertLevelIsNull() {
            addCriterion("cert_level is null");
            return (Criteria) this;
        }

        public Criteria andCertLevelIsNotNull() {
            addCriterion("cert_level is not null");
            return (Criteria) this;
        }

        public Criteria andCertLevelEqualTo(String value) {
            addCriterion("cert_level =", value, "certLevel");
            return (Criteria) this;
        }

        public Criteria andCertLevelNotEqualTo(String value) {
            addCriterion("cert_level <>", value, "certLevel");
            return (Criteria) this;
        }

        public Criteria andCertLevelGreaterThan(String value) {
            addCriterion("cert_level >", value, "certLevel");
            return (Criteria) this;
        }

        public Criteria andCertLevelGreaterThanOrEqualTo(String value) {
            addCriterion("cert_level >=", value, "certLevel");
            return (Criteria) this;
        }

        public Criteria andCertLevelLessThan(String value) {
            addCriterion("cert_level <", value, "certLevel");
            return (Criteria) this;
        }

        public Criteria andCertLevelLessThanOrEqualTo(String value) {
            addCriterion("cert_level <=", value, "certLevel");
            return (Criteria) this;
        }

        public Criteria andCertLevelLike(String value) {
            addCriterion("cert_level like", value, "certLevel");
            return (Criteria) this;
        }

        public Criteria andCertLevelNotLike(String value) {
            addCriterion("cert_level not like", value, "certLevel");
            return (Criteria) this;
        }

        public Criteria andCertLevelIn(List<String> values) {
            addCriterion("cert_level in", values, "certLevel");
            return (Criteria) this;
        }

        public Criteria andCertLevelNotIn(List<String> values) {
            addCriterion("cert_level not in", values, "certLevel");
            return (Criteria) this;
        }

        public Criteria andCertLevelBetween(String value1, String value2) {
            addCriterion("cert_level between", value1, value2, "certLevel");
            return (Criteria) this;
        }

        public Criteria andCertLevelNotBetween(String value1, String value2) {
            addCriterion("cert_level not between", value1, value2, "certLevel");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIdIsNull() {
            addCriterion("trade_type_id is null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIdIsNotNull() {
            addCriterion("trade_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIdEqualTo(Integer value) {
            addCriterion("trade_type_id =", value, "tradeTypeId");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIdNotEqualTo(Integer value) {
            addCriterion("trade_type_id <>", value, "tradeTypeId");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIdGreaterThan(Integer value) {
            addCriterion("trade_type_id >", value, "tradeTypeId");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade_type_id >=", value, "tradeTypeId");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIdLessThan(Integer value) {
            addCriterion("trade_type_id <", value, "tradeTypeId");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("trade_type_id <=", value, "tradeTypeId");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIdIn(List<Integer> values) {
            addCriterion("trade_type_id in", values, "tradeTypeId");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIdNotIn(List<Integer> values) {
            addCriterion("trade_type_id not in", values, "tradeTypeId");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("trade_type_id between", value1, value2, "tradeTypeId");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("trade_type_id not between", value1, value2, "tradeTypeId");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNull() {
            addCriterion("trade_type is null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNotNull() {
            addCriterion("trade_type is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeEqualTo(String value) {
            addCriterion("trade_type =", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotEqualTo(String value) {
            addCriterion("trade_type <>", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThan(String value) {
            addCriterion("trade_type >", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("trade_type >=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThan(String value) {
            addCriterion("trade_type <", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThanOrEqualTo(String value) {
            addCriterion("trade_type <=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLike(String value) {
            addCriterion("trade_type like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotLike(String value) {
            addCriterion("trade_type not like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIn(List<String> values) {
            addCriterion("trade_type in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotIn(List<String> values) {
            addCriterion("trade_type not in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeBetween(String value1, String value2) {
            addCriterion("trade_type between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotBetween(String value1, String value2) {
            addCriterion("trade_type not between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andMajorTypeIdIsNull() {
            addCriterion("major_type_id is null");
            return (Criteria) this;
        }

        public Criteria andMajorTypeIdIsNotNull() {
            addCriterion("major_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andMajorTypeIdEqualTo(Integer value) {
            addCriterion("major_type_id =", value, "majorTypeId");
            return (Criteria) this;
        }

        public Criteria andMajorTypeIdNotEqualTo(Integer value) {
            addCriterion("major_type_id <>", value, "majorTypeId");
            return (Criteria) this;
        }

        public Criteria andMajorTypeIdGreaterThan(Integer value) {
            addCriterion("major_type_id >", value, "majorTypeId");
            return (Criteria) this;
        }

        public Criteria andMajorTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("major_type_id >=", value, "majorTypeId");
            return (Criteria) this;
        }

        public Criteria andMajorTypeIdLessThan(Integer value) {
            addCriterion("major_type_id <", value, "majorTypeId");
            return (Criteria) this;
        }

        public Criteria andMajorTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("major_type_id <=", value, "majorTypeId");
            return (Criteria) this;
        }

        public Criteria andMajorTypeIdIn(List<Integer> values) {
            addCriterion("major_type_id in", values, "majorTypeId");
            return (Criteria) this;
        }

        public Criteria andMajorTypeIdNotIn(List<Integer> values) {
            addCriterion("major_type_id not in", values, "majorTypeId");
            return (Criteria) this;
        }

        public Criteria andMajorTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("major_type_id between", value1, value2, "majorTypeId");
            return (Criteria) this;
        }

        public Criteria andMajorTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("major_type_id not between", value1, value2, "majorTypeId");
            return (Criteria) this;
        }

        public Criteria andMajorTypeIsNull() {
            addCriterion("major_type is null");
            return (Criteria) this;
        }

        public Criteria andMajorTypeIsNotNull() {
            addCriterion("major_type is not null");
            return (Criteria) this;
        }

        public Criteria andMajorTypeEqualTo(String value) {
            addCriterion("major_type =", value, "majorType");
            return (Criteria) this;
        }

        public Criteria andMajorTypeNotEqualTo(String value) {
            addCriterion("major_type <>", value, "majorType");
            return (Criteria) this;
        }

        public Criteria andMajorTypeGreaterThan(String value) {
            addCriterion("major_type >", value, "majorType");
            return (Criteria) this;
        }

        public Criteria andMajorTypeGreaterThanOrEqualTo(String value) {
            addCriterion("major_type >=", value, "majorType");
            return (Criteria) this;
        }

        public Criteria andMajorTypeLessThan(String value) {
            addCriterion("major_type <", value, "majorType");
            return (Criteria) this;
        }

        public Criteria andMajorTypeLessThanOrEqualTo(String value) {
            addCriterion("major_type <=", value, "majorType");
            return (Criteria) this;
        }

        public Criteria andMajorTypeLike(String value) {
            addCriterion("major_type like", value, "majorType");
            return (Criteria) this;
        }

        public Criteria andMajorTypeNotLike(String value) {
            addCriterion("major_type not like", value, "majorType");
            return (Criteria) this;
        }

        public Criteria andMajorTypeIn(List<String> values) {
            addCriterion("major_type in", values, "majorType");
            return (Criteria) this;
        }

        public Criteria andMajorTypeNotIn(List<String> values) {
            addCriterion("major_type not in", values, "majorType");
            return (Criteria) this;
        }

        public Criteria andMajorTypeBetween(String value1, String value2) {
            addCriterion("major_type between", value1, value2, "majorType");
            return (Criteria) this;
        }

        public Criteria andMajorTypeNotBetween(String value1, String value2) {
            addCriterion("major_type not between", value1, value2, "majorType");
            return (Criteria) this;
        }

        public Criteria andStatuslabelIsNull() {
            addCriterion("statusLabel is null");
            return (Criteria) this;
        }

        public Criteria andStatuslabelIsNotNull() {
            addCriterion("statusLabel is not null");
            return (Criteria) this;
        }

        public Criteria andStatuslabelEqualTo(String value) {
            addCriterion("statusLabel =", value, "statuslabel");
            return (Criteria) this;
        }

        public Criteria andStatuslabelNotEqualTo(String value) {
            addCriterion("statusLabel <>", value, "statuslabel");
            return (Criteria) this;
        }

        public Criteria andStatuslabelGreaterThan(String value) {
            addCriterion("statusLabel >", value, "statuslabel");
            return (Criteria) this;
        }

        public Criteria andStatuslabelGreaterThanOrEqualTo(String value) {
            addCriterion("statusLabel >=", value, "statuslabel");
            return (Criteria) this;
        }

        public Criteria andStatuslabelLessThan(String value) {
            addCriterion("statusLabel <", value, "statuslabel");
            return (Criteria) this;
        }

        public Criteria andStatuslabelLessThanOrEqualTo(String value) {
            addCriterion("statusLabel <=", value, "statuslabel");
            return (Criteria) this;
        }

        public Criteria andStatuslabelLike(String value) {
            addCriterion("statusLabel like", value, "statuslabel");
            return (Criteria) this;
        }

        public Criteria andStatuslabelNotLike(String value) {
            addCriterion("statusLabel not like", value, "statuslabel");
            return (Criteria) this;
        }

        public Criteria andStatuslabelIn(List<String> values) {
            addCriterion("statusLabel in", values, "statuslabel");
            return (Criteria) this;
        }

        public Criteria andStatuslabelNotIn(List<String> values) {
            addCriterion("statusLabel not in", values, "statuslabel");
            return (Criteria) this;
        }

        public Criteria andStatuslabelBetween(String value1, String value2) {
            addCriterion("statusLabel between", value1, value2, "statuslabel");
            return (Criteria) this;
        }

        public Criteria andStatuslabelNotBetween(String value1, String value2) {
            addCriterion("statusLabel not between", value1, value2, "statuslabel");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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

        public Criteria andCorpIdLikeInsensitive(String value) {
            addCriterion("upper(corp_id) like", value.toUpperCase(), "corpId");
            return (Criteria) this;
        }

        public Criteria andCertTypeLikeInsensitive(String value) {
            addCriterion("upper(cert_type) like", value.toUpperCase(), "certType");
            return (Criteria) this;
        }

        public Criteria andCertNoLikeInsensitive(String value) {
            addCriterion("upper(cert_no) like", value.toUpperCase(), "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNameLikeInsensitive(String value) {
            addCriterion("upper(cert_name) like", value.toUpperCase(), "certName");
            return (Criteria) this;
        }

        public Criteria andIssueAuthorityLikeInsensitive(String value) {
            addCriterion("upper(issue_authority) like", value.toUpperCase(), "issueAuthority");
            return (Criteria) this;
        }

        public Criteria andCertLevelLikeInsensitive(String value) {
            addCriterion("upper(cert_level) like", value.toUpperCase(), "certLevel");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLikeInsensitive(String value) {
            addCriterion("upper(trade_type) like", value.toUpperCase(), "tradeType");
            return (Criteria) this;
        }

        public Criteria andMajorTypeLikeInsensitive(String value) {
            addCriterion("upper(major_type) like", value.toUpperCase(), "majorType");
            return (Criteria) this;
        }

        public Criteria andStatuslabelLikeInsensitive(String value) {
            addCriterion("upper(statusLabel) like", value.toUpperCase(), "statuslabel");
            return (Criteria) this;
        }

        public Criteria andTagLikeInsensitive(String value) {
            addCriterion("upper(tag) like", value.toUpperCase(), "tag");
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