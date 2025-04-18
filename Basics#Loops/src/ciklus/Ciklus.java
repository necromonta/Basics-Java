package ciklus;

import java.util.Scanner;

public class Ciklus {

    public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);

        
//        String[][] tabla = new String[10][10];
//        int[][] ertek = new int[10][10];
//        
//        //Filling up with empty fields
//        for (int i = 0; i < 10; i++) {
//            for (int h = 0; h < 10; h++) {
//                tabla[i][h] = "   ";
//                ertek[i][h] = 0;
//            }
//        } 
//          
//        tabla(tabla);
//    }
//    static void tabla(String[][] tomb) {
//        String abc[] = {"a", "b", "c", "d", "e", "f", "g", "h", "j", "k"};
//        System.out.println("   1   2   3   4   5   6   7   8   9   10 ");
//        System.out.println(" _________________________________________");
//        for (int j = 0; j < 10; j++) {
//        System.out.printf(abc[j]+"|");
//        for (int i = 0; i < 10; i++) {
//        System.out.printf(tomb[j][i]+ "|");}
//        System.out.println("");
//        System.out.println(" _________________________________________");         
//        }
//          
//        
    
//       int veletlen=(int)(Math.random()*1000)+1; //(Math.random()*(felső-alsó+1))+alsó 
//System.out.println("Tippelj egy számra 1 és 1000 között");
//int tipp=sc.nextInt();
//int db=0;
//while(tipp!=veletlen)
//{
//if(tipp<veletlen)
//{
//    System.out.println("Nagyobb számra gondoltam.");
//}
//else if(tipp>veletlen)
//{
//    System.out.println("Nagyobb számra gondoltam.");
//}
// 
//        System.out.println("Add meg az új tippet");
//        tipp=sc.nextInt();   
//         db++;       
//    
//}
//
//
//System.out.println("Eltaláltad ");
//
////hatvanyozas
//        
//        int alap;
//        int kitevo;
//        int hatvany=1;
//        
//        
//        System.out.println("Add meg a hatvány alapját:");
//        alap=sc.nextInt();
//        System.out.println("Add meg a hatvány kitevőjét:");
//        kitevo=sc.nextInt();
//        
//        for (int i = 0; i <kitevo; i++) {
//            hatvany=hatvany*alap;
//        }
//        System.out.println("A hatvány érték:"+hatvany);
//        
//        
//        int szamlalo=0;
//        hatvany=1;
//        while(szamlalo<kitevo){
//            
//            hatvany=hatvany*alap;
//            szamlalo++;
//        }
//        System.out.println("A hatvány érték: "+hatvany);
//        
//        
//        System.out.println("Give number");
//          int szam=sc.nextInt();
//        while(szam<0)
//        {
//            System.out.println("Rosz adat! Adj meg egy pozitív számot!");
//            szam=sc.nextInt();
//        }
//        
//        System.out.println("Thanks!");
//        
//        
//        do{
//            System.out.println("Give positive number:");
//            szam=sc.nextInt();
//     }while(szam<0);
//          System.out.println("thanks");
//
//        System.out.println("Adj meg egy számot");
//int beolvas=sc.nextInt();
//int megadott=beolvas;
//
//while(megadott%2==0)
//{
//        megadott=megadott/2;
//        db++;
//}
//        System.out.print(beolvas+"=");
// for(int i = 0; i < db; i++)
// {
//     System.out.print("2*");
//  }
//        System.out.print(megadott);
//
//    
//           String s;
//           
//           do
//           {
//               System.out.println("Írd le hogy alma");
//            s=sc.nextLine();
//           }
//            while(!s.equals("alma"));
//          
//            {
//              System.out.println("Az alma gyümölcs");  
//            }
//            
//             //feladat 1
//        System.out.println("adj meg 10 darab számot");
//        int db2=0;
//        int szam3=0;
//        int atlag=0;
//        int elozo=0;
//        for (int i = 0; i < 10; i++) {
//            elozo=szam;
//             szam3=sc.nextInt();
//             szam3=szam3+elozo;
//            db++;
//        }
//        atlag=szam3/db2;
//        System.out.println("A számok átlaga "+atlag);
//        
//        //feladat 2
//       
//      
//        
//        System.out.println("adj egy számot ami nagyobb mint 10");
//        int szam2;
//        szam2=sc.nextInt();
//        while(szam2<=10){
//        System.out.println("adj meg 10-nél nagyobb számot ");
//        szam2=sc.nextInt();
//        }
//        if(szam2%2==0)
//        {
//            System.out.printf("A %d páros",szam2);
//        }
//        else
//        {
//            System.out.printf("A %d páratlan",szam2);
//        }

//      int szam=sc.nextInt();
////        int faktorialis=1;
//        System.out.println("Adj meg egy számot");
//        if(szam==0)
//        {
//            System.out.printf("%d faktoriálisának értéke: %d\n",szam,1);
//        }
//        else
//        {
//        for (int i = 1; i <=szam; i++){
//            faktorialis=faktorialis*i;
//            
//        }
//        System.out.printf("%d faktoriálisának értéke: %d\n",szam,faktorialis);
//        }
        
        
//        for (int i = 0; i <= 10; i++) {
//            System.out.printf("\t%d",i*i);
//        }
//        System.out.println("\n");
//        
//           
//                int i=1;
//                int osszeg=0;
//                while(i!=szam)
//                {
//                    if(i%2==1)
//                    {
//                        osszeg=osszeg+i;
//                    }
//        i++;
//                }
//                
//                System.out.printf("%d-ig a páratlan számok összege: %d\n",szam,osszeg);

//int veletlen=(int)(Math.random()*1000)+1; //(Math.random()*(felső-alsó+1))+alsó 
//System.out.println("Tippelj egy számra 1 és 1000 között");
//int tipp=sc.nextInt();
//int db=0;
//while(tipp!=veletlen)
//{
//if(tipp<veletlen)
//{
//    System.out.println("Nagyobb számra gondoltam.");
//}
//else if(tipp>veletlen)
//{
//    System.out.println("Nagyobb számra gondoltam.");
//}
// 
//        System.out.println("Add meg az új tippet");
//        tipp=sc.nextInt();   
//         db++;       
//    
//}
//
//
//System.out.println("Eltaláltad ");


  //1. feladat
//           System.out.println("Give number");
//        int szam;
//    int szam2=0;
//    szam=sc.nextInt();
//    while(szam!=szam2)
//    {   
//        System.out.println("Give number again");
//        szam2=szam;
//        szam=sc.nextInt();
//         
//    }
//        System.out.println("thanks");

        
            
//        int szam=0;
//        for (int i = 0; i < 100; i++) {
//            szam++;
//            if(szam%7==0)
//            {
//                System.out.println(szam);
//            }
//        }
}
}
        
        
        














































