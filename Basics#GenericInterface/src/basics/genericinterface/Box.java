/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basics.genericinterface;

import java.util.ArrayList;

/**
 *
 * @author necromonta
 */
public class Box<T> {
    ArrayList<T> item;
    public  Box(){
        this.item= new ArrayList<T>();
    }
    
    public void addItem(T item){
          this.item.add(item);
    }
    
    public void getItems(){
        for (int i = 0; i < item.size(); i++) {
            System.out.println(item.get(i));
        }
    }
}
