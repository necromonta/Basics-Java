package ciklus;
import java.util.Scanner;

class Ember{
        int kor;
        int cm;
        double suly;
        double bmi;
    
public Ember(int k,int c,double s)
{
        kor=k;
        cm=c;
        suly=s;
        bmi=(s/c/c)*10000;
        
}
}

public class NewMain {
public static void main(String[] args) {
    
      Scanner sc=new Scanner(System.in);
        
        System.out.println("Add meg a korod(év), add meg magasságod(cm),add meg a sulyod(kg)");
        Ember e=new Ember(sc.nextInt(),sc.nextInt(),sc.nextInt());
        
        System.out.println(e.bmi);
        
        
        
        
        
        
        
    }
    
}
