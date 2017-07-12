package cn.zucc.affair.pojo;

import java.util.ArrayList;
import java.util.List;

public class SummaryPropertyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SummaryPropertyExample() {
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

        public Criteria andSpIdIsNull() {
            addCriterion("sp_id is null");
            return (Criteria) this;
        }

        public Criteria andSpIdIsNotNull() {
            addCriterion("sp_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpIdEqualTo(Integer value) {
            addCriterion("sp_id =", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdNotEqualTo(Integer value) {
            addCriterion("sp_id <>", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdGreaterThan(Integer value) {
            addCriterion("sp_id >", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_id >=", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdLessThan(Integer value) {
            addCriterion("sp_id <", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdLessThanOrEqualTo(Integer value) {
            addCriterion("sp_id <=", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdIn(List<Integer> values) {
            addCriterion("sp_id in", values, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdNotIn(List<Integer> values) {
            addCriterion("sp_id not in", values, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdBetween(Integer value1, Integer value2) {
            addCriterion("sp_id between", value1, value2, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_id not between", value1, value2, "spId");
            return (Criteria) this;
        }

        public Criteria andSp1IsNull() {
            addCriterion("sp_1 is null");
            return (Criteria) this;
        }

        public Criteria andSp1IsNotNull() {
            addCriterion("sp_1 is not null");
            return (Criteria) this;
        }

        public Criteria andSp1EqualTo(Double value) {
            addCriterion("sp_1 =", value, "sp1");
            return (Criteria) this;
        }

        public Criteria andSp1NotEqualTo(Double value) {
            addCriterion("sp_1 <>", value, "sp1");
            return (Criteria) this;
        }

        public Criteria andSp1GreaterThan(Double value) {
            addCriterion("sp_1 >", value, "sp1");
            return (Criteria) this;
        }

        public Criteria andSp1GreaterThanOrEqualTo(Double value) {
            addCriterion("sp_1 >=", value, "sp1");
            return (Criteria) this;
        }

        public Criteria andSp1LessThan(Double value) {
            addCriterion("sp_1 <", value, "sp1");
            return (Criteria) this;
        }

        public Criteria andSp1LessThanOrEqualTo(Double value) {
            addCriterion("sp_1 <=", value, "sp1");
            return (Criteria) this;
        }

        public Criteria andSp1In(List<Double> values) {
            addCriterion("sp_1 in", values, "sp1");
            return (Criteria) this;
        }

        public Criteria andSp1NotIn(List<Double> values) {
            addCriterion("sp_1 not in", values, "sp1");
            return (Criteria) this;
        }

        public Criteria andSp1Between(Double value1, Double value2) {
            addCriterion("sp_1 between", value1, value2, "sp1");
            return (Criteria) this;
        }

        public Criteria andSp1NotBetween(Double value1, Double value2) {
            addCriterion("sp_1 not between", value1, value2, "sp1");
            return (Criteria) this;
        }

        public Criteria andSp2IsNull() {
            addCriterion("sp_2 is null");
            return (Criteria) this;
        }

        public Criteria andSp2IsNotNull() {
            addCriterion("sp_2 is not null");
            return (Criteria) this;
        }

        public Criteria andSp2EqualTo(Double value) {
            addCriterion("sp_2 =", value, "sp2");
            return (Criteria) this;
        }

        public Criteria andSp2NotEqualTo(Double value) {
            addCriterion("sp_2 <>", value, "sp2");
            return (Criteria) this;
        }

        public Criteria andSp2GreaterThan(Double value) {
            addCriterion("sp_2 >", value, "sp2");
            return (Criteria) this;
        }

        public Criteria andSp2GreaterThanOrEqualTo(Double value) {
            addCriterion("sp_2 >=", value, "sp2");
            return (Criteria) this;
        }

        public Criteria andSp2LessThan(Double value) {
            addCriterion("sp_2 <", value, "sp2");
            return (Criteria) this;
        }

        public Criteria andSp2LessThanOrEqualTo(Double value) {
            addCriterion("sp_2 <=", value, "sp2");
            return (Criteria) this;
        }

        public Criteria andSp2In(List<Double> values) {
            addCriterion("sp_2 in", values, "sp2");
            return (Criteria) this;
        }

        public Criteria andSp2NotIn(List<Double> values) {
            addCriterion("sp_2 not in", values, "sp2");
            return (Criteria) this;
        }

        public Criteria andSp2Between(Double value1, Double value2) {
            addCriterion("sp_2 between", value1, value2, "sp2");
            return (Criteria) this;
        }

        public Criteria andSp2NotBetween(Double value1, Double value2) {
            addCriterion("sp_2 not between", value1, value2, "sp2");
            return (Criteria) this;
        }

        public Criteria andSp3IsNull() {
            addCriterion("sp_3 is null");
            return (Criteria) this;
        }

        public Criteria andSp3IsNotNull() {
            addCriterion("sp_3 is not null");
            return (Criteria) this;
        }

        public Criteria andSp3EqualTo(Double value) {
            addCriterion("sp_3 =", value, "sp3");
            return (Criteria) this;
        }

        public Criteria andSp3NotEqualTo(Double value) {
            addCriterion("sp_3 <>", value, "sp3");
            return (Criteria) this;
        }

        public Criteria andSp3GreaterThan(Double value) {
            addCriterion("sp_3 >", value, "sp3");
            return (Criteria) this;
        }

        public Criteria andSp3GreaterThanOrEqualTo(Double value) {
            addCriterion("sp_3 >=", value, "sp3");
            return (Criteria) this;
        }

        public Criteria andSp3LessThan(Double value) {
            addCriterion("sp_3 <", value, "sp3");
            return (Criteria) this;
        }

        public Criteria andSp3LessThanOrEqualTo(Double value) {
            addCriterion("sp_3 <=", value, "sp3");
            return (Criteria) this;
        }

        public Criteria andSp3In(List<Double> values) {
            addCriterion("sp_3 in", values, "sp3");
            return (Criteria) this;
        }

        public Criteria andSp3NotIn(List<Double> values) {
            addCriterion("sp_3 not in", values, "sp3");
            return (Criteria) this;
        }

        public Criteria andSp3Between(Double value1, Double value2) {
            addCriterion("sp_3 between", value1, value2, "sp3");
            return (Criteria) this;
        }

        public Criteria andSp3NotBetween(Double value1, Double value2) {
            addCriterion("sp_3 not between", value1, value2, "sp3");
            return (Criteria) this;
        }

        public Criteria andSp4IsNull() {
            addCriterion("sp_4 is null");
            return (Criteria) this;
        }

        public Criteria andSp4IsNotNull() {
            addCriterion("sp_4 is not null");
            return (Criteria) this;
        }

        public Criteria andSp4EqualTo(Double value) {
            addCriterion("sp_4 =", value, "sp4");
            return (Criteria) this;
        }

        public Criteria andSp4NotEqualTo(Double value) {
            addCriterion("sp_4 <>", value, "sp4");
            return (Criteria) this;
        }

        public Criteria andSp4GreaterThan(Double value) {
            addCriterion("sp_4 >", value, "sp4");
            return (Criteria) this;
        }

        public Criteria andSp4GreaterThanOrEqualTo(Double value) {
            addCriterion("sp_4 >=", value, "sp4");
            return (Criteria) this;
        }

        public Criteria andSp4LessThan(Double value) {
            addCriterion("sp_4 <", value, "sp4");
            return (Criteria) this;
        }

        public Criteria andSp4LessThanOrEqualTo(Double value) {
            addCriterion("sp_4 <=", value, "sp4");
            return (Criteria) this;
        }

        public Criteria andSp4In(List<Double> values) {
            addCriterion("sp_4 in", values, "sp4");
            return (Criteria) this;
        }

        public Criteria andSp4NotIn(List<Double> values) {
            addCriterion("sp_4 not in", values, "sp4");
            return (Criteria) this;
        }

        public Criteria andSp4Between(Double value1, Double value2) {
            addCriterion("sp_4 between", value1, value2, "sp4");
            return (Criteria) this;
        }

        public Criteria andSp4NotBetween(Double value1, Double value2) {
            addCriterion("sp_4 not between", value1, value2, "sp4");
            return (Criteria) this;
        }

        public Criteria andSp5IsNull() {
            addCriterion("sp_5 is null");
            return (Criteria) this;
        }

        public Criteria andSp5IsNotNull() {
            addCriterion("sp_5 is not null");
            return (Criteria) this;
        }

        public Criteria andSp5EqualTo(Double value) {
            addCriterion("sp_5 =", value, "sp5");
            return (Criteria) this;
        }

        public Criteria andSp5NotEqualTo(Double value) {
            addCriterion("sp_5 <>", value, "sp5");
            return (Criteria) this;
        }

        public Criteria andSp5GreaterThan(Double value) {
            addCriterion("sp_5 >", value, "sp5");
            return (Criteria) this;
        }

        public Criteria andSp5GreaterThanOrEqualTo(Double value) {
            addCriterion("sp_5 >=", value, "sp5");
            return (Criteria) this;
        }

        public Criteria andSp5LessThan(Double value) {
            addCriterion("sp_5 <", value, "sp5");
            return (Criteria) this;
        }

        public Criteria andSp5LessThanOrEqualTo(Double value) {
            addCriterion("sp_5 <=", value, "sp5");
            return (Criteria) this;
        }

        public Criteria andSp5In(List<Double> values) {
            addCriterion("sp_5 in", values, "sp5");
            return (Criteria) this;
        }

        public Criteria andSp5NotIn(List<Double> values) {
            addCriterion("sp_5 not in", values, "sp5");
            return (Criteria) this;
        }

        public Criteria andSp5Between(Double value1, Double value2) {
            addCriterion("sp_5 between", value1, value2, "sp5");
            return (Criteria) this;
        }

        public Criteria andSp5NotBetween(Double value1, Double value2) {
            addCriterion("sp_5 not between", value1, value2, "sp5");
            return (Criteria) this;
        }

        public Criteria andSp6IsNull() {
            addCriterion("sp_6 is null");
            return (Criteria) this;
        }

        public Criteria andSp6IsNotNull() {
            addCriterion("sp_6 is not null");
            return (Criteria) this;
        }

        public Criteria andSp6EqualTo(Double value) {
            addCriterion("sp_6 =", value, "sp6");
            return (Criteria) this;
        }

        public Criteria andSp6NotEqualTo(Double value) {
            addCriterion("sp_6 <>", value, "sp6");
            return (Criteria) this;
        }

        public Criteria andSp6GreaterThan(Double value) {
            addCriterion("sp_6 >", value, "sp6");
            return (Criteria) this;
        }

        public Criteria andSp6GreaterThanOrEqualTo(Double value) {
            addCriterion("sp_6 >=", value, "sp6");
            return (Criteria) this;
        }

        public Criteria andSp6LessThan(Double value) {
            addCriterion("sp_6 <", value, "sp6");
            return (Criteria) this;
        }

        public Criteria andSp6LessThanOrEqualTo(Double value) {
            addCriterion("sp_6 <=", value, "sp6");
            return (Criteria) this;
        }

        public Criteria andSp6In(List<Double> values) {
            addCriterion("sp_6 in", values, "sp6");
            return (Criteria) this;
        }

        public Criteria andSp6NotIn(List<Double> values) {
            addCriterion("sp_6 not in", values, "sp6");
            return (Criteria) this;
        }

        public Criteria andSp6Between(Double value1, Double value2) {
            addCriterion("sp_6 between", value1, value2, "sp6");
            return (Criteria) this;
        }

        public Criteria andSp6NotBetween(Double value1, Double value2) {
            addCriterion("sp_6 not between", value1, value2, "sp6");
            return (Criteria) this;
        }

        public Criteria andSp7IsNull() {
            addCriterion("sp_7 is null");
            return (Criteria) this;
        }

        public Criteria andSp7IsNotNull() {
            addCriterion("sp_7 is not null");
            return (Criteria) this;
        }

        public Criteria andSp7EqualTo(Double value) {
            addCriterion("sp_7 =", value, "sp7");
            return (Criteria) this;
        }

        public Criteria andSp7NotEqualTo(Double value) {
            addCriterion("sp_7 <>", value, "sp7");
            return (Criteria) this;
        }

        public Criteria andSp7GreaterThan(Double value) {
            addCriterion("sp_7 >", value, "sp7");
            return (Criteria) this;
        }

        public Criteria andSp7GreaterThanOrEqualTo(Double value) {
            addCriterion("sp_7 >=", value, "sp7");
            return (Criteria) this;
        }

        public Criteria andSp7LessThan(Double value) {
            addCriterion("sp_7 <", value, "sp7");
            return (Criteria) this;
        }

        public Criteria andSp7LessThanOrEqualTo(Double value) {
            addCriterion("sp_7 <=", value, "sp7");
            return (Criteria) this;
        }

        public Criteria andSp7In(List<Double> values) {
            addCriterion("sp_7 in", values, "sp7");
            return (Criteria) this;
        }

        public Criteria andSp7NotIn(List<Double> values) {
            addCriterion("sp_7 not in", values, "sp7");
            return (Criteria) this;
        }

        public Criteria andSp7Between(Double value1, Double value2) {
            addCriterion("sp_7 between", value1, value2, "sp7");
            return (Criteria) this;
        }

        public Criteria andSp7NotBetween(Double value1, Double value2) {
            addCriterion("sp_7 not between", value1, value2, "sp7");
            return (Criteria) this;
        }

        public Criteria andSp8IsNull() {
            addCriterion("sp_8 is null");
            return (Criteria) this;
        }

        public Criteria andSp8IsNotNull() {
            addCriterion("sp_8 is not null");
            return (Criteria) this;
        }

        public Criteria andSp8EqualTo(Double value) {
            addCriterion("sp_8 =", value, "sp8");
            return (Criteria) this;
        }

        public Criteria andSp8NotEqualTo(Double value) {
            addCriterion("sp_8 <>", value, "sp8");
            return (Criteria) this;
        }

        public Criteria andSp8GreaterThan(Double value) {
            addCriterion("sp_8 >", value, "sp8");
            return (Criteria) this;
        }

        public Criteria andSp8GreaterThanOrEqualTo(Double value) {
            addCriterion("sp_8 >=", value, "sp8");
            return (Criteria) this;
        }

        public Criteria andSp8LessThan(Double value) {
            addCriterion("sp_8 <", value, "sp8");
            return (Criteria) this;
        }

        public Criteria andSp8LessThanOrEqualTo(Double value) {
            addCriterion("sp_8 <=", value, "sp8");
            return (Criteria) this;
        }

        public Criteria andSp8In(List<Double> values) {
            addCriterion("sp_8 in", values, "sp8");
            return (Criteria) this;
        }

        public Criteria andSp8NotIn(List<Double> values) {
            addCriterion("sp_8 not in", values, "sp8");
            return (Criteria) this;
        }

        public Criteria andSp8Between(Double value1, Double value2) {
            addCriterion("sp_8 between", value1, value2, "sp8");
            return (Criteria) this;
        }

        public Criteria andSp8NotBetween(Double value1, Double value2) {
            addCriterion("sp_8 not between", value1, value2, "sp8");
            return (Criteria) this;
        }

        public Criteria andSp9IsNull() {
            addCriterion("sp_9 is null");
            return (Criteria) this;
        }

        public Criteria andSp9IsNotNull() {
            addCriterion("sp_9 is not null");
            return (Criteria) this;
        }

        public Criteria andSp9EqualTo(Double value) {
            addCriterion("sp_9 =", value, "sp9");
            return (Criteria) this;
        }

        public Criteria andSp9NotEqualTo(Double value) {
            addCriterion("sp_9 <>", value, "sp9");
            return (Criteria) this;
        }

        public Criteria andSp9GreaterThan(Double value) {
            addCriterion("sp_9 >", value, "sp9");
            return (Criteria) this;
        }

        public Criteria andSp9GreaterThanOrEqualTo(Double value) {
            addCriterion("sp_9 >=", value, "sp9");
            return (Criteria) this;
        }

        public Criteria andSp9LessThan(Double value) {
            addCriterion("sp_9 <", value, "sp9");
            return (Criteria) this;
        }

        public Criteria andSp9LessThanOrEqualTo(Double value) {
            addCriterion("sp_9 <=", value, "sp9");
            return (Criteria) this;
        }

        public Criteria andSp9In(List<Double> values) {
            addCriterion("sp_9 in", values, "sp9");
            return (Criteria) this;
        }

        public Criteria andSp9NotIn(List<Double> values) {
            addCriterion("sp_9 not in", values, "sp9");
            return (Criteria) this;
        }

        public Criteria andSp9Between(Double value1, Double value2) {
            addCriterion("sp_9 between", value1, value2, "sp9");
            return (Criteria) this;
        }

        public Criteria andSp9NotBetween(Double value1, Double value2) {
            addCriterion("sp_9 not between", value1, value2, "sp9");
            return (Criteria) this;
        }

        public Criteria andSp10IsNull() {
            addCriterion("sp_10 is null");
            return (Criteria) this;
        }

        public Criteria andSp10IsNotNull() {
            addCriterion("sp_10 is not null");
            return (Criteria) this;
        }

        public Criteria andSp10EqualTo(Double value) {
            addCriterion("sp_10 =", value, "sp10");
            return (Criteria) this;
        }

        public Criteria andSp10NotEqualTo(Double value) {
            addCriterion("sp_10 <>", value, "sp10");
            return (Criteria) this;
        }

        public Criteria andSp10GreaterThan(Double value) {
            addCriterion("sp_10 >", value, "sp10");
            return (Criteria) this;
        }

        public Criteria andSp10GreaterThanOrEqualTo(Double value) {
            addCriterion("sp_10 >=", value, "sp10");
            return (Criteria) this;
        }

        public Criteria andSp10LessThan(Double value) {
            addCriterion("sp_10 <", value, "sp10");
            return (Criteria) this;
        }

        public Criteria andSp10LessThanOrEqualTo(Double value) {
            addCriterion("sp_10 <=", value, "sp10");
            return (Criteria) this;
        }

        public Criteria andSp10In(List<Double> values) {
            addCriterion("sp_10 in", values, "sp10");
            return (Criteria) this;
        }

        public Criteria andSp10NotIn(List<Double> values) {
            addCriterion("sp_10 not in", values, "sp10");
            return (Criteria) this;
        }

        public Criteria andSp10Between(Double value1, Double value2) {
            addCriterion("sp_10 between", value1, value2, "sp10");
            return (Criteria) this;
        }

        public Criteria andSp10NotBetween(Double value1, Double value2) {
            addCriterion("sp_10 not between", value1, value2, "sp10");
            return (Criteria) this;
        }

        public Criteria andSp11IsNull() {
            addCriterion("sp_11 is null");
            return (Criteria) this;
        }

        public Criteria andSp11IsNotNull() {
            addCriterion("sp_11 is not null");
            return (Criteria) this;
        }

        public Criteria andSp11EqualTo(Double value) {
            addCriterion("sp_11 =", value, "sp11");
            return (Criteria) this;
        }

        public Criteria andSp11NotEqualTo(Double value) {
            addCriterion("sp_11 <>", value, "sp11");
            return (Criteria) this;
        }

        public Criteria andSp11GreaterThan(Double value) {
            addCriterion("sp_11 >", value, "sp11");
            return (Criteria) this;
        }

        public Criteria andSp11GreaterThanOrEqualTo(Double value) {
            addCriterion("sp_11 >=", value, "sp11");
            return (Criteria) this;
        }

        public Criteria andSp11LessThan(Double value) {
            addCriterion("sp_11 <", value, "sp11");
            return (Criteria) this;
        }

        public Criteria andSp11LessThanOrEqualTo(Double value) {
            addCriterion("sp_11 <=", value, "sp11");
            return (Criteria) this;
        }

        public Criteria andSp11In(List<Double> values) {
            addCriterion("sp_11 in", values, "sp11");
            return (Criteria) this;
        }

        public Criteria andSp11NotIn(List<Double> values) {
            addCriterion("sp_11 not in", values, "sp11");
            return (Criteria) this;
        }

        public Criteria andSp11Between(Double value1, Double value2) {
            addCriterion("sp_11 between", value1, value2, "sp11");
            return (Criteria) this;
        }

        public Criteria andSp11NotBetween(Double value1, Double value2) {
            addCriterion("sp_11 not between", value1, value2, "sp11");
            return (Criteria) this;
        }

        public Criteria andSp12IsNull() {
            addCriterion("sp_12 is null");
            return (Criteria) this;
        }

        public Criteria andSp12IsNotNull() {
            addCriterion("sp_12 is not null");
            return (Criteria) this;
        }

        public Criteria andSp12EqualTo(Double value) {
            addCriterion("sp_12 =", value, "sp12");
            return (Criteria) this;
        }

        public Criteria andSp12NotEqualTo(Double value) {
            addCriterion("sp_12 <>", value, "sp12");
            return (Criteria) this;
        }

        public Criteria andSp12GreaterThan(Double value) {
            addCriterion("sp_12 >", value, "sp12");
            return (Criteria) this;
        }

        public Criteria andSp12GreaterThanOrEqualTo(Double value) {
            addCriterion("sp_12 >=", value, "sp12");
            return (Criteria) this;
        }

        public Criteria andSp12LessThan(Double value) {
            addCriterion("sp_12 <", value, "sp12");
            return (Criteria) this;
        }

        public Criteria andSp12LessThanOrEqualTo(Double value) {
            addCriterion("sp_12 <=", value, "sp12");
            return (Criteria) this;
        }

        public Criteria andSp12In(List<Double> values) {
            addCriterion("sp_12 in", values, "sp12");
            return (Criteria) this;
        }

        public Criteria andSp12NotIn(List<Double> values) {
            addCriterion("sp_12 not in", values, "sp12");
            return (Criteria) this;
        }

        public Criteria andSp12Between(Double value1, Double value2) {
            addCriterion("sp_12 between", value1, value2, "sp12");
            return (Criteria) this;
        }

        public Criteria andSp12NotBetween(Double value1, Double value2) {
            addCriterion("sp_12 not between", value1, value2, "sp12");
            return (Criteria) this;
        }

        public Criteria andSp13IsNull() {
            addCriterion("sp_13 is null");
            return (Criteria) this;
        }

        public Criteria andSp13IsNotNull() {
            addCriterion("sp_13 is not null");
            return (Criteria) this;
        }

        public Criteria andSp13EqualTo(Double value) {
            addCriterion("sp_13 =", value, "sp13");
            return (Criteria) this;
        }

        public Criteria andSp13NotEqualTo(Double value) {
            addCriterion("sp_13 <>", value, "sp13");
            return (Criteria) this;
        }

        public Criteria andSp13GreaterThan(Double value) {
            addCriterion("sp_13 >", value, "sp13");
            return (Criteria) this;
        }

        public Criteria andSp13GreaterThanOrEqualTo(Double value) {
            addCriterion("sp_13 >=", value, "sp13");
            return (Criteria) this;
        }

        public Criteria andSp13LessThan(Double value) {
            addCriterion("sp_13 <", value, "sp13");
            return (Criteria) this;
        }

        public Criteria andSp13LessThanOrEqualTo(Double value) {
            addCriterion("sp_13 <=", value, "sp13");
            return (Criteria) this;
        }

        public Criteria andSp13In(List<Double> values) {
            addCriterion("sp_13 in", values, "sp13");
            return (Criteria) this;
        }

        public Criteria andSp13NotIn(List<Double> values) {
            addCriterion("sp_13 not in", values, "sp13");
            return (Criteria) this;
        }

        public Criteria andSp13Between(Double value1, Double value2) {
            addCriterion("sp_13 between", value1, value2, "sp13");
            return (Criteria) this;
        }

        public Criteria andSp13NotBetween(Double value1, Double value2) {
            addCriterion("sp_13 not between", value1, value2, "sp13");
            return (Criteria) this;
        }

        public Criteria andSp14IsNull() {
            addCriterion("sp_14 is null");
            return (Criteria) this;
        }

        public Criteria andSp14IsNotNull() {
            addCriterion("sp_14 is not null");
            return (Criteria) this;
        }

        public Criteria andSp14EqualTo(Double value) {
            addCriterion("sp_14 =", value, "sp14");
            return (Criteria) this;
        }

        public Criteria andSp14NotEqualTo(Double value) {
            addCriterion("sp_14 <>", value, "sp14");
            return (Criteria) this;
        }

        public Criteria andSp14GreaterThan(Double value) {
            addCriterion("sp_14 >", value, "sp14");
            return (Criteria) this;
        }

        public Criteria andSp14GreaterThanOrEqualTo(Double value) {
            addCriterion("sp_14 >=", value, "sp14");
            return (Criteria) this;
        }

        public Criteria andSp14LessThan(Double value) {
            addCriterion("sp_14 <", value, "sp14");
            return (Criteria) this;
        }

        public Criteria andSp14LessThanOrEqualTo(Double value) {
            addCriterion("sp_14 <=", value, "sp14");
            return (Criteria) this;
        }

        public Criteria andSp14In(List<Double> values) {
            addCriterion("sp_14 in", values, "sp14");
            return (Criteria) this;
        }

        public Criteria andSp14NotIn(List<Double> values) {
            addCriterion("sp_14 not in", values, "sp14");
            return (Criteria) this;
        }

        public Criteria andSp14Between(Double value1, Double value2) {
            addCriterion("sp_14 between", value1, value2, "sp14");
            return (Criteria) this;
        }

        public Criteria andSp14NotBetween(Double value1, Double value2) {
            addCriterion("sp_14 not between", value1, value2, "sp14");
            return (Criteria) this;
        }

        public Criteria andSp15IsNull() {
            addCriterion("sp_15 is null");
            return (Criteria) this;
        }

        public Criteria andSp15IsNotNull() {
            addCriterion("sp_15 is not null");
            return (Criteria) this;
        }

        public Criteria andSp15EqualTo(Double value) {
            addCriterion("sp_15 =", value, "sp15");
            return (Criteria) this;
        }

        public Criteria andSp15NotEqualTo(Double value) {
            addCriterion("sp_15 <>", value, "sp15");
            return (Criteria) this;
        }

        public Criteria andSp15GreaterThan(Double value) {
            addCriterion("sp_15 >", value, "sp15");
            return (Criteria) this;
        }

        public Criteria andSp15GreaterThanOrEqualTo(Double value) {
            addCriterion("sp_15 >=", value, "sp15");
            return (Criteria) this;
        }

        public Criteria andSp15LessThan(Double value) {
            addCriterion("sp_15 <", value, "sp15");
            return (Criteria) this;
        }

        public Criteria andSp15LessThanOrEqualTo(Double value) {
            addCriterion("sp_15 <=", value, "sp15");
            return (Criteria) this;
        }

        public Criteria andSp15In(List<Double> values) {
            addCriterion("sp_15 in", values, "sp15");
            return (Criteria) this;
        }

        public Criteria andSp15NotIn(List<Double> values) {
            addCriterion("sp_15 not in", values, "sp15");
            return (Criteria) this;
        }

        public Criteria andSp15Between(Double value1, Double value2) {
            addCriterion("sp_15 between", value1, value2, "sp15");
            return (Criteria) this;
        }

        public Criteria andSp15NotBetween(Double value1, Double value2) {
            addCriterion("sp_15 not between", value1, value2, "sp15");
            return (Criteria) this;
        }

        public Criteria andSp16IsNull() {
            addCriterion("sp_16 is null");
            return (Criteria) this;
        }

        public Criteria andSp16IsNotNull() {
            addCriterion("sp_16 is not null");
            return (Criteria) this;
        }

        public Criteria andSp16EqualTo(Double value) {
            addCriterion("sp_16 =", value, "sp16");
            return (Criteria) this;
        }

        public Criteria andSp16NotEqualTo(Double value) {
            addCriterion("sp_16 <>", value, "sp16");
            return (Criteria) this;
        }

        public Criteria andSp16GreaterThan(Double value) {
            addCriterion("sp_16 >", value, "sp16");
            return (Criteria) this;
        }

        public Criteria andSp16GreaterThanOrEqualTo(Double value) {
            addCriterion("sp_16 >=", value, "sp16");
            return (Criteria) this;
        }

        public Criteria andSp16LessThan(Double value) {
            addCriterion("sp_16 <", value, "sp16");
            return (Criteria) this;
        }

        public Criteria andSp16LessThanOrEqualTo(Double value) {
            addCriterion("sp_16 <=", value, "sp16");
            return (Criteria) this;
        }

        public Criteria andSp16In(List<Double> values) {
            addCriterion("sp_16 in", values, "sp16");
            return (Criteria) this;
        }

        public Criteria andSp16NotIn(List<Double> values) {
            addCriterion("sp_16 not in", values, "sp16");
            return (Criteria) this;
        }

        public Criteria andSp16Between(Double value1, Double value2) {
            addCriterion("sp_16 between", value1, value2, "sp16");
            return (Criteria) this;
        }

        public Criteria andSp16NotBetween(Double value1, Double value2) {
            addCriterion("sp_16 not between", value1, value2, "sp16");
            return (Criteria) this;
        }

        public Criteria andSp17IsNull() {
            addCriterion("sp_17 is null");
            return (Criteria) this;
        }

        public Criteria andSp17IsNotNull() {
            addCriterion("sp_17 is not null");
            return (Criteria) this;
        }

        public Criteria andSp17EqualTo(Double value) {
            addCriterion("sp_17 =", value, "sp17");
            return (Criteria) this;
        }

        public Criteria andSp17NotEqualTo(Double value) {
            addCriterion("sp_17 <>", value, "sp17");
            return (Criteria) this;
        }

        public Criteria andSp17GreaterThan(Double value) {
            addCriterion("sp_17 >", value, "sp17");
            return (Criteria) this;
        }

        public Criteria andSp17GreaterThanOrEqualTo(Double value) {
            addCriterion("sp_17 >=", value, "sp17");
            return (Criteria) this;
        }

        public Criteria andSp17LessThan(Double value) {
            addCriterion("sp_17 <", value, "sp17");
            return (Criteria) this;
        }

        public Criteria andSp17LessThanOrEqualTo(Double value) {
            addCriterion("sp_17 <=", value, "sp17");
            return (Criteria) this;
        }

        public Criteria andSp17In(List<Double> values) {
            addCriterion("sp_17 in", values, "sp17");
            return (Criteria) this;
        }

        public Criteria andSp17NotIn(List<Double> values) {
            addCriterion("sp_17 not in", values, "sp17");
            return (Criteria) this;
        }

        public Criteria andSp17Between(Double value1, Double value2) {
            addCriterion("sp_17 between", value1, value2, "sp17");
            return (Criteria) this;
        }

        public Criteria andSp17NotBetween(Double value1, Double value2) {
            addCriterion("sp_17 not between", value1, value2, "sp17");
            return (Criteria) this;
        }

        public Criteria andSp18IsNull() {
            addCriterion("sp_18 is null");
            return (Criteria) this;
        }

        public Criteria andSp18IsNotNull() {
            addCriterion("sp_18 is not null");
            return (Criteria) this;
        }

        public Criteria andSp18EqualTo(Double value) {
            addCriterion("sp_18 =", value, "sp18");
            return (Criteria) this;
        }

        public Criteria andSp18NotEqualTo(Double value) {
            addCriterion("sp_18 <>", value, "sp18");
            return (Criteria) this;
        }

        public Criteria andSp18GreaterThan(Double value) {
            addCriterion("sp_18 >", value, "sp18");
            return (Criteria) this;
        }

        public Criteria andSp18GreaterThanOrEqualTo(Double value) {
            addCriterion("sp_18 >=", value, "sp18");
            return (Criteria) this;
        }

        public Criteria andSp18LessThan(Double value) {
            addCriterion("sp_18 <", value, "sp18");
            return (Criteria) this;
        }

        public Criteria andSp18LessThanOrEqualTo(Double value) {
            addCriterion("sp_18 <=", value, "sp18");
            return (Criteria) this;
        }

        public Criteria andSp18In(List<Double> values) {
            addCriterion("sp_18 in", values, "sp18");
            return (Criteria) this;
        }

        public Criteria andSp18NotIn(List<Double> values) {
            addCriterion("sp_18 not in", values, "sp18");
            return (Criteria) this;
        }

        public Criteria andSp18Between(Double value1, Double value2) {
            addCriterion("sp_18 between", value1, value2, "sp18");
            return (Criteria) this;
        }

        public Criteria andSp18NotBetween(Double value1, Double value2) {
            addCriterion("sp_18 not between", value1, value2, "sp18");
            return (Criteria) this;
        }

        public Criteria andSp19IsNull() {
            addCriterion("sp_19 is null");
            return (Criteria) this;
        }

        public Criteria andSp19IsNotNull() {
            addCriterion("sp_19 is not null");
            return (Criteria) this;
        }

        public Criteria andSp19EqualTo(Double value) {
            addCriterion("sp_19 =", value, "sp19");
            return (Criteria) this;
        }

        public Criteria andSp19NotEqualTo(Double value) {
            addCriterion("sp_19 <>", value, "sp19");
            return (Criteria) this;
        }

        public Criteria andSp19GreaterThan(Double value) {
            addCriterion("sp_19 >", value, "sp19");
            return (Criteria) this;
        }

        public Criteria andSp19GreaterThanOrEqualTo(Double value) {
            addCriterion("sp_19 >=", value, "sp19");
            return (Criteria) this;
        }

        public Criteria andSp19LessThan(Double value) {
            addCriterion("sp_19 <", value, "sp19");
            return (Criteria) this;
        }

        public Criteria andSp19LessThanOrEqualTo(Double value) {
            addCriterion("sp_19 <=", value, "sp19");
            return (Criteria) this;
        }

        public Criteria andSp19In(List<Double> values) {
            addCriterion("sp_19 in", values, "sp19");
            return (Criteria) this;
        }

        public Criteria andSp19NotIn(List<Double> values) {
            addCriterion("sp_19 not in", values, "sp19");
            return (Criteria) this;
        }

        public Criteria andSp19Between(Double value1, Double value2) {
            addCriterion("sp_19 between", value1, value2, "sp19");
            return (Criteria) this;
        }

        public Criteria andSp19NotBetween(Double value1, Double value2) {
            addCriterion("sp_19 not between", value1, value2, "sp19");
            return (Criteria) this;
        }

        public Criteria andSp20IsNull() {
            addCriterion("sp_20 is null");
            return (Criteria) this;
        }

        public Criteria andSp20IsNotNull() {
            addCriterion("sp_20 is not null");
            return (Criteria) this;
        }

        public Criteria andSp20EqualTo(Double value) {
            addCriterion("sp_20 =", value, "sp20");
            return (Criteria) this;
        }

        public Criteria andSp20NotEqualTo(Double value) {
            addCriterion("sp_20 <>", value, "sp20");
            return (Criteria) this;
        }

        public Criteria andSp20GreaterThan(Double value) {
            addCriterion("sp_20 >", value, "sp20");
            return (Criteria) this;
        }

        public Criteria andSp20GreaterThanOrEqualTo(Double value) {
            addCriterion("sp_20 >=", value, "sp20");
            return (Criteria) this;
        }

        public Criteria andSp20LessThan(Double value) {
            addCriterion("sp_20 <", value, "sp20");
            return (Criteria) this;
        }

        public Criteria andSp20LessThanOrEqualTo(Double value) {
            addCriterion("sp_20 <=", value, "sp20");
            return (Criteria) this;
        }

        public Criteria andSp20In(List<Double> values) {
            addCriterion("sp_20 in", values, "sp20");
            return (Criteria) this;
        }

        public Criteria andSp20NotIn(List<Double> values) {
            addCriterion("sp_20 not in", values, "sp20");
            return (Criteria) this;
        }

        public Criteria andSp20Between(Double value1, Double value2) {
            addCriterion("sp_20 between", value1, value2, "sp20");
            return (Criteria) this;
        }

        public Criteria andSp20NotBetween(Double value1, Double value2) {
            addCriterion("sp_20 not between", value1, value2, "sp20");
            return (Criteria) this;
        }

        public Criteria andSp21IsNull() {
            addCriterion("sp_21 is null");
            return (Criteria) this;
        }

        public Criteria andSp21IsNotNull() {
            addCriterion("sp_21 is not null");
            return (Criteria) this;
        }

        public Criteria andSp21EqualTo(Double value) {
            addCriterion("sp_21 =", value, "sp21");
            return (Criteria) this;
        }

        public Criteria andSp21NotEqualTo(Double value) {
            addCriterion("sp_21 <>", value, "sp21");
            return (Criteria) this;
        }

        public Criteria andSp21GreaterThan(Double value) {
            addCriterion("sp_21 >", value, "sp21");
            return (Criteria) this;
        }

        public Criteria andSp21GreaterThanOrEqualTo(Double value) {
            addCriterion("sp_21 >=", value, "sp21");
            return (Criteria) this;
        }

        public Criteria andSp21LessThan(Double value) {
            addCriterion("sp_21 <", value, "sp21");
            return (Criteria) this;
        }

        public Criteria andSp21LessThanOrEqualTo(Double value) {
            addCriterion("sp_21 <=", value, "sp21");
            return (Criteria) this;
        }

        public Criteria andSp21In(List<Double> values) {
            addCriterion("sp_21 in", values, "sp21");
            return (Criteria) this;
        }

        public Criteria andSp21NotIn(List<Double> values) {
            addCriterion("sp_21 not in", values, "sp21");
            return (Criteria) this;
        }

        public Criteria andSp21Between(Double value1, Double value2) {
            addCriterion("sp_21 between", value1, value2, "sp21");
            return (Criteria) this;
        }

        public Criteria andSp21NotBetween(Double value1, Double value2) {
            addCriterion("sp_21 not between", value1, value2, "sp21");
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