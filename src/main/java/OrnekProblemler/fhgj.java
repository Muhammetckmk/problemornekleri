package OrnekProblemler;

import java.util.Random;
import java.util.Scanner;

public class fhgj {
    public static void main(String[] args) {

        //Ornek 1: 0-100 arasi sayi tahmin etme oyununu do-while ile yaziniz.

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int rastgeleSayı=random.nextInt(101);

        int denemeSayısı = 0;

        int tahminEdilen;


        System.out.println("0 ile 100 arasında bir sayı giriniz");
        do {
           tahminEdilen=input.nextInt();
            denemeSayısı++;

            if (tahminEdilen == rastgeleSayı){
                System.out.println("Tebribkler");
                System.out.println(denemeSayısı + ".  deneme");
                break;

            }else if (tahminEdilen<rastgeleSayı){
                System.out.println("sayı daha büyük");
                System.out.println(denemeSayısı + ".  deneme");
            } else {
                System.out.println(" sayı daha küçük");
                System.out.println(denemeSayısı + ".  deneme");
            }



        }while (denemeSayısı<5);



    }
}
