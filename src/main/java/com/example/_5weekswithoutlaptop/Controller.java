package com.example._5weekswithoutlaptop;

import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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
    private void authclick(ActionEvent event){
        System.out.println("you pressed auth button");
    }
    @FXML
    private void signupClick(){
        System.out.println("You pressed sign up button");
    }

}
