package OOP;

class VadeliHesap extends Bankahesabı{

        double faizOranı;
    public VadeliHesap(double bakiye, double faizOranı) {
        super(bakiye);
        this.faizOranı=faizOranı;

    }

    @Override
    public double faizHesapla() {
        return faizOranı*bakiye;

    }
}
