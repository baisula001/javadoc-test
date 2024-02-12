package org.example.baisula.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * my controllor part
 */
public class HelloController {
    @FXML
    private Label welcomeText;

    /**
     * click event
     */
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}