package alıştırma;


import java.util.Scanner;

public class asdas {
    public static void main(String[] args) {

/*
        Kullaniciya giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
        Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
                Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,

                Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis.

                Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
        Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.
                Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,*/

        Scanner input = new Scanner(System.in);
         int bakiye=1000;
        boolean secenekk=true;

        do {
          do {
              System.out.println("lütfen kart numaranızı giriniz");
              String kartNo= input.nextLine();
              System.out.println("lütfen kart şifrenizi giriniz");
              String kartSifre= input.nextLine();

              if (!kartNo.equals("1234 5678 9123 4567")&& !kartSifre.equals("123asd")  ){
                  System.out.println(input + "hatalı girdiniz lütfen tekrar deneyiniz");
              }

          }while (!secenekk);
            System.out.println("lütfen yapmak istediğiniz işlemi seçiniz. \n Bakiye sorgula: ? \n para yatirma :+ \n para çekme: -\n para gönderme : > \n sifre değiştirme: ** \n cikis : x");
            String secenek=input.next();
            if (secenek == "?") {

                System.out.println("Bakiyeniz " + bakiye + " TL dir");
            } else if (secenek== ">") {
                System.out.println("lütfen İban numaranızı giriniz");
                String iban = input.nextLine();
                if (iban.startsWith("TR")&& iban.length()==26){
                    System.out.println("göndermek istediğiniz tutarı giriniz");
                    int gönder= input.nextInt();
                    System.out.println("para gönderilmiştir. Yeni bakiyeniz " + (bakiye-gönder)+ "TL dir" );

                }

            } else if (secenek=="-") {
                System.out.println("çekmek istediğiniz tutarı giriniz");
                int cekmek= input.nextInt();
                if (cekmek>bakiye){
                    System.out.println("çekmek istediğiniz miktar bakiyenizden fazla olmamalı");
                }else {
                    System.out.println("Ynei bakiyeniz "+ (bakiye-cekmek) + " TL dir");
                }


            } else if (secenek=="+") {
                System.out.println("yatırmak istediğiniz tutarı giriniz");
                int yatırmak= input.nextInt();

                    System.out.println("Bakiyeniz "+ (bakiye+yatırmak) + " TL dir");

            } else if (secenek=="**") {

                    System.out.println("yeni şifrenizi giriniz");
                    String yeniSifre= input.nextLine();
                System.out.println("şifreniz değiştirilmiştir. yeni şifreniz =  " + yeniSifre);

            } else if (secenek.equalsIgnoreCase("x")) {

                    System.out.println("çıkış yaptınız.");
                    System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz");
            }

        }while(secenekk==true);

    }
}
