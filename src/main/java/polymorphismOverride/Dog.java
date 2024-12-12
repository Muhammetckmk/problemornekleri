package polymorphismOverride;

public class Dog extends Mammal {
    public void bark(){
        System.out.println("dogs bark...");

    }

    @Override //Anotation... yazmak zorunlu değil ama kontrol de yardımcı olduğu için yazması tavsiye edilir
    public void eat(){

        System.out.println("Dogs eat...");
    }



}
