package Deneme;

import java.util.Scanner;

public class aySorusu {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir ay numarası giriniz");

        int num = input.nextInt();


        if (num==2){

            System.out.println("lütfen bir yıl sayısı giriniz");
            int yıl =input.nextInt();
            int i = ((yıl % 4) == 0) ? 28 : 29;
            System.out.println(i);
        }else {
            switch (num){
                case 1:
                    System.out.println(31);
                    break;

                case 3:
                    System.out.println(31);
                    break;
                case 4:
                    System.out.println(30);
                    break;
                case 5:
                    System.out.println(31);
                    break;
                case 6:
                    System.out.println(30);
                    break;
                case 7:
                    System.out.println(31);
                    break;
                case 8:
                    System.out.println(31);
                    break;
                case 9:
                    System.out.println(30);
                    break;
                case 10:
                    System.out.println(31);
                    break;
                case 11:
                    System.out.println(30);
                    break;
                case 12:
                    System.out.println(31);
                    break;
                default:
                    System.out.println("lütfen geçerli bir ay sayısı giriniz");
            }


        }



    }
}



