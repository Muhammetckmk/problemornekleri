package arrays;

public class calıskanÖgrenci {
    public static void main(String[] args) {
        //   Sınıftaki En Çalışkan Öğrenciyi Bulma
        //   Bir öğretmen, öğrencilerinin son 5 sınavdaki notlarını bir dizide tutuyor. Öğrencilerin adları ve notları şu şekildedir:

        //   Ahmet: 70, 85, 90, 75, 80
        //   Ayşe: 60, 70, 65, 85, 90
        //   Mehmet: 95, 90, 85, 80, 95
        //   Elif: 50, 60, 55, 65, 70
        //   Her öğrencinin sınav ortalamasını hesaplayıp en yüksek ortalamaya sahip olan öğrenciyi bulmanız gerekiyor.

        //           Problem: En çalışkan öğrenciyi ve ortalama puanını bulacak bir program yazın.

        int [] ahmet= { 70, 85, 90, 75, 80};
        int [] ayse=  { 60, 70, 65, 85, 90};
        int [] mehmet={ 95, 90, 85, 80, 95};
        int [] elif=  { 50, 60, 55, 65, 70};
        int [][] hepsi={{ 70, 85, 90, 75, 80},
                { 60, 70, 65, 85, 90},
                { 95, 90, 85, 80, 95},
                { 50, 60, 55, 65, 70}};
        String enÇalışkanogrenci="";
        double enyüksekortalama=0;

        String[] ogrenciler = {"Ahmet", "Ayşe", "Mehmet", "Elif"};


        for (int i = 0; i <hepsi.length ; i++) {
            double sum=0;

            for (int j = 0; j <hepsi[i].length ; j++) {
                sum+=hepsi[i][j];

            }

            //double ortalama = sum / (double)hepsi[i].length ;
            double ortalama = sum / (double) hepsi[i].length;
            System.out.println( ogrenciler[i] +" => "+  ortalama);

            if (ortalama>enyüksekortalama){
                enyüksekortalama=ortalama;
                enÇalışkanogrenci=ogrenciler[i];
            }


        }
        // System.out.println(enÇalışkanogrenci + " = "+ enyüksekortalama);
        System.out.println("En çalışkan öğrenci: " + enÇalışkanogrenci +" => "+ enyüksekortalama);

    }}

