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

    /*MATH ATTRIBUTES*/
    private double firstHalf;
    private char operation;

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
        //Adding visual display of toggled button
        if (event.getSource() == zero){
            display.setText(display.getText() + "0");
        } else if (event.getSource() == one){
            display.setText(display.getText() + "1");
        } else if (event.getSource() == two){
            display.setText(display.getText() + "2");
        } else if (event.getSource() == three){
            display.setText(display.getText() + "3");
        } else if (event.getSource() == four){
            display.setText(display.getText() + "4");
        } else if (event.getSource() == five){
            display.setText(display.getText() + "5");
        } else if (event.getSource() == six){
            display.setText(display.getText() + "6");
        } else if (event.getSource() == seven){
            display.setText(display.getText() + "7");
        } else if (event.getSource() == eight){
            display.setText(display.getText() + "8");
        } else if (event.getSource() == nine){
            display.setText(display.getText() + "9");
        } else if (event.getSource() == add){
           firstHalf = Double.parseDouble(display.getText());
           operation = '+';
            display.setText("");
        } else if (event.getSource() == subtract){
            firstHalf = Double.parseDouble(display.getText());
            operation = '-';
            display.setText("");
        } else if (event.getSource() == multiply){
            firstHalf = Double.parseDouble(display.getText());
            operation = '*';
            display.setText("");
        } else if (event.getSource() == divison){
            firstHalf = Double.parseDouble(display.getText());
            operation = '/';
            display.setText("");
        } else if (event.getSource() == dot){
            display.setText(display.getText() + ".");
        } else if (event.getSource() == mod){
            firstHalf = Double.parseDouble(display.getText());
            operation = '%';
            display.setText("");
        } else if (event.getSource() == signChange){
           /* String text = display.getText();
            //check if there is any text,if not return
            if (text.isEmpty())
                return;
            //Tell if number is negative or positive
            String sign = text.charAt(text.length() - 1) == '-' ? "" : "-";
            if (!sign.equals("-"))
                text = text.substring(0, text.length() - 1);
            display.setText(sign + text);*/


        } else if (event.getSource() == clear){
            display.setText("");
        } else if (event.getSource() == equals){
            double result = 0;
            double otherHalf = Double.parseDouble(display.getText());
            switch (operation) {
                case '+' -> result = firstHalf + otherHalf;
                case '-' -> result = firstHalf - otherHalf;
                case '*' -> result = firstHalf * otherHalf;
                case '/' -> result = firstHalf / otherHalf;
                case '%' -> result = firstHalf % otherHalf;
            }
            display.setText(String.valueOf(result));
        }
    }
}