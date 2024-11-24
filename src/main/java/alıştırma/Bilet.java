package alıştırma;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bilet {
    public double toplamTutar;
    public String koltukNo;
    public byte yolculukTipi;
    public double mesafe;

    public void bilet(int yas){
        int koltuk= Integer.parseInt(koltukNo);
        double tutar=0;

        switch (this.yolculukTipi){
            case 1:

                if (koltuk%3==0){
                    tutar=this.mesafe*1.2;
                }else {
                    tutar=this.mesafe*1;
                }
                System.out.println("tutar : " + tutar);

            break;

            case 2:
                if (koltuk%3==0){
                    tutar=this.mesafe*2.4;

                }else{
                    tutar=this.mesafe*2;
                }

                System.out.println("indirimsiz tutarınız : " + tutar);
                tutar=tutar*0.8;
                System.out.println("gidiş-dönüş indirimli tutar : "+ tutar);

                break;
        }


        if (yas<12){
            tutar=tutar*0.5;
            System.out.println("12 yaş altı indirimli bilet fiyatı : " +tutar);
        } else if (yas>65) {
            tutar=tutar*0.7;
            System.out.println("65 yaş üstü indirimli bilet fiyatı : "+ tutar);
        }
        this.toplamTutar=tutar;
    }

    public void biletCıktısı( Bus otobüs){

        LocalDateTime ldt= LocalDateTime.now();
        DateTimeFormatter frmt=DateTimeFormatter.ofPattern("dd.MMM.yyyy \n HH:mm a");

        System.out.println("*".repeat(25));
        System.out.println("-----* Otobüs Bileti *----------" );
        System.out.println("otobüs firması      : " + otobüs.firma);
        System.out.println("otobüs plakası      : " + otobüs.plaka);
        System.out.println("Peron               : " + otobüs.peron);
        System.out.println("koltuk numarası     : " + this.koltukNo);
        System.out.println("Yolculuk Tipi       : " + (this.yolculukTipi ==1? " tek yön ": "Gidiş - Dönüş"));
        System.out.println("Mesafe              : " + this.mesafe);
        System.out.println("Toplam Tutar        : " + toplamTutar);
        System.out.println("Hayırlı Yolculuklar Dileriz");
        System.out.println(frmt.format(ldt));
        System.out.println("*".repeat(25));
    }





}
