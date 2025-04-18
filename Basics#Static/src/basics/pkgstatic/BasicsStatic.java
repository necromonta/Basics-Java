/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basics.pkgstatic;

/**
 *
 * @author anagy
 */
public class BasicsStatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Custom number=new Custom(13,001123);
        System.out.println(Custom.numberOfInstances);
        System.out.println(number.tag);
        System.out.println(number.plusFive());
        Custom.necroNumber();
    }
    
}
