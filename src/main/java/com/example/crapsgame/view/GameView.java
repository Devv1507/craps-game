package com.example.crapsgame.view;

import com.example.crapsgame.HelloApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GameView extends Stage {

    public GameView() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("hello-view-actionEvent.fxml")
        );
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        this.setTitle("Hello!");
        this.setScene(scene);
    }

    public static GameView getInstance() throws IOException {
        if (GameViewHolder.INSTANCE == null) {
            GameViewHolder.INSTANCE = new GameView();
            return GameViewHolder.INSTANCE;
        }
        return GameViewHolder.INSTANCE;
    }

    private static class GameViewHolder {
        public static GameViewHolder INSTANCE;
    }
}