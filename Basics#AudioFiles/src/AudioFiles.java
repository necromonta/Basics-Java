
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class AudioFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner sc=new Scanner(System.in);
        File file=new File("Bank.wav");
        AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);
        String response="";
        
        while(!response.equals("Q")){
            System.out.println("P = play, S = Stop, R = reset, Q= quit");
            System.out.println("Enter choice");
           response=sc.nextLine();
        response=response.toUpperCase();
            switch(response){
                case("P"): clip.start();
                break;
                case("S"): clip.stop();
                break;
                case("R"): clip.setMicrosecondPosition(0);
                break;
                case("Q"): clip.close();
                break;
                default: System.out.println("Not a valid input");
            }
        }
        System.out.println("Byeee");
    }
     
    
}
