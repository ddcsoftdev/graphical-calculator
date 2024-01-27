package com.ddcsoftware.graphicalcalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 * DD: Controller class for calculator
 */
public class CalculatorController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private Button add;

    @FXML
    private Button clear;

    @FXML
    private TextArea display;

    @FXML
    private Button divison;

    @FXML
    private Button dot;

    @FXML
    private Button eight;

    @FXML
    private Button empty;

    @FXML
    private Button equals;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private Button mod;

    @FXML
    private Button multiply;

    @FXML
    private Button nine;

    @FXML
    private Button one;

    @FXML
    private Button seven;

    @FXML
    private Button signChange;

    @FXML
    private Button six;

    @FXML
    private Button subtract;

    @FXML
    private Button three;

    @FXML
    private Button two;

    @FXML
    private Button zero;

    @FXML
    void onClicked(ActionEvent event) {
        System.out.println(event.toString());
    }
}