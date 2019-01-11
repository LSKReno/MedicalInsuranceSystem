package controller;

import Data.DiseaseInformation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.*;

/**
 * Created by LSK.Reno on 2018/7/31 23:11.
 */
public class ReimbursementSuccess {
    private Stage ReimbursementSuccessStage;
    public Stage setReimbursementSuccessStage(Stage ReimbursementSuccessStage) {
        this.ReimbursementSuccessStage = ReimbursementSuccessStage;
        return ReimbursementSuccessStage;
    }

    @FXML
    private Button backButton;

    @FXML
    private Label thisExpense;

    @FXML
    private Label annualLeftMoney;

    @FXML
    private Label annualReimMoney;

    @FXML
    private Label thisReimExpense;

    @FXML
    private Label thisPersonalExpense;

    @FXML
    private Button printButton;

    @FXML
    public void initialize(){
        String reimExpense = "";
        String personalExpense = "";
        String personID = "";
        try{
            String filename = "D:\\MedicalInsuranceSystem\\src\\lastReimbursement.txt";
            File file = new File(filename);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String temp;
            int i = 1;
            while((temp = reader.readLine()) != null) {
                if(i >= 2 ){
                    reimExpense = temp.split(",")[0];
                    personalExpense = temp.split(",")[1];
//                    personID = temp.split(",")[2];
                }
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            System.out.println("IOException");
        }
        //找到此人的各个年度报销数据
        String annualPersonalExpense = "";
        String annualreimExpense = "";
        String annualExpense = "";
        String topLine = "";
        try{
            String filename = "D:\\MedicalInsuranceSystem\\src\\AnnualReimbursement.txt";
            File file = new File(filename);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String temp;
            int i = 1;
            while((temp = reader.readLine()) != null) {
                if(i >= 2 ){
                    annualPersonalExpense= temp.split(",")[3];
                    annualreimExpense = temp.split(",")[4];
                    annualExpense = temp.split(",")[5];
                    topLine = temp.split(",")[6];
                }
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            System.out.println("IOException");
        }

        double thisexpense = Double.parseDouble(reimExpense) + Double.parseDouble(personalExpense);
        double annualreimmoney = Double.parseDouble(reimExpense) + Double.parseDouble(annualreimExpense);
        double annualleftmoney = Double.parseDouble(topLine) - annualreimmoney;
        thisExpense.setText(thisexpense+"");
        thisReimExpense.setText(reimExpense);
        thisPersonalExpense.setText(personalExpense);
        annualReimMoney.setText(annualreimmoney+"");
        annualLeftMoney.setText(annualleftmoney+"");


    }
    @FXML
    void back(ActionEvent event) {
        Stage primaryStage = Main.getStage();
        try {
            primaryStage.setTitle("报销——国家医疗保险报销中心");
            Scene scene = new Scene(FXMLLoader.load(getClass().getResource("StartReimbursement.fxml")));
            primaryStage.setScene(scene);
            scene.getStylesheets().add(this.getClass().getResource("StartReimbursement.css").toExternalForm());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void print(ActionEvent event) {
        Stage primaryStage = Main.getStage();
        try {
            primaryStage.setTitle("报销表单——国家医疗保险报销中心");
            Scene scene = new Scene(FXMLLoader.load(getClass().getResource("Print.fxml")));
            primaryStage.setScene(scene);
            scene.getStylesheets().add(this.getClass().getResource("Print.css").toExternalForm());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
