package Deneme;

import java.util.Scanner;

public class sayılarınToplamı {
    public static void main(String[] args) {
        /*Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
         */
        Scanner input = new Scanner(System.in);

       int toplam =0;
        for (int i = 0; i <5 ; i++) {
            System.out.println("lütfen 1 adet sayı giriniz");
            int num= input.nextInt();
            if (num>5&&num<10) {
                continue;
            }else {
            toplam+=num;
            }

        }
        System.out.println("toplam = " + toplam);

        }
    }

