package ifOrnekProblemler;

public class carpımtablosu {
    public static void main(String[] args) {

           /*Ornek 1:  Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz.

         Example 1: Write the code that creates the multiplication table for the number given by the user and writes it to the console.

        3 ==> 3x1=3
              3x2=6
              3x3=9
              3x4=12 …
             3x10=30*/

       int num =1;
        int carpım= 1;

        for (  num = 1; num <10 ; num++) {


            for (carpım  = 1; carpım <10 ; carpım++) {

                System.out.println(num + " x " + carpım + " = " + (num*carpım));


            }
            System.out.println();


        }

    }
}
