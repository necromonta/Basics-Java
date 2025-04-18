/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basics.thread;


import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author necromonta
 */
public class BasicsThread {
      static   List<Thread> enemyThreads = new ArrayList<>();
      static   List<Enemy> enemies = new ArrayList<>();    
    public static void main(String[] args) throws InterruptedException {
      
        for (int i = 0; i < 5; i++) {
            addEnemy();
        }
      
        
    }
   
 public static void addEnemy(){
      Enemy enemy = new Enemy();
        enemies.add(enemy);
        Thread enemyThread = new Thread(enemy);
        enemyThreads.add(enemyThread);
        enemyThread.start();
 }
}
  
 class Enemy implements Runnable {    
    private boolean running; 
    public Enemy() {
        this.running = true;
    }
    
    @Override
    public void run() {
        while (running) {
            System.out.println(this.toString());
            try {
               
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



    public void stop() {
        running = false; // Stop the thread when needed
    }


}




   
