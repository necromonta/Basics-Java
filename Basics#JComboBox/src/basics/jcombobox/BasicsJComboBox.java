/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basics.jcombobox;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author anagy
 */
public class BasicsJComboBox {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame=new JFrame();
          String data[]={"elem1","elem2","elem3"};
       JComboBox cb=new JComboBox(data);
       
        cb.setEditable(false);
        cb.getItemCount();
        cb.addItem("elem5");
        cb.insertItemAt("elem4", 1);
        cb.setSelectedIndex(1);
        cb.removeItem("elem4");
        cb.removeItemAt(0);
        //cb.removeAllItems();
        
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
      
        frame.add(cb);
         cb.addActionListener(e -> {
   System.out.println(cb.getSelectedItem());
  
});
    }


    
}
