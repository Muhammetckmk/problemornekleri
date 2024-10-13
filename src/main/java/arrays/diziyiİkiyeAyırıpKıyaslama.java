package arrays;

import java.util.ArrayList;

public class diziyiİkiyeAyırıpKıyaslama {
    public static void main(String[] args) {

      // Dizinin İlk Yarısını ve İkinci Yarısını Karşılaştırma: Bir tamsayı dizisinin ilk yarısının
      // toplamını ve ikinci yarısının toplamını karşılaştıran bir metot yazın. Hangi yarının daha
      // büyük olduğunu belirleyin.

        int [] list= {5,9,100,13,60,53,45,6,0,1};
        ArrayList<Integer> ilkYarı= new ArrayList<>();
        ArrayList<Integer> sonYarı= new ArrayList<>();

        for (int i = 0; i <list.length ; i++) {
            if (i<list.length/2){
                ilkYarı.add(list[i]);
            }else if(i<list.length) {
                sonYarı.add(list[i]);
            }
        }

        System.out.println("ilkYarı = " + ilkYarı);
        System.out.println("sonYarı = " + sonYarı);

        int sumilk= 0;
        int sumson= 0;
        for (int w:ilkYarı){
            sumilk+=w;
        }
        for (int w:sonYarı){
            sumson+=w;
        }
        if (sumilk>sumson){
            System.out.println("ilk yarı daha büyük");
        } else if (sumilk<sumson) {
            System.out.println("ikinci yarı daha büyük");
        } else  {
            System.out.println("iki yarı da eşit");
        }


    }
}
