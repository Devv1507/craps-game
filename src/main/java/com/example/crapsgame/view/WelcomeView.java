package com.example.crapsgame.view;

import com.example.crapsgame.HelloApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomeView extends Stage {

    public WelcomeView() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("hello-view-actionEvent.fxml")
        );
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        this.setTitle("Hello!");
        this.setScene(scene);
    }

    public static WelcomeView getInstance() throws IOException {
        if (WelcomeViewHolder.INSTANCE == null) {
            WelcomeViewHolder.INSTANCE = new WelcomeView();
            return WelcomeViewHolder.INSTANCE;
        }
        return WelcomeViewHolder.INSTANCE;
    }

    private static class WelcomeViewHolder {
        public static WelcomeViewHolder INSTANCE;
    }
}