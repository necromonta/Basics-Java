/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basics.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author necromonta
 */
public class BasicsStream {

    public static void main(String[] args) {
        //init
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Elon Musk", 250));
        people.add(new Person("Jeff Bezos", 190));
        people.add(new Person("Bill Gates", 130));
        people.add(new Person("Warren Buffett", 120));
        
        
        int arr[]=new int[] {2,4,6,8,9};
        int arr2=Arrays.stream(arr)
                
                .skip(2)
                .map(x -> x*x)
                .sum()
               // .average()
               // .ifPresent(System.out::println)
               ;
               
      
        IntSummaryStatistics asd=Arrays.stream(arr)
                .summaryStatistics();
        System.out.println(asd);
    
        
        //methods
        //list
        List<Person> changed =people.stream()
                .distinct()  
                .filter(person -> person.billions >150)  
                .sorted(Comparator.comparing(person -> person.name)) 
                .limit(1)
                .collect(Collectors.toList())
                ;
      
        
            System.out.println("--");
     
         //data  
        System.out.println(people.stream().count());
        System.out.println( people.stream().anyMatch(person -> person.billions==130));
       System.out.println( people.stream().allMatch(person -> person.billions==130));
          people.stream().forEach(person -> person.billions+=1);
           
          System.out.println( people.stream().max(Comparator.comparing(person -> person.billions)).get().name);
          System.out.println( people.stream().min(Comparator.comparing(person -> person.billions)).get().name);     
            // people.stream().map(person -> person.billions+500)
           

     System.out.println("--");
        // Print the list
        for (Person person : people) {
            System.out.println(person.name + " has $" + person.billions + " billion.");
        }
        System.out.println("--");
        //changed list
            changed.stream().forEach(person -> System.out.println(person));
         System.out.println("--");
        //int list
        for (int x : arr) {
            System.out.println(x);
        }
        
    }
    }
    
    class Person{
        String name;
        int billions;

        public Person(String name, int billions) {
            this.name = name;
            this.billions = billions;
        }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", billions=" + billions + '}';
    }
        
    }

