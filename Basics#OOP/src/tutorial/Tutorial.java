package tutorial;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author anagy
 */
public class Tutorial {

    public static String separetors[] = {"<", ">", "\t", ";", " ", ","};
    public static int rng;
    public static String name;
    public static boolean useless;
    public static int lines;

    public static void main(String[] args) throws IOException {

        userInput();

    }

    public static void createsPizzaArrayList(boolean showTxt) throws IOException {

        Pizza pizzak[] = new Pizza[lines];
        String nev[] = {"SonkasKukoricas", "Hawaii", "Sajtos", "Magyaros", "Bolognai", "Szalamis", "Gyros", "SonkasGombas", "Husimado", "Buldozer", "Sonkas", "Mexikoi"};
        boolean gyorsTomb[] = {true, false};

        //+1 sor
        int index = 0;
        if (useless) {
            pizzak = new Pizza[lines + 1];
            pizzak[0] = new Pizza("corruptedlinenotgoodqlwqekgmkre", true, 12213, 12312, 132);
            index = 1;
        }

        //randomizalas
        while (index < pizzak.length) {
            int rng1 = (int) (Math.random() * (nev.length));
            int rng2 = (int) (Math.random() * (gyorsTomb.length));
            int rng3 = (int) ((Math.random() * 55) + 10) * 100;
            int rng4 = (int) (Math.random() * 5) * 4 + 24;
            double rng5 = (Math.random() * 4) + 1;
            pizzak[index] = new Pizza(nev[rng1], gyorsTomb[rng2], rng3, rng4, rng5);
            index++;
        }

        //fileiras
        FileWriter wr = new FileWriter(name + ".txt");
        DecimalFormat df = new DecimalFormat("0.#");
        rng = (int) (Math.random() * (separetors.length));
        for (int i = 0; i < lines; i++) {
            wr.write(String.valueOf(pizzak[i].nev) + separetors[rng] + String.valueOf(pizzak[i].gyors) + separetors[rng]
                    + String.valueOf(pizzak[i].koltseg) + separetors[rng] + String.valueOf(pizzak[i].meret) + separetors[rng] + String.valueOf(df.format(pizzak[i].ertekeles)) + "\n");
        }
        wr.close();

        if (showTxt) {
            Desktop desktop = Desktop.getDesktop();
            File file = new File(name + ".txt");
            desktop.open(file);
        }

    }

    public static void userInput() throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Add meg a sorok szamat");
          lines = Integer.valueOf(sc.nextLine());

        System.out.println("Mutassa a file-t (true/false)");
        String userInput2 = sc.nextLine();

        System.out.println("Legyen felesleges elso sora (true/false)");
        useless = Boolean.valueOf(sc.nextLine());

        System.out.println("Add meg a file nevet");
        name = sc.nextLine();

        createsPizzaArrayList(Boolean.valueOf(userInput2));

        System.out.println("File created...");
        System.out.println("Feladatok: \n"
                + " 1.fileBeolvasas+kiiratas\n"
                + " 2. Magyaros adatai + hany db\n"
                + " 3. Gyros es 3100ft folott adatai, else nem volt\n"
                + " 4. Bolognai gyors %,atlag money , atlag meret, \n"
                + " 5. legdragabb pizza es 2. legdragabb között a kulonbseg + fajtajuk\n"
                + " 6. eloszor rendezd novekvo-be ertekeles alapjan, majd valtsd gyors attributumot mindennek az ellenkezojere \n"
                + " 7. Magyaros pizzat kicserelni Magyartalan-ra es az arabol levonni 200-t es ezt kiiratni egy fileba aminek legyen mas neve");
        System.out.println("Mutassa a megoldasokat (true/false)");
        String userInput4 = sc.nextLine();
        if (Boolean.valueOf(userInput4)) {
            System.out.println("---------------------------");
           new Solved();
        }
    }

}
