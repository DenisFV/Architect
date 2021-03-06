import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ApplyForPatent {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button backToPersonalArea_button;

    @FXML
    private Button send_button;

    @FXML
    private TextArea description_text;

    @FXML
    private TextField type_text;

    @FXML
    private TextField link_text;

    @FXML
    void initialize() {
        new HelpFunction().openNewScene(backToPersonalArea_button, "personalAreaClient.fxml", "личный кабинет",906,865);
        new HelpFunction().openNewScene(send_button, "personalAreaClient.fxml", "личный кабинет",906,865);
    }
}
