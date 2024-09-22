package OrnekProblemler;

import java.util.Scanner;

public class ödev1 {
    public static void main(String[] args) {
        //Toplama, Çıkarma, Çarpma, Bölme , kalan Hesaplama ve us alma
        // 2 sayi işlem yapan basit bir Hesap Makinesi oluşturun:

        Scanner input= new Scanner(System.in);
        System.out.println(" Lütfen yapmak istediğiniz işlemin simgesini giriniz. \ntoplama için: + \nçıkarma  için: -\nçarpma için: * \nbölme için: / \nkalan bulmak için: % \nkuvvet almak için:^");


        char operator = input.next().charAt(0);

        if (operator == '+') {
            System.out.println("lütfen işlem yapmak için iki sayı giriniz");
            System.out.println("sonuç = " + (input.nextDouble() + input.nextDouble()));
        }else if (operator == '-') {
            System.out.println("lütfen işlem yapmak için iki sayı giriniz");
            System.out.println("sonuç = " + (input.nextDouble() - input.nextDouble()));
        }else if (operator == '*') {
            System.out.println("lütfen işlem yapmak için iki sayı giriniz");
            System.out.println("sonuç = " + input.nextDouble() * input.nextDouble());
        }else if (operator == '/') {
            System.out.println("lütfen işlem yapmak için iki sayı giriniz");
            System.out.println("sonuç = " + (input.nextDouble()/input.nextDouble()));

        }else if (operator == '%') {
            System.out.println("lütfen işlem yapmak için iki sayı giriniz");
            System.out.println("sonuç = " + input.nextDouble() % input.nextDouble());
        }else if (operator == '^') {
            System.out.println("lütfen işlem yapmak için iki sayı giriniz");
            System.out.println("sonuç = " + (Math.pow(input.nextDouble(), input.nextDouble())));
        }
    }
}
