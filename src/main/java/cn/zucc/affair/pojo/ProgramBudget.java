package cn.zucc.affair.pojo;

public class ProgramBudget {
    private Integer pbId;

    private Integer pgId;

    private Integer pgTypeId;

    private Double pbPrepare;

    private Double pbApply;

    public Integer getPbId() {
        return pbId;
    }

    public void setPbId(Integer pbId) {
        this.pbId = pbId;
    }

    public Integer getPgId() {
        return pgId;
    }

    public void setPgId(Integer pgId) {
        this.pgId = pgId;
    }

    public Integer getPgTypeId() {
        return pgTypeId;
    }

    public void setPgTypeId(Integer pgTypeId) {
        this.pgTypeId = pgTypeId;
    }

    public Double getPbPrepare() {
        return pbPrepare;
    }

    public void setPbPrepare(Double pbPrepare) {
        this.pbPrepare = pbPrepare;
    }

    public Double getPbApply() {
        return pbApply;
    }

    public void setPbApply(Double pbApply) {
        this.pbApply = pbApply;
    }
}