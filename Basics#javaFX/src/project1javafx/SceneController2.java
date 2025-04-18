package project1javafx;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author necromonta
 */
public class SceneController2 {
    @FXML
    Label label;
    private Stage stage;
    private Scene scene;
    private Parent root;
    public void switchToScene1(ActionEvent event) throws IOException{
        root=FXMLLoader.load(getClass().getResource("fxBuilder.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void displayName(String name){
        label.setText("Hi "+name);
    }
  
    
    
}
