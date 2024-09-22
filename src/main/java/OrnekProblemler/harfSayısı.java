package OrnekProblemler;

public class harfSayısı {
    public static void main(String[] args) {
       /* TASK :
Girilen bir stringdeki a harfi sayısını bulunuz.
ama  c harfine  gelirse döngüden çıkılsın

Bugün hava oldukca güzel.-> 2
 str.CharAt(0)

 */
        String input= "Bugün hava oldukca güzel";

        String hedef = input.split("c")[0];
        int harf= hedef.replaceAll("[^a]", "").length();

        System.out.println(harf);

        System.out.println("-----------");


        String cümle = "Bugün hava oldukça güzel";

        int çindex= cümle.indexOf('ç');
        int aSayisi = 0;

        for (int i = 0; i < çindex ; i++) {
            if (cümle.charAt(i)== 'a'){
                aSayisi++;
            }


        }
        System.out.println("ç den önceki a sayısı = " + aSayisi);


    }
}
