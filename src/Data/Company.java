package Data;

/**
 * Created by LSK.Reno on 2018/7/26.
 */
public class Company {
    private String companyID = "";
    private String companyName = "";
    private String address = "";
    private int mailAddress = 0;
    private int dialNum = 0;

    /**
     * 构造方法
     * */
    public Company(String companyID, String companyName) {
        this.companyID = companyID;
        this.companyName = companyName;
    }
    public Company(){
    }
    /**
     * getter and setter
     * */
    public String getCompanyID() {
        return companyID;
    }

    public void setCompanyID(String companyID) {
        this.companyID = companyID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(int mailAddress) {
        this.mailAddress = mailAddress;
    }

    public int getDialNum() {
        return dialNum;
    }

    public void setDialNum(int dialNum) {
        this.dialNum = dialNum;
    }
}
