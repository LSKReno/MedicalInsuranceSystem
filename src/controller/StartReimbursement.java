package controller;

import Data.*;
import IO.IO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by LSK.Reno on 2018/7/31 9:09.
 */
public class StartReimbursement {
    private Stage StartReimbursementStage;
    public  Stage setStartReimbursementStage(Stage StartReimbursementStage) {
        this.StartReimbursementStage = StartReimbursementStage;
        return StartReimbursementStage;
    }
    @FXML
    private TableView<PrescriptionInformation> ReimbursementTable;

    @FXML
    private TableColumn<PrescriptionInformation, String> personIDColumn;

    @FXML
    private TableColumn<PrescriptionInformation, String> admissionIDColumn;

    @FXML
    private TableColumn<PrescriptionInformation, String> projectCategoryColumn;

    @FXML
    private TableColumn<PrescriptionInformation, String> projectNameColumn;

    @FXML
    private TableColumn<PrescriptionInformation, String> expenseColumn;

    @FXML
    private TextField personIDLabel;

    @FXML
    private TextField admissionIDLabel;

    @FXML
    private TextField projectNameLabel;

    @FXML
    private TextField expenseLabel;

    @FXML
    private Label drugLabel;

    @FXML
    private GridPane myPersonGridPane1;

    @FXML
    private TextField personIDLabel1;

    @FXML
    private TextField admissionIDLabel1;

    @FXML
    private TextField projectNameLabel1;

    @FXML
    private TextField expenseLabel1;

    @FXML
    private Label clinicProjectLabel;

    @FXML
    private Button budgetButton1;

    @FXML
    private Button reimbursementButton1;

    @FXML
    private Button cancelReimbursementButton1;

    @FXML
    private Button backButton1;

    @FXML
    private GridPane myPersonGridPane11;

    @FXML
    private TextField personIDLabel11;

    @FXML
    private TextField admissionIDLabel11;

    @FXML
    private TextField projectNameLabel11;

    @FXML
    private TextField expenseLabel11;

    @FXML
    private Label ServiceFacilityLabel;

    @FXML
    private Button backButton2;

    @FXML
    private Button cancelReimbursementButton2;

    @FXML
    private Button reimbursementButton2;

    @FXML
    private Button budgetButton2;

    @FXML
    private Button backButton;

    @FXML
    private Button budgetButton;

    @FXML
    private Button reimbursementButton;

    @FXML
    private Button cancelReimbursementButton;

    @FXML
    private Button drugSearch;

    @FXML
    private Button projectSearch;

    @FXML
    private Button facilitySearch;

    @FXML
    private Label search1;
    @FXML
    private Label search2;
    @FXML
    private Label search3;
    @FXML
    private GridPane myPersonGridPane;
    @FXML
    private TextField searchUnreimbursedBudgetField;
    @FXML
    private Button searchUnreimbursedBudgetButton;

    ObservableList<PrescriptionInformation> PrescriptionInformationData = FXCollections.observableArrayList();
    //药品预结算
    @FXML
    void budget1(ActionEvent event) {
        String personID = personIDLabel.getText();
        String admissionID = admissionIDLabel.getText();
        String projectName = projectNameLabel.getText();
        String expense = expenseLabel.getText();
        PrescriptionInformation prescriptionInformation = new PrescriptionInformation(personID,admissionID ,
                "Drug",projectName ,expense );
        PrescriptionInformationData.add(prescriptionInformation );

        personIDColumn.setCellValueFactory(cellData -> cellData.getValue().personIDpProperty());
        admissionIDColumn.setCellValueFactory(cellData -> cellData.getValue().admissionIDpProperty());
        projectCategoryColumn.setCellValueFactory(cellData -> cellData.getValue().projectCategorypProperty());
        projectNameColumn.setCellValueFactory(cellData -> cellData.getValue().projectNamepProperty());
        expenseColumn.setCellValueFactory(cellData -> cellData.getValue().expensepProperty());

        ReimbursementTable.setItems(PrescriptionInformationData);
        personIDLabel.clear();
        admissionIDLabel.clear();
        projectNameLabel.clear();
        expenseLabel.clear();
    }
    //诊疗项目预结算
    @FXML
    void budget2(ActionEvent event) {
        String personID1 = personIDLabel1.getText();
        String admissionID1 = admissionIDLabel1.getText();
        String projectName1 = projectNameLabel1.getText();
        String expense1 = expenseLabel1.getText();
        PrescriptionInformation prescriptionInformation1 = new PrescriptionInformation(personID1,admissionID1 ,
                "ClinicProject",projectName1 ,expense1 );
        PrescriptionInformationData.add(prescriptionInformation1 );

        personIDColumn.setCellValueFactory(cellData -> cellData.getValue().personIDpProperty());
        admissionIDColumn.setCellValueFactory(cellData -> cellData.getValue().admissionIDpProperty());
        projectCategoryColumn.setCellValueFactory(cellData -> cellData.getValue().projectCategorypProperty());
        projectNameColumn.setCellValueFactory(cellData -> cellData.getValue().projectNamepProperty());
        expenseColumn.setCellValueFactory(cellData -> cellData.getValue().expensepProperty());

        ReimbursementTable.setItems(PrescriptionInformationData);
        personIDLabel1.clear();
        admissionIDLabel1.clear();
        projectNameLabel1.clear();
        expenseLabel1.clear();
    }
    //服务设施预结算
    @FXML
    void budget3(ActionEvent event) {
        String personID11 = personIDLabel11.getText();
        String admissionID11 = admissionIDLabel11.getText();
        String projectName11 = projectNameLabel11.getText();
        String expense11 = expenseLabel11.getText();
        PrescriptionInformation prescriptionInformation11 = new PrescriptionInformation(personID11,admissionID11 ,
                "ServiceFacility",projectName11 ,expense11 );
        PrescriptionInformationData.add(prescriptionInformation11);

        personIDColumn.setCellValueFactory(cellData -> cellData.getValue().personIDpProperty());
        admissionIDColumn.setCellValueFactory(cellData -> cellData.getValue().admissionIDpProperty());
        projectCategoryColumn.setCellValueFactory(cellData -> cellData.getValue().projectCategorypProperty());
        projectNameColumn.setCellValueFactory(cellData -> cellData.getValue().projectNamepProperty());
        expenseColumn.setCellValueFactory(cellData -> cellData.getValue().expensepProperty());
        ReimbursementTable.setItems(PrescriptionInformationData);
        personIDLabel11.clear();
        admissionIDLabel11.clear();
        projectNameLabel11.clear();
        expenseLabel11.clear();
    }

    /**查询是否此人员有未报销住院信息*/
    private ArrayList<PrescriptionInformation> unreimbursedBudgetList = new ArrayList<>();
    @FXML
    void searchUnreimbursedBudget(ActionEvent event) {
        IO.loadUnreimbursedBudget(unreimbursedBudgetList);
        for(PrescriptionInformation prescriptionInformation:unreimbursedBudgetList){
            PrescriptionInformation prescriptionInformation1 = new PrescriptionInformation(prescriptionInformation.getPersonID(),
                    prescriptionInformation.getAdmissionID(),prescriptionInformation.getProjectCategory() ,
                    prescriptionInformation.getProjectName(),prescriptionInformation.getExpense());
            PrescriptionInformationData.add(prescriptionInformation1);
        }

        personIDColumn.setCellValueFactory(cellData -> cellData.getValue().personIDpProperty());
        admissionIDColumn.setCellValueFactory(cellData -> cellData.getValue().admissionIDpProperty());
        projectCategoryColumn.setCellValueFactory(cellData -> cellData.getValue().projectCategorypProperty());
        projectNameColumn.setCellValueFactory(cellData -> cellData.getValue().projectNamepProperty());
        expenseColumn.setCellValueFactory(cellData -> cellData.getValue().expensepProperty());

        ReimbursementTable.setItems(PrescriptionInformationData);
    }

    //进行报销的计算
    private double reimExpense = 0;
    private double personaLExpense = 0;
    String personID = "0002";
    @FXML
    void reimbursement(ActionEvent event) {
        for (PrescriptionInformation prescriptionInformation:PrescriptionInformationData) {
            String category = prescriptionInformation.getProjectCategory();
            String name = prescriptionInformation.getProjectName();
            personID = prescriptionInformation.getPersonID();
//            double money = Double.parseDouble(prescriptionInformation.getExpense());
            double money = Double.parseDouble("".equals(prescriptionInformation.getExpense())?
                    "167":prescriptionInformation.getExpense());
            if (category.equals("Drug")){
                try{
                    String filename = "D:\\MedicalInsuranceSystem\\src\\Drug.txt";
                    File file = new File(filename);
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    String temp;
                    int i = 1;
                    while((temp = reader.readLine()) != null) {
                        if(i >= 2 ){
                            String drugName = temp.split(",")[1];
                            String drugLevel = temp.split(",")[2];
//                            String hospitalLevel = temp.split(",")[3];
                            if (drugName.equals(name)){
                                if (drugLevel.equals("1")){
                                    reimExpense += money;
                                }
                                else if(drugLevel.equals("2")){
                                    reimExpense = reimExpense + money * 0.5;
                                    personaLExpense = personaLExpense + money * 0.5;
                                }
                                else {
                                    reimExpense += 0;
                                    personaLExpense += money;
                                }
                                break;
                            }
                        }
                        i++;
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("FileNotFoundException");
                } catch (IOException e) {
                    System.out.println("IOException");
                }
            }
            else if (category.equals("ClinicProject")){
                try{
                    String filename = "D:\\MedicalInsuranceSystem\\src\\ClinicProject.txt";
                    File file = new File(filename);
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    String temp;
                    int i = 1;
                    while((temp = reader.readLine()) != null) {
                        if(i >= 2 ){
                            String projectName = temp.split(",")[1];
                            String projectLevel = temp.split(",")[2];
//                            String hospitalLevel = temp.split(",")[3];
                            if (projectName.equals(name)){
                                if (projectLevel.equals("1")){
                                    reimExpense += money;
                                }
                                else if(projectLevel.equals("2")){
                                    reimExpense = reimExpense + money * 0.5;
                                    personaLExpense = personaLExpense + money * 0.5;

                                }
                                else {
                                    reimExpense += 0;
                                    personaLExpense += money;
                                }
                                break;
                            }
                        }
                        i++;
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("FileNotFoundException");
                } catch (IOException e) {
                    System.out.println("IOException");
                }
            }

            else{
                reimExpense += money;
            }
        }

        //lastReimbursement
        String temp = reimExpense +","+personaLExpense+","+personID;
        try {
            String filename = "D:\\MedicalInsuranceSystem\\src\\lastReimbursement.txt";
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

        ReimbursementSuccess reimbursementSuccess = new ReimbursementSuccess();
        Stage ReimbursementSuccessStage = reimbursementSuccess.setReimbursementSuccessStage(Main.getStage());
        ReimbursementSuccessStage.setTitle("报销——国家医疗保险报销中心");
        try {
            Scene scene = new Scene(FXMLLoader.load(getClass().getResource("ReimbursementSuccess.fxml")));
            ReimbursementSuccessStage.setScene(scene);
            scene.getStylesheets().add(this.getClass().getResource("ReimbursementSuccess.css").toExternalForm());
        } catch (Exception e) {
            e.printStackTrace();
        }





    }

    //分别从药品，诊疗项目，服务设施文件中查找是否在可报销的项目目录中。
    @FXML
    void drugSearch(ActionEvent event) {
        String projectName = projectNameLabel.getText();
        try{
            String filename = "D:\\MedicalInsuranceSystem\\src\\Drug.txt";
            File file = new File(filename);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String temp;
            int i = 1;
            boolean flug = true;
            while((temp = reader.readLine()) != null) {
                if(i >= 2 ){
                    String drugName = temp.split(",")[1];
                    if (drugName.equals(projectName)){
                        search1.setText("检索成功！");
                        flug = false;
                        break;
                    }
                }
                i++;
            }
            if (flug){
                search1.setText("检索失败！");
                personIDLabel.clear();
                admissionIDLabel.clear();
                projectNameLabel.clear();
                expenseLabel.clear();
            }

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }
    @FXML
    void projectSearch(ActionEvent event) {
        String projectName = projectNameLabel1.getText();
        try{
            String filename = "D:\\MedicalInsuranceSystem\\src\\ClinicProject.txt";
            File file = new File(filename);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String temp;
            int i = 1;
            boolean flug = true;
            while((temp = reader.readLine()) != null) {
                if(i >= 2 ){
                    String ClinicProjectName = temp.split(",")[1];
                    if (ClinicProjectName.equals(projectName)){
                        search2.setText("检索成功！");
                        flug = false;
                        break;
                    }
                }
                i++;
            }
            if (flug){
                search2.setText("检索失败！");
                personIDLabel1.clear();
                admissionIDLabel1.clear();
                projectNameLabel1.clear();
                expenseLabel1.clear();
            }

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }
    @FXML
    void facilitySearch(ActionEvent event) {
        String projectName = projectNameLabel11.getText();
        try{
            String filename = "D:\\MedicalInsuranceSystem\\src\\ServiceFacility.txt";
            File file = new File(filename);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String temp;
            int i = 1;
            boolean flug = true;
            while((temp = reader.readLine()) != null) {
                if(i >= 2 ){
                    String FacilityName = temp.split(",")[1];
                    if (FacilityName.equals(projectName)){
                        search3.setText("检索成功！");
                        flug = false;
                        break;
                    }
                }
                i++;
            }
            if (flug){
                search3.setText("检索失败！");
                personIDLabel11.clear();
                admissionIDLabel11.clear();
                projectNameLabel11.clear();
                expenseLabel11.clear();
            }

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }


    //取消报销
    @FXML
    void cancelReimbursement(ActionEvent event) {
        int selectedIndex = ReimbursementTable.getSelectionModel().getSelectedIndex();
        ReimbursementTable.getItems().remove(selectedIndex);
//        PrescriptionInformationData.remove(selectedIndex);
    }



    //返回上一界面
    @FXML
    void backToScene(ActionEvent event) {
        /**对未进行报销的住院信息进行保存，以便下次重新报销*/
        for (PrescriptionInformation prescriptionInformation:PrescriptionInformationData) {

            String temp = prescriptionInformation.getPersonIDp()+","+
                    prescriptionInformation.getAdmissionIDp()+","+prescriptionInformation.getProjectCategoryp()+","+
                    prescriptionInformation.getProjectNamep()+","+prescriptionInformation.getExpensep();
            try{
                String filename = "D:\\MedicalInsuranceSystem\\src\\UnreimbursedBudget.txt";
                File file = new File(filename);
                RandomAccessFile raf=new RandomAccessFile(file, "rw");
                //将写文件指针移到文件尾。
                raf.seek(raf.length());
                raf.writeBytes("\r\n" + temp);
                raf.close();

            }catch (FileNotFoundException e) {
                System.out.println("FileNotFoundException");
            } catch (IOException e) {
                System.out.println("IOException");
            }
        }


        Stage primaryStage = Main.getStage();
        try {
            primaryStage.setTitle("报销——国家医疗保险报销中心");
            Scene scene = new Scene(FXMLLoader.load(getClass().getResource("ReimbursementController.fxml")));
            primaryStage.setScene(scene);
            scene.getStylesheets().add(this.getClass().getResource("ReimbursementController.css").toExternalForm());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}





































