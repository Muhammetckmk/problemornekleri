package ifOrnekProblemler;

import java.util.Scanner;

public class dowhileŞifreSorusu {
    public static void main(String[] args) {

        /*Ornek 1:
       Gecerli Username="admin" ve Password="pwd123" dur.
       Kullanicidan username ve password'u alin.
       Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
       Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin.
       Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz.

*/

        Scanner input = new Scanner(System.in);




        /*int tekrar =0;
        while (tekrar<5){
            if (tekrar==4){
                System.out.println("hesabınız bloke olmuştur");
                break;
            }
            System.out.println("lütfen username giriniz");
            String userName =input.next();
            System.out.println("lütfen şifrenizi giriniz");
            String password = input.next();

            if (userName.equals("Muhammet") && password.equals("mnc4651")) {
                System.out.println("hesabınıza hoş geldiniz");
                break;

            }else{
                System.out.println("giriş bilgilerini hatalı girdiniz");
                System.out.println((3- tekrar) + "  hakkınız kaldı");
            }


            tekrar++;


        }*/

        int tekrar =0;
        do {

            if (tekrar==4){
                System.out.println("hesabınız bloke olmuştur");
                break;
            }
            System.out.println("lütfen username giriniz");
            String userName =input.next();
            System.out.println("lütfen şifrenizi giriniz");
            String password = input.next();

            if (userName.equals("Muhammet") && password.equals("mnc4651")) {
                System.out.println("hesabınıza hoş geldiniz");
                break;

            }else{
                System.out.println("giriş bilgilerini hatalı girdiniz");
                System.out.println((3- tekrar) + "  hakkınız kaldı");
            }


            tekrar++;




        }while (true);


        }

    }

