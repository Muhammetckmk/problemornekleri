package OrnekProblemler;

import java.util.Arrays;

public class sd {
    public static void main(String[] args) {
       // 5 elemanli notes adinda, int bir arrray olusturunuz ve console’a yazdiriniz

        int[] notes = new int[6];
        notes[1] = 32;
        notes[2] = 45;
        notes[3] = 1;
        notes[4] = 56;
        notes[5] = 99;
        System.out.println(Arrays.toString(notes));


        //ornek 2: 10 elemanli integers adinda, Integer bir array olusturunuz ve console’a yazdiriniz
        //Array’ler de non primitive (reference) veri tipleri de saklanabilir.

        Integer[] integer = new Integer[10];
        System.out.println(Arrays.toString(integer));


        System.out.println("----------------");

        //ornek 3: 3 elemanli names adinda, String bir array olusturunuz ve console’a yazdiriniz

        String [] name = new String[3];
        name[0]= "ali can";
        name[1]= "veli can";
        name[2]= "ömer can";
        System.out.println(Arrays.toString(name));

        int sum =0;
        for (int i=0; i<name.length; i++){

            sum= sum + name[i].length();
        }
        System.out.println(sum);


        // Ornek 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        // icerdigi karakter sayilari toplamini ekrana yazdirin.
        // Example 1: Create a String array, add 5 elements to it, all elements have
        // display the sum of the number of characters it contains.








        // . 2. yol for each loop(enhanced - geliştirilmiş loop)

        //for-each loop, Array, yani coklu veri iceren yapilarda kullanilir.
        //for loop’taki baslangic, bitis, artirma, azaltma olaylarini dusunmeyiz
        //variable ismi olarak da genel kabul w’nun kullanilmasidir.

        /*        for (Datatype variable : array yada collections){
            calisacak kodlar
        }*/
        System.out.println("----------");
        System.out.println("----------");
        int toplam=0;
        for (String w : name) {
            toplam= toplam+ w.length();

        }
        System.out.println(toplam);


    }
}
