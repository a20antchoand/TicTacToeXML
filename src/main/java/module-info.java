module com.example.tictactoexml {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tictactoexml to javafx.fxml;
    exports com.example.tictactoexml;
}