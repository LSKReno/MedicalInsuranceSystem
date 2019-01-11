package Examine;

import java.util.Date;

/**
 * Created by LSK.Reno on 2018/7/26 13:59.
 */
public class Examine {
    private String examineID = "";
    private String personID = "";
    private Date startDate;
    private Date endDate;
    private String examineOpinion = "";
    private Date examineDate;
    private String examineMarker = "";

    /**
     * 构造方法
     * */
    public Examine() {
    }

    public Examine(String examineID, String personID, String examineOpinion, String examineMarker) {
        this.examineID = examineID;
        this.personID = personID;
        this.examineOpinion = examineOpinion;
        this.examineMarker = examineMarker;
    }

    /**
     * getter and setter
     */
    public String getExamineID() {
        return examineID;
    }

    public void setExamineID(String examineID) {
        this.examineID = examineID;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getExamineOpinion() {
        return examineOpinion;
    }

    public void setExamineOpinion(String examineOpinion) {
        this.examineOpinion = examineOpinion;
    }

    public Date getExamineDate() {
        return examineDate;
    }

    public void setExamineDate(Date examineDate) {
        this.examineDate = examineDate;
    }

    public String getExamineMarker() {
        return examineMarker;
    }

    public void setExamineMarker(String examineMarker) {
        this.examineMarker = examineMarker;
    }
}
