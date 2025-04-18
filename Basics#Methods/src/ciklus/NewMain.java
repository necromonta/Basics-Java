package ciklus;
import java.util.Scanner;
public class NewMain {
public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
    System.out.println(osszead(2,3)); //aktuális paraméter
    System.out.println("Add meg a két számot!");
    int a=Integer.parseInt(sc.nextLine());
    int b=Integer.parseInt(sc.nextLine());
    System.out.println("Két szám összege:"+osszead(a,b));
    
    osszead2(a,b);
    
    int x=osszead(a,b);
    int asd=5;
    osszead3(asd);
    System.out.println("asd :"+asd);
    
//    int y=osszead2(a,b);  nope
     
    int[] szamok={2,4,6,4,7,0};
    kiir(szamok);
    
    
    int csere=szamok[0];
    szamok [0]=szamok[szamok.length-1];
    szamok[szamok.length-1]=csere;
    
    
    }
    //Sum of 2 numbers
    static int osszead(int szam1, int szam2) //függvény,szam1 ls szam2 formális paraméterek
    {
        int osszeg=szam1+szam2;
       
        return osszeg;
    }
    
    static void osszead3(int szam1) //függvény,szam1 ls szam2 formális paraméterek
    {
        szam1=10;
       
    }
    
    //Sum of 2 numbers
    static void osszead2(int szam1, int szam2)
    {
      
      int osszeg=szam1+szam2;
      System.out.println("Két szám összege:"+osszeg);
    }
    
    //Displays the block
    static void kiir(int[] tomb)
    {
        for (int i = 0; i < tomb.length; i++) {
            System.out.printf(tomb[i]+" ");
        }
        System.out.println("");
    }
}
    
//    static void csere(int a,int b)
//    { 
//       int csere=a;
//       a=b;
//       b=csere;
//    }

//    
//      Scanner sc=new Scanner(System.in);
//      
//              String str=new String("elbizonytalaníthatatlanság");
//        int hossz=str.length();
//        int o=str.lastIndexOf('o');
//        
//        System.out.println("A sztring hossza:"+hossz);
//        System.out.println("Az o helye:"+o);
//        
//        int ol=str.lastIndexOf("c"); // a keresett változó honnak kezdődik
//        System.out.println("Az ol itt kezdodik:"+ol);
//        
//        String resz=str.substring(0,3);      //mettől (beleértve) meddig (nem beleértve)
//        System.out.println("A sztring resze:"+resz);
//        
//        System.out.println("A sztring 4. indexu karaktere:"+str.charAt(4));
//        
//        String datum="2021-03-04";
//        String[] darabok=datum.split("-");
//        int evszam=Integer.parseInt(darabok[0]);
//        int honap=Integer.parseInt(darabok[1]);
//        int nap=Integer.parseInt(darabok[2]);
//        System.out.printf("Ma %d. ev %d. honap %d. napja van",evszam,honap,nap);
//       //feladat2
//       char betu=';';
//       System.out.printf("\n Az adott karakter szamjegy-e?"+szamjegy_e(betu)); 
//       System.out.println(ket_karakter(str,1,3));
//     //3.feladat
//     tobbszor_kiir(str,5);
//     
//     //4.feladat
//     System.out.println("Az utolso 5 karakter:"+utolso_ot(str));
//     System.out.println(utolso_ot2(str));
//     
//     //5.feladat
//     System.out.println("Minden második karakter nagybetűsen: "+minden_masodik(str));
//     
//     //6.feladat
////     System.out.println("Nő vagy férfi vagy?");
////     String nem=sc.nextLine();
////     System.out.println("Életkorod?:");
////     int kor=Integer.parseInt(sc.nextLine());
////     System.out.println("Magasságod?:");
////     int cm=Integer.parseInt(sc.nextLine());
////     double suly=ideal(cm,kor,nem);
////     if (suly==0) {
////        System.out.println("A vart karaktersor \"no\" vagy \"ferfi\"."); 
////    }
////     else{
////         System.out.println("Az idealis testsulyod: "+suly);
////     }
//     
//     //7.feladat
//     int[] tomb={-50,-25,-12,-100,-50};
//     System.out.println("A legkisebb ertek:"+max_min(tomb)[0]);
//     System.out.println("A legkisebb ertek:"+max_min(tomb)[1]);
//    
//     //8.feladat
//     
//     int[] tomb1=(intervallum(10,10,100));
//     for (int i = 0; i < tomb1.length; i++) {
//         System.out.print(tomb1[i]+" ");
//    }
//}
//public static int[] intervallum(int db,int also, int felso)
//        {
//           int[] tomb=new int[db];
//            for (int i = 0; i < db; i++) {
//                tomb[i]=(int)(Math.random()*(felso-also+1))+also;
//            }
//            return tomb;
//        }
//public static int[] max_min(int[] tomb)
//        {
//            int min=tomb[0];
//            int max=tomb[0];
//            for (int i = 0; i < tomb.length; i++) {
//                if (min>tomb[i]) {
//                    min=tomb[i];
//                }
//                else if(max<tomb[i])
//                {
//                    max=tomb[i];
//                }
//  
//            }
//            int[] eredmeny={min, max};
//            return eredmeny;
//        }
//public static double ideal(double cm,double kor,String nem)
//{
//    double suly=0;
//     if (nem.equals("no")) {
//    suly=(50+0.75*(cm-150)+(kor-20)/4)*0.9;
//    
//    return suly;
//     }
//     else if (nem.equals("ferfi")) {
//        suly=50+0.75*(cm-150)+(kor-20)/4;
//        return suly;
//     }
//        else
//        {
//            
//                }
//     return suly;
//    }
//
//
//public static double no(double cm,double kor)
//{
//    double ideal;
//    ideal=(50+0.75*(cm-150)+(kor-20)/4)*0.9;
//    return ideal;
//}
//
//public static boolean szamjegy_e(char b)
//{
//    if (b>='0' && b<='9') {
//        return true;
//    }
//    else
//    {
//        return false;
//    }
//}
//    
//     public static String ket_karakter(String s,int a,int b)
//     {
//         String eredmeny=String.valueOf(s.charAt(a))+String.valueOf(s.charAt(b));
//         return eredmeny;
//     }
//
//     public static void tobbszor_kiir(String s,int db)
//     {
//         for (int i = 0; i < db; i++) {
//             System.out.println((i+1)+"."+s+" ");
//         }
//         System.out.println("\n");
//     }
//
//     public static String utolso_ot(String s)
//     {
//         String utolso="";
//         if (s.length()>5) {
//             
//         
//         for (int i = s.length()-5; i < s.length(); i++) {
//             utolso=utolso+String.valueOf(s.charAt(i));
//         }
//         }
//         else
//         {
//             System.out.println("Legalabb 5 karakterbol alljon");
//         }
//     
//return utolso;
//     }
//
//     public static String utolso_ot2(String s)
//     {
//         if(s.length()>5)
//         {
//         return s.substring(s.length()-5);
//         }
//         else
//         {
//             return "Legyen 5 karakternel hosszabb";
//         }
//     }
//     public static String minden_masodik(String s)
//     {
//         String parosok="";
//         for (int i = 1; i < s.length(); i=i+2 ) {//1+=2
//             parosok=parosok+String.valueOf(s.charAt(i));
//         }
//         parosok=parosok.toUpperCase();
//         return parosok;
//     }
//}
//    package ciklus;
//import java.util.Scanner;
//public class NewMain {
//public static void main(String[] args) {
//    
//      Scanner sc=new Scanner(System.in);
//        
//        
//        //Feladat 1
//        
//         System.out.println("Kisebb szám");
//        int szam1=sc.nextInt();
//        System.out.println("Nagyobb szám");
//        int szam2=sc.nextInt();
//        feladat1(szam1,szam2);
//        System.out.println("");
//        
//        //Feladat 2
//        double tomb[]=new double[2];
//        System.out.println("A");
//        double a=sc.nextInt();
//        System.out.println("B");
//        double b=sc.nextInt();
//        System.out.println("C");
//        double c=sc.nextInt();
//       tomb=feladat2(a,b,c);
//       System.out.println(tomb[0]+"x1 "+tomb[1]+"x2");
//       
//       //Feladat 3
//       int perc=sc.nextInt();
//       feladat3(perc);
//      
//}   
//
//
//         static void feladat1(int szam1, int szam2)
//    {
//      int rng=(int)( Math.random()*(szam2-szam1+1))+szam1;
//        for (int i = 0; i < rng; i++) { 
//            System.out.print("*");
//        }
//    }
//        
//        static double[] feladat2(double a, double b, double c)
//        {
//            double tomb[]=new double[2];
//            double result1;
//            double result2;
//        result1=(Math.sqrt((b*b)*(a*c*-4))+b*-1)/2*a;
//        result2=(Math.sqrt((b*b)*(a*c*-4))-b*-1)/2*a;
//           
//        tomb[0]=result1;
//        tomb[1]=result2;
//            
//        return  tomb;
//              
//        }
//          
//    static void feladat3(int perc)
//    {
//        if (perc>720) {
//            System.out.println("Déleután");
//        }
//        else if(perc<720)
//        {
//            System.out.println("Délelőtt");
//        }
//        else{
//            System.out.println("Dél");
//        }
//    }
//}
    
 
//}
//package ciklus;
//import java.util.Scanner;
//public class NewMain {
//public static void main(String[] args) {
//      Scanner sc=new Scanner(System.in);
//     
//    
//    //feladat1
//    int[] tomb={1,2,3,4,5,6,7,7,8,9}; 
//    int szam1=feladat1(tomb);
//       System.out.println("A tomb elemeinek osszege:"+szam1);
//    
//    //feladat2
//    double[] tomb2={1,2,3,4,5,6,7,7,8,9};  
//    feladat2(tomb3);
//       
//    //feladat3
//    int[] tomb3={1,2,3,4,5,6,7,7,8,9}; 
//     int lksz=feladat3(tomb3);
//     feladat3(tomb3,lksz);
//       System.out.println(lksz);
//}
//   public static int feladat1(int [] tomb) 
//{
//    int a=0;
//    for (int i = 0; i < tomb.length; i++) {
//        a=a+tomb[i];
//    }
//    return a;
//} 
//   
//   public static void feladat2(double [] tomb2)     
//{
//    double a=0;
//    double db=0;
//    double atlag=0;
//    for (int i = 0; i < tomb2.length; i++) {
//        db++;
//        a=a+tomb2[i];
//    }
//    atlag=(double)a/db;
//    System.out.println("A tomb elemeinek");
//}
//   
//   public static int feladat3(int [] tomb,int lksz2) 
//{
//    
//    for (int i = 0; i < tomb.length; i++) {
//        if (lksz2>tomb[i]) {
//            lksz2=tomb[i];
//        }
//    }
//    System.out.println(lksz2);
//   return lksz2;  
//}
//   
//   
//   
//   
//   
//   
//   
//   
//}
//package ciklus;
//import java.util.Scanner;
//public class NewMain {
//    
//public static void main(String[] args) {
//      Scanner sc=new Scanner(System.in);
//        
//        int x=4;
//        int y=2;
//        int osszeg=0;
//        
//        
//       osszead(x,y,osszeg); 
//       System.out.println(osszeg);
//       //////////////////////////////////////////////
//       osszeg=osszead2(x,y,osszeg);
//        System.out.println(osszeg);
//       ////////////////////////////////////////////// 
//        double terulet=terulet(x,y); 
//       System.out.println("A téglalap területe:"+terulet);
//       System.out.println("A legnagyobb közös osztó:"+lnko(36,24));
//       //////////////////////////////////////////////    
//       System.out.println("Add meg az egész számot!");
//    int szam =Integer.parseInt(sc.nextLine());
//       hany_oszto(szam);
//
//////////////////////////////////////////////////
//if(prim_e(szam)==true)
//{
//    System.out.println("Az adott szam prim");
//}
//else
//{
//    System.out.println("Az adott szam osszetett");
//}
//////////////////////////////////////////////////
//int[] tomb={4,5,2,9,10,25,2,4,6};
//System.out.println("Adja meg a számot");
//szam=Integer.parseInt(sc.nextLine());
//db(tomb,szam);
//
//    System.out.println("Adja meg a keresendő számot");
//     szam =Integer.parseInt(sc.nextLine());
//    common(tomb,szam);
//
//    
// 
//    }
//
//public static void osszead(int a,int b,int o)     
//{
//    o=a+b;
//    System.out.println(o);
//}
//
//public static int osszead2(int a,int b,int o)
//{
//    o=a+b;
//    return o;
//}
//
//public static double terulet(double a,double b)
//{
//    double t=a*b;
//    return t;
//}
//
//public static int lnko(int a, int b)
//{
//    int lnko=1;
//    if(a<b)
//    {
//        for (int i = 1; i <= a; i++) {
//            if(a%i==0 && b%i==0)
//            {
//                lnko=i;
//            }
//        }
//    }
//    else{
//        for (int i = 1; i <= b; i++) {
//            if(a%i==0 && b%i==0)
//            {
//                lnko=i;
//            }
//        }
//    }
//        
//    return lnko;
//}
//
//public static void hany_oszto(int a)
//{
//    int db=0;
//    for (int i = a; i > 0; i--) {
//        if (a%i==0) {
//           db++;
//        }
//    }
//    System.out.println("A szam osztoinak szama:"+db);
//}
//
//public static boolean prim_e(int a)
//{
//    boolean prim=true;
//    for (int i = 2; i < Math.sqrt(a); i++) {
//        if (a%i==0) 
//        {
//            prim=false;
//            break;
//        }
//    }
//   return prim;
//}
//
//public static void db(int [] t,int a)
//{
//    int db=0;
//    for (int i = 0; i < t.length; i++) {
//        if (t[i]==a) {
//            {
//                db++;
//            }
//        }
//    }
//        System.out.printf("Az adott ertek a tombben %d.szer fordul elő",db);
//
//}
//
//public static boolean common(int [] tomb,int a)
//{
//    boolean flag=false;
//    for (int i = 0; i < tomb.length; i++) {
//        if(a==tomb[i])
//        {
//            flag=true;
//            break;
//        }
//        
//    }
//    return flag;
//}
//
//
//}