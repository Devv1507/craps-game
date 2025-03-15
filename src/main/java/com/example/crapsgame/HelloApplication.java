package com.example.crapsgame;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import com.example.crapsgame.view.WelcomeView;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        WelcomeView welcomeView = WelcomeView.getInstance();
        welcomeView.show();
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view-actionEvent.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();




//        stage.setTitle("Anything World");
//        VBox root = new VBox();
//
//        Button button = new Button("Even test");
//        button.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent){
//                System.out.println("I'm the Button Event");
//                System.out.println("Type:"+ actionEvent.getEventType() );
//                System.out.println("Source:"+ actionEvent.getSource() );
//                System.out.println("Target:"+ actionEvent.getTarget() );
//            }
//        });
//        root.setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent mouseEvent){
//                System.out.println("I'm the VBox Event");
//                System.out.println("Type:"+ mouseEvent.getEventType() );
//                System.out.println("Source:"+ mouseEvent.getSource() );
//                System.out.println("Target:"+ mouseEvent.getTarget() );
//            }
//        });
//
//        Label mainLabel = new Label("Hello EOP 2025I");
//        // Todos estos setOn..  son EventHandler
//        mainLabel.setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent mouseEvent){
//                System.out.println("I'm the Label Event");
//                System.out.println("Type:"+ mouseEvent.getEventType() );
//                System.out.println("Source:"+ mouseEvent.getSource() );
//                System.out.println("Target:"+ mouseEvent.getTarget() );
//            }
//        });
//
//        root.getChildren().add(mainLabel);
//        root.getChildren().add(button);
//        Scene myScene = new Scene(root, 200, 300);
//        stage.setScene(myScene);
//
//        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}