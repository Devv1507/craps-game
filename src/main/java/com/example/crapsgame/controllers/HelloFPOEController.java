package com.example.crapsgame.controllers;

import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;

public class HelloFPOEController {
    @FXML
    private TextField nicknameTextField;
    @FXML
    private ImageView imageView;
    private int count;

    @FXML
    public void onActionFPOEButton(ActionEvent actionEvent){
        System.out.println("Hello FPOE from FXML");
        count += 1;
        if (count % 2 == 0) {
            imageView.setImage(new Image(
                    getClass().getResourceAsStream("com/example/crapsgame/images/casino.png"))
            );
        } else {
            imageView.setImage(new Image(
                    getClass().getResourceAsStream("com/example/crapsgame/images/something.png"))
            );
        }
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
