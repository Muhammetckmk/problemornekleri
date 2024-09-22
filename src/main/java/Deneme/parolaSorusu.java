package Deneme;


import java.util.Scanner;

public class parolaSorusu {
    public static void main(String[] args) {

        Scanner sifre= new Scanner(System.in);
        System.out.println("lütfen şifrenizi oluşrutunuz");

        String kod = sifre.nextLine();
        boolean ilk = kod.isEmpty();
        System.out.println(ilk);

        boolean iki = kod.isBlank();
        System.out.println(iki);

        boolean uc = kod.trim().equals(kod);
        System.out.println(uc);

        if (ilk){
            System.out.println("parola boş bırakılmamalıdır");
        }
        if (iki){
            System.out.println("parola boşluk harici karekterler de kullanılmalıdır");

        }
        if (!uc) {
            System.out.println("parolanın başında ve sonunda boşluk bırakılmamalıdır");
        }





        }


    }

