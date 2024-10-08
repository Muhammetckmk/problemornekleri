package alıştırma;

import java.lang.reflect.Array;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        String[] meyve={"elma","armut", "muz"};

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


        return totalSparis;
    }
}
