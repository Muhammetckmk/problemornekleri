package polymorphismOverride;

public class Dog extends Mammal {
    public void bark(){
        System.out.println("dogs bark...");

    }

    @Override //Anotation... yazmak zorunlu değil ama kontrol de yardımcı olduğu için yazması tavsiye edilir
    public void eat(){

        System.out.println("Dogs eat...");
    }

    @Override
    public Animal create(){
        return new Dog(); //upcasting - Java otomatik yapar
        //child parent ın data tipini kullanabilir
        //downcasting i java otomatik YAPMAZ
    }
    @Override
    public int add(int a, int b){
        //primitivler arasında parent-chilld ilişkisi yoktur.
        //yani primitivlerde return type değiştirilemez
        return a + b;
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return a*b;


    }
}
