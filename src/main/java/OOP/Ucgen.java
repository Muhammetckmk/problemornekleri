package OOP;

public class Ucgen extends Sekil{

    public double taban;
    public double yükseklik;

    public Ucgen(double taban, double yükseklik){
        this.taban=taban;
        this.yükseklik=yükseklik;
    }


    @Override
    public double cevreHesapla() {
        return 0;
    }

    @Override
    public double alanHesapla() {
        return taban*yükseklik/2;

    }

}
