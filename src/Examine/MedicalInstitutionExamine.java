package Examine;

/**
 * Created by LSK.Reno on 2018/7/26 13:59.
 */
public class MedicalInstitutionExamine extends Examine{
    private String institutionID = "";

    //Constructor
    public MedicalInstitutionExamine(String institutionID) {
        this.institutionID = institutionID;
    }

    //getter and setter
    public String getInstitutionID() {
        return institutionID;
    }

    public void setInstitutionID(String institutionID) {
        this.institutionID = institutionID;
    }
}
