package screen.swing;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PrimaryController {

    @FXML
    private Label labelMsg ;
    private Button clickMe ;

    @FXML
    private void showHello() throws IOException {
        labelMsg.setText("Hello World");
    }

    @FXML
    private void switchToSecondary() throws IOException {
       App.setRoot("secondary");
    }
}
