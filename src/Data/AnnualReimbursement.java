package Data;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by LSK.Reno on 2018/7/31 13:54.
 */
public class AnnualReimbursement {
    private String personID = "";
    private String personName = "";
    private String institutionID = "";
    private String personalExpense = "";
    private String reimbursementExpense = "";
    private String expense = "";
    private String topLine = "";
    private String examine = "";

    private final StringProperty personIDp;
    private final StringProperty personNamep;
    private final StringProperty institutionIDp;
    private final StringProperty personalExpensep;
    private final StringProperty reimbursementExpensep;
    private final StringProperty expensep;
    private final StringProperty topLinep;
    //Constructor
    public AnnualReimbursement(String personIDp, String personNamep,
                               String institutionIDp, String personalExpensep,
                               String reimbursementExpensep,String expensep,String topLinep) {
        this.personIDp = new SimpleStringProperty(personIDp);
        this.personNamep = new SimpleStringProperty(personNamep);
        this.institutionIDp = new SimpleStringProperty(institutionIDp);
        this.personalExpensep = new SimpleStringProperty(personalExpensep);
        this.reimbursementExpensep = new SimpleStringProperty(reimbursementExpensep);
        this.expensep = new SimpleStringProperty(expensep);
        this.topLinep = new SimpleStringProperty(topLinep);
    }



    public AnnualReimbursement(String personID, String personName,
                               String institutionID, String personalExpense,
                               String reimbursementExpense, String expense, String topLine, String examine) {
        this.personID = personID;
        this.personName = personName;
        this.institutionID = institutionID;
        this.personalExpense = personalExpense;
        this.reimbursementExpense = reimbursementExpense;
        this.expense = expense;
        this.topLine = topLine;

        this.examine = examine;
        personIDp = null;
        personNamep = null;
        institutionIDp= null;
        personalExpensep= null;
        reimbursementExpensep= null;
        expensep= null;
        topLinep = null;
    }

    //getter and setter

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

    public String getInstitutionID() {
        return institutionID;
    }

    public void setInstitutionID(String institutionID) {
        this.institutionID = institutionID;
    }

    public String getPersonalExpense() {
        return personalExpense;
    }

    public void setPersonalExpense(String personalExpense) {
        this.personalExpense = personalExpense;
    }

    public String getReimbursementExpense() {
        return reimbursementExpense;
    }

    public void setReimbursementExpense(String reimbursementExpense) {
        this.reimbursementExpense = reimbursementExpense;
    }

    public String getExpense() {
        return expense;
    }

    public void setExpense(String expense) {
        this.expense = expense;
    }

    public String getExamine() {
        return examine;
    }

    public void setExamine(String examine) {
        this.examine = examine;
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

    public String getInstitutionIDp() {
        return institutionIDp.get();
    }

    public StringProperty institutionIDpProperty() {
        return institutionIDp;
    }

    public void setInstitutionIDp(String institutionIDp) {
        this.institutionIDp.set(institutionIDp);
    }

    public String getPersonalExpensep() {
        return personalExpensep.get();
    }

    public StringProperty personalExpensepProperty() {
        return personalExpensep;
    }

    public void setPersonalExpensep(String personalExpensep) {
        this.personalExpensep.set(personalExpensep);
    }

    public String getReimbursementExpensep() {
        return reimbursementExpensep.get();
    }

    public StringProperty reimbursementExpensepProperty() {
        return reimbursementExpensep;
    }

    public void setReimbursementExpensep(String reimbursementExpensep) {
        this.reimbursementExpensep.set(reimbursementExpensep);
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

    public String getTopLine() {
        return topLine;
    }

    public void setTopLine(String topLine) {
        this.topLine = topLine;
    }

    public String getTopLinep() {
        return topLinep.get();
    }

    public StringProperty topLinepProperty() {
        return topLinep;
    }

    public void setTopLinep(String topLinep) {
        this.topLinep.set(topLinep);
    }
}
