package cn.zucc.affair.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProgramTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProgramTypeExample() {
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

        public Criteria andPgTypeNameIsNull() {
            addCriterion("pg_type_name is null");
            return (Criteria) this;
        }

        public Criteria andPgTypeNameIsNotNull() {
            addCriterion("pg_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andPgTypeNameEqualTo(String value) {
            addCriterion("pg_type_name =", value, "pgTypeName");
            return (Criteria) this;
        }

        public Criteria andPgTypeNameNotEqualTo(String value) {
            addCriterion("pg_type_name <>", value, "pgTypeName");
            return (Criteria) this;
        }

        public Criteria andPgTypeNameGreaterThan(String value) {
            addCriterion("pg_type_name >", value, "pgTypeName");
            return (Criteria) this;
        }

        public Criteria andPgTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("pg_type_name >=", value, "pgTypeName");
            return (Criteria) this;
        }

        public Criteria andPgTypeNameLessThan(String value) {
            addCriterion("pg_type_name <", value, "pgTypeName");
            return (Criteria) this;
        }

        public Criteria andPgTypeNameLessThanOrEqualTo(String value) {
            addCriterion("pg_type_name <=", value, "pgTypeName");
            return (Criteria) this;
        }

        public Criteria andPgTypeNameLike(String value) {
            addCriterion("pg_type_name like", value, "pgTypeName");
            return (Criteria) this;
        }

        public Criteria andPgTypeNameNotLike(String value) {
            addCriterion("pg_type_name not like", value, "pgTypeName");
            return (Criteria) this;
        }

        public Criteria andPgTypeNameIn(List<String> values) {
            addCriterion("pg_type_name in", values, "pgTypeName");
            return (Criteria) this;
        }

        public Criteria andPgTypeNameNotIn(List<String> values) {
            addCriterion("pg_type_name not in", values, "pgTypeName");
            return (Criteria) this;
        }

        public Criteria andPgTypeNameBetween(String value1, String value2) {
            addCriterion("pg_type_name between", value1, value2, "pgTypeName");
            return (Criteria) this;
        }

        public Criteria andPgTypeNameNotBetween(String value1, String value2) {
            addCriterion("pg_type_name not between", value1, value2, "pgTypeName");
            return (Criteria) this;
        }

        public Criteria andPtFacilityIsNull() {
            addCriterion("pt_facility is null");
            return (Criteria) this;
        }

        public Criteria andPtFacilityIsNotNull() {
            addCriterion("pt_facility is not null");
            return (Criteria) this;
        }

        public Criteria andPtFacilityEqualTo(Double value) {
            addCriterion("pt_facility =", value, "ptFacility");
            return (Criteria) this;
        }

        public Criteria andPtFacilityNotEqualTo(Double value) {
            addCriterion("pt_facility <>", value, "ptFacility");
            return (Criteria) this;
        }

        public Criteria andPtFacilityGreaterThan(Double value) {
            addCriterion("pt_facility >", value, "ptFacility");
            return (Criteria) this;
        }

        public Criteria andPtFacilityGreaterThanOrEqualTo(Double value) {
            addCriterion("pt_facility >=", value, "ptFacility");
            return (Criteria) this;
        }

        public Criteria andPtFacilityLessThan(Double value) {
            addCriterion("pt_facility <", value, "ptFacility");
            return (Criteria) this;
        }

        public Criteria andPtFacilityLessThanOrEqualTo(Double value) {
            addCriterion("pt_facility <=", value, "ptFacility");
            return (Criteria) this;
        }

        public Criteria andPtFacilityIn(List<Double> values) {
            addCriterion("pt_facility in", values, "ptFacility");
            return (Criteria) this;
        }

        public Criteria andPtFacilityNotIn(List<Double> values) {
            addCriterion("pt_facility not in", values, "ptFacility");
            return (Criteria) this;
        }

        public Criteria andPtFacilityBetween(Double value1, Double value2) {
            addCriterion("pt_facility between", value1, value2, "ptFacility");
            return (Criteria) this;
        }

        public Criteria andPtFacilityNotBetween(Double value1, Double value2) {
            addCriterion("pt_facility not between", value1, value2, "ptFacility");
            return (Criteria) this;
        }

        public Criteria andPtMaterialIsNull() {
            addCriterion("pt_material is null");
            return (Criteria) this;
        }

        public Criteria andPtMaterialIsNotNull() {
            addCriterion("pt_material is not null");
            return (Criteria) this;
        }

        public Criteria andPtMaterialEqualTo(Double value) {
            addCriterion("pt_material =", value, "ptMaterial");
            return (Criteria) this;
        }

        public Criteria andPtMaterialNotEqualTo(Double value) {
            addCriterion("pt_material <>", value, "ptMaterial");
            return (Criteria) this;
        }

        public Criteria andPtMaterialGreaterThan(Double value) {
            addCriterion("pt_material >", value, "ptMaterial");
            return (Criteria) this;
        }

        public Criteria andPtMaterialGreaterThanOrEqualTo(Double value) {
            addCriterion("pt_material >=", value, "ptMaterial");
            return (Criteria) this;
        }

        public Criteria andPtMaterialLessThan(Double value) {
            addCriterion("pt_material <", value, "ptMaterial");
            return (Criteria) this;
        }

        public Criteria andPtMaterialLessThanOrEqualTo(Double value) {
            addCriterion("pt_material <=", value, "ptMaterial");
            return (Criteria) this;
        }

        public Criteria andPtMaterialIn(List<Double> values) {
            addCriterion("pt_material in", values, "ptMaterial");
            return (Criteria) this;
        }

        public Criteria andPtMaterialNotIn(List<Double> values) {
            addCriterion("pt_material not in", values, "ptMaterial");
            return (Criteria) this;
        }

        public Criteria andPtMaterialBetween(Double value1, Double value2) {
            addCriterion("pt_material between", value1, value2, "ptMaterial");
            return (Criteria) this;
        }

        public Criteria andPtMaterialNotBetween(Double value1, Double value2) {
            addCriterion("pt_material not between", value1, value2, "ptMaterial");
            return (Criteria) this;
        }

        public Criteria andPtTravelCostIsNull() {
            addCriterion("pt_travel_cost is null");
            return (Criteria) this;
        }

        public Criteria andPtTravelCostIsNotNull() {
            addCriterion("pt_travel_cost is not null");
            return (Criteria) this;
        }

        public Criteria andPtTravelCostEqualTo(Double value) {
            addCriterion("pt_travel_cost =", value, "ptTravelCost");
            return (Criteria) this;
        }

        public Criteria andPtTravelCostNotEqualTo(Double value) {
            addCriterion("pt_travel_cost <>", value, "ptTravelCost");
            return (Criteria) this;
        }

        public Criteria andPtTravelCostGreaterThan(Double value) {
            addCriterion("pt_travel_cost >", value, "ptTravelCost");
            return (Criteria) this;
        }

        public Criteria andPtTravelCostGreaterThanOrEqualTo(Double value) {
            addCriterion("pt_travel_cost >=", value, "ptTravelCost");
            return (Criteria) this;
        }

        public Criteria andPtTravelCostLessThan(Double value) {
            addCriterion("pt_travel_cost <", value, "ptTravelCost");
            return (Criteria) this;
        }

        public Criteria andPtTravelCostLessThanOrEqualTo(Double value) {
            addCriterion("pt_travel_cost <=", value, "ptTravelCost");
            return (Criteria) this;
        }

        public Criteria andPtTravelCostIn(List<Double> values) {
            addCriterion("pt_travel_cost in", values, "ptTravelCost");
            return (Criteria) this;
        }

        public Criteria andPtTravelCostNotIn(List<Double> values) {
            addCriterion("pt_travel_cost not in", values, "ptTravelCost");
            return (Criteria) this;
        }

        public Criteria andPtTravelCostBetween(Double value1, Double value2) {
            addCriterion("pt_travel_cost between", value1, value2, "ptTravelCost");
            return (Criteria) this;
        }

        public Criteria andPtTravelCostNotBetween(Double value1, Double value2) {
            addCriterion("pt_travel_cost not between", value1, value2, "ptTravelCost");
            return (Criteria) this;
        }

        public Criteria andPtLabourServiceIsNull() {
            addCriterion("pt_labour_service is null");
            return (Criteria) this;
        }

        public Criteria andPtLabourServiceIsNotNull() {
            addCriterion("pt_labour_service is not null");
            return (Criteria) this;
        }

        public Criteria andPtLabourServiceEqualTo(Double value) {
            addCriterion("pt_labour_service =", value, "ptLabourService");
            return (Criteria) this;
        }

        public Criteria andPtLabourServiceNotEqualTo(Double value) {
            addCriterion("pt_labour_service <>", value, "ptLabourService");
            return (Criteria) this;
        }

        public Criteria andPtLabourServiceGreaterThan(Double value) {
            addCriterion("pt_labour_service >", value, "ptLabourService");
            return (Criteria) this;
        }

        public Criteria andPtLabourServiceGreaterThanOrEqualTo(Double value) {
            addCriterion("pt_labour_service >=", value, "ptLabourService");
            return (Criteria) this;
        }

        public Criteria andPtLabourServiceLessThan(Double value) {
            addCriterion("pt_labour_service <", value, "ptLabourService");
            return (Criteria) this;
        }

        public Criteria andPtLabourServiceLessThanOrEqualTo(Double value) {
            addCriterion("pt_labour_service <=", value, "ptLabourService");
            return (Criteria) this;
        }

        public Criteria andPtLabourServiceIn(List<Double> values) {
            addCriterion("pt_labour_service in", values, "ptLabourService");
            return (Criteria) this;
        }

        public Criteria andPtLabourServiceNotIn(List<Double> values) {
            addCriterion("pt_labour_service not in", values, "ptLabourService");
            return (Criteria) this;
        }

        public Criteria andPtLabourServiceBetween(Double value1, Double value2) {
            addCriterion("pt_labour_service between", value1, value2, "ptLabourService");
            return (Criteria) this;
        }

        public Criteria andPtLabourServiceNotBetween(Double value1, Double value2) {
            addCriterion("pt_labour_service not between", value1, value2, "ptLabourService");
            return (Criteria) this;
        }

        public Criteria andPtMeetingFeeIsNull() {
            addCriterion("pt_meeting_fee is null");
            return (Criteria) this;
        }

        public Criteria andPtMeetingFeeIsNotNull() {
            addCriterion("pt_meeting_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPtMeetingFeeEqualTo(Double value) {
            addCriterion("pt_meeting_fee =", value, "ptMeetingFee");
            return (Criteria) this;
        }

        public Criteria andPtMeetingFeeNotEqualTo(Double value) {
            addCriterion("pt_meeting_fee <>", value, "ptMeetingFee");
            return (Criteria) this;
        }

        public Criteria andPtMeetingFeeGreaterThan(Double value) {
            addCriterion("pt_meeting_fee >", value, "ptMeetingFee");
            return (Criteria) this;
        }

        public Criteria andPtMeetingFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("pt_meeting_fee >=", value, "ptMeetingFee");
            return (Criteria) this;
        }

        public Criteria andPtMeetingFeeLessThan(Double value) {
            addCriterion("pt_meeting_fee <", value, "ptMeetingFee");
            return (Criteria) this;
        }

        public Criteria andPtMeetingFeeLessThanOrEqualTo(Double value) {
            addCriterion("pt_meeting_fee <=", value, "ptMeetingFee");
            return (Criteria) this;
        }

        public Criteria andPtMeetingFeeIn(List<Double> values) {
            addCriterion("pt_meeting_fee in", values, "ptMeetingFee");
            return (Criteria) this;
        }

        public Criteria andPtMeetingFeeNotIn(List<Double> values) {
            addCriterion("pt_meeting_fee not in", values, "ptMeetingFee");
            return (Criteria) this;
        }

        public Criteria andPtMeetingFeeBetween(Double value1, Double value2) {
            addCriterion("pt_meeting_fee between", value1, value2, "ptMeetingFee");
            return (Criteria) this;
        }

        public Criteria andPtMeetingFeeNotBetween(Double value1, Double value2) {
            addCriterion("pt_meeting_fee not between", value1, value2, "ptMeetingFee");
            return (Criteria) this;
        }

        public Criteria andPtSpurFeeIsNull() {
            addCriterion("pt_spur_fee is null");
            return (Criteria) this;
        }

        public Criteria andPtSpurFeeIsNotNull() {
            addCriterion("pt_spur_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPtSpurFeeEqualTo(Double value) {
            addCriterion("pt_spur_fee =", value, "ptSpurFee");
            return (Criteria) this;
        }

        public Criteria andPtSpurFeeNotEqualTo(Double value) {
            addCriterion("pt_spur_fee <>", value, "ptSpurFee");
            return (Criteria) this;
        }

        public Criteria andPtSpurFeeGreaterThan(Double value) {
            addCriterion("pt_spur_fee >", value, "ptSpurFee");
            return (Criteria) this;
        }

        public Criteria andPtSpurFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("pt_spur_fee >=", value, "ptSpurFee");
            return (Criteria) this;
        }

        public Criteria andPtSpurFeeLessThan(Double value) {
            addCriterion("pt_spur_fee <", value, "ptSpurFee");
            return (Criteria) this;
        }

        public Criteria andPtSpurFeeLessThanOrEqualTo(Double value) {
            addCriterion("pt_spur_fee <=", value, "ptSpurFee");
            return (Criteria) this;
        }

        public Criteria andPtSpurFeeIn(List<Double> values) {
            addCriterion("pt_spur_fee in", values, "ptSpurFee");
            return (Criteria) this;
        }

        public Criteria andPtSpurFeeNotIn(List<Double> values) {
            addCriterion("pt_spur_fee not in", values, "ptSpurFee");
            return (Criteria) this;
        }

        public Criteria andPtSpurFeeBetween(Double value1, Double value2) {
            addCriterion("pt_spur_fee between", value1, value2, "ptSpurFee");
            return (Criteria) this;
        }

        public Criteria andPtSpurFeeNotBetween(Double value1, Double value2) {
            addCriterion("pt_spur_fee not between", value1, value2, "ptSpurFee");
            return (Criteria) this;
        }

        public Criteria andPtTestProcessingFeeIsNull() {
            addCriterion("pt_test_processing_fee is null");
            return (Criteria) this;
        }

        public Criteria andPtTestProcessingFeeIsNotNull() {
            addCriterion("pt_test_processing_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPtTestProcessingFeeEqualTo(Double value) {
            addCriterion("pt_test_processing_fee =", value, "ptTestProcessingFee");
            return (Criteria) this;
        }

        public Criteria andPtTestProcessingFeeNotEqualTo(Double value) {
            addCriterion("pt_test_processing_fee <>", value, "ptTestProcessingFee");
            return (Criteria) this;
        }

        public Criteria andPtTestProcessingFeeGreaterThan(Double value) {
            addCriterion("pt_test_processing_fee >", value, "ptTestProcessingFee");
            return (Criteria) this;
        }

        public Criteria andPtTestProcessingFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("pt_test_processing_fee >=", value, "ptTestProcessingFee");
            return (Criteria) this;
        }

        public Criteria andPtTestProcessingFeeLessThan(Double value) {
            addCriterion("pt_test_processing_fee <", value, "ptTestProcessingFee");
            return (Criteria) this;
        }

        public Criteria andPtTestProcessingFeeLessThanOrEqualTo(Double value) {
            addCriterion("pt_test_processing_fee <=", value, "ptTestProcessingFee");
            return (Criteria) this;
        }

        public Criteria andPtTestProcessingFeeIn(List<Double> values) {
            addCriterion("pt_test_processing_fee in", values, "ptTestProcessingFee");
            return (Criteria) this;
        }

        public Criteria andPtTestProcessingFeeNotIn(List<Double> values) {
            addCriterion("pt_test_processing_fee not in", values, "ptTestProcessingFee");
            return (Criteria) this;
        }

        public Criteria andPtTestProcessingFeeBetween(Double value1, Double value2) {
            addCriterion("pt_test_processing_fee between", value1, value2, "ptTestProcessingFee");
            return (Criteria) this;
        }

        public Criteria andPtTestProcessingFeeNotBetween(Double value1, Double value2) {
            addCriterion("pt_test_processing_fee not between", value1, value2, "ptTestProcessingFee");
            return (Criteria) this;
        }

        public Criteria andPtFuelPowerFeeIsNull() {
            addCriterion("pt_fuel_power_fee is null");
            return (Criteria) this;
        }

        public Criteria andPtFuelPowerFeeIsNotNull() {
            addCriterion("pt_fuel_power_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPtFuelPowerFeeEqualTo(Double value) {
            addCriterion("pt_fuel_power_fee =", value, "ptFuelPowerFee");
            return (Criteria) this;
        }

        public Criteria andPtFuelPowerFeeNotEqualTo(Double value) {
            addCriterion("pt_fuel_power_fee <>", value, "ptFuelPowerFee");
            return (Criteria) this;
        }

        public Criteria andPtFuelPowerFeeGreaterThan(Double value) {
            addCriterion("pt_fuel_power_fee >", value, "ptFuelPowerFee");
            return (Criteria) this;
        }

        public Criteria andPtFuelPowerFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("pt_fuel_power_fee >=", value, "ptFuelPowerFee");
            return (Criteria) this;
        }

        public Criteria andPtFuelPowerFeeLessThan(Double value) {
            addCriterion("pt_fuel_power_fee <", value, "ptFuelPowerFee");
            return (Criteria) this;
        }

        public Criteria andPtFuelPowerFeeLessThanOrEqualTo(Double value) {
            addCriterion("pt_fuel_power_fee <=", value, "ptFuelPowerFee");
            return (Criteria) this;
        }

        public Criteria andPtFuelPowerFeeIn(List<Double> values) {
            addCriterion("pt_fuel_power_fee in", values, "ptFuelPowerFee");
            return (Criteria) this;
        }

        public Criteria andPtFuelPowerFeeNotIn(List<Double> values) {
            addCriterion("pt_fuel_power_fee not in", values, "ptFuelPowerFee");
            return (Criteria) this;
        }

        public Criteria andPtFuelPowerFeeBetween(Double value1, Double value2) {
            addCriterion("pt_fuel_power_fee between", value1, value2, "ptFuelPowerFee");
            return (Criteria) this;
        }

        public Criteria andPtFuelPowerFeeNotBetween(Double value1, Double value2) {
            addCriterion("pt_fuel_power_fee not between", value1, value2, "ptFuelPowerFee");
            return (Criteria) this;
        }

        public Criteria andPtManagmentFeeIsNull() {
            addCriterion("pt_managment_fee is null");
            return (Criteria) this;
        }

        public Criteria andPtManagmentFeeIsNotNull() {
            addCriterion("pt_managment_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPtManagmentFeeEqualTo(Double value) {
            addCriterion("pt_managment_fee =", value, "ptManagmentFee");
            return (Criteria) this;
        }

        public Criteria andPtManagmentFeeNotEqualTo(Double value) {
            addCriterion("pt_managment_fee <>", value, "ptManagmentFee");
            return (Criteria) this;
        }

        public Criteria andPtManagmentFeeGreaterThan(Double value) {
            addCriterion("pt_managment_fee >", value, "ptManagmentFee");
            return (Criteria) this;
        }

        public Criteria andPtManagmentFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("pt_managment_fee >=", value, "ptManagmentFee");
            return (Criteria) this;
        }

        public Criteria andPtManagmentFeeLessThan(Double value) {
            addCriterion("pt_managment_fee <", value, "ptManagmentFee");
            return (Criteria) this;
        }

        public Criteria andPtManagmentFeeLessThanOrEqualTo(Double value) {
            addCriterion("pt_managment_fee <=", value, "ptManagmentFee");
            return (Criteria) this;
        }

        public Criteria andPtManagmentFeeIn(List<Double> values) {
            addCriterion("pt_managment_fee in", values, "ptManagmentFee");
            return (Criteria) this;
        }

        public Criteria andPtManagmentFeeNotIn(List<Double> values) {
            addCriterion("pt_managment_fee not in", values, "ptManagmentFee");
            return (Criteria) this;
        }

        public Criteria andPtManagmentFeeBetween(Double value1, Double value2) {
            addCriterion("pt_managment_fee between", value1, value2, "ptManagmentFee");
            return (Criteria) this;
        }

        public Criteria andPtManagmentFeeNotBetween(Double value1, Double value2) {
            addCriterion("pt_managment_fee not between", value1, value2, "ptManagmentFee");
            return (Criteria) this;
        }

        public Criteria andPtCooperationFeeIsNull() {
            addCriterion("pt_cooperation_fee is null");
            return (Criteria) this;
        }

        public Criteria andPtCooperationFeeIsNotNull() {
            addCriterion("pt_cooperation_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPtCooperationFeeEqualTo(Double value) {
            addCriterion("pt_cooperation_fee =", value, "ptCooperationFee");
            return (Criteria) this;
        }

        public Criteria andPtCooperationFeeNotEqualTo(Double value) {
            addCriterion("pt_cooperation_fee <>", value, "ptCooperationFee");
            return (Criteria) this;
        }

        public Criteria andPtCooperationFeeGreaterThan(Double value) {
            addCriterion("pt_cooperation_fee >", value, "ptCooperationFee");
            return (Criteria) this;
        }

        public Criteria andPtCooperationFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("pt_cooperation_fee >=", value, "ptCooperationFee");
            return (Criteria) this;
        }

        public Criteria andPtCooperationFeeLessThan(Double value) {
            addCriterion("pt_cooperation_fee <", value, "ptCooperationFee");
            return (Criteria) this;
        }

        public Criteria andPtCooperationFeeLessThanOrEqualTo(Double value) {
            addCriterion("pt_cooperation_fee <=", value, "ptCooperationFee");
            return (Criteria) this;
        }

        public Criteria andPtCooperationFeeIn(List<Double> values) {
            addCriterion("pt_cooperation_fee in", values, "ptCooperationFee");
            return (Criteria) this;
        }

        public Criteria andPtCooperationFeeNotIn(List<Double> values) {
            addCriterion("pt_cooperation_fee not in", values, "ptCooperationFee");
            return (Criteria) this;
        }

        public Criteria andPtCooperationFeeBetween(Double value1, Double value2) {
            addCriterion("pt_cooperation_fee between", value1, value2, "ptCooperationFee");
            return (Criteria) this;
        }

        public Criteria andPtCooperationFeeNotBetween(Double value1, Double value2) {
            addCriterion("pt_cooperation_fee not between", value1, value2, "ptCooperationFee");
            return (Criteria) this;
        }

        public Criteria andPtPublishFeeIsNull() {
            addCriterion("pt_publish_fee is null");
            return (Criteria) this;
        }

        public Criteria andPtPublishFeeIsNotNull() {
            addCriterion("pt_publish_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPtPublishFeeEqualTo(Double value) {
            addCriterion("pt_publish_fee =", value, "ptPublishFee");
            return (Criteria) this;
        }

        public Criteria andPtPublishFeeNotEqualTo(Double value) {
            addCriterion("pt_publish_fee <>", value, "ptPublishFee");
            return (Criteria) this;
        }

        public Criteria andPtPublishFeeGreaterThan(Double value) {
            addCriterion("pt_publish_fee >", value, "ptPublishFee");
            return (Criteria) this;
        }

        public Criteria andPtPublishFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("pt_publish_fee >=", value, "ptPublishFee");
            return (Criteria) this;
        }

        public Criteria andPtPublishFeeLessThan(Double value) {
            addCriterion("pt_publish_fee <", value, "ptPublishFee");
            return (Criteria) this;
        }

        public Criteria andPtPublishFeeLessThanOrEqualTo(Double value) {
            addCriterion("pt_publish_fee <=", value, "ptPublishFee");
            return (Criteria) this;
        }

        public Criteria andPtPublishFeeIn(List<Double> values) {
            addCriterion("pt_publish_fee in", values, "ptPublishFee");
            return (Criteria) this;
        }

        public Criteria andPtPublishFeeNotIn(List<Double> values) {
            addCriterion("pt_publish_fee not in", values, "ptPublishFee");
            return (Criteria) this;
        }

        public Criteria andPtPublishFeeBetween(Double value1, Double value2) {
            addCriterion("pt_publish_fee between", value1, value2, "ptPublishFee");
            return (Criteria) this;
        }

        public Criteria andPtPublishFeeNotBetween(Double value1, Double value2) {
            addCriterion("pt_publish_fee not between", value1, value2, "ptPublishFee");
            return (Criteria) this;
        }

        public Criteria andPtExpertConsultationIsNull() {
            addCriterion("pt_expert_consultation is null");
            return (Criteria) this;
        }

        public Criteria andPtExpertConsultationIsNotNull() {
            addCriterion("pt_expert_consultation is not null");
            return (Criteria) this;
        }

        public Criteria andPtExpertConsultationEqualTo(Double value) {
            addCriterion("pt_expert_consultation =", value, "ptExpertConsultation");
            return (Criteria) this;
        }

        public Criteria andPtExpertConsultationNotEqualTo(Double value) {
            addCriterion("pt_expert_consultation <>", value, "ptExpertConsultation");
            return (Criteria) this;
        }

        public Criteria andPtExpertConsultationGreaterThan(Double value) {
            addCriterion("pt_expert_consultation >", value, "ptExpertConsultation");
            return (Criteria) this;
        }

        public Criteria andPtExpertConsultationGreaterThanOrEqualTo(Double value) {
            addCriterion("pt_expert_consultation >=", value, "ptExpertConsultation");
            return (Criteria) this;
        }

        public Criteria andPtExpertConsultationLessThan(Double value) {
            addCriterion("pt_expert_consultation <", value, "ptExpertConsultation");
            return (Criteria) this;
        }

        public Criteria andPtExpertConsultationLessThanOrEqualTo(Double value) {
            addCriterion("pt_expert_consultation <=", value, "ptExpertConsultation");
            return (Criteria) this;
        }

        public Criteria andPtExpertConsultationIn(List<Double> values) {
            addCriterion("pt_expert_consultation in", values, "ptExpertConsultation");
            return (Criteria) this;
        }

        public Criteria andPtExpertConsultationNotIn(List<Double> values) {
            addCriterion("pt_expert_consultation not in", values, "ptExpertConsultation");
            return (Criteria) this;
        }

        public Criteria andPtExpertConsultationBetween(Double value1, Double value2) {
            addCriterion("pt_expert_consultation between", value1, value2, "ptExpertConsultation");
            return (Criteria) this;
        }

        public Criteria andPtExpertConsultationNotBetween(Double value1, Double value2) {
            addCriterion("pt_expert_consultation not between", value1, value2, "ptExpertConsultation");
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