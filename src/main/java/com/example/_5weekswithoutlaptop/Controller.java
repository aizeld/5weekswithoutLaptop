package com.example._5weekswithoutlaptop;

import javafx.event.ActionEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button authSignInButton;

    @FXML
    private Button loginSignUpButton;

    @FXML
    private TextField login_field;

    @FXML
    private TextField password_field;

    @FXML
    private void signupClick(ActionEvent event){
        String loginText = login_field.getText().trim();
        String loginPassword = password_field.getText().trim();

        if(!loginText.equals("") && !loginPassword.equals("")){
            loginUser(loginText, loginPassword);
        }else {
            System.out.println("Login and Password are empty");
            Shake userAnim = new Shake(login_field);
            Shake userAnim2 = new Shake(password_field);
            userAnim2.Play();
            userAnim.Play();
        }
    }

    private void loginUser(String loginText, String loginPassword) {
        DatabaseHandler dbHandler = new DatabaseHandler();
        User user = new User();
        user.setUsername(loginText);
        user.setPassword(loginPassword);
        ResultSet result = dbHandler.getUser(user);

        int counter= 0;
        while(true){
            try {
                if (!result.next()) break;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            counter++;
        }
        if(counter >= 1){
            System.out.println("Success!");

            OpenScene toopen = new OpenScene();
            toopen.openS("App.fxml", authSignInButton);


        }else{
            Shake userAnim = new Shake(login_field);
            Shake userAnim1 = new Shake(password_field);
            userAnim1.Play();
            userAnim.Play();
        }
    }

    @FXML
    private void authclick(){
        OpenScene toopen1 = new OpenScene();
        toopen1.openS("SignUp.fxml", authSignInButton);
    }


}
