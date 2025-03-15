package com.example.crapsgame.controllers;

import com.example.crapsgame.models.Player;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class GameController {

    @FXML
    private Label nickNameLabel;
    private Player player;

    public void setPlayer(Player player){
        this.player = player;
    }

    public Player getPlayer(){
        return this.player;
    }
}