package Data;

/**
 * Created by LSK.Reno on 2018/7/26 13:48.
 */
public class DesignatedMedicalInstitution {
    private String institutionID = "";
    private String institutionName = "";
    private String hospitalLevel = "";
    private String institutionType = "";
    private String LegalRepresentativeName = "";
    private String LegalDialNum = "";


    /**
     * 构造方法
     * **/
    public DesignatedMedicalInstitution() {
    }

    public DesignatedMedicalInstitution(String institutionID, String institutionName, String hospitalLevel) {
        this.institutionID = institutionID;
        this.institutionName = institutionName;
        this.hospitalLevel = hospitalLevel;
    }

    /**
     * getter and setter
     * */
    public String getInstitutionID() {
        return institutionID;
    }

    public void setInstitutionID(String institutionID) {
        this.institutionID = institutionID;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getHospitalLevel() {
        return hospitalLevel;
    }

    public void setHospitalLevel(String hospitalLevel) {
        this.hospitalLevel = hospitalLevel;
    }

    public String getInstitutionType() {
        return institutionType;
    }

    public void setInstitutionType(String institutionType) {
        this.institutionType = institutionType;
    }

    public String getLegalRepresentativeName() {
        return LegalRepresentativeName;
    }

    public void setLegalRepresentativeName(String legalRepresentativeName) {
        LegalRepresentativeName = legalRepresentativeName;
    }

    public String getLegalDialNum() {
        return LegalDialNum;
    }

    public void setLegalDialNum(String legalDialNum) {
        LegalDialNum = legalDialNum;
    }
}
