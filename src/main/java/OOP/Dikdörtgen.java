package OOP;

public class Dikdörtgen extends Sekil{


    double kısaKenar;
    double uzunKenar;

    public Dikdörtgen(double kısaKenar, double uzunKenar){
        this.kısaKenar=kısaKenar;
        this.uzunKenar=uzunKenar;
    }

    @Override
    public double alanHesapla() {


        return kısaKenar*uzunKenar;
    }

    @Override
    public double cevreHesapla(){
        return (kısaKenar+uzunKenar)*2;
    }


}
