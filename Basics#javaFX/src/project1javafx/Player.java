/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1javafx;

import java.util.ArrayList;

/**
 *
 * @author necromonta
 */
public class Player {
    private int day;
    private int money;
    private ArrayList<Building> buildings=new ArrayList();
    private ArrayList<InventoryManagement> inventory=new ArrayList();
    public Player(int day,int money,ArrayList<Building> buildings,ArrayList<InventoryManagement> inventory){
        this.day = day;
        this.money = money;
        this.buildings=buildings;
        this.inventory=inventory;
    }

    
}
