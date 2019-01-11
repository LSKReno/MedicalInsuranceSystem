package controller;

import Data.*;
import IO.IO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by LSK.Reno on 2018/7/26 15:29.
 */

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class InformationMaintenController {
    private Stage informationMaintenStage;

    public Stage setInformationMaintenStage(Stage informationMaintenStage) {
        this.informationMaintenStage = informationMaintenStage;
        return informationMaintenStage;
    }
    @FXML
    private TableView<Drug> drugTable;

    @FXML
    private TableColumn<Drug, String> drugIDColumn;

    @FXML
    private TableColumn<Drug, String> drugNameColumn;

    @FXML
    private TextField searchDrugField;

    @FXML
    private Button searchDrugButton;

    @FXML
    private Label drugIDLabel;

    @FXML
    private Label drugNameLabel;

    @FXML
    private Label drugLevelLabel;

    @FXML
    private Label directoryIDLabel;

    @FXML
    private Button backToMenuButton;

    @FXML
    private Button addDrugButton;

    @FXML
    private TextField drugIDField;

    @FXML
    private TextField directoryIDField;

    @FXML
    private TextField drugLevelField;

    @FXML
    private TextField drugNameField;

    @FXML
    private TextField hospitalLevelField3;

    @FXML
    private TextField hospitalLevelField4;

    @FXML
    private TextField hospitalLevelField5;

    @FXML
    private TextField hospitalLevelField6;

    @FXML
    private Button changeDrugButton;

    @FXML
    private TextField drugIDField1;

    @FXML
    private TextField directoryIDField1;

    @FXML
    private TextField drugLevelField1;

    @FXML
    private TextField drugNameField1;

    @FXML
    private Button backToMenuButton2;

    @FXML
    private Button deleteDrugButton;

    @FXML
    private Label drugIDLabel1;

    @FXML
    private Label drugNameLabel1;

    @FXML
    private Label drugLevelLabel1;

    @FXML
    private Label directoryIDLabel1;

    @FXML
    private TableView<ClinicProject> ClinicProjectTable;

    @FXML
    private TableColumn<ClinicProject, String> clinicProjectIDColumn;

    @FXML
    private TableColumn<ClinicProject, String> clinicProjectNameColumn;

    @FXML
    private TextField searchClinicProjectField;

    @FXML
    private Button searchClinicProjectButton;

    @FXML
    private Label clinicProjectIDLabel;

    @FXML
    private Label clinicProjectNameLabel;

    @FXML
    private Label projectLevelLabel;

    @FXML
    private Button addClinicProjectButton;

    @FXML
    private TextField clinicProjectIDField;

    @FXML
    private TextField clinicProjectNameField;

    @FXML
    private TextField projectLevelField;

    @FXML
    private Button backToMenuButton1;

    @FXML
    private Button changeClinicProjectButton;

    @FXML
    private TextField clinicProjectIDField1;

    @FXML
    private TextField clinicProjectNameField1;

    @FXML
    private TextField projectLevelField1;

    @FXML
    private Button backToMenuButton21;

    @FXML
    private Button deleteClinicProjectButton;

    @FXML
    private Label clinicProjectIDLabel1;

    @FXML
    private Label clinicProjectNameLabel1;

    @FXML
    private Label projectLevelLabel1;

    @FXML
    private TableView<ServiceFacility> ServiceFacilityTable;

    @FXML
    private TableColumn<ServiceFacility, String> ServiceFacilityIDColumn;

    @FXML
    private TableColumn<ServiceFacility, String> ServiceFacilityNameColumn;

    @FXML
    private TextField searchServiceFacilityField;

    @FXML
    private Button searchServiceFacilityButton;

    @FXML
    private Label serviceFacilityIDLabel;

    @FXML
    private Label ServiceFacilityNameLabel;

    @FXML
    private Button ServiceFacilityButton;

    @FXML
    private TextField ServiceFacilityIDField;

    @FXML
    private TextField ServiceFacilityNameField;

    @FXML
    private Button backToMenuButton11;

    @FXML
    private Button changeServiceFacilityButton;

    @FXML
    private TextField ServiceFacilityIDField1;

    @FXML
    private TextField ServiceFacilityNameField1;

    @FXML
    private Button backToMenuButton211;

    @FXML
    private Button deleteServiceFacilityButton1;

    @FXML
    private Label serviceFacilityIDLabel1;

    @FXML
    private Label ServiceFacilityNameLabel1;

    @FXML
    private TableView<DiseaseInformation> DiseaseTable;

    @FXML
    private TableColumn<DiseaseInformation, String> diseaseIDColumn;

    @FXML
    private TableColumn<DiseaseInformation, String> diseaseNameColumn;

    @FXML
    private TextField searchDiseaseField;

    @FXML
    private Button searchDiseaseButton;

    @FXML
    private Label diseaseIDLabel;

    @FXML
    private Label diseaseNameLabel;

    @FXML
    private Button addDiseaseButton;

    @FXML
    private TextField diseaseIDField;

    @FXML
    private TextField diseaseNameField;

    @FXML
    private TextField diseaseExamineField;

    @FXML
    private Button backToMenuButton12;

    @FXML
    private Button changeDiseaseButton;

    @FXML
    private TextField diseaseIDField1;

    @FXML
    private TextField diseaseNameField1;

    @FXML
    private TextField diseaseExamineField1;

    @FXML
    private Button backToMenuButton212;

    @FXML
    private Button deleteDiseaseButton;

    @FXML
    private Label diseaseIDLabel1;

    @FXML
    private Label diseaseNameLabel1;

    @FXML
    private TableView<DesignatedMedicalInstitution> DesignatedMedicalInstitutionTable;

    @FXML
    private TableColumn<DesignatedMedicalInstitution, String> MedicalInstitutionIDColumn;

    @FXML
    private TableColumn<DesignatedMedicalInstitution, String> MedicalInstitutionNameColumn;

    @FXML
    private TextField searchMedicalInstitutionField;

    @FXML
    private Button searchMedicalInstitutionButton;

    @FXML
    private Label institutionIDLabel;

    @FXML
    private Label institutionNameLabel;

    @FXML
    private Label hospitalLevelLabel;

    @FXML
    private Button addInstitutionButton;

    @FXML
    private TextField institutionIDField;

    @FXML
    private TextField institutionNameField;

    @FXML
    private TextField hospitalLevelField;

    @FXML
    private Button backToMenuButton13;

    @FXML
    private Button changeInstitutionButton;

    @FXML
    private TextField institutionIDField1;

    @FXML
    private TextField institutionNameField1;

    @FXML
    private TextField hospitalLevelField1;

    @FXML
    private Button backToMenuButton213;

    @FXML
    private Button deleteInstitutionButton;

    @FXML
    private Label institutionIDLabel1;

    @FXML
    private Label institutionNameLabel1;

    @FXML
    private Label hospitalLevelLabel1;

    @FXML
    private TableView<MedicalCalculationParameter> MedicalCalculationParameterTable;

    @FXML
    private TableColumn<MedicalCalculationParameter, String> MedicalCategoryColumn;

    @FXML
    private TableColumn<MedicalCalculationParameter, String> TopLineColumn;

    @FXML
    private TextField searchParameterField;

    @FXML
    private Button searchTopLineButton;

    @FXML
    private Label MedicalCategoryLabel;

    @FXML
    private Label TopLineLabel;

    @FXML
    private Label PayStandardLabel;

    @FXML
    private Label lowerLimitLabel;

    @FXML
    private Label topLimitLabel;

    @FXML
    private Label PersonalExpenseRatioLabel;

    @FXML
    private Button addParameterButton;

    @FXML
    private TextField MedicalCategoryField;

    @FXML
    private TextField TopLineField;

    @FXML
    private TextField PayStandardField;

    @FXML
    private TextField topLimitField;

    @FXML
    private TextField lowerLimitField;

    @FXML
    private TextField PersonalExpenseRatioField;

    @FXML
    private Button backToMenuButton131;

    @FXML
    private Button changeParameterButton;

    @FXML
    private TextField MedicalCategoryField1;

    @FXML
    private TextField TopLineField1;

    @FXML
    private TextField PayStandardField1;

    @FXML
    private TextField hospitalLevelField2;

    @FXML
    private TextField topLimitField1;

    @FXML
    private TextField lowerLimitField1;

    @FXML
    private TextField PersonalExpenseRatioField1;

    @FXML
    private Button deleteParameterButton;

    @FXML
    private Label MedicalCategoryLabel1;

    @FXML
    private Label TopLineLabel1;

    @FXML
    private Label PayStandardLabel1;

    @FXML
    private Label hospitalLevelLabel2;

    @FXML
    private Label lowerLimitLabel1;

    @FXML
    private Label topLimitLabel1;

    @FXML
    private Label PersonalExpenseRatioLabel1;

    private ObservableList<Drug> drugData = FXCollections.observableArrayList();
    private ArrayList<Drug> drugList = new ArrayList<>();
    private ArrayList<Drug> addDrugList = new ArrayList<>();


    private ObservableList<ClinicProject> clinicProjectData = FXCollections.observableArrayList();
    private ArrayList<ClinicProject> clinicProjectList = new ArrayList<>();
    private ArrayList<ClinicProject> addClinicProjectList = new ArrayList<>();

    private ObservableList<ServiceFacility> serviceFacilityData = FXCollections.observableArrayList();
    private ArrayList<ServiceFacility> serviceFacilityList = new ArrayList<>();
    private ArrayList<ServiceFacility> addServiceFacilityList = new ArrayList<>();

    private ObservableList<DiseaseInformation> diseaseInformationData = FXCollections.observableArrayList();
    private ArrayList<DiseaseInformation> diseaseInformationList = new ArrayList<>();
    private ArrayList<DiseaseInformation> addDiseaseInformationList = new ArrayList<>();

    @FXML
    public void initialize() {
        /**加载药品信息进入列表中，并设置监听器与左边属性关联*/
        IO.loadDrug(drugList);
        for(Drug drug:drugList){
            Drug drug1 = new Drug(drug.getDrugID(),drug.getDrugName());
            drugData.add(drug1);
        }

        drugIDColumn.setCellValueFactory(cellData -> cellData.getValue().drugIDpProperty());
        drugNameColumn.setCellValueFactory(cellData -> cellData.getValue().drugNamepProperty());
        drugTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> showDrugDetails(newValue));
        drugTable.setItems(drugData);
        /**加载诊疗项目信息进入列表中，并设置监听器与左边属性关联*/
        IO.loadClinicProject(clinicProjectList);
        for(ClinicProject clinicProject:clinicProjectList){
            ClinicProject clinicProject1 = new ClinicProject(clinicProject.getProjectID(), clinicProject.getProjectName());
            clinicProjectData.add(clinicProject1);
        }
        clinicProjectIDColumn.setCellValueFactory(cellData -> cellData.getValue().projectIDpProperty());
        clinicProjectNameColumn.setCellValueFactory(cellData -> cellData.getValue().projectNamepProperty());
        ClinicProjectTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> showClinicProjectDetails(newValue));
        ClinicProjectTable.setItems(clinicProjectData);
        /**加载服务设施信息进入列表中，并设置监听器与左边属性关联*/
        IO.loadServiceFacility(serviceFacilityList);
        for(ServiceFacility serviceFacility:serviceFacilityList){
            ServiceFacility serviceFacility1 = new ServiceFacility(serviceFacility.getFacilityIDp(),serviceFacility.getFacilityNamep());
            serviceFacilityData.add(serviceFacility1);
        }
        ServiceFacilityIDColumn.setCellValueFactory(cellData -> cellData.getValue().facilityIDpProperty());
        ServiceFacilityNameColumn.setCellValueFactory(cellData -> cellData.getValue().facilityNamepProperty());
        ServiceFacilityTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> showServiceFacilityDetails(newValue));
        ServiceFacilityTable.setItems(serviceFacilityData);

        /**加载病种信息进入列表中，并设置监听器与左边属性关联*/
        IO.loadDiseaseInformation(diseaseInformationList);
        for(DiseaseInformation diseaseInformation:diseaseInformationList){
            DiseaseInformation diseaseInformation1 = new DiseaseInformation(diseaseInformation.getDiseaseIDp(),diseaseInformation.getDiseaseTypep());
            diseaseInformationData.add(diseaseInformation1);
        }
        diseaseIDColumn.setCellValueFactory(cellData -> cellData.getValue().diseaseIDpProperty());
        diseaseNameColumn.setCellValueFactory(cellData -> cellData.getValue().diseaseTypepProperty());
        DiseaseTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> showDiseaseInformationDetails(newValue));
        DiseaseTable.setItems(diseaseInformationData);

    }
    private void showDrugDetails(Drug drug) {
        if (drug != null) {
            drugIDLabel.setText(drug.drugIDpProperty().get());
            drugNameLabel.setText(drug.drugNamepProperty().get());

            drugIDField1.setText(drug.drugIDpProperty().get());
            drugNameField1.setText(drug.drugNamepProperty().get());

            drugIDLabel1.setText(drug.drugIDpProperty().get());
            drugNameLabel1.setText(drug.drugNamepProperty().get());
        } else {
            drugIDLabel.setText("");
            drugNameLabel.setText("");
        }
    }
    private void showClinicProjectDetails(ClinicProject clinicProject) {
        if (clinicProject != null) {
            clinicProjectIDLabel.setText(clinicProject.projectIDpProperty().get());
            clinicProjectNameLabel.setText(clinicProject.projectNamepProperty().get());

            clinicProjectIDField1.setText(clinicProject.projectIDpProperty().get());
            clinicProjectNameField1.setText(clinicProject.projectNamepProperty().get());

            clinicProjectIDLabel1.setText(clinicProject.projectIDpProperty().get());
            clinicProjectNameLabel1.setText(clinicProject.projectNamepProperty().get());


        } else {
            drugIDLabel.setText("");
            drugNameLabel.setText("");
        }
    }
    private void showServiceFacilityDetails(ServiceFacility serviceFacility){
        if (serviceFacility != null) {
            serviceFacilityIDLabel.setText(serviceFacility.facilityIDpProperty().get());
            ServiceFacilityNameLabel.setText(serviceFacility.facilityNamepProperty().get());

            ServiceFacilityIDField1.setText(serviceFacility.facilityIDpProperty().get());
            ServiceFacilityNameField1.setText(serviceFacility.facilityNamepProperty().get());

            serviceFacilityIDLabel1.setText(serviceFacility.facilityIDpProperty().get());
            ServiceFacilityNameLabel1.setText(serviceFacility.facilityNamepProperty().get());


        } else {
            serviceFacilityIDLabel.setText("");
            ServiceFacilityNameLabel.setText("");
        }

    }
    private void showDiseaseInformationDetails(DiseaseInformation diseaseInformation){
        if (diseaseInformation != null) {
            diseaseIDLabel.setText(diseaseInformation.diseaseIDpProperty().get());
            diseaseNameLabel.setText(diseaseInformation.diseaseTypepProperty().get());

            diseaseIDLabel1.setText(diseaseInformation.diseaseIDpProperty().get());
            diseaseNameLabel1.setText(diseaseInformation.diseaseTypepProperty().get());

            diseaseIDField1.setText(diseaseInformation.diseaseIDpProperty().get());
            diseaseNameField1.setText(diseaseInformation.diseaseTypepProperty().get());



        } else {
            diseaseIDLabel.setText("");
            diseaseNameLabel.setText("");
        }
    }

    @FXML
    void addDrug(ActionEvent event) {
        String temp = drugIDField.getText()+","+
                drugNameField.getText()+","+
                drugLevelField.getText()+","+
                hospitalLevelField3.getText();
        try {
            String filename = "D:\\MedicalInsuranceSystem\\src\\Drug.txt";
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
        IO.loadAddDrug(addDrugList);
        for(Drug drug:addDrugList){
            Drug drug1 = new Drug(drug.getDrugID(),drug.getDrugName());
            drugData.add(drug1);
        }
        drugIDColumn.setCellValueFactory(cellData -> cellData.getValue().drugIDpProperty());
        drugNameColumn.setCellValueFactory(cellData -> cellData.getValue().drugNamepProperty());
    }
    @FXML
    void addClinicProject(ActionEvent event) {
        String temp = clinicProjectIDField.getText()+","+
                clinicProjectNameField.getText()+","+
                projectLevelField.getText()+","+
                hospitalLevelField5.getText();
        try {
            String filename = "D:\\MedicalInsuranceSystem\\src\\ClinicProject.txt";
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
        IO.loadAddClinicProject(addClinicProjectList);
        for(ClinicProject clinicProject:addClinicProjectList){
            ClinicProject clinicProject1 = new ClinicProject(clinicProject.getProjectID(), clinicProject.getProjectName());
            clinicProjectData.add(clinicProject1);
        }
        clinicProjectIDColumn.setCellValueFactory(cellData -> cellData.getValue().projectIDpProperty());
        clinicProjectNameColumn.setCellValueFactory(cellData -> cellData.getValue().projectNamepProperty());
    }
    @FXML
    void addServiceFacility(ActionEvent event) {
        String temp = ServiceFacilityIDField.getText()+","+
                ServiceFacilityNameField.getText();
        try {
            String filename = "D:\\MedicalInsuranceSystem\\src\\ServiceFacility.txt";
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
        IO.loadAddServiceFacility(addServiceFacilityList);
        for(ServiceFacility serviceFacility:addServiceFacilityList){
            ServiceFacility serviceFacility1 = new ServiceFacility(serviceFacility.getFacilityIDp(),serviceFacility.getFacilityNamep());
            serviceFacilityData.add(serviceFacility1);
        }
        ServiceFacilityIDColumn.setCellValueFactory(cellData -> cellData.getValue().facilityIDpProperty());
        ServiceFacilityNameColumn.setCellValueFactory(cellData -> cellData.getValue().facilityNamepProperty());
    }
    @FXML
    void addDisease(ActionEvent event) {
        String temp = diseaseIDField.getText()+","+
                diseaseNameField.getText();
        try {
            String filename = "D:\\MedicalInsuranceSystem\\src\\DiseaseInformation.txt";
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
        IO.loadAddDiseaseInformation(addDiseaseInformationList);
        for(DiseaseInformation diseaseInformation:addDiseaseInformationList){
            DiseaseInformation diseaseInformation1 = new DiseaseInformation(diseaseInformation.getDiseaseIDp(),diseaseInformation.getDiseaseTypep());
            diseaseInformationData.add(diseaseInformation1);
        }
        diseaseIDColumn.setCellValueFactory(cellData -> cellData.getValue().diseaseIDpProperty());
        diseaseNameColumn.setCellValueFactory(cellData -> cellData.getValue().diseaseTypepProperty());
    }



    @FXML
    void addInstitution(ActionEvent event) {

    }

    @FXML
    void addParameter(ActionEvent event) {

    }



    @FXML
    void changeClinicProject(ActionEvent event) {

    }

    @FXML
    void changeDisease(ActionEvent event) {

    }

    @FXML
    void changeDrug(ActionEvent event) {

    }

    @FXML
    void changeInstitution(ActionEvent event) {

    }

    @FXML
    void changeParameter(ActionEvent event) {

    }

    @FXML
    void changeServiceFacility(ActionEvent event) {

    }

    @FXML
    void deleteClinicProject(ActionEvent event) {
        //进行列表中的删除
        int selectedIndex = ClinicProjectTable.getSelectionModel().getSelectedIndex();
        ClinicProjectTable.getItems().remove(selectedIndex);
        //进行文件中的删除
    }

    @FXML
    void deleteDisease(ActionEvent event) {
        //进行列表中的删除
        int selectedIndex = DiseaseTable.getSelectionModel().getSelectedIndex();
        DiseaseTable.getItems().remove(selectedIndex);
        //进行文件中的删除
    }

    @FXML
    void deleteDrug(ActionEvent event) {
        //进行列表中的删除
        int selectedIndex = drugTable.getSelectionModel().getSelectedIndex();
        drugTable.getItems().remove(selectedIndex);
        //进行文件中的删除
    }

    @FXML
    void deleteInstitution(ActionEvent event) {
        //进行列表中的删除
        int selectedIndex = DesignatedMedicalInstitutionTable.getSelectionModel().getSelectedIndex();
        DesignatedMedicalInstitutionTable.getItems().remove(selectedIndex);
        //进行文件中的删除
    }

    @FXML
    void deleteParameter(ActionEvent event) {

    }

    @FXML
    void deleteServiceFacility(ActionEvent event) {
        //进行列表中的删除
        int selectedIndex = ServiceFacilityTable.getSelectionModel().getSelectedIndex();
        ServiceFacilityTable.getItems().remove(selectedIndex);
        //进行文件中的删除
    }


    /**极其完美的一次对ID和名称进行搜索的编码*/
    @FXML
    void searchDrug(ActionEvent event) {
        ObservableList<Drug> newDrugData = FXCollections.observableArrayList();
        for(Drug drug:drugData){
            if(drug.drugIDpProperty().get().compareTo(searchDrugField.getText())==0||
                    drug.drugNamepProperty().get().compareTo(searchDrugField.getText())==0){
                newDrugData.add(drug);
            }else{
                System.out.println("");
            }
        }
        drugTable.setItems(newDrugData);
    }

    @FXML
    void searchClinicProject(ActionEvent event) {
        ObservableList<ClinicProject> newClinicProjectData = FXCollections.observableArrayList();
        for(ClinicProject clinicProject:clinicProjectData){
            if(clinicProject.projectIDpProperty().get().compareTo(searchClinicProjectField.getText())==0||
                    clinicProject.projectNamepProperty().get().compareTo(searchClinicProjectField.getText())==0){
                newClinicProjectData.add(clinicProject);
            }else{
                System.out.println("");
            }
        }
        ClinicProjectTable.setItems(newClinicProjectData);
    }

    @FXML
    void searchServiceFacility(ActionEvent event) {
        ObservableList<ServiceFacility> newServiceFacilityData = FXCollections.observableArrayList();
        for(ServiceFacility serviceFacility:serviceFacilityData){
            if(serviceFacility.facilityIDpProperty().get().compareTo(searchServiceFacilityField.getText())==0||
                    serviceFacility.facilityNamepProperty().get().compareTo(searchServiceFacilityField.getText())==0){
                newServiceFacilityData.add(serviceFacility);
            }else{
                System.out.println("");
            }
        }
        ServiceFacilityTable.setItems(newServiceFacilityData);
    }

    @FXML
    void searchDisease(ActionEvent event) {
        ObservableList<DiseaseInformation> newDiseaseInformationData = FXCollections.observableArrayList();
        for(DiseaseInformation diseaseInformation:diseaseInformationData){
            if(diseaseInformation.diseaseIDpProperty().get().compareTo(searchDiseaseField.getText())==0||
                    diseaseInformation.diseaseTypepProperty().get().compareTo(searchDiseaseField.getText())==0){
                newDiseaseInformationData.add(diseaseInformation);
            }else{
                System.out.println("");
            }
        }
        DiseaseTable.setItems(newDiseaseInformationData);
    }

    @FXML
    void searchMedicalInstitution(ActionEvent event) {
//        ObservableList<Drug> newDrugData = FXCollections.observableArrayList();
//        for(Drug drug:drugData){
//            if(drug.drugIDpProperty().get().compareTo(searchDrugField.getText())==0||
//                    drug.drugNamepProperty().get().compareTo(searchDrugField.getText())==0){
//                newDrugData.add(drug);
//            }else{
//                System.out.println("");
//            }
//        }
//        drugTable.setItems(newDrugData);
    }

    @FXML
    void searchTopLine(ActionEvent event) {

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