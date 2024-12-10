package polymorphismOverride;

public class Cat extends Mammal {
    public void meow() {
        System.out.println("cats meow..");
    }

    @Override
    public void feetWithMilk() {
        System.out.println("Cats feed their babies with milk...");
    }
}
