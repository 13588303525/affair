package cn.zucc.affair.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EvectionPropertyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvectionPropertyExample() {
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

        public Criteria andEpIdIsNull() {
            addCriterion("ep_id is null");
            return (Criteria) this;
        }

        public Criteria andEpIdIsNotNull() {
            addCriterion("ep_id is not null");
            return (Criteria) this;
        }

        public Criteria andEpIdEqualTo(Integer value) {
            addCriterion("ep_id =", value, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdNotEqualTo(Integer value) {
            addCriterion("ep_id <>", value, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdGreaterThan(Integer value) {
            addCriterion("ep_id >", value, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ep_id >=", value, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdLessThan(Integer value) {
            addCriterion("ep_id <", value, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdLessThanOrEqualTo(Integer value) {
            addCriterion("ep_id <=", value, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdIn(List<Integer> values) {
            addCriterion("ep_id in", values, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdNotIn(List<Integer> values) {
            addCriterion("ep_id not in", values, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdBetween(Integer value1, Integer value2) {
            addCriterion("ep_id between", value1, value2, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ep_id not between", value1, value2, "epId");
            return (Criteria) this;
        }

        public Criteria andEpAddressIsNull() {
            addCriterion("ep_address is null");
            return (Criteria) this;
        }

        public Criteria andEpAddressIsNotNull() {
            addCriterion("ep_address is not null");
            return (Criteria) this;
        }

        public Criteria andEpAddressEqualTo(String value) {
            addCriterion("ep_address =", value, "epAddress");
            return (Criteria) this;
        }

        public Criteria andEpAddressNotEqualTo(String value) {
            addCriterion("ep_address <>", value, "epAddress");
            return (Criteria) this;
        }

        public Criteria andEpAddressGreaterThan(String value) {
            addCriterion("ep_address >", value, "epAddress");
            return (Criteria) this;
        }

        public Criteria andEpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ep_address >=", value, "epAddress");
            return (Criteria) this;
        }

        public Criteria andEpAddressLessThan(String value) {
            addCriterion("ep_address <", value, "epAddress");
            return (Criteria) this;
        }

        public Criteria andEpAddressLessThanOrEqualTo(String value) {
            addCriterion("ep_address <=", value, "epAddress");
            return (Criteria) this;
        }

        public Criteria andEpAddressLike(String value) {
            addCriterion("ep_address like", value, "epAddress");
            return (Criteria) this;
        }

        public Criteria andEpAddressNotLike(String value) {
            addCriterion("ep_address not like", value, "epAddress");
            return (Criteria) this;
        }

        public Criteria andEpAddressIn(List<String> values) {
            addCriterion("ep_address in", values, "epAddress");
            return (Criteria) this;
        }

        public Criteria andEpAddressNotIn(List<String> values) {
            addCriterion("ep_address not in", values, "epAddress");
            return (Criteria) this;
        }

        public Criteria andEpAddressBetween(String value1, String value2) {
            addCriterion("ep_address between", value1, value2, "epAddress");
            return (Criteria) this;
        }

        public Criteria andEpAddressNotBetween(String value1, String value2) {
            addCriterion("ep_address not between", value1, value2, "epAddress");
            return (Criteria) this;
        }

        public Criteria andEpReasonIsNull() {
            addCriterion("ep_reason is null");
            return (Criteria) this;
        }

        public Criteria andEpReasonIsNotNull() {
            addCriterion("ep_reason is not null");
            return (Criteria) this;
        }

        public Criteria andEpReasonEqualTo(String value) {
            addCriterion("ep_reason =", value, "epReason");
            return (Criteria) this;
        }

        public Criteria andEpReasonNotEqualTo(String value) {
            addCriterion("ep_reason <>", value, "epReason");
            return (Criteria) this;
        }

        public Criteria andEpReasonGreaterThan(String value) {
            addCriterion("ep_reason >", value, "epReason");
            return (Criteria) this;
        }

        public Criteria andEpReasonGreaterThanOrEqualTo(String value) {
            addCriterion("ep_reason >=", value, "epReason");
            return (Criteria) this;
        }

        public Criteria andEpReasonLessThan(String value) {
            addCriterion("ep_reason <", value, "epReason");
            return (Criteria) this;
        }

        public Criteria andEpReasonLessThanOrEqualTo(String value) {
            addCriterion("ep_reason <=", value, "epReason");
            return (Criteria) this;
        }

        public Criteria andEpReasonLike(String value) {
            addCriterion("ep_reason like", value, "epReason");
            return (Criteria) this;
        }

        public Criteria andEpReasonNotLike(String value) {
            addCriterion("ep_reason not like", value, "epReason");
            return (Criteria) this;
        }

        public Criteria andEpReasonIn(List<String> values) {
            addCriterion("ep_reason in", values, "epReason");
            return (Criteria) this;
        }

        public Criteria andEpReasonNotIn(List<String> values) {
            addCriterion("ep_reason not in", values, "epReason");
            return (Criteria) this;
        }

        public Criteria andEpReasonBetween(String value1, String value2) {
            addCriterion("ep_reason between", value1, value2, "epReason");
            return (Criteria) this;
        }

        public Criteria andEpReasonNotBetween(String value1, String value2) {
            addCriterion("ep_reason not between", value1, value2, "epReason");
            return (Criteria) this;
        }

        public Criteria andEpStarttimeIsNull() {
            addCriterion("ep_starttime is null");
            return (Criteria) this;
        }

        public Criteria andEpStarttimeIsNotNull() {
            addCriterion("ep_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andEpStarttimeEqualTo(Date value) {
            addCriterion("ep_starttime =", value, "epStarttime");
            return (Criteria) this;
        }

        public Criteria andEpStarttimeNotEqualTo(Date value) {
            addCriterion("ep_starttime <>", value, "epStarttime");
            return (Criteria) this;
        }

        public Criteria andEpStarttimeGreaterThan(Date value) {
            addCriterion("ep_starttime >", value, "epStarttime");
            return (Criteria) this;
        }

        public Criteria andEpStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ep_starttime >=", value, "epStarttime");
            return (Criteria) this;
        }

        public Criteria andEpStarttimeLessThan(Date value) {
            addCriterion("ep_starttime <", value, "epStarttime");
            return (Criteria) this;
        }

        public Criteria andEpStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("ep_starttime <=", value, "epStarttime");
            return (Criteria) this;
        }

        public Criteria andEpStarttimeIn(List<Date> values) {
            addCriterion("ep_starttime in", values, "epStarttime");
            return (Criteria) this;
        }

        public Criteria andEpStarttimeNotIn(List<Date> values) {
            addCriterion("ep_starttime not in", values, "epStarttime");
            return (Criteria) this;
        }

        public Criteria andEpStarttimeBetween(Date value1, Date value2) {
            addCriterion("ep_starttime between", value1, value2, "epStarttime");
            return (Criteria) this;
        }

        public Criteria andEpStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("ep_starttime not between", value1, value2, "epStarttime");
            return (Criteria) this;
        }

        public Criteria andEpEndtimeIsNull() {
            addCriterion("ep_endtime is null");
            return (Criteria) this;
        }

        public Criteria andEpEndtimeIsNotNull() {
            addCriterion("ep_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEpEndtimeEqualTo(Date value) {
            addCriterion("ep_endtime =", value, "epEndtime");
            return (Criteria) this;
        }

        public Criteria andEpEndtimeNotEqualTo(Date value) {
            addCriterion("ep_endtime <>", value, "epEndtime");
            return (Criteria) this;
        }

        public Criteria andEpEndtimeGreaterThan(Date value) {
            addCriterion("ep_endtime >", value, "epEndtime");
            return (Criteria) this;
        }

        public Criteria andEpEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ep_endtime >=", value, "epEndtime");
            return (Criteria) this;
        }

        public Criteria andEpEndtimeLessThan(Date value) {
            addCriterion("ep_endtime <", value, "epEndtime");
            return (Criteria) this;
        }

        public Criteria andEpEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("ep_endtime <=", value, "epEndtime");
            return (Criteria) this;
        }

        public Criteria andEpEndtimeIn(List<Date> values) {
            addCriterion("ep_endtime in", values, "epEndtime");
            return (Criteria) this;
        }

        public Criteria andEpEndtimeNotIn(List<Date> values) {
            addCriterion("ep_endtime not in", values, "epEndtime");
            return (Criteria) this;
        }

        public Criteria andEpEndtimeBetween(Date value1, Date value2) {
            addCriterion("ep_endtime between", value1, value2, "epEndtime");
            return (Criteria) this;
        }

        public Criteria andEpEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("ep_endtime not between", value1, value2, "epEndtime");
            return (Criteria) this;
        }

        public Criteria andEpDaysIsNull() {
            addCriterion("ep_days is null");
            return (Criteria) this;
        }

        public Criteria andEpDaysIsNotNull() {
            addCriterion("ep_days is not null");
            return (Criteria) this;
        }

        public Criteria andEpDaysEqualTo(Integer value) {
            addCriterion("ep_days =", value, "epDays");
            return (Criteria) this;
        }

        public Criteria andEpDaysNotEqualTo(Integer value) {
            addCriterion("ep_days <>", value, "epDays");
            return (Criteria) this;
        }

        public Criteria andEpDaysGreaterThan(Integer value) {
            addCriterion("ep_days >", value, "epDays");
            return (Criteria) this;
        }

        public Criteria andEpDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("ep_days >=", value, "epDays");
            return (Criteria) this;
        }

        public Criteria andEpDaysLessThan(Integer value) {
            addCriterion("ep_days <", value, "epDays");
            return (Criteria) this;
        }

        public Criteria andEpDaysLessThanOrEqualTo(Integer value) {
            addCriterion("ep_days <=", value, "epDays");
            return (Criteria) this;
        }

        public Criteria andEpDaysIn(List<Integer> values) {
            addCriterion("ep_days in", values, "epDays");
            return (Criteria) this;
        }

        public Criteria andEpDaysNotIn(List<Integer> values) {
            addCriterion("ep_days not in", values, "epDays");
            return (Criteria) this;
        }

        public Criteria andEpDaysBetween(Integer value1, Integer value2) {
            addCriterion("ep_days between", value1, value2, "epDays");
            return (Criteria) this;
        }

        public Criteria andEpDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("ep_days not between", value1, value2, "epDays");
            return (Criteria) this;
        }

        public Criteria andEpAircraftFeeIsNull() {
            addCriterion("ep_aircraft_fee is null");
            return (Criteria) this;
        }

        public Criteria andEpAircraftFeeIsNotNull() {
            addCriterion("ep_aircraft_fee is not null");
            return (Criteria) this;
        }

        public Criteria andEpAircraftFeeEqualTo(Double value) {
            addCriterion("ep_aircraft_fee =", value, "epAircraftFee");
            return (Criteria) this;
        }

        public Criteria andEpAircraftFeeNotEqualTo(Double value) {
            addCriterion("ep_aircraft_fee <>", value, "epAircraftFee");
            return (Criteria) this;
        }

        public Criteria andEpAircraftFeeGreaterThan(Double value) {
            addCriterion("ep_aircraft_fee >", value, "epAircraftFee");
            return (Criteria) this;
        }

        public Criteria andEpAircraftFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("ep_aircraft_fee >=", value, "epAircraftFee");
            return (Criteria) this;
        }

        public Criteria andEpAircraftFeeLessThan(Double value) {
            addCriterion("ep_aircraft_fee <", value, "epAircraftFee");
            return (Criteria) this;
        }

        public Criteria andEpAircraftFeeLessThanOrEqualTo(Double value) {
            addCriterion("ep_aircraft_fee <=", value, "epAircraftFee");
            return (Criteria) this;
        }

        public Criteria andEpAircraftFeeIn(List<Double> values) {
            addCriterion("ep_aircraft_fee in", values, "epAircraftFee");
            return (Criteria) this;
        }

        public Criteria andEpAircraftFeeNotIn(List<Double> values) {
            addCriterion("ep_aircraft_fee not in", values, "epAircraftFee");
            return (Criteria) this;
        }

        public Criteria andEpAircraftFeeBetween(Double value1, Double value2) {
            addCriterion("ep_aircraft_fee between", value1, value2, "epAircraftFee");
            return (Criteria) this;
        }

        public Criteria andEpAircraftFeeNotBetween(Double value1, Double value2) {
            addCriterion("ep_aircraft_fee not between", value1, value2, "epAircraftFee");
            return (Criteria) this;
        }

        public Criteria andEpTrainFeeIsNull() {
            addCriterion("ep_train_fee is null");
            return (Criteria) this;
        }

        public Criteria andEpTrainFeeIsNotNull() {
            addCriterion("ep_train_fee is not null");
            return (Criteria) this;
        }

        public Criteria andEpTrainFeeEqualTo(Double value) {
            addCriterion("ep_train_fee =", value, "epTrainFee");
            return (Criteria) this;
        }

        public Criteria andEpTrainFeeNotEqualTo(Double value) {
            addCriterion("ep_train_fee <>", value, "epTrainFee");
            return (Criteria) this;
        }

        public Criteria andEpTrainFeeGreaterThan(Double value) {
            addCriterion("ep_train_fee >", value, "epTrainFee");
            return (Criteria) this;
        }

        public Criteria andEpTrainFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("ep_train_fee >=", value, "epTrainFee");
            return (Criteria) this;
        }

        public Criteria andEpTrainFeeLessThan(Double value) {
            addCriterion("ep_train_fee <", value, "epTrainFee");
            return (Criteria) this;
        }

        public Criteria andEpTrainFeeLessThanOrEqualTo(Double value) {
            addCriterion("ep_train_fee <=", value, "epTrainFee");
            return (Criteria) this;
        }

        public Criteria andEpTrainFeeIn(List<Double> values) {
            addCriterion("ep_train_fee in", values, "epTrainFee");
            return (Criteria) this;
        }

        public Criteria andEpTrainFeeNotIn(List<Double> values) {
            addCriterion("ep_train_fee not in", values, "epTrainFee");
            return (Criteria) this;
        }

        public Criteria andEpTrainFeeBetween(Double value1, Double value2) {
            addCriterion("ep_train_fee between", value1, value2, "epTrainFee");
            return (Criteria) this;
        }

        public Criteria andEpTrainFeeNotBetween(Double value1, Double value2) {
            addCriterion("ep_train_fee not between", value1, value2, "epTrainFee");
            return (Criteria) this;
        }

        public Criteria andEpOtherTrafficFeeIsNull() {
            addCriterion("ep_other_traffic_fee is null");
            return (Criteria) this;
        }

        public Criteria andEpOtherTrafficFeeIsNotNull() {
            addCriterion("ep_other_traffic_fee is not null");
            return (Criteria) this;
        }

        public Criteria andEpOtherTrafficFeeEqualTo(Double value) {
            addCriterion("ep_other_traffic_fee =", value, "epOtherTrafficFee");
            return (Criteria) this;
        }

        public Criteria andEpOtherTrafficFeeNotEqualTo(Double value) {
            addCriterion("ep_other_traffic_fee <>", value, "epOtherTrafficFee");
            return (Criteria) this;
        }

        public Criteria andEpOtherTrafficFeeGreaterThan(Double value) {
            addCriterion("ep_other_traffic_fee >", value, "epOtherTrafficFee");
            return (Criteria) this;
        }

        public Criteria andEpOtherTrafficFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("ep_other_traffic_fee >=", value, "epOtherTrafficFee");
            return (Criteria) this;
        }

        public Criteria andEpOtherTrafficFeeLessThan(Double value) {
            addCriterion("ep_other_traffic_fee <", value, "epOtherTrafficFee");
            return (Criteria) this;
        }

        public Criteria andEpOtherTrafficFeeLessThanOrEqualTo(Double value) {
            addCriterion("ep_other_traffic_fee <=", value, "epOtherTrafficFee");
            return (Criteria) this;
        }

        public Criteria andEpOtherTrafficFeeIn(List<Double> values) {
            addCriterion("ep_other_traffic_fee in", values, "epOtherTrafficFee");
            return (Criteria) this;
        }

        public Criteria andEpOtherTrafficFeeNotIn(List<Double> values) {
            addCriterion("ep_other_traffic_fee not in", values, "epOtherTrafficFee");
            return (Criteria) this;
        }

        public Criteria andEpOtherTrafficFeeBetween(Double value1, Double value2) {
            addCriterion("ep_other_traffic_fee between", value1, value2, "epOtherTrafficFee");
            return (Criteria) this;
        }

        public Criteria andEpOtherTrafficFeeNotBetween(Double value1, Double value2) {
            addCriterion("ep_other_traffic_fee not between", value1, value2, "epOtherTrafficFee");
            return (Criteria) this;
        }

        public Criteria andEpHotelCostIsNull() {
            addCriterion("ep_hotel_cost is null");
            return (Criteria) this;
        }

        public Criteria andEpHotelCostIsNotNull() {
            addCriterion("ep_hotel_cost is not null");
            return (Criteria) this;
        }

        public Criteria andEpHotelCostEqualTo(Double value) {
            addCriterion("ep_hotel_cost =", value, "epHotelCost");
            return (Criteria) this;
        }

        public Criteria andEpHotelCostNotEqualTo(Double value) {
            addCriterion("ep_hotel_cost <>", value, "epHotelCost");
            return (Criteria) this;
        }

        public Criteria andEpHotelCostGreaterThan(Double value) {
            addCriterion("ep_hotel_cost >", value, "epHotelCost");
            return (Criteria) this;
        }

        public Criteria andEpHotelCostGreaterThanOrEqualTo(Double value) {
            addCriterion("ep_hotel_cost >=", value, "epHotelCost");
            return (Criteria) this;
        }

        public Criteria andEpHotelCostLessThan(Double value) {
            addCriterion("ep_hotel_cost <", value, "epHotelCost");
            return (Criteria) this;
        }

        public Criteria andEpHotelCostLessThanOrEqualTo(Double value) {
            addCriterion("ep_hotel_cost <=", value, "epHotelCost");
            return (Criteria) this;
        }

        public Criteria andEpHotelCostIn(List<Double> values) {
            addCriterion("ep_hotel_cost in", values, "epHotelCost");
            return (Criteria) this;
        }

        public Criteria andEpHotelCostNotIn(List<Double> values) {
            addCriterion("ep_hotel_cost not in", values, "epHotelCost");
            return (Criteria) this;
        }

        public Criteria andEpHotelCostBetween(Double value1, Double value2) {
            addCriterion("ep_hotel_cost between", value1, value2, "epHotelCost");
            return (Criteria) this;
        }

        public Criteria andEpHotelCostNotBetween(Double value1, Double value2) {
            addCriterion("ep_hotel_cost not between", value1, value2, "epHotelCost");
            return (Criteria) this;
        }

        public Criteria andEpFoodAllowanceIsNull() {
            addCriterion("ep_food_allowance is null");
            return (Criteria) this;
        }

        public Criteria andEpFoodAllowanceIsNotNull() {
            addCriterion("ep_food_allowance is not null");
            return (Criteria) this;
        }

        public Criteria andEpFoodAllowanceEqualTo(Double value) {
            addCriterion("ep_food_allowance =", value, "epFoodAllowance");
            return (Criteria) this;
        }

        public Criteria andEpFoodAllowanceNotEqualTo(Double value) {
            addCriterion("ep_food_allowance <>", value, "epFoodAllowance");
            return (Criteria) this;
        }

        public Criteria andEpFoodAllowanceGreaterThan(Double value) {
            addCriterion("ep_food_allowance >", value, "epFoodAllowance");
            return (Criteria) this;
        }

        public Criteria andEpFoodAllowanceGreaterThanOrEqualTo(Double value) {
            addCriterion("ep_food_allowance >=", value, "epFoodAllowance");
            return (Criteria) this;
        }

        public Criteria andEpFoodAllowanceLessThan(Double value) {
            addCriterion("ep_food_allowance <", value, "epFoodAllowance");
            return (Criteria) this;
        }

        public Criteria andEpFoodAllowanceLessThanOrEqualTo(Double value) {
            addCriterion("ep_food_allowance <=", value, "epFoodAllowance");
            return (Criteria) this;
        }

        public Criteria andEpFoodAllowanceIn(List<Double> values) {
            addCriterion("ep_food_allowance in", values, "epFoodAllowance");
            return (Criteria) this;
        }

        public Criteria andEpFoodAllowanceNotIn(List<Double> values) {
            addCriterion("ep_food_allowance not in", values, "epFoodAllowance");
            return (Criteria) this;
        }

        public Criteria andEpFoodAllowanceBetween(Double value1, Double value2) {
            addCriterion("ep_food_allowance between", value1, value2, "epFoodAllowance");
            return (Criteria) this;
        }

        public Criteria andEpFoodAllowanceNotBetween(Double value1, Double value2) {
            addCriterion("ep_food_allowance not between", value1, value2, "epFoodAllowance");
            return (Criteria) this;
        }

        public Criteria andEpPublicFeesIsNull() {
            addCriterion("ep_public_fees is null");
            return (Criteria) this;
        }

        public Criteria andEpPublicFeesIsNotNull() {
            addCriterion("ep_public_fees is not null");
            return (Criteria) this;
        }

        public Criteria andEpPublicFeesEqualTo(Double value) {
            addCriterion("ep_public_fees =", value, "epPublicFees");
            return (Criteria) this;
        }

        public Criteria andEpPublicFeesNotEqualTo(Double value) {
            addCriterion("ep_public_fees <>", value, "epPublicFees");
            return (Criteria) this;
        }

        public Criteria andEpPublicFeesGreaterThan(Double value) {
            addCriterion("ep_public_fees >", value, "epPublicFees");
            return (Criteria) this;
        }

        public Criteria andEpPublicFeesGreaterThanOrEqualTo(Double value) {
            addCriterion("ep_public_fees >=", value, "epPublicFees");
            return (Criteria) this;
        }

        public Criteria andEpPublicFeesLessThan(Double value) {
            addCriterion("ep_public_fees <", value, "epPublicFees");
            return (Criteria) this;
        }

        public Criteria andEpPublicFeesLessThanOrEqualTo(Double value) {
            addCriterion("ep_public_fees <=", value, "epPublicFees");
            return (Criteria) this;
        }

        public Criteria andEpPublicFeesIn(List<Double> values) {
            addCriterion("ep_public_fees in", values, "epPublicFees");
            return (Criteria) this;
        }

        public Criteria andEpPublicFeesNotIn(List<Double> values) {
            addCriterion("ep_public_fees not in", values, "epPublicFees");
            return (Criteria) this;
        }

        public Criteria andEpPublicFeesBetween(Double value1, Double value2) {
            addCriterion("ep_public_fees between", value1, value2, "epPublicFees");
            return (Criteria) this;
        }

        public Criteria andEpPublicFeesNotBetween(Double value1, Double value2) {
            addCriterion("ep_public_fees not between", value1, value2, "epPublicFees");
            return (Criteria) this;
        }

        public Criteria andEpOtherIsNull() {
            addCriterion("ep_other is null");
            return (Criteria) this;
        }

        public Criteria andEpOtherIsNotNull() {
            addCriterion("ep_other is not null");
            return (Criteria) this;
        }

        public Criteria andEpOtherEqualTo(Double value) {
            addCriterion("ep_other =", value, "epOther");
            return (Criteria) this;
        }

        public Criteria andEpOtherNotEqualTo(Double value) {
            addCriterion("ep_other <>", value, "epOther");
            return (Criteria) this;
        }

        public Criteria andEpOtherGreaterThan(Double value) {
            addCriterion("ep_other >", value, "epOther");
            return (Criteria) this;
        }

        public Criteria andEpOtherGreaterThanOrEqualTo(Double value) {
            addCriterion("ep_other >=", value, "epOther");
            return (Criteria) this;
        }

        public Criteria andEpOtherLessThan(Double value) {
            addCriterion("ep_other <", value, "epOther");
            return (Criteria) this;
        }

        public Criteria andEpOtherLessThanOrEqualTo(Double value) {
            addCriterion("ep_other <=", value, "epOther");
            return (Criteria) this;
        }

        public Criteria andEpOtherIn(List<Double> values) {
            addCriterion("ep_other in", values, "epOther");
            return (Criteria) this;
        }

        public Criteria andEpOtherNotIn(List<Double> values) {
            addCriterion("ep_other not in", values, "epOther");
            return (Criteria) this;
        }

        public Criteria andEpOtherBetween(Double value1, Double value2) {
            addCriterion("ep_other between", value1, value2, "epOther");
            return (Criteria) this;
        }

        public Criteria andEpOtherNotBetween(Double value1, Double value2) {
            addCriterion("ep_other not between", value1, value2, "epOther");
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