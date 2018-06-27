import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class GenerationLoginAndPassword {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField login_text;

    @FXML
    private Button save_button;

    @FXML
    private TextField password_text;

    @FXML
    void initialize() {

        save_button.setOnAction(event -> {
            new Login().setLogin_text(login_text);
            new Login().setPassword_text(password_text);

            try (FileWriter writer = new FileWriter("userConfig.txt")) {
                writer.write("Логин - " + login_text.getText() + "\nПароль - " + password_text.getText());
                writer.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

            save_button.getScene().getWindow().hide();
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("login.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = new Stage();
            stage.setTitle("Патентное бюро - вход в систему");
            stage.setScene(new Scene(root));
            stage.setMaxWidth(569);
            stage.setMaxHeight(430);
            stage.setResizable(false);
            stage.show();
        });
    }
}
