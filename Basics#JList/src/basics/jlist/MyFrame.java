/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basics.jlist;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author anagy
 */
public class MyFrame extends JFrame {
    MyFrame(){
        jlist();
        frame();
    }
    void jlist(){
         String array[]={"XXV.;1991.01.27.;New York Giants;20-19;Buffalo Bills;Tampa Stadium;Tampa, Florida;73813",
"XXVI.;1992.01.26.;Washington Redskins;37-24;Buffalo Bills;Metrodome;Minneapolis, Minnesota;63130",
"XXVII.;1993.01.31.;Dallas Cowboys;52-17;Buffalo Bills;Rose Bowl;Pasadena, Kalifornia;98374",
"XXVIII.;1994.01.30.;Dallas Cowboys;30-13;Buffalo Bills;Georgia Dome;Atlanta, Georgia;72817};"};
        
        DefaultListModel<String> l1 = new DefaultListModel<>();  
        for (int i = 0; i < array.length; i++) {
            l1.addElement(array[i]); 
        }      
        
          JList<String> list = new JList<>(l1);  
          list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
list.setVisibleRowCount(-1);
JScrollPane listScroller = new JScrollPane(list);
listScroller.setPreferredSize(new Dimension(250, 80));
          list.setBounds(100,100, 75,75);  
          this.add(list); 

    }
    void frame(){
        
        this.setSize(800,800);
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("JList");
    }
}
