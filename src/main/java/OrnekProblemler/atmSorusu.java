package OrnekProblemler;

import java.util.Scanner;

public class atmSorusu {
    public static void main(String[] args) {

        /*Bir ATM programı yazın. Kullanıcıya 4 seçenek sunulsun: Para Çekme, Para Yatırma, Bakiye Sorgulama, Çıkış.
         Kullanıcı bu işlemlerden birini seçer ve program işlemi
        gerçekleştirir. Başlangıçta kullanıcının hesabında 1000 TL
        bulunur.
                Problem Açıklaması:
        • Kullanıcıya seçenekler sunulur:
        *Para Çekme
        *Para Yatırma
        *Bakiye Sorgulama
        * Çıkış

        Kullanıcı işlem yapabilir ve bakiye güncellenir.
        • Kullanıcı çıkış seçeneğini seçene kadar işlemler devam eder.
        */
        Scanner input = new Scanner(System.in);
        double bakiye =1000;

        System.out.println("lütfen yapmak istediğiniz işlemi giriniz. \n para çekme : - \n para yatırma :+ \n bakiye sorgulama için: ? \n çıkış için :x");

        char islem= input.next().toLowerCase().charAt(0);

        switch (islem){
            case '-':
                System.out.println("çekmek istediğiniz tutarı giriniz");
                System.out.println("yeni bakiye = " + (bakiye - input.nextDouble()));
                break;
            case '+':
                System.out.println("eklemek istediğiniz tutarı giriniz");
                System.out.println("yeni bakiye = " + (bakiye + input.nextDouble()));
                break;
            case '?':

                System.out.println("yeni bakiye = " + (bakiye));
                break;
            case 'x':

                System.out.println("şuanda çıkış yapmış bulunmaktasınız");
                break;

        }


    }
}
