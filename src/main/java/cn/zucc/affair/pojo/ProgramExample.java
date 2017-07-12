package cn.zucc.affair.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProgramExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProgramExample() {
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

        public Criteria andPgNameIsNull() {
            addCriterion("pg_name is null");
            return (Criteria) this;
        }

        public Criteria andPgNameIsNotNull() {
            addCriterion("pg_name is not null");
            return (Criteria) this;
        }

        public Criteria andPgNameEqualTo(String value) {
            addCriterion("pg_name =", value, "pgName");
            return (Criteria) this;
        }

        public Criteria andPgNameNotEqualTo(String value) {
            addCriterion("pg_name <>", value, "pgName");
            return (Criteria) this;
        }

        public Criteria andPgNameGreaterThan(String value) {
            addCriterion("pg_name >", value, "pgName");
            return (Criteria) this;
        }

        public Criteria andPgNameGreaterThanOrEqualTo(String value) {
            addCriterion("pg_name >=", value, "pgName");
            return (Criteria) this;
        }

        public Criteria andPgNameLessThan(String value) {
            addCriterion("pg_name <", value, "pgName");
            return (Criteria) this;
        }

        public Criteria andPgNameLessThanOrEqualTo(String value) {
            addCriterion("pg_name <=", value, "pgName");
            return (Criteria) this;
        }

        public Criteria andPgNameLike(String value) {
            addCriterion("pg_name like", value, "pgName");
            return (Criteria) this;
        }

        public Criteria andPgNameNotLike(String value) {
            addCriterion("pg_name not like", value, "pgName");
            return (Criteria) this;
        }

        public Criteria andPgNameIn(List<String> values) {
            addCriterion("pg_name in", values, "pgName");
            return (Criteria) this;
        }

        public Criteria andPgNameNotIn(List<String> values) {
            addCriterion("pg_name not in", values, "pgName");
            return (Criteria) this;
        }

        public Criteria andPgNameBetween(String value1, String value2) {
            addCriterion("pg_name between", value1, value2, "pgName");
            return (Criteria) this;
        }

        public Criteria andPgNameNotBetween(String value1, String value2) {
            addCriterion("pg_name not between", value1, value2, "pgName");
            return (Criteria) this;
        }

        public Criteria andPgTypeIdIsNull() {
            addCriterion("\"pg _type_id\" is null");
            return (Criteria) this;
        }

        public Criteria andPgTypeIdIsNotNull() {
            addCriterion("\"pg _type_id\" is not null");
            return (Criteria) this;
        }

        public Criteria andPgTypeIdEqualTo(Integer value) {
            addCriterion("\"pg _type_id\" =", value, "pgTypeId");
            return (Criteria) this;
        }

        public Criteria andPgTypeIdNotEqualTo(Integer value) {
            addCriterion("\"pg _type_id\" <>", value, "pgTypeId");
            return (Criteria) this;
        }

        public Criteria andPgTypeIdGreaterThan(Integer value) {
            addCriterion("\"pg _type_id\" >", value, "pgTypeId");
            return (Criteria) this;
        }

        public Criteria andPgTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"pg _type_id\" >=", value, "pgTypeId");
            return (Criteria) this;
        }

        public Criteria andPgTypeIdLessThan(Integer value) {
            addCriterion("\"pg _type_id\" <", value, "pgTypeId");
            return (Criteria) this;
        }

        public Criteria andPgTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("\"pg _type_id\" <=", value, "pgTypeId");
            return (Criteria) this;
        }

        public Criteria andPgTypeIdIn(List<Integer> values) {
            addCriterion("\"pg _type_id\" in", values, "pgTypeId");
            return (Criteria) this;
        }

        public Criteria andPgTypeIdNotIn(List<Integer> values) {
            addCriterion("\"pg _type_id\" not in", values, "pgTypeId");
            return (Criteria) this;
        }

        public Criteria andPgTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("\"pg _type_id\" between", value1, value2, "pgTypeId");
            return (Criteria) this;
        }

        public Criteria andPgTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("\"pg _type_id\" not between", value1, value2, "pgTypeId");
            return (Criteria) this;
        }

        public Criteria andPgStarttimeIsNull() {
            addCriterion("pg_starttime is null");
            return (Criteria) this;
        }

        public Criteria andPgStarttimeIsNotNull() {
            addCriterion("pg_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andPgStarttimeEqualTo(Date value) {
            addCriterion("pg_starttime =", value, "pgStarttime");
            return (Criteria) this;
        }

        public Criteria andPgStarttimeNotEqualTo(Date value) {
            addCriterion("pg_starttime <>", value, "pgStarttime");
            return (Criteria) this;
        }

        public Criteria andPgStarttimeGreaterThan(Date value) {
            addCriterion("pg_starttime >", value, "pgStarttime");
            return (Criteria) this;
        }

        public Criteria andPgStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pg_starttime >=", value, "pgStarttime");
            return (Criteria) this;
        }

        public Criteria andPgStarttimeLessThan(Date value) {
            addCriterion("pg_starttime <", value, "pgStarttime");
            return (Criteria) this;
        }

        public Criteria andPgStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("pg_starttime <=", value, "pgStarttime");
            return (Criteria) this;
        }

        public Criteria andPgStarttimeIn(List<Date> values) {
            addCriterion("pg_starttime in", values, "pgStarttime");
            return (Criteria) this;
        }

        public Criteria andPgStarttimeNotIn(List<Date> values) {
            addCriterion("pg_starttime not in", values, "pgStarttime");
            return (Criteria) this;
        }

        public Criteria andPgStarttimeBetween(Date value1, Date value2) {
            addCriterion("pg_starttime between", value1, value2, "pgStarttime");
            return (Criteria) this;
        }

        public Criteria andPgStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("pg_starttime not between", value1, value2, "pgStarttime");
            return (Criteria) this;
        }

        public Criteria andPgEndtimeIsNull() {
            addCriterion("pg_endtime is null");
            return (Criteria) this;
        }

        public Criteria andPgEndtimeIsNotNull() {
            addCriterion("pg_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andPgEndtimeEqualTo(Date value) {
            addCriterion("pg_endtime =", value, "pgEndtime");
            return (Criteria) this;
        }

        public Criteria andPgEndtimeNotEqualTo(Date value) {
            addCriterion("pg_endtime <>", value, "pgEndtime");
            return (Criteria) this;
        }

        public Criteria andPgEndtimeGreaterThan(Date value) {
            addCriterion("pg_endtime >", value, "pgEndtime");
            return (Criteria) this;
        }

        public Criteria andPgEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pg_endtime >=", value, "pgEndtime");
            return (Criteria) this;
        }

        public Criteria andPgEndtimeLessThan(Date value) {
            addCriterion("pg_endtime <", value, "pgEndtime");
            return (Criteria) this;
        }

        public Criteria andPgEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("pg_endtime <=", value, "pgEndtime");
            return (Criteria) this;
        }

        public Criteria andPgEndtimeIn(List<Date> values) {
            addCriterion("pg_endtime in", values, "pgEndtime");
            return (Criteria) this;
        }

        public Criteria andPgEndtimeNotIn(List<Date> values) {
            addCriterion("pg_endtime not in", values, "pgEndtime");
            return (Criteria) this;
        }

        public Criteria andPgEndtimeBetween(Date value1, Date value2) {
            addCriterion("pg_endtime between", value1, value2, "pgEndtime");
            return (Criteria) this;
        }

        public Criteria andPgEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("pg_endtime not between", value1, value2, "pgEndtime");
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