package cn.zucc.affair.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProgramBudgetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProgramBudgetExample() {
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

        public Criteria andPbIdIsNull() {
            addCriterion("pb_id is null");
            return (Criteria) this;
        }

        public Criteria andPbIdIsNotNull() {
            addCriterion("pb_id is not null");
            return (Criteria) this;
        }

        public Criteria andPbIdEqualTo(Integer value) {
            addCriterion("pb_id =", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdNotEqualTo(Integer value) {
            addCriterion("pb_id <>", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdGreaterThan(Integer value) {
            addCriterion("pb_id >", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pb_id >=", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdLessThan(Integer value) {
            addCriterion("pb_id <", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdLessThanOrEqualTo(Integer value) {
            addCriterion("pb_id <=", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdIn(List<Integer> values) {
            addCriterion("pb_id in", values, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdNotIn(List<Integer> values) {
            addCriterion("pb_id not in", values, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdBetween(Integer value1, Integer value2) {
            addCriterion("pb_id between", value1, value2, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pb_id not between", value1, value2, "pbId");
            return (Criteria) this;
        }

        public Criteria andPgIdIsNull() {
            addCriterion("pg_id is null");
            return (Criteria) this;
        }

        public Criteria andPgIdIsNotNull() {
            addCriterion("pg_id is not null");
            return (Criteria) this;
        }

        public Criteria andPgIdEqualTo(Integer value) {
            addCriterion("pg_id =", value, "pgId");
            return (Criteria) this;
        }

        public Criteria andPgIdNotEqualTo(Integer value) {
            addCriterion("pg_id <>", value, "pgId");
            return (Criteria) this;
        }

        public Criteria andPgIdGreaterThan(Integer value) {
            addCriterion("pg_id >", value, "pgId");
            return (Criteria) this;
        }

        public Criteria andPgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pg_id >=", value, "pgId");
            return (Criteria) this;
        }

        public Criteria andPgIdLessThan(Integer value) {
            addCriterion("pg_id <", value, "pgId");
            return (Criteria) this;
        }

        public Criteria andPgIdLessThanOrEqualTo(Integer value) {
            addCriterion("pg_id <=", value, "pgId");
            return (Criteria) this;
        }

        public Criteria andPgIdIn(List<Integer> values) {
            addCriterion("pg_id in", values, "pgId");
            return (Criteria) this;
        }

        public Criteria andPgIdNotIn(List<Integer> values) {
            addCriterion("pg_id not in", values, "pgId");
            return (Criteria) this;
        }

        public Criteria andPgIdBetween(Integer value1, Integer value2) {
            addCriterion("pg_id between", value1, value2, "pgId");
            return (Criteria) this;
        }

        public Criteria andPgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pg_id not between", value1, value2, "pgId");
            return (Criteria) this;
        }

        public Criteria andPgTypeIdIsNull() {
            addCriterion("pg_type_id is null");
            return (Criteria) this;
        }

        public Criteria andPgTypeIdIsNotNull() {
            addCriterion("pg_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andPgTypeIdEqualTo(Integer value) {
            addCriterion("pg_type_id =", value, "pgTypeId");
            return (Criteria) this;
        }

        public Criteria andPgTypeIdNotEqualTo(Integer value) {
            addCriterion("pg_type_id <>", value, "pgTypeId");
            return (Criteria) this;
        }

        public Criteria andPgTypeIdGreaterThan(Integer value) {
            addCriterion("pg_type_id >", value, "pgTypeId");
            return (Criteria) this;
        }

        public Criteria andPgTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pg_type_id >=", value, "pgTypeId");
            return (Criteria) this;
        }

        public Criteria andPgTypeIdLessThan(Integer value) {
            addCriterion("pg_type_id <", value, "pgTypeId");
            return (Criteria) this;
        }

        public Criteria andPgTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("pg_type_id <=", value, "pgTypeId");
            return (Criteria) this;
        }

        public Criteria andPgTypeIdIn(List<Integer> values) {
            addCriterion("pg_type_id in", values, "pgTypeId");
            return (Criteria) this;
        }

        public Criteria andPgTypeIdNotIn(List<Integer> values) {
            addCriterion("pg_type_id not in", values, "pgTypeId");
            return (Criteria) this;
        }

        public Criteria andPgTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("pg_type_id between", value1, value2, "pgTypeId");
            return (Criteria) this;
        }

        public Criteria andPgTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pg_type_id not between", value1, value2, "pgTypeId");
            return (Criteria) this;
        }

        public Criteria andPbPrepareIsNull() {
            addCriterion("pb_prepare is null");
            return (Criteria) this;
        }

        public Criteria andPbPrepareIsNotNull() {
            addCriterion("pb_prepare is not null");
            return (Criteria) this;
        }

        public Criteria andPbPrepareEqualTo(Double value) {
            addCriterion("pb_prepare =", value, "pbPrepare");
            return (Criteria) this;
        }

        public Criteria andPbPrepareNotEqualTo(Double value) {
            addCriterion("pb_prepare <>", value, "pbPrepare");
            return (Criteria) this;
        }

        public Criteria andPbPrepareGreaterThan(Double value) {
            addCriterion("pb_prepare >", value, "pbPrepare");
            return (Criteria) this;
        }

        public Criteria andPbPrepareGreaterThanOrEqualTo(Double value) {
            addCriterion("pb_prepare >=", value, "pbPrepare");
            return (Criteria) this;
        }

        public Criteria andPbPrepareLessThan(Double value) {
            addCriterion("pb_prepare <", value, "pbPrepare");
            return (Criteria) this;
        }

        public Criteria andPbPrepareLessThanOrEqualTo(Double value) {
            addCriterion("pb_prepare <=", value, "pbPrepare");
            return (Criteria) this;
        }

        public Criteria andPbPrepareIn(List<Double> values) {
            addCriterion("pb_prepare in", values, "pbPrepare");
            return (Criteria) this;
        }

        public Criteria andPbPrepareNotIn(List<Double> values) {
            addCriterion("pb_prepare not in", values, "pbPrepare");
            return (Criteria) this;
        }

        public Criteria andPbPrepareBetween(Double value1, Double value2) {
            addCriterion("pb_prepare between", value1, value2, "pbPrepare");
            return (Criteria) this;
        }

        public Criteria andPbPrepareNotBetween(Double value1, Double value2) {
            addCriterion("pb_prepare not between", value1, value2, "pbPrepare");
            return (Criteria) this;
        }

        public Criteria andPbApplyIsNull() {
            addCriterion("pb_apply is null");
            return (Criteria) this;
        }

        public Criteria andPbApplyIsNotNull() {
            addCriterion("pb_apply is not null");
            return (Criteria) this;
        }

        public Criteria andPbApplyEqualTo(Double value) {
            addCriterion("pb_apply =", value, "pbApply");
            return (Criteria) this;
        }

        public Criteria andPbApplyNotEqualTo(Double value) {
            addCriterion("pb_apply <>", value, "pbApply");
            return (Criteria) this;
        }

        public Criteria andPbApplyGreaterThan(Double value) {
            addCriterion("pb_apply >", value, "pbApply");
            return (Criteria) this;
        }

        public Criteria andPbApplyGreaterThanOrEqualTo(Double value) {
            addCriterion("pb_apply >=", value, "pbApply");
            return (Criteria) this;
        }

        public Criteria andPbApplyLessThan(Double value) {
            addCriterion("pb_apply <", value, "pbApply");
            return (Criteria) this;
        }

        public Criteria andPbApplyLessThanOrEqualTo(Double value) {
            addCriterion("pb_apply <=", value, "pbApply");
            return (Criteria) this;
        }

        public Criteria andPbApplyIn(List<Double> values) {
            addCriterion("pb_apply in", values, "pbApply");
            return (Criteria) this;
        }

        public Criteria andPbApplyNotIn(List<Double> values) {
            addCriterion("pb_apply not in", values, "pbApply");
            return (Criteria) this;
        }

        public Criteria andPbApplyBetween(Double value1, Double value2) {
            addCriterion("pb_apply between", value1, value2, "pbApply");
            return (Criteria) this;
        }

        public Criteria andPbApplyNotBetween(Double value1, Double value2) {
            addCriterion("pb_apply not between", value1, value2, "pbApply");
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