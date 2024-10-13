package OOP;

public  class VadesizHesap extends Bankahesabı{

    public VadesizHesap( double bakiye){
        super(bakiye);
    }


    @Override
    public   double faizHesapla(){
        return 0;
    }
}
