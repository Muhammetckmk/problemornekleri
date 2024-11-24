package OOP;

public class Cat extends Hayvanlar {

    public Cat(String nameAnimal, int ageAnimal) {
        super(nameAnimal, ageAnimal);
    }

    @Override
    public String sesi() {
        return "Kediler miyavlar";
    }
    private String renk= "siyah";

    public String getrenk(){

         return renk;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "ageAnimal=" + ageAnimal +
                ", nameAnimal='" + nameAnimal + '\'' +
                '}';
    }
}
