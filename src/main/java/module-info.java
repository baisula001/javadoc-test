module org.example.baisula.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.testng;

    opens org.example.baisula.demo to javafx.fxml;
    exports org.example.baisula.demo;
    opens org.example.baisula.test to org.testng;

}
