/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basics2.pkg2.keylistener;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author anagy
 */
public class MyFrame extends JFrame implements KeyListener {
    
    
//    HashMap<Integer, String> letters = new HashMap<Integer, String>();
//         if (!letters.containsKey(e.getKeyCode())) {
//            letters.put(e.getKeyCode(), )
//        }
    
    JLabel label;
    
    MyFrame()
    {

        
       
        label=new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.addKeyListener(this);
        this.setLayout(null);
        this.setVisible(true);
        this.add(label);
        this.toFront();
    }

    @Override
    public void keyTyped(KeyEvent e) {
      
    }

    @Override
    public void keyPressed(KeyEvent e) {
          
       System.out.print(e.getKeyCode()+",");
       System.out.println(e.getKeyChar());
   
      
       switch(e.getKeyCode())
        {
           case 37 :label.setLocation(label.getX()-10,label.getY());
            break;
           case 39 :label.setLocation(label.getX()+10,label.getY());
            break;
           case 38 :label.setLocation(label.getX(),label.getY()-10);
            break;
           case 40 :label.setLocation(label.getX(),label.getY()+10);
            break;

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
//        System.out.print(""+e.getKeyChar());
    }
}
