package loops;

import java.util.Scanner;

public class ucgenAlanı {
    public static void main(String[] args) {
        //  Üçgen Alanı Hesaplama: Kullanıcıdan taban ve yükseklik al
        //          ve üçgenin alanını hesapla. Kullanıcı "exit" girene kadar devam et.

        Scanner input = new Scanner(System.in);


        String cıkıs= "";
        do {
            System.out.println( "alanını hesaplamak istediğiniz üçgenin yükseklik ve tabanını giriniz");
            System.out.println("yükseklik: ");
            int yuksekluk= input.nextInt();
            System.out.println("taban : ");
            int taban= input.nextInt();
            System.out.println(yuksekluk*taban/2);

            System.out.println("döngüden çıkmak için x tuşuna basınız. çıkmak istemiyorsanız enter a basınız");
            String islem = input.next();
        }while(cıkıs.equalsIgnoreCase("x"));
    }
}
