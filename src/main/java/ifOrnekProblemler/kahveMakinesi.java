package ifOrnekProblemler;

import java.util.Scanner;

public class kahveMakinesi {
    public static void main(String[] args) {
        /*  1. Basit bir Kahve makinesi oluşturun.    3 çeşit kahvemiz olsun.
        2. Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"
        3.Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
        Örn:
        Hangi Kahveyi İstersiniz?
                1.Türk kahvesi
        2.Filtre Kahve
        3.Espresso
        String hangiKahve oluşturun ve var olan kahvelerden birini yazınız.
        (örn: Türk Kahvesi,  ya da türk kahvesi.  --->  Büyük- küçük harf duyarlı olmaması için String methodu kullanın.)
        todo 1. Koşul bölümü
        Eğer kahve Türk kahvesi ise, konsola = Türk kahvesi hazırlanıyor. yazsın.(Dümdüz Türk kahvesi yazmayın. String hangiKahve'yi çağırın!!)
        Eğer filtre kahve ise,   konsola = Filtre kahve hazırlanıyor.  yazsın.     (String hangiKahve'yi kullanın !)
        Eğer Espresso ise, konsola =  Espresso hazırlanıyor...   yazsın.  (String hangiKahve'yi kullanın !)
        Eğer yanlış harf girerseniz, konsola = Hatalı tuşlama yaptınız. yazsın. (Hatalı tuslamadan sonra kod calısmaya devam edecektir,
        o konuyu daha görmediniz bu yüzden bastan baslatın.)

        todo ----------------------------------
        Sistem bize şu soruyu sorsun: "Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):    "
         Konsolda aynen böyle  yazmalı. Parantez içi de konsolda olsun.

        String sut olusturun.


        todo 2.Koşul Bölümü
        eğer String sut,  evet   e eşitse,konsola, Süt ekleniyor... yazısı gelsin.
        -- (Büyük küçük harf duyarlı olmaması için String methodu kullanın. Olması gereken ihtimaller: Evet, EVET, EvEt,EVEt vs.

                eğer String sut, hayır a eşit ise, konsola , Süt eklenmiyor  yazısı gelsin.
                todo ----------------------------------
        Sistem bize "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) : " şeklinde bir soru sorsun. (Büyük küçük harf duyarlılıgı olmaması için string method kullanın.
        String seker oluşturunuz.
                todo 3.Koşul Bölümü
        todo if(){
            Eğer String seker   Evet e eşitse ,  sistem bize "Kaç şeker olsun?" sorusunu sormalı. Sorunun altına int kacSeker  oluşturunuz.
                    Şeker sayısını giriniz.
            Ve konsola   şunu yazdırınız örnek: 5 şeker ekleniyor.  (ipucu: Bu kodların heosi if bloğunun içerisinde olacak)
            todo }
        todo else{
            Eğer String şeker  hayır 'a eşitse, sistem bize "Şeker eklenmiyor" cevabını versin.
            ONEMLİ !! =   bir int girdisinden sonra String girdisi yapacaksak,araya boş bir nextLine koymamız gerekiyor. (String bosKod = sc.nextLine();    )  dummy kod ekleyiniz.
                    Sistem bize "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) :   sorusunu sorsun. (büyük küçük harf duyarlılıgı olmamalı. yani kullanıcı büyük boy veya BüYüK Boy girdiginde kabul etmeli.
            String boyut oluşturun...
            todo 4.Koşul Bölümü
            eğer String boyut Büyük boy' a eşitse =  Kahveniz büyük boy hazırlanıyor. (Büyük boy kısmını String boyut'u kullanarak yazalım= "Kahveniz" + boyut + "hazırlanıyor.")
            Eğer String boyut  Orta Boy'a eşitse = Kahveniz orta boy hazırlanıyor.. ("Kahveniz" + boyut + "hazırlanıyor.)
            Eğer String boyut  Küçük boy'a eşitse = Kahveniz küçük boy hazırlanıyor.    yazsın. ("Kahveniz" + boyut + "hazırlanıyor.)
            //todo  SONUÇ BÖLÜMÜ
            Siparişlerimizi verdik. Son hali görmek istiyoruz.
            konsola şunu yazdırın örnek :
            Türk Kahvesi orta boy hazırdır. Afiyet olsun !!! (Türk kahvesi için String hangiKahveyi kullanın.     orta boy için de String boyut ' u kullanın.)
   */


      /*  Scanner input = new Scanner(System.in);
        System.out.println("Hangi kahveyi istersiniz ? \n TÜRK KAHVESİ \n FİLTRE KAHVE \n ESPRESSO");
        String kahveCesidi = input.nextLine();




        if (kahveCesidi.equalsIgnoreCase("türk kahvesi")) {

            System.out.println(kahveCesidi + " hazırlanıyor");

            System.out.println("süt eklememizi ister misiniz? \nEVET \nHAYIR");
            String sutSorusu=input.next();
            if (sutSorusu.equalsIgnoreCase("evet")) {
                System.out.println("süt ekleniyor");
            } else if (sutSorusu.equalsIgnoreCase("hayır")) {
                System.out.println("süt eklenmiyor");
            }else {
                System.out.println("hatalı bir giriş yaptınız");
            }
            System.out.println("şeker ister misiniz. \nEvet \nHayır");
            String sekerSorusu= input.next();
            if (sekerSorusu.equalsIgnoreCase("evet")){
                System.out.println("kaç şeker istersiniz.");
                int sekerSayısı= input.nextInt();
                System.out.println(sekerSayısı + " şeker ekleniyor");
            } else if (sutSorusu.equalsIgnoreCase("hayır")) {
                System.out.println("şeker eklenmiyor");
            }else {
                System.out.println("hatalı bir giriş yaptınız");
            }

            System.out.println("kahvenizi hangi boyutta istersiniz. \n küçük \n orta \n büyük");
            String boyut= input.next();
            if (boyut.equalsIgnoreCase("büyük")){
                System.out.println("kahveniz " + boyut+" boy hazırlanıyor" );
            } else if (boyut.equalsIgnoreCase("orta")) {
                System.out.println("kahveniz " + boyut+" boy hazırlanıyor" );
            } else if (boyut.equalsIgnoreCase("küçük")) {
                System.out.println("kahveniz " + boyut+" boy hazırlanıyor" );
            }else {
                System.out.println("hatalı bir giriş yaptınız");
            }

            System.out.println(kahveCesidi+ " "+ boyut +" boy hazırdır");
        } else if (kahveCesidi.equalsIgnoreCase("filtre kahve")) {
            System.out.println(kahveCesidi + " hazırlanıyor");

            System.out.println("süt eklememizi ister misiniz? \nEVET \nHAYIR");
            String sutSorusu=input.next();
            if (sutSorusu.equalsIgnoreCase("evet")) {
                System.out.println("süt ekleniyor");
            } else if (sutSorusu.equalsIgnoreCase("hayır")) {
                System.out.println("süt eklenmiyor");
            }else {
                System.out.println("hatalı bir giriş yaptınız");
            }
            System.out.println("şeker ister misiniz. \nEvet \nHayır");
            String sekerSorusu= input.next();
            if (sekerSorusu.equalsIgnoreCase("evet")){
                System.out.println("kaç şeker istersiniz.");
                int sekerSayısı= input.nextInt();
                System.out.println(sekerSayısı + " şeker ekleniyor");
            } else if (sutSorusu.equalsIgnoreCase("hayır")) {
                System.out.println("şeker eklenmiyor");
            }else {
                System.out.println("hatalı bir giriş yaptınız");
            }
            System.out.println("kahvenizi hangi boyutta istersiniz. \n küçük \n orta \n büyük");
            String boyut= input.next();
            if (boyut.equalsIgnoreCase("büyük")){
                System.out.println("kahveniz " + boyut+" boy hazırlanıyor" );
            } else if (boyut.equalsIgnoreCase("orta")) {
                System.out.println("kahveniz " + boyut+" boy hazırlanıyor" );
            } else if (boyut.equalsIgnoreCase("küçük")) {
                System.out.println("kahveniz " + boyut+" boy hazırlanıyor" );
            }else {
                System.out.println("hatalı bir giriş yaptınız");
            }
            System.out.println(kahveCesidi+ " "+ boyut +" boy hazırdır");

        } else if (kahveCesidi.equalsIgnoreCase("espresso")) {
            System.out.println(kahveCesidi + " hazırlanıyor");

            System.out.println("süt eklememizi ister misiniz? \nEVET \nHAYIR");
            String sutSorusu=input.next();
            if (sutSorusu.equalsIgnoreCase("evet")) {
                System.out.println("süt ekleniyor");
            } else if (sutSorusu.equalsIgnoreCase("hayır")) {
                System.out.println("süt eklenmiyor");
            }else {
                System.out.println("hatalı bir giriş yaptınız");
            }
            System.out.println("şeker ister misiniz. \nEvet \nHayır");
            String sekerSorusu= input.next();
            if (sekerSorusu.equalsIgnoreCase("evet")){
                System.out.println("kaç şeker istersiniz.");
                int sekerSayısı= input.nextInt();
                System.out.println(sekerSayısı + " şeker ekleniyor");
            } else if (sutSorusu.equalsIgnoreCase("hayır")) {
                System.out.println("şeker eklenmiyor");
            }else {
                System.out.println("hatalı bir giriş yaptınız");
            }
            System.out.println("kahvenizi hangi boyutta istersiniz. \n küçük \n orta \n büyük");
            String boyut= input.next();
            if (boyut.equalsIgnoreCase("büyük")){
                System.out.println("kahveniz " + boyut+" boy hazırlanıyor" );
            } else if (boyut.equalsIgnoreCase("orta")) {
                System.out.println("kahveniz " + boyut+" boy hazırlanıyor" );
            } else if (boyut.equalsIgnoreCase("küçük")) {
                System.out.println("kahveniz " + boyut+" boy hazırlanıyor" );
            }else {
                System.out.println("hatalı bir giriş yaptınız");
            }


            System.out.println(kahveCesidi+ " "+ boyut +" boy hazırdır");
        }else {
            System.out.println("hatalı bir giriş yaptınız");
        }
*/
        Scanner input = new Scanner(System.in);
        System.out.println("Hangi kahveyi istersiniz ? \n TÜRK KAHVESİ \n FİLTRE KAHVE \n ESPRESSO");
        String kahveCesidi = input.nextLine();
        String[] kahveSorusu = {"türk kahvesi", "filtre kahve", "espresso"};


        int[] ks = new int[kahveSorusu.length];

        for (int w : ks) {
            System.out.println("süt eklememizi ister misiniz? \nEVET \nHAYIR");
            String sutSorusu = input.next();
            if (sutSorusu.equalsIgnoreCase("evet")) {
                System.out.println("süt ekleniyor");
            } else if (sutSorusu.equalsIgnoreCase("hayır")) {
                System.out.println("süt eklenmiyor");
            } else {
                System.out.println("hatalı bir giriş yaptınız");
            }
            System.out.println("şeker ister misiniz. \nEvet \nHayır");
            String sekerSorusu = input.next();
            if (sekerSorusu.equalsIgnoreCase("evet")) {
                System.out.println("kaç şeker istersiniz.");
                int sekerSayısı = input.nextInt();
                System.out.println(sekerSayısı + " şeker ekleniyor");
            } else if (sutSorusu.equalsIgnoreCase("hayır")) {
                System.out.println("şeker eklenmiyor");
                break;
            } else {
                System.out.println("hatalı bir giriş yaptınız");
            }
            System.out.println("kahvenizi hangi boyutta istersiniz. \n küçük \n orta \n büyük");
            String boyut = input.next();
            if (boyut.equalsIgnoreCase("büyük")) {
                System.out.println("kahveniz " + boyut + " boy hazırlanıyor");
            } else if (boyut.equalsIgnoreCase("orta")) {
                System.out.println("kahveniz " + boyut + " boy hazırlanıyor");
            } else if (boyut.equalsIgnoreCase("küçük")) {
                System.out.println("kahveniz " + boyut + " boy hazırlanıyor");
            } else {
                System.out.println("hatalı bir giriş yaptınız");
            }
            System.out.println(kahveCesidi + " " + boyut + " boy hazırdır");
            break;
        }
    }
}