package alıştırma;

import java.util.Scanner;

public class biletRunner {


    /*
    project: Bilet Rezervasyon ve Bilet Fiyatı Hesaplama Uygulaması

            1-Uygulama mesafe ve kurallara göre otobüs bileti fiyatı hesaplar sonuç olarak bilet bilgisini verir
            2- Kullanıcıdan     mesafe (KM),
            yolcu yaşı ,
            yolculuk tipi (Tek Yön, Gidiş-Dönüş)
            ve koltuk no bilgilerini alınır.
            NOT: Koltuk numaraları 1-32 aralığında olmalıdır.)
            Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
            Aksi halde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

            3-Fiyat hesaplama kuralları:
            -Mesafe başına ücret:
            Tek yön: 1 Lira / km       Çift Yön(Gidiş-Dönüş): 2 Lira/km
            -Tekli Koltuk ücreti:
            Koltuk no 3 veya 3 ün katı ise fiyat %20 daha fazladır(Tek yön: 1.2 Lira/km, Çift Yön:2.4 Lira/km).
            -İlk olarak seferin mesafe, yön ve koltuk no bilgisine göre fiyatı hesaplanır,
            sonrasında koşullara göre aşağıdaki indirimler uygulanır ;
            i)-Çift Yön indirimi:
            "Yolculuk Tipi" gidiş dönüş seçilmiş ise son bilet fiyatı üzerinden %20 indirim uygulanır.
            ii)-Yaş indirimi:
            Kişi 12 yaşından küçükse son bilet fiyatı üzerinden %50 indirim uygulanır.
            Kişi 65 yaşından büyük ise son bilet fiyatı üzerinden %30 indirim uygulanır.

            */
    public static void main(String[] args) {
        Bus otobüs= new Bus("CakmakTour",  "46MNC51", (byte) 6);
        Bilet bilet= new Bilet();
        basla(otobüs,bilet);
    }

    public static void basla(Bus otobüs, Bilet bilet){
        Scanner input=new Scanner(System.in);
        int cıkış;
        int hepsi=0;

        do {
            System.out.println("Yaşınızı giriniz");
            int yas=input.nextInt();

            System.out.println("gideceğiniz mesafeyi giriniz");
           double mesafe= input.nextDouble();

            System.out.println("yolculuk tipiniz seçiniz . \ntek yön için : 1\n gidiş-dönüş için : 2");
            byte tip= input.nextByte();

            System.out.println("koltuk numaranızı seçiniz. tekli koltuklar %20 daha pahalıdır");
            System.out.println(otobüs.koltukSayısı);
            String koltukNo= input.next();

           boolean rezerveMi= !otobüs.koltukSayısı.contains(koltukNo);
           if (rezerveMi){
               System.out.println("rezerve olmuş bir koltuk seçtiniz");
           }

            if (yas>0 && mesafe>0 && !rezerveMi &&(tip==1||tip==2)){


                bilet.yolculukTipi=tip;
                bilet.mesafe=mesafe;
                bilet.koltukNo=koltukNo;
                bilet.biletCıktısı(otobüs);
                bilet.bilet(yas);

            }else{
                System.out.println("hatalı bir veri girdiniz");
            }
           System.out.println("Toplam bilet fiyatınız : "+ bilet.toplamTutar);
            System.out.println("çıkış yapmak için 0 a basınız \n yeni bir bilet almak için başka bir sayıya basınız");

        hepsi += bilet.toplamTutar;

            cıkış=input.nextInt();

        }while (cıkış!=0);
        System.out.println(hepsi);


    }




}
