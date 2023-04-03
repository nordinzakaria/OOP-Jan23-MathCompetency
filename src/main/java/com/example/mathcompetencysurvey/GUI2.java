package com.example.mathcompetencysurvey;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

class ButtonHandler implements EventHandler<ActionEvent>
{
    public void handle(ActionEvent event) {
        System.out.println("Hello World!");
        }
}

public class GUI2 extends Application {
    // put attributes here
    private MinisterInCharge minister;
    private MinistrySurvey surveys[] = new MinistrySurvey[5];
    int counter;

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 300, 130, Color.WHITE);

        GridPane gridpane = new GridPane();


        GridPane gridpane0 = new GridPane();
        gridpane0.add(new Label("Survey"), 0, 0);

        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPercentWidth(50);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(50);

        GridPane gridpane1 = new GridPane();
        gridpane1.getColumnConstraints().addAll(col1,col2);
        Label label = new Label("Year");
        gridpane1.add(label, 0, 0);
        TextField tf = new TextField();
        gridpane1.add(tf, 1, 0);

        GridPane gridpane2 = new GridPane();
        gridpane2.getColumnConstraints().addAll(col1,col2);
        Button okbutton = new Button("OK");
        Button resetbutton = new Button("Reset");
        gridpane2.add(okbutton, 0, 0);
        gridpane2.add(resetbutton,1, 0);

        GridPane gridpane3 = new GridPane();
        gridpane3.getColumnConstraints().addAll(col1,col2);
        Label ministerlabel = new Label("Minister");
        TextField ministertf = new TextField();
        gridpane3.add(ministerlabel, 0, 0);
        gridpane3.add(ministertf,1, 0);


        //okbutton.setOnAction(new ButtonHandler());

        okbutton.setOnAction( // anonymous class
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        System.out.println("Hello World!" + counter);
                        MinistrySurvey ms = new MinistrySurvey("The PIC");
                        ms.setYear(tf.getText());
                        surveys[counter] = ms;
                        counter++;

                        minister = new MinisterInCharge(ministertf.getText());
                    }
                }
        );

        gridpane.add(gridpane0, 0, 0);
        gridpane.add(gridpane1, 0, 1);
        gridpane.add(gridpane2, 0, 2);
        gridpane.add(gridpane3, 0, 3);


        root.getChildren().add(gridpane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }


}
