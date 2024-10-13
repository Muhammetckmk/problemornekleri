package alıştırma;

import java.lang.reflect.Array;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {

      /*  String[] meyve={"elma","armut", "muz"};

        System.out.println(Arrays.toString(meyve));

        int[][] sayı= {{10, 12, 15, 14, 13, 12, 11},
                {5, 6, 4, 7, 8, 9, 6},
                {7, 9, 8, 6, 5, 8, 7},
                {15, 20, 18, 25, 30, 22, 19}};
        int a=siparis(new int[][] {{10, 12, 15, 14, 13, 12, 11},
                {5, 6, 4, 7, 8, 9, 6},
                {7, 9, 8, 6, 5, 8, 7},
                {15, 20, 18, 25, 30, 22, 19}} );

        System.out.println(a);

    }

    public static int siparis(int[][] ...a ) {
        String enPopulerürün="";
        int totalSparis=0;

        for (int i=0; i<a.length; i++){
            int toplamSipariş=0;

            for (int j = 0; j <a[i].length ; j++) {



            }
            System.out.println(toplamSipariş);

            if (toplamSipariş>totalSparis){
                totalSparis=toplamSipariş;

            }
        }
        System.out.println("en çok tercih edilen ürün = "+ enPopulerürün +" => " +totalSparis +" kez tercih edilmiştir");


        return totalSparis;*/

       /*
        Asagidaki multi dimensional array'in
        ic array'lerindeki tum elemanlarin toplamini birer birer bulan
        ve herbir sonucu yeni bir array'in elemani yapan
        ve yeni array'i ekrana yazdiran bir program yaziniz
        Ornek; {{1,2,3}, {4,5}, {6, 7} } ==> 1 + 2 + 3 = 6 4+5=9 6+7=13 ==> output: (6, 9, 13)
        */

        int[][] list= {{1,2,3}, {4,5}, {6, 7}};
        int sum=0;
        int a=0;

        int[] yeni= new int[list.length];
        for (int[] i: list) {
            sum-=sum;
            for (int j:i){

                sum+=j;

            }
            yeni[a]=sum;

            a++;

        } System.out.println("yeni= " + Arrays.toString(yeni));





    }
}









