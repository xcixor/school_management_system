package app.presentation;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

import org.kordamp.bootstrapfx.BootstrapFX;

public class EntryPointController implements Initializable {

    @FXML
    private BorderPane borderPane;

    @FXML
    private Button settingsBtn;

    @FXML
    private Button homeBtn;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        borderPane.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
//        initializeButtonIcons();
    }

    private void initializeButtonIcons() {

    }
}
