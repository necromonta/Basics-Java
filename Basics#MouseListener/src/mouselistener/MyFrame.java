/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mouselistener;

import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author anagy
 */
public class MyFrame extends JFrame implements MouseListener {
    
    
    
    
    JLabel label;
    JLabel label2;
    
    MyFrame()
    {
        label2=new JLabel();
        label2.setBounds(100,50,100,100);
        label2.setBackground(Color.blue);
        label2.setOpaque(true);
        label2.addMouseListener(this);
       
        label=new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.blue);
        label.setOpaque(true);
        label.addMouseListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        
        this.setLayout(null);
        this.setVisible(true);
        this.add(label);
        this.add(label2);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource()==label2) {
            label.setBackground(Color.red); 
        }
       
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setBackground(Color.green);
    }
}
