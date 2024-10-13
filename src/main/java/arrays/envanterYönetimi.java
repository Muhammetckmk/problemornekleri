package arrays;

import java.util.Arrays;

public class envanterYönetimi {
    public static void main(String[] args) {
//
      //  ----Envanter Yönetimi----
      //  Bir mağaza, haftalık ürün stoklarını kontrol etmek için bir dizi kullanıyor. Aşağıdaki ürünlerin
      //  stokları hafta boyunca şu şekilde değişmiştir:
//
//
      //  Televizyon: 30, 28, 25, 23, 20, 18, 15
      //  Buzdolabı: 10, 9, 8, 7, 6, 5, 4
      //  Bilgisayar: 20, 18, 17, 16, 14, 13, 12
      //  Çamaşır Makinesi: 5, 4, 3, 2, 1, 0, 0
      //  Her ürünün ne zaman stoklarının sıfırlandığını bulmanız gerekiyor.
//
      //  Problem: Hangi ürünün stoku ilk önce sıfıra düşüyor? Hangi gün sıfıra düşüyor?

       int []  televizyon     = {30, 28, 25, 23, 20, 18, 15};
       int []  buzdolabı      = {10, 9, 8, 7, 6, 5, 4};
        int [] bilgisayar     = {20, 18, 17, 16, 14, 13, 12};
       int[]   çamaşırmakinesi={ 5, 4, 3, 2, 1, 0, 0};

       int[][] ürün={televizyon,buzdolabı, bilgisayar, çamaşırmakinesi};
        System.out.println(Arrays.deepToString(ürün));

        String [] ürünİsmi={"televizyon",
                "buzdolabı",
                "bilgisayar",
                "çamaşırmakinesi"};

        int kontrol=0;
        for (int[] i : ürün) {
            int[] a= new int[i.length];
            for (int j = 0; j <i.length ; j++) {

            if (a[j]==0){
                System.out.println( "ürün sıfırlandı");
            }
        }
        }


    }
}
