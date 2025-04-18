/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication70;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.FileWriter;


public class JavaApplication70 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException, InterruptedException,IOException{
       
    
          click(419,406);  
     

        
    }

  
    public static void screenShot() throws IOException{
         //fullscreen
            // Rectangle capture =  new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
         try {
            Thread.sleep(120);
            Robot r = new Robot();
  
            // It saves screenshot to desired path
            String path = "Shot.jpg";
  
            // Used to get ScreenSize and capture image
            Rectangle capture =                  
            new Rectangle();
             capture.height=1080;
           capture.width=3840;
           
            BufferedImage Image = r.createScreenCapture(capture);
            ImageIO.write(Image, "jpg", new File(path));
            System.out.println("Screenshot saved");
        }
        catch (AWTException | IOException | InterruptedException ex) {
            System.out.println(ex);
        }
    }
    public static void click(int x, int y) throws AWTException, InterruptedException{
    Robot bot = new Robot();
    bot.mouseMove(x, y);    
    bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
     Thread.sleep(120);
      bot.keyPress(84);
      bot.keyRelease(84);
      bot.keyPress(69);
      bot.keyRelease(69);
      bot.keyPress(83);
      bot.keyRelease(83);
      bot.keyPress(84);
      bot.keyRelease(84);
      
      
     
    bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

  
        
}
}
