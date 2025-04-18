package book;
import java.util.Scanner;
public class Book {
public static void main(String[] args) {
        
Scanner sc=new Scanner(System.in);

//1.feladat
//Szerkezhető-e a 3szög
     System.out.println("Adja meg a háromszög 3 oldalát!");
        int g=sc.nextInt();
        int h=sc.nextInt();
        int j=sc.nextInt();
        int side1= g+h;
        int side2= g+j;
        int side3= j+h;
        if(side1>j&&side2>h&&side3>g)
        {
            System.out.println("Szerkezhető");
        }
        
        else
        {
            System.out.println("Nem szerkezhető");
        }
        
//2.feladat
//Kiadja a nagyobb számot
System.out.println("Adjon meg két egész számot!");
     int a=sc.nextInt();
     int b=sc.nextInt();
     if(a>b)
     {
         System.out.println(a+" a nagyobb szám");
     }
     else if(b>a)
     {
         System.out.println(b+" a nagyobb szám");
     }
     else
     {
            System.out.println("Egyenlőek");
     }
     
     //3.feladat
     //Kiadja a legkisebb számot
        System.out.println("Adjon meg 3 egész számot!");
     int d=sc.nextInt();
     int e=sc.nextInt();
     int f=sc.nextInt();
     if(d<e&&a<f)
     {
         System.out.println(d+" a legkisebb");
     }
     else if(e<d&&e<f)
     {
         System.out.println(e+" a legkisebb");
     }
     else if(d<e&&a<f)
     {
         System.out.println(f+" a legkisebb");
     }
     else
     {
         System.out.println("Egyenlőek");
     }
     
     //4.feladat
     //Kiadja hogy osztható-e 9-el 3-al vagy és 4-el
        System.out.println("Adj meg egy egész számot");
     int szam=sc.nextInt();
     if(szam%9==0)
     {
         System.out.print("Osztható 9-cel,");
     }
     if(szam%3==0)
     {
         System.out.print("osztható 3-cel,");
     }
     if(szam%4==0)
     {
         System.out.print("osztható 4-el"); 
     }
        System.out.println("");
        
        
        
        //4.feladat
        //BMI rangel
        System.out.println("Add meg a testsúlyodat:");
        int kg=sc.nextInt();
        System.out.println("Add meg a magasságodat méterben:");
        double m=sc.nextDouble();
        double tti= kg/(m*m);
        if(tti<18.5)
        {
            System.out.println("Ön sovány");
        }
        else if(tti<25)
        {
            System.out.println("Ön normál testalkatú");
        }
        else 
        {
            System.out.println("Ön túlsúlyos");
        }
        
        //5.feladat
        //Kiadja a víz állapotát
        System.out.println("Adja meg a víz hőmérsékletét");
        int num=sc.nextInt();
        if(num<1)
        {
            System.out.println("A víz halmazállapota jég");
        }
        else if(num<100)
        {
            System.out.println("A víz halmazállapota folyékony");
        }
        else
        {
            System.out.println("A víz halmazállapota gőz");
        }
        
        //6.feladat
        //Kiadja hogy hányas lett a doga
        System.out.println("Adja meg az elért pontszámát");
        int pont=sc.nextInt();
        if(pont<0)
        {
            System.out.println("Hibás az adat");
        }
        else if(pont<50)
        {
            System.out.println("A dolgozata egyes");
        }
        else if(pont<65)
        {
            System.out.println("A dolgozata kettes");
        }
        else if(pont<80)
        {
            System.out.println("A dolgozata hármas");
        }
        else if(pont<90)
        {
            System.out.println("A dolgozata négyes");
        }
        else if(pont<101)
        {
            System.out.println("A dolgozata ötös");
        }
        else
            {
            System.out.println("Hibás adat");
        }
        
        //7.Feladat
        //Kiadja hogy milyen season van
        System.out.println("Adja meg az egyik hónap sorszámát");
      int szam2=sc.nextInt();
      
      if(szam<=2)
      {
          System.out.println("Téli hónap");
      }
      else if (szam2<=5)
      {
          System.out.println("Tavaszi hónap");
      }
      else if (szam2<=8)
      {
          System.out.println("Nyári hónap");
      }
      else if (szam2<=11)
      {
        System.out.println("Őszi hónap");
    }
      
      else if (szam2>=13)
      {
          System.out.println("Csak 12 hónap van");
      }
      else
      {
          System.out.println("Téli hónap");
      }
      
      
      //8.Feladat
      System.out.println("Adjon meg egy egész számot (1...12):");
        int szam3=sc.nextInt();
        
        switch(szam3)
        {
            case 1:System.out.println("Január");
            break;
            case 2:System.out.println("Február");
            break;
            case 3:System.out.println("Március");
            break;
            case 4:System.out.println("Április");
            break;
            case 5:System.out.println("Május");
            break;
            case 6:System.out.println("Június");
            break;
            case 7:System.out.println("Július");
            break;
            case 8:System.out.println("Agusztus");
            break;
            case 9:System.out.println("Szeptember");
            break;
            case 10:System.out.println("Oktőber");
            break;
            case 11:System.out.println("November");
            break;
            default:System.out.println("December");
            break;
        }
        
        
        //9.Feladat
        //Megadja hogy hétköznap van-e vagy hétvége
        System.out.println("Add meg a nap sorszámát:");
        int nap=sc.nextInt();
                 switch(nap)
                {
                     case 1 :case 2:case 3:case 4: case 5:System.out.println("Hétköznap");
                     break;
                     case 6: case7:System.out.println("Hétvége");
                    break;
                     default:System.out.println("Rosz érték");
                     break;
                }

                 
        //10.Feladat
        //Random szam oszthato-e 3mal
                 int random_szam= (int)(Math.random()*100);
                 System.out.println(random_szam);
                 if(random_szam%3==0)
                 {
                     System.out.println("Osztható 3-mal");  
                 }
                 else 
                 {
                     System.out.println("Nem osztható 3-mal");
                 }
                 switch(random_szam%3)
                 {
                     case 0: System.out.println("Osztható 3-mal"); break;
                     default: System.out.println(" Nem osztható 3-mal"); break;
                 }
    }
}
        
     
     
