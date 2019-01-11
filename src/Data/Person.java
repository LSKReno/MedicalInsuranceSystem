package Data;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by LSK.Reno on 2018/7/26.
 */
public class Person {
    private String personID = "";
    private String personName = "";
    private String documentType = "";
    private String documentNum = "";
    private String gender = "";
    private String nation = "";
    private String retirement = "";
    private String householdType = "";
    private String location = "";
    private String education = "";
    private String politicsStatus = "";
    private String marital = "";
    private String medicalCategory= "";
    private String cardNum= "";
    private String institutionID= "";

    private final StringProperty personIDp;
    private final StringProperty personNamep;
//    private final StringProperty medicalCategoryp;
    private final StringProperty institutionIDp;

    /**
     * 构造方法
     * @param personIDp
     * @param personNamep
     */
    public Person(String personIDp, String personNamep) {
        this.personIDp = new SimpleStringProperty(personIDp);
        this.personNamep = new SimpleStringProperty(personNamep);
//        medicalCategoryp = null;
        institutionIDp = null;
    }
    public Person(String personIDp, String personNamep,String institutionIDp) {
        this.personIDp = new SimpleStringProperty(personIDp);
        this.personNamep = new SimpleStringProperty(personNamep);
//        this.medicalCategoryp = new SimpleStringProperty(medicalCategoryp);
        this.institutionIDp = new SimpleStringProperty(institutionIDp);
    }
    public Person(String personID, String personName, String medicalCategory, String institutionID) {
        this.personID = personID;
        this.personName = personName;
        this.medicalCategory = medicalCategory;
        this.institutionID = institutionID;
        personIDp = null;
        personNamep = null;
//        medicalCategoryp = null;
        institutionIDp = null;
    }
    /**
     * getter and setter 方法
     */
    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNum() {
        return documentNum;
    }

    public void setDocumentNum(String documentNum) {
        this.documentNum = documentNum;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getRetirement() {
        return retirement;
    }

    public void setRetirement(String retirement) {
        this.retirement = retirement;
    }

    public String getHouseholdType() {
        return householdType;
    }

    public void setHouseholdType(String householdType) {
        this.householdType = householdType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getPoliticsStatus() {
        return politicsStatus;
    }

    public void setPoliticsStatus(String politicsStatus) {
        this.politicsStatus = politicsStatus;
    }

    public String getMarital() {
        return marital;
    }

    public void setMarital(String marital) {
        this.marital = marital;
    }

    public String getMedicalCategory() {
        return medicalCategory;
    }

    public void setMedicalCategory(String medicalCategory) {
        this.medicalCategory = medicalCategory;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getInstitutionID() {
        return institutionID;
    }

    public void setInstitutionID(String institutionID) {
        this.institutionID = institutionID;
    }



    public String getPersonIDp() {
        return personIDp.get();
    }

    public StringProperty personIDpProperty() {
        return personIDp;
    }

    public void setPersonIDp(String personIDp) {
        this.personIDp.set(personIDp);
    }

    public String getPersonNamep() {
        return personNamep.get();
    }

    public StringProperty personNamepProperty() {
        return personNamep;
    }

    public void setPersonNamep(String personNamep) {
        this.personNamep.set(personNamep);
    }



//    public String getMedicalCategoryp() {
//        return medicalCategoryp.get();
//    }
//
//    public StringProperty medicalCategorypProperty() {
//        return medicalCategoryp;
//    }
//
//    public void setMedicalCategoryp(String medicalCategoryp) {
//        this.medicalCategoryp.set(medicalCategoryp);
//    }

    public String getInstitutionIDp() {
        return institutionIDp.get();
    }

    public StringProperty institutionIDpProperty() {
        return institutionIDp;
    }

    public void setInstitutionIDp(String institutionIDp) {
        this.institutionIDp.set(institutionIDp);
    }
}
