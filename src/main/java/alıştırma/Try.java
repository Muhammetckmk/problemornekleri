package alıştırma;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Try {

    public static void main(String[] args) {

        //  Problem: Pozitif ve Negatif Sayıları Ayırma
        //  Kullanıcıdan 10 adet sayı al ve bu sayıları pozitif ve negatif olarak iki ayrı listeye ayır.
        //  Daha sonra bu listeleri ekrana yazdır.

        //  Beklenen Adımlar:
        //  Kullanıcıdan 10 adet sayı iste.
        //  Sayılar arasında pozitif olanları bir listeye, negatif olanları başka bir listeye koy.
        //  Son olarak, pozitif ve negatif listeleri ekrana yazdır.

        //  Scanner input = new Scanner(System.in);
        // System.out.println("Lütfen 10 adet sayı giriniz");


        // LinkedList<Integer> pozitif= new LinkedList<>();
        // LinkedList<Integer> negatif= new LinkedList<>();

        // for (int w= 0; w<10; w++){
        //     int sayi=input.nextInt();
        //     if (sayi < 0) {
        //         negatif.add(sayi);
        //     } else if (sayi > 0) {
        //         pozitif.add(sayi);
        //     } else {
        //         System.out.println(sayi + " = nötür");
        //     }

        // }
        // System.out.println(pozitif);
        // System.out.println(negatif);


        //  Problem: Ortalamadan Büyük Sayıları Bulma
        //  Kullanıcıdan 10 adet sayı al, bu sayıların ortalamasını hesapla ve ardından ortalamadan büyük olan
        //  sayıları ayrı bir listeye koyup ekrana yazdır.
//
        //          Beklenen Adımlar:
        //  Kullanıcıdan 10 sayı al.
        //  Bu sayıların ortalamasını hesapla.
        //  Ortalamadan büyük olan sayıları bul ve bunları ayrı bir listeye koy.
        //          Ortalamayı ve ortalamadan büyük olan sayıları ekrana yazdır.
        //          Çözüm:

        //  LinkedList<Integer> hepsi= new LinkedList<>();
        //  LinkedList<Integer> büyük=new LinkedList<>();

        //  int sum=0;

        //  for (int i = 0; i <10 ; i++) {
        //      int sayi= input.nextInt();
        //      sum+=sayi;
        //      hepsi.add(sayi);
        //      if (sayi>sum/10){
        //          büyük.add(sayi);
        //      }

        //  }
        //  System.out.println("Tüm sayılar : "+ hepsi);
        //  System.out.println("ortalama : "+sum/10);
        //  System.out.println("büyük Sayılar : " + büyük);

            /*Problem: Tekrarlayan Elemanları Kaldırma
    Kullanıcıdan 10 adet sayı al ve bu sayılar arasında tekrarlayanları kaldırarak ekrana yazdır.

    Beklenen Adımlar:
    Kullanıcıdan 10 sayı al.
    Bu sayıları bir Set yapısına ekleyerek, tekrarlananları otomatik olarak kaldır.
    Tekrarlanmayan sayıları ekrana yazdır.*/

        // HashSet<Integer> hepsi= new HashSet<>();

        // ArrayList<Integer> tekrarlılar= new ArrayList<>();

        // for (int i = 0; i <10 ; i++) {
        //     int sayi= input.nextInt();


        //     if (!hepsi.contains(sayi)) {
        //         hepsi.add(sayi);
        //     }else {
        //         tekrarlılar.add(sayi);
        //     }


        // }
        // System.out.println("tekrarlılar = " + tekrarlılar);
        // System.out.println("hepsi = " + hepsi);

        /*
        Problem 1: Banka Kuyruğu Simülasyonu
        Bir bankada işlem yapmak isteyen müşteriler sıraya giriyor. Kuyruk veri yapısını
        kullanarak müşteri sırasını simüle edin. Kullanıcıdan 5 müşteri adı alıp sıraya ekleyin.
                Her müşteri sırası geldiğinde, "X sıradaki müşterinin işlemi yapılıyor"
        şeklinde mesaj yazdırarak sıradaki müşteriyi kuyruğun başından çıkartın ve ekrana yazdırın.
        */

        // System.out.println("kuyruğa girecek 5 isim giriniz");
//
        // Queue<String> müsteri= new LinkedList<>();
//
        // for (int i = 0; i <5 ; i++) {
        //     String a= input.nextLine();
//
        //     müsteri.add(a);
//
        //     System.out.println(a+ " isimli müşteri sıraya girdi");
        // }
        // System.out.println(müsteri);
//
        // for (int w = 0; w<5; w++){
//
        //     System.out.println(müsteri.poll()+  " isimli mişterinin işlemi bitti ve sıradan ayrıldı " );
        // }

        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb.length() + " - " + sb.capacity());
        }
    }