package com.developersstack.edumanage.controller;

import com.developersstack.edumanage.db.Database;
import com.developersstack.edumanage.model.User;
import com.developersstack.edumanage.util.security.PasswordManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.util.Optional;

public class LoginFormController {
    public AnchorPane context;
    public TextField txtEmail;
    public TextField txtPassword;

    public void forgotPasswordOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ForgotPasswordForm");
    }

    public void createAnAccountOnAction(ActionEvent actionEvent) throws IOException {
        setUi("SignupForm");
    }

    public void loginOnAction(ActionEvent actionEvent) throws IOException {
        String email = txtEmail.getText().toLowerCase();
        String password = txtPassword.getText().trim();

         /*
       for (User user: Database.userTable
             ) {
            if(user.getEmail().equals(email)){
                if(user.getPassword().equals(password)){
                    System.out.println(user.toString());
                    return;
                }else{
                    new Alert(Alert.AlertType.ERROR, "Wrong Password!").show();
                    return;
                }
            }
        }

        new Alert(Alert.AlertType.ERROR, String.format("User not found (%s)",email)).show();


          */
        Optional<User> selectedUser = Database.userTable.stream().filter(e->e.getEmail().equals(email)).findFirst();

        if(selectedUser.isPresent()){
            if(new PasswordManager().checkPassword(password,selectedUser.get().getPassword())){
//                System.out.println(selectedUser.get().toString());
                setUi("DashboardForm");
            }else{
                new Alert(Alert.AlertType.ERROR, "Wrong Password!").show();

            }
        }else{
            new Alert(Alert.AlertType.WARNING, String.format("User not found (%s)",email)).show();
        }

    }

    private void setUi(String location) throws IOException {
        Stage stage = (Stage) context.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
        stage.centerOnScreen();
    }
}
