package arrays;

import java.util.Arrays;

public class kacKezTekrarEtmiş {
    public static void main(String[] args) {
       // Bir dizideki her elemanın kaç kez tekrarlandığını bulan bir program yazın.
        int[] sayılar= {3,6,12,66,0,3,3,5,64,51};

        Arrays.sort(sayılar);
        System.out.println("sıralı : " +Arrays.toString(sayılar));


        int sayac =1;

        for (int i= 1; i<sayılar.length; i++){
            if (sayılar[i]== sayılar[i-1]){
                sayac++;

            }else {
                System.out.println(sayılar[i - 1] + " elemanı " + sayac + " kez tekrarlandı.");
                sayac = 1;
            }
        }
        System.out.println(sayılar[sayılar.length - 1] + " elemanı " + sayac + " kez tekrarlandı.");
    }
}
