/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package src.pkgnative.hook;



import java.awt.AWTException;
import java.awt.Robot;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import java.util.logging.*;



/**
 *
 * @author anagy
 */
public class NativeHook implements NativeKeyListener {

public void nativeKeyPressed(NativeKeyEvent e) {
    System.out.println("Key Pressed: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
    System.out.println(e.getKeyCode());
    switch (e.getKeyCode()) {
        case 32 ->{
            System.exit(0);
        }
            case 17 -> {
                System.out.println("asdww");
                Robot bot = null;
                try {
                    bot = new Robot();
                } catch (AWTException ex) {
                    
                }
                for (int i = 0; i < 1000; i++) {
                    bot.keyPress(37);
                    bot.delay(60);
                    bot.keyRelease(37);
                }
        }

            default -> {
        }
               
        }
}

@Override
public void nativeKeyReleased(NativeKeyEvent e) {
        System.out.println("Key Released: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
        
}

public void nativeKeyTyped(NativeKeyEvent e) {
        System.out.println("Key Typed: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
}

public static void main(String args[]) throws NativeHookException{
    
Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
logger.setLevel(Level.OFF);
logger.setUseParentHandlers(false);

    //Just put this into your main:
    try {
        GlobalScreen.registerNativeHook();
       
    }
    catch (NativeHookException ex) {
        System.err.println("There was a problem registering the native hook.");
        System.err.println(ex.getMessage());
        System.exit(1);
    }
    
     
NativeHook asd=new NativeHook();
   GlobalScreen.addNativeKeyListener(asd);
    
}


}
