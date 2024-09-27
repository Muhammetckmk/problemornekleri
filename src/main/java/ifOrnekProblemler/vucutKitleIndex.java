package ifOrnekProblemler;

import java.util.Scanner;

public class vucutKitleIndex {
    public static void main(String[] args) {

         /* BMI (Vücut Kitle İndeksi) Hesaplama: Kullanıcının kilo (kg) ve boy (metre) bilgilerine göre
         BMI'ini hesaplayın ve BMI değerine göre kullanıcının
            "Zayıf" (<18.5),
            "Normal" (18.5-24.9),
            "Kilolu" (25-29.9) ya da
            "Obez" (>=30) olduğunu yazdırın.
            vücut kiyle indeksi =kilo  / (uzunluk ** uzunluk) =>uzunluk metre cinsinde
         */

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen kilonuzu giriniz");
        double kilo= input.nextDouble();
        System.out.println("lütfen boyunuzu metre cinsinde yazınız");
        double boy= input.nextDouble();

        if (kilo/ (boy*boy)<18.6){
            System.out.println("zayıf");
        }else if (kilo/ (boy*boy)<25){
            System.out.println("normal");
        }else if (kilo/ (boy*boy)<30){
            System.out.println("kilolu");
        }else if (kilo/ (boy*boy)>=30){
            System.out.println("obez");
        }
    }
}
