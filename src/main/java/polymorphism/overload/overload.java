package polymorphism.overload;

public class overload {
    public static void add(int a,int b){
        System.out.println(a + b);
    }

    public static void add(double a,double b){
        System.out.println(a + b);
    }

    public static void add(int a,double b){
        System.out.println(a + b);
    }
    public static void add(double a,int b){
        System.out.println(a + b);
    }
    public static void add(int a,int b, int c){
        System.out.println(a + b);
    }

    // String s = "Java";
    //s.substring(int beginIndex); ==> tek parametre almis
    //s.substring(int beginIndex, int endIndex); ==> iki parametre almis

    //Method ismi + Parametre = Method Signature (metot imzası) benzersiz olmalıdır

    //------------------------------

       /* Method Overloading'de sadece parametreler degistirilir.
           Boylelikle method signature degismis olur ve Java bu methodu yeni bir method gibi kabul eder.

        Method Overloading icin;
        a) Parametre sayisini degistirebilirsiniz.
        b) Parametre data tiplerini degistirebilirsiniz.
        c) Parametre data tipleri farkli ise parametrelerin yerlerini degistirebilirsiniz.
        d)Method overloading olustururken return type'in, access modifier'in,
           static veya non-static olmanin hicbir etkisi yoktur.
           */
    /*
        Soru 1: private method'lar overload edilebilir mi?

        Cevap 1: private method'lar overload edilebilirler cunku;
        overload islemi tek class icinde yapilir, private methodlar ayni class'in icinden
        ulasilabilir oldugundan overload'a engel degildir.

        Soru 2: static method'lar overload edilebilir mi?
        Cevap 2: static method'lar overload edilebilir cunku esasinda overload'da biz yeni method'lar olustururuz.
*/
}