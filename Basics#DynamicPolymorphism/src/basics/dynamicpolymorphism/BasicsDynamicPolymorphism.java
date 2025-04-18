/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basics.dynamicpolymorphism;

import java.util.Scanner;

/**
 *
 * @author anagy
 */
public class BasicsDynamicPolymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Animal animal;
      Scanner sc=new Scanner(System.in);
        System.out.println("1.cat \n2.dog");
        int input=sc.nextInt();
        if (input==2) {
            animal=new Dog();
        }else if (input==1) {
            animal=new Cat();
        }else{
            animal=new Animal();
        }
        
        animal.speak();
    }
    
}
