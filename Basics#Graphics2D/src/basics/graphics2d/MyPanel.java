/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basics.graphics2d;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author anagy
 */
public class MyPanel extends JPanel{
    MyPanel(){
        this.setPreferredSize(new Dimension(500,500));
    }
     @Override
    public void paint(Graphics g){
       Graphics2D g2D=(Graphics2D) g;
       g2D.setStroke(new BasicStroke(5));
       g2D.setPaint(Color.blue);
       g2D.drawLine(0,0,500,500);
       g2D.drawRect(0,0,100,200);
       g2D.fillRect(50, 50,100,100);
       g2D.drawOval(100,200,100,100);
       g2D.fillOval(50,200,100,100);
       g2D.drawArc(300,300,100,100,30,180);
       int[] xPoints={150,250,350};
       int[] yPoints={300,150,300};
       g2D.drawPolygon(xPoints,yPoints,3);
       g2D.setFont(new Font("Ink Free",Font.BOLD,50));
       g2D.drawString("U won",50,50);
      
          
    }
    
}
