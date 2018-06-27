import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PersonalAreaVerifier {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField login_text;

    @FXML
    private TextField name_text;

    @FXML
    private TextField surename_text;

    @FXML
    private TextField patronymic_text;

    @FXML
    private Button moreInfo_button;

    @FXML
    private Button backToLogin_button;

    @FXML
    void initialize() {
        new HelpFunction().openNewScene(backToLogin_button,"login.fxml", "вход в систему", 569,430);
        new HelpFunction().openNewScene(moreInfo_button,"moreInfo.fxml", "сведения о заявке", 570,915);
    }
}
