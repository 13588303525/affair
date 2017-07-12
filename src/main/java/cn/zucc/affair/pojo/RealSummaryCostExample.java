package cn.zucc.affair.pojo;

import java.util.ArrayList;
import java.util.List;

public class RealSummaryCostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RealSummaryCostExample() {
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

        public Criteria andRsIdIsNull() {
            addCriterion("rs_id is null");
            return (Criteria) this;
        }

        public Criteria andRsIdIsNotNull() {
            addCriterion("rs_id is not null");
            return (Criteria) this;
        }

        public Criteria andRsIdEqualTo(Integer value) {
            addCriterion("rs_id =", value, "rsId");
            return (Criteria) this;
        }

        public Criteria andRsIdNotEqualTo(Integer value) {
            addCriterion("rs_id <>", value, "rsId");
            return (Criteria) this;
        }

        public Criteria andRsIdGreaterThan(Integer value) {
            addCriterion("rs_id >", value, "rsId");
            return (Criteria) this;
        }

        public Criteria andRsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rs_id >=", value, "rsId");
            return (Criteria) this;
        }

        public Criteria andRsIdLessThan(Integer value) {
            addCriterion("rs_id <", value, "rsId");
            return (Criteria) this;
        }

        public Criteria andRsIdLessThanOrEqualTo(Integer value) {
            addCriterion("rs_id <=", value, "rsId");
            return (Criteria) this;
        }

        public Criteria andRsIdIn(List<Integer> values) {
            addCriterion("rs_id in", values, "rsId");
            return (Criteria) this;
        }

        public Criteria andRsIdNotIn(List<Integer> values) {
            addCriterion("rs_id not in", values, "rsId");
            return (Criteria) this;
        }

        public Criteria andRsIdBetween(Integer value1, Integer value2) {
            addCriterion("rs_id between", value1, value2, "rsId");
            return (Criteria) this;
        }

        public Criteria andRsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rs_id not between", value1, value2, "rsId");
            return (Criteria) this;
        }

        public Criteria andRsFacilityIsNull() {
            addCriterion("rs_facility is null");
            return (Criteria) this;
        }

        public Criteria andRsFacilityIsNotNull() {
            addCriterion("rs_facility is not null");
            return (Criteria) this;
        }

        public Criteria andRsFacilityEqualTo(Double value) {
            addCriterion("rs_facility =", value, "rsFacility");
            return (Criteria) this;
        }

        public Criteria andRsFacilityNotEqualTo(Double value) {
            addCriterion("rs_facility <>", value, "rsFacility");
            return (Criteria) this;
        }

        public Criteria andRsFacilityGreaterThan(Double value) {
            addCriterion("rs_facility >", value, "rsFacility");
            return (Criteria) this;
        }

        public Criteria andRsFacilityGreaterThanOrEqualTo(Double value) {
            addCriterion("rs_facility >=", value, "rsFacility");
            return (Criteria) this;
        }

        public Criteria andRsFacilityLessThan(Double value) {
            addCriterion("rs_facility <", value, "rsFacility");
            return (Criteria) this;
        }

        public Criteria andRsFacilityLessThanOrEqualTo(Double value) {
            addCriterion("rs_facility <=", value, "rsFacility");
            return (Criteria) this;
        }

        public Criteria andRsFacilityIn(List<Double> values) {
            addCriterion("rs_facility in", values, "rsFacility");
            return (Criteria) this;
        }

        public Criteria andRsFacilityNotIn(List<Double> values) {
            addCriterion("rs_facility not in", values, "rsFacility");
            return (Criteria) this;
        }

        public Criteria andRsFacilityBetween(Double value1, Double value2) {
            addCriterion("rs_facility between", value1, value2, "rsFacility");
            return (Criteria) this;
        }

        public Criteria andRsFacilityNotBetween(Double value1, Double value2) {
            addCriterion("rs_facility not between", value1, value2, "rsFacility");
            return (Criteria) this;
        }

        public Criteria andRsMaterialIsNull() {
            addCriterion("rs_material is null");
            return (Criteria) this;
        }

        public Criteria andRsMaterialIsNotNull() {
            addCriterion("rs_material is not null");
            return (Criteria) this;
        }

        public Criteria andRsMaterialEqualTo(Double value) {
            addCriterion("rs_material =", value, "rsMaterial");
            return (Criteria) this;
        }

        public Criteria andRsMaterialNotEqualTo(Double value) {
            addCriterion("rs_material <>", value, "rsMaterial");
            return (Criteria) this;
        }

        public Criteria andRsMaterialGreaterThan(Double value) {
            addCriterion("rs_material >", value, "rsMaterial");
            return (Criteria) this;
        }

        public Criteria andRsMaterialGreaterThanOrEqualTo(Double value) {
            addCriterion("rs_material >=", value, "rsMaterial");
            return (Criteria) this;
        }

        public Criteria andRsMaterialLessThan(Double value) {
            addCriterion("rs_material <", value, "rsMaterial");
            return (Criteria) this;
        }

        public Criteria andRsMaterialLessThanOrEqualTo(Double value) {
            addCriterion("rs_material <=", value, "rsMaterial");
            return (Criteria) this;
        }

        public Criteria andRsMaterialIn(List<Double> values) {
            addCriterion("rs_material in", values, "rsMaterial");
            return (Criteria) this;
        }

        public Criteria andRsMaterialNotIn(List<Double> values) {
            addCriterion("rs_material not in", values, "rsMaterial");
            return (Criteria) this;
        }

        public Criteria andRsMaterialBetween(Double value1, Double value2) {
            addCriterion("rs_material between", value1, value2, "rsMaterial");
            return (Criteria) this;
        }

        public Criteria andRsMaterialNotBetween(Double value1, Double value2) {
            addCriterion("rs_material not between", value1, value2, "rsMaterial");
            return (Criteria) this;
        }

        public Criteria andRsTravelCostIsNull() {
            addCriterion("rs_travel_cost is null");
            return (Criteria) this;
        }

        public Criteria andRsTravelCostIsNotNull() {
            addCriterion("rs_travel_cost is not null");
            return (Criteria) this;
        }

        public Criteria andRsTravelCostEqualTo(Double value) {
            addCriterion("rs_travel_cost =", value, "rsTravelCost");
            return (Criteria) this;
        }

        public Criteria andRsTravelCostNotEqualTo(Double value) {
            addCriterion("rs_travel_cost <>", value, "rsTravelCost");
            return (Criteria) this;
        }

        public Criteria andRsTravelCostGreaterThan(Double value) {
            addCriterion("rs_travel_cost >", value, "rsTravelCost");
            return (Criteria) this;
        }

        public Criteria andRsTravelCostGreaterThanOrEqualTo(Double value) {
            addCriterion("rs_travel_cost >=", value, "rsTravelCost");
            return (Criteria) this;
        }

        public Criteria andRsTravelCostLessThan(Double value) {
            addCriterion("rs_travel_cost <", value, "rsTravelCost");
            return (Criteria) this;
        }

        public Criteria andRsTravelCostLessThanOrEqualTo(Double value) {
            addCriterion("rs_travel_cost <=", value, "rsTravelCost");
            return (Criteria) this;
        }

        public Criteria andRsTravelCostIn(List<Double> values) {
            addCriterion("rs_travel_cost in", values, "rsTravelCost");
            return (Criteria) this;
        }

        public Criteria andRsTravelCostNotIn(List<Double> values) {
            addCriterion("rs_travel_cost not in", values, "rsTravelCost");
            return (Criteria) this;
        }

        public Criteria andRsTravelCostBetween(Double value1, Double value2) {
            addCriterion("rs_travel_cost between", value1, value2, "rsTravelCost");
            return (Criteria) this;
        }

        public Criteria andRsTravelCostNotBetween(Double value1, Double value2) {
            addCriterion("rs_travel_cost not between", value1, value2, "rsTravelCost");
            return (Criteria) this;
        }

        public Criteria andRsLabourServiceIsNull() {
            addCriterion("rs_labour_service is null");
            return (Criteria) this;
        }

        public Criteria andRsLabourServiceIsNotNull() {
            addCriterion("rs_labour_service is not null");
            return (Criteria) this;
        }

        public Criteria andRsLabourServiceEqualTo(Double value) {
            addCriterion("rs_labour_service =", value, "rsLabourService");
            return (Criteria) this;
        }

        public Criteria andRsLabourServiceNotEqualTo(Double value) {
            addCriterion("rs_labour_service <>", value, "rsLabourService");
            return (Criteria) this;
        }

        public Criteria andRsLabourServiceGreaterThan(Double value) {
            addCriterion("rs_labour_service >", value, "rsLabourService");
            return (Criteria) this;
        }

        public Criteria andRsLabourServiceGreaterThanOrEqualTo(Double value) {
            addCriterion("rs_labour_service >=", value, "rsLabourService");
            return (Criteria) this;
        }

        public Criteria andRsLabourServiceLessThan(Double value) {
            addCriterion("rs_labour_service <", value, "rsLabourService");
            return (Criteria) this;
        }

        public Criteria andRsLabourServiceLessThanOrEqualTo(Double value) {
            addCriterion("rs_labour_service <=", value, "rsLabourService");
            return (Criteria) this;
        }

        public Criteria andRsLabourServiceIn(List<Double> values) {
            addCriterion("rs_labour_service in", values, "rsLabourService");
            return (Criteria) this;
        }

        public Criteria andRsLabourServiceNotIn(List<Double> values) {
            addCriterion("rs_labour_service not in", values, "rsLabourService");
            return (Criteria) this;
        }

        public Criteria andRsLabourServiceBetween(Double value1, Double value2) {
            addCriterion("rs_labour_service between", value1, value2, "rsLabourService");
            return (Criteria) this;
        }

        public Criteria andRsLabourServiceNotBetween(Double value1, Double value2) {
            addCriterion("rs_labour_service not between", value1, value2, "rsLabourService");
            return (Criteria) this;
        }

        public Criteria andRsMeetingFeeIsNull() {
            addCriterion("rs_meeting_fee is null");
            return (Criteria) this;
        }

        public Criteria andRsMeetingFeeIsNotNull() {
            addCriterion("rs_meeting_fee is not null");
            return (Criteria) this;
        }

        public Criteria andRsMeetingFeeEqualTo(Double value) {
            addCriterion("rs_meeting_fee =", value, "rsMeetingFee");
            return (Criteria) this;
        }

        public Criteria andRsMeetingFeeNotEqualTo(Double value) {
            addCriterion("rs_meeting_fee <>", value, "rsMeetingFee");
            return (Criteria) this;
        }

        public Criteria andRsMeetingFeeGreaterThan(Double value) {
            addCriterion("rs_meeting_fee >", value, "rsMeetingFee");
            return (Criteria) this;
        }

        public Criteria andRsMeetingFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("rs_meeting_fee >=", value, "rsMeetingFee");
            return (Criteria) this;
        }

        public Criteria andRsMeetingFeeLessThan(Double value) {
            addCriterion("rs_meeting_fee <", value, "rsMeetingFee");
            return (Criteria) this;
        }

        public Criteria andRsMeetingFeeLessThanOrEqualTo(Double value) {
            addCriterion("rs_meeting_fee <=", value, "rsMeetingFee");
            return (Criteria) this;
        }

        public Criteria andRsMeetingFeeIn(List<Double> values) {
            addCriterion("rs_meeting_fee in", values, "rsMeetingFee");
            return (Criteria) this;
        }

        public Criteria andRsMeetingFeeNotIn(List<Double> values) {
            addCriterion("rs_meeting_fee not in", values, "rsMeetingFee");
            return (Criteria) this;
        }

        public Criteria andRsMeetingFeeBetween(Double value1, Double value2) {
            addCriterion("rs_meeting_fee between", value1, value2, "rsMeetingFee");
            return (Criteria) this;
        }

        public Criteria andRsMeetingFeeNotBetween(Double value1, Double value2) {
            addCriterion("rs_meeting_fee not between", value1, value2, "rsMeetingFee");
            return (Criteria) this;
        }

        public Criteria andRsSpurFeeIsNull() {
            addCriterion("rs_spur_fee is null");
            return (Criteria) this;
        }

        public Criteria andRsSpurFeeIsNotNull() {
            addCriterion("rs_spur_fee is not null");
            return (Criteria) this;
        }

        public Criteria andRsSpurFeeEqualTo(Double value) {
            addCriterion("rs_spur_fee =", value, "rsSpurFee");
            return (Criteria) this;
        }

        public Criteria andRsSpurFeeNotEqualTo(Double value) {
            addCriterion("rs_spur_fee <>", value, "rsSpurFee");
            return (Criteria) this;
        }

        public Criteria andRsSpurFeeGreaterThan(Double value) {
            addCriterion("rs_spur_fee >", value, "rsSpurFee");
            return (Criteria) this;
        }

        public Criteria andRsSpurFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("rs_spur_fee >=", value, "rsSpurFee");
            return (Criteria) this;
        }

        public Criteria andRsSpurFeeLessThan(Double value) {
            addCriterion("rs_spur_fee <", value, "rsSpurFee");
            return (Criteria) this;
        }

        public Criteria andRsSpurFeeLessThanOrEqualTo(Double value) {
            addCriterion("rs_spur_fee <=", value, "rsSpurFee");
            return (Criteria) this;
        }

        public Criteria andRsSpurFeeIn(List<Double> values) {
            addCriterion("rs_spur_fee in", values, "rsSpurFee");
            return (Criteria) this;
        }

        public Criteria andRsSpurFeeNotIn(List<Double> values) {
            addCriterion("rs_spur_fee not in", values, "rsSpurFee");
            return (Criteria) this;
        }

        public Criteria andRsSpurFeeBetween(Double value1, Double value2) {
            addCriterion("rs_spur_fee between", value1, value2, "rsSpurFee");
            return (Criteria) this;
        }

        public Criteria andRsSpurFeeNotBetween(Double value1, Double value2) {
            addCriterion("rs_spur_fee not between", value1, value2, "rsSpurFee");
            return (Criteria) this;
        }

        public Criteria andRsTestProcessingFeeIsNull() {
            addCriterion("rs_test_processing_fee is null");
            return (Criteria) this;
        }

        public Criteria andRsTestProcessingFeeIsNotNull() {
            addCriterion("rs_test_processing_fee is not null");
            return (Criteria) this;
        }

        public Criteria andRsTestProcessingFeeEqualTo(Double value) {
            addCriterion("rs_test_processing_fee =", value, "rsTestProcessingFee");
            return (Criteria) this;
        }

        public Criteria andRsTestProcessingFeeNotEqualTo(Double value) {
            addCriterion("rs_test_processing_fee <>", value, "rsTestProcessingFee");
            return (Criteria) this;
        }

        public Criteria andRsTestProcessingFeeGreaterThan(Double value) {
            addCriterion("rs_test_processing_fee >", value, "rsTestProcessingFee");
            return (Criteria) this;
        }

        public Criteria andRsTestProcessingFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("rs_test_processing_fee >=", value, "rsTestProcessingFee");
            return (Criteria) this;
        }

        public Criteria andRsTestProcessingFeeLessThan(Double value) {
            addCriterion("rs_test_processing_fee <", value, "rsTestProcessingFee");
            return (Criteria) this;
        }

        public Criteria andRsTestProcessingFeeLessThanOrEqualTo(Double value) {
            addCriterion("rs_test_processing_fee <=", value, "rsTestProcessingFee");
            return (Criteria) this;
        }

        public Criteria andRsTestProcessingFeeIn(List<Double> values) {
            addCriterion("rs_test_processing_fee in", values, "rsTestProcessingFee");
            return (Criteria) this;
        }

        public Criteria andRsTestProcessingFeeNotIn(List<Double> values) {
            addCriterion("rs_test_processing_fee not in", values, "rsTestProcessingFee");
            return (Criteria) this;
        }

        public Criteria andRsTestProcessingFeeBetween(Double value1, Double value2) {
            addCriterion("rs_test_processing_fee between", value1, value2, "rsTestProcessingFee");
            return (Criteria) this;
        }

        public Criteria andRsTestProcessingFeeNotBetween(Double value1, Double value2) {
            addCriterion("rs_test_processing_fee not between", value1, value2, "rsTestProcessingFee");
            return (Criteria) this;
        }

        public Criteria andRsFuelPowerFeeIsNull() {
            addCriterion("rs_fuel_power_fee is null");
            return (Criteria) this;
        }

        public Criteria andRsFuelPowerFeeIsNotNull() {
            addCriterion("rs_fuel_power_fee is not null");
            return (Criteria) this;
        }

        public Criteria andRsFuelPowerFeeEqualTo(Double value) {
            addCriterion("rs_fuel_power_fee =", value, "rsFuelPowerFee");
            return (Criteria) this;
        }

        public Criteria andRsFuelPowerFeeNotEqualTo(Double value) {
            addCriterion("rs_fuel_power_fee <>", value, "rsFuelPowerFee");
            return (Criteria) this;
        }

        public Criteria andRsFuelPowerFeeGreaterThan(Double value) {
            addCriterion("rs_fuel_power_fee >", value, "rsFuelPowerFee");
            return (Criteria) this;
        }

        public Criteria andRsFuelPowerFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("rs_fuel_power_fee >=", value, "rsFuelPowerFee");
            return (Criteria) this;
        }

        public Criteria andRsFuelPowerFeeLessThan(Double value) {
            addCriterion("rs_fuel_power_fee <", value, "rsFuelPowerFee");
            return (Criteria) this;
        }

        public Criteria andRsFuelPowerFeeLessThanOrEqualTo(Double value) {
            addCriterion("rs_fuel_power_fee <=", value, "rsFuelPowerFee");
            return (Criteria) this;
        }

        public Criteria andRsFuelPowerFeeIn(List<Double> values) {
            addCriterion("rs_fuel_power_fee in", values, "rsFuelPowerFee");
            return (Criteria) this;
        }

        public Criteria andRsFuelPowerFeeNotIn(List<Double> values) {
            addCriterion("rs_fuel_power_fee not in", values, "rsFuelPowerFee");
            return (Criteria) this;
        }

        public Criteria andRsFuelPowerFeeBetween(Double value1, Double value2) {
            addCriterion("rs_fuel_power_fee between", value1, value2, "rsFuelPowerFee");
            return (Criteria) this;
        }

        public Criteria andRsFuelPowerFeeNotBetween(Double value1, Double value2) {
            addCriterion("rs_fuel_power_fee not between", value1, value2, "rsFuelPowerFee");
            return (Criteria) this;
        }

        public Criteria andRsManagmentFeeIsNull() {
            addCriterion("rs_managment_fee is null");
            return (Criteria) this;
        }

        public Criteria andRsManagmentFeeIsNotNull() {
            addCriterion("rs_managment_fee is not null");
            return (Criteria) this;
        }

        public Criteria andRsManagmentFeeEqualTo(Double value) {
            addCriterion("rs_managment_fee =", value, "rsManagmentFee");
            return (Criteria) this;
        }

        public Criteria andRsManagmentFeeNotEqualTo(Double value) {
            addCriterion("rs_managment_fee <>", value, "rsManagmentFee");
            return (Criteria) this;
        }

        public Criteria andRsManagmentFeeGreaterThan(Double value) {
            addCriterion("rs_managment_fee >", value, "rsManagmentFee");
            return (Criteria) this;
        }

        public Criteria andRsManagmentFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("rs_managment_fee >=", value, "rsManagmentFee");
            return (Criteria) this;
        }

        public Criteria andRsManagmentFeeLessThan(Double value) {
            addCriterion("rs_managment_fee <", value, "rsManagmentFee");
            return (Criteria) this;
        }

        public Criteria andRsManagmentFeeLessThanOrEqualTo(Double value) {
            addCriterion("rs_managment_fee <=", value, "rsManagmentFee");
            return (Criteria) this;
        }

        public Criteria andRsManagmentFeeIn(List<Double> values) {
            addCriterion("rs_managment_fee in", values, "rsManagmentFee");
            return (Criteria) this;
        }

        public Criteria andRsManagmentFeeNotIn(List<Double> values) {
            addCriterion("rs_managment_fee not in", values, "rsManagmentFee");
            return (Criteria) this;
        }

        public Criteria andRsManagmentFeeBetween(Double value1, Double value2) {
            addCriterion("rs_managment_fee between", value1, value2, "rsManagmentFee");
            return (Criteria) this;
        }

        public Criteria andRsManagmentFeeNotBetween(Double value1, Double value2) {
            addCriterion("rs_managment_fee not between", value1, value2, "rsManagmentFee");
            return (Criteria) this;
        }

        public Criteria andRsCooperationFeeIsNull() {
            addCriterion("rs_cooperation_fee is null");
            return (Criteria) this;
        }

        public Criteria andRsCooperationFeeIsNotNull() {
            addCriterion("rs_cooperation_fee is not null");
            return (Criteria) this;
        }

        public Criteria andRsCooperationFeeEqualTo(Double value) {
            addCriterion("rs_cooperation_fee =", value, "rsCooperationFee");
            return (Criteria) this;
        }

        public Criteria andRsCooperationFeeNotEqualTo(Double value) {
            addCriterion("rs_cooperation_fee <>", value, "rsCooperationFee");
            return (Criteria) this;
        }

        public Criteria andRsCooperationFeeGreaterThan(Double value) {
            addCriterion("rs_cooperation_fee >", value, "rsCooperationFee");
            return (Criteria) this;
        }

        public Criteria andRsCooperationFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("rs_cooperation_fee >=", value, "rsCooperationFee");
            return (Criteria) this;
        }

        public Criteria andRsCooperationFeeLessThan(Double value) {
            addCriterion("rs_cooperation_fee <", value, "rsCooperationFee");
            return (Criteria) this;
        }

        public Criteria andRsCooperationFeeLessThanOrEqualTo(Double value) {
            addCriterion("rs_cooperation_fee <=", value, "rsCooperationFee");
            return (Criteria) this;
        }

        public Criteria andRsCooperationFeeIn(List<Double> values) {
            addCriterion("rs_cooperation_fee in", values, "rsCooperationFee");
            return (Criteria) this;
        }

        public Criteria andRsCooperationFeeNotIn(List<Double> values) {
            addCriterion("rs_cooperation_fee not in", values, "rsCooperationFee");
            return (Criteria) this;
        }

        public Criteria andRsCooperationFeeBetween(Double value1, Double value2) {
            addCriterion("rs_cooperation_fee between", value1, value2, "rsCooperationFee");
            return (Criteria) this;
        }

        public Criteria andRsCooperationFeeNotBetween(Double value1, Double value2) {
            addCriterion("rs_cooperation_fee not between", value1, value2, "rsCooperationFee");
            return (Criteria) this;
        }

        public Criteria andRsPublishFeeIsNull() {
            addCriterion("rs_publish_fee is null");
            return (Criteria) this;
        }

        public Criteria andRsPublishFeeIsNotNull() {
            addCriterion("rs_publish_fee is not null");
            return (Criteria) this;
        }

        public Criteria andRsPublishFeeEqualTo(Double value) {
            addCriterion("rs_publish_fee =", value, "rsPublishFee");
            return (Criteria) this;
        }

        public Criteria andRsPublishFeeNotEqualTo(Double value) {
            addCriterion("rs_publish_fee <>", value, "rsPublishFee");
            return (Criteria) this;
        }

        public Criteria andRsPublishFeeGreaterThan(Double value) {
            addCriterion("rs_publish_fee >", value, "rsPublishFee");
            return (Criteria) this;
        }

        public Criteria andRsPublishFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("rs_publish_fee >=", value, "rsPublishFee");
            return (Criteria) this;
        }

        public Criteria andRsPublishFeeLessThan(Double value) {
            addCriterion("rs_publish_fee <", value, "rsPublishFee");
            return (Criteria) this;
        }

        public Criteria andRsPublishFeeLessThanOrEqualTo(Double value) {
            addCriterion("rs_publish_fee <=", value, "rsPublishFee");
            return (Criteria) this;
        }

        public Criteria andRsPublishFeeIn(List<Double> values) {
            addCriterion("rs_publish_fee in", values, "rsPublishFee");
            return (Criteria) this;
        }

        public Criteria andRsPublishFeeNotIn(List<Double> values) {
            addCriterion("rs_publish_fee not in", values, "rsPublishFee");
            return (Criteria) this;
        }

        public Criteria andRsPublishFeeBetween(Double value1, Double value2) {
            addCriterion("rs_publish_fee between", value1, value2, "rsPublishFee");
            return (Criteria) this;
        }

        public Criteria andRsPublishFeeNotBetween(Double value1, Double value2) {
            addCriterion("rs_publish_fee not between", value1, value2, "rsPublishFee");
            return (Criteria) this;
        }

        public Criteria andRsExpertConsultationIsNull() {
            addCriterion("rs_expert_consultation is null");
            return (Criteria) this;
        }

        public Criteria andRsExpertConsultationIsNotNull() {
            addCriterion("rs_expert_consultation is not null");
            return (Criteria) this;
        }

        public Criteria andRsExpertConsultationEqualTo(Double value) {
            addCriterion("rs_expert_consultation =", value, "rsExpertConsultation");
            return (Criteria) this;
        }

        public Criteria andRsExpertConsultationNotEqualTo(Double value) {
            addCriterion("rs_expert_consultation <>", value, "rsExpertConsultation");
            return (Criteria) this;
        }

        public Criteria andRsExpertConsultationGreaterThan(Double value) {
            addCriterion("rs_expert_consultation >", value, "rsExpertConsultation");
            return (Criteria) this;
        }

        public Criteria andRsExpertConsultationGreaterThanOrEqualTo(Double value) {
            addCriterion("rs_expert_consultation >=", value, "rsExpertConsultation");
            return (Criteria) this;
        }

        public Criteria andRsExpertConsultationLessThan(Double value) {
            addCriterion("rs_expert_consultation <", value, "rsExpertConsultation");
            return (Criteria) this;
        }

        public Criteria andRsExpertConsultationLessThanOrEqualTo(Double value) {
            addCriterion("rs_expert_consultation <=", value, "rsExpertConsultation");
            return (Criteria) this;
        }

        public Criteria andRsExpertConsultationIn(List<Double> values) {
            addCriterion("rs_expert_consultation in", values, "rsExpertConsultation");
            return (Criteria) this;
        }

        public Criteria andRsExpertConsultationNotIn(List<Double> values) {
            addCriterion("rs_expert_consultation not in", values, "rsExpertConsultation");
            return (Criteria) this;
        }

        public Criteria andRsExpertConsultationBetween(Double value1, Double value2) {
            addCriterion("rs_expert_consultation between", value1, value2, "rsExpertConsultation");
            return (Criteria) this;
        }

        public Criteria andRsExpertConsultationNotBetween(Double value1, Double value2) {
            addCriterion("rs_expert_consultation not between", value1, value2, "rsExpertConsultation");
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