/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1javafx;


import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author necromonta
 */
public class UserInterface {
    private Stage stage;

    // Constructor that accepts the stage
    public UserInterface(Stage stage) {
        this.stage = stage;
    }

    public void createUI() throws IOException {
        // Create a button
        Button btn = new Button("Click Me");
        btn.setOnAction(e -> System.out.println("Button clicked!"));

        
        
        // Layout for the scene
        Parent root=FXMLLoader.load(getClass().getResource("fxBuilder.fxml"));
       // Group root = new Group();
         
        Text text=new Text();
        text.setText("yooo");
        text.setX(100);
        text.setFont(Font.font("Verdana",50));
        text.setFill(Color.LIMEGREEN);
        text.setY(50);
        
        Line line=new Line();
        line.setStartX(300);
         line.setStartY(300);
          line.setEndX(400);
           line.setEndY(400);
           line.setStrokeWidth(50);
           line.setStroke(Color.RED);
           line.setOpacity(0.7);
           line.setRotate(45);
           
           Rectangle rect=new Rectangle();
           rect.setX(50);
           rect.setY(50);
           rect.setWidth(100);
           rect.setHeight(100);
           
           Polygon triangle=new Polygon();
           triangle.getPoints().setAll(200.0,200.0,
                                       300.0,300.0,
                                       200.0,300.0);
           
           Circle circle=new Circle();
           circle.setCenterX(300);
           circle.setCenterY(300);
           circle.setRadius(50);
           
           Image image=new Image("cat.png");
           ImageView imageView=new ImageView(image);
           imageView.setX(600);
           imageView.setY(600);
          
        
//        root.getChildren().add(btn);
//        root.getChildren().add(text);
//        root.getChildren().add(line);
//        root.getChildren().add(rect);
//        root.getChildren().add(triangle);
//        root.getChildren().add(circle);
//         root.getChildren().add(imageView);

        // Set the scene and stage
        Scene scene = new Scene(root, 1920,1080,Color.GREEN);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("You can escape if you press escape duh");
        stage.setTitle("JavaFX Example");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}

