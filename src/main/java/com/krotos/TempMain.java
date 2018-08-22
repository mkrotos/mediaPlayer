package com.krotos;

import javafx.application.Application;
import javafx.stage.Stage;

public class TempMain extends Application {
    public static void main(String[] args) {
        Application.launch();

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        PlayerMP3 playerMP3=new PlayerMP3();
        playerMP3.play();
    }
}
