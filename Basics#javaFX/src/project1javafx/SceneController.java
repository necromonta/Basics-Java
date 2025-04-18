/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1javafx;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author necromonta
 */
public class SceneController {
    @FXML
    TextField nameTextField;
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToScene2(ActionEvent event) throws IOException{
        String username=nameTextField.getText();
        
        FXMLLoader loader=new FXMLLoader(getClass().getResource("main.fxml"));
        root=loader.load();
        
        SceneController2 scene2=loader.getController();
        scene2.displayName(username);
       // root=FXMLLoader.load(getClass().getResource("main.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    
}
