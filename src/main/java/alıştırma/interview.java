package alıştırma;

import java.util.*;

public class interview {
    public static void main(String[] args) {
List<Integer> nums=new ArrayList<>(Arrays.asList(12,9,13,14,9,10,4,12,15));
sıralı(nums);// nums.stream().forEach(t-> System.out.print(t+ " "));
ciftSayılar(nums);// nums.stream().filter(t-> t%2==0).forEach(t-> System.out.print(t+" "));
System.out.println();
tekSayılarKaresi(nums);//nums.stream().filter(t-> t%2==1).map(t->t*t).forEach(t-> System.out.print(t+" "));
System.out.println();
ciftSayılarKüpü(nums);//nums.stream().filter(t-> t%2==0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));
System.out.println();
tekSayılarınKarelerinToplamı(nums);// int a=  nums.stream().filter(t-> t%2==1).map(t-> t*t).reduce(0,(t,u) -> t+u);
System.out.println();
tekrarsızCiftSayılarınKarelerininCarpımı(nums);//int a=  nums.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(1,(t,u)->t*u);
System.out.println();
maxDegeriAlma(nums);//System.out.println(nums.stream().distinct().reduce(nums.get(0), (t, u) -> t > u ? t : u));
System.out.println();
minDegeriAlma(nums);//System.out.println(nums.stream().distinct().reduce(Math::min).get());
System.out.println();
yedidenBuyukEnKucukCiftSayı(nums);//System.out.println(nums.stream().filter(t -> t > 7 && t % 2 == 0).reduce(Math::min).get());


    }
    public static void sıralı(List<Integer> nums){
        nums.stream().forEach(t-> System.out.print(t+ " "));
    }
    public static void ciftSayılar(List<Integer> nums){
        nums.stream().filter(t-> t%2==0).forEach(t-> System.out.print(t+" "));
    }
    public static void tekSayılarKaresi(List<Integer> nums){
        nums.stream().filter(t-> t%2==1).map(t->t*t).forEach(t-> System.out.print(t+" "));
    }
    public static void ciftSayılarKüpü(List<Integer> nums){
        nums.stream().filter(t-> t%2==0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));
    }
    public static void tekSayılarınKarelerinToplamı(List<Integer> nums){
      int a=  nums.stream().filter(t-> t%2==1).map(t-> t*t).reduce(0,(t,u) -> t+u);
        System.out.println(a);
    }
    public static void tekrarsızCiftSayılarınKarelerininCarpımı(List<Integer> nums){
      int a=  nums.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(1,(t,u)->t*u);
        System.out.println(a);
    }
    public static void maxDegeriAlma(List<Integer> nums){
        System.out.println(nums.stream().distinct().reduce(nums.get(0), (t, u) -> t > u ? t : u));
    }
    public static void minDegeriAlma(List<Integer> nums){
        System.out.println(nums.stream().distinct().reduce(Math::min).get());
    }
    public static void yedidenBuyukEnKucukCiftSayı(List<Integer> nums){
        System.out.println(nums.stream().filter(t -> t > 7 && t % 2 == 0).reduce(Math::min).get());
    }


}
