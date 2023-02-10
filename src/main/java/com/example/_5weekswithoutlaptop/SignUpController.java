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
        DatabaseHandler dbHandler = new DatabaseHandler();
        try {
            dbHandler.SignUpUser(SignUpName.getText(), SignUpLastname.getText(),
                    login_field.getText(), password_field.getText(), SignUpCountry.getText(), "Male");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
