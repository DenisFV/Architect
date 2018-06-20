import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PersonalArea {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button send_button1;

    @FXML
    private TextField name_text;

    @FXML
    private TextField patronymic_text;

    @FXML
    private TextField name_text1;

    @FXML
    private TextField patronymic_text1;

    @FXML
    private TextField name_text2;

    @FXML
    private TextField name_text11;

    @FXML
    private Button backToLogin_button1;

    @FXML
    private Button backToLogin_button12111;

    @FXML
    private Button backToLogin_button;

    @FXML
    void initialize() {
        new ApplyForPatent().openNewScene(backToLogin_button,"login.fxml", "вход в систему");
    }
}