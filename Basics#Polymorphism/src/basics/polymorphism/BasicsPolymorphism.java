/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basics.polymorphism;

/**
 *
 * @author anagy
 */
public class BasicsPolymorphism {

    //the ability of an object to identify as more than one type
    public static void main(String[] args) {
       Car car=new Car();
       Bicycle bike=new Bicycle();
       Boat boat=new Boat();
       
       Vehicle[] vehicles={car,bike,boat};
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].go();
        }
    }
    
}
