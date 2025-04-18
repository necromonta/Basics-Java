/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basics.genericinterface;

/**
 *
 * @author necromonta
 */
public class Product <T,U>{
    T item;
    U price;
    
    Product(T item,U price){
        this.item=item;
        this.price=price;
    }
    
    public T getItem(){
        return this.item;
    }
    
    public U getPrice(){
        return this.price;
    }
}
