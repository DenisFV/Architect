import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ApplyForPatent {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button send_button;

    @FXML
    private TextField name_text;

    @FXML
    private TextField surname_text;

    @FXML
    private TextField patronymic_text;

    @FXML
    private TextField passport_text;

    @FXML
    private TextField phone_text;

    @FXML
    private CheckBox man_check;

    @FXML
    private CheckBox woman_check;

    @FXML
    private TextField typeProduct_text;

    @FXML
    private TextField descriptionProduct_text;

    @FXML
    private Button backToLogin_button;

    @FXML
    void initialize() {
        helpCheck(man_check, woman_check);
        helpCheck(woman_check, man_check);

        openNewScene(backToLogin_button,"login.fxml", "вход в систему");
        openNewScene(send_button,"generationLoginAndPassword.fxml", "сгенерированные логин и пароль");
    }

    void helpCheck(CheckBox check1, CheckBox check2) {
        check1.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if (newValue) {
                    check1.setSelected(true);
                    check2.setSelected(false);
                }
            }
        });
    }

    void openNewScene(Button button, String fxml, String title) {
        button.setOnAction(event -> {
            button.getScene().getWindow().hide();
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource(fxml));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = new Stage();
            stage.setTitle("Патентное бюро - " + title);
            stage.setScene(new Scene(root));
            stage.show();
        });
    }

}