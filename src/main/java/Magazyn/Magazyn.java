package Magazyn;

import java.time.LocalDate;
import java.util.*;

public class Magazyn {
        Map<Kategoria,List<Produkt>> produktyWkategorii = new HashMap<>();

        public void addItem(Produkt e){
            //sprawdzam czy
            if(produktyWkategorii.keySet().contains(e.getKategoria())) {
                produktyWkategorii.get(e.getKategoria()).add(e);
            }else {
                produktyWkategorii.put(e.getKategoria(),new ArrayList<>());
                produktyWkategorii.get(e.getKategoria()).add(e);
            }
        }

        public void removeItem(Produkt e){
            produktyWkategorii.get(e.getKategoria()).remove(e);
        }

        public boolean czyProduktWKategorii(Kategoria k, Produkt e){
            return produktyWkategorii.get(k).contains(e);
        }

        public void usunNieswierzeProdukty(){
            for(Kategoria k: produktyWkategorii.keySet()){
                produktyWkategorii.get(k).removeIf(u -> u.getDataSpożycia().isBefore(LocalDate.now()));
            }
        }
        public Produkt najdrozszyProduktWMagazynie(){
            Produkt p = new Produkt(0,LocalDate.now(),"produktTestowy",0,Kategoria.NABIAL);
            for(Kategoria k: produktyWkategorii.keySet()){
                if(p.getCena() < produktyWkategorii.get(k).stream().max(Comparator.comparingDouble(u -> u.getCena())).get().getCena())
                    p = produktyWkategorii.get(k).stream().max(Comparator.comparingDouble(u -> u.getCena())).get();
            }
            return p;
        }



    }
