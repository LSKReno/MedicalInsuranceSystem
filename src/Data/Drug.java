package Data;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by LSK.Reno on 2018/7/26.
 */
public class Drug {
    private String drugID = "";
    private String drugName = "";
    private String drugLevel = "";
    private String highestPrice = "";
    private String examine = "";
    private String hospitalLevel = "";
    private String usage = "";
    private String useDay = "";
    private String factory = "";
    private String directoryID = "";

    private final StringProperty drugIDp;
    private final StringProperty drugNamep;

    public Drug(String drugIDp, String drugNamep) {
        this.drugIDp = new SimpleStringProperty(drugIDp);
        this.drugNamep = new SimpleStringProperty(drugNamep);
    }


    /**
     * 构造方法
     * */
    public Drug() {
        drugIDp = null;
        drugNamep = null;
    }

    public Drug(String drugID, String drugName, String drugLevel, String hospitalLevel) {
        this.drugID = drugID;
        this.drugName = drugName;
        this.drugLevel = drugLevel;
        this.hospitalLevel = hospitalLevel;
        drugIDp = null;
        drugNamep = null;

    }

    /**
     * getter and setter
     * */
    public String getDrugID() {
        return drugID;
    }

    public void setDrugID(String drugID) {
        this.drugID = drugID;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugLevel() {
        return drugLevel;
    }

    public void setDrugLevel(String drugLevel) {
        this.drugLevel = drugLevel;
    }

    public String getHighestPrice() {
        return highestPrice;
    }

    public void setHighestPrice(String highestPrice) {
        this.highestPrice = highestPrice;
    }

    public String getExamine() {
        return examine;
    }

    public void setExamine(String examine) {
        this.examine = examine;
    }

    public String getHospitalLevel() {
        return hospitalLevel;
    }

    public void setHospitalLevel(String hospitalLevel) {
        this.hospitalLevel = hospitalLevel;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getUseDay() {
        return useDay;
    }

    public void setUseDay(String useDay) {
        this.useDay = useDay;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getDirectoryID() {
        return directoryID;
    }

    public void setDirectoryID(String directoryID) {
        this.directoryID = directoryID;
    }



    public String getDrugIDp() {
        return drugIDp.get();
    }

    public StringProperty drugIDpProperty() {
        return drugIDp;
    }

    public void setDrugIDp(String drugIDp) {
        this.drugIDp.set(drugIDp);
    }

    public String getDrugNamep() {
        return drugNamep.get();
    }

    public StringProperty drugNamepProperty() {
        return drugNamep;
    }

    public void setDrugNamep(String drugNamep) {
        this.drugNamep.set(drugNamep);
    }

}





























