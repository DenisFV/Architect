import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelpFunction {

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

    void handleHelp(Button button, Integer x, Integer wight, String text) {
        button.setLayoutX(x);
        button.setPrefWidth(wight);
        button.setText(text);
    }

    void openNewScene(Button button, String fxml, String title, Integer x, Integer y) {
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
            stage.setMaxWidth(x);
            stage.setMaxHeight(y);
            stage.setResizable(false);
            stage.show();
        });
    }

}
