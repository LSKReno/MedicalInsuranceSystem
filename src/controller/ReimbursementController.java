package controller;

import Data.AnnualReimbursement;
import Data.Person;
import Data.PrescriptionInformation;
import IO.IO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
/**
 * Created by LSK.Reno on 2018/7/26 15:29.
 */
public class ReimbursementController {
    private Stage ReimbursementStage;
    public Stage setReimbursementStage(Stage ReimbursementStage) {
        this.ReimbursementStage = ReimbursementStage;
        return ReimbursementStage;
    }
    @FXML
    private Button searchButton;

    @FXML
    private TextField searchField;

    @FXML
    private TableView<AnnualReimbursement> InformationTable;

    @FXML
    private TableColumn<AnnualReimbursement, String> personIDColumn;

    @FXML
    private TableColumn<AnnualReimbursement, String> personNameColumn;

    @FXML
    private TableColumn<AnnualReimbursement, String> institutionIDColumn;

    @FXML
    private TableColumn<AnnualReimbursement, String> personalExpenseColumn;

    @FXML
    private TableColumn<AnnualReimbursement, String> reimbursementColumn;

    @FXML
    private TableColumn<AnnualReimbursement, String> expenseColumn;

    @FXML
    private TableColumn<AnnualReimbursement, String> topLineColumn;

    @FXML
    private TextField institutionField;

    @FXML
    private TextField drugIDField;

    @FXML
    private TextField medicalCategoryField;

    @FXML
    private TextField personIDField;

    @FXML
    private TextField personNameField;

    @FXML
    private TextField examineField;

    @FXML
    private DatePicker admissionDate;

    @FXML
    private DatePicker dischargeDate;

    @FXML
    private Button backButton;

    @FXML
    private Button startReimbursementButton;

    private ObservableList<AnnualReimbursement> annualReimbursementData = FXCollections.observableArrayList();
    private ArrayList<AnnualReimbursement> annualReimbursementList = new ArrayList<>();
    private ArrayList<AnnualReimbursement> addAnnualReimbursementList = new ArrayList<>();
    @FXML
    public void initialize(){
        IO.loadAnnualReimbursement(annualReimbursementList);
        for(AnnualReimbursement annualReimbursement:annualReimbursementList){
            AnnualReimbursement annualReimbursement1 = new AnnualReimbursement(annualReimbursement.getPersonID(),
                    annualReimbursement.getPersonName() ,annualReimbursement.getInstitutionID() ,
                    annualReimbursement.getPersonalExpense(),annualReimbursement.getReimbursementExpense(),
                    annualReimbursement.getExpense(),annualReimbursement.getTopLine());
            annualReimbursementData.add(annualReimbursement1);
        }
        personIDColumn.setCellValueFactory(cellData -> cellData.getValue().personIDpProperty());
        personNameColumn.setCellValueFactory(cellData -> cellData.getValue().personNamepProperty());
        institutionIDColumn.setCellValueFactory(cellData -> cellData.getValue().institutionIDpProperty());
        personalExpenseColumn.setCellValueFactory(cellData -> cellData.getValue().personalExpensepProperty());
        reimbursementColumn.setCellValueFactory(cellData -> cellData.getValue().reimbursementExpensepProperty());
        expenseColumn.setCellValueFactory(cellData -> cellData.getValue().expensepProperty());
        topLineColumn.setCellValueFactory(cellData -> cellData.getValue().topLinepProperty());

        InformationTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> showAnnualReimbursementDetails(newValue));
        InformationTable.setItems(annualReimbursementData);
    }
    private void showAnnualReimbursementDetails(AnnualReimbursement annualReimbursement){
        if (annualReimbursement != null) {
            personIDField.setText(annualReimbursement.personIDpProperty().get());
            personNameField.setText(annualReimbursement.personNamepProperty().get());
        } else {
            personIDField.setText("");
            personNameField.setText("");
        }
    }

    @FXML
    void search(ActionEvent event) {
        ObservableList<AnnualReimbursement> newAnnualReimbursementData = FXCollections.observableArrayList();
        for(AnnualReimbursement annualReimbursement:annualReimbursementData){
            if(annualReimbursement.personIDpProperty().get().compareTo(searchField.getText())==0||
                    annualReimbursement.personNamepProperty().get().compareTo(searchField.getText())==0){
                newAnnualReimbursementData.add(annualReimbursement);
            }else{
                System.out.println("");
            }
        }
        InformationTable.setItems(newAnnualReimbursementData);
    }

    @FXML
    void startReimbursement(ActionEvent event) {
        //将入院就诊信息写入文件
        String temp = personIDField.getText()+","+
                personNameField.getText()+","+
                institutionField.getText()+","+
                medicalCategoryField.getText()+","+
                drugIDField.getText()+","+
                admissionDate.getValue()+","+
                dischargeDate.getValue()+","+
                examineField.getText();
        try {
            String filename = "D:\\MedicalInsuranceSystem\\src\\AdmissionInformation.txt";
            File file = new File(filename);
            RandomAccessFile raf=new RandomAccessFile(file, "rw");
            //将写文件指针移到文件尾。
            raf.seek(raf.length());
            raf.writeBytes("\r\n" + temp);
            raf.close();

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            System.out.println("IOException");
        }

        //打开报销界面


        StartReimbursement startReimbursement = new StartReimbursement();
        Stage StartReimbursementStage = startReimbursement.setStartReimbursementStage(Main.getStage());
        StartReimbursementStage.setTitle("报销——国家医疗保险报销中心");
        try {
            Scene scene = new Scene(FXMLLoader.load(getClass().getResource("StartReimbursement.fxml")));
            StartReimbursementStage.setScene(scene);
            scene.getStylesheets().add(this.getClass().getResource("StartReimbursement.css").toExternalForm());
        } catch (Exception e) {
            e.printStackTrace();
        }





    }



    /**
     * 返回主菜单
     * */
    @FXML
    void backToMenu(ActionEvent event) {
        Stage primaryStage = Main.getStage();
        try {
            primaryStage.setTitle("Menu");
            Scene scene = new Scene(FXMLLoader.load(getClass().getResource("MenuController.fxml")));
            primaryStage.setScene(scene);
            scene.getStylesheets().add(this.getClass().getResource("Menu.css").toExternalForm());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
