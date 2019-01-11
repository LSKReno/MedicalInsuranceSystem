package Data;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by LSK.Reno on 2018/7/26 13:37.
 */
public class ClinicProject {
    private String projectID = "";
    private String projectName = "";
    private String projectLevel = "";
    private String hospitalLevel = "";
    private String examine = "";
    private String manufacturer = "";

    private final StringProperty projectIDp;
    private final StringProperty projectNamep;
    /**
     * 构造方法
     * */
    public ClinicProject() {
        projectIDp = null;
        projectNamep = null;
    }
    public ClinicProject(String projectIDp, String projectNamep) {
        this.projectIDp = new SimpleStringProperty(projectIDp);
        this.projectNamep = new SimpleStringProperty(projectNamep);
    }

    public ClinicProject(String projectID, String projectName, String projectLevel, String hospitalLevel) {
        this.projectID = projectID;
        this.projectName = projectName;
        this.projectLevel = projectLevel;
        this.hospitalLevel = hospitalLevel;
        projectIDp = null;
        projectNamep = null;

    }

    /**
     * getter and setter
     * */
    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectLevel() {
        return projectLevel;
    }

    public void setProjectLevel(String projectLevel) {
        this.projectLevel = projectLevel;
    }

    public String getHospitalLevel() {
        return hospitalLevel;
    }

    public void setHospitalLevel(String hospitalLevel) {
        this.hospitalLevel = hospitalLevel;
    }

    public String getExamine() {
        return examine;
    }

    public void setExamine(String examine) {
        this.examine = examine;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    public String getProjectIDp() {
        return projectIDp.get();
    }

    public StringProperty projectIDpProperty() {
        return projectIDp;
    }

    public void setProjectIDp(String projectIDp) {
        this.projectIDp.set(projectIDp);
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

}
