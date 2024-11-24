package OOP;

public class TestHayvanlar {
    public static void main(String[] args) {

        Cat kedi=new Cat("boncuk",5);
        System.out.println(kedi);
        System.out.println(kedi.sesi());
        System.out.println("kedi.getrenk() = " + kedi.getrenk());

        Dog köpek= new Dog("karabaş", 6);
        System.out.println("köpek.sesi() = " + köpek.sesi());
        System.out.println("köpek = " + köpek);
        köpek.setRengi("sarı");
        System.out.println("köpek.getRenk() = " + köpek.getRenk());


    }
}
