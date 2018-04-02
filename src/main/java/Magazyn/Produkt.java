package Magazyn;


import lombok.Getter;


@Getter


public class Produkt {
    private int id;
    private String dataSpozycia;
    private String nazwa;
    private double cena;
    private String kategoria;
    private int klasaProd;

    public Produkt(int id, String dataSpozycia, String nazwa, double cena, String kategoria, int klasaProd) {
        this.id = id;
        this.dataSpozycia = dataSpozycia;
        this.nazwa = nazwa;
        this.cena = cena;
        this.kategoria = kategoria;
        this.klasaProd = klasaProd;
    }

    public Produkt() {

    }

    @Override
    public String toString() {
        return "Produkt{" +
                "id=" + id +
                ", dataSpozycia='" + dataSpozycia + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", kategoria='" + kategoria + '\'' +
                ", klasa=" + klasaProd +
                '}';
    }
}


