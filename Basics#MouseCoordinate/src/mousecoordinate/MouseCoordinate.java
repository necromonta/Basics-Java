/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mousecoordinate;

import java.awt.MouseInfo;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author anagy
 */
public class MouseCoordinate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TimerTask task1 = new MyTimerTask1();
          Timer timer = new Timer();
           timer.schedule(task1, 0, 1000);
        
    }
    public static class MyTimerTask1 extends TimerTask {
    public void run() {
        System.out.println("x:"+(int) MouseInfo.getPointerInfo().getLocation().getX());
        System.out.println("y:"+(int) MouseInfo.getPointerInfo().getLocation().getY());
    }
  
}
}
