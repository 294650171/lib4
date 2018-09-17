package cn.wuxi.js.lib4.crawler.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CorpRegStaffCertExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CorpRegStaffCertExample() {
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

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(Integer value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(Integer value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(Integer value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(Integer value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(Integer value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<Integer> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<Integer> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(Integer value1, Integer value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardIsNull() {
            addCriterion("staff_id_card is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardIsNotNull() {
            addCriterion("staff_id_card is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardEqualTo(String value) {
            addCriterion("staff_id_card =", value, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardNotEqualTo(String value) {
            addCriterion("staff_id_card <>", value, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardGreaterThan(String value) {
            addCriterion("staff_id_card >", value, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("staff_id_card >=", value, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardLessThan(String value) {
            addCriterion("staff_id_card <", value, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardLessThanOrEqualTo(String value) {
            addCriterion("staff_id_card <=", value, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardLike(String value) {
            addCriterion("staff_id_card like", value, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardNotLike(String value) {
            addCriterion("staff_id_card not like", value, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardIn(List<String> values) {
            addCriterion("staff_id_card in", values, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardNotIn(List<String> values) {
            addCriterion("staff_id_card not in", values, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardBetween(String value1, String value2) {
            addCriterion("staff_id_card between", value1, value2, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardNotBetween(String value1, String value2) {
            addCriterion("staff_id_card not between", value1, value2, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andRegTypeIsNull() {
            addCriterion("reg_type is null");
            return (Criteria) this;
        }

        public Criteria andRegTypeIsNotNull() {
            addCriterion("reg_type is not null");
            return (Criteria) this;
        }

        public Criteria andRegTypeEqualTo(String value) {
            addCriterion("reg_type =", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeNotEqualTo(String value) {
            addCriterion("reg_type <>", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeGreaterThan(String value) {
            addCriterion("reg_type >", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeGreaterThanOrEqualTo(String value) {
            addCriterion("reg_type >=", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeLessThan(String value) {
            addCriterion("reg_type <", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeLessThanOrEqualTo(String value) {
            addCriterion("reg_type <=", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeLike(String value) {
            addCriterion("reg_type like", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeNotLike(String value) {
            addCriterion("reg_type not like", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeIn(List<String> values) {
            addCriterion("reg_type in", values, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeNotIn(List<String> values) {
            addCriterion("reg_type not in", values, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeBetween(String value1, String value2) {
            addCriterion("reg_type between", value1, value2, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeNotBetween(String value1, String value2) {
            addCriterion("reg_type not between", value1, value2, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeIdIsNull() {
            addCriterion("reg_type_id is null");
            return (Criteria) this;
        }

        public Criteria andRegTypeIdIsNotNull() {
            addCriterion("reg_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegTypeIdEqualTo(Integer value) {
            addCriterion("reg_type_id =", value, "regTypeId");
            return (Criteria) this;
        }

        public Criteria andRegTypeIdNotEqualTo(Integer value) {
            addCriterion("reg_type_id <>", value, "regTypeId");
            return (Criteria) this;
        }

        public Criteria andRegTypeIdGreaterThan(Integer value) {
            addCriterion("reg_type_id >", value, "regTypeId");
            return (Criteria) this;
        }

        public Criteria andRegTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reg_type_id >=", value, "regTypeId");
            return (Criteria) this;
        }

        public Criteria andRegTypeIdLessThan(Integer value) {
            addCriterion("reg_type_id <", value, "regTypeId");
            return (Criteria) this;
        }

        public Criteria andRegTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("reg_type_id <=", value, "regTypeId");
            return (Criteria) this;
        }

        public Criteria andRegTypeIdIn(List<Integer> values) {
            addCriterion("reg_type_id in", values, "regTypeId");
            return (Criteria) this;
        }

        public Criteria andRegTypeIdNotIn(List<Integer> values) {
            addCriterion("reg_type_id not in", values, "regTypeId");
            return (Criteria) this;
        }

        public Criteria andRegTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("reg_type_id between", value1, value2, "regTypeId");
            return (Criteria) this;
        }

        public Criteria andRegTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reg_type_id not between", value1, value2, "regTypeId");
            return (Criteria) this;
        }

        public Criteria andRegMajorIsNull() {
            addCriterion("reg_major is null");
            return (Criteria) this;
        }

        public Criteria andRegMajorIsNotNull() {
            addCriterion("reg_major is not null");
            return (Criteria) this;
        }

        public Criteria andRegMajorEqualTo(String value) {
            addCriterion("reg_major =", value, "regMajor");
            return (Criteria) this;
        }

        public Criteria andRegMajorNotEqualTo(String value) {
            addCriterion("reg_major <>", value, "regMajor");
            return (Criteria) this;
        }

        public Criteria andRegMajorGreaterThan(String value) {
            addCriterion("reg_major >", value, "regMajor");
            return (Criteria) this;
        }

        public Criteria andRegMajorGreaterThanOrEqualTo(String value) {
            addCriterion("reg_major >=", value, "regMajor");
            return (Criteria) this;
        }

        public Criteria andRegMajorLessThan(String value) {
            addCriterion("reg_major <", value, "regMajor");
            return (Criteria) this;
        }

        public Criteria andRegMajorLessThanOrEqualTo(String value) {
            addCriterion("reg_major <=", value, "regMajor");
            return (Criteria) this;
        }

        public Criteria andRegMajorLike(String value) {
            addCriterion("reg_major like", value, "regMajor");
            return (Criteria) this;
        }

        public Criteria andRegMajorNotLike(String value) {
            addCriterion("reg_major not like", value, "regMajor");
            return (Criteria) this;
        }

        public Criteria andRegMajorIn(List<String> values) {
            addCriterion("reg_major in", values, "regMajor");
            return (Criteria) this;
        }

        public Criteria andRegMajorNotIn(List<String> values) {
            addCriterion("reg_major not in", values, "regMajor");
            return (Criteria) this;
        }

        public Criteria andRegMajorBetween(String value1, String value2) {
            addCriterion("reg_major between", value1, value2, "regMajor");
            return (Criteria) this;
        }

        public Criteria andRegMajorNotBetween(String value1, String value2) {
            addCriterion("reg_major not between", value1, value2, "regMajor");
            return (Criteria) this;
        }

        public Criteria andRegMajorIdIsNull() {
            addCriterion("reg_major_id is null");
            return (Criteria) this;
        }

        public Criteria andRegMajorIdIsNotNull() {
            addCriterion("reg_major_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegMajorIdEqualTo(Integer value) {
            addCriterion("reg_major_id =", value, "regMajorId");
            return (Criteria) this;
        }

        public Criteria andRegMajorIdNotEqualTo(Integer value) {
            addCriterion("reg_major_id <>", value, "regMajorId");
            return (Criteria) this;
        }

        public Criteria andRegMajorIdGreaterThan(Integer value) {
            addCriterion("reg_major_id >", value, "regMajorId");
            return (Criteria) this;
        }

        public Criteria andRegMajorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reg_major_id >=", value, "regMajorId");
            return (Criteria) this;
        }

        public Criteria andRegMajorIdLessThan(Integer value) {
            addCriterion("reg_major_id <", value, "regMajorId");
            return (Criteria) this;
        }

        public Criteria andRegMajorIdLessThanOrEqualTo(Integer value) {
            addCriterion("reg_major_id <=", value, "regMajorId");
            return (Criteria) this;
        }

        public Criteria andRegMajorIdIn(List<Integer> values) {
            addCriterion("reg_major_id in", values, "regMajorId");
            return (Criteria) this;
        }

        public Criteria andRegMajorIdNotIn(List<Integer> values) {
            addCriterion("reg_major_id not in", values, "regMajorId");
            return (Criteria) this;
        }

        public Criteria andRegMajorIdBetween(Integer value1, Integer value2) {
            addCriterion("reg_major_id between", value1, value2, "regMajorId");
            return (Criteria) this;
        }

        public Criteria andRegMajorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reg_major_id not between", value1, value2, "regMajorId");
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

        public Criteria andRegNoIsNull() {
            addCriterion("reg_no is null");
            return (Criteria) this;
        }

        public Criteria andRegNoIsNotNull() {
            addCriterion("reg_no is not null");
            return (Criteria) this;
        }

        public Criteria andRegNoEqualTo(String value) {
            addCriterion("reg_no =", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoNotEqualTo(String value) {
            addCriterion("reg_no <>", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoGreaterThan(String value) {
            addCriterion("reg_no >", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoGreaterThanOrEqualTo(String value) {
            addCriterion("reg_no >=", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoLessThan(String value) {
            addCriterion("reg_no <", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoLessThanOrEqualTo(String value) {
            addCriterion("reg_no <=", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoLike(String value) {
            addCriterion("reg_no like", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoNotLike(String value) {
            addCriterion("reg_no not like", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoIn(List<String> values) {
            addCriterion("reg_no in", values, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoNotIn(List<String> values) {
            addCriterion("reg_no not in", values, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoBetween(String value1, String value2) {
            addCriterion("reg_no between", value1, value2, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoNotBetween(String value1, String value2) {
            addCriterion("reg_no not between", value1, value2, "regNo");
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

        public Criteria andStaffIdCard2IsNull() {
            addCriterion("staff_id_card2 is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdCard2IsNotNull() {
            addCriterion("staff_id_card2 is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdCard2EqualTo(String value) {
            addCriterion("staff_id_card2 =", value, "staffIdCard2");
            return (Criteria) this;
        }

        public Criteria andStaffIdCard2NotEqualTo(String value) {
            addCriterion("staff_id_card2 <>", value, "staffIdCard2");
            return (Criteria) this;
        }

        public Criteria andStaffIdCard2GreaterThan(String value) {
            addCriterion("staff_id_card2 >", value, "staffIdCard2");
            return (Criteria) this;
        }

        public Criteria andStaffIdCard2GreaterThanOrEqualTo(String value) {
            addCriterion("staff_id_card2 >=", value, "staffIdCard2");
            return (Criteria) this;
        }

        public Criteria andStaffIdCard2LessThan(String value) {
            addCriterion("staff_id_card2 <", value, "staffIdCard2");
            return (Criteria) this;
        }

        public Criteria andStaffIdCard2LessThanOrEqualTo(String value) {
            addCriterion("staff_id_card2 <=", value, "staffIdCard2");
            return (Criteria) this;
        }

        public Criteria andStaffIdCard2Like(String value) {
            addCriterion("staff_id_card2 like", value, "staffIdCard2");
            return (Criteria) this;
        }

        public Criteria andStaffIdCard2NotLike(String value) {
            addCriterion("staff_id_card2 not like", value, "staffIdCard2");
            return (Criteria) this;
        }

        public Criteria andStaffIdCard2In(List<String> values) {
            addCriterion("staff_id_card2 in", values, "staffIdCard2");
            return (Criteria) this;
        }

        public Criteria andStaffIdCard2NotIn(List<String> values) {
            addCriterion("staff_id_card2 not in", values, "staffIdCard2");
            return (Criteria) this;
        }

        public Criteria andStaffIdCard2Between(String value1, String value2) {
            addCriterion("staff_id_card2 between", value1, value2, "staffIdCard2");
            return (Criteria) this;
        }

        public Criteria andStaffIdCard2NotBetween(String value1, String value2) {
            addCriterion("staff_id_card2 not between", value1, value2, "staffIdCard2");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardLikeInsensitive(String value) {
            addCriterion("upper(staff_id_card) like", value.toUpperCase(), "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andRegTypeLikeInsensitive(String value) {
            addCriterion("upper(reg_type) like", value.toUpperCase(), "regType");
            return (Criteria) this;
        }

        public Criteria andRegMajorLikeInsensitive(String value) {
            addCriterion("upper(reg_major) like", value.toUpperCase(), "regMajor");
            return (Criteria) this;
        }

        public Criteria andCertNoLikeInsensitive(String value) {
            addCriterion("upper(cert_no) like", value.toUpperCase(), "certNo");
            return (Criteria) this;
        }

        public Criteria andRegNoLikeInsensitive(String value) {
            addCriterion("upper(reg_no) like", value.toUpperCase(), "regNo");
            return (Criteria) this;
        }

        public Criteria andStaffIdCard2LikeInsensitive(String value) {
            addCriterion("upper(staff_id_card2) like", value.toUpperCase(), "staffIdCard2");
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