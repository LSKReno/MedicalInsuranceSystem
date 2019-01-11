package Data;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by LSK.Reno on 2018/7/26 13:38.
 */
public class ServiceFacility {
    private Double facilityID = 0.1;
    private String facilityName = "";


    private final StringProperty facilityIDp;
    private final StringProperty facilityNamep;



    /**

     * 构造方法
     * */
    public ServiceFacility() {
        facilityIDp = null;
        facilityNamep = null;
    }
    public ServiceFacility(String facilityIDp, String facilityNamep) {
        this.facilityIDp = new SimpleStringProperty(facilityIDp);
        this.facilityNamep = new SimpleStringProperty(facilityNamep);
    }
    public ServiceFacility(Double facilityID, String facilityName) {
        this.facilityID = facilityID;
        this.facilityName = facilityName;
        facilityIDp = null;
        facilityNamep = null;
    }




    /**
     * getter and setter
     * */

    public Double getFacilityID() {
        return facilityID;
    }

    public void setFacilityID(Double facilityID) {
        this.facilityID = facilityID;
    }
    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }



    public String getFacilityIDp() {
        return facilityIDp.get();
    }

    public StringProperty facilityIDpProperty() {
        return facilityIDp;
    }

    public void setFacilityIDp(String facilityIDp) {
        this.facilityIDp.set(facilityIDp);
    }

    public String getFacilityNamep() {
        return facilityNamep.get();
    }

    public StringProperty facilityNamepProperty() {
        return facilityNamep;
    }

    public void setFacilityNamep(String facilityNamep) {
        this.facilityNamep.set(facilityNamep);
    }










}





































