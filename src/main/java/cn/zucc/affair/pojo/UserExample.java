package cn.zucc.affair.pojo;

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

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(String value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(String value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(String value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(String value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(String value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(String value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLike(String value) {
            addCriterion("u_id like", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotLike(String value) {
            addCriterion("u_id not like", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<String> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<String> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(String value1, String value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(String value1, String value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUPwdIsNull() {
            addCriterion("u_pwd is null");
            return (Criteria) this;
        }

        public Criteria andUPwdIsNotNull() {
            addCriterion("u_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andUPwdEqualTo(String value) {
            addCriterion("u_pwd =", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotEqualTo(String value) {
            addCriterion("u_pwd <>", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdGreaterThan(String value) {
            addCriterion("u_pwd >", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdGreaterThanOrEqualTo(String value) {
            addCriterion("u_pwd >=", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdLessThan(String value) {
            addCriterion("u_pwd <", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdLessThanOrEqualTo(String value) {
            addCriterion("u_pwd <=", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdLike(String value) {
            addCriterion("u_pwd like", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotLike(String value) {
            addCriterion("u_pwd not like", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdIn(List<String> values) {
            addCriterion("u_pwd in", values, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotIn(List<String> values) {
            addCriterion("u_pwd not in", values, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdBetween(String value1, String value2) {
            addCriterion("u_pwd between", value1, value2, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotBetween(String value1, String value2) {
            addCriterion("u_pwd not between", value1, value2, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUNameIsNull() {
            addCriterion("u_name is null");
            return (Criteria) this;
        }

        public Criteria andUNameIsNotNull() {
            addCriterion("u_name is not null");
            return (Criteria) this;
        }

        public Criteria andUNameEqualTo(String value) {
            addCriterion("u_name =", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotEqualTo(String value) {
            addCriterion("u_name <>", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThan(String value) {
            addCriterion("u_name >", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThanOrEqualTo(String value) {
            addCriterion("u_name >=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThan(String value) {
            addCriterion("u_name <", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThanOrEqualTo(String value) {
            addCriterion("u_name <=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLike(String value) {
            addCriterion("u_name like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotLike(String value) {
            addCriterion("u_name not like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameIn(List<String> values) {
            addCriterion("u_name in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotIn(List<String> values) {
            addCriterion("u_name not in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameBetween(String value1, String value2) {
            addCriterion("u_name between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotBetween(String value1, String value2) {
            addCriterion("u_name not between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUPowerIsNull() {
            addCriterion("u_power is null");
            return (Criteria) this;
        }

        public Criteria andUPowerIsNotNull() {
            addCriterion("u_power is not null");
            return (Criteria) this;
        }

        public Criteria andUPowerEqualTo(String value) {
            addCriterion("u_power =", value, "uPower");
            return (Criteria) this;
        }

        public Criteria andUPowerNotEqualTo(String value) {
            addCriterion("u_power <>", value, "uPower");
            return (Criteria) this;
        }

        public Criteria andUPowerGreaterThan(String value) {
            addCriterion("u_power >", value, "uPower");
            return (Criteria) this;
        }

        public Criteria andUPowerGreaterThanOrEqualTo(String value) {
            addCriterion("u_power >=", value, "uPower");
            return (Criteria) this;
        }

        public Criteria andUPowerLessThan(String value) {
            addCriterion("u_power <", value, "uPower");
            return (Criteria) this;
        }

        public Criteria andUPowerLessThanOrEqualTo(String value) {
            addCriterion("u_power <=", value, "uPower");
            return (Criteria) this;
        }

        public Criteria andUPowerLike(String value) {
            addCriterion("u_power like", value, "uPower");
            return (Criteria) this;
        }

        public Criteria andUPowerNotLike(String value) {
            addCriterion("u_power not like", value, "uPower");
            return (Criteria) this;
        }

        public Criteria andUPowerIn(List<String> values) {
            addCriterion("u_power in", values, "uPower");
            return (Criteria) this;
        }

        public Criteria andUPowerNotIn(List<String> values) {
            addCriterion("u_power not in", values, "uPower");
            return (Criteria) this;
        }

        public Criteria andUPowerBetween(String value1, String value2) {
            addCriterion("u_power between", value1, value2, "uPower");
            return (Criteria) this;
        }

        public Criteria andUPowerNotBetween(String value1, String value2) {
            addCriterion("u_power not between", value1, value2, "uPower");
            return (Criteria) this;
        }

        public Criteria andUOcpyIsNull() {
            addCriterion("u_ocpy is null");
            return (Criteria) this;
        }

        public Criteria andUOcpyIsNotNull() {
            addCriterion("u_ocpy is not null");
            return (Criteria) this;
        }

        public Criteria andUOcpyEqualTo(String value) {
            addCriterion("u_ocpy =", value, "uOcpy");
            return (Criteria) this;
        }

        public Criteria andUOcpyNotEqualTo(String value) {
            addCriterion("u_ocpy <>", value, "uOcpy");
            return (Criteria) this;
        }

        public Criteria andUOcpyGreaterThan(String value) {
            addCriterion("u_ocpy >", value, "uOcpy");
            return (Criteria) this;
        }

        public Criteria andUOcpyGreaterThanOrEqualTo(String value) {
            addCriterion("u_ocpy >=", value, "uOcpy");
            return (Criteria) this;
        }

        public Criteria andUOcpyLessThan(String value) {
            addCriterion("u_ocpy <", value, "uOcpy");
            return (Criteria) this;
        }

        public Criteria andUOcpyLessThanOrEqualTo(String value) {
            addCriterion("u_ocpy <=", value, "uOcpy");
            return (Criteria) this;
        }

        public Criteria andUOcpyLike(String value) {
            addCriterion("u_ocpy like", value, "uOcpy");
            return (Criteria) this;
        }

        public Criteria andUOcpyNotLike(String value) {
            addCriterion("u_ocpy not like", value, "uOcpy");
            return (Criteria) this;
        }

        public Criteria andUOcpyIn(List<String> values) {
            addCriterion("u_ocpy in", values, "uOcpy");
            return (Criteria) this;
        }

        public Criteria andUOcpyNotIn(List<String> values) {
            addCriterion("u_ocpy not in", values, "uOcpy");
            return (Criteria) this;
        }

        public Criteria andUOcpyBetween(String value1, String value2) {
            addCriterion("u_ocpy between", value1, value2, "uOcpy");
            return (Criteria) this;
        }

        public Criteria andUOcpyNotBetween(String value1, String value2) {
            addCriterion("u_ocpy not between", value1, value2, "uOcpy");
            return (Criteria) this;
        }

        public Criteria andUUnitIsNull() {
            addCriterion("u_unit is null");
            return (Criteria) this;
        }

        public Criteria andUUnitIsNotNull() {
            addCriterion("u_unit is not null");
            return (Criteria) this;
        }

        public Criteria andUUnitEqualTo(String value) {
            addCriterion("u_unit =", value, "uUnit");
            return (Criteria) this;
        }

        public Criteria andUUnitNotEqualTo(String value) {
            addCriterion("u_unit <>", value, "uUnit");
            return (Criteria) this;
        }

        public Criteria andUUnitGreaterThan(String value) {
            addCriterion("u_unit >", value, "uUnit");
            return (Criteria) this;
        }

        public Criteria andUUnitGreaterThanOrEqualTo(String value) {
            addCriterion("u_unit >=", value, "uUnit");
            return (Criteria) this;
        }

        public Criteria andUUnitLessThan(String value) {
            addCriterion("u_unit <", value, "uUnit");
            return (Criteria) this;
        }

        public Criteria andUUnitLessThanOrEqualTo(String value) {
            addCriterion("u_unit <=", value, "uUnit");
            return (Criteria) this;
        }

        public Criteria andUUnitLike(String value) {
            addCriterion("u_unit like", value, "uUnit");
            return (Criteria) this;
        }

        public Criteria andUUnitNotLike(String value) {
            addCriterion("u_unit not like", value, "uUnit");
            return (Criteria) this;
        }

        public Criteria andUUnitIn(List<String> values) {
            addCriterion("u_unit in", values, "uUnit");
            return (Criteria) this;
        }

        public Criteria andUUnitNotIn(List<String> values) {
            addCriterion("u_unit not in", values, "uUnit");
            return (Criteria) this;
        }

        public Criteria andUUnitBetween(String value1, String value2) {
            addCriterion("u_unit between", value1, value2, "uUnit");
            return (Criteria) this;
        }

        public Criteria andUUnitNotBetween(String value1, String value2) {
            addCriterion("u_unit not between", value1, value2, "uUnit");
            return (Criteria) this;
        }

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(String value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(String value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(String value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(String value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(String value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLike(String value) {
            addCriterion("c_id like", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotLike(String value) {
            addCriterion("c_id not like", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<String> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<String> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(String value1, String value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(String value1, String value2) {
            addCriterion("c_id not between", value1, value2, "cId");
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