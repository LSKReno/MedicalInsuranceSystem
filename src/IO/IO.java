package IO;

import Data.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by LSK.Reno on 2018/7/29 13:46.
 */
public class IO {
    //加载人员
    public static void loadPerson(ArrayList<Person> personList){
        try{
            String filename = "D:\\MedicalInsuranceSystem\\src\\Person.txt";
            File file = new File(filename);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String temp;
            int i = 1;
            while((temp = reader.readLine()) != null) {
                if(i >= 2 ){
                    String personID = temp.split(",")[0];
                    String personName = temp.split(",")[1];
                    String medicalCategory = temp.split(",")[2];
                    String institutionID = temp.split(",")[3];
                    Person person = new Person(personID,personName ,medicalCategory ,institutionID );
                    personList.add(person);
                }
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }
    //加载新增人员
    public static void loadAddPerson(ArrayList<Person> personList){
        try{
            Scanner sc = new Scanner(new FileReader("D:\\MedicalInsuranceSystem\\src\\Person.txt"));
            String line = null;
            while((sc.hasNextLine()&&(line=sc.nextLine())!=null)){
                if(!sc.hasNextLine()){
                    String personID = line.split(",")[0];
                    String personName = line.split(",")[1];
                    String medicalCategory = line.split(",")[2];
                    String institutionID = line.split(",")[3];
                    Person person = new Person(personID,personName ,medicalCategory ,institutionID );
                    personList.add(person);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("没找到文件咯。");
//            e.printStackTrace();
        }


    }
    //删除人员
    public static void deletePerson(){

    }


    //加载药品
    public static void loadDrug(ArrayList<Drug> drugList){
        try{
            String filename = "D:\\MedicalInsuranceSystem\\src\\Drug.txt";
            File file = new File(filename);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String temp;
            int i = 1;
            while((temp = reader.readLine()) != null) {
                if(i >= 2 ){
                    String drugID = temp.split(",")[0];
                    String drugName = temp.split(",")[1];
                    String drugLevel = temp.split(",")[2];
                    String hospitalLevel = temp.split(",")[3];
                    Drug drug = new Drug(drugID, drugName, drugLevel,hospitalLevel);
                    drugList.add(drug);
                }
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            System.out.println("IOException");
        }

    }
    //加载新增药品
    public static void loadAddDrug(ArrayList<Drug> drugList){
        try{
            Scanner sc = new Scanner(new FileReader("D:\\MedicalInsuranceSystem\\src\\Drug.txt"));
            String line = null;
            while((sc.hasNextLine()&&(line=sc.nextLine())!=null)){
                if(!sc.hasNextLine()){
                    String drugID = line.split(",")[0];
                    String drugName = line.split(",")[1];
                    String drugLevel = line.split(",")[2];
                    String hospitalLevel = line.split(",")[3];
                    Drug drug = new Drug(drugID, drugName, drugLevel,hospitalLevel);
                    drugList.add(drug);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("没找到文件咯。");
//            e.printStackTrace();
        }


    }


    //加载诊疗项目
    public static void loadClinicProject(ArrayList<ClinicProject> clinicProjectList){
        try{
            String filename = "D:\\MedicalInsuranceSystem\\src\\ClinicProject.txt";
            File file = new File(filename);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String temp;
            int i = 1;
            while((temp = reader.readLine()) != null) {
                if(i >= 2 ){
                    String projectID = temp.split(",")[0];
                    String projectName = temp.split(",")[1];
                    String projectLevel = temp.split(",")[2];
                    String hospitalLevel = temp.split(",")[3];
                    ClinicProject clinicProject = new ClinicProject(projectID, projectName, projectLevel,hospitalLevel );
                    clinicProjectList.add(clinicProject);
                }
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }
    //加载新增诊疗项目
    public static void loadAddClinicProject(ArrayList<ClinicProject> clinicProjectList){
        try{
            Scanner sc = new Scanner(new FileReader("D:\\MedicalInsuranceSystem\\src\\ClinicProject.txt"));
            String line = null;
            while((sc.hasNextLine()&&(line=sc.nextLine())!=null)){
                if(!sc.hasNextLine()){
                    String projectID = line.split(",")[0];
                    String projectName = line.split(",")[1];
                    String projectLevel = line.split(",")[2];
                    String hospitalLevel = line.split(",")[3];
                    ClinicProject clinicProject = new ClinicProject(projectID, projectName, projectLevel,hospitalLevel);
                    clinicProjectList.add(clinicProject);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("没找到文件咯。");
//            e.printStackTrace();
        }


    }


    //加载服务设施
    public static void loadServiceFacility(ArrayList<ServiceFacility> serviceFacilityList){
        try{
            String filename = "D:\\MedicalInsuranceSystem\\src\\ServiceFacility.txt";
            File file = new File(filename);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String temp;
            int i = 1;
            while((temp = reader.readLine()) != null) {
                if(i >= 2 ){
                    String facilityID = temp.split(",")[0];
                    String facilityName = temp.split(",")[1];
                    ServiceFacility serviceFacility= new ServiceFacility(facilityID,facilityName);
                    serviceFacilityList.add(serviceFacility);
                }
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }
    //加载新增服务设施
    public static void loadAddServiceFacility(ArrayList<ServiceFacility> serviceFacilityList){
        try{
            Scanner sc = new Scanner(new FileReader("D:\\MedicalInsuranceSystem\\src\\ServiceFacility.txt"));
            String line = null;
            while((sc.hasNextLine()&&(line=sc.nextLine())!=null)){
                if(!sc.hasNextLine()){
                    String facilityID = line.split(",")[0];
                    String facilityName = line.split(",")[1];
                    ServiceFacility serviceFacility= new ServiceFacility(facilityID,facilityName);
                    serviceFacilityList.add(serviceFacility);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("没找到文件咯。");
//            e.printStackTrace();
        }


    }


    //加载病种信息
    public static void loadDiseaseInformation(ArrayList<DiseaseInformation> diseaseInformationList){
        try{
            String filename = "D:\\MedicalInsuranceSystem\\src\\DiseaseInformation.txt";
            File file = new File(filename);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String temp;
            int i = 1;
            while((temp = reader.readLine()) != null) {
                if(i >= 2 ){
                    String diseaseID = temp.split(",")[0];
                    String diseaseType = temp.split(",")[1];
                    DiseaseInformation diseaseInformation= new DiseaseInformation(diseaseID,diseaseType );
                    diseaseInformationList.add(diseaseInformation);
                }
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }
    //加载新增病种信息
    public static void loadAddDiseaseInformation(ArrayList<DiseaseInformation> diseaseInformationList){
        try{
            Scanner sc = new Scanner(new FileReader("D:\\MedicalInsuranceSystem\\src\\DiseaseInformation.txt"));
            String line = null;
            while((sc.hasNextLine()&&(line=sc.nextLine())!=null)){
                if(!sc.hasNextLine()){
                    String diseaseID = line.split(",")[0];
                    String diseaseType = line.split(",")[1];
                    DiseaseInformation diseaseInformation= new DiseaseInformation(diseaseID,diseaseType);
                    diseaseInformationList.add(diseaseInformation);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("没找到文件咯。");
//            e.printStackTrace();
        }


    }


    //加载年度医疗报销表
    public static void loadAnnualReimbursement(ArrayList<AnnualReimbursement> annualReimbursementList){
        try{
            String filename = "D:\\MedicalInsuranceSystem\\src\\AnnualReimbursement.txt";
            File file = new File(filename);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String temp;
            int i = 1;
            while((temp = reader.readLine()) != null) {
                if(i >= 2 ){
                    String personIDp = temp.split(",")[0];
                    String personNamep = temp.split(",")[1];
                    String institutionIDp = temp.split(",")[2];
                    String personalExpensep = temp.split(",")[3];
                    String reimbursementExpensep = temp.split(",")[4];
                    String expensep = temp.split(",")[5];
                    String topLinep = temp.split(",")[6];
                    String exmaine = temp.split(",")[7];
                    AnnualReimbursement annualReimbursement = new AnnualReimbursement(personIDp,personNamep ,institutionIDp
                            ,personalExpensep ,reimbursementExpensep ,expensep,topLinep,exmaine);
                    annualReimbursementList.add(annualReimbursement);
                }
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }

    //加载未报销住院信息
    public static void loadUnreimbursedBudget(ArrayList<PrescriptionInformation> unreimbursedBudgetList){
        try{
            String filename = "D:\\MedicalInsuranceSystem\\src\\UnreimbursedBudget.txt";
            File file = new File(filename);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String temp;
            int i = 1;
            while((temp = reader.readLine()) != null) {
                if(i >= 2 ){
                    String personID = temp.split(",")[0];
                    String admissionID = temp.split(",")[1];
                    String projectCategory = temp.split(",")[2];
                    String projectName = temp.split(",")[3];
                    String expense = temp.split(",")[4];

                    PrescriptionInformation unreimbursedBudget= new PrescriptionInformation(personID,
                            admissionID,projectCategory,projectName,expense,"");
                    unreimbursedBudgetList.add(unreimbursedBudget);
                }
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }
}











































