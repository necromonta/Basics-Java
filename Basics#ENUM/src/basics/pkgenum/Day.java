/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package basics.pkgenum;

/**
 *
 * @author necromonta
 */
public enum Day {
    
    SUNDAY(1),MONDAY(2),TUESDAY(3),WEDNESDAY(4),THURSDAY(5),FRIDAY(6),SATURDAY(7);
    
    private final int dayNumber;
    Day(int dayNumber){
        this.dayNumber=dayNumber;
    }
    
    public int getDayNumber(){
        return dayNumber;
    }
}
