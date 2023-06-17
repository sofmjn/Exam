package com.example.ryad;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.pow;

public class RyadController {

    @FXML
    private Label finAnswer;
    @FXML
    private Button addButton;

    @FXML
    private TextField numberTextField;

    @FXML
    void countNum(ActionEvent event) {

        int number = Integer.parseInt(numberTextField.getText());
        double sum = 1;
        for (int i = 0; i < number; i++) {
            sum = (sum + sum*1/2)/(i+1); //тяжко когда не даже умеешь считать геом последовательность и не понимаешь облость видимости
        }


        finAnswer.setText(String.valueOf(sum));

        numberTextField.clear();

    }

}