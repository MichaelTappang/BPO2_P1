package com.michael.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DemoMainController {
    public TextField txtinput;
    public Label lblOutput;

    public void sendOueryAction(ActionEvent actionEvent) {
        if (!txtinput.getText().trim().isEmpty()){
            lblOutput.setText(txtinput.getText().trim());
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please fill input");
            alert.showAndWait();
        }
    }
}
