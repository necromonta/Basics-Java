/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

import java.util.Scanner;

/**
 *
 * @author anagy
 */
public class formazas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //1.feladat
        
        System.out.printf("1\tprocesszor\t3\t25000\n"); 
        System.out.printf("2\tmerevlemez\t5\t32000\n");
        System.out.printf("3\tmonitor\t\t4\t37000\n");
        System.out.printf("4\tpendrive\t3\t11000\n");

//2.feladat

        System.out.printf("1\tNagy József\t3\n"); 
        System.out.printf("2\tPéti Ferenc\t2\n");
        System.out.printf("3\tLápos Géza\t5\n");
        System.out.printf("4\tGender Lajos\t1\n");

        
        //3.feladat
        
        System.out.printf("\"Tér Erzsébet\"\t\"Miskolc\"\n"); 
        System.out.printf("\"Nagy József\"\t\"Szolnok\"\n"); 
        System.out.printf("\"Tél Gábor\"\t\"Miskolc\"\n"); 
        System.out.printf("\"Rongy Elek\"\t\"Szeged\"\n"); 
        System.out.printf("\"Fer Tamás\"\t\"Miskolc\"\n");
        
        //4.feladat
        
        
        System.out.printf("1\tFekete Gábor\tSzeged\n");
        System.out.printf("2\tPéti Feren\tSzolnok\n");
        System.out.printf("3\tLápos Géza\tDebrecen\n");
        System.out.printf("4\tGender Lajos\tSzeged\n");
        System.out.printf("5\tGeszti Árpád\tSzolnok\n");
        System.out.printf("6\tLantos Zoltán\tMiskolc\n");
        System.out.printf("7\tFehér Irén\tDebrecen\n");
        System.out.printf("8\tProg Lajos\tSzolnok\n");

        //.5feladat
        
        double a=15.82;
        double b=18.27;
        double c=22.40;
        double d=23.19;
        double e=24.57;
        double f=22.02;
        double g=20.28;
        int bruh=10;
       System.out.printf("%.1f\n%.1f\n%.1f\n%.1f\n%.1f\n%.1f\n%.1f\n",a,b,c,d,e,f,g);
        

       //6.feladat
        
       System.out.printf("\t%+15.1f\thétfő\n",a);
       System.out.printf("\t%+15.1f\tkedd\n",b);
       System.out.printf("\t%+15.1f\tszerda\n",c);
       System.out.printf("\t%+15.1f\tcsütörtök\n",d);
       System.out.printf("\t%+15.1f\tpéntek\n",e);
       System.out.printf("\t%+15.1f\tszombat\n",f);
       System.out.printf("\t%+15.1f\tvasárnap\n",g);
       System.out.printf("%10d\n",bruh);  //10 karakter széles 
       
//       System.out.println("első sor\nmásodik sor");
//        System.out.println("\telső sor\tmásodik sor");
//        System.out.println("ez egy\"\n\talma\"");
//        char sortores='\n';
//        char kukac;
//        System.out.println("\u00a9");
//        int h=10;
//        int m=5321;
//        System.out.println("A változó értéke: "+a+" a b változó értéke: "+b);
//        System.out.printf("A változó értéke: %2$d a b változó értéke: %1$d\n",a,b);

//        System.out.printf("%10d\n",b);
//        
//        double j=2.2465656;
//        System.out.printf("%+.2f\n", c);
//        double k=-2.2465656;
//        System.out.printf("%+10.2f\n", d);
//
//        System.out.printf("%tT,%tY,%tM.%tD\n",java.util.Calendar.getInstance(),java.util.Calendar.getInstance(),java.util.Calendar.getInstance(),java.util.Calendar.getInstance());
//    
//    Scanner sc=new Scanner(System.in);
//    int szam=sc.nextInt();
//    int kiir=szam;
//    int db=0;
//    while(szam>=5)
//    {
//        szam=szam-5;
//        db++;
//    }
//    if(szam==0)
//    {
////       System.out.printf("",kiir,db,");
//    }
//    else
//    {
//    System.out.printf("%d=%d*5+%d",kiir,db,szam);
//    }
//    
//    szam=sc.nextInt();
//    int osszeg=0;
//    for (int i = 1; i <=szam; i++)
//    if(szam%i==0)
//    {
//        osszeg++;
//    }
//    {
//        System.out.printf("A %d oszóinak összege: %d",szam,osszeg);
//    }
//    }
    

}
}
//package ciklus;
//import java.util.Scanner;
//public class NewMain {
//public static void main(String[] args) {
//    
//      Scanner sc=new Scanner(System.in);
//        
//        
//        
//        
//        
//        
//        
//System.out.println(ANSI_GREEN_BACKGROUND + "This text has a green background but default text!" + ANSI_RESET);
//System.out.println(ANSI_RED + "This text has red text but a default background!" + ANSI_RESET);
//System.out.println(ANSI_GREEN_BACKGROUND + ANSI_RED + "This text has a green background and red text!" + ANSI_RESET);
//        
//        
//        
//    }
//public static final String ANSI_RESET = "\u001B[0m";
//public static final String ANSI_BLACK = "\u001B[30m";
//public static final String ANSI_RED = "\u001B[31m";
//public static final String ANSI_GREEN = "\u001B[32m";
//public static final String ANSI_YELLOW = "\u001B[33m";
//public static final String ANSI_BLUE = "\u001B[34m";
//public static final String ANSI_PURPLE = "\u001B[35m";
//public static final String ANSI_CYAN = "\u001B[36m";
//public static final String ANSI_WHITE = "\u001B[37m";
//public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
//public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
//public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
//public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
//public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
//public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
//public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
//public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
//
//// Reset
//    public static final String RESET = "\033[0m";  // Text Reset
//
//    // Regular Colors
//    public static final String BLACK = "\033[0;30m";   // BLACK
//    public static final String RED = "\033[0;31m";     // RED
//    public static final String GREEN = "\033[0;32m";   // GREEN
//    public static final String YELLOW = "\033[0;33m";  // YELLOW
//    public static final String BLUE = "\033[0;34m";    // BLUE
//    public static final String PURPLE = "\033[0;35m";  // PURPLE
//    public static final String CYAN = "\033[0;36m";    // CYAN
//    public static final String WHITE = "\033[0;37m";   // WHITE
//
//    // Bold
//    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
//    public static final String RED_BOLD = "\033[1;31m";    // RED
//    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
//    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
//    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
//    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
//    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
//    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE
//
//    // Underline
//    public static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
//    public static final String RED_UNDERLINED = "\033[4;31m";    // RED
//    public static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
//    public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
//    public static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
//    public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
//    public static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
//    public static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE
//
//    // Background
//    public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
//    public static final String RED_BACKGROUND = "\033[41m";    // RED
//    public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
//    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
//    public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
//    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
//    public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
//    public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE
//
//    // High Intensity
//    public static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
//    public static final String RED_BRIGHT = "\033[0;91m";    // RED
//    public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
//    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
//    public static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
//    public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
//    public static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
//    public static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE
//
//    // Bold High Intensity
//    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
//    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
//    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
//    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
//    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
//    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
//    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
//    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE
//
//    // High Intensity backgrounds
//    public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
//    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
//    public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
//    public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
//    public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
//    public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
//    public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  // CYAN
//   
//}