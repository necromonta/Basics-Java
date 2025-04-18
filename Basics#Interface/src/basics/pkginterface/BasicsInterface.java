/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basics.pkginterface;

/**
 *
 * @author anagy
 */
public class BasicsInterface {

    //template that can be applied to a class
    //there can be more than 1 interfaces /class
    //similar to inheritence but more specific
    public static void main(String[] args) {
        Rabbit rabbit=new Rabbit();
        rabbit.flee();
        Hawk hawk=new Hawk();
        hawk.hunt();
        Fish fish=new Fish();
        fish.hunt();
        fish.flee();
    }
    
}
