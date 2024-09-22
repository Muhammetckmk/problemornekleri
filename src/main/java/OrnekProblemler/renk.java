package OrnekProblemler;

import java.util.Scanner;

public class renk {
    public static void main(String[] args) {
              /*  1. Renk Karışımı
                Bir program yazın, kullanıcı iki temel renk seçsin (Kırmızı, Mavi, Sarı) ve program bu iki rengin karışımını ekrana yazsın.
                Örneğin, kırmızı ve mavi karıştığında mor, kırmızı ve sarı karıştığında turuncu gibi.
                        Problem Açıklaması:
        ·
        • Kullanıcı iki renk girecek.
        • Program bu iki rengin karışımını hesaplayacak.
        • Eğer geçerli olmayan bir renk
                girilirse hata mesajı girecek*/

        Scanner input= new Scanner(System.in);
        System.out.println("lütfen karışımını görmek istediğiniz iki rengi yazınız.\n kırmızı \n mavi \n sarı");
        String renk1= input.next();
        String renk2= input.next();


        if ((renk1.toLowerCase().equals("sarı")&& renk2.toLowerCase().equals("mavi"))|| (renk1.toLowerCase().equals("mavi")&& renk2.toLowerCase().equals("sarı"))){

            System.out.println("sarı + mavi = yeşil");

        }else if ((renk1.toLowerCase().equals("sarı")&& renk2.toLowerCase().equals("kırmızı"))|| (renk1.toLowerCase().equals("kırmızı")&& renk2.toLowerCase().equals("sarı"))){

            System.out.println("sarı + kırmızı = turuncu");

        }else if ((renk1.toLowerCase().equals("kırmızı")&& renk2.toLowerCase().equals("mavi"))|| (renk1.toLowerCase().equals("mavi")&& renk2.toLowerCase().equals("kırmızı"))){

            System.out.println("kırmızı + mavi = mor");

        } else {
            System.out.println("lütfen geçerli bir renk giriniz");
        }
        System.out.println("----------");





    }
}
