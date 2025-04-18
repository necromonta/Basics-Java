/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basics.inheritence;

/**
 *
 * @author anagy
 */
public class BasicsInheritence {

    //the process where one class acqures the attributes and methods of another class (parent class)
    public static void main(String[] args) {
        
        Car car=new Car();
        car.go();
        Bicycle bike=new Bicycle();
        bike.stop();
        System.out.println(bike.speed);
        System.out.println(car.speed);
        System.out.println(car.doors);
        System.out.println(bike.paddles);
    }
    
}
