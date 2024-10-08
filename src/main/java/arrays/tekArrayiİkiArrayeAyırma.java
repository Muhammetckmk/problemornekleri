package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class tekArrayiİkiArrayeAyırma {
    public static void main(String[] args) {
       // Verilen bir dizideki çift ve tek sayıları iki ayrı diziye ayıran bir program yazın.

        int[] numbers = {1, 2, 3, 4, 5, 6};
        ArrayList<Integer> tek = new ArrayList<>();
        ArrayList<Integer> cift = new  ArrayList<>();



        for (int w:numbers){
            if (w%2==1){
                tek.add(w);

            }else{
                cift.add(w);

            }

        }
        System.out.println(tek);
        System.out.println(cift);
    }
}
