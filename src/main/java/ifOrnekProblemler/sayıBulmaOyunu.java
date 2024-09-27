package ifOrnekProblemler;

import java.util.Random;
import java.util.Scanner;

public class sayıBulmaOyunu {
    public static void main(String[] args) {
        //Ornek 1: 0-100 arasi sayi tahmin etme oyununu do-while ile yaziniz.

        Scanner input = new Scanner(System.in);

        Random random = new Random();

        int rastgele = random.nextInt(101);

        int tahminEdilen ;
        int girisSayısı= 0;

        boolean değişken= false;

        do {
            System.out.println("0-100 arası bir sayı tahmin ediniz");
            tahminEdilen= input.nextInt();
            girisSayısı++;
            if  (tahminEdilen>rastgele){
                System.out.println("hatalı giriş.. sayı daha küçük");
                System.out.println((girisSayısı+1) + ".   deneme");
            } else if (tahminEdilen<rastgele) {
                System.out.println("hatalı giriş . . sayı daha büyük");
                System.out.println((girisSayısı+1) + ".   deneme");

            }else if(değişken =true){
                System.out.println("tebrikler..." + (girisSayısı +1) + ".   denemede doğru bildiniz");


            }


        }while (!değişken);


    }
}
