package controller;

/**
 * Created by LSK.Reno on 2018/7/26 15:28.
 */
import Data.Company;
import Data.Person;
import IO.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.*;
import java.util.ArrayList;

public class CommonBusinessController {
    private Stage CommonBusinessStage;
    public Stage setCommonBusinessStage(Stage CommonBusinessStage) {
        this.CommonBusinessStage = CommonBusinessStage;
        return CommonBusinessStage;
    }
    @FXML
    private TableView<Person> PersonTable;

    @FXML
    private TableColumn<Person, String> PersonIDColumn;

    @FXML
    private TableColumn<Person, String> PersonNameColumn;

    @FXML
    private TableColumn<Person, String> institutionIDColumn;

    @FXML
    private TextField searchPersonField;

    @FXML
    private Button searchPersonButton;

    @FXML
    private TabPane myPersonTabPane;

    @FXML
    private Tab seePersonTab;

    @FXML
    private Label personIDLabel;

    @FXML
    private Label personNameLabel;

    @FXML
    private Label personInstitutionIDLabel;

    @FXML
    private Label personCategoryLabel;

    @FXML
    private Button backToMenuButton;

    @FXML
    private Button addPersonButton;

    @FXML
    private TextField PersonIDField;

    @FXML
    private TextField PersonNameField;

    @FXML
    private TextField PersonInstitutionIDField;

    @FXML
    private ComboBox<String> cardCategoryBox;

    @FXML
    private ComboBox<String> retirementBox;

    @FXML
    private ComboBox<String> householdBox;

    @FXML
    private ComboBox<String> medicalCategoryBox;

    @FXML
    private ComboBox<String> genderBox;

    @FXML
    private ComboBox<String> educationLevelBox;

    @FXML
    private ComboBox<String> PoliticalBox;

    @FXML
    private ComboBox<String> MaritalBox;

    @FXML
    private Tab changePersonTab;

    @FXML
    private Button changePersonButton;

    @FXML
    private TextField PersonIDField1;

    @FXML
    private TextField PersonNameField1;

    @FXML
    private TextField PersonInstitutionIDField1;

    @FXML
    private ComboBox<String> cardCategoryBox1;

    @FXML
    private ComboBox<String> retirementBox1;

    @FXML
    private ComboBox<String> householdBox1;

    @FXML
    private ComboBox<String> medicalCategoryBox1;

    @FXML
    private ComboBox<String> genderBox1;

    @FXML
    private ComboBox<String> educationLevelBox1;

    @FXML
    private ComboBox<String> PoliticalBox1;

    @FXML
    private ComboBox<String> MaritalBox1;

    @FXML
    private Tab deletePersonTab;

    @FXML
    private Label personIDLabel1;

    @FXML
    private Label personNameLabel1;

    @FXML
    private Label personInstitutionIDLabel1;

    @FXML
    private Label personCategoryLabel1;

    @FXML
    private Button deletePersonButton;

    @FXML
    private TableView<Company> companyTable;

    @FXML
    private TableColumn<Company, String> companyIDColumn;

    @FXML
    private TableColumn<Company, String> companyNameColumn;

    @FXML
    private TextField searchCompanyField;

    @FXML
    private Button searchCompanyButton;

    @FXML
    private Button backToMenuButton1;

    @FXML
    private Button addCompanyButton;

    @FXML
    private Button changeCompanyButton;

    @FXML
    private Button backToMenuButton2;

    @FXML
    private Button deleteCompanyButton;


    private ObservableList<Person> personData = FXCollections.observableArrayList();
    private ArrayList<Person> personList = new ArrayList<>();

    private ArrayList<Person> addPersonList = new ArrayList<>();
    private ArrayList<Person> changedPersonList = new ArrayList<>();

    /**初始化人员界面信息*/
    @FXML
    public void initialize() {
        ComboBox cardCategoryBox=(ComboBox) myPersonTabPane.lookup("#cardCategoryBox");
        ObservableList<String> cardCategoryList = FXCollections.observableArrayList("身份证","军官证");
        cardCategoryBox.setItems(cardCategoryList);

        ComboBox genderBox=(ComboBox) myPersonTabPane.lookup("#genderBox");
        ObservableList<String> genderList = FXCollections.observableArrayList("男","女");
        genderBox.setItems(genderList);
        ComboBox retirementBox=(ComboBox) myPersonTabPane.lookup("#retirementBox");
        ObservableList<String> retirementList = FXCollections.observableArrayList("0","1");
        retirementBox.setItems(retirementList);
        ComboBox educationLevelBox=(ComboBox) myPersonTabPane.lookup("#educationLevelBox");
        ObservableList<String> educationLevelList = FXCollections.observableArrayList("中专","大专","本科","研究生","博士");
        educationLevelBox.setItems(educationLevelList);
        ComboBox householdBox=(ComboBox) myPersonTabPane.lookup("#householdBox");
        ObservableList<String> householdList = FXCollections.observableArrayList("农村户口","城市户口");
        householdBox.setItems(householdList);// MaritalBox
        ComboBox PoliticalBox=(ComboBox) myPersonTabPane.lookup("#PoliticalBox");
        ObservableList<String> PoliticalList = FXCollections.observableArrayList("中国共产党党员","共青团团员","群众");
        PoliticalBox.setItems(PoliticalList);
        ComboBox MaritalBox=(ComboBox) myPersonTabPane.lookup("#MaritalBox");
        ObservableList<String> MaritalList = FXCollections.observableArrayList("未婚","已婚");
        MaritalBox.setItems(MaritalList);
        ComboBox medicalCategoryBox=(ComboBox) myPersonTabPane.lookup("#medicalCategoryBox");
        ObservableList<String> medicalCategoryList = FXCollections.observableArrayList("11", "21", "40", "41");
        medicalCategoryBox.setItems(medicalCategoryList);

        ComboBox cardCategoryBox1=(ComboBox) myPersonTabPane.lookup("#cardCategoryBox1");
        ObservableList<String> cardCategoryList1 = FXCollections.observableArrayList("身份证","军官证");
        cardCategoryBox1.setItems(cardCategoryList1);
        ComboBox genderBox1=(ComboBox) myPersonTabPane.lookup("#genderBox1");
        ObservableList<String> genderList1 = FXCollections.observableArrayList("男","女");
        genderBox1.setItems(genderList1);
        ComboBox retirementBox1=(ComboBox) myPersonTabPane.lookup("#retirementBox1");
        ObservableList<String> retirementList1 = FXCollections.observableArrayList("0","1");
        retirementBox1.setItems(retirementList1);
        ComboBox educationLevelBox1=(ComboBox) myPersonTabPane.lookup("#educationLevelBox1");
        ObservableList<String> educationLevelList1 = FXCollections.observableArrayList("中专","大专","本科","研究生","博士");
        educationLevelBox1.setItems(educationLevelList1);
        ComboBox householdBox1=(ComboBox) myPersonTabPane.lookup("#householdBox1");
        ObservableList<String> householdList1 = FXCollections.observableArrayList("农村户口","城市户口");
        householdBox1.setItems(householdList1);// MaritalBox
        ComboBox PoliticalBox1=(ComboBox) myPersonTabPane.lookup("#PoliticalBox1");
        ObservableList<String> PoliticalList1 = FXCollections.observableArrayList("中国共产党党员","共青团团员","群众");
        PoliticalBox1.setItems(PoliticalList1);
        ComboBox MaritalBox1=(ComboBox) myPersonTabPane.lookup("#MaritalBox1");
        ObservableList<String> MaritalList1 = FXCollections.observableArrayList("未婚","已婚");
        MaritalBox1.setItems(MaritalList1);
        ComboBox medicalCategoryBox1=(ComboBox) myPersonTabPane.lookup("#medicalCategoryBox1");
        ObservableList<String> medicalCategoryList1 = FXCollections.observableArrayList("11", "21", "40", "41");
        medicalCategoryBox1.setItems(medicalCategoryList1);

        IO.loadPerson(personList);
        for(Person person:personList){
            Person person1 = new Person(person.getPersonID(),person.getPersonName(),person.getInstitutionID());
            personData.add(person1);
        }


        PersonIDColumn.setCellValueFactory(cellData -> cellData.getValue().personIDpProperty());
        PersonNameColumn.setCellValueFactory(cellData -> cellData.getValue().personNamepProperty());
        institutionIDColumn.setCellValueFactory(cellData -> cellData.getValue().institutionIDpProperty());
        PersonTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) ->
                showPersonDetails(newValue));
        PersonTable.setItems(personData);
    }

    private void showPersonDetails(Person person) {
        if (person != null) {
            personIDLabel.setText(person.personIDpProperty().get());
            personNameLabel.setText(person.personNamepProperty().get());
            personCategoryLabel.setText(person.getMedicalCategory());
            personInstitutionIDLabel.setText(person.institutionIDpProperty().get());

            personIDLabel1.setText(person.personIDpProperty().get());
            personNameLabel1.setText(person.personNamepProperty().get());
            personCategoryLabel1.setText(person.getMedicalCategory());
            personInstitutionIDLabel1.setText(person.institutionIDpProperty().get());

            PersonIDField1.setText(person.personIDpProperty().get());
            PersonNameField1.setText(person.personNamepProperty().get());
            PersonInstitutionIDField1.setText(person.institutionIDpProperty().get());


        } else {
            personIDLabel.setText("");
            personNameLabel.setText("");
            personCategoryLabel.setText("");
            personInstitutionIDLabel.setText("");

            personIDLabel1.setText("");
            personNameLabel1.setText("");
            personCategoryLabel1.setText("");
            personInstitutionIDLabel1.setText("");

            PersonIDField1.setText("");
            PersonNameField1.setText("");
            PersonInstitutionIDField1.setText("");

        }
    }

    @FXML
    void addPerson(ActionEvent event) {
        String temp = PersonIDField.getText()+","+
                PersonNameField.getText()+","+
                medicalCategoryBox.getValue()+","+
                PersonInstitutionIDField.getText();
        try {
            String filename = "D:\\MedicalInsuranceSystem\\src\\Person.txt";
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
        IO.loadAddPerson(addPersonList);
        for(Person person:addPersonList){
            Person person1 = new Person(person.getPersonID(),person.getPersonName(),person.getInstitutionID());
            personData.add(person1);
        }
        PersonIDColumn.setCellValueFactory(cellData -> cellData.getValue().personIDpProperty());
        PersonNameColumn.setCellValueFactory(cellData -> cellData.getValue().personNamepProperty());
    }
    @FXML
    void changePerson(ActionEvent event) {
        String personID1 = PersonIDField1.getText();
        String personName1 = PersonNameField1.getText();
        String medicalCategory1 = medicalCategoryBox1.getValue();
        String institutionID1 = PersonInstitutionIDField1.getText();
        try{
            String filename = "D:\\MedicalInsuranceSystem\\src\\Person.txt";
            File file = new File(filename);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String temp;
            String firstLine = "";
            int i = 1;
            while((temp = reader.readLine()) != null) {
                if(i >= 2 ){
                    String personID = temp.split(",")[0];
                    if (personID.equals(personID1)){
                        Person person = new Person(personID1,personName1,medicalCategory1,institutionID1);
                        changedPersonList.add(person);
                    }
                    else{
                        String personName = temp.split(",")[1];
                        String medicalCategory = temp.split(",")[2];
                        String institutionID = temp.split(",")[3];
                        Person person = new Person(personID,personName ,medicalCategory ,institutionID );
                        changedPersonList.add(person);
                    }
                }
                else{
                    firstLine = temp;
                }
                i++;
            }
            ArrayList<String> listStr = new ArrayList<String>();;
            listStr.add(firstLine);
            for (Person person: changedPersonList) {
                String  temp1 = person.getPersonID()+","+person.getPersonName()+","
                        +person.getMedicalCategory()+","+person.getInstitutionID();
                listStr.add(temp1);
            }
            OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(filename),"UTF-8");
            BufferedWriter bw = new BufferedWriter(write);
            //遍历集合
            for(String s : listStr){
                //写数据
                bw.write(s);
                bw.newLine();
                bw.flush();
            }
            //释放资源
            bw.close();
//            for (String str : listStr) {// 遍历listStr集合
//                FileOutputStream fos = null;
//                PrintStream ps = null;
//                try {
//                    fos = new FileOutputStream(file1);
//                    ps = new PrintStream(fos);
//                } catch (FileNotFoundException e) {
//                    e.printStackTrace();
//                }
//                String string  = str + "\r\n";// +换行
//                ps.print(string); // 执行写操作
//                ps.close();	// 关闭流
//            }
            System.out.println("文件写入完毕!");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }
    @FXML
    void deletePerson(ActionEvent event) {
        //进行列表中的删除
        int selectedIndex = PersonTable.getSelectionModel().getSelectedIndex();
        PersonTable.getItems().remove(selectedIndex);
        //进行数据中的删除
//        personData.remove(selectedIndex);
//        IO.deletePerson();
    }

    /**极其完美的一次对ID和名称进行搜索的编码*/
    @FXML
    void searchPerson(ActionEvent event) {
        ObservableList<Person> newpersonData = FXCollections.observableArrayList();
            for(Person person:personData){
                if(person.personIDpProperty().get().compareTo(searchPersonField.getText())==0||
                        person.personNamepProperty().get().compareTo(searchPersonField.getText())==0){
                    newpersonData.add(person);
                }else{
                    System.out.println("");
                }
        }
        PersonTable.setItems(newpersonData);
    }



    @FXML
    void addCompany(ActionEvent event) {

    }
    @FXML
    void changeCompany(ActionEvent event) {

    }
    @FXML
    void deleteCompany(ActionEvent event) {

    }
    @FXML
    void searchCompany(ActionEvent event) {

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
























































