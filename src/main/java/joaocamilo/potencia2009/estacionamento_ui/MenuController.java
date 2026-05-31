package joaocamilo.potencia2009.estacionamento_ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MenuController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
