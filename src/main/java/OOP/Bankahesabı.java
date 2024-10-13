package OOP;

public abstract class Bankahesabı {
   /* Problem: Banka Hesapları
    Bir bankada farklı türde hesaplar var:
    VadesizHesap, VadeliHesap ve YatirimHesabi.
    Her hesap türü, farklı şekillerde faiz hesaplar. VadesizHesap için faiz yoktur,
    VadeliHesap belirli bir oranda faiz verirken, YatirimHesabi ise kâr oranına göre
    kazanç sağlar. Her hesap türü için polimorfizm kullanarak faiz veya kazanç hesaplayan
    bir sistem oluşturun.

            Adımlar:
    Temel Sınıf: Bir BankaHesabi sınıfı oluşturun.
    Bu sınıf bir faizHesapla metoduna sahip olacak.
    Alt Sınıflar: VadesizHesap, VadeliHesap ve YatirimHesabi sınıfları oluşturun,
    BankaHesabi sınıfından türeyip, faizHesapla metodunu her hesap türüne göre uygulayın.
    Polimorfizm Kullanımı: Farklı hesapları bir listeye koyarak her hesap türü için faiz
    veya kazanç hesaplayın.*/



    public double bakiye;

    public Bankahesabı(double bakiye){

        this.bakiye=bakiye;
    }


    public abstract double faizHesapla();

    public void bakiyeGöster() {

        System.out.println("bakiyeniz : " + bakiye + " TL dir");

    }
}
