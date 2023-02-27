module com.example.mathcompetencysurvey {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mathcompetencysurvey to javafx.fxml;
    exports com.example.mathcompetencysurvey;
}