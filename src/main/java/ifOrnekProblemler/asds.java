package ifOrnekProblemler;

import java.util.Scanner;

public class asds {
    public static void main(String[] args) {

        //Ornek 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //String tv = “$456.99”;  String laptop = “$875.99"; ==> 456.99 + 875.99 = 1332.98

        String tv="$456.99";
        String laptop="$875.99";

        tv=tv.replace("$","");
        laptop=laptop.replace("$","");
        System.out.println(tv);
        System.out.println(laptop);

        Double tv1=Double.valueOf(tv);
        Double laptop1= Double.valueOf(laptop);
        System.out.println(tv1+laptop1);

        String abc= String.valueOf(laptop1);
        String abcd= String.valueOf(tv1);
        System.out.println((abc+abcd));

        //Ornek 2: Kullanici isminin ilk harflerini alip buyuk hale getirerek console'a yazdiriniz.
        //           "   ali cAN   " ==> AC

        //trim() metodu bir String’deki bastaki ve sondaki bosluklari siler. Aradakileri silmez
        //split() String’i istediginiz karakterden parcalamaya yarar.
        //Not: Bir satirda, birden fazla methodu yanyana kullanirsaniz buna “method chain (zincir)” denir


                String y = "yusuf";
                String bos1 = "";

                for (int i = 0; i < y.length(); i++) {
                    char ch1 = y.charAt(i);

                    // Eğer karakter bos1 içinde yoksa ekle (sadece ilk kez karşılaşıldığında eklenir)
                    if (bos1.indexOf(ch1) == -1) {
                        bos1 += ch1;  // Karakteri tekrarsız string'e ekle
                    }
                }

                System.out.println("Tekrarsız = " + bos1);  // Çıktı "yusf"




    }
}
