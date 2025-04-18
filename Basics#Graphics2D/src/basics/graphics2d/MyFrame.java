/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basics.graphics2d;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

/**
 *
 * @author anagy
 */
public class MyFrame extends JFrame {
    MyPanel panel;
    MyFrame(){
        frame();
    }
    void frame(){
      panel=new MyPanel();
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
     this.add(panel);
     this.pack();
     
     this.getContentPane().setBackground(Color.gray);
     this.setLocationRelativeTo(null);
     this.setVisible(true);
    
    }
    
   
}
