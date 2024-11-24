package arrays;

import java.util.Arrays;
import java.util.List;

public class C03_InterviewQuestion {
    /*"Bir tamsayı listesini kullanarak aşağıdaki işlemleri gerçekleştiren bir Java metodu yazın:
        Negatif sayıları filtreleyin.
        Kalan pozitif sayıları iki katına çıkarın.
        Sonuçları küçükten büyüğe sıralayın ve bir liste olarak döndürün.*/

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(-5, 3, -2, 8, 0, 1, -1, 6);

        ikiKatınaCıkar(numbers);








    }

    private static void ikiKatınaCıkar(List<Integer> numbers) {

        List<Integer> number= numbers.stream().filter(t->t>0).map(t->t*t).sorted().toList();

        System.out.println("number = " + number);

    }


}
