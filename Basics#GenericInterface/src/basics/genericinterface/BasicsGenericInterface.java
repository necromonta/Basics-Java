/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basics.genericinterface;

/**
 *
 * @author necromonta
 */
public class BasicsGenericInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Box box=new Box();
        box.addItem("banana");
        box.addItem(3);
        box.getItems();
        
        Product<String,Double> product=new Product("Apple","3.14");
        Product<Character,Integer> product2=new Product("A",3);
        System.out.println(product.getItem());
        System.out.println(product.getPrice());
          System.out.println(product2.getItem());
        System.out.println(product2.getPrice());
    }
   
    
}
