package alıştırma;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class soru {
    public static void main(String[] args) {
       /*

Project: Bir siteye üye olma ve giriş yapma sayfası tasarlayınız.

         menü: kullanıcıya işlem seçimi için menü gösterilir.

         üye olma(register): kullanıcıdan ad-soyad, email ve şifre bilgileri alınız.
                             email ve şifre birer listede tutulur.
                             aynı email kabul edilmez.

         giriş(login): email ve şifre girilir.
                       email bulunamazsa kayıtlı değil, üye olun uyarısı verilir.
                       email ile aynı indekste kayıtlı şifre doğrulanırsa siteye giriş yapılır.

         email validation: boşluk içermemeli
                         : @ içermeli
                         : gmail.com,hotmail.com veya yahoo.com ile bitmeli.
                         : mailin kullanıcı adı kısmında(@ den önce) sadece büyük-küçük harf,rakam yada -._ sembolleri olabilir.

         password validation: boşluk içermemeli
                            : en az 6 karakter olmalı
                            : en az bir tane küçük harf içermeli
                            : en az bir tane büyük harf içermeli
                            : en az bir tane rakam içermeli
                            : en az bir tane sembol içermeli
 */

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen mail adresinizi giriniz");
        String email=input.nextLine();

        boolean kontrol= email.split("@")[0].contains(" ")||email.split("@")[0].contains("[a-z]")||email.split("@")[0].contains("[A-Z]")||
                email.split("@")[0].contains("[1-9]");
        boolean etsonrası= email.split("@")[1].contains("gmail.com")||email.split("@")[1].contains("hotmail.com")||
                email.split("@")[1].contains("yahoo.com");
        if (email.trim().contains(" ")){
            System.out.println("email adresi boşluk karekeri içermemeli");
        } else if (!email.contains("@")) {
            System.out.println("email adresinde @ işareti kullanmalısınız");
        } else if (!etsonrası) {
            System.out.println("mailiniz gmail.com, hotmail.com veya yahoo.com ile bitmelidir");
        }else if (!kontrol){
            System.out.println("mailinizde en az bir nüyük har, bir küçük harf bir de ramakm olmalıdır");
        }


        //System.out.println("lütfen şifrenizi giriniz");
       // String sifre= input.nextLine();
    }
}
