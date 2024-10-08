package loops;

import java.util.Scanner;

public class bankaHesabı {
    public static void main(String[] args) {
        /*Kullaniciya giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
        Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
                Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,

                Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis.

                Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
        Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.

                Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
   */
        Scanner input = new Scanner(System.in);

        long kartNoo=1234567891234567L;
        String ilksifre="123asd";
        int bakiye=1000;
        long kartNo;
        String sifre;
        boolean döngü=true;
        do {

               System.out.println("lütfen kart numaranızı giriniz");

               kartNo = input.nextLong();
               System.out.println("lütfen şifrenizi giriniz");
               sifre = input.next();
               String bos = input.nextLine();

            do {
               if (kartNo == kartNoo && sifre.equals(ilksifre)) {
                   System.out.println("yapmak istediğiniz işlemi yazınız. \n bakiye sorgulama\n para çekme\n par yatırma\n transfer\nşifre değişimi\nÇıkış");
                   String islem = input.nextLine();

                   if (islem.equalsIgnoreCase("para çekme")) {
                       System.out.println("lütfen çekmek istediğiniz tutarı giriniz");
                       int çekim = input.nextInt();

                       if (çekim <= bakiye) {
                           System.out.println("para çekme işleminiz gerçekleşmiştir. yeni bakiyeniz = " + (bakiye - çekim) + "TL dir");

                       } else {
                           System.out.println("çekmek istediğiniz tutar bakiyenizden büyük olamaz. mevcut bakiyeniz = " + bakiye + "TL dir");
                       }

                   } else if (islem.equalsIgnoreCase("bakiye sorgulama")) {
                       System.out.println("mevcut bakiyeniz " + bakiye + "TL dir");

                   } else if (islem.equalsIgnoreCase("para yatırma")) {
                       System.out.println("Lütfen yatırmak istediğiniz tutarı giriniz ve paranızı yatırınız");
                       int yatırma = input.nextInt();
                       System.out.println(" para yatırma işleminiz başarı ile gerçekleşmiştir. Güncel bakiyeniz = " + (bakiye + yatırma) + "TL dir");
                   } else if (islem.equalsIgnoreCase("transfer")) {
                       System.out.println("para göndermek istediğiniz İBAN numarasını giriniz");
                       String iban = input.nextLine();


                       if (iban.trim().replaceAll("\\s", "").length() == 28 && iban.startsWith("TR")) {
                           System.out.println("göndermek istediğiniz tutarı giriniz");
                           int gönderme = input.nextInt();
                           if (gönderme <= bakiye) {
                               System.out.println("para çekme işleminiz gerçekleşmiştir. yeni bakiyeniz = " + (bakiye - gönderme) + "TL dir");
                           } else {
                               System.out.println("göndermek istediğiniz tutar bakiyenizden büyük olamaz. mevcut bakiyeniz = " + bakiye + "TL dir");
                           }

                       } else {

                           System.out.println("lütfen geçerli bir İBAN giriniz");

                       }
                       break;


                   } else if (islem.equalsIgnoreCase("şifre değişimi")) {
                       System.out.println("mevcut şifrenizi giriniz");
                       String mevSifre = input.next();

                       if (mevSifre.equalsIgnoreCase(ilksifre)) {

                           System.out.println("oluşturmak istediğiniz şifreyi giriniz");
                           String yeniSifre = input.next();
                           System.out.println("şifreniz başarı ile feğiştirilmiştir");
                       } else {
                           System.out.println("şifreyi yanlış girdiniz. ");
                       }


                   } else if (islem.equalsIgnoreCase("çıkış")) {
                       boolean a = true;
                   } else {
                       System.out.println("lütfen geçerli bir işlem giriniz");
                   }


                   break;
               } else {
                   System.out.println("lütfen bilgilerinizi kontrol edip tekrar deneyiniz");
               }
                break;
           }while (true);
        }while(kartNo != kartNoo && !sifre.equals(ilksifre));


    }
}
