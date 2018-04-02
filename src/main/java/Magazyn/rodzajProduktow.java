package Magazyn;

public enum rodzajProduktow {
    NABIAL,
    OWOCE,
    WARZYWA,
    PIECZYWO;



    rodzajProduktow() {
    }

    public void wyswietlRodzajProduktu() {
        String text = this.toString().toLowerCase();
        System.out.println(text);
    }

}