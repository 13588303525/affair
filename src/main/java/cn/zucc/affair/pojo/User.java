package cn.zucc.affair.pojo;

public class User {
    private String uId;

    private String uPwd;

    private String uName;

    private String uPower;

    private String uOcpy;

    private String uUnit;

    private String cId;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd == null ? null : uPwd.trim();
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuPower() {
        return uPower;
    }

    public void setuPower(String uPower) {
        this.uPower = uPower == null ? null : uPower.trim();
    }

    public String getuOcpy() {
        return uOcpy;
    }

    public void setuOcpy(String uOcpy) {
        this.uOcpy = uOcpy == null ? null : uOcpy.trim();
    }

    public String getuUnit() {
        return uUnit;
    }

    public void setuUnit(String uUnit) {
        this.uUnit = uUnit == null ? null : uUnit.trim();
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId == null ? null : cId.trim();
    }
}