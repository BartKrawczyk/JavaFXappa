module com.example.javafxappa {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.programodawca.javafxappa to javafx.fxml;
    exports pl.programodawca.javafxappa;
    exports pl.programodawca.javafxappa.controller;
    opens pl.programodawca.javafxappa.controller to javafx.fxml;
}