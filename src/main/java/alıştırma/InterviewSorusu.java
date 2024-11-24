package alıştırma;

import java.util.*;

public class InterviewSorusu {
   // Kullanıcıdan bir pozitif tamsayı alın.
   // Bu sayıya kadar olan sayılardan asal sayıları bulmak için bir döngü kullanın.
   // Bulduğunuz asal sayıları bir diziye veya listeye kaydedin.
   // Programın sonunda, asal sayıları ve toplam asal sayı miktarını yazdırın.
   // Ek olarak, asal sayılar arasındaki en büyük asal sayıyı da belirleyin ve yazdırın.
   public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       System.out.println("Lütfen bir pozitif tam sayı giriniz");
       int sayi=input.nextInt();

       if (sayi>=2) {
       asalSayı(sayi);

       } else if(sayi==1){
           System.out.println("1 asal sayı değildir");
       }else {
           System.out.println("Lütfen geçerli bir sayı giriniz");
       }




   }

  public static void asalSayı(int sayi){

      List<Integer> asalSayı=new LinkedList<>();

       int sayac=0;

      for (int i = 2; i <=sayi ; i++) { //kullanıcıdan alınan sayıya kadar olan sayılar

          for (int j = 2; j <i ; j++) { //sayıların çarpanlarının kontrolü

              if (i%j==0){
               sayac++;
              }
          }

           if ( i==2||sayac==0){
                asalSayı.add(i);

          }

          sayac=0;
      }

      System.out.println(asalSayı);

      System.out.println(sayi +" sayısına kadar " + asalSayı.size() +" adet asal sayı vardır");

      System.out.println("Bu asal sayılar arasında en büyük asal sayı : " + asalSayı.get(asalSayı.size()-1));
  }



}
