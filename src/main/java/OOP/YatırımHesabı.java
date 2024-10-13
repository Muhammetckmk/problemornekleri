package OOP;

class YatırımHesabı extends Bankahesabı {


    double karOranı;
    public YatırımHesabı(double bakiye, double karOranı){
        super(bakiye);
        this.karOranı=karOranı;


    }

    @Override
    public double faizHesapla() {

        return karOranı*bakiye;
    }
}
