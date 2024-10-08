package arrays;

import java.util.Arrays;

public class ikiArrayAktarma {
    public static void main(String[] args) {
        //Verilen iki diziyi birleştirip üçüncü bir diziye ekleyen ve bu dizideki elemanları sıralayan bir program yazın.

        int [] num1= {1,9,6,66,31,46};
        int [] num2= {11,96,10,66,3,4};
        int [] num3=new int[num1.length+num2.length];
        int i=0;
        for (int w:num1){
            num3[i]=w;
            i++;
        }
        for (int w:num2){
            num3[i]=w;
            i++;
        }
        System.out.println(Arrays.toString(num3));
        Arrays.sort(num3);
        System.out.println(Arrays.toString(num3));

    }
}
