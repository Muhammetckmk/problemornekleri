package OOP;

public class BankaHesabıRunner {
    public static void main(String[] args) {

        Bankahesabı giris= new VadesizHesap(1000);
        Bankahesabı giris2= new VadeliHesap(5000, 0.05);
        Bankahesabı giris3= new YatırımHesabı(10000, 10);
        giris.bakiyeGöster();

        giris2.faizHesapla();
        System.out.println("giris2.faizHesapla() = " + giris2.faizHesapla());

        System.out.println("giris3.faizHesapla() = " + giris3.faizHesapla());
        giris3.bakiyeGöster();



    }
}
