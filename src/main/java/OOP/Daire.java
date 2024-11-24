package OOP;

public class Daire extends Sekil {

    private double yaricap;
    private double yari;

    @Override
    public String toString() {
        return "Daire{" +
                "yaricap=" + yaricap +
                '}';
    }

    public Daire(double yarıcap){
    this.yaricap=yarıcap;


    }
    @Override
     public double alanHesapla() {
        return 3.14 * yaricap * yaricap;
    }

    @Override
    public double cevreHesapla() {

        return 2*Math.PI*yaricap;
    }


}
