package Data;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by LSK.Reno on 2018/7/26 13:38.
 */
public class DiseaseInformation {
    private String diseaseID = "";
    private String diseaseType = "";
    private String examine = "";

    private final StringProperty diseaseIDp;
    private final StringProperty diseaseTypep;



    /**
     * 构造方法
     * */
    public DiseaseInformation() {
        diseaseIDp = null;
        diseaseTypep = null;
    }

    public DiseaseInformation(String diseaseIDp, String diseaseTypep) {
        this.diseaseIDp = new SimpleStringProperty(diseaseIDp);
        this.diseaseTypep = new SimpleStringProperty(diseaseTypep);

    }
    public DiseaseInformation(String diseaseID, String diseaseType, String examine) {
        this.diseaseID = diseaseID;
        this.diseaseType = diseaseType;
        this.examine = examine;
        diseaseIDp = null;
        diseaseTypep = null;
    }

    /**
     * getter and setter
     * */
    public String getDiseaseID() {
        return diseaseID;
    }

    public void setDiseaseID(String diseaseID) {
        this.diseaseID = diseaseID;
    }

    public String getDiseaseType() {
        return diseaseType;
    }

    public void setDiseaseType(String diseaseType) {
        this.diseaseType = diseaseType;
    }

    public String getExamine() {
        return examine;
    }

    public void setExamine(String examine) {
        this.examine = examine;
    }


    public String getDiseaseIDp() {
        return diseaseIDp.get();
    }

    public StringProperty diseaseIDpProperty() {
        return diseaseIDp;
    }

    public void setDiseaseIDp(String diseaseIDp) {
        this.diseaseIDp.set(diseaseIDp);
    }

    public String getDiseaseTypep() {
        return diseaseTypep.get();
    }

    public StringProperty diseaseTypepProperty() {
        return diseaseTypep;
    }

    public void setDiseaseTypep(String diseaseTypep) {
        this.diseaseTypep.set(diseaseTypep);
    }


}
