package cn.zucc.affair.pojo;

import java.util.Date;

public class Program {
    private Integer pgId;

    private String pgName;

    private Integer pgTypeId;

    private Date pgStarttime;

    private Date pgEndtime;

    public Integer getPgId() {
        return pgId;
    }

    public void setPgId(Integer pgId) {
        this.pgId = pgId;
    }

    public String getPgName() {
        return pgName;
    }

    public void setPgName(String pgName) {
        this.pgName = pgName == null ? null : pgName.trim();
    }

    public Integer getPgTypeId() {
        return pgTypeId;
    }

    public void setPgTypeId(Integer pgTypeId) {
        this.pgTypeId = pgTypeId;
    }

    public Date getPgStarttime() {
        return pgStarttime;
    }

    public void setPgStarttime(Date pgStarttime) {
        this.pgStarttime = pgStarttime;
    }

    public Date getPgEndtime() {
        return pgEndtime;
    }

    public void setPgEndtime(Date pgEndtime) {
        this.pgEndtime = pgEndtime;
    }
}