/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basics2.pkg4.progressbar;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

/**
 *
 * @author anagy
 */
public class ProgressBarDemo {

    JFrame frame =new JFrame();
    JProgressBar bar=new JProgressBar(0,500);
    public ProgressBarDemo() throws InterruptedException {
        
        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli",Font.BOLD,25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);
        
        
        
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        fill();
    }
    
    public void fill() throws InterruptedException
    {
        int counter=500;
        while(counter>0)
        {
          bar.setString(counter+"/500 HP");
          bar.setValue(counter);  
          try{
          Thread.sleep(10);
          }catch(InterruptedException e){
              
          }
              counter-=1;
        }
        bar.setString("Dead");
        
    }
    
}
