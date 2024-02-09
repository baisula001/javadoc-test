/**
 * module part para;
 */
module org.example.baisula.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.baisula.demo to javafx.fxml;
    exports org.example.baisula.demo;
}