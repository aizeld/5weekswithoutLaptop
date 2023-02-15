package com.example._5weekswithoutlaptop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class SignUpController {

    @FXML
    private Button SignUpButton;

    @FXML
    private CheckBox SignUpCheckboxFemale;

    @FXML
    private CheckBox SignUpCheckboxMale;

    @FXML
    private TextField SignUpCountry;

    @FXML
    private TextField SignUpLastname;

    @FXML
    private TextField SignUpName;

    @FXML
    private TextField login_field;

    @FXML
    private TextField password_field;

    @FXML

    void signupClick() {


        SignUpnewUser();




    }

    private void SignUpnewUser() {
        DatabaseHandler dbHandler = new DatabaseHandler();
        String firstname = SignUpName.getText();
        String lastname = SignUpLastname.getText();
        String username = login_field.getText();
        String password = password_field.getText();
        String location = SignUpCountry.getText();
        String gender = "";
        if(SignUpCheckboxMale.isSelected()){
            gender = "Male";
        }else if(SignUpCheckboxFemale.isSelected()){
            gender = "Female";
        }else{
            gender = "Not given";
        }
        User user = new User(firstname, lastname, username, password, location, gender);


        try {
            dbHandler.SignUpUser(user);
            OpenScene toopen = new OpenScene();
            toopen.openS("hello-view.fxml", SignUpButton);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
