import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.stage.Stage;

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
    private Button goToApplyForPatent_button;

    @FXML
    private Button login_button;

    @FXML
    void initialize() {

        if (login_text == null || password_text == null) {
            helpLogin_button.setText("");
            helpPassword_button.setText("");

            Font font = login_button.getFont();
            login_button.onMousePressedProperty().set(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    login_button.setLayoutX(5);
                    login_button.setPrefWidth(555);
                    login_button.setFont(new Font(21));
                    login_button.setText("Введите логин и пароль, или нажатие \"Подать заявку\"");
                }
            });
            login_button.onMouseExitedProperty().set(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    login_button.setLayoutX(206);
                    login_button.setPrefWidth(157);
                    login_button.setFont(font);
                    login_button.setText("Войти");
                }
            });
            openNewScene(goToApplyForPatent_button, "applyForPatent.fxml", "подача заявки");
        }
        else {
            goToApplyForPatent_button.setVisible(false);
            openNewScene(login_button,"personalArea.fxml", "личный кабинет");
        }



        helpLogin_button.onMouseMovedProperty().set(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (login_text != null) handleHelp(helpLogin_button, 5, 80, getLogin_text());
            }
        });
        helpLogin_button.onMouseExitedProperty().set(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (login_text != null) handleHelp(helpLogin_button, 44, 35, "?");
            }
        });

        helpPassword_button.onMouseMovedProperty().set(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (login_text != null) handleHelp(helpPassword_button, 5, 80, getPassword_text());
            }
        });
        helpPassword_button.onMouseExitedProperty().set(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (password_text != null) handleHelp(helpPassword_button, 44, 35, "?");
            }
        });

    }

    void handleHelp(Button button, Integer x, Integer wight, String text) {
        button.setLayoutX(x);
        button.setPrefWidth(wight);
        button.setText(text);
    }

    void openNewScene(Button button, String fxml, String text) {
        button.setOnAction(event -> {
            button.getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource(fxml));
            try {
                fxmlLoader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent parent = fxmlLoader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(parent));
            stage.setTitle("Патентное бюро - "+text);
            stage.showAndWait();
        });
    }
}