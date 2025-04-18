/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basics.pkgstatic;

/**
 *
 * @author anagy
 */
public class Custom {
    static int numberOfInstances;
    double number;
    int tag;

    public Custom(double number, int tag) {
        this.number = number;
        this.tag = tag;
        numberOfInstances++;
    }

    Custom() {
        numberOfInstances++;
    }
    
    double plusFive(){
        return number+5;
    }
    
    static void necroNumber(){
        System.out.println("19");
    }
    
    
}
