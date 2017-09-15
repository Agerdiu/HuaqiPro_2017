package com.huaqi.bean;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("userName =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("userName <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("userName >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("userName <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("userName like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("userName not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("userName in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("userName not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Double value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Double value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Double value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Double value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Double value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Double value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Double> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Double> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Double value1, Double value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Double value1, Double value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(Double value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(Double value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(Double value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(Double value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(Double value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(Double value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<Double> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<Double> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(Double value1, Double value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(Double value1, Double value2) {
            addCriterion("address not between", value1, value2, "address");
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

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("userType is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("userType is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("userType =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("userType <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("userType >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("userType >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("userType <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("userType <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("userType like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("userType not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("userType in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("userType not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("userType between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("userType not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andMajorExpenditureIsNull() {
            addCriterion("majorExpenditure is null");
            return (Criteria) this;
        }

        public Criteria andMajorExpenditureIsNotNull() {
            addCriterion("majorExpenditure is not null");
            return (Criteria) this;
        }

        public Criteria andMajorExpenditureEqualTo(Double value) {
            addCriterion("majorExpenditure =", value, "majorExpenditure");
            return (Criteria) this;
        }

        public Criteria andMajorExpenditureNotEqualTo(Double value) {
            addCriterion("majorExpenditure <>", value, "majorExpenditure");
            return (Criteria) this;
        }

        public Criteria andMajorExpenditureGreaterThan(Double value) {
            addCriterion("majorExpenditure >", value, "majorExpenditure");
            return (Criteria) this;
        }

        public Criteria andMajorExpenditureGreaterThanOrEqualTo(Double value) {
            addCriterion("majorExpenditure >=", value, "majorExpenditure");
            return (Criteria) this;
        }

        public Criteria andMajorExpenditureLessThan(Double value) {
            addCriterion("majorExpenditure <", value, "majorExpenditure");
            return (Criteria) this;
        }

        public Criteria andMajorExpenditureLessThanOrEqualTo(Double value) {
            addCriterion("majorExpenditure <=", value, "majorExpenditure");
            return (Criteria) this;
        }

        public Criteria andMajorExpenditureIn(List<Double> values) {
            addCriterion("majorExpenditure in", values, "majorExpenditure");
            return (Criteria) this;
        }

        public Criteria andMajorExpenditureNotIn(List<Double> values) {
            addCriterion("majorExpenditure not in", values, "majorExpenditure");
            return (Criteria) this;
        }

        public Criteria andMajorExpenditureBetween(Double value1, Double value2) {
            addCriterion("majorExpenditure between", value1, value2, "majorExpenditure");
            return (Criteria) this;
        }

        public Criteria andMajorExpenditureNotBetween(Double value1, Double value2) {
            addCriterion("majorExpenditure not between", value1, value2, "majorExpenditure");
            return (Criteria) this;
        }

        public Criteria andRenovatedHouseIsNull() {
            addCriterion("renovatedHouse is null");
            return (Criteria) this;
        }

        public Criteria andRenovatedHouseIsNotNull() {
            addCriterion("renovatedHouse is not null");
            return (Criteria) this;
        }

        public Criteria andRenovatedHouseEqualTo(Double value) {
            addCriterion("renovatedHouse =", value, "renovatedHouse");
            return (Criteria) this;
        }

        public Criteria andRenovatedHouseNotEqualTo(Double value) {
            addCriterion("renovatedHouse <>", value, "renovatedHouse");
            return (Criteria) this;
        }

        public Criteria andRenovatedHouseGreaterThan(Double value) {
            addCriterion("renovatedHouse >", value, "renovatedHouse");
            return (Criteria) this;
        }

        public Criteria andRenovatedHouseGreaterThanOrEqualTo(Double value) {
            addCriterion("renovatedHouse >=", value, "renovatedHouse");
            return (Criteria) this;
        }

        public Criteria andRenovatedHouseLessThan(Double value) {
            addCriterion("renovatedHouse <", value, "renovatedHouse");
            return (Criteria) this;
        }

        public Criteria andRenovatedHouseLessThanOrEqualTo(Double value) {
            addCriterion("renovatedHouse <=", value, "renovatedHouse");
            return (Criteria) this;
        }

        public Criteria andRenovatedHouseIn(List<Double> values) {
            addCriterion("renovatedHouse in", values, "renovatedHouse");
            return (Criteria) this;
        }

        public Criteria andRenovatedHouseNotIn(List<Double> values) {
            addCriterion("renovatedHouse not in", values, "renovatedHouse");
            return (Criteria) this;
        }

        public Criteria andRenovatedHouseBetween(Double value1, Double value2) {
            addCriterion("renovatedHouse between", value1, value2, "renovatedHouse");
            return (Criteria) this;
        }

        public Criteria andRenovatedHouseNotBetween(Double value1, Double value2) {
            addCriterion("renovatedHouse not between", value1, value2, "renovatedHouse");
            return (Criteria) this;
        }

        public Criteria andHouseValueIsNull() {
            addCriterion("houseValue is null");
            return (Criteria) this;
        }

        public Criteria andHouseValueIsNotNull() {
            addCriterion("houseValue is not null");
            return (Criteria) this;
        }

        public Criteria andHouseValueEqualTo(Double value) {
            addCriterion("houseValue =", value, "houseValue");
            return (Criteria) this;
        }

        public Criteria andHouseValueNotEqualTo(Double value) {
            addCriterion("houseValue <>", value, "houseValue");
            return (Criteria) this;
        }

        public Criteria andHouseValueGreaterThan(Double value) {
            addCriterion("houseValue >", value, "houseValue");
            return (Criteria) this;
        }

        public Criteria andHouseValueGreaterThanOrEqualTo(Double value) {
            addCriterion("houseValue >=", value, "houseValue");
            return (Criteria) this;
        }

        public Criteria andHouseValueLessThan(Double value) {
            addCriterion("houseValue <", value, "houseValue");
            return (Criteria) this;
        }

        public Criteria andHouseValueLessThanOrEqualTo(Double value) {
            addCriterion("houseValue <=", value, "houseValue");
            return (Criteria) this;
        }

        public Criteria andHouseValueIn(List<Double> values) {
            addCriterion("houseValue in", values, "houseValue");
            return (Criteria) this;
        }

        public Criteria andHouseValueNotIn(List<Double> values) {
            addCriterion("houseValue not in", values, "houseValue");
            return (Criteria) this;
        }

        public Criteria andHouseValueBetween(Double value1, Double value2) {
            addCriterion("houseValue between", value1, value2, "houseValue");
            return (Criteria) this;
        }

        public Criteria andHouseValueNotBetween(Double value1, Double value2) {
            addCriterion("houseValue not between", value1, value2, "houseValue");
            return (Criteria) this;
        }

        public Criteria andAgriculturalEquipIsNull() {
            addCriterion("agriculturalEquip is null");
            return (Criteria) this;
        }

        public Criteria andAgriculturalEquipIsNotNull() {
            addCriterion("agriculturalEquip is not null");
            return (Criteria) this;
        }

        public Criteria andAgriculturalEquipEqualTo(Double value) {
            addCriterion("agriculturalEquip =", value, "agriculturalEquip");
            return (Criteria) this;
        }

        public Criteria andAgriculturalEquipNotEqualTo(Double value) {
            addCriterion("agriculturalEquip <>", value, "agriculturalEquip");
            return (Criteria) this;
        }

        public Criteria andAgriculturalEquipGreaterThan(Double value) {
            addCriterion("agriculturalEquip >", value, "agriculturalEquip");
            return (Criteria) this;
        }

        public Criteria andAgriculturalEquipGreaterThanOrEqualTo(Double value) {
            addCriterion("agriculturalEquip >=", value, "agriculturalEquip");
            return (Criteria) this;
        }

        public Criteria andAgriculturalEquipLessThan(Double value) {
            addCriterion("agriculturalEquip <", value, "agriculturalEquip");
            return (Criteria) this;
        }

        public Criteria andAgriculturalEquipLessThanOrEqualTo(Double value) {
            addCriterion("agriculturalEquip <=", value, "agriculturalEquip");
            return (Criteria) this;
        }

        public Criteria andAgriculturalEquipIn(List<Double> values) {
            addCriterion("agriculturalEquip in", values, "agriculturalEquip");
            return (Criteria) this;
        }

        public Criteria andAgriculturalEquipNotIn(List<Double> values) {
            addCriterion("agriculturalEquip not in", values, "agriculturalEquip");
            return (Criteria) this;
        }

        public Criteria andAgriculturalEquipBetween(Double value1, Double value2) {
            addCriterion("agriculturalEquip between", value1, value2, "agriculturalEquip");
            return (Criteria) this;
        }

        public Criteria andAgriculturalEquipNotBetween(Double value1, Double value2) {
            addCriterion("agriculturalEquip not between", value1, value2, "agriculturalEquip");
            return (Criteria) this;
        }

        public Criteria andVehicleValueIsNull() {
            addCriterion("vehicleValue is null");
            return (Criteria) this;
        }

        public Criteria andVehicleValueIsNotNull() {
            addCriterion("vehicleValue is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleValueEqualTo(Double value) {
            addCriterion("vehicleValue =", value, "vehicleValue");
            return (Criteria) this;
        }

        public Criteria andVehicleValueNotEqualTo(Double value) {
            addCriterion("vehicleValue <>", value, "vehicleValue");
            return (Criteria) this;
        }

        public Criteria andVehicleValueGreaterThan(Double value) {
            addCriterion("vehicleValue >", value, "vehicleValue");
            return (Criteria) this;
        }

        public Criteria andVehicleValueGreaterThanOrEqualTo(Double value) {
            addCriterion("vehicleValue >=", value, "vehicleValue");
            return (Criteria) this;
        }

        public Criteria andVehicleValueLessThan(Double value) {
            addCriterion("vehicleValue <", value, "vehicleValue");
            return (Criteria) this;
        }

        public Criteria andVehicleValueLessThanOrEqualTo(Double value) {
            addCriterion("vehicleValue <=", value, "vehicleValue");
            return (Criteria) this;
        }

        public Criteria andVehicleValueIn(List<Double> values) {
            addCriterion("vehicleValue in", values, "vehicleValue");
            return (Criteria) this;
        }

        public Criteria andVehicleValueNotIn(List<Double> values) {
            addCriterion("vehicleValue not in", values, "vehicleValue");
            return (Criteria) this;
        }

        public Criteria andVehicleValueBetween(Double value1, Double value2) {
            addCriterion("vehicleValue between", value1, value2, "vehicleValue");
            return (Criteria) this;
        }

        public Criteria andVehicleValueNotBetween(Double value1, Double value2) {
            addCriterion("vehicleValue not between", value1, value2, "vehicleValue");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsIsNull() {
            addCriterion("fixedAssets is null");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsIsNotNull() {
            addCriterion("fixedAssets is not null");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsEqualTo(Double value) {
            addCriterion("fixedAssets =", value, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsNotEqualTo(Double value) {
            addCriterion("fixedAssets <>", value, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsGreaterThan(Double value) {
            addCriterion("fixedAssets >", value, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsGreaterThanOrEqualTo(Double value) {
            addCriterion("fixedAssets >=", value, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsLessThan(Double value) {
            addCriterion("fixedAssets <", value, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsLessThanOrEqualTo(Double value) {
            addCriterion("fixedAssets <=", value, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsIn(List<Double> values) {
            addCriterion("fixedAssets in", values, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsNotIn(List<Double> values) {
            addCriterion("fixedAssets not in", values, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsBetween(Double value1, Double value2) {
            addCriterion("fixedAssets between", value1, value2, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsNotBetween(Double value1, Double value2) {
            addCriterion("fixedAssets not between", value1, value2, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andAgriHypothecaryValueIsNull() {
            addCriterion("agriHypothecaryValue is null");
            return (Criteria) this;
        }

        public Criteria andAgriHypothecaryValueIsNotNull() {
            addCriterion("agriHypothecaryValue is not null");
            return (Criteria) this;
        }

        public Criteria andAgriHypothecaryValueEqualTo(Double value) {
            addCriterion("agriHypothecaryValue =", value, "agriHypothecaryValue");
            return (Criteria) this;
        }

        public Criteria andAgriHypothecaryValueNotEqualTo(Double value) {
            addCriterion("agriHypothecaryValue <>", value, "agriHypothecaryValue");
            return (Criteria) this;
        }

        public Criteria andAgriHypothecaryValueGreaterThan(Double value) {
            addCriterion("agriHypothecaryValue >", value, "agriHypothecaryValue");
            return (Criteria) this;
        }

        public Criteria andAgriHypothecaryValueGreaterThanOrEqualTo(Double value) {
            addCriterion("agriHypothecaryValue >=", value, "agriHypothecaryValue");
            return (Criteria) this;
        }

        public Criteria andAgriHypothecaryValueLessThan(Double value) {
            addCriterion("agriHypothecaryValue <", value, "agriHypothecaryValue");
            return (Criteria) this;
        }

        public Criteria andAgriHypothecaryValueLessThanOrEqualTo(Double value) {
            addCriterion("agriHypothecaryValue <=", value, "agriHypothecaryValue");
            return (Criteria) this;
        }

        public Criteria andAgriHypothecaryValueIn(List<Double> values) {
            addCriterion("agriHypothecaryValue in", values, "agriHypothecaryValue");
            return (Criteria) this;
        }

        public Criteria andAgriHypothecaryValueNotIn(List<Double> values) {
            addCriterion("agriHypothecaryValue not in", values, "agriHypothecaryValue");
            return (Criteria) this;
        }

        public Criteria andAgriHypothecaryValueBetween(Double value1, Double value2) {
            addCriterion("agriHypothecaryValue between", value1, value2, "agriHypothecaryValue");
            return (Criteria) this;
        }

        public Criteria andAgriHypothecaryValueNotBetween(Double value1, Double value2) {
            addCriterion("agriHypothecaryValue not between", value1, value2, "agriHypothecaryValue");
            return (Criteria) this;
        }

        public Criteria andDepositIsNull() {
            addCriterion("deposit is null");
            return (Criteria) this;
        }

        public Criteria andDepositIsNotNull() {
            addCriterion("deposit is not null");
            return (Criteria) this;
        }

        public Criteria andDepositEqualTo(Double value) {
            addCriterion("deposit =", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotEqualTo(Double value) {
            addCriterion("deposit <>", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThan(Double value) {
            addCriterion("deposit >", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThanOrEqualTo(Double value) {
            addCriterion("deposit >=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThan(Double value) {
            addCriterion("deposit <", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThanOrEqualTo(Double value) {
            addCriterion("deposit <=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositIn(List<Double> values) {
            addCriterion("deposit in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotIn(List<Double> values) {
            addCriterion("deposit not in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositBetween(Double value1, Double value2) {
            addCriterion("deposit between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotBetween(Double value1, Double value2) {
            addCriterion("deposit not between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andAveIncomeIsNull() {
            addCriterion("aveIncome is null");
            return (Criteria) this;
        }

        public Criteria andAveIncomeIsNotNull() {
            addCriterion("aveIncome is not null");
            return (Criteria) this;
        }

        public Criteria andAveIncomeEqualTo(Double value) {
            addCriterion("aveIncome =", value, "aveIncome");
            return (Criteria) this;
        }

        public Criteria andAveIncomeNotEqualTo(Double value) {
            addCriterion("aveIncome <>", value, "aveIncome");
            return (Criteria) this;
        }

        public Criteria andAveIncomeGreaterThan(Double value) {
            addCriterion("aveIncome >", value, "aveIncome");
            return (Criteria) this;
        }

        public Criteria andAveIncomeGreaterThanOrEqualTo(Double value) {
            addCriterion("aveIncome >=", value, "aveIncome");
            return (Criteria) this;
        }

        public Criteria andAveIncomeLessThan(Double value) {
            addCriterion("aveIncome <", value, "aveIncome");
            return (Criteria) this;
        }

        public Criteria andAveIncomeLessThanOrEqualTo(Double value) {
            addCriterion("aveIncome <=", value, "aveIncome");
            return (Criteria) this;
        }

        public Criteria andAveIncomeIn(List<Double> values) {
            addCriterion("aveIncome in", values, "aveIncome");
            return (Criteria) this;
        }

        public Criteria andAveIncomeNotIn(List<Double> values) {
            addCriterion("aveIncome not in", values, "aveIncome");
            return (Criteria) this;
        }

        public Criteria andAveIncomeBetween(Double value1, Double value2) {
            addCriterion("aveIncome between", value1, value2, "aveIncome");
            return (Criteria) this;
        }

        public Criteria andAveIncomeNotBetween(Double value1, Double value2) {
            addCriterion("aveIncome not between", value1, value2, "aveIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeIsNull() {
            addCriterion("monthIncome is null");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeIsNotNull() {
            addCriterion("monthIncome is not null");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeEqualTo(Double value) {
            addCriterion("monthIncome =", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeNotEqualTo(Double value) {
            addCriterion("monthIncome <>", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeGreaterThan(Double value) {
            addCriterion("monthIncome >", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeGreaterThanOrEqualTo(Double value) {
            addCriterion("monthIncome >=", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeLessThan(Double value) {
            addCriterion("monthIncome <", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeLessThanOrEqualTo(Double value) {
            addCriterion("monthIncome <=", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeIn(List<Double> values) {
            addCriterion("monthIncome in", values, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeNotIn(List<Double> values) {
            addCriterion("monthIncome not in", values, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeBetween(Double value1, Double value2) {
            addCriterion("monthIncome between", value1, value2, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeNotBetween(Double value1, Double value2) {
            addCriterion("monthIncome not between", value1, value2, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthRatalIsNull() {
            addCriterion("monthRatal is null");
            return (Criteria) this;
        }

        public Criteria andMonthRatalIsNotNull() {
            addCriterion("monthRatal is not null");
            return (Criteria) this;
        }

        public Criteria andMonthRatalEqualTo(Double value) {
            addCriterion("monthRatal =", value, "monthRatal");
            return (Criteria) this;
        }

        public Criteria andMonthRatalNotEqualTo(Double value) {
            addCriterion("monthRatal <>", value, "monthRatal");
            return (Criteria) this;
        }

        public Criteria andMonthRatalGreaterThan(Double value) {
            addCriterion("monthRatal >", value, "monthRatal");
            return (Criteria) this;
        }

        public Criteria andMonthRatalGreaterThanOrEqualTo(Double value) {
            addCriterion("monthRatal >=", value, "monthRatal");
            return (Criteria) this;
        }

        public Criteria andMonthRatalLessThan(Double value) {
            addCriterion("monthRatal <", value, "monthRatal");
            return (Criteria) this;
        }

        public Criteria andMonthRatalLessThanOrEqualTo(Double value) {
            addCriterion("monthRatal <=", value, "monthRatal");
            return (Criteria) this;
        }

        public Criteria andMonthRatalIn(List<Double> values) {
            addCriterion("monthRatal in", values, "monthRatal");
            return (Criteria) this;
        }

        public Criteria andMonthRatalNotIn(List<Double> values) {
            addCriterion("monthRatal not in", values, "monthRatal");
            return (Criteria) this;
        }

        public Criteria andMonthRatalBetween(Double value1, Double value2) {
            addCriterion("monthRatal between", value1, value2, "monthRatal");
            return (Criteria) this;
        }

        public Criteria andMonthRatalNotBetween(Double value1, Double value2) {
            addCriterion("monthRatal not between", value1, value2, "monthRatal");
            return (Criteria) this;
        }

        public Criteria andCommerceHypothecaryValueIsNull() {
            addCriterion("commerceHypothecaryValue is null");
            return (Criteria) this;
        }

        public Criteria andCommerceHypothecaryValueIsNotNull() {
            addCriterion("commerceHypothecaryValue is not null");
            return (Criteria) this;
        }

        public Criteria andCommerceHypothecaryValueEqualTo(Double value) {
            addCriterion("commerceHypothecaryValue =", value, "commerceHypothecaryValue");
            return (Criteria) this;
        }

        public Criteria andCommerceHypothecaryValueNotEqualTo(Double value) {
            addCriterion("commerceHypothecaryValue <>", value, "commerceHypothecaryValue");
            return (Criteria) this;
        }

        public Criteria andCommerceHypothecaryValueGreaterThan(Double value) {
            addCriterion("commerceHypothecaryValue >", value, "commerceHypothecaryValue");
            return (Criteria) this;
        }

        public Criteria andCommerceHypothecaryValueGreaterThanOrEqualTo(Double value) {
            addCriterion("commerceHypothecaryValue >=", value, "commerceHypothecaryValue");
            return (Criteria) this;
        }

        public Criteria andCommerceHypothecaryValueLessThan(Double value) {
            addCriterion("commerceHypothecaryValue <", value, "commerceHypothecaryValue");
            return (Criteria) this;
        }

        public Criteria andCommerceHypothecaryValueLessThanOrEqualTo(Double value) {
            addCriterion("commerceHypothecaryValue <=", value, "commerceHypothecaryValue");
            return (Criteria) this;
        }

        public Criteria andCommerceHypothecaryValueIn(List<Double> values) {
            addCriterion("commerceHypothecaryValue in", values, "commerceHypothecaryValue");
            return (Criteria) this;
        }

        public Criteria andCommerceHypothecaryValueNotIn(List<Double> values) {
            addCriterion("commerceHypothecaryValue not in", values, "commerceHypothecaryValue");
            return (Criteria) this;
        }

        public Criteria andCommerceHypothecaryValueBetween(Double value1, Double value2) {
            addCriterion("commerceHypothecaryValue between", value1, value2, "commerceHypothecaryValue");
            return (Criteria) this;
        }

        public Criteria andCommerceHypothecaryValueNotBetween(Double value1, Double value2) {
            addCriterion("commerceHypothecaryValue not between", value1, value2, "commerceHypothecaryValue");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesIsNull() {
            addCriterion("liabilities is null");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesIsNotNull() {
            addCriterion("liabilities is not null");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesEqualTo(Double value) {
            addCriterion("liabilities =", value, "liabilities");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesNotEqualTo(Double value) {
            addCriterion("liabilities <>", value, "liabilities");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesGreaterThan(Double value) {
            addCriterion("liabilities >", value, "liabilities");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesGreaterThanOrEqualTo(Double value) {
            addCriterion("liabilities >=", value, "liabilities");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesLessThan(Double value) {
            addCriterion("liabilities <", value, "liabilities");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesLessThanOrEqualTo(Double value) {
            addCriterion("liabilities <=", value, "liabilities");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesIn(List<Double> values) {
            addCriterion("liabilities in", values, "liabilities");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesNotIn(List<Double> values) {
            addCriterion("liabilities not in", values, "liabilities");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesBetween(Double value1, Double value2) {
            addCriterion("liabilities between", value1, value2, "liabilities");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesNotBetween(Double value1, Double value2) {
            addCriterion("liabilities not between", value1, value2, "liabilities");
            return (Criteria) this;
        }

        public Criteria andVillageCadresIsNull() {
            addCriterion("villageCadres is null");
            return (Criteria) this;
        }

        public Criteria andVillageCadresIsNotNull() {
            addCriterion("villageCadres is not null");
            return (Criteria) this;
        }

        public Criteria andVillageCadresEqualTo(Double value) {
            addCriterion("villageCadres =", value, "villageCadres");
            return (Criteria) this;
        }

        public Criteria andVillageCadresNotEqualTo(Double value) {
            addCriterion("villageCadres <>", value, "villageCadres");
            return (Criteria) this;
        }

        public Criteria andVillageCadresGreaterThan(Double value) {
            addCriterion("villageCadres >", value, "villageCadres");
            return (Criteria) this;
        }

        public Criteria andVillageCadresGreaterThanOrEqualTo(Double value) {
            addCriterion("villageCadres >=", value, "villageCadres");
            return (Criteria) this;
        }

        public Criteria andVillageCadresLessThan(Double value) {
            addCriterion("villageCadres <", value, "villageCadres");
            return (Criteria) this;
        }

        public Criteria andVillageCadresLessThanOrEqualTo(Double value) {
            addCriterion("villageCadres <=", value, "villageCadres");
            return (Criteria) this;
        }

        public Criteria andVillageCadresIn(List<Double> values) {
            addCriterion("villageCadres in", values, "villageCadres");
            return (Criteria) this;
        }

        public Criteria andVillageCadresNotIn(List<Double> values) {
            addCriterion("villageCadres not in", values, "villageCadres");
            return (Criteria) this;
        }

        public Criteria andVillageCadresBetween(Double value1, Double value2) {
            addCriterion("villageCadres between", value1, value2, "villageCadres");
            return (Criteria) this;
        }

        public Criteria andVillageCadresNotBetween(Double value1, Double value2) {
            addCriterion("villageCadres not between", value1, value2, "villageCadres");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIsNull() {
            addCriterion("guarantee is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIsNotNull() {
            addCriterion("guarantee is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeEqualTo(Double value) {
            addCriterion("guarantee =", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeNotEqualTo(Double value) {
            addCriterion("guarantee <>", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeGreaterThan(Double value) {
            addCriterion("guarantee >", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeGreaterThanOrEqualTo(Double value) {
            addCriterion("guarantee >=", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeLessThan(Double value) {
            addCriterion("guarantee <", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeLessThanOrEqualTo(Double value) {
            addCriterion("guarantee <=", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIn(List<Double> values) {
            addCriterion("guarantee in", values, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeNotIn(List<Double> values) {
            addCriterion("guarantee not in", values, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeBetween(Double value1, Double value2) {
            addCriterion("guarantee between", value1, value2, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeNotBetween(Double value1, Double value2) {
            addCriterion("guarantee not between", value1, value2, "guarantee");
            return (Criteria) this;
        }

        public Criteria andElderLiveIsNull() {
            addCriterion("elderLive is null");
            return (Criteria) this;
        }

        public Criteria andElderLiveIsNotNull() {
            addCriterion("elderLive is not null");
            return (Criteria) this;
        }

        public Criteria andElderLiveEqualTo(Double value) {
            addCriterion("elderLive =", value, "elderLive");
            return (Criteria) this;
        }

        public Criteria andElderLiveNotEqualTo(Double value) {
            addCriterion("elderLive <>", value, "elderLive");
            return (Criteria) this;
        }

        public Criteria andElderLiveGreaterThan(Double value) {
            addCriterion("elderLive >", value, "elderLive");
            return (Criteria) this;
        }

        public Criteria andElderLiveGreaterThanOrEqualTo(Double value) {
            addCriterion("elderLive >=", value, "elderLive");
            return (Criteria) this;
        }

        public Criteria andElderLiveLessThan(Double value) {
            addCriterion("elderLive <", value, "elderLive");
            return (Criteria) this;
        }

        public Criteria andElderLiveLessThanOrEqualTo(Double value) {
            addCriterion("elderLive <=", value, "elderLive");
            return (Criteria) this;
        }

        public Criteria andElderLiveIn(List<Double> values) {
            addCriterion("elderLive in", values, "elderLive");
            return (Criteria) this;
        }

        public Criteria andElderLiveNotIn(List<Double> values) {
            addCriterion("elderLive not in", values, "elderLive");
            return (Criteria) this;
        }

        public Criteria andElderLiveBetween(Double value1, Double value2) {
            addCriterion("elderLive between", value1, value2, "elderLive");
            return (Criteria) this;
        }

        public Criteria andElderLiveNotBetween(Double value1, Double value2) {
            addCriterion("elderLive not between", value1, value2, "elderLive");
            return (Criteria) this;
        }

        public Criteria andHonorIsNull() {
            addCriterion("honor is null");
            return (Criteria) this;
        }

        public Criteria andHonorIsNotNull() {
            addCriterion("honor is not null");
            return (Criteria) this;
        }

        public Criteria andHonorEqualTo(Double value) {
            addCriterion("honor =", value, "honor");
            return (Criteria) this;
        }

        public Criteria andHonorNotEqualTo(Double value) {
            addCriterion("honor <>", value, "honor");
            return (Criteria) this;
        }

        public Criteria andHonorGreaterThan(Double value) {
            addCriterion("honor >", value, "honor");
            return (Criteria) this;
        }

        public Criteria andHonorGreaterThanOrEqualTo(Double value) {
            addCriterion("honor >=", value, "honor");
            return (Criteria) this;
        }

        public Criteria andHonorLessThan(Double value) {
            addCriterion("honor <", value, "honor");
            return (Criteria) this;
        }

        public Criteria andHonorLessThanOrEqualTo(Double value) {
            addCriterion("honor <=", value, "honor");
            return (Criteria) this;
        }

        public Criteria andHonorIn(List<Double> values) {
            addCriterion("honor in", values, "honor");
            return (Criteria) this;
        }

        public Criteria andHonorNotIn(List<Double> values) {
            addCriterion("honor not in", values, "honor");
            return (Criteria) this;
        }

        public Criteria andHonorBetween(Double value1, Double value2) {
            addCriterion("honor between", value1, value2, "honor");
            return (Criteria) this;
        }

        public Criteria andHonorNotBetween(Double value1, Double value2) {
            addCriterion("honor not between", value1, value2, "honor");
            return (Criteria) this;
        }

        public Criteria andLoanGuarateeIsNull() {
            addCriterion("loanGuaratee is null");
            return (Criteria) this;
        }

        public Criteria andLoanGuarateeIsNotNull() {
            addCriterion("loanGuaratee is not null");
            return (Criteria) this;
        }

        public Criteria andLoanGuarateeEqualTo(Double value) {
            addCriterion("loanGuaratee =", value, "loanGuaratee");
            return (Criteria) this;
        }

        public Criteria andLoanGuarateeNotEqualTo(Double value) {
            addCriterion("loanGuaratee <>", value, "loanGuaratee");
            return (Criteria) this;
        }

        public Criteria andLoanGuarateeGreaterThan(Double value) {
            addCriterion("loanGuaratee >", value, "loanGuaratee");
            return (Criteria) this;
        }

        public Criteria andLoanGuarateeGreaterThanOrEqualTo(Double value) {
            addCriterion("loanGuaratee >=", value, "loanGuaratee");
            return (Criteria) this;
        }

        public Criteria andLoanGuarateeLessThan(Double value) {
            addCriterion("loanGuaratee <", value, "loanGuaratee");
            return (Criteria) this;
        }

        public Criteria andLoanGuarateeLessThanOrEqualTo(Double value) {
            addCriterion("loanGuaratee <=", value, "loanGuaratee");
            return (Criteria) this;
        }

        public Criteria andLoanGuarateeIn(List<Double> values) {
            addCriterion("loanGuaratee in", values, "loanGuaratee");
            return (Criteria) this;
        }

        public Criteria andLoanGuarateeNotIn(List<Double> values) {
            addCriterion("loanGuaratee not in", values, "loanGuaratee");
            return (Criteria) this;
        }

        public Criteria andLoanGuarateeBetween(Double value1, Double value2) {
            addCriterion("loanGuaratee between", value1, value2, "loanGuaratee");
            return (Criteria) this;
        }

        public Criteria andLoanGuarateeNotBetween(Double value1, Double value2) {
            addCriterion("loanGuaratee not between", value1, value2, "loanGuaratee");
            return (Criteria) this;
        }

        public Criteria andInformationLevelIsNull() {
            addCriterion("informationLevel is null");
            return (Criteria) this;
        }

        public Criteria andInformationLevelIsNotNull() {
            addCriterion("informationLevel is not null");
            return (Criteria) this;
        }

        public Criteria andInformationLevelEqualTo(Double value) {
            addCriterion("informationLevel =", value, "informationLevel");
            return (Criteria) this;
        }

        public Criteria andInformationLevelNotEqualTo(Double value) {
            addCriterion("informationLevel <>", value, "informationLevel");
            return (Criteria) this;
        }

        public Criteria andInformationLevelGreaterThan(Double value) {
            addCriterion("informationLevel >", value, "informationLevel");
            return (Criteria) this;
        }

        public Criteria andInformationLevelGreaterThanOrEqualTo(Double value) {
            addCriterion("informationLevel >=", value, "informationLevel");
            return (Criteria) this;
        }

        public Criteria andInformationLevelLessThan(Double value) {
            addCriterion("informationLevel <", value, "informationLevel");
            return (Criteria) this;
        }

        public Criteria andInformationLevelLessThanOrEqualTo(Double value) {
            addCriterion("informationLevel <=", value, "informationLevel");
            return (Criteria) this;
        }

        public Criteria andInformationLevelIn(List<Double> values) {
            addCriterion("informationLevel in", values, "informationLevel");
            return (Criteria) this;
        }

        public Criteria andInformationLevelNotIn(List<Double> values) {
            addCriterion("informationLevel not in", values, "informationLevel");
            return (Criteria) this;
        }

        public Criteria andInformationLevelBetween(Double value1, Double value2) {
            addCriterion("informationLevel between", value1, value2, "informationLevel");
            return (Criteria) this;
        }

        public Criteria andInformationLevelNotBetween(Double value1, Double value2) {
            addCriterion("informationLevel not between", value1, value2, "informationLevel");
            return (Criteria) this;
        }

        public Criteria andPersonalInsuranceIsNull() {
            addCriterion("personalInsurance is null");
            return (Criteria) this;
        }

        public Criteria andPersonalInsuranceIsNotNull() {
            addCriterion("personalInsurance is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalInsuranceEqualTo(Double value) {
            addCriterion("personalInsurance =", value, "personalInsurance");
            return (Criteria) this;
        }

        public Criteria andPersonalInsuranceNotEqualTo(Double value) {
            addCriterion("personalInsurance <>", value, "personalInsurance");
            return (Criteria) this;
        }

        public Criteria andPersonalInsuranceGreaterThan(Double value) {
            addCriterion("personalInsurance >", value, "personalInsurance");
            return (Criteria) this;
        }

        public Criteria andPersonalInsuranceGreaterThanOrEqualTo(Double value) {
            addCriterion("personalInsurance >=", value, "personalInsurance");
            return (Criteria) this;
        }

        public Criteria andPersonalInsuranceLessThan(Double value) {
            addCriterion("personalInsurance <", value, "personalInsurance");
            return (Criteria) this;
        }

        public Criteria andPersonalInsuranceLessThanOrEqualTo(Double value) {
            addCriterion("personalInsurance <=", value, "personalInsurance");
            return (Criteria) this;
        }

        public Criteria andPersonalInsuranceIn(List<Double> values) {
            addCriterion("personalInsurance in", values, "personalInsurance");
            return (Criteria) this;
        }

        public Criteria andPersonalInsuranceNotIn(List<Double> values) {
            addCriterion("personalInsurance not in", values, "personalInsurance");
            return (Criteria) this;
        }

        public Criteria andPersonalInsuranceBetween(Double value1, Double value2) {
            addCriterion("personalInsurance between", value1, value2, "personalInsurance");
            return (Criteria) this;
        }

        public Criteria andPersonalInsuranceNotBetween(Double value1, Double value2) {
            addCriterion("personalInsurance not between", value1, value2, "personalInsurance");
            return (Criteria) this;
        }

        public Criteria andHealthExaminationIsNull() {
            addCriterion("healthExamination is null");
            return (Criteria) this;
        }

        public Criteria andHealthExaminationIsNotNull() {
            addCriterion("healthExamination is not null");
            return (Criteria) this;
        }

        public Criteria andHealthExaminationEqualTo(Double value) {
            addCriterion("healthExamination =", value, "healthExamination");
            return (Criteria) this;
        }

        public Criteria andHealthExaminationNotEqualTo(Double value) {
            addCriterion("healthExamination <>", value, "healthExamination");
            return (Criteria) this;
        }

        public Criteria andHealthExaminationGreaterThan(Double value) {
            addCriterion("healthExamination >", value, "healthExamination");
            return (Criteria) this;
        }

        public Criteria andHealthExaminationGreaterThanOrEqualTo(Double value) {
            addCriterion("healthExamination >=", value, "healthExamination");
            return (Criteria) this;
        }

        public Criteria andHealthExaminationLessThan(Double value) {
            addCriterion("healthExamination <", value, "healthExamination");
            return (Criteria) this;
        }

        public Criteria andHealthExaminationLessThanOrEqualTo(Double value) {
            addCriterion("healthExamination <=", value, "healthExamination");
            return (Criteria) this;
        }

        public Criteria andHealthExaminationIn(List<Double> values) {
            addCriterion("healthExamination in", values, "healthExamination");
            return (Criteria) this;
        }

        public Criteria andHealthExaminationNotIn(List<Double> values) {
            addCriterion("healthExamination not in", values, "healthExamination");
            return (Criteria) this;
        }

        public Criteria andHealthExaminationBetween(Double value1, Double value2) {
            addCriterion("healthExamination between", value1, value2, "healthExamination");
            return (Criteria) this;
        }

        public Criteria andHealthExaminationNotBetween(Double value1, Double value2) {
            addCriterion("healthExamination not between", value1, value2, "healthExamination");
            return (Criteria) this;
        }

        public Criteria andInterestRateIsNull() {
            addCriterion("interestRate is null");
            return (Criteria) this;
        }

        public Criteria andInterestRateIsNotNull() {
            addCriterion("interestRate is not null");
            return (Criteria) this;
        }

        public Criteria andInterestRateEqualTo(Double value) {
            addCriterion("interestRate =", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateNotEqualTo(Double value) {
            addCriterion("interestRate <>", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateGreaterThan(Double value) {
            addCriterion("interestRate >", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateGreaterThanOrEqualTo(Double value) {
            addCriterion("interestRate >=", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateLessThan(Double value) {
            addCriterion("interestRate <", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateLessThanOrEqualTo(Double value) {
            addCriterion("interestRate <=", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateIn(List<Double> values) {
            addCriterion("interestRate in", values, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateNotIn(List<Double> values) {
            addCriterion("interestRate not in", values, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateBetween(Double value1, Double value2) {
            addCriterion("interestRate between", value1, value2, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateNotBetween(Double value1, Double value2) {
            addCriterion("interestRate not between", value1, value2, "interestRate");
            return (Criteria) this;
        }

        public Criteria andResidenceTimeIsNull() {
            addCriterion("residenceTime is null");
            return (Criteria) this;
        }

        public Criteria andResidenceTimeIsNotNull() {
            addCriterion("residenceTime is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceTimeEqualTo(Double value) {
            addCriterion("residenceTime =", value, "residenceTime");
            return (Criteria) this;
        }

        public Criteria andResidenceTimeNotEqualTo(Double value) {
            addCriterion("residenceTime <>", value, "residenceTime");
            return (Criteria) this;
        }

        public Criteria andResidenceTimeGreaterThan(Double value) {
            addCriterion("residenceTime >", value, "residenceTime");
            return (Criteria) this;
        }

        public Criteria andResidenceTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("residenceTime >=", value, "residenceTime");
            return (Criteria) this;
        }

        public Criteria andResidenceTimeLessThan(Double value) {
            addCriterion("residenceTime <", value, "residenceTime");
            return (Criteria) this;
        }

        public Criteria andResidenceTimeLessThanOrEqualTo(Double value) {
            addCriterion("residenceTime <=", value, "residenceTime");
            return (Criteria) this;
        }

        public Criteria andResidenceTimeIn(List<Double> values) {
            addCriterion("residenceTime in", values, "residenceTime");
            return (Criteria) this;
        }

        public Criteria andResidenceTimeNotIn(List<Double> values) {
            addCriterion("residenceTime not in", values, "residenceTime");
            return (Criteria) this;
        }

        public Criteria andResidenceTimeBetween(Double value1, Double value2) {
            addCriterion("residenceTime between", value1, value2, "residenceTime");
            return (Criteria) this;
        }

        public Criteria andResidenceTimeNotBetween(Double value1, Double value2) {
            addCriterion("residenceTime not between", value1, value2, "residenceTime");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNull() {
            addCriterion("maritalStatus is null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNotNull() {
            addCriterion("maritalStatus is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusEqualTo(Double value) {
            addCriterion("maritalStatus =", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotEqualTo(Double value) {
            addCriterion("maritalStatus <>", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThan(Double value) {
            addCriterion("maritalStatus >", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThanOrEqualTo(Double value) {
            addCriterion("maritalStatus >=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThan(Double value) {
            addCriterion("maritalStatus <", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThanOrEqualTo(Double value) {
            addCriterion("maritalStatus <=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIn(List<Double> values) {
            addCriterion("maritalStatus in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotIn(List<Double> values) {
            addCriterion("maritalStatus not in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusBetween(Double value1, Double value2) {
            addCriterion("maritalStatus between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotBetween(Double value1, Double value2) {
            addCriterion("maritalStatus not between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMarriedIsNull() {
            addCriterion("married is null");
            return (Criteria) this;
        }

        public Criteria andMarriedIsNotNull() {
            addCriterion("married is not null");
            return (Criteria) this;
        }

        public Criteria andMarriedEqualTo(Double value) {
            addCriterion("married =", value, "married");
            return (Criteria) this;
        }

        public Criteria andMarriedNotEqualTo(Double value) {
            addCriterion("married <>", value, "married");
            return (Criteria) this;
        }

        public Criteria andMarriedGreaterThan(Double value) {
            addCriterion("married >", value, "married");
            return (Criteria) this;
        }

        public Criteria andMarriedGreaterThanOrEqualTo(Double value) {
            addCriterion("married >=", value, "married");
            return (Criteria) this;
        }

        public Criteria andMarriedLessThan(Double value) {
            addCriterion("married <", value, "married");
            return (Criteria) this;
        }

        public Criteria andMarriedLessThanOrEqualTo(Double value) {
            addCriterion("married <=", value, "married");
            return (Criteria) this;
        }

        public Criteria andMarriedIn(List<Double> values) {
            addCriterion("married in", values, "married");
            return (Criteria) this;
        }

        public Criteria andMarriedNotIn(List<Double> values) {
            addCriterion("married not in", values, "married");
            return (Criteria) this;
        }

        public Criteria andMarriedBetween(Double value1, Double value2) {
            addCriterion("married between", value1, value2, "married");
            return (Criteria) this;
        }

        public Criteria andMarriedNotBetween(Double value1, Double value2) {
            addCriterion("married not between", value1, value2, "married");
            return (Criteria) this;
        }

        public Criteria andDivorcedIsNull() {
            addCriterion("divorced is null");
            return (Criteria) this;
        }

        public Criteria andDivorcedIsNotNull() {
            addCriterion("divorced is not null");
            return (Criteria) this;
        }

        public Criteria andDivorcedEqualTo(Double value) {
            addCriterion("divorced =", value, "divorced");
            return (Criteria) this;
        }

        public Criteria andDivorcedNotEqualTo(Double value) {
            addCriterion("divorced <>", value, "divorced");
            return (Criteria) this;
        }

        public Criteria andDivorcedGreaterThan(Double value) {
            addCriterion("divorced >", value, "divorced");
            return (Criteria) this;
        }

        public Criteria andDivorcedGreaterThanOrEqualTo(Double value) {
            addCriterion("divorced >=", value, "divorced");
            return (Criteria) this;
        }

        public Criteria andDivorcedLessThan(Double value) {
            addCriterion("divorced <", value, "divorced");
            return (Criteria) this;
        }

        public Criteria andDivorcedLessThanOrEqualTo(Double value) {
            addCriterion("divorced <=", value, "divorced");
            return (Criteria) this;
        }

        public Criteria andDivorcedIn(List<Double> values) {
            addCriterion("divorced in", values, "divorced");
            return (Criteria) this;
        }

        public Criteria andDivorcedNotIn(List<Double> values) {
            addCriterion("divorced not in", values, "divorced");
            return (Criteria) this;
        }

        public Criteria andDivorcedBetween(Double value1, Double value2) {
            addCriterion("divorced between", value1, value2, "divorced");
            return (Criteria) this;
        }

        public Criteria andDivorcedNotBetween(Double value1, Double value2) {
            addCriterion("divorced not between", value1, value2, "divorced");
            return (Criteria) this;
        }

        public Criteria andPhoneNumReplaceIsNull() {
            addCriterion("phoneNumReplace is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumReplaceIsNotNull() {
            addCriterion("phoneNumReplace is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumReplaceEqualTo(Double value) {
            addCriterion("phoneNumReplace =", value, "phoneNumReplace");
            return (Criteria) this;
        }

        public Criteria andPhoneNumReplaceNotEqualTo(Double value) {
            addCriterion("phoneNumReplace <>", value, "phoneNumReplace");
            return (Criteria) this;
        }

        public Criteria andPhoneNumReplaceGreaterThan(Double value) {
            addCriterion("phoneNumReplace >", value, "phoneNumReplace");
            return (Criteria) this;
        }

        public Criteria andPhoneNumReplaceGreaterThanOrEqualTo(Double value) {
            addCriterion("phoneNumReplace >=", value, "phoneNumReplace");
            return (Criteria) this;
        }

        public Criteria andPhoneNumReplaceLessThan(Double value) {
            addCriterion("phoneNumReplace <", value, "phoneNumReplace");
            return (Criteria) this;
        }

        public Criteria andPhoneNumReplaceLessThanOrEqualTo(Double value) {
            addCriterion("phoneNumReplace <=", value, "phoneNumReplace");
            return (Criteria) this;
        }

        public Criteria andPhoneNumReplaceIn(List<Double> values) {
            addCriterion("phoneNumReplace in", values, "phoneNumReplace");
            return (Criteria) this;
        }

        public Criteria andPhoneNumReplaceNotIn(List<Double> values) {
            addCriterion("phoneNumReplace not in", values, "phoneNumReplace");
            return (Criteria) this;
        }

        public Criteria andPhoneNumReplaceBetween(Double value1, Double value2) {
            addCriterion("phoneNumReplace between", value1, value2, "phoneNumReplace");
            return (Criteria) this;
        }

        public Criteria andPhoneNumReplaceNotBetween(Double value1, Double value2) {
            addCriterion("phoneNumReplace not between", value1, value2, "phoneNumReplace");
            return (Criteria) this;
        }

        public Criteria andFallIllIsNull() {
            addCriterion("fallIll is null");
            return (Criteria) this;
        }

        public Criteria andFallIllIsNotNull() {
            addCriterion("fallIll is not null");
            return (Criteria) this;
        }

        public Criteria andFallIllEqualTo(Double value) {
            addCriterion("fallIll =", value, "fallIll");
            return (Criteria) this;
        }

        public Criteria andFallIllNotEqualTo(Double value) {
            addCriterion("fallIll <>", value, "fallIll");
            return (Criteria) this;
        }

        public Criteria andFallIllGreaterThan(Double value) {
            addCriterion("fallIll >", value, "fallIll");
            return (Criteria) this;
        }

        public Criteria andFallIllGreaterThanOrEqualTo(Double value) {
            addCriterion("fallIll >=", value, "fallIll");
            return (Criteria) this;
        }

        public Criteria andFallIllLessThan(Double value) {
            addCriterion("fallIll <", value, "fallIll");
            return (Criteria) this;
        }

        public Criteria andFallIllLessThanOrEqualTo(Double value) {
            addCriterion("fallIll <=", value, "fallIll");
            return (Criteria) this;
        }

        public Criteria andFallIllIn(List<Double> values) {
            addCriterion("fallIll in", values, "fallIll");
            return (Criteria) this;
        }

        public Criteria andFallIllNotIn(List<Double> values) {
            addCriterion("fallIll not in", values, "fallIll");
            return (Criteria) this;
        }

        public Criteria andFallIllBetween(Double value1, Double value2) {
            addCriterion("fallIll between", value1, value2, "fallIll");
            return (Criteria) this;
        }

        public Criteria andFallIllNotBetween(Double value1, Double value2) {
            addCriterion("fallIll not between", value1, value2, "fallIll");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundIsNull() {
            addCriterion("educationBackground is null");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundIsNotNull() {
            addCriterion("educationBackground is not null");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundEqualTo(Double value) {
            addCriterion("educationBackground =", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundNotEqualTo(Double value) {
            addCriterion("educationBackground <>", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundGreaterThan(Double value) {
            addCriterion("educationBackground >", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundGreaterThanOrEqualTo(Double value) {
            addCriterion("educationBackground >=", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundLessThan(Double value) {
            addCriterion("educationBackground <", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundLessThanOrEqualTo(Double value) {
            addCriterion("educationBackground <=", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundIn(List<Double> values) {
            addCriterion("educationBackground in", values, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundNotIn(List<Double> values) {
            addCriterion("educationBackground not in", values, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundBetween(Double value1, Double value2) {
            addCriterion("educationBackground between", value1, value2, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundNotBetween(Double value1, Double value2) {
            addCriterion("educationBackground not between", value1, value2, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andMainStemDistanceIsNull() {
            addCriterion("mainStemDistance is null");
            return (Criteria) this;
        }

        public Criteria andMainStemDistanceIsNotNull() {
            addCriterion("mainStemDistance is not null");
            return (Criteria) this;
        }

        public Criteria andMainStemDistanceEqualTo(Double value) {
            addCriterion("mainStemDistance =", value, "mainStemDistance");
            return (Criteria) this;
        }

        public Criteria andMainStemDistanceNotEqualTo(Double value) {
            addCriterion("mainStemDistance <>", value, "mainStemDistance");
            return (Criteria) this;
        }

        public Criteria andMainStemDistanceGreaterThan(Double value) {
            addCriterion("mainStemDistance >", value, "mainStemDistance");
            return (Criteria) this;
        }

        public Criteria andMainStemDistanceGreaterThanOrEqualTo(Double value) {
            addCriterion("mainStemDistance >=", value, "mainStemDistance");
            return (Criteria) this;
        }

        public Criteria andMainStemDistanceLessThan(Double value) {
            addCriterion("mainStemDistance <", value, "mainStemDistance");
            return (Criteria) this;
        }

        public Criteria andMainStemDistanceLessThanOrEqualTo(Double value) {
            addCriterion("mainStemDistance <=", value, "mainStemDistance");
            return (Criteria) this;
        }

        public Criteria andMainStemDistanceIn(List<Double> values) {
            addCriterion("mainStemDistance in", values, "mainStemDistance");
            return (Criteria) this;
        }

        public Criteria andMainStemDistanceNotIn(List<Double> values) {
            addCriterion("mainStemDistance not in", values, "mainStemDistance");
            return (Criteria) this;
        }

        public Criteria andMainStemDistanceBetween(Double value1, Double value2) {
            addCriterion("mainStemDistance between", value1, value2, "mainStemDistance");
            return (Criteria) this;
        }

        public Criteria andMainStemDistanceNotBetween(Double value1, Double value2) {
            addCriterion("mainStemDistance not between", value1, value2, "mainStemDistance");
            return (Criteria) this;
        }

        public Criteria andTreatmentCostsIsNull() {
            addCriterion("treatmentCosts is null");
            return (Criteria) this;
        }

        public Criteria andTreatmentCostsIsNotNull() {
            addCriterion("treatmentCosts is not null");
            return (Criteria) this;
        }

        public Criteria andTreatmentCostsEqualTo(Double value) {
            addCriterion("treatmentCosts =", value, "treatmentCosts");
            return (Criteria) this;
        }

        public Criteria andTreatmentCostsNotEqualTo(Double value) {
            addCriterion("treatmentCosts <>", value, "treatmentCosts");
            return (Criteria) this;
        }

        public Criteria andTreatmentCostsGreaterThan(Double value) {
            addCriterion("treatmentCosts >", value, "treatmentCosts");
            return (Criteria) this;
        }

        public Criteria andTreatmentCostsGreaterThanOrEqualTo(Double value) {
            addCriterion("treatmentCosts >=", value, "treatmentCosts");
            return (Criteria) this;
        }

        public Criteria andTreatmentCostsLessThan(Double value) {
            addCriterion("treatmentCosts <", value, "treatmentCosts");
            return (Criteria) this;
        }

        public Criteria andTreatmentCostsLessThanOrEqualTo(Double value) {
            addCriterion("treatmentCosts <=", value, "treatmentCosts");
            return (Criteria) this;
        }

        public Criteria andTreatmentCostsIn(List<Double> values) {
            addCriterion("treatmentCosts in", values, "treatmentCosts");
            return (Criteria) this;
        }

        public Criteria andTreatmentCostsNotIn(List<Double> values) {
            addCriterion("treatmentCosts not in", values, "treatmentCosts");
            return (Criteria) this;
        }

        public Criteria andTreatmentCostsBetween(Double value1, Double value2) {
            addCriterion("treatmentCosts between", value1, value2, "treatmentCosts");
            return (Criteria) this;
        }

        public Criteria andTreatmentCostsNotBetween(Double value1, Double value2) {
            addCriterion("treatmentCosts not between", value1, value2, "treatmentCosts");
            return (Criteria) this;
        }

        public Criteria andRaisingNumberIsNull() {
            addCriterion("raisingNumber is null");
            return (Criteria) this;
        }

        public Criteria andRaisingNumberIsNotNull() {
            addCriterion("raisingNumber is not null");
            return (Criteria) this;
        }

        public Criteria andRaisingNumberEqualTo(Double value) {
            addCriterion("raisingNumber =", value, "raisingNumber");
            return (Criteria) this;
        }

        public Criteria andRaisingNumberNotEqualTo(Double value) {
            addCriterion("raisingNumber <>", value, "raisingNumber");
            return (Criteria) this;
        }

        public Criteria andRaisingNumberGreaterThan(Double value) {
            addCriterion("raisingNumber >", value, "raisingNumber");
            return (Criteria) this;
        }

        public Criteria andRaisingNumberGreaterThanOrEqualTo(Double value) {
            addCriterion("raisingNumber >=", value, "raisingNumber");
            return (Criteria) this;
        }

        public Criteria andRaisingNumberLessThan(Double value) {
            addCriterion("raisingNumber <", value, "raisingNumber");
            return (Criteria) this;
        }

        public Criteria andRaisingNumberLessThanOrEqualTo(Double value) {
            addCriterion("raisingNumber <=", value, "raisingNumber");
            return (Criteria) this;
        }

        public Criteria andRaisingNumberIn(List<Double> values) {
            addCriterion("raisingNumber in", values, "raisingNumber");
            return (Criteria) this;
        }

        public Criteria andRaisingNumberNotIn(List<Double> values) {
            addCriterion("raisingNumber not in", values, "raisingNumber");
            return (Criteria) this;
        }

        public Criteria andRaisingNumberBetween(Double value1, Double value2) {
            addCriterion("raisingNumber between", value1, value2, "raisingNumber");
            return (Criteria) this;
        }

        public Criteria andRaisingNumberNotBetween(Double value1, Double value2) {
            addCriterion("raisingNumber not between", value1, value2, "raisingNumber");
            return (Criteria) this;
        }

        public Criteria andChildrenEduIsNull() {
            addCriterion("childrenEdu is null");
            return (Criteria) this;
        }

        public Criteria andChildrenEduIsNotNull() {
            addCriterion("childrenEdu is not null");
            return (Criteria) this;
        }

        public Criteria andChildrenEduEqualTo(Double value) {
            addCriterion("childrenEdu =", value, "childrenEdu");
            return (Criteria) this;
        }

        public Criteria andChildrenEduNotEqualTo(Double value) {
            addCriterion("childrenEdu <>", value, "childrenEdu");
            return (Criteria) this;
        }

        public Criteria andChildrenEduGreaterThan(Double value) {
            addCriterion("childrenEdu >", value, "childrenEdu");
            return (Criteria) this;
        }

        public Criteria andChildrenEduGreaterThanOrEqualTo(Double value) {
            addCriterion("childrenEdu >=", value, "childrenEdu");
            return (Criteria) this;
        }

        public Criteria andChildrenEduLessThan(Double value) {
            addCriterion("childrenEdu <", value, "childrenEdu");
            return (Criteria) this;
        }

        public Criteria andChildrenEduLessThanOrEqualTo(Double value) {
            addCriterion("childrenEdu <=", value, "childrenEdu");
            return (Criteria) this;
        }

        public Criteria andChildrenEduIn(List<Double> values) {
            addCriterion("childrenEdu in", values, "childrenEdu");
            return (Criteria) this;
        }

        public Criteria andChildrenEduNotIn(List<Double> values) {
            addCriterion("childrenEdu not in", values, "childrenEdu");
            return (Criteria) this;
        }

        public Criteria andChildrenEduBetween(Double value1, Double value2) {
            addCriterion("childrenEdu between", value1, value2, "childrenEdu");
            return (Criteria) this;
        }

        public Criteria andChildrenEduNotBetween(Double value1, Double value2) {
            addCriterion("childrenEdu not between", value1, value2, "childrenEdu");
            return (Criteria) this;
        }

        public Criteria andManpowerRateIsNull() {
            addCriterion("manpowerRate is null");
            return (Criteria) this;
        }

        public Criteria andManpowerRateIsNotNull() {
            addCriterion("manpowerRate is not null");
            return (Criteria) this;
        }

        public Criteria andManpowerRateEqualTo(Double value) {
            addCriterion("manpowerRate =", value, "manpowerRate");
            return (Criteria) this;
        }

        public Criteria andManpowerRateNotEqualTo(Double value) {
            addCriterion("manpowerRate <>", value, "manpowerRate");
            return (Criteria) this;
        }

        public Criteria andManpowerRateGreaterThan(Double value) {
            addCriterion("manpowerRate >", value, "manpowerRate");
            return (Criteria) this;
        }

        public Criteria andManpowerRateGreaterThanOrEqualTo(Double value) {
            addCriterion("manpowerRate >=", value, "manpowerRate");
            return (Criteria) this;
        }

        public Criteria andManpowerRateLessThan(Double value) {
            addCriterion("manpowerRate <", value, "manpowerRate");
            return (Criteria) this;
        }

        public Criteria andManpowerRateLessThanOrEqualTo(Double value) {
            addCriterion("manpowerRate <=", value, "manpowerRate");
            return (Criteria) this;
        }

        public Criteria andManpowerRateIn(List<Double> values) {
            addCriterion("manpowerRate in", values, "manpowerRate");
            return (Criteria) this;
        }

        public Criteria andManpowerRateNotIn(List<Double> values) {
            addCriterion("manpowerRate not in", values, "manpowerRate");
            return (Criteria) this;
        }

        public Criteria andManpowerRateBetween(Double value1, Double value2) {
            addCriterion("manpowerRate between", value1, value2, "manpowerRate");
            return (Criteria) this;
        }

        public Criteria andManpowerRateNotBetween(Double value1, Double value2) {
            addCriterion("manpowerRate not between", value1, value2, "manpowerRate");
            return (Criteria) this;
        }

        public Criteria andModernAgriTechIsNull() {
            addCriterion("modernAgriTech is null");
            return (Criteria) this;
        }

        public Criteria andModernAgriTechIsNotNull() {
            addCriterion("modernAgriTech is not null");
            return (Criteria) this;
        }

        public Criteria andModernAgriTechEqualTo(Double value) {
            addCriterion("modernAgriTech =", value, "modernAgriTech");
            return (Criteria) this;
        }

        public Criteria andModernAgriTechNotEqualTo(Double value) {
            addCriterion("modernAgriTech <>", value, "modernAgriTech");
            return (Criteria) this;
        }

        public Criteria andModernAgriTechGreaterThan(Double value) {
            addCriterion("modernAgriTech >", value, "modernAgriTech");
            return (Criteria) this;
        }

        public Criteria andModernAgriTechGreaterThanOrEqualTo(Double value) {
            addCriterion("modernAgriTech >=", value, "modernAgriTech");
            return (Criteria) this;
        }

        public Criteria andModernAgriTechLessThan(Double value) {
            addCriterion("modernAgriTech <", value, "modernAgriTech");
            return (Criteria) this;
        }

        public Criteria andModernAgriTechLessThanOrEqualTo(Double value) {
            addCriterion("modernAgriTech <=", value, "modernAgriTech");
            return (Criteria) this;
        }

        public Criteria andModernAgriTechIn(List<Double> values) {
            addCriterion("modernAgriTech in", values, "modernAgriTech");
            return (Criteria) this;
        }

        public Criteria andModernAgriTechNotIn(List<Double> values) {
            addCriterion("modernAgriTech not in", values, "modernAgriTech");
            return (Criteria) this;
        }

        public Criteria andModernAgriTechBetween(Double value1, Double value2) {
            addCriterion("modernAgriTech between", value1, value2, "modernAgriTech");
            return (Criteria) this;
        }

        public Criteria andModernAgriTechNotBetween(Double value1, Double value2) {
            addCriterion("modernAgriTech not between", value1, value2, "modernAgriTech");
            return (Criteria) this;
        }

        public Criteria andPropertyInsuranceIsNull() {
            addCriterion("propertyInsurance is null");
            return (Criteria) this;
        }

        public Criteria andPropertyInsuranceIsNotNull() {
            addCriterion("propertyInsurance is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyInsuranceEqualTo(Double value) {
            addCriterion("propertyInsurance =", value, "propertyInsurance");
            return (Criteria) this;
        }

        public Criteria andPropertyInsuranceNotEqualTo(Double value) {
            addCriterion("propertyInsurance <>", value, "propertyInsurance");
            return (Criteria) this;
        }

        public Criteria andPropertyInsuranceGreaterThan(Double value) {
            addCriterion("propertyInsurance >", value, "propertyInsurance");
            return (Criteria) this;
        }

        public Criteria andPropertyInsuranceGreaterThanOrEqualTo(Double value) {
            addCriterion("propertyInsurance >=", value, "propertyInsurance");
            return (Criteria) this;
        }

        public Criteria andPropertyInsuranceLessThan(Double value) {
            addCriterion("propertyInsurance <", value, "propertyInsurance");
            return (Criteria) this;
        }

        public Criteria andPropertyInsuranceLessThanOrEqualTo(Double value) {
            addCriterion("propertyInsurance <=", value, "propertyInsurance");
            return (Criteria) this;
        }

        public Criteria andPropertyInsuranceIn(List<Double> values) {
            addCriterion("propertyInsurance in", values, "propertyInsurance");
            return (Criteria) this;
        }

        public Criteria andPropertyInsuranceNotIn(List<Double> values) {
            addCriterion("propertyInsurance not in", values, "propertyInsurance");
            return (Criteria) this;
        }

        public Criteria andPropertyInsuranceBetween(Double value1, Double value2) {
            addCriterion("propertyInsurance between", value1, value2, "propertyInsurance");
            return (Criteria) this;
        }

        public Criteria andPropertyInsuranceNotBetween(Double value1, Double value2) {
            addCriterion("propertyInsurance not between", value1, value2, "propertyInsurance");
            return (Criteria) this;
        }

        public Criteria andDisasterNumberIsNull() {
            addCriterion("disasterNumber is null");
            return (Criteria) this;
        }

        public Criteria andDisasterNumberIsNotNull() {
            addCriterion("disasterNumber is not null");
            return (Criteria) this;
        }

        public Criteria andDisasterNumberEqualTo(Double value) {
            addCriterion("disasterNumber =", value, "disasterNumber");
            return (Criteria) this;
        }

        public Criteria andDisasterNumberNotEqualTo(Double value) {
            addCriterion("disasterNumber <>", value, "disasterNumber");
            return (Criteria) this;
        }

        public Criteria andDisasterNumberGreaterThan(Double value) {
            addCriterion("disasterNumber >", value, "disasterNumber");
            return (Criteria) this;
        }

        public Criteria andDisasterNumberGreaterThanOrEqualTo(Double value) {
            addCriterion("disasterNumber >=", value, "disasterNumber");
            return (Criteria) this;
        }

        public Criteria andDisasterNumberLessThan(Double value) {
            addCriterion("disasterNumber <", value, "disasterNumber");
            return (Criteria) this;
        }

        public Criteria andDisasterNumberLessThanOrEqualTo(Double value) {
            addCriterion("disasterNumber <=", value, "disasterNumber");
            return (Criteria) this;
        }

        public Criteria andDisasterNumberIn(List<Double> values) {
            addCriterion("disasterNumber in", values, "disasterNumber");
            return (Criteria) this;
        }

        public Criteria andDisasterNumberNotIn(List<Double> values) {
            addCriterion("disasterNumber not in", values, "disasterNumber");
            return (Criteria) this;
        }

        public Criteria andDisasterNumberBetween(Double value1, Double value2) {
            addCriterion("disasterNumber between", value1, value2, "disasterNumber");
            return (Criteria) this;
        }

        public Criteria andDisasterNumberNotBetween(Double value1, Double value2) {
            addCriterion("disasterNumber not between", value1, value2, "disasterNumber");
            return (Criteria) this;
        }

        public Criteria andDamageRateIsNull() {
            addCriterion("damageRate is null");
            return (Criteria) this;
        }

        public Criteria andDamageRateIsNotNull() {
            addCriterion("damageRate is not null");
            return (Criteria) this;
        }

        public Criteria andDamageRateEqualTo(Double value) {
            addCriterion("damageRate =", value, "damageRate");
            return (Criteria) this;
        }

        public Criteria andDamageRateNotEqualTo(Double value) {
            addCriterion("damageRate <>", value, "damageRate");
            return (Criteria) this;
        }

        public Criteria andDamageRateGreaterThan(Double value) {
            addCriterion("damageRate >", value, "damageRate");
            return (Criteria) this;
        }

        public Criteria andDamageRateGreaterThanOrEqualTo(Double value) {
            addCriterion("damageRate >=", value, "damageRate");
            return (Criteria) this;
        }

        public Criteria andDamageRateLessThan(Double value) {
            addCriterion("damageRate <", value, "damageRate");
            return (Criteria) this;
        }

        public Criteria andDamageRateLessThanOrEqualTo(Double value) {
            addCriterion("damageRate <=", value, "damageRate");
            return (Criteria) this;
        }

        public Criteria andDamageRateIn(List<Double> values) {
            addCriterion("damageRate in", values, "damageRate");
            return (Criteria) this;
        }

        public Criteria andDamageRateNotIn(List<Double> values) {
            addCriterion("damageRate not in", values, "damageRate");
            return (Criteria) this;
        }

        public Criteria andDamageRateBetween(Double value1, Double value2) {
            addCriterion("damageRate between", value1, value2, "damageRate");
            return (Criteria) this;
        }

        public Criteria andDamageRateNotBetween(Double value1, Double value2) {
            addCriterion("damageRate not between", value1, value2, "damageRate");
            return (Criteria) this;
        }

        public Criteria andLoanUseIsNull() {
            addCriterion("loanUse is null");
            return (Criteria) this;
        }

        public Criteria andLoanUseIsNotNull() {
            addCriterion("loanUse is not null");
            return (Criteria) this;
        }

        public Criteria andLoanUseEqualTo(Double value) {
            addCriterion("loanUse =", value, "loanUse");
            return (Criteria) this;
        }

        public Criteria andLoanUseNotEqualTo(Double value) {
            addCriterion("loanUse <>", value, "loanUse");
            return (Criteria) this;
        }

        public Criteria andLoanUseGreaterThan(Double value) {
            addCriterion("loanUse >", value, "loanUse");
            return (Criteria) this;
        }

        public Criteria andLoanUseGreaterThanOrEqualTo(Double value) {
            addCriterion("loanUse >=", value, "loanUse");
            return (Criteria) this;
        }

        public Criteria andLoanUseLessThan(Double value) {
            addCriterion("loanUse <", value, "loanUse");
            return (Criteria) this;
        }

        public Criteria andLoanUseLessThanOrEqualTo(Double value) {
            addCriterion("loanUse <=", value, "loanUse");
            return (Criteria) this;
        }

        public Criteria andLoanUseIn(List<Double> values) {
            addCriterion("loanUse in", values, "loanUse");
            return (Criteria) this;
        }

        public Criteria andLoanUseNotIn(List<Double> values) {
            addCriterion("loanUse not in", values, "loanUse");
            return (Criteria) this;
        }

        public Criteria andLoanUseBetween(Double value1, Double value2) {
            addCriterion("loanUse between", value1, value2, "loanUse");
            return (Criteria) this;
        }

        public Criteria andLoanUseNotBetween(Double value1, Double value2) {
            addCriterion("loanUse not between", value1, value2, "loanUse");
            return (Criteria) this;
        }

        public Criteria andNewsAttentionIsNull() {
            addCriterion("newsAttention is null");
            return (Criteria) this;
        }

        public Criteria andNewsAttentionIsNotNull() {
            addCriterion("newsAttention is not null");
            return (Criteria) this;
        }

        public Criteria andNewsAttentionEqualTo(Double value) {
            addCriterion("newsAttention =", value, "newsAttention");
            return (Criteria) this;
        }

        public Criteria andNewsAttentionNotEqualTo(Double value) {
            addCriterion("newsAttention <>", value, "newsAttention");
            return (Criteria) this;
        }

        public Criteria andNewsAttentionGreaterThan(Double value) {
            addCriterion("newsAttention >", value, "newsAttention");
            return (Criteria) this;
        }

        public Criteria andNewsAttentionGreaterThanOrEqualTo(Double value) {
            addCriterion("newsAttention >=", value, "newsAttention");
            return (Criteria) this;
        }

        public Criteria andNewsAttentionLessThan(Double value) {
            addCriterion("newsAttention <", value, "newsAttention");
            return (Criteria) this;
        }

        public Criteria andNewsAttentionLessThanOrEqualTo(Double value) {
            addCriterion("newsAttention <=", value, "newsAttention");
            return (Criteria) this;
        }

        public Criteria andNewsAttentionIn(List<Double> values) {
            addCriterion("newsAttention in", values, "newsAttention");
            return (Criteria) this;
        }

        public Criteria andNewsAttentionNotIn(List<Double> values) {
            addCriterion("newsAttention not in", values, "newsAttention");
            return (Criteria) this;
        }

        public Criteria andNewsAttentionBetween(Double value1, Double value2) {
            addCriterion("newsAttention between", value1, value2, "newsAttention");
            return (Criteria) this;
        }

        public Criteria andNewsAttentionNotBetween(Double value1, Double value2) {
            addCriterion("newsAttention not between", value1, value2, "newsAttention");
            return (Criteria) this;
        }

        public Criteria andEducationAttentionIsNull() {
            addCriterion("educationAttention is null");
            return (Criteria) this;
        }

        public Criteria andEducationAttentionIsNotNull() {
            addCriterion("educationAttention is not null");
            return (Criteria) this;
        }

        public Criteria andEducationAttentionEqualTo(Double value) {
            addCriterion("educationAttention =", value, "educationAttention");
            return (Criteria) this;
        }

        public Criteria andEducationAttentionNotEqualTo(Double value) {
            addCriterion("educationAttention <>", value, "educationAttention");
            return (Criteria) this;
        }

        public Criteria andEducationAttentionGreaterThan(Double value) {
            addCriterion("educationAttention >", value, "educationAttention");
            return (Criteria) this;
        }

        public Criteria andEducationAttentionGreaterThanOrEqualTo(Double value) {
            addCriterion("educationAttention >=", value, "educationAttention");
            return (Criteria) this;
        }

        public Criteria andEducationAttentionLessThan(Double value) {
            addCriterion("educationAttention <", value, "educationAttention");
            return (Criteria) this;
        }

        public Criteria andEducationAttentionLessThanOrEqualTo(Double value) {
            addCriterion("educationAttention <=", value, "educationAttention");
            return (Criteria) this;
        }

        public Criteria andEducationAttentionIn(List<Double> values) {
            addCriterion("educationAttention in", values, "educationAttention");
            return (Criteria) this;
        }

        public Criteria andEducationAttentionNotIn(List<Double> values) {
            addCriterion("educationAttention not in", values, "educationAttention");
            return (Criteria) this;
        }

        public Criteria andEducationAttentionBetween(Double value1, Double value2) {
            addCriterion("educationAttention between", value1, value2, "educationAttention");
            return (Criteria) this;
        }

        public Criteria andEducationAttentionNotBetween(Double value1, Double value2) {
            addCriterion("educationAttention not between", value1, value2, "educationAttention");
            return (Criteria) this;
        }

        public Criteria andOnlineFrequencyIsNull() {
            addCriterion("onlineFrequency is null");
            return (Criteria) this;
        }

        public Criteria andOnlineFrequencyIsNotNull() {
            addCriterion("onlineFrequency is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineFrequencyEqualTo(Double value) {
            addCriterion("onlineFrequency =", value, "onlineFrequency");
            return (Criteria) this;
        }

        public Criteria andOnlineFrequencyNotEqualTo(Double value) {
            addCriterion("onlineFrequency <>", value, "onlineFrequency");
            return (Criteria) this;
        }

        public Criteria andOnlineFrequencyGreaterThan(Double value) {
            addCriterion("onlineFrequency >", value, "onlineFrequency");
            return (Criteria) this;
        }

        public Criteria andOnlineFrequencyGreaterThanOrEqualTo(Double value) {
            addCriterion("onlineFrequency >=", value, "onlineFrequency");
            return (Criteria) this;
        }

        public Criteria andOnlineFrequencyLessThan(Double value) {
            addCriterion("onlineFrequency <", value, "onlineFrequency");
            return (Criteria) this;
        }

        public Criteria andOnlineFrequencyLessThanOrEqualTo(Double value) {
            addCriterion("onlineFrequency <=", value, "onlineFrequency");
            return (Criteria) this;
        }

        public Criteria andOnlineFrequencyIn(List<Double> values) {
            addCriterion("onlineFrequency in", values, "onlineFrequency");
            return (Criteria) this;
        }

        public Criteria andOnlineFrequencyNotIn(List<Double> values) {
            addCriterion("onlineFrequency not in", values, "onlineFrequency");
            return (Criteria) this;
        }

        public Criteria andOnlineFrequencyBetween(Double value1, Double value2) {
            addCriterion("onlineFrequency between", value1, value2, "onlineFrequency");
            return (Criteria) this;
        }

        public Criteria andOnlineFrequencyNotBetween(Double value1, Double value2) {
            addCriterion("onlineFrequency not between", value1, value2, "onlineFrequency");
            return (Criteria) this;
        }

        public Criteria andBroadbandBandwidthIsNull() {
            addCriterion("broadbandBandwidth is null");
            return (Criteria) this;
        }

        public Criteria andBroadbandBandwidthIsNotNull() {
            addCriterion("broadbandBandwidth is not null");
            return (Criteria) this;
        }

        public Criteria andBroadbandBandwidthEqualTo(Double value) {
            addCriterion("broadbandBandwidth =", value, "broadbandBandwidth");
            return (Criteria) this;
        }

        public Criteria andBroadbandBandwidthNotEqualTo(Double value) {
            addCriterion("broadbandBandwidth <>", value, "broadbandBandwidth");
            return (Criteria) this;
        }

        public Criteria andBroadbandBandwidthGreaterThan(Double value) {
            addCriterion("broadbandBandwidth >", value, "broadbandBandwidth");
            return (Criteria) this;
        }

        public Criteria andBroadbandBandwidthGreaterThanOrEqualTo(Double value) {
            addCriterion("broadbandBandwidth >=", value, "broadbandBandwidth");
            return (Criteria) this;
        }

        public Criteria andBroadbandBandwidthLessThan(Double value) {
            addCriterion("broadbandBandwidth <", value, "broadbandBandwidth");
            return (Criteria) this;
        }

        public Criteria andBroadbandBandwidthLessThanOrEqualTo(Double value) {
            addCriterion("broadbandBandwidth <=", value, "broadbandBandwidth");
            return (Criteria) this;
        }

        public Criteria andBroadbandBandwidthIn(List<Double> values) {
            addCriterion("broadbandBandwidth in", values, "broadbandBandwidth");
            return (Criteria) this;
        }

        public Criteria andBroadbandBandwidthNotIn(List<Double> values) {
            addCriterion("broadbandBandwidth not in", values, "broadbandBandwidth");
            return (Criteria) this;
        }

        public Criteria andBroadbandBandwidthBetween(Double value1, Double value2) {
            addCriterion("broadbandBandwidth between", value1, value2, "broadbandBandwidth");
            return (Criteria) this;
        }

        public Criteria andBroadbandBandwidthNotBetween(Double value1, Double value2) {
            addCriterion("broadbandBandwidth not between", value1, value2, "broadbandBandwidth");
            return (Criteria) this;
        }

        public Criteria andPhoneChargeIsNull() {
            addCriterion("phoneCharge is null");
            return (Criteria) this;
        }

        public Criteria andPhoneChargeIsNotNull() {
            addCriterion("phoneCharge is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneChargeEqualTo(Double value) {
            addCriterion("phoneCharge =", value, "phoneCharge");
            return (Criteria) this;
        }

        public Criteria andPhoneChargeNotEqualTo(Double value) {
            addCriterion("phoneCharge <>", value, "phoneCharge");
            return (Criteria) this;
        }

        public Criteria andPhoneChargeGreaterThan(Double value) {
            addCriterion("phoneCharge >", value, "phoneCharge");
            return (Criteria) this;
        }

        public Criteria andPhoneChargeGreaterThanOrEqualTo(Double value) {
            addCriterion("phoneCharge >=", value, "phoneCharge");
            return (Criteria) this;
        }

        public Criteria andPhoneChargeLessThan(Double value) {
            addCriterion("phoneCharge <", value, "phoneCharge");
            return (Criteria) this;
        }

        public Criteria andPhoneChargeLessThanOrEqualTo(Double value) {
            addCriterion("phoneCharge <=", value, "phoneCharge");
            return (Criteria) this;
        }

        public Criteria andPhoneChargeIn(List<Double> values) {
            addCriterion("phoneCharge in", values, "phoneCharge");
            return (Criteria) this;
        }

        public Criteria andPhoneChargeNotIn(List<Double> values) {
            addCriterion("phoneCharge not in", values, "phoneCharge");
            return (Criteria) this;
        }

        public Criteria andPhoneChargeBetween(Double value1, Double value2) {
            addCriterion("phoneCharge between", value1, value2, "phoneCharge");
            return (Criteria) this;
        }

        public Criteria andPhoneChargeNotBetween(Double value1, Double value2) {
            addCriterion("phoneCharge not between", value1, value2, "phoneCharge");
            return (Criteria) this;
        }

        public Criteria andWeChatIsNull() {
            addCriterion("weChat is null");
            return (Criteria) this;
        }

        public Criteria andWeChatIsNotNull() {
            addCriterion("weChat is not null");
            return (Criteria) this;
        }

        public Criteria andWeChatEqualTo(Double value) {
            addCriterion("weChat =", value, "weChat");
            return (Criteria) this;
        }

        public Criteria andWeChatNotEqualTo(Double value) {
            addCriterion("weChat <>", value, "weChat");
            return (Criteria) this;
        }

        public Criteria andWeChatGreaterThan(Double value) {
            addCriterion("weChat >", value, "weChat");
            return (Criteria) this;
        }

        public Criteria andWeChatGreaterThanOrEqualTo(Double value) {
            addCriterion("weChat >=", value, "weChat");
            return (Criteria) this;
        }

        public Criteria andWeChatLessThan(Double value) {
            addCriterion("weChat <", value, "weChat");
            return (Criteria) this;
        }

        public Criteria andWeChatLessThanOrEqualTo(Double value) {
            addCriterion("weChat <=", value, "weChat");
            return (Criteria) this;
        }

        public Criteria andWeChatIn(List<Double> values) {
            addCriterion("weChat in", values, "weChat");
            return (Criteria) this;
        }

        public Criteria andWeChatNotIn(List<Double> values) {
            addCriterion("weChat not in", values, "weChat");
            return (Criteria) this;
        }

        public Criteria andWeChatBetween(Double value1, Double value2) {
            addCriterion("weChat between", value1, value2, "weChat");
            return (Criteria) this;
        }

        public Criteria andWeChatNotBetween(Double value1, Double value2) {
            addCriterion("weChat not between", value1, value2, "weChat");
            return (Criteria) this;
        }

        public Criteria andArrearageIsNull() {
            addCriterion("arrearage is null");
            return (Criteria) this;
        }

        public Criteria andArrearageIsNotNull() {
            addCriterion("arrearage is not null");
            return (Criteria) this;
        }

        public Criteria andArrearageEqualTo(Double value) {
            addCriterion("arrearage =", value, "arrearage");
            return (Criteria) this;
        }

        public Criteria andArrearageNotEqualTo(Double value) {
            addCriterion("arrearage <>", value, "arrearage");
            return (Criteria) this;
        }

        public Criteria andArrearageGreaterThan(Double value) {
            addCriterion("arrearage >", value, "arrearage");
            return (Criteria) this;
        }

        public Criteria andArrearageGreaterThanOrEqualTo(Double value) {
            addCriterion("arrearage >=", value, "arrearage");
            return (Criteria) this;
        }

        public Criteria andArrearageLessThan(Double value) {
            addCriterion("arrearage <", value, "arrearage");
            return (Criteria) this;
        }

        public Criteria andArrearageLessThanOrEqualTo(Double value) {
            addCriterion("arrearage <=", value, "arrearage");
            return (Criteria) this;
        }

        public Criteria andArrearageIn(List<Double> values) {
            addCriterion("arrearage in", values, "arrearage");
            return (Criteria) this;
        }

        public Criteria andArrearageNotIn(List<Double> values) {
            addCriterion("arrearage not in", values, "arrearage");
            return (Criteria) this;
        }

        public Criteria andArrearageBetween(Double value1, Double value2) {
            addCriterion("arrearage between", value1, value2, "arrearage");
            return (Criteria) this;
        }

        public Criteria andArrearageNotBetween(Double value1, Double value2) {
            addCriterion("arrearage not between", value1, value2, "arrearage");
            return (Criteria) this;
        }

        public Criteria andBadActionsIsNull() {
            addCriterion("badActions is null");
            return (Criteria) this;
        }

        public Criteria andBadActionsIsNotNull() {
            addCriterion("badActions is not null");
            return (Criteria) this;
        }

        public Criteria andBadActionsEqualTo(Double value) {
            addCriterion("badActions =", value, "badActions");
            return (Criteria) this;
        }

        public Criteria andBadActionsNotEqualTo(Double value) {
            addCriterion("badActions <>", value, "badActions");
            return (Criteria) this;
        }

        public Criteria andBadActionsGreaterThan(Double value) {
            addCriterion("badActions >", value, "badActions");
            return (Criteria) this;
        }

        public Criteria andBadActionsGreaterThanOrEqualTo(Double value) {
            addCriterion("badActions >=", value, "badActions");
            return (Criteria) this;
        }

        public Criteria andBadActionsLessThan(Double value) {
            addCriterion("badActions <", value, "badActions");
            return (Criteria) this;
        }

        public Criteria andBadActionsLessThanOrEqualTo(Double value) {
            addCriterion("badActions <=", value, "badActions");
            return (Criteria) this;
        }

        public Criteria andBadActionsIn(List<Double> values) {
            addCriterion("badActions in", values, "badActions");
            return (Criteria) this;
        }

        public Criteria andBadActionsNotIn(List<Double> values) {
            addCriterion("badActions not in", values, "badActions");
            return (Criteria) this;
        }

        public Criteria andBadActionsBetween(Double value1, Double value2) {
            addCriterion("badActions between", value1, value2, "badActions");
            return (Criteria) this;
        }

        public Criteria andBadActionsNotBetween(Double value1, Double value2) {
            addCriterion("badActions not between", value1, value2, "badActions");
            return (Criteria) this;
        }

        public Criteria andLayPaymentIsNull() {
            addCriterion("layPayment is null");
            return (Criteria) this;
        }

        public Criteria andLayPaymentIsNotNull() {
            addCriterion("layPayment is not null");
            return (Criteria) this;
        }

        public Criteria andLayPaymentEqualTo(Double value) {
            addCriterion("layPayment =", value, "layPayment");
            return (Criteria) this;
        }

        public Criteria andLayPaymentNotEqualTo(Double value) {
            addCriterion("layPayment <>", value, "layPayment");
            return (Criteria) this;
        }

        public Criteria andLayPaymentGreaterThan(Double value) {
            addCriterion("layPayment >", value, "layPayment");
            return (Criteria) this;
        }

        public Criteria andLayPaymentGreaterThanOrEqualTo(Double value) {
            addCriterion("layPayment >=", value, "layPayment");
            return (Criteria) this;
        }

        public Criteria andLayPaymentLessThan(Double value) {
            addCriterion("layPayment <", value, "layPayment");
            return (Criteria) this;
        }

        public Criteria andLayPaymentLessThanOrEqualTo(Double value) {
            addCriterion("layPayment <=", value, "layPayment");
            return (Criteria) this;
        }

        public Criteria andLayPaymentIn(List<Double> values) {
            addCriterion("layPayment in", values, "layPayment");
            return (Criteria) this;
        }

        public Criteria andLayPaymentNotIn(List<Double> values) {
            addCriterion("layPayment not in", values, "layPayment");
            return (Criteria) this;
        }

        public Criteria andLayPaymentBetween(Double value1, Double value2) {
            addCriterion("layPayment between", value1, value2, "layPayment");
            return (Criteria) this;
        }

        public Criteria andLayPaymentNotBetween(Double value1, Double value2) {
            addCriterion("layPayment not between", value1, value2, "layPayment");
            return (Criteria) this;
        }

        public Criteria andPrivateLendingIsNull() {
            addCriterion("privateLending is null");
            return (Criteria) this;
        }

        public Criteria andPrivateLendingIsNotNull() {
            addCriterion("privateLending is not null");
            return (Criteria) this;
        }

        public Criteria andPrivateLendingEqualTo(Double value) {
            addCriterion("privateLending =", value, "privateLending");
            return (Criteria) this;
        }

        public Criteria andPrivateLendingNotEqualTo(Double value) {
            addCriterion("privateLending <>", value, "privateLending");
            return (Criteria) this;
        }

        public Criteria andPrivateLendingGreaterThan(Double value) {
            addCriterion("privateLending >", value, "privateLending");
            return (Criteria) this;
        }

        public Criteria andPrivateLendingGreaterThanOrEqualTo(Double value) {
            addCriterion("privateLending >=", value, "privateLending");
            return (Criteria) this;
        }

        public Criteria andPrivateLendingLessThan(Double value) {
            addCriterion("privateLending <", value, "privateLending");
            return (Criteria) this;
        }

        public Criteria andPrivateLendingLessThanOrEqualTo(Double value) {
            addCriterion("privateLending <=", value, "privateLending");
            return (Criteria) this;
        }

        public Criteria andPrivateLendingIn(List<Double> values) {
            addCriterion("privateLending in", values, "privateLending");
            return (Criteria) this;
        }

        public Criteria andPrivateLendingNotIn(List<Double> values) {
            addCriterion("privateLending not in", values, "privateLending");
            return (Criteria) this;
        }

        public Criteria andPrivateLendingBetween(Double value1, Double value2) {
            addCriterion("privateLending between", value1, value2, "privateLending");
            return (Criteria) this;
        }

        public Criteria andPrivateLendingNotBetween(Double value1, Double value2) {
            addCriterion("privateLending not between", value1, value2, "privateLending");
            return (Criteria) this;
        }

        public Criteria andEvaluateResultIsNull() {
            addCriterion("evaluateResult is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateResultIsNotNull() {
            addCriterion("evaluateResult is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateResultEqualTo(Double value) {
            addCriterion("evaluateResult =", value, "evaluateResult");
            return (Criteria) this;
        }

        public Criteria andEvaluateResultNotEqualTo(Double value) {
            addCriterion("evaluateResult <>", value, "evaluateResult");
            return (Criteria) this;
        }

        public Criteria andEvaluateResultGreaterThan(Double value) {
            addCriterion("evaluateResult >", value, "evaluateResult");
            return (Criteria) this;
        }

        public Criteria andEvaluateResultGreaterThanOrEqualTo(Double value) {
            addCriterion("evaluateResult >=", value, "evaluateResult");
            return (Criteria) this;
        }

        public Criteria andEvaluateResultLessThan(Double value) {
            addCriterion("evaluateResult <", value, "evaluateResult");
            return (Criteria) this;
        }

        public Criteria andEvaluateResultLessThanOrEqualTo(Double value) {
            addCriterion("evaluateResult <=", value, "evaluateResult");
            return (Criteria) this;
        }

        public Criteria andEvaluateResultIn(List<Double> values) {
            addCriterion("evaluateResult in", values, "evaluateResult");
            return (Criteria) this;
        }

        public Criteria andEvaluateResultNotIn(List<Double> values) {
            addCriterion("evaluateResult not in", values, "evaluateResult");
            return (Criteria) this;
        }

        public Criteria andEvaluateResultBetween(Double value1, Double value2) {
            addCriterion("evaluateResult between", value1, value2, "evaluateResult");
            return (Criteria) this;
        }

        public Criteria andEvaluateResultNotBetween(Double value1, Double value2) {
            addCriterion("evaluateResult not between", value1, value2, "evaluateResult");
            return (Criteria) this;
        }

        public Criteria andPaydebtAbilityScoreIsNull() {
            addCriterion("paydebtAbilityScore is null");
            return (Criteria) this;
        }

        public Criteria andPaydebtAbilityScoreIsNotNull() {
            addCriterion("paydebtAbilityScore is not null");
            return (Criteria) this;
        }

        public Criteria andPaydebtAbilityScoreEqualTo(Double value) {
            addCriterion("paydebtAbilityScore =", value, "paydebtAbilityScore");
            return (Criteria) this;
        }

        public Criteria andPaydebtAbilityScoreNotEqualTo(Double value) {
            addCriterion("paydebtAbilityScore <>", value, "paydebtAbilityScore");
            return (Criteria) this;
        }

        public Criteria andPaydebtAbilityScoreGreaterThan(Double value) {
            addCriterion("paydebtAbilityScore >", value, "paydebtAbilityScore");
            return (Criteria) this;
        }

        public Criteria andPaydebtAbilityScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("paydebtAbilityScore >=", value, "paydebtAbilityScore");
            return (Criteria) this;
        }

        public Criteria andPaydebtAbilityScoreLessThan(Double value) {
            addCriterion("paydebtAbilityScore <", value, "paydebtAbilityScore");
            return (Criteria) this;
        }

        public Criteria andPaydebtAbilityScoreLessThanOrEqualTo(Double value) {
            addCriterion("paydebtAbilityScore <=", value, "paydebtAbilityScore");
            return (Criteria) this;
        }

        public Criteria andPaydebtAbilityScoreIn(List<Double> values) {
            addCriterion("paydebtAbilityScore in", values, "paydebtAbilityScore");
            return (Criteria) this;
        }

        public Criteria andPaydebtAbilityScoreNotIn(List<Double> values) {
            addCriterion("paydebtAbilityScore not in", values, "paydebtAbilityScore");
            return (Criteria) this;
        }

        public Criteria andPaydebtAbilityScoreBetween(Double value1, Double value2) {
            addCriterion("paydebtAbilityScore between", value1, value2, "paydebtAbilityScore");
            return (Criteria) this;
        }

        public Criteria andPaydebtAbilityScoreNotBetween(Double value1, Double value2) {
            addCriterion("paydebtAbilityScore not between", value1, value2, "paydebtAbilityScore");
            return (Criteria) this;
        }

        public Criteria andPaydebtAbilityLevelIsNull() {
            addCriterion("paydebtAbilityLevel is null");
            return (Criteria) this;
        }

        public Criteria andPaydebtAbilityLevelIsNotNull() {
            addCriterion("paydebtAbilityLevel is not null");
            return (Criteria) this;
        }

        public Criteria andPaydebtAbilityLevelEqualTo(String value) {
            addCriterion("paydebtAbilityLevel =", value, "paydebtAbilityLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtAbilityLevelNotEqualTo(String value) {
            addCriterion("paydebtAbilityLevel <>", value, "paydebtAbilityLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtAbilityLevelGreaterThan(String value) {
            addCriterion("paydebtAbilityLevel >", value, "paydebtAbilityLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtAbilityLevelGreaterThanOrEqualTo(String value) {
            addCriterion("paydebtAbilityLevel >=", value, "paydebtAbilityLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtAbilityLevelLessThan(String value) {
            addCriterion("paydebtAbilityLevel <", value, "paydebtAbilityLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtAbilityLevelLessThanOrEqualTo(String value) {
            addCriterion("paydebtAbilityLevel <=", value, "paydebtAbilityLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtAbilityLevelLike(String value) {
            addCriterion("paydebtAbilityLevel like", value, "paydebtAbilityLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtAbilityLevelNotLike(String value) {
            addCriterion("paydebtAbilityLevel not like", value, "paydebtAbilityLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtAbilityLevelIn(List<String> values) {
            addCriterion("paydebtAbilityLevel in", values, "paydebtAbilityLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtAbilityLevelNotIn(List<String> values) {
            addCriterion("paydebtAbilityLevel not in", values, "paydebtAbilityLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtAbilityLevelBetween(String value1, String value2) {
            addCriterion("paydebtAbilityLevel between", value1, value2, "paydebtAbilityLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtAbilityLevelNotBetween(String value1, String value2) {
            addCriterion("paydebtAbilityLevel not between", value1, value2, "paydebtAbilityLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtPotentialScoreIsNull() {
            addCriterion("paydebtPotentialScore is null");
            return (Criteria) this;
        }

        public Criteria andPaydebtPotentialScoreIsNotNull() {
            addCriterion("paydebtPotentialScore is not null");
            return (Criteria) this;
        }

        public Criteria andPaydebtPotentialScoreEqualTo(Double value) {
            addCriterion("paydebtPotentialScore =", value, "paydebtPotentialScore");
            return (Criteria) this;
        }

        public Criteria andPaydebtPotentialScoreNotEqualTo(Double value) {
            addCriterion("paydebtPotentialScore <>", value, "paydebtPotentialScore");
            return (Criteria) this;
        }

        public Criteria andPaydebtPotentialScoreGreaterThan(Double value) {
            addCriterion("paydebtPotentialScore >", value, "paydebtPotentialScore");
            return (Criteria) this;
        }

        public Criteria andPaydebtPotentialScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("paydebtPotentialScore >=", value, "paydebtPotentialScore");
            return (Criteria) this;
        }

        public Criteria andPaydebtPotentialScoreLessThan(Double value) {
            addCriterion("paydebtPotentialScore <", value, "paydebtPotentialScore");
            return (Criteria) this;
        }

        public Criteria andPaydebtPotentialScoreLessThanOrEqualTo(Double value) {
            addCriterion("paydebtPotentialScore <=", value, "paydebtPotentialScore");
            return (Criteria) this;
        }

        public Criteria andPaydebtPotentialScoreIn(List<Double> values) {
            addCriterion("paydebtPotentialScore in", values, "paydebtPotentialScore");
            return (Criteria) this;
        }

        public Criteria andPaydebtPotentialScoreNotIn(List<Double> values) {
            addCriterion("paydebtPotentialScore not in", values, "paydebtPotentialScore");
            return (Criteria) this;
        }

        public Criteria andPaydebtPotentialScoreBetween(Double value1, Double value2) {
            addCriterion("paydebtPotentialScore between", value1, value2, "paydebtPotentialScore");
            return (Criteria) this;
        }

        public Criteria andPaydebtPotentialScoreNotBetween(Double value1, Double value2) {
            addCriterion("paydebtPotentialScore not between", value1, value2, "paydebtPotentialScore");
            return (Criteria) this;
        }

        public Criteria andPaydebtPotentialLevelIsNull() {
            addCriterion("paydebtPotentialLevel is null");
            return (Criteria) this;
        }

        public Criteria andPaydebtPotentialLevelIsNotNull() {
            addCriterion("paydebtPotentialLevel is not null");
            return (Criteria) this;
        }

        public Criteria andPaydebtPotentialLevelEqualTo(String value) {
            addCriterion("paydebtPotentialLevel =", value, "paydebtPotentialLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtPotentialLevelNotEqualTo(String value) {
            addCriterion("paydebtPotentialLevel <>", value, "paydebtPotentialLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtPotentialLevelGreaterThan(String value) {
            addCriterion("paydebtPotentialLevel >", value, "paydebtPotentialLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtPotentialLevelGreaterThanOrEqualTo(String value) {
            addCriterion("paydebtPotentialLevel >=", value, "paydebtPotentialLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtPotentialLevelLessThan(String value) {
            addCriterion("paydebtPotentialLevel <", value, "paydebtPotentialLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtPotentialLevelLessThanOrEqualTo(String value) {
            addCriterion("paydebtPotentialLevel <=", value, "paydebtPotentialLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtPotentialLevelLike(String value) {
            addCriterion("paydebtPotentialLevel like", value, "paydebtPotentialLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtPotentialLevelNotLike(String value) {
            addCriterion("paydebtPotentialLevel not like", value, "paydebtPotentialLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtPotentialLevelIn(List<String> values) {
            addCriterion("paydebtPotentialLevel in", values, "paydebtPotentialLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtPotentialLevelNotIn(List<String> values) {
            addCriterion("paydebtPotentialLevel not in", values, "paydebtPotentialLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtPotentialLevelBetween(String value1, String value2) {
            addCriterion("paydebtPotentialLevel between", value1, value2, "paydebtPotentialLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtPotentialLevelNotBetween(String value1, String value2) {
            addCriterion("paydebtPotentialLevel not between", value1, value2, "paydebtPotentialLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtSystemScoreIsNull() {
            addCriterion("paydebtSystemScore is null");
            return (Criteria) this;
        }

        public Criteria andPaydebtSystemScoreIsNotNull() {
            addCriterion("paydebtSystemScore is not null");
            return (Criteria) this;
        }

        public Criteria andPaydebtSystemScoreEqualTo(Double value) {
            addCriterion("paydebtSystemScore =", value, "paydebtSystemScore");
            return (Criteria) this;
        }

        public Criteria andPaydebtSystemScoreNotEqualTo(Double value) {
            addCriterion("paydebtSystemScore <>", value, "paydebtSystemScore");
            return (Criteria) this;
        }

        public Criteria andPaydebtSystemScoreGreaterThan(Double value) {
            addCriterion("paydebtSystemScore >", value, "paydebtSystemScore");
            return (Criteria) this;
        }

        public Criteria andPaydebtSystemScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("paydebtSystemScore >=", value, "paydebtSystemScore");
            return (Criteria) this;
        }

        public Criteria andPaydebtSystemScoreLessThan(Double value) {
            addCriterion("paydebtSystemScore <", value, "paydebtSystemScore");
            return (Criteria) this;
        }

        public Criteria andPaydebtSystemScoreLessThanOrEqualTo(Double value) {
            addCriterion("paydebtSystemScore <=", value, "paydebtSystemScore");
            return (Criteria) this;
        }

        public Criteria andPaydebtSystemScoreIn(List<Double> values) {
            addCriterion("paydebtSystemScore in", values, "paydebtSystemScore");
            return (Criteria) this;
        }

        public Criteria andPaydebtSystemScoreNotIn(List<Double> values) {
            addCriterion("paydebtSystemScore not in", values, "paydebtSystemScore");
            return (Criteria) this;
        }

        public Criteria andPaydebtSystemScoreBetween(Double value1, Double value2) {
            addCriterion("paydebtSystemScore between", value1, value2, "paydebtSystemScore");
            return (Criteria) this;
        }

        public Criteria andPaydebtSystemScoreNotBetween(Double value1, Double value2) {
            addCriterion("paydebtSystemScore not between", value1, value2, "paydebtSystemScore");
            return (Criteria) this;
        }

        public Criteria andPaydebtSystemLevelIsNull() {
            addCriterion("paydebtSystemLevel is null");
            return (Criteria) this;
        }

        public Criteria andPaydebtSystemLevelIsNotNull() {
            addCriterion("paydebtSystemLevel is not null");
            return (Criteria) this;
        }

        public Criteria andPaydebtSystemLevelEqualTo(String value) {
            addCriterion("paydebtSystemLevel =", value, "paydebtSystemLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtSystemLevelNotEqualTo(String value) {
            addCriterion("paydebtSystemLevel <>", value, "paydebtSystemLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtSystemLevelGreaterThan(String value) {
            addCriterion("paydebtSystemLevel >", value, "paydebtSystemLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtSystemLevelGreaterThanOrEqualTo(String value) {
            addCriterion("paydebtSystemLevel >=", value, "paydebtSystemLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtSystemLevelLessThan(String value) {
            addCriterion("paydebtSystemLevel <", value, "paydebtSystemLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtSystemLevelLessThanOrEqualTo(String value) {
            addCriterion("paydebtSystemLevel <=", value, "paydebtSystemLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtSystemLevelLike(String value) {
            addCriterion("paydebtSystemLevel like", value, "paydebtSystemLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtSystemLevelNotLike(String value) {
            addCriterion("paydebtSystemLevel not like", value, "paydebtSystemLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtSystemLevelIn(List<String> values) {
            addCriterion("paydebtSystemLevel in", values, "paydebtSystemLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtSystemLevelNotIn(List<String> values) {
            addCriterion("paydebtSystemLevel not in", values, "paydebtSystemLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtSystemLevelBetween(String value1, String value2) {
            addCriterion("paydebtSystemLevel between", value1, value2, "paydebtSystemLevel");
            return (Criteria) this;
        }

        public Criteria andPaydebtSystemLevelNotBetween(String value1, String value2) {
            addCriterion("paydebtSystemLevel not between", value1, value2, "paydebtSystemLevel");
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