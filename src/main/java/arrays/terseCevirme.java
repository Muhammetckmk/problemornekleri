package arrays;

import java.util.Arrays;

public class terseCevirme {
    public static void main(String[] args) {
       // Diziyi Ters Çevirme

        int[] sayılar= {3,6,12,66,0,3,3,5,64,51};


        int [] tersi = new int[sayılar.length];

        for (int w=sayılar.length-1; w>=0; w--){
            tersi[w]= sayılar[sayılar.length-1-w] ;


        }
        System.out.println(Arrays.toString(sayılar));
        System.out.println(Arrays.toString(tersi));
    }
}
