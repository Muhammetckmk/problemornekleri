package OOP;

public class SekilRunner {
    public static void main(String[] args) {

        Dikdörtgen d=new Dikdörtgen(3,6);
        Daire daire=new Daire(6);
        Ucgen u=new Ucgen(6,9);
        System.out.println("d.alanHesapla() = " + d.alanHesapla());
        System.out.println("daire.alanHesapla() = " + daire.alanHesapla());
        System.out.println("u.alanHesapl() = " + u.alanHesapla());

        System.out.println("daire.cevre(6) = " + daire.cevre(6));
    }
}
