package ciklus;
import java.util.Scanner;
public class NewMain {
public static void main(String[] args) {
    
      Scanner sc=new Scanner(System.in);
        
      //253
      
//      double a;
//      double r;
//      double h;
//      
//      System.out.println("r értéke");
//      r =sc.nextInt();
//      System.out.println("h értéke");
//      h =sc.nextInt();
//      
//      a=((Math.PI)*r*r)+((Math.PI)*r)*Math.sqrt(r*r+h*h);
//      
//      System.out.println("felszín ="+a);
      
      
//       System.out.println("a értéke");
//        int a=sc.nextInt();
//        while(a==0)
//        {
//            System.out.println("nem lehet 0");
//             a=sc.nextInt();    
//        }
//        System.out.println("b értéke");
//        int b=sc.nextInt();
//        System.out.println("c értéke");
//        int c=sc.nextInt();
//        
//        double reszosszegb2=b*b;
//        double reszosszegb=b*-1;
//        double reszosszegac=a*c*-4;
//        double reszosszeg1=reszosszegb2+reszosszegac;
//        double reszosszegsqrt=Math.sqrt(reszosszeg1);
//        double xone=(reszosszegb+reszosszegsqrt)/(a*2);
//        double xtwo=(reszosszegb-reszosszegsqrt)/(a*2);
//        
//
//        System.out.println("x1 értéke="+xone+"\nx2 értéke="+xtwo);
      
      
        //254
       
//        double a=15;
//        double b=21;
//        double c=13;
//        double d=27;
//        double e=33;
//        double q;
//        
//        q=Math.sqrt(a*a+b*b+c*c+d*d+e*e/5);
//        
//        System.out.printf("A q értéke %f\n",q);
        
//        //329
        
//        double v;
//        double a;
//        double r;
//        
//        r=sc.nextInt();
//                
//        v=(4*Math.pow(r,3)*(Math.PI))/3;
//        System.out.println("A térgogat"+v);
//        a=4*Math.pow(r,2);
//        System.out.println("A felszín"+a);
        
//        //303
        
//        double t;
//        double r;
//        double cost;
//        r =sc.nextInt();
//        
//        t=r*r*(Math.PI);
//        
//        cost=t*2500;
//        System.out.println(cost+"FT-ba kerül");
        
        
        //egész szám abszolútértéke
System.out.printf("%d\n",Math.abs(-14));
     
     double szam=-1.25;
     System.out.printf("%.3f\n",Math.abs(szam));
     
     double a=Math.pow(5,2);
     System.out.printf("%.0f\n",a);
     
     double b=Math.sqrt(81);
     System.out.printf("%.0f\n",b);
     
     System.out.println(Math.PI);
     
     System.out.println(Math.max(10, -2));
     
     System.out.println(Math.round(1.52));
     
     System.out.println(Math.ceil(1.8));
     
     System.out.println(Math.floor(1.8));
     
     double rad=86.5;
     System.out.println(Math.toDegrees(rad));
     
     double fok=180;
     System.out.println(Math.toDegrees(fok));
        
     
     System.out.println("Adj 3 négyzetszámot");
     
 
    
        
        int[] szamok={5,2,8,2,9,1,0,7,4,9};
        
        //elso es utolso elem csereje
        int csere=szamok[szamok.length-1];
        szamok[szamok.length-1]=szamok[0];
        szamok[0]=csere;
        System.out.println(szamok);
        for (int i = 0; i < szamok.length; i++) {
            System.out.println(szamok[i]+" ");
         
            //legnagyobb elem keresese a tombben
            int max=szamok[0];
            int max_index=0;
            for (   int k = 0; k < szamok.length; k++) {
                if(szamok[k]>max)
                {
                    max=szamok[k];
                max_index=k;
            }
    }
        System.out.printf("\nA legynagyobb elem: "+max);
        System.out.println("A legnagyobb elem indexe: "+max_index);
        
        //legnagyobb elem keresese a tombben
            int min=szamok[0];
            int min_index=0;
            for (int l = 0; l < szamok.length; l++) {
                if(szamok[l]<min)
                {
                    min=szamok[l];
                min_index=l;
            }
    }
        System.out.printf("\nA legynagyobb elem: "+min);
        System.out.println("A legnagyobb elem indexe: "+min_index);
        
        
        
    }
    
}
}
        
     


