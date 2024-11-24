package OOP;

import java.util.ArrayList;

public class SekilRunner {
    public static void main(String[] args) {

Sekil[] d = {new Dikdörtgen(6,5), new Daire(5), new Ucgen(6,2)};


        ArrayList<Double> alan=new ArrayList<>();
        ArrayList<Double> cevre=new ArrayList<>();


for (Sekil w: d){
   cevre.add(w.cevreHesapla());
    alan.add(w.alanHesapla());
}
        System.out.println(alan);
        System.out.println(cevre);


    }}
