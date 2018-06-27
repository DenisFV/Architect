import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class Registration {

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

//        send_button.setOnAction(event -> {
//            registrationNewUser();
//        });

        new HelpFunction().openNewScene(send_button, "generationLoginAndPassword.fxml", "сгенерированные логин и пароль", 569, 430);

        new HelpFunction().helpCheck(man_check, woman_check);
        new HelpFunction().helpCheck(woman_check, man_check);

        new HelpFunction().openNewScene(backToLogin_button, "login.fxml", "вход в систему", 569, 430);

    }

    private void registrationNewUser() {
        String name = name_text.getText();
        String surname = passport_text.getText();
        String patronymic = patronymic_text.getText();
        String gender = "";
        if (man_check.isSelected()) gender = "М";
        else gender = "Ж";
        String passport = passport_text.getText();
        String phone = phone_text.getText();

        User user = new User(name, surname, patronymic, gender, passport, phone);
        DatabaseHandler dbHandler = new DatabaseHandler();

        try {
            dbHandler.registration(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}