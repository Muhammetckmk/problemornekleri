package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C01_InterviewQuestion {
    public static void main(String[] args) {


/*Bir metin içinde kullanıcıdan alınan bir kelimenin kaç kez geçtiğini sayan bir
Java metodu yazın. Metin büyük/küçük harf duyarlı olmamalıdır. Örnek girdi olarak
'Java, Java, and java!' verildiğinde kullanıcı java girerse, çıktı olarak 3 verilmelidir
 */
String str= "Java, Java, and java!";

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen aramak istediğiniz kelimeyi giriniz");
        String word= input.next();

     //   countWordOccurences(str,word);
        splitWithOccurences(str,word);


    }

    private static void countWordOccurences(String cümle, String arananKelime) {
cümle= cümle.toLowerCase();
arananKelime=arananKelime.toLowerCase();
int count=0;
int index=0;

while (((index=cümle.indexOf(arananKelime,index))!=-1)){
    count++;
    index+=arananKelime.length();
}

        System.out.println("Bu kelimeden toplam : "+count+" tane kullanılmıştır.");
    }


    //split ile yapsaydık
    public static void splitWithOccurences(String cumle, String arananKelime){
        cumle=cumle.toLowerCase().replaceAll("[^a-z ]","");
        arananKelime=arananKelime.toLowerCase();

                 String arr[]= cumle.split(" ");
                System.out.println("arr : " + Arrays.toString(arr));
                // System.out.println("arr.length = " + arr.length);


        int sayac=0;
        for (String a: arr){
            if (a.equals(arananKelime)){
                sayac++;
            }
        }
        System.out.println("Bu kelimeden toplam : "+sayac+" tane kullanılmıştır.");


    }

}
