package cn.zucc.affair.pojo;

public class Power {
    private Integer pwId;

    private String pwName;

    private String pwFather;

    public Integer getPwId() {
        return pwId;
    }

    public void setPwId(Integer pwId) {
        this.pwId = pwId;
    }

    public String getPwName() {
        return pwName;
    }

    public void setPwName(String pwName) {
        this.pwName = pwName == null ? null : pwName.trim();
    }

    public String getPwFather() {
        return pwFather;
    }

    public void setPwFather(String pwFather) {
        this.pwFather = pwFather == null ? null : pwFather.trim();
    }
}