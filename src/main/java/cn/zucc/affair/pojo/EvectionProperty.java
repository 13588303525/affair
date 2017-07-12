package cn.zucc.affair.pojo;

import java.util.Date;

public class EvectionProperty {
    private Integer epId;

    private String epAddress;

    private String epReason;

    private Date epStarttime;

    private Date epEndtime;

    private Integer epDays;

    private Double epAircraftFee;

    private Double epTrainFee;

    private Double epOtherTrafficFee;

    private Double epHotelCost;

    private Double epFoodAllowance;

    private Double epPublicFees;

    private Double epOther;

    public Integer getEpId() {
        return epId;
    }

    public void setEpId(Integer epId) {
        this.epId = epId;
    }

    public String getEpAddress() {
        return epAddress;
    }

    public void setEpAddress(String epAddress) {
        this.epAddress = epAddress == null ? null : epAddress.trim();
    }

    public String getEpReason() {
        return epReason;
    }

    public void setEpReason(String epReason) {
        this.epReason = epReason == null ? null : epReason.trim();
    }

    public Date getEpStarttime() {
        return epStarttime;
    }

    public void setEpStarttime(Date epStarttime) {
        this.epStarttime = epStarttime;
    }

    public Date getEpEndtime() {
        return epEndtime;
    }

    public void setEpEndtime(Date epEndtime) {
        this.epEndtime = epEndtime;
    }

    public Integer getEpDays() {
        return epDays;
    }

    public void setEpDays(Integer epDays) {
        this.epDays = epDays;
    }

    public Double getEpAircraftFee() {
        return epAircraftFee;
    }

    public void setEpAircraftFee(Double epAircraftFee) {
        this.epAircraftFee = epAircraftFee;
    }

    public Double getEpTrainFee() {
        return epTrainFee;
    }

    public void setEpTrainFee(Double epTrainFee) {
        this.epTrainFee = epTrainFee;
    }

    public Double getEpOtherTrafficFee() {
        return epOtherTrafficFee;
    }

    public void setEpOtherTrafficFee(Double epOtherTrafficFee) {
        this.epOtherTrafficFee = epOtherTrafficFee;
    }

    public Double getEpHotelCost() {
        return epHotelCost;
    }

    public void setEpHotelCost(Double epHotelCost) {
        this.epHotelCost = epHotelCost;
    }

    public Double getEpFoodAllowance() {
        return epFoodAllowance;
    }

    public void setEpFoodAllowance(Double epFoodAllowance) {
        this.epFoodAllowance = epFoodAllowance;
    }

    public Double getEpPublicFees() {
        return epPublicFees;
    }

    public void setEpPublicFees(Double epPublicFees) {
        this.epPublicFees = epPublicFees;
    }

    public Double getEpOther() {
        return epOther;
    }

    public void setEpOther(Double epOther) {
        this.epOther = epOther;
    }
}