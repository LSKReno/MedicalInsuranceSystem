package Examine;

import javafx.scene.layout.Pane;

/**
 * Created by LSK.Reno on 2018/7/26 13:59.
 */
public class SpecialExamine extends Examine {
    private String drugID = "";

    /**
     * 构造方法
     * **/
    public SpecialExamine(String drugID) {
        this.drugID = drugID;
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
}
