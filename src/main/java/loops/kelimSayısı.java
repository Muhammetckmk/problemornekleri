package loops;

import java.util.Scanner;

public class kelimSayısı {
    public static void main(String[] args) {
        // 11.Kelime Sayısı Bulma: Kullanıcıdan bir cümle al ve bu cümledeki kelime sayısını hesapla.
        Scanner input= new Scanner(System.in);
        System.out.println("bir cümle yazınız");
        String cumle= input.nextLine();
        cumle.trim();
        int sayı= 0;
        boolean kelimevarmı= false;

        for (int i=0; i<cumle.length(); i++){
            if (cumle.charAt(i)== ' '){
                sayı+= 1;
            }
        }
        System.out.println(sayı+1);


    }
}
