package com.example.crapsgame.controllers;

import com.example.crapsgame.models.Player;
import com.example.crapsgame.views.GameView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;

import java.io.IOException;

public class WelcomeController {

    @FXML
    private ImageView imageView;
    private int cont = 0;

    @FXML
    private TextField nicknameTextField;

    @FXML
    public void onActionStartButton(ActionEvent actionEvent) throws IOException {
        String nickname = nicknameTextField.getText();
        System.out.println(nickname);
        Player player = new Player();
        player.setNickName(nickname);

        GameView gameView = GameView.getInstance();
        gameView.show();
        gameView.getController().setPlayer(player);
        gameView.getController().showNicknameLabel();

    }
}



//package com.example.crapsgame.controllers;
//
//import javafx.animation.Timeline;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.scene.control.TextField;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.scene.input.KeyEvent;
//
//public class WelcomeController {
//    @FXML
//    private TextField nicknameTextField;
//    @FXML
//    private ImageView imageView;
//    private int count;
//
//    @FXML
//    public void onActionFPOEButton(ActionEvent actionEvent){
//        String inputText = nicknameTextField.getText();
//        System.out.println("Hello FPOE from FXML");
//        count += 1;
//        if (count % 2 == 0) {
//            imageView.setImage(new Image(
//                    getClass().getResourceAsStream("com/example/crapsgame/images/casino.png"))
//            );
//        } else {
//            imageView.setImage(new Image(
//                    getClass().getResourceAsStream("com/example/crapsgame/images/something.png"))
//            );
//        }
//    }
//    @FXML
//    public void onKeyPressedNicknameTextField(KeyEvent keyEvent){
//        String inputText = nicknameTextField.getText();
//        System.out.println(inputText+ " pressed");
//        // conteo regresivo del tiempo
//        Timeline timeCount = new Timeline();
//    }
//    @FXML
//    public void onKeyReleaseNicknameTextField(KeyEvent keyEvent) {
//        String inputText = nicknameTextField.getText();
//        System.out.println(inputText + " release");
//    }
//
//}
