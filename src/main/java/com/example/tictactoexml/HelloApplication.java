package com.example.tictactoexml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;

public class HelloApplication extends Application {

    static Random rand = new Random();
    static HelloController control = new HelloController();

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("TicTacToe");
        stage.setScene(scene);
        stage.show();

        int validarTurn = rand.nextInt(2);
        control.validarTurn = validarTurn;
        control.primerTurn();

    }

    public static void main(String[] args) {

        launch();



    }
}