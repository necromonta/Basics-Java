/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

/**
 *
 * @author necromonta
 */
public class BusinessLogic {
    @FXML
    private ImageView pic;
    private double x;
    private double y;
    
    
    public void up(ActionEvent e){
        System.out.println("up");
        pic.setX(x+=10);
        
    }
}
