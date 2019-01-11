package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Created by LSK.Reno on 2018/7/26.
 */

public class MenuController {
    @FXML
    private Button CommonBusinessButton;

    @FXML
    private Button InformationMaintenButton;

    @FXML
    private Button ReimbursementButton;

    @FXML
    private Button ComSearchButton;

    @FXML
    private Button ExitButton;

    @FXML
    void ComSearch(ActionEvent event)  {
        ComSearchController comSearchController = new ComSearchController();
        Stage ComSearchStage = comSearchController.setComSearchStage(Main.getStage());
        ComSearchStage.setTitle("综合查询——国家医疗保险报销中心");
        try {
            Scene scene = new Scene(FXMLLoader.load(getClass().getResource("ComSearchController.fxml")));
            ComSearchStage.setScene(scene);
            scene.getStylesheets().add(this.getClass().getResource("ComSearchController.css").toExternalForm());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    void CommonBusiness(ActionEvent event) {
        CommonBusinessController commonBusinessController = new CommonBusinessController();
        Stage commonBusinessStage = commonBusinessController .setCommonBusinessStage(Main.getStage());
        commonBusinessStage.setTitle("公共业务——国家医疗保险报销中心");
        try {
            Scene scene = new Scene(FXMLLoader.load(getClass().getResource("CommonBusinessController.fxml")));
            commonBusinessStage.setScene(scene);
            scene.getStylesheets().add(this.getClass().getResource("CommonBusinessController.css").toExternalForm());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void InformationMainten(ActionEvent event) {
        InformationMaintenController informationMaintenController = new InformationMaintenController();
        Stage informationMaintenStage = informationMaintenController.setInformationMaintenStage(Main.getStage());
        informationMaintenStage.setTitle("医疗基本信息维护——国家医疗保险报销中心");
        try {
            Scene scene = new Scene(FXMLLoader.load(getClass().getResource("InformationMaintenController.fxml")));
            informationMaintenStage.setScene(scene);
            scene.getStylesheets().add(this.getClass().getResource("InformationMaintenController.css").toExternalForm());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void Reimbursement(ActionEvent event) {
        ReimbursementController reimbursementController = new ReimbursementController();
        Stage reimbursementStage = reimbursementController.setReimbursementStage(Main.getStage());
        reimbursementStage.setTitle("医保中心报销——国家医疗保险报销中心");
        try {
            Scene scene = new Scene(FXMLLoader.load(getClass().getResource("ReimbursementController.fxml")));
            reimbursementStage.setScene(scene);
            scene.getStylesheets().add(this.getClass().getResource("ReimbursementController.css").toExternalForm());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void Exit(ActionEvent event) {
        System.exit(1);
    }


}






























