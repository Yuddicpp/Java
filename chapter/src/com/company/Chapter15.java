package com.company;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Chapter15 extends Application {

    public static void main(String[] args) {
        Application.launch();
    }

    private CirclePane circlePane = new CirclePane();



    @Override
    public void start(Stage stage) throws Exception {

        HBox pane = new HBox(100);
        pane.setAlignment(Pos.CENTER);

        Button oKButton = new Button("OK");
        OKHandlerClass okHandlerClass = new OKHandlerClass();
        oKButton.setOnAction(okHandlerClass);

        Button cancelButton = new Button("cancel");
        CancleHandlerClass cancleHandlerClass = new CancleHandlerClass();
        cancelButton.setOnAction(cancleHandlerClass);

        pane.getChildren().add(oKButton);
        pane.getChildren().add(cancelButton);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(circlePane);
        borderPane.setBottom(pane);

        Scene scene = new Scene(borderPane,200,200);

        stage.setScene(scene);
        stage.show();

    }

    class OKHandlerClass implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent actionEvent) {
            circlePane.enLarge();
        }
    }

    class CancleHandlerClass implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent actionEvent) {
            circlePane.shrink();
        }
    }

}





class CirclePane extends StackPane {
    private Circle circle = new Circle(50);

    public CirclePane() {
        getChildren().add(circle);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
    }

    public void enLarge() {
        circle.setRadius(circle.getRadius()+2);
    }

    public void shrink() {
        circle.setRadius(circle.getRadius()>2?circle.getRadius()-2:circle.getRadius());
    }
}