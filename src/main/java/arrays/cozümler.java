package arrays;

import java.util.Arrays;

public class cozümler {
    public static void main(String[] args) {
//        1. Bir Dizideki Elemanların Toplamını Bulma

        int[] sayılar= {3,6,12,66,0,3,3,5,64,51};

        int sum=0;
        for (int w: sayılar){
            sum+=w;
        }
        System.out.println(sum);


//
//        2. Bir Dizideki En Büyük Elemanı Bulma

        int  enbuyuk= sayılar[0];

        for (int w: sayılar){
            if (enbuyuk<w){
                enbuyuk=w;
            }
        }
        System.out.println(enbuyuk);




//
//        3. Diziyi Ters Çevirme

        int [] tersi = new int[sayılar.length];

        for (int w=sayılar.length-1; w>=0; w--){
           tersi[w]= sayılar[sayılar.length-1-w] ;


        }
        System.out.println(Arrays.toString(sayılar));
        System.out.println(Arrays.toString(tersi));

//


        System.out.println("---------------");
//        4. Bir Dizide Belirli Bir Elemanın Bulunup Bulunmadığını Kontrol Etme

        for (int w:sayılar){
            if (w==13){
                System.out.println("True : " +w);
            }
        }
//
//        5. Dizideki Elemanları Küçükten Büyüğe Sıralama (Bubble Sort)

        Arrays.sort(sayılar);
        System.out.println("sıralı : " +Arrays.toString(sayılar));


//          int[] sayılar= {0, 3, 3, 3, 5, 6, 12, 51, 64, 66};
        System.out.println("----------------");
//        6. Bir dizideki her elemanın kaç kez tekrarlandığını bulan bir program yazın.
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
//
//        7   Verilen iki diziyi birleştirip üçüncü bir diziye ekleyen ve bu dizideki elemanları sıralayan bir program yazın.

        int [] num1= {1,9,6,66,31,46};
        int [] num2= {11,96,10,66,3,4};
        int [] num3=new int[num1.length+num2.length];
        int i=0;
        for (int w:num1){
            num3[i]=w;
            i++;
        }
        for (int w:num2){
            num3[i]=w;
            i++;
        }
        System.out.println(Arrays.toString(num3));
        Arrays.sort(num3);
        System.out.println(Arrays.toString(num3));

//
//        8 Bir dizideki en küçük ikinci elemanı bulan bir program yazın.

        System.out.println(num3[0]+" " +num3[1]);
//
//        int[] numbers = {10, 5, 3, 9, 6, 8};
//
//        9 Verilen bir dizideki çift ve tek sayıları iki ayrı diziye ayıran bir program yazın.
            int[] numbers = {1, 2, 3, 4, 5, 6};
            int[] tek=new int[3];
            int[] cift=new int[3];
            int index=0;
            int index2=0;
            for (int w:numbers){
                if (w%2==1){
                    tek[index]=w;
                    index++;
                }else{
                    cift[index2]=w;
                    index2++;
                }

            }
        System.out.println(Arrays.toString(tek));
        System.out.println(Arrays.toString(cift));


//
//        10. Bir dizide tekrarlanan elemanları bulan bir program yazın.
        int[] numberss = {1, 2, 3, 2, 4, 6,8,8,8, 3, 6};
        int [] numss = new int[numberss.length];
        int bos=0;
        int indexx=0;
        for (int i1 = 0; i1 < numberss.length; i1++) {
            if (bos!=i1){
                bos=i1;
                numss[indexx]=bos;

            }else{
                continue;
            }
            indexx++;
        }
        System.out.println(Arrays.toString(numss));


    }
}
