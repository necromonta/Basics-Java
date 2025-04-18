package tutorial;

/**
 *
 * @author anagy
 */
public class Pizza {
       String nev;
       boolean gyors;
       int koltseg;
       int meret;
       double ertekeles;

    public Pizza(String nev, boolean gyors, int koltseg, int meret,double ertekeles) {
        this.nev = nev;
        this.gyors = gyors;
        this.koltseg = koltseg;
        this.meret = meret;
        this.ertekeles=ertekeles;
    }

    @Override
    public String toString() {
        return "Pizza{" + "nev=" + nev + ", gyors=" + gyors + ", koltseg=" + koltseg + "Ft, meret=" + meret + ", ertekeles=" + ertekeles + '}';
    }

 
   
       
       
       
}
