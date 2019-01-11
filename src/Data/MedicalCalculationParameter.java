package Data;

/**
 * Created by LSK.Reno on 2018/7/26 13:48.
 */
public class MedicalCalculationParameter {
    private String MedicalCategory = "";
    private double topLine = 0;
    private double payStandard = 0;
    private double hospitalLevel = 0;
    private double topLimit = 0;
    private double lowerLimit = 0;
    private double PersonalExpenseRatio = 0;



    /**
     * 构造方法
     * **/
    public MedicalCalculationParameter() {
    }
    public MedicalCalculationParameter(String medicalCategory, double topLine, double payStandard, double hospitalLevel, double topLimit, double lowerLimit, double personalExpenseRatio) {
        MedicalCategory = medicalCategory;
        this.topLine = topLine;
        this.payStandard = payStandard;
        this.hospitalLevel = hospitalLevel;
        this.topLimit = topLimit;
        this.lowerLimit = lowerLimit;
        PersonalExpenseRatio = personalExpenseRatio;
    }

    /**
     * getter and setter
     * */
    public String getMedicalCategory() {
        return MedicalCategory;
    }

    public void setMedicalCategory(String medicalCategory) {
        MedicalCategory = medicalCategory;
    }

    public double getTopLine() {
        return topLine;
    }

    public void setTopLine(double topLine) {
        this.topLine = topLine;
    }

    public double getPayStandard() {
        return payStandard;
    }

    public void setPayStandard(double payStandard) {
        this.payStandard = payStandard;
    }

    public double getHospitalLevel() {
        return hospitalLevel;
    }

    public void setHospitalLevel(double hospitalLevel) {
        this.hospitalLevel = hospitalLevel;
    }

    public double getTopLimit() {
        return topLimit;
    }

    public void setTopLimit(double topLimit) {
        this.topLimit = topLimit;
    }

    public double getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(double lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public double getPersonalExpenseRatio() {
        return PersonalExpenseRatio;
    }

    public void setPersonalExpenseRatio(double personalExpenseRatio) {
        PersonalExpenseRatio = personalExpenseRatio;
    }
}
