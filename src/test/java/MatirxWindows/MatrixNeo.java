package MatirxWindows;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;


public class MatrixNeo extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        Numbers birSan = new Numbers(5,250,100);
        birSan.setFill(Color.GREEN);
        root.getChildren().add(birSan);
        TranslateTransition fall = new TranslateTransition();
        fall.setAutoReverse(false);
        fall.setCycleCount(1);
        fall.setFromY(birSan.getY());
        fall.setFromX(birSan.getXCord());
        fall.setToY(500);
        fall.setToX(birSan.getXCord());
        fall.setDuration(Duration.seconds(10));
        fall.setNode(birSan);
        fall.play();


        Scene scene = new Scene(root, 500, 400,Color.BLACK);
        stage.setScene(scene);
        stage.setTitle("Neo\'s Eye");
        stage.show();
    }
}
