import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MoreInfo {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea description_text;

    @FXML
    private TextField type_text;

    @FXML
    private Button acceptPatent_button;

    @FXML
    private TextField link_text;

    @FXML
    private CheckBox statusPay_Success;

    @FXML
    private CheckBox statusPay_Filed;

    @FXML
    private CheckBox statusPay_Unknown;

    @FXML
    private CheckBox statusVerifier_Success;

    @FXML
    private CheckBox statusVerifier_Filed;

    @FXML
    private CheckBox statusVerifier_Unknown;

    @FXML
    private Button refusePatent_button;

    @FXML
    private TextArea comments_text;

    @FXML
    private Button backToPersonalArea_button;

    @FXML
    void initialize() {
        new HelpFunction().openNewScene(backToPersonalArea_button, "personalAreaClient.fxml", "личный кабинет", 906,865);
    }
}