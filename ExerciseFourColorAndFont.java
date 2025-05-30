package exercisefourcolorandfont;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author bryce
 */
public class ExerciseFourColorAndFont extends Application {
    
    
    //creating the label and setting font, textfill, rotate
    @Override
    public void start(Stage primaryStage) {
        GridPane p = new GridPane();
        p.setAlignment(Pos.CENTER);
        Label[] l = new Label[5];
        for (int i = 0; i <l.length; i++){
            l[i] = new Label("Java");
            l[i].setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
            l[i].setTextFill(getRandomColor());
            l[i].setRotate(90);
            p.add(l[i], i, 0);
        }
        
        //setting the title and scene
        Scene scene = new Scene(p, 300, 250);
        primaryStage.setTitle("Java text");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //main
    public static void main(String[] args) {
        launch(args);
    }    
    
    //random colors
    private Color getRandomColor() {
        return new Color(Math.random(), Math.random(),Math.random(),Math.random());
    }
}
