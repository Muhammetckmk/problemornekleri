package ifOrnekProblemler;

import java.util.Scanner;

public class palidromSorusu {
    public static void main(String[] args) {
        //...........İNTERWİEV
        //Ornek 1:  Belirli bir tamsayının palindrome olup olmadığını kontrol eden kodu yazın.
        //Example 1: Write the code to check if a given integer is a palindrome.
        //           Palindrome: 121 <==> 121

        Scanner sayı= new Scanner(System.in);
        System.out.println("polidromluğunu sorgulayacağınız sayıyı giriniz");
        int say= sayı.nextInt();
        String sayı2= String.valueOf(say);
        String tersi="";


        for (int i = sayı2.length()-1; i >=0 ; i--) {

            tersi= tersi+ sayı2.charAt(i);


        }

        System.out.println(sayı2+ " => "+tersi);

        if (sayı2.equals(tersi)){
            System.out.println("polidromdur");
        }else {
            System.out.println("polidrom değildir");
        }
    }
}
