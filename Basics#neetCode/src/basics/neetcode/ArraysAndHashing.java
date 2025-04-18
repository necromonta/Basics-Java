/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basics.neetcode;

import java.util.ArrayList;

/**
 *
 * @author anagy
 */
public class ArraysAndHashing {
    ArraysAndHashing(){
       //1.
        System.out.println(containsDuplicate(new int[]{1,2,3,4,5,1}));
        //2.
        sumOfTwo(9,new int[]{2,7,11,15});
        
    }
 boolean containsDuplicate(int[] array){
       ArrayList<Integer> temp=new ArrayList();
        for (int i = 0; i < array.length; i++) {
            if (temp.contains(array[i])) {
                return true;
            }else{
                temp.add(array[i]);
            }
        }
        return false;
    }
    
 boolean isAnagram(String a,String b){
     
      char temp[]=new char[a.length()];
      for (int i = 0; i < temp.length; i++) {
         temp[i]=a.charAt(i);
     }
      int correct;
      for (int i = 0; i < 10; i++) {
         
     }
        return false;
    }
 
 void sumOfTwo(int target,int[] array){
     for (int i = 0; i < array.length; i++) {
         for (int j = 0; j < array.length; j++) {
             if (i!=j&&array[i]+array[j]==target) {
                 System.out.println(i+","+j);
                 return;
             }
         }
     }
 
 }
    
}
