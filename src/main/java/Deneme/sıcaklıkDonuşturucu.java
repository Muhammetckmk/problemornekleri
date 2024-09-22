package Deneme;


import java.util.Scanner;

public class sıcaklıkDonuşturucu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen dönüştürmeyi istediğiniz sıcaklık birrimini giriniz. \n selsius : c \n fahrenayt :f");

        char birim = input.next().charAt(0);

        switch (birim){
            case 'f':
                System.out.println("lütfen fahrenayt derecenizi giriniz");
                System.out.println(("selsius : " + (input.nextDouble()-32) * 5 / 9));
                break;
            case 'c':
                System.out.println("lütfen selsius derecenizi giriniz");
                System.out.println(("fahrenayt : " + (input.nextDouble()*9/5) + 32));
                break;

        }

    }
}
