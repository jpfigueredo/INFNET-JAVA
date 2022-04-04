module com.example.atcruds {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.atcruds to javafx.fxml;
    exports com.example.atcruds;
}