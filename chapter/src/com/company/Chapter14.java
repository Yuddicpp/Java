package com.company;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.stage.*;
import java.awt.*;




public class Chapter14 extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();


        Circle circle = new Circle();
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));


        circle.setStroke(Color.RED);
        circle.setFill(Color.PURPLE);

        Scene scene = new Scene(pane,700,500);


        circle.setRadius((pane.getHeight()>pane.getWidth())?pane.getWidth()/2:pane.getHeight()/2);

        Text text = new Text(50,50,"Hello world");
        pane.getChildren().add(circle);
        pane.getChildren().add(text);


        primaryStage.setTitle("Circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}



