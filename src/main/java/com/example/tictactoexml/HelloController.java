package com.example.tictactoexml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.util.Random;

public class HelloController {

    static Random random = new Random();
    static boolean turnActual;
    static Button[] btn = new Button[9];
    static HelloApplication joc;
    static int chance_flag = 0;

    @FXML
    static private Label turno;

    @FXML
    static private Button btn0_0;
    @FXML
    static private Button btn0_1;
    @FXML
    static private Button btn0_2;
    @FXML
    static private Button btn1_0;
    @FXML
    static private Button btn1_1;
    @FXML
    static private Button btn1_2;
    @FXML
    static private Button btn2_0;
    @FXML
    static private Button btn2_1;
    @FXML
    static private Button btn2_2;

    @FXML
    protected void btn_onClick(ActionEvent event) {
        chance_flag++;
        if (turnActual) {
            turnActual = false;
            turno.setText("TURN DE: O");
        } else {
            turnActual = true;
            turno.setText("TURN DE: X");
        }
    }



    public static void HelloController() {

        btn[0] = btn0_0;
        btn[1] = btn0_1;
        btn[2] = btn0_2;
        btn[3] = btn1_0;
        btn[4] = btn1_1;
        btn[5] = btn2_2;
        btn[6] = btn0_0;
        btn[7] = btn1_1;
        btn[8] = btn2_2;

        int chance = random.nextInt(100);
        if (chance % 2 == 0) {
            turnActual = true;
            turno.setText("TURN DE: X");
        } else {
            turnActual = false;
            turno.setText("TURN DE: O");
        }
    }

    public void guanyador() {
        if ((btn[0].getText() == "X") && (btn[1].getText() == "X") && (btn[2].getText() == "X")) {
            xGuanya(0, 1, 2);
        } else if ((btn[0].getText() == "X") && (btn[4].getText() == "X") && (btn[8].getText() == "X")) {
            xGuanya(0, 4, 8);
        } else if ((btn[0].getText() == "X") && (btn[3].getText() == "X") && (btn[6].getText() == "X")) {
            xGuanya(0, 3, 6);
        } else if ((btn[1].getText() == "X") && (btn[4].getText() == "X") && (btn[7].getText() == "X")) {
            xGuanya(1, 4, 7);
        } else if ((btn[2].getText() == "X") && (btn[4].getText() == "X") && (btn[6].getText() == "X")) {
            xGuanya(2, 4, 6);
        } else if ((btn[2].getText() == "X") && (btn[5].getText() == "X") && (btn[8].getText() == "X")) {
            xGuanya(2, 5, 8);
        } else if ((btn[3].getText() == "X") && (btn[4].getText() == "X") && (btn[5].getText() == "X")) {
            xGuanya(3, 4, 5);
        } else if ((btn[6].getText() == "X") && (btn[7].getText() == "X") && (btn[8].getText() == "X")) {
            xGuanya(6, 7, 8);
        }

        else if ((btn[0].getText() == "O") && (btn[1].getText() == "O") && (btn[2].getText() == "O")) {
            oGuanya(0, 1, 2);
        } else if ((btn[0].getText() == "O") && (btn[3].getText() == "O") && (btn[6].getText() == "O")) {
            oGuanya(0, 3, 6);
        } else if ((btn[0].getText() == "O") && (btn[4].getText() == "O") && (btn[8].getText() == "O")) {
            oGuanya(0, 4, 8);
        } else if ((btn[1].getText() == "O") && (btn[4].getText() == "O") && (btn[7].getText() == "O")) {
            oGuanya(1, 4, 7);
        } else if ((btn[2].getText() == "O") && (btn[4].getText() == "O") && (btn[6].getText() == "O")) {
            oGuanya(2, 4, 6);
        } else if ((btn[2].getText() == "O") && (btn[5].getText() == "O") && (btn[8].getText() == "O")) {
            oGuanya(2, 5, 8);
        } else if ((btn[3].getText() == "O") && (btn[4].getText() == "O") && (btn[5].getText() == "O")) {
            oGuanya(3, 4, 5);
        } else if ((btn[6].getText() == "O") && (btn[7].getText() == "O") && (btn[8].getText() == "O")) {
            oGuanya(6, 7, 8);
        } else if (chance_flag == 9) {
            turno.setText("EMPAT");
        }
    }

    public void xGuanya(int x1, int x2, int x3) {
        turno.setText("X HA GUANYAT");
    }

    public void oGuanya(int x1, int x2, int x3) {
        turno.setFont(new Font("Apple Casual", 50));
        turno.setText("O HA GUANYAT");
    }
    
    
    
    
}