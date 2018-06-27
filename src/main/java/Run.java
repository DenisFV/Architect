import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Run extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setTitle("Патентное бюро - вход в систему");
        primaryStage.setScene(new Scene(root));
        primaryStage.setMaxWidth(569);
        primaryStage.setMaxHeight(430);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}