package Magazyn;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
public class Produkt {
    private int id;
    private LocalDate dataSpożycia;
    private String nazwa;
    private double cena;
    private Kategoria Kategoria;
    private Klasa Klasa;

    public Produkt(int id, LocalDate dataSpożycia, String nazwa, double cena, Kategoria kategoria, Klasa klasa) {
        this.id = id;
        this.dataSpożycia = dataSpożycia;
        this.nazwa = nazwa;
        this.cena = cena;
        this.Kategoria = kategoria;
        this.Klasa = klasa;
        if(cena < 10 ) {
            klasa = Klasa.NISKA;
        }else {
            klasa = Klasa.WYSOKA;
        }
    }
}


