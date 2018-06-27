import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PersonalAreaClient {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button goToApplyForPatent_button;

    @FXML
    private TextField login_text;

    @FXML
    private TextField name_text;

    @FXML
    private TextField surename_text;

    @FXML
    private TextField patronymic_text;

    @FXML
    private TextField walletNumber_text;

    @FXML
    private TextField cash_text;

    @FXML
    private Button pay_button;

    @FXML
    private Button moreInfo_button;

    @FXML
    private Button backToLogin_button;

    @FXML
    void initialize() {
        new HelpFunction().openNewScene(backToLogin_button,"login.fxml", "вход в систему", 569,430);
        new HelpFunction().openNewScene(moreInfo_button,"moreInfo.fxml", "сведения о заявке", 570,915);
        new HelpFunction().openNewScene(goToApplyForPatent_button,"applyForPatent.fxml", "подача заявки", 582,560);
    }
}