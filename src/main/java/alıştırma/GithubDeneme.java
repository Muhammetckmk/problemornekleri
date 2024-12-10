package alıştırma;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class GithubDeneme {
    public static void main(String[] args) {
      //  B!r Str!ng ‘ !n pal!ndrom olup olmadıgını kontrol etmek !ç!n kod yazınız.
        //  B!r Str!ng, ters! !le
      //  aynıysa, buna pal!ndrom den!r. Örneg!n; “anna”, “123321” pal!ndromlardır.


        String kelime="talat o ucu";

        String tersi="";

        for (int i=kelime.length()-1; i>=0; i--){
            tersi +=kelime.charAt(i);


        }
        System.out.println(tersi);
        if (tersi.equalsIgnoreCase(kelime)){
            System.out.println("pal!ndrom dur");
        }else {
            System.out.println("pal!ndrom değildir");
        }





        
    }
}
