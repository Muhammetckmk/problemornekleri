package ifOrnekProblemler;

import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yapmak istediğiniz işlemin işaretini giriniz. \n toplama için : + \n çıkarma için : -\n çarpma için : *\n bölme için : /\n yüzde alma için : %\n faktöriyel için: !");
        char operator = input.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("lütfen toplamak istediğiniz iki sayıyı giriniz");
                System.out.println("toplam : " + (input.nextDouble() + input.nextDouble()));
                break;
            case '-':
                System.out.println("lütfen çıkarmak istediğiniz iki sayıyı giriniz");
                System.out.println("fark : " + (input.nextDouble() - input.nextDouble()));
                break;
            case '*':
                System.out.println("lütfen çarpmak istediğiniz iki sayıyı giriniz");
                System.out.println("çarpım : " + (input.nextDouble() * input.nextDouble()));
                break;
            case '/':
                System.out.println("lütfen bölmek istediğiniz iki sayıyı giriniz");
                System.out.println("bölüm : " + (input.nextDouble() / input.nextDouble()));
                break;
            case '%':
                System.out.println("lütfen yüzdesini almak istediğiniz iki sayıyı giriniz");
                System.out.println("yüzde : " + (1 / (input.nextDouble()) * (100 * input.nextDouble())));
                break;
            case '!':
                System.out.println("lütfen faktöriyelini almak istediğiniz pozitif tam sayıyı giriniz");

                int sayi = input.nextByte();

                int bosint = 1;

                for (int i = 1; i <= sayi; i++) {
                    bosint *= i;
                }
                System.out.println(sayi + "! = " + bosint);


        }


    }

}


