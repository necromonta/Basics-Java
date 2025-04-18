package tutorial;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import static tutorial.Tutorial.rng;
import static tutorial.Tutorial.separetors;
import static tutorial.Tutorial.name;
import static tutorial.Tutorial.useless;
import static tutorial.Tutorial.lines;

/**
 *
 * @author anagy
 */
/*
Feladatok: 
                 1.fileBeolvasas+kiiratas
                 1.5 Mennyi pizza van osszesen
                 2. Magyaros adatai + hany db
                 3. Gyros es 3100ft folott adatai, else nem volt
                 4. Bolognai gyors %,atlag money , atlag meret
                 5. legdragabb pizza es 2. legdragabb között a kulonbseg + fajtajuk
                 6. eloszor rendezd novekvo-be ertekeles alapjan, majd valtsd gyors attributumot mindennek az ellenkezojere 
                 7. Magyaros pizzat kicserelni Magyartalan-ra es az arabol levonni 200-t es ezt kiiratni egy fileba aminek legyen mas neve
         
 */
public class Solved {

    
    Solved() throws FileNotFoundException, IOException {
        boolean flood=false;
        if (lines>99) {
            flood=true;
        }
      
        //Feladat 1
        System.out.println("Feladat1: ");
        ArrayList<Pizza> pizzak = new ArrayList<Pizza>();
        pizzak = storesFile();
          MyFrame asd=new MyFrame(pizzak);
         //System.out.println("---------------------------");
        //Feladat 2
//        System.out.println("Feladat2: ");
//        findsMagyaros(pizzak,flood);
//         System.out.println("---------------------------");
//        //Feladat 3
//        System.out.println("Feladat3: ");
//        findsGyros(pizzak,flood);
//         System.out.println("---------------------------");
//        //Feladat 4
//        System.out.println("Feladat4: ");
//        findsAverage(pizzak);
//         System.out.println("---------------------------");
//        //Feladat 5
//        System.out.println("Feladat5: ");
//        findsDifference(pizzak);
//         System.out.println("---------------------------");
//        //Feladat 6
//        System.out.println("Feladat6: ");
//        sortsArrayList(pizzak,flood);
//         System.out.println("---------------------------");
//        //Feladat 7
//        System.out.println("Feladat7: ");
//        writesFile(pizzak);
//         System.out.println("---------------------------");
        
    }
    //1.Feladat
    ArrayList<Pizza> storesFile() throws FileNotFoundException {
        ArrayList<Pizza> pizzak = new ArrayList<Pizza>();
        FileReader fr = new FileReader(name + ".txt");
        Scanner sc = new Scanner(fr);

        if (useless) {
            sc.nextLine();
        }

        while (sc.hasNextLine()) {
            String line[] = sc.nextLine().split(separetors[rng]);
            Pizza temp = new Pizza(line[0], Boolean.valueOf(line[1]), Integer.valueOf(line[2]), Integer.valueOf(line[3]), Double.valueOf(line[4]));
            pizzak.add(temp);
        }

        for (Pizza temp : pizzak) {
            System.out.print(temp);
        }
        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("Feladat 1.5: "+pizzak.size());
        return pizzak;
    }
    //2.Feladat
    void findsMagyaros(ArrayList<Pizza> pizzak,boolean flood) {

        int db = 0;
        for (Pizza temp : pizzak) {
            if (temp.nev.equals("Hawaii")) {
                if (flood) {
                   System.out.print(temp); 
                }else{
                    System.out.println(temp); 
                }
               
                db++;
            }
        }
        System.out.println(db + " Hawaii pizza van");

    }
    //3.Feladat
    void findsGyros(ArrayList<Pizza> pizzak,boolean flood) {
        boolean found = false;
        for (Pizza temp : pizzak) {
            if (temp.nev.equals("Gyros") && temp.koltseg > 3100) {
                found = true;
                
                if (flood) {
                    System.out.print(temp);
                }else{
                    System.out.println(temp);
                }
            }
        }
        if (!found) {
            System.out.println("Nem volt Gyros pizza ami 3100ft folott volt");
        }
    }
    //4.Feladat
    void findsAverage(ArrayList<Pizza> pizzak) {
        double counter = 0;
        int costSum = 0;
        int sizeSum = 0;
        double fastCounter = 0;
        for (Pizza temp : pizzak) {
            if (temp.nev.equals("Bolognai")) {
                if (temp.gyors) {
                    fastCounter++;
                }
                costSum += temp.koltseg;
                sizeSum += temp.meret;
                counter++;
            }
        }

        DecimalFormat df = new DecimalFormat("0.#");
        double temp=(fastCounter / counter) * 100;
        if (counter != 0) {
            System.out.println("Atlag Bolognai pizza Penz:" + (int) (costSum / counter) + "Ft , Meret:" + (int) (sizeSum / counter) + "cm , Gyors:" + df.format(temp)  + "%  " + (int)fastCounter + "/" + (int)counter);
        } else {
            System.out.println("Nem volt Bolgnai pizza");
        }

    }
    //5.Feladat 
    void findsDifference(ArrayList<Pizza> pizzak) {
        Pizza max;
        Pizza max2;
        if (pizzak.get(0).koltseg > pizzak.get(1).koltseg) {
            max = pizzak.get(0);
            max2 = pizzak.get(1);
        } else {
            max = pizzak.get(1);
            max2 = pizzak.get(0);
        }

        for (int i = 2; i < pizzak.size(); i++) {
            if (pizzak.get(i).koltseg > max.koltseg) {
                max = pizzak.get(i);
            } else if (pizzak.get(i).koltseg > max2.koltseg) {
                max2 = pizzak.get(i);
            }
        }

        System.out.println("Legdragabb pizza:" + max.koltseg +"Ft Pizza: "+ max.nev+" ,Masodik legdragabb pizza: " + max2.koltseg + "Ft Pizza: "+ max2.nev);
        System.out.println("Kulonbseguk " + (max.koltseg - max2.koltseg) + "Ft");
    }
    //6.Feladat
    void sortsArrayList(ArrayList<Pizza> pizzak,boolean flood) {
        for (int i = 0; i < pizzak.size(); i++) {
            for (int j = 1; j < pizzak.size() - i; j++) {
                if (pizzak.get(j - 1).ertekeles > pizzak.get(j).ertekeles) {
                    Pizza temp = pizzak.get(j - 1);
                    pizzak.set(j - 1, pizzak.get(j));
                    pizzak.set(j, temp);
                }

            }
        }

        for (Pizza temp : pizzak) {
            temp.gyors = !temp.gyors;
               System.out.print(temp); 
            
        }
        System.out.println("");

    }
    //7.Feladat
    void writesFile(ArrayList<Pizza> pizzak) throws IOException {
        for (Pizza temp : pizzak) {
            if (temp.nev.equals("Magyaros")) {
                temp.nev = "Magyartalan";
                temp.koltseg -= 200;
            }
        }
        FileWriter wr = new FileWriter(name + "Version2 .txt");

        for (Pizza temp : pizzak) {
            wr.write(String.valueOf(temp.nev) + separetors[rng] + String.valueOf(temp.gyors) + separetors[rng]
                    + String.valueOf(temp.koltseg) + separetors[rng] + String.valueOf(temp.meret) + separetors[rng] + String.valueOf(temp.ertekeles) + "\n");
        }
        wr.close();
        System.out.println("File created: " + name + "Version2 .txt");
    }

}
