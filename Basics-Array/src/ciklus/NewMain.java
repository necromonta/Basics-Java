package ciklus;
import java.util.Scanner;
public class NewMain {
public static void main(String[] args) {
    
      Scanner sc=new Scanner(System.in);
        
        

        int [][]tomb3={{1,2,0},{3,4,5}}; 
        
        //2x3s tömb feltöltése manuálisan
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Add meg az %d. sor %d. elemet!",i,j);
                tomb3[i][j]=sc.nextInt();
            }
    }
        
        //2x3-es tömb kiiratása
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(tomb3[i][j]+" ");
            }
            System.out.println("");
    }
        
        
        
    
    




        
        int[] tomb=new int[10]; //egésztípusű 10db elemű tömb
        int[] tomb2={2,4,6,8,10,12,14,16,18,20}; // 10 elemű tömb megadása felsorolással    
        
        System.out.println(tomb2[4]);    //4. elem
        System.out.println(tomb.length); //elemek száma
        
        
        tomb[0]=3;
        for (int i = 1; i < tomb.length; i++) {
            tomb[i]=7;
    }
        for (int i = 0; i < tomb.length; i++) {
            System.out.printf("%d",tomb[i]);        //tomb kiiratása
    }
        System.out.println(tomb2[tomb2.length-1]);//utolsó elem
        System.out.println(tomb2[9]); // utolsó elem ha 10 elemű a tömb
        
        
        String[] szinek={"fehér","fekete","kék","zöld","sérga"};
        System.out.println(szinek[szinek.length-1]);
        
        for (int i = 0; i < szinek.length; i++) {
        if(i%2==0)
        {
            System.out.println(szinek[i]); 
        }
    }
        
        
        for (int i = 0; i < tomb2.length; i++) {
        if(tomb[i]%3==0)
        {
            System.out.println(tomb2[i]);
        }
    }
        
    

    int[] tomb4={-2,2,3,4,5,5};
    
        //feladat 1
        
        for (int i = 0; i < tomb.length-1; i++) {
            if (tomb[i]+(tomb[i+1])==0) 
            {
                tomb[i]=0;
                tomb[i+1]=0;
            }
    }
        for (int i = 0; i < tomb.length; i++) {
           System.out.printf("%d\n",tomb[i]);
        }

     //feladat 2 
        
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i]<(tomb[i]+1)) {
                System.out.println(tomb[i]+" jobbra lévő szám nagyobb");
            }
    }

    //feladat 3
    
       for (int i = 0; i < tomb.length; i++) {
               tomb[i]=Math.abs(tomb[i]);      
    }     
        for (int i = 0; i < tomb.length; i++) {
        System.out.printf("%d\n",tomb[i]);
}

 //feladat 4

for (int i = 0; i < tomb.length-1; i++) {
    if (tomb[i]==(tomb[i+1]))
    {
        System.out.println("Van két azonos szám");
    }
}    
        
        int[] szamok=new int[10];
        
     
        for (int i = 0; i < szamok.length; i++) {
            System.out.printf("Add meg a tömb %d. elemét.",i);
            szamok[i]=sc.nextInt();
    }
        
        for (int i = 0; i < szamok.length; i++) {
            System.out.println(szamok[i]+" ");
            szamok[i]=sc.nextInt();
    }
        
        double osszeg=0;
        
        for (int i = 0; i < szamok.length; i++) {
        osszeg=osszeg+szamok[i];
    }
        double atlag=(double)osszeg/szamok.length;
        System.out.printf("A tömb elemeinek átlaga %f",atlag);
        
        for (int i = szamok.length-1; i >=0; i--) {
            System.out.println(szamok[i]+"");
    }
        
        int keresett=sc.nextInt();
        int db=0;
        for (int i = 0; i < tomb2.length; i++) {
            
        if(tomb2[i]==keresett)
        {
            db++;
        }
        }
            System.out.printf("A keresett szám %d-szer/szor fordul elő",db);


      
      //feladat 1
        int []tomb6={1,2,3,4,5};
        int db2=0;
        for (int i = 0; i < tomb.length; i++) {
        if(tomb[i]%2!=0)
        {
            db++;
        }     
    }
      System.out.println(db+" páratlan szám van");  
        
      //  feladat 2
     int összeg=0;   
  
     for (int i = 0; i < tomb.length; i++) {
        if(tomb[i]%2==0)
        {
            összeg=összeg+tomb[i];
        }
    }
    System.out.println(összeg+" az összegük");
        
       // feladat3
        
     int sorszam=0;   
     for (int i = 0; i < tomb.length; i++) {
         sorszam++;
        if(tomb[i]%2==0)
        { 
            System.out.println(sorszam+". a/az "+tomb[i]);
        }
    }
   
       //Feladat4
        System.out.println("Írd ki a a keresett számot");
        int sorszam2=0;
        int szam=sc.nextInt();
        
        for (int i = 0; i < tomb.length; i++) {
        sorszam2++;
        
        if(tomb[i]!=szam)
        {
            
            System.out.println("A beolvasott szám nincs a tömb ezen sorszámán:"+sorszam);
            
        }
        
        else
        {
            
            System.out.println(sorszam+". a/az "+tomb[i]);   
        }
    
        //feladat5
        
            int db3=0;
        int szam9=sc.nextInt();
        for (int v = 0; v < tomb.length; v++) {
        
        if(tomb[v]==szam)
        {
            db3++;
        }
        }
            System.out.println(db3+"-szor van meg a szám");
     

    }

    
        
        int [] tomb9={2,4,6,8,10,12,14,16,18,20};
        int ketszamatlag=(tomb9[0]+tomb9[tomb9.length-1])/2; //a
        System.out.println(ketszamatlag);
        
        int otdarabszam=0;                    //b
        for (int i = 0; i < tomb9.length; i++) {
        if(i%5==0)
        {
            otdarabszam++;
        }
            }
        System.out.println(otdarabszam+"darab 5-el osztható van");
        

          int osszeg1=0;                         //c
          int osszeg2=0;
       for (int i = 0; i < 5; i++) {
        
           osszeg1=osszeg1+tomb[i];
           osszeg2=osszeg2+tomb[5+i]; 
        }
       if(osszeg1>osszeg2)
       {
           System.out.println(osszeg1+"a nagyobb összeg");
       }
       else if(osszeg1<osszeg2)
       {
           System.out.println(osszeg2+"a nagyobb összeg");
       }
        else
       {
           System.out.println("Egyenlő");
       }


        
                  
    int db4=0;                                       
    for (int i = 0; i < tomb.length; i++) {
        db2++;
    if(tomb[i]==4)
         {
            break;
         }
             }
    System.out.println(db2+" nél van a 4");
    
    
  

    

      Scanner sc1=new Scanner(System.in);  
        
      //feladat 1
     System.out.println("Hány nevet szeretnél tárolni?");   
       int n=Integer.parseInt(sc.nextLine());
       String[] nevek=new String[n];
       for (int i = 0; i < n; i++) {
           System.out.println("Add meg a következő nevet!");
           nevek[i]=sc1.nextLine();
    }
        for (int i = 0; i < 10; i++) {
            System.out.printf(nevek[i]+"   ");
//            System.out.printf("%s   ",nevek[i]);
    }
        //feladat 2
        int[] szamok2=new int[n];
       for (int i = 0; i < n; i++) {
           System.out.println("Add meg a következő számot!");
           szamok2[i]=sc.nextInt();
       }
           for (int i = 0; i < n; i++) {
           if (szamok2[i]>0) {
               System.out.println(szamok2[i]+" ");
           }
           }
        
        //feladat 3
        
        System.out.println("Add meg a sorok számát!");
        int sor=Integer.parseInt(sc.nextLine());
        System.out.println("Add meg az oszlopok s számt");
        int oszlop=Integer.parseInt(sc.nextLine());
        String[][] tanulok=new String[sor][oszlop];
        for (int i = 0; i < sor; i++) {
            for (int j = 0; j < oszlop; j++) {
                System.out.println("Add meg a következő tanuló nevét");
                tanulok[i][j]=sc.nextLine();
            }
    }
        System.out.println("Hanyadik sor?");
        sor=Integer.parseInt(sc.nextLine());
        System.out.println("Hányadik oszlop");
        oszlop=Integer.parseInt(sc.nextLine());
        System.out.println(tanulok[sor][oszlop]);
        

        }
}

