package alıştırma;

import java.sql.Array;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class asd {
    public static void main(String[] args) {

        LocalDate tarih = LocalDate.of(2024,6,15);
        int ay= tarih.getDayOfMonth();
        System.out.println("ay = " + ay);//ay = 15

        DayOfWeek day =tarih.getDayOfWeek();
        System.out.println("day = " + day);//day = SATURDAY

        Month ayy= tarih.getMonth();
        System.out.println(ayy);//JUNE

        int gün= tarih.getDayOfYear();
        System.out.println("gün = " + gün);//gün = 167

        int ayValue=tarih.getMonthValue();
        System.out.println("ayValue = " + ayValue);//ayValue = 6

        int getYear= tarih.getYear();
        System.out.println("getYear = " + getYear);

        LocalDate localDate= tarih.plusDays(3).plusMonths(6).plusYears(1);
        System.out.println(localDate);

        int lenght= tarih.toString().length();
        System.out.println("lenght = " + lenght);


       // Scanner scanner = new Scanner(System.in);
//
       // // Kullanıcıdan yyyy-MM-dd formatında tarih alıyoruz
       // System.out.print("Tarihi şu formatta girin (yyyy-MM-dd): ");
       // String tarihGirdisi = scanner.nextLine();
//
       // // String'i LocalDate'e dönüştürmek için DateTimeFormatter kullanıyoruz
       // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
       // LocalDate tariha = LocalDate.parse(tarihGirdisi, formatter);
//
       // System.out.println("Girilen tarih: " + tariha);

      //int a= tariha.getYear();
      //String b= String.valueOf(a);
      // System.out.println("a = " + a);
        System.out.println("------------");
        LocalDate ld= LocalDate.ofYearDay(2003,29);
        System.out.println("ld = " + ld);


    }
}

