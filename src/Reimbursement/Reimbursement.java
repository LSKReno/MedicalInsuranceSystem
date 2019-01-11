package Reimbursement;

/**
 * Created by LSK.Reno on 2018/7/26 14:07.
 */
public class Reimbursement {
    private String personID = "";
    private String personName = "";
    private String MedicalCategory = "";
    private String institutionID = "";
    private String drugFee = "";
    private double projectFee = 0;
    private double institutionFee = 0;
    private double ReimbursementFee = 0;
    private double personFee = 0;
    /**
     *constructor
     */
    public Reimbursement() {
    }

    public Reimbursement(String personID, String personName, String medicalCategory, String institutionID, String drugFee, double projectFee, double institutionFee, double reimbursementFee, double personFee) {
        this.personID = personID;
        this.personName = personName;
        this.MedicalCategory = medicalCategory;
        this.institutionID = institutionID;
        this.drugFee = drugFee;
        this.projectFee = projectFee;
        this.institutionFee = institutionFee;
        this.ReimbursementFee = reimbursementFee;
        this.personFee = personFee;
    }
    /**
     * 计算药品金额
     * */
    public void calculateDrug(){

    }
    /**计算诊疗项目*/
    public void calculateProject(){

    }

    /**计算服务设施*/
    public void calculateInstitution(){

    }

    /**合算*/
    public void calculateAll(){

    }


    /**
     * getter and setter
     * */
    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getMedicalCategory() {
        return MedicalCategory;
    }

    public void setMedicalCategory(String medicalCategory) {
        MedicalCategory = medicalCategory;
    }

    public String getInstitutionID() {
        return institutionID;
    }

    public void setInstitutionID(String institutionID) {
        this.institutionID = institutionID;
    }

    public String getDrugFee() {
        return drugFee;
    }

    public void setDrugFee(String drugFee) {
        this.drugFee = drugFee;
    }

    public double getProjectFee() {
        return projectFee;
    }

    public void setProjectFee(double projectFee) {
        this.projectFee = projectFee;
    }

    public double getInstitutionFee() {
        return institutionFee;
    }

    public void setInstitutionFee(double institutionFee) {
        this.institutionFee = institutionFee;
    }

    public double getReimbursementFee() {
        return ReimbursementFee;
    }

    public void setReimbursementFee(double reimbursementFee) {
        ReimbursementFee = reimbursementFee;
    }

    public double getPersonFee() {
        return personFee;
    }

    public void setPersonFee(double personFee) {
        this.personFee = personFee;
    }


}
