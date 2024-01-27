module com.ddcsoftware.graphicalcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ddcsoftware.graphicalcalculator to javafx.fxml;
    exports com.ddcsoftware.graphicalcalculator;
}