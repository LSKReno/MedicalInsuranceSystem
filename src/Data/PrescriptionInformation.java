package Data;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by LSK.Reno on 2018/7/31 9:03.
 */

//处方
public class PrescriptionInformation {
    private String personID = "";
    private String admissionID = ""; //门诊号
    private String projectCategory = "";
    private String projectName = "";
    private String expense = "";
    private String coushu = "";

    private final StringProperty personIDp;
    private final StringProperty admissionIDp;
    private final StringProperty projectCategoryp;
    private final StringProperty projectNamep;
    private final StringProperty expensep;


    public PrescriptionInformation(String personIDp, String admissionIDp, String projectCategoryp,
                                   String projectNamep, String expensep) {
        this.personIDp = new SimpleStringProperty(personIDp);
        this.admissionIDp = new SimpleStringProperty(admissionIDp);
        this.projectCategoryp = new SimpleStringProperty(projectCategoryp);
        this.projectNamep = new SimpleStringProperty(projectNamep);
        this.expensep = new SimpleStringProperty(expensep);
    }

    public PrescriptionInformation(String personID, String admissionID, String projectCategory,
                                   String projectName, String expense, String coushu) {
        this.personID = personID;
        this.admissionID = admissionID;
        this.projectCategory = projectCategory;
        this.projectName = projectName;
        this.expense = expense;
        this.coushu = coushu;
        personIDp = null;
        admissionIDp = null;
        projectCategoryp = null;
        projectNamep = null;
        expensep = null;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getAdmissionID() {
        return admissionID;
    }

    public void setAdmissionID(String admissionID) {
        this.admissionID = admissionID;
    }

    public String getProjectCategory() {
        return projectCategory;
    }

    public void setProjectCategory(String projectCategory) {
        this.projectCategory = projectCategory;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getExpense() {
        return expense;
    }

    public void setExpense(String expense) {
        this.expense = expense;
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

    public String getAdmissionIDp() {
        return admissionIDp.get();
    }

    public StringProperty admissionIDpProperty() {
        return admissionIDp;
    }

    public void setAdmissionIDp(String admissionIDp) {
        this.admissionIDp.set(admissionIDp);
    }

    public String getProjectCategoryp() {
        return projectCategoryp.get();
    }

    public StringProperty projectCategorypProperty() {
        return projectCategoryp;
    }

    public void setProjectCategoryp(String projectCategoryp) {
        this.projectCategoryp.set(projectCategoryp);
    }

    public String getProjectNamep() {
        return projectNamep.get();
    }

    public StringProperty projectNamepProperty() {
        return projectNamep;
    }

    public void setProjectNamep(String projectNamep) {
        this.projectNamep.set(projectNamep);
    }

    public String getExpensep() {
        return expensep.get();
    }

    public StringProperty expensepProperty() {
        return expensep;
    }

    public void setExpensep(String expensep) {
        this.expensep.set(expensep);
    }
}






