package OOP;

public class Dikdörtgen extends Sekil{

    public double kısaKenar;
    public double uzunKenar;

    public Dikdörtgen(double uzunkenar, double kısakenar){
        this.kısaKenar=kısakenar;
        this.uzunKenar=uzunkenar;

    }

    @Override
    public String toString() {
        return "Dikdörtgen{" +
                "kısaKenar=" + kısaKenar +
                ", uzunKenar=" + uzunKenar +
                '}';
    }

    @Override
   public double alanHesapla() {
        return kısaKenar*uzunKenar;
    }
}
