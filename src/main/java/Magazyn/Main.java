package Magazyn;

import java.time.LocalDate;
import static Magazyn.Kategoria.*;

public class Main {
    public static void main(String[] args) {
        Produkt banan = new Produkt(1,LocalDate.of(2018, 05, 23),"Banan Chiquita", 4, OWOCE );
        Produkt jablko = new Produkt(56,LocalDate.of(2018, 6, 30),"Jablko Champion", 22.1, OWOCE );
        Produkt chlebZytni = new Produkt(10,LocalDate.of(2018, 04, 20),"Chleb Żytni", 11,  PIECZYWO );
        Produkt marchew = new Produkt(2,LocalDate.of(2018, 03, 15),"Marchewka", 4.13,  WARZYWA );
        Produkt ser = new Produkt(7,LocalDate.of(2017, 10, 12),"Ser",  1, NABIAL);

        Magazyn magazyn1 = new Magazyn();
        Magazyn magazyn2 = new Magazyn();

        magazyn1.addItem(banan);
        magazyn1.addItem(ser);
        magazyn1.addItem(marchew);
        magazyn1.addItem(chlebZytni);

        magazyn2.addItem(jablko);
        magazyn2.addItem(jablko);
        magazyn2.addItem(marchew);
        magazyn2.addItem(ser);

        Zarzadca zarzadca = new Zarzadca();
        zarzadca.dodajMagazyn("Magazyn1", magazyn1);
        zarzadca.dodajMagazyn("Magazyn2", magazyn2);

        zarzadca.NajdrozszeProduktyZKazdegoMagazynu();
    }

}
