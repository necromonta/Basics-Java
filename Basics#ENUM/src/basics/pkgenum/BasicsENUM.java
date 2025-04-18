/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basics.pkgenum;

/**
 *
 * @author necromonta
 */
public class BasicsENUM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Day day= Day.SUNDAY;
        System.out.println(day);
        System.out.println(day.getDayNumber());
        
        switch (day) {
            case MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY->System.out.println("It's weekday");
            case SATURDAY,SUNDAY->System.out.println("It's weekend");
                
        }
             
    }
    
}
