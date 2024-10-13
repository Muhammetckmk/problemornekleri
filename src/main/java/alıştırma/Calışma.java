package alıştırma;

public class Calışma {
/*
    static double faizOrani;

    String name;
    int tutar;

    static {

        faizOrani=3.5;
        System.out.println("Faiz oranı belirlendi : " + faizOrani + "%");



    }



    public Calışma(String name, int tutar){
    this.name=name;
    this.tutar=tutar;
    }
    public double totalBorc(){
        return tutar+(tutar*faizOrani/100);
    }




    public static void main(String[] args) {

      //  Bir bankada, her müşterinin belirli bir faiz oranı ile kredi çekme imkanı vardır. Ancak bu faiz oranı,
        //  tüm müşteriler için aynıdır ve bir kez sınıf yüklendiğinde belirlenir (örneğin %3.5). Müşterilerin isimleri ve
        //  çektikleri kredi tutarı ise her müşteri için farklıdır.
//
      //  Bir Customer sınıfı oluştur.
      //  Bu sınıfta, static double interestRate adında bir statik değişken olsun ve tüm müşteriler için sabit kalsın.
      //          Faiz oranını bir static block içinde başlat.
      //          Her müşteri için name ve loanAmount (kredi tutarı) adında değişkenler tanımla.
      //          Müşterilerin isimlerini ve kredi tutarlarını tanımlayıp, faiz oranını kullanarak toplam borçlarını hesaplayan bir method yaz.






    }*/

   // Bir okulda, tüm öğrenciler için ortak bir okul ismi vardır ve bu okul ismi sınıf yüklenirken bir kez belirlenir.
   // Her öğrenci ise kendine ait bir isim ve yaşa sahiptir.
//
   // Bir Student sınıfı oluştur.
   // Tüm öğrenciler için geçerli olacak şekilde, bir static String schoolName adında bir değişken tanımla.
   // Bu okul ismini bir static block içinde başlat (örneğin, "XYZ Okulu").
   // Her öğrenci için name ve age adında iki değişken tanımla.
   // Bir öğrenci oluşturup bilgilerini ekrana yazdır.


    public static String okul;

    String ogrenciName;

    static {
        okul= "Ertuğrulgazi İlkokulu";
        System.out.println(okul);

    }

    public Calışma(String ogrenciName){
        this.ogrenciName=ogrenciName;
    }



}
