package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


import java.awt.*;


public class Main extends Application {

    @Override // Redefinisanje metode start() klase Application
    public void start(Stage primaryStage) throws Exception{
        // primer sa slikom unutar label-a
        ImageView us = new ImageView("us.jpg");
        // postavljanje velicine slike;
        us.setFitHeight(50);
        us.setFitWidth(100);
        Label lb1 = new Label("us/n50 States", us);
        lb1.setStyle("-fx-border-color:green; -fx-border-width: 2");
        lb1.setContentDisplay(ContentDisplay.BOTTOM);
        lb1.setTextFill(Color.RED);

        // primer sa grafickim objektom diznad teksta labele
        Label lb2 = new Label("Krug",new Circle(50,50,25) );
        lb2.setContentDisplay(ContentDisplay.TOP);
        lb2.setTextFill(Color.BLACK);

        // primer sa grafickim objektom levo teksta labele
        Label lb3 = new Label("Pravougaonik",new Rectangle(10,10,25, 25) );
        lb3.setContentDisplay(ContentDisplay.RIGHT);
        lb3.setTextFill(Color.LIGHTGREEN);

        // primer sa grafickom objektom desno teksta labele
        Label lb4 = new Label("Ellipsa",new Ellipse(10,10,25, 25) );
        lb4.setContentDisplay(ContentDisplay.LEFT);
        lb4.setTextFill(Color.LIGHTGREEN);

        // primer sa grafickim objektom koji u sebi sadrzi tekst i nalazi se ispod teksta labele
        Ellipse ellipse = new Ellipse(50,50,50,25);
        ellipse.setStroke(Color.ROSYBROWN);
        ellipse.setFill(Color.WHITESMOKE);

        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(ellipse,new Label("JavaFX"));
        Label lb5 = new Label("A pane inside a label", stackPane);
        lb5.setContentDisplay(ContentDisplay.BOTTOM);

        HBox pane = new HBox(20);
        pane.getChildren().addAll(lb1,lb2,lb3,lb4,lb5);

        // kreiranje scene i postavljanje scene na pozornicu
        Scene scene = new Scene(pane, 650, 150);
        primaryStage.setTitle("Labele");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
