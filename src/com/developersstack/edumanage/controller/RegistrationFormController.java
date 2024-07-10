package com.developersstack.edumanage.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class RegistrationFormController {
    public AnchorPane context;
    public TextField txtId;
    public Button btn;
    public TextField txtStudent;
    public ComboBox cmbProgram;
    public ToggleGroup paidState;
    public RadioButton rBtnPaid;

    public void backToHomeOnAction(ActionEvent actionEvent) throws IOException {
        setUi("DashboardForm");
    }

    public void saveOnAction(ActionEvent actionEvent) {
    }

    private void setUi(String location) throws IOException {
        Stage stage = (Stage) context.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
        stage.centerOnScreen();
    }
}
