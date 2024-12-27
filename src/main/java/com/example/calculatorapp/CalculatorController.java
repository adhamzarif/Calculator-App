package com.example.calculatorapp;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalculatorController {
    @FXML
    TextField display;

    char operator;
    double num1, num2, result;

    @FXML
    public void handleNumber(javafx.event.ActionEvent event) {
        String value = ((javafx.scene.control.Button) event.getSource()).getText();
        display.appendText(value);
    }

    @FXML
    public void handleOperator(javafx.event.ActionEvent event) {
        String value = ((javafx.scene.control.Button) event.getSource()).getText();
        operator = value.charAt(0);
        num1 = Double.parseDouble(display.getText());
        display.clear();
    }

    @FXML
    public void handleEquals() {
        num2 = Double.parseDouble(display.getText());
        switch (operator) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = num1 / num2; break;
        }
        display.setText(String.valueOf(result));
    }

    @FXML
    public void handleClear() {
        display.clear();
    }
}
