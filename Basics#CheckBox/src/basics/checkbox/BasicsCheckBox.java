/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basics.checkbox;

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author anagy
 */
public class BasicsCheckBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          JFrame frame=new JFrame();
          JCheckBox cb=new JCheckBox();
          ImageIcon x=new ImageIcon("x.png");
           ImageIcon tick=new ImageIcon("tick.png");
          cb.setText("Woof");
          cb.setFocusable(false);
          cb.setFont(new Font("Calibir",Font.PLAIN,35));
          cb.setIcon(x);
          cb.setSelectedIcon(tick);
          System.out.println(cb.isSelected());
          
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
      
        frame.add(cb);
    }
    
}
