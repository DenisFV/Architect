import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;

public class Login {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private static TextField login_text;

    void setLogin_text(TextField newLogin) {
        login_text = newLogin;
    }

    String getLogin_text() {
        return login_text.getText();
    }

    @FXML
    private Button helpLogin_button;

    @FXML
    private static PasswordField password_text;

    void setPassword_text(TextField newPassword) {
        PasswordField p = new PasswordField();
        p.setText(newPassword.getText());
        password_text = p;
    }

    String getPassword_text() {
        return password_text.getText();
    }

    @FXML
    private Button helpPassword_button;

    @FXML
    private Button goToRegistration_button;

    @FXML
    private Button login_button;

    private static int fl = 0;

    @FXML
    void initialize() {

        if (login_text == null || password_text == null) {
            helpLogin_button.setText("");
            helpPassword_button.setText("");

            Font font = login_button.getFont();
            login_button.onMousePressedProperty().set(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    new HelpFunction().handleHelp(login_button, 5, 555, "Введите логин и пароль, или нажатие \"Подать заявку\"");
                    login_button.setFont(new Font(21));
                }
            });
            login_button.onMouseExitedProperty().set(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    new HelpFunction().handleHelp(login_button, 206, 157, "Войти");
                    login_button.setFont(font);
                }
            });
        }
        if (fl==2) {
            new HelpFunction().openNewScene(login_button, "personalAreaVerifier.fxml", "личный кабинет", 985, 865);
        }
        if (fl==1) {
            new HelpFunction().openNewScene(login_button, "personalAreaManager.fxml", "личный кабинет", 906, 865);
            fl=2;
        }
        if (fl==0 && login_text!=null) {
            new HelpFunction().openNewScene(login_button, "personalAreaClient.fxml", "личный кабинет", 906, 865);
            fl=1;
        }


        goToRegistration_button.setOnAction(event -> {
            String loginText = getLogin_text().trim();
            String passwordText = getPassword_text().trim();

            if (!loginText.equals("") && !passwordText.equals("")) loginPassword(loginText, passwordText);
            else System.out.println("Логин или пароль не введеныError or Password is empty");
        });


        new HelpFunction().openNewScene(goToRegistration_button, "registration.fxml", "регистрация", 906, 426);

        helpLogin_button.onMouseMovedProperty().set(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (login_text != null) new HelpFunction().handleHelp(helpLogin_button, 5, 80, getLogin_text());
            }
        });
        helpLogin_button.onMouseExitedProperty().set(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (login_text != null) new HelpFunction().handleHelp(helpLogin_button, 44, 35, "?");
            }
        });

        helpPassword_button.onMouseMovedProperty().set(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (login_text != null) new HelpFunction().handleHelp(helpPassword_button, 5, 80, getPassword_text());
            }
        });
        helpPassword_button.onMouseExitedProperty().set(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (password_text != null) new HelpFunction().handleHelp(helpPassword_button, 44, 35, "?");
            }
        });
    }

    private void loginPassword(String login, String password) {

    }
}