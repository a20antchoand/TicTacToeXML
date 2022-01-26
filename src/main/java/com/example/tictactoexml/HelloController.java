package com.example.tictactoexml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    static Random random = new Random();
    static boolean turnActual;
    static Button[] btn = new Button[9];
    static int contadorVX = 0;
    static int contadorVO = 0;
    static int chance_flag = 0;

    @FXML
    private Label lblTurn;
    @FXML
    private Label contadorX;
    @FXML
    private Label contadorO;
    @FXML
    private Button btn0_0;
    @FXML
    private Button btn0_1;
    @FXML
    private Button btn0_2;
    @FXML
    private Button btn1_0;
    @FXML
    private Button btn1_1;
    @FXML
    private Button btn1_2;
    @FXML
    private Button btn2_0;
    @FXML
    private Button btn2_1;
    @FXML
    private Button btn2_2;

    @FXML
    protected void btn_onClick(ActionEvent event) {
        chance_flag++;
        if (turnActual) {
            turnActual = false;
            lblTurn.setText("TORN DE O");
            ((Button)event.getSource()).setText("X");
        } else {
            turnActual = true;
            lblTurn.setText("TORN DE X");
            ((Button)event.getSource()).setText("O");
        }
        ((Button)event.getSource()).setDisable(true);
        guanyador();
    }



    @Override
    public void initialize(URL url, ResourceBundle bundle) {

        btn[0] = btn0_0;
        btn[1] = btn0_1;
        btn[2] = btn0_2;
        btn[3] = btn1_0;
        btn[4] = btn1_1;
        btn[5] = btn1_2;
        btn[6] = btn2_0;
        btn[7] = btn2_1;
        btn[8] = btn2_2;

        elegirJugador();
    }

    public void guanyador() {
        if ((btn[0].getText().equals("X")) && (btn[1].getText().equals("X")) && (btn[2].getText().equals("X"))) {
            xGuanya();
        } else if ((btn[0].getText().equals("X")) && (btn[4].getText().equals("X")) && (btn[8].getText().equals("X"))) {
            xGuanya();
        } else if ((btn[0].getText().equals("X")) && (btn[3].getText().equals("X")) && (btn[6].getText().equals("X"))) {
            xGuanya();
        } else if ((btn[1].getText().equals("X")) && (btn[4].getText().equals("X")) && (btn[7].getText().equals("X"))) {
            xGuanya();
        } else if ((btn[2].getText().equals("X")) && (btn[4].getText().equals("X")) && (btn[6].getText().equals("X"))) {
            xGuanya();
        } else if ((btn[2].getText().equals("X")) && (btn[5].getText().equals("X")) && (btn[8].getText().equals("X"))) {
            xGuanya();
        } else if ((btn[3].getText().equals("X")) && (btn[4].getText().equals("X")) && (btn[5].getText().equals("X"))) {
            xGuanya();
        } else if ((btn[6].getText().equals("X")) && (btn[7].getText().equals("X")) && (btn[8].getText().equals("X"))) {
            xGuanya();
        }

        else if ((btn[0].getText().equals("O")) && (btn[1].getText().equals("O")) && (btn[2].getText().equals("O"))) {
            oGuanya();
        } else if ((btn[0].getText().equals("O")) && (btn[3].getText().equals("O")) && (btn[6].getText().equals("O"))) {
            oGuanya();
        } else if ((btn[0].getText().equals("O")) && (btn[4].getText().equals("O")) && (btn[8].getText().equals("O"))) {
            oGuanya();
        } else if ((btn[1].getText().equals("O")) && (btn[4].getText().equals("O")) && (btn[7].getText().equals("O"))) {
            oGuanya();
        } else if ((btn[2].getText().equals("O")) && (btn[4].getText().equals("O")) && (btn[6].getText().equals("O"))) {
            oGuanya();
        } else if ((btn[2].getText().equals("O")) && (btn[5].getText().equals("O")) && (btn[8].getText().equals("O"))) {
            oGuanya();
        } else if ((btn[3].getText().equals("O")) && (btn[4].getText().equals("O")) && (btn[5].getText().equals("O"))) {
            oGuanya();
        } else if ((btn[6].getText().equals("O")) && (btn[7].getText().equals("O")) && (btn[8].getText().equals("O"))) {
            oGuanya();
        } else if (chance_flag == 9) {
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("Resultat");
            alerta.setHeaderText("Gracies per jugar al meu tres en ratlla pero t'he d'informar que...");
            alerta.setContentText("Han quedat en empat");
            alerta.showAndWait();
            finish();
        }
    }

    public void xGuanya() {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Resultat");
        alerta.setHeaderText("Enhorabona per arribar fins tant lluny jugador X");
        alerta.setContentText("Ha guanyat el jugador X");
        alerta.showAndWait();
        contadorVX++;
        contadorX.setText("Jugador X = " + contadorVX);
        finish();
    }

    public void oGuanya() {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Resultat");
        alerta.setHeaderText("Enhorabona per arribar fins tant lluny jugador O");
        alerta.setContentText("Ha guanyat el jugador O");
        alerta.showAndWait();
        contadorVO++;
        contadorO.setText("Jugador O = " + contadorVO);
        finish();
    }
    
    public void finish () {
        for (Button button : btn) {
            button.setDisable(false);
            button.setText("");
        }
        chance_flag = 0;
        elegirJugador();
    }

    public void elegirJugador () {
        int chance = random.nextInt(100);
        if (chance % 2 == 0) {
            turnActual = true;
            lblTurn.setText("TORN DE: X");
        } else {
            turnActual = false;
            lblTurn.setText("TORN DE: O");
        }
    }

}