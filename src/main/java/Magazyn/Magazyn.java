package Magazyn;

import java.util.HashMap;
import java.util.Map;

public class Magazyn {

    public Magazyn() {
    }


    Map<String,Produkt> produkty = new HashMap<>();

    private void usunProdukt(){}
    private void usunProduktyNieSwieze(){}
    private void sprawdzCzyProduktWKategorii(){}

    public void dodajProdukty(int id, String dataSpozycia, String nazwa, double cena, String kategoria, int klasaProd) {
        Produkt produkt = new Produkt();
        produkty.put(kategoria,produkt);
    }


}
