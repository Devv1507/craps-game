package com.example.crapsgame.controllers;

import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class HelloFPOEController {
    @FXML
    private TextField nicknameTextField;
    @FXML
    public void onActionFPOEButton(ActionEvent actionEvent){
        System.out.println("Hello FPOE from FXML");
    }
    @FXML
    public void onKeyPressedNicknameTextField(KeyEvent keyEvent){
        String inputText = nicknameTextField.getText();
        System.out.println(inputText+ " pressed");
        // conteo regresivo del tiempo
        Timeline timeCount = new Timeline();
    }
    @FXML
    public void onKeyReleaseNicknameTextField(KeyEvent keyEvent) {
        String inputText = nicknameTextField.getText();
        System.out.println(inputText + " release");
    }

}
