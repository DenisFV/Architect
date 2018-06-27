import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class WriteToManager {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button send_button;

    @FXML
    private TextArea message_text;

    @FXML
    private Button backToPersonalArea_button;

    @FXML
    void initialize() {
        new HelpFunction().openNewScene(backToPersonalArea_button, "personalAreaClient.fxml", "личный кабинет",906,865);
        new HelpFunction().openNewScene(send_button, "personalAreaClient.fxml", "личный кабинет",906,865);
    }
}
