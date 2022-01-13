package com.example.tictactoexml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Random;

public class HelloController {


    @FXML
    private Label welcomeText;
    @FXML
    private Label turn;

    public int validarTurn;

    protected void primerTurn() {

        System.out.println("Hola");

        if (validarTurn == 0) {
            System.out.println("Hola");

            turn.setText("TURN DE: X");
        } else {
            System.out.println("Hola");

            turn.setText("TURN DE: O");
        }

    }

    @FXML
    protected void onHelloButtonClick(ActionEvent event) {
        System.out.println(validarTurn);

        if (validarTurn == 0) {

        turn.setText("TURN DE: X");
            ((Button)event.getSource()).setText("O");
            validarTurn = 1;
        } else {
            turn.setText("TURN DE: O");
            ((Button)event.getSource()).setText("X");
            validarTurn = 0;
        }


    }
}