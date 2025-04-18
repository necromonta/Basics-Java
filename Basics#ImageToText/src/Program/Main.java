/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Program;


import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import java.io.File;
import java.io.IOException;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.imageio.ImageIO;
 
  
public class Main {
    public static int red;
    public static int blue;
    public static int green;
    public static void main(String[] args) throws IOException
    {
    

        System.out.println(imageToText());
        
    }
    
    
    public static String imageToText(){
        Tesseract tesseract = new Tesseract();
         String text="";
        try {
  
            tesseract.setDatapath("C:\\Users\\anagy\\Documents\\Programming\\NetBeansProjects\\Basics#ImageToText\\tessdata");
  
            // the path of your tess data folder
            // inside the extracted file
           
               text= tesseract.doOCR(new File("test3.jpg"));
  
            // path of your image file
           
        }
        catch (TesseractException e) {
        }
        return text;
    }
    
    public static void convert() throws IOException{
        //Reading the image
      File file= new File("C:\\Users\\anagy\\Documents\\Programming\\NetBeansProjects\\Basics#ImageToText\\item6.jpg");
      BufferedImage img = ImageIO.read(file);
      int counter=0;
      int b=0;
      int counter2=0;
        do {
             for (int y = 0; y < img.getHeight(); y++) {
         for (int x = 0; x < img.getWidth(); x++) {
             
            //Retrieving contents of a pixel
            int pixel = img.getRGB(x,y);
            //Creating a Color object from pixel value
            Color color = new Color(pixel, true);
            //Retrieving the R G B values
                 int red=color.getRed();
                 int green=color.getGreen();
                 int blue=color.getBlue();
             if (color.getRed()>b&&color.getGreen()>b&&color.getBlue()>b) {
                 counter++;
             }else{
                  red=0;
                  green=0;
                  blue=0;
                  counter2++;
             }

             color = new Color(red, green, blue);
            img.setRGB(x, y, color.getRGB());
         }
      }
             
            System.out.println(b);
             b++; 
        } while (!imageToText().equals("Baruuk Prime Systems Blueprint"));
        System.out.println(b-1);

      //Saving the modified image
      file = new File("C:\\Users\\anagy\\Documents\\Programming\\NetBeansProjects\\Basics#ImageToText\\setting_pixels.jpg");
      ImageIO.write(img, "jpg", file);
      System.out.println("Done...");
   }
    
    public static void test() throws IOException{
        File file= new File("C:\\Users\\anagy\\Documents\\Programming\\NetBeansProjects\\Basics#ImageToText\\item1.jpg");
      BufferedImage img = ImageIO.read(file);
         for (int y = 0; y < img.getHeight(); y++) {
         for (int x = 0; x < img.getWidth(); x++) {
             
            //Retrieving contents of a pixel
            int pixel = img.getRGB(x,y);
            //Creating a Color object from pixel value
            Color color = new Color(pixel, true);
       
                     red = color.getRed();
                     green = color.getGreen();
                     blue = color.getBlue();
//                    // check if the color is close to cyan
//                    if (red>125&&green>125 &&blue>125) {
//                        img.setRGB(x, y, Color.black.getRGB());
//                    }
                    if (green>150 && blue>150 && red<125) {
                        System.out.println("asd");
                        green=255;
                        blue=255;
                        red=0;
                    }else{
                        green=0;
                        blue=0;
                        red=0;
                    }
//                     if (green>250 && blue>250 &&red==0) {
//                        green=255;
//                        blue=255;
//                        red=0;
//                    }
           
            color = new Color(red, green, blue);
            img.setRGB(x, y,color.getRGB());

         }
      }
          //Saving the modified image
      file = new File("C:\\Users\\anagy\\Documents\\Programming\\NetBeansProjects\\Basics#ImageToText\\converted.jpg");
      ImageIO.write(img, "jpg", file);
      System.out.println("Done...");
      //max
//red max:105
//green max:221
//blue max:245
//min
//red max:29
//green max:97
//blue max:122
    }
    
    public static void test2() throws IOException{
        File file= new File("C:\\Users\\anagy\\Documents\\Programming\\NetBeansProjects\\Basics#ImageToText\\color.jpg");
      BufferedImage img = ImageIO.read(file);
      ArrayList<Color> list=new ArrayList();
         for (int y = 0; y < img.getHeight(); y++) {
         for (int x = 0; x < img.getWidth(); x++) {
             
            //Retrieving contents of a pixel
            int pixel = img.getRGB(x,y);
            //Creating a Color object from pixel value
            Color color = new Color(pixel, true);
             if (!list.contains(color)) {
                 list.add(color);
             }

         //   img.setRGB(x, y, color.getRGB());
         }
      }
         System.out.println(img.getWidth()*img.getHeight());
         System.out.println(list.size());
        
         for (int i = 0; i < list.size(); i++) {
             System.out.print(  list.get(i).getRed()+";");
               System.out.print( list.get(i).getGreen()+";");
                 System.out.print( list.get(i).getBlue());
             System.out.println("");
            
            
        }
         
         int max=260;
         for (int i = 0; i < list.size(); i++) {
             if (list.get(i).getRed()<max) {
                 max=list.get(i).getRed();
             }
        }
        System.out.println("red max:"+max);
         max=260;
         for (int i = 0; i < list.size(); i++) {
             if (list.get(i).getGreen()<max) {
                 max=list.get(i).getGreen();
             }
        }
        System.out.println("green max:"+max);
        max=260;
         for (int i = 0; i < list.size(); i++) {
             if (list.get(i).getBlue()<max) {
                 max=list.get(i).getBlue();
             }
        }
        System.out.println("blue max:"+max);
   
        
        
        
        
    }
    }
