package Deneme;

import java.util.Scanner;

public class fsdf {
    public static void main(String[] args) {

          Scanner input = new Scanner(System.in);
        System.out.println("zikir değişikliğinizi giriniz \n arttırma :+ \n azaltmak : -");


          int toplam =0;

        for (int i = 0; i <input.nextInt() ; i++) {
            char sembol = input.next().charAt(0);
            switch (sembol){
                case '+':
                    System.out.println((toplam + i ) + ". zikir");
                    break;
                case'-':
                    System.out.println((toplam - i )+ ". zikir");
                    break;

            }

        }
        }

    }

