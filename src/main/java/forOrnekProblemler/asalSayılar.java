package forOrnekProblemler;

import java.util.Scanner;

public class asalSayılar {
    public static void main(String[] args) {

        /* **Asal Sayıları Bulma**:
        Kullanıcıdan bir tam sayı al ve bu sayıya kadar olan asal sayıları bul.*/

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int sayı= input.nextInt();

        System.out.println(sayı + " sayısına kadar olan asal sayılar:");
        for (int i = 2; i <= sayı; i++) {
            boolean asal=true;

            for (int j = 2; j <i ; j++) {

                if (i % j ==0){
                    asal =false;
                    break;
                }
            }
            if (asal){
                System.out.println(sayı + " ");
            }



        }
    }
}
